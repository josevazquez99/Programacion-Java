package Boletin1Java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce otro numero");
		int numero2 = Integer.valueOf(sc.nextLine());
		boolean multiplo = false;
		if (numero % numero2 == 0) {
			multiplo = true;

		}
		System.out.println(multiplo);
		sc.close();

	}

}
