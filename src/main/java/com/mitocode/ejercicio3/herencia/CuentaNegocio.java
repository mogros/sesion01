package com.mitocode.ejercicio3.herencia;

public class CuentaNegocio extends Cuenta  {

	private double limitePrestamo;
	
	public CuentaNegocio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaNegocio(String numeroCuenta, String titular, double saldo, double limite) {
		super(numeroCuenta, titular, saldo);
		// TODO Auto-generated constructor stub
		this.limitePrestamo=limite;
	}


	public double getLimitePrestamo() {
		return limitePrestamo;
	}

	public void setLimitePrestamo(double limitePrestamo) {
		this.limitePrestamo = limitePrestamo;
	}

	@Override
	public String toString() {
		return "CuentaNegocio [limitePrestamo=" + limitePrestamo + ", getNumeroCuenta()=" + getNumeroCuenta()
				+ ", getTitular()=" + getTitular() + ", getSaldo()=" + getSaldo() + "]";
	}

	
	
	
}
