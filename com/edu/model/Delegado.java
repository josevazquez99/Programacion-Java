package com.edu.model;

public class Delegado extends Estudiante {
	private boolean esDelegado;

	public Delegado(String nombre, String apellidos, String dni, int edad, boolean esDelegado) {
		super(nombre, apellidos, dni, edad);
		this.esDelegado = esDelegado;
	}

	public boolean isEsDelegado() {
		return esDelegado;
	}

	public void setEsDelegado(boolean esDelegado) {
		this.esDelegado = esDelegado;
	}
	

}
