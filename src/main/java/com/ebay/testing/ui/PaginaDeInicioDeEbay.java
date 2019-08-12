package com.ebay.testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ebay.com/")
public class PaginaDeInicioDeEbay extends PageObject{
	public static final Target CAMPO_DE_BUSQUEDA = Target.the("Campo de busqueda de Google").located(By.xpath("//input[@id='gh-ac']"));
	public static final Target SELECCIONAR_CAMARA = Target.the("selecciona la camara en el sitio ebay").located(By.xpath("//a[@class='s-item__link'][1]"));
	public static final Target BOTON_ANADIR_AL_CARRITO = Target.the("agregar producto al carrito").located(By.xpath("//a[@id='isCartBtn_btn']"));
	public static final Target PRODUCTO_SELECCIONADO = Target.the("Valida que el producto este en el carrito").located(By.xpath("//h3[contains(text(),'Cámara Réflex Digital Negr Video Hd 1080P Cámara c')]"));
	public static final Target PRODUCTO_EN_EL_CARRITO = Target.the("Valida que el producto este en el carrito").located(By.xpath("//span[contains(text(),'Gratis')]"));
	public static final Target CLICK_INICIAR_SESION = Target.the("Inicio de sesion en la pagina de ebay").located(By.xpath("//a[contains(text(),'Inicia sesión')]"));
	public static final Target USUARIO = Target.the("Inicio de sesion en la pagina de ebay").located(By.xpath("//div//span/input[contains(@id,'userid')]"));
	public static final Target CONTRASENA = Target.the("Inicio de sesion en la pagina de ebay").located(By.xpath("//div//span/input[contains(@id,'pass')]"));
	public static final Target BOTON_INICIAR_SESION = Target.the("Inicio de sesion en la pagina de ebay").located(By.xpath("//button[@id='sgnBt']"));
	public static final Target SELECCIONAR = Target.the("Abrir menu de coleres del producto").located(By.xpath("//select[@id='msku-sel-1']"));
	public static final Target SELECCIONAR_PRIMER_ATRIBUTO = Target.the("Abrir menu de coleres del producto").located(By.xpath("//option[@id='msku-opt-0']"));
	public static final Target VALIDAR_LOGIN = Target.the("Abrir menu de coleres del producto").located(By.xpath("//b[contains(text(),'Che')]"));
	
}
