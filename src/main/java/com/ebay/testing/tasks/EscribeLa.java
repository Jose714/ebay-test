package com.ebay.testing.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.Keys;


import com.ebay.testing.models.Producto;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.CAMPO_DE_BUSQUEDA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class EscribeLa implements Task {
	private List<Producto> producto;
	
	public EscribeLa(List<Producto> producto) {
		this.producto = producto;
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
	
	actor.attemptsTo(Enter.theValue(producto.get(0).getProduct()).into(CAMPO_DE_BUSQUEDA).thenHit(Keys.ENTER));
	}

	public static EscribeLa palabra(List<Producto> producto) {
		
		return instrumented(EscribeLa.class,producto);
	}

}
