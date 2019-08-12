package com.ebay.testing.questions;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.VALIDAR_LOGIN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HaberIniciado implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return  Text.of(VALIDAR_LOGIN).viewedBy(actor).asString();
	}

	public static HaberIniciado sesion() {
		// TODO Auto-generated method stub
		return new HaberIniciado();
	}
	


}
