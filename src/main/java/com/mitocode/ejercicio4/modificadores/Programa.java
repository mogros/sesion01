package com.mitocode.ejercicio4.modificadores;

public class Programa {

	public static void main(String[] args) {
		CuentaNegocio cuentaNegocio=new CuentaNegocio("10", "Mario", 30, 500);
		
		System.out.println(cuentaNegocio);

		double monto=100;
		cuentaNegocio.prestamo(monto);
		System.out.println(cuentaNegocio);
	}
}
