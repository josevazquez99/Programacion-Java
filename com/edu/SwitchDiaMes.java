package com.edu;

import java.util.Scanner;

public class SwitchDiaMes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el mes");
		int mes = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce el año");
		int ano = Integer.valueOf(sc.nextLine());
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			System.out.println("31");
			break;
		}
		case 2 -> {
			if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
				System.out.println("29");
			} else {
				System.out.println("28");
			}

			break;
		}
		case 4, 6, 9, 11 -> {
			System.out.println("30");
			break;
		}
		default -> System.out.println("Mes introducido no vallido");
		}
		 sc.close();
	}

}
