package com.edu;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduce si esta abierto");
//		boolean abierto = Boolean.valueOf(sc.nextLine());
//		if (abierto) {
//			System.out.println("Puede pasar");
//		} else {
//			System.out.println("En otra ocasion");
//		}

		System.out.println("Introduce el dia");
		int dia = Integer.valueOf(sc.nextInt());

		switch (dia) {
		case 1: {
			System.out.println("Lunes");
			break;
		}
		case 2: {
			System.out.println("Martes");
			break;
		}
		case 3: {
			System.out.println("Miercoles");
			break;
		}
		case 4: {
			System.out.println("Jueves");
			break;
		}
		case 5: {
			System.out.println("Viernes");
			break;
		}
		case 6: {
			System.out.println("Sabado");
			break;
		}
		case 7: {
			System.out.println("Domingo");
			break;
		}
		default:
			System.out.println("Dia introducido no vallido");
			;
		}
	}

}
