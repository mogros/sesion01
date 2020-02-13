package com.mitocode.ejercicio2.estaticos;

public class ConvertidorMoneda {

	private static double COMISION= 0.06;

	public static double dolarToNuevosSoles(double monto, double precioDolar) {
		//double resulado = monto * precioDolar * (1.0 + comision);
		return  monto * precioDolar * (1.0 + COMISION);
		
	}
}
