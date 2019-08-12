package com.ebay.testing.tasks;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresa implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue("elbichocr714@gmail.com").into(USUARIO));
				
		
	}

	public static Ingresa elUsuario() {
		// TODO Auto-generated method stub
		return instrumented(Ingresa.class);
	}

}
