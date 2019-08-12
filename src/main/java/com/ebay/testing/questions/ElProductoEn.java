package com.ebay.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.ebay.testing.ui.PaginaDeInicioDeEbay.PRODUCTO_EN_EL_CARRITO;

public class ElProductoEn implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return  Text.of(PRODUCTO_EN_EL_CARRITO).viewedBy(actor).asString();
	}
	public static ElProductoEn elCarrito() {
		// TODO Auto-generated method stub
		return new ElProductoEn();
	}
}

