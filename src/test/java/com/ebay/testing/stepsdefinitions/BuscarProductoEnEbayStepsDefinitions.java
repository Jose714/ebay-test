package com.ebay.testing.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import com.ebay.testing.exceptions.Excusa;
import com.ebay.testing.models.Producto;
import com.ebay.testing.questions.ElProductoEn;
import com.ebay.testing.questions.HaberIniciado;
import com.ebay.testing.tasks.AgregaAlCarrito;
import com.ebay.testing.tasks.EstaEnLaPaginaDeEbay;
import com.ebay.testing.tasks.Ingresa;
import com.ebay.testing.tasks.IngresaLa;
import com.ebay.testing.tasks.NavegaEn;
import com.ebay.testing.tasks.EscribeLa;
import com.ebay.testing.tasks.Selecciona;
import com.ebay.testing.ui.PaginaDeInicioDeEbay;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

public class BuscarProductoEnEbayStepsDefinitions {
	PaginaDeInicioDeEbay paginadeinicio;

	@Managed(driver = "chrome")
	WebDriver SuNavegador;
	
	Actor Jose = Actor.named("Jose");
	//EL ACTOR PUEDE REALIZAR LA ACCION ABRIR EL NAVEGADOR
	@Before
	public void setUp() {
		Jose.can(BrowseTheWeb.with(SuNavegador));
		SuNavegador.manage().window().maximize();
	}
	//EL ACTOR NAVEGA POR LA PAGINA DE INICIO DE SESION
	@Given("^Jose navega por la pagina de inicio de sesion$")
	public void joseNavegaPorLaPaginaDeInicioDeSesion() throws Exception {
		Jose.wasAbleTo(EstaEnLaPaginaDeEbay.En(paginadeinicio));
		Jose.wasAbleTo(NavegaEn.laPaginaDeInicioDesesionDeEbay());
	   
	}
	//EL ACTOR INGRESA USUARIO Y CONTRASENA
	@When("^El ingresa usuario y contrasena$")
	public void elIngresaUsuarioYContrasena() throws Exception {
		Jose.attemptsTo(Ingresa.elUsuario());
		Jose.attemptsTo(IngresaLa.contrasena());
		Jose.remember("resultado", Ingresa.elUsuario());
		
	}
    //IMPRIME POR CONSOLA QUE EL USUARIO INGRESO A LA PAGINA
	@Then("^EL deberia iniciar sesion en la pagina de ebay$")
	public void elDeberiaIniciarSesionEnLaPaginaDeEbay() throws Exception {
		System.out.println("el usuario ingreso con exito a la pagina");
		Jose.should(seeThat(HaberIniciado.sesion(), equalTo("Che")));
	}
	//EL ACTOR HA INGRESADO CON EXITO 
	@Given("^Jose esta en la pagina Ebay$")
	public void joseEstaEnLaPaginaEbay() throws Exception {
	//ha iniciado sesion, ahora puede buscar el producto y agregarlo al carrito	 
		
		
	}

	//SELECCIONA EL PRODUCTO Y LO AGREGA AL CARRITO
	@When("^El busca el producto y lo agrega al carrito de compras$")
	public void elBuscaElProductoYLoAgregaAlCarritoDeCompras(List<Producto> producto) throws Exception {
		Jose.attemptsTo(EscribeLa.palabra(producto));
		Jose.attemptsTo(Selecciona.la(producto));
		Jose.attemptsTo(AgregaAlCarrito.elProducto());
		Jose.remember("resultado", producto.get(0).getExpected());
	
	}

//SI EL RESULTADO NO ES EL ESPERADO SE LANZA LA EXCEPCION QUEJARSE CON?
	@Then("^El verifica que la producto este en el carrito de compras$")
	public void elVerificaQueLaProductoEsteEnElCarritoDeCompras() throws Exception {
		Jose.should(seeThat(ElProductoEn.elCarrito(), equalTo(Jose.recall("resultado"))).orComplainWith(Excusa.class,Excusa.accesoAlCarrito()));   
	}

}
