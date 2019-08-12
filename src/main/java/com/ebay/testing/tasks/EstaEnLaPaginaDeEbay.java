package com.ebay.testing.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented; //statica
import net.serenitybdd.screenplay.actions.Open;

public class EstaEnLaPaginaDeEbay implements Task{
	
	PageObject pagina;
	
	public EstaEnLaPaginaDeEbay(PageObject pagina) {
		this.pagina = pagina;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(pagina));
	}

	public static EstaEnLaPaginaDeEbay En(PageObject paginadeinicio) {
		// TODO Auto-generated method stub
		return instrumented(EstaEnLaPaginaDeEbay.class, paginadeinicio);
	}

}
