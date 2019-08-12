package com.ebay.testing.tasks;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.SELECCIONAR;
import static com.ebay.testing.ui.PaginaDeInicioDeEbay.SELECCIONAR_PRIMER_ATRIBUTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarEl implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SELECCIONAR),
				Click.on(SELECCIONAR_PRIMER_ATRIBUTO));
		
	}

	public static SeleccionarEl atributoDelProducto() {
		// TODO Auto-generated method stub
		return instrumented(SeleccionarEl.class);
	}

}
