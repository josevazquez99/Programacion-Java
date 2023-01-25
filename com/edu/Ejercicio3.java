package com.edu;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el mes");
		int mes = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce el año");
		int ano = Integer.valueOf(sc.nextLine());
		if (mes == 1) {
			System.out.println("31 dias");
		} else if (mes == 2 && ano % 4 == 0) {
			System.out.println("29 dias ");
		} else if (mes == 2) {
			System.out.println("28 dias ");
		} else if (mes == 3) {
			System.out.println("31 dias ");
		} else if (mes == 4) {
			System.out.println("30 dias ");
		} else if (mes == 5) {
			System.out.println("31 dias ");
		} else if (mes == 6) {
			System.out.println("30 dias ");
		} else if (mes == 7) {
			System.out.println("31 dias ");
		} else if (mes == 8) {
			System.out.println("31 dias ");
		} else if (mes == 9) {
			System.out.println("30 dias ");
		} else if (mes == 10) {
			System.out.println("31 dias ");
		} else if (mes == 11) {
			System.out.println("30 dias ");
		} else if (mes == 12) {
			System.out.println("31 dias ");
		} else {
			System.out.println("Datos mal introducidos");
		}
	}

}
