package com.ebay.testing.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.ebay.testing.models.Producto;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.SELECCIONAR_CAMARA;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Selecciona implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SELECCIONAR_CAMARA));
		
	}

	public static Selecciona la(List<Producto> producto) {
		
		return instrumented(Selecciona.class);
	}

}
