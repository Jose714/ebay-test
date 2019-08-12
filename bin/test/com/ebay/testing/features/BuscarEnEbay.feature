#Author: nairdacool@hotmail.com

@tag
Feature: Busqueda de producto en Ebay
Yo como ususario con internet voy a entrar a la pagina de
 ebay y voy a buscar un producto y comprarlo

  @smoketest
  Scenario: Busqueda de producto en Ebay exitosa
    Given Jose entro a la pagina Ebay
    When Jose busca el producto "Camara"
    And Jose la agreaga "Camara" al carrito de compras
    Then Jose verifica que la "Camara" este en el carrito de compras 
    