package Boletin1Java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dia");
		int dia = Integer.valueOf(sc.nextLine());
		switch (dia) {
		case 1: {
			System.out.println("Base de datos");
			break;
		}
		case 2: {
			System.out.println("Programación");
			break;

		}
		case 3: {
			System.out.println("Programación");
			break;

		}
		case 4: {
			System.out.println("Fol");
			break;

		}
		case 5: {
			System.out.println("Programación");
			break;

		}
		default:
			System.out.println("Dia introducido no valido");
		}

	}

}
