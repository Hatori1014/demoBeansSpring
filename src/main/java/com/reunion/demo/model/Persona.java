package com.reunion.demo.model;

import java.util.Arrays;

public class Persona {
	private String nombre;
	private String apellido;
	private String[] direcciones;
	
	public Persona() {};
	
	public Persona(String nombre, String apellido, String[] direcciones) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direcciones = direcciones;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String[] getDirecciones() {
		return direcciones;
	}
	
	public void setDirecciones(String[] direcciones) {
		this.direcciones = direcciones;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direcciones=" + Arrays.toString(direcciones)
				+ "]";
	}	
}
