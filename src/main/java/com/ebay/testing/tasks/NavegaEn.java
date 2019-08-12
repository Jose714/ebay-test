package com.ebay.testing.tasks;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.CLICK_INICIAR_SESION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class NavegaEn implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(CLICK_INICIAR_SESION));
		
		
	}
	public static NavegaEn laPaginaDeInicioDesesionDeEbay() {
		// TODO Auto-generated method stub
		return instrumented(NavegaEn.class);
	}

}
