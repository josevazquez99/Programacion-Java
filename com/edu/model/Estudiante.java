package com.edu.model;

public class Estudiante extends Persona {
	private String clase;

	public Estudiante(String nombre, String apellidos, String dni, int edad) {
		super(nombre, apellidos, dni, edad);
	}

	public Estudiante(String nombre, String apellidos, String dni, int edad, String clase) {
		super(nombre, apellidos, dni, edad);
		this.clase = clase;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}
	

}
