package Boletin1Java;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		String valor = "";
		int suma = 0;
		valor = sc.nextLine();
		while (!valor.equals("fin")) {
			suma += Integer.valueOf(valor);
			System.out.println("Introduce un numero");
			valor = sc.nextLine();

		}
		System.out.println("La suma es " + suma);

	}

}
