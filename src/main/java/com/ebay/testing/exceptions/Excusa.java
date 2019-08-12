package com.ebay.testing.exceptions;



public class Excusa extends AssertionError{

private static final String NO_SE_PUEDE_ACCEDER_AL_CARRITO = "NO SE PUEDE ACCEDER AL CARRITO DE COMPRAS, O EL PRODUCTO YA HA SIDO AGREGADO";

public static String accesoAlCarrito() {
	
	return NO_SE_PUEDE_ACCEDER_AL_CARRITO;
	
}
	//EL CONSTRUCTOR QUE LLAMA AL CONSTRUCTOR DE LA CLASE PADRE ASSERTION ERROR
	public Excusa(String message, Throwable cause) {
		super(message,cause);
	}

}
