package com.mitocode.ejercicio1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Cuenta cuenta;
		System.out.println("Ingrese numero cuneta");
		String numeroCuenta=sc.nextLine();
		
		System.out.println("Ingrese el titular de la cuenta");
		String titular=sc.nextLine();
		
		System.out.println("Desea realizar un deposito inical (y/n)");
		char respuesta=sc.nextLine().charAt(0) ;
		if (respuesta=='y') {
			System.out.println("Ingrese monto inicial");
			double monto=sc.nextDouble();
			cuenta =new Cuenta(numeroCuenta, titular, monto);			
		}
		else {
			cuenta =new Cuenta(numeroCuenta, titular);			
		}
		
		System.out.println("datos cuenta ");
		System.out.println(cuenta);
		
		//deposito
		System.out.println();
		System.out.println("INgrese un deposito ");
		double monto=sc.nextDouble();
		cuenta.deposito(monto);
		System.out.println(cuenta);
		
		

		//deposito
		System.out.println();
		System.out.println("INgrese un retiro ");
		double montoRetiro=sc.nextDouble();
		cuenta.retiro(montoRetiro);
		System.out.println(cuenta);
		
		sc.close();
	}
	
}
