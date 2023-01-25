package Boletin1Java;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int suma = 0;
		String valorIntroducido="";
		while (!valorIntroducido.equals("fin")) {
			System.out.println("Introduce un numero");
			valorIntroducido = sc.nextLine();
			if (!valorIntroducido.equals("fin")) {
				numero = Integer.valueOf(valorIntroducido);
				suma += numero;

			}

		}

		System.out.println("La suma es " +suma);
	}

}
