package com.reunion.demo.model;

public class Direccion {

	private String nomenclatura;
	private String barrio;
	private String codigoPostal;

	public Direccion() {
	}

	public Direccion(String nomenclatura, String barrio, String codigoPostal) {
		this.nomenclatura = nomenclatura;
		this.barrio = barrio;
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Direcciones [direccion=" + nomenclatura + ", barrio=" + barrio + ", codigoPostal=" + codigoPostal + "]";
	}

}
