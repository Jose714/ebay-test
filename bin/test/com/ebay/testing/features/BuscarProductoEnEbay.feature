#Author: jomicasierra@unac.edu.co

@tag
Feature: Busqueda de producto en Ebay
	Yo como ususario con internet voy a entrar a la pagina de
	ebay y voy a buscar un producto y comprarlo
Background: Inicio de sesion de usuario
 Given Jose navega por la pagina de inicio de sesion
 When El ingresa usuario y contrasena
Then EL deberia iniciar sesion en la pagina de ebay

  @smoketest
  Scenario Outline: Busqueda de producto en Ebay exitosa
    Given Jose esta en la pagina Ebay
    When El busca el producto y lo agrega al carrito de compras
      | product   | expected   |
      | <product> | <expected> |
    Then El verifica que la producto este en el carrito de compras 

    Examples: 
      | product                                                                           | expected                  |
      | Billete Raro Al Yankovic 8/10/19 1 Los Angeles, CA                                | Gratis                    |
      | One Piece Monkey D Luffy SC Top guerra 6 2nd Anime Colección Figura Estatuilla NB | Gratis                    |
