package com.ebay.testing.tasks;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.BOTON_INICIAR_SESION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Dar implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(BOTON_INICIAR_SESION));
		
	}

	public static Dar inicioDeSesion() {
		// TODO Auto-generated method stub
		return instrumented(Dar.class);
	}

}
