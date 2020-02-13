package com.mitocode.ejercicio2.estaticos;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Cual es el precio del dolar");
		double dolar=sc.nextDouble();
		
		System.out.println("Monto a cambiar");
		double monto=sc.nextDouble();
		ConvertidorMoneda convertidor=new ConvertidorMoneda();
		
		double resultado=convertidor.dolarToNuevosSoles(monto, dolar);
		System.out.println("monto a pagar en soles " + resultado);
		
		sc.close();
	}

}
