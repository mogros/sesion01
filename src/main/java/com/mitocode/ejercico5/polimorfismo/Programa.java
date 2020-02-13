package com.mitocode.ejercico5.polimorfismo;

public class Programa {

	public static void main(String[] args) {

//		Cuenta  cuenta1 = new Cuenta("10", "dany", 0);
//		System.out.println(cuenta1);
//		
//		Cuenta cuenta2=new CuentaNegocio("111","yo 2", 100, 500);
//		System.out.println(cuenta2);
//		
//		
//		// asignacion ordinaria
//		CuentaNegocio cuentaNegocio = new CuentaNegocio("12", "yo4", 0, 500);
//		System.out.println(cuentaNegocio);
//
//		Cuenta cuenta4 = cuentaNegocio;
//		System.out.println(cuenta4);
	
		Cuenta cuenta5=new CuentaNegocio("13", "Mario5", 0, 200);
		Cuenta cuenta6=new CuentaNegocio("14", "Mario6", 50, 100);
		
		//dowcasting
		//CuentaNegocio cuenta7=(CuentaNegocio)cuenta5;
		
		System.out.println(cuenta6.getClass());
		
		if(cuenta6 instanceof CuentaNegocio) {
			System.out.println("ok");
			CuentaNegocio cuenta7=(CuentaNegocio)cuenta6;
			
			cuenta7.prestamo(100);
			System.out.println(cuenta7);
		}
			
		
		
		
		
	}
}
