package Boletin1Java;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int mayor;
		int menor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = Integer.valueOf(sc.nextLine());
		menor = numero;
		mayor = numero;
		for (int i = 1; i < 10; i++) {
			System.out.println("Introduce un numero");
			numero = Integer.valueOf(sc.nextLine());
			if (numero > mayor) {
				mayor = numero;
			}
			if (numero < menor) {
				menor = numero;
			}

		}
		System.out.println(mayor);
		System.out.println(menor);

	}
}
