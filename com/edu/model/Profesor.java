package com.edu.model;

public class Profesor extends Persona {
	private String claseImpartida;

	public Profesor(String nombre, String apellidos, String dni, int edad, String claseImpartida) {
		super(nombre, apellidos, dni, edad);
		this.claseImpartida = claseImpartida;
	}

	public String getClaseImpartida() {
		return claseImpartida;
	}

	public void setClaseImpartida(String claseImpartida) {
		this.claseImpartida = claseImpartida;
	}
	

}
