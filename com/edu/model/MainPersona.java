package com.edu.model;

public class MainPersona {

	public static void main(String[] args) {
	Persona p1=new Persona("jose", "vazquez","47545311x",23);
	System.out.println(p1);
	Persona p2=new Persona("jose", "Fernandez","47545311A",25);
	System.out.println(p2);
	Estudiante e1= new Estudiante("jose", "vazquez", "47545311x", 23, "1ºDAW");
	System.out.println(e1);
	Profesor pr1= new Profesor("jose", "Fernandez", "47545311A", 25, "1ºDAW");
	System.out.println(pr1);
	Ordenanza or1= new Ordenanza("Jose", "Fernandez", "47545311A", 25, "Alto");
	System.out.println(or1);
	Delegado d1= new Delegado("jose", "vazquez", "47545311x", 23, false);
	System.out.println(d1);
	Director dir1= new Director("Jose", "Fernandez", "47545311A", 25,"1ºDAW", false);
	System.out.println(dir1);
	System.out.println(p1.getApellidos());
	}

}
