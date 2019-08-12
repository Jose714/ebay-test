package com.ebay.testing.tasks;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.CONTRASENA;
import static net.serenitybdd.screenplay.Tasks.instrumented;



import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresaLa implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue("12345mil").into(CONTRASENA).thenHit(Keys.ENTER));
				
		
	}

	public static IngresaLa contrasena() {
		// TODO Auto-generated method stub
		return instrumented(IngresaLa.class);
	}

}
