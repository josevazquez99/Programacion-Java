package com.edu.model;

public class Director extends Profesor {
	private boolean esDirector;

	public Director(String nombre, String apellidos, String dni, int edad, String claseImpartida, boolean esDirector) {
		super(nombre, apellidos, dni, edad, claseImpartida);
		this.esDirector = esDirector;
	}

	public boolean isEsDirector() {
		return esDirector;
	}

	public void setEsDirector(boolean esDirector) {
		this.esDirector = esDirector;
	}
	
}
