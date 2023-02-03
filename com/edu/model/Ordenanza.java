package com.edu.model;

public class Ordenanza extends Persona {
	private String nivel;

	public Ordenanza(String nombre, String apellidos, String dni, int edad, String nivel) {
		super(nombre, apellidos, dni, edad);
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	

}
