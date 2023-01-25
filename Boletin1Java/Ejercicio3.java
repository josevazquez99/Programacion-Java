package Boletin1Java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un cáracter: ");

		String caracter = sc.nextLine();

		char c = caracter.charAt(0);

		if (c == 32) {

			System.out.println(c + " es un espacio en blanco.");

		} else if ((c == 40 || c == 41) || (c == 123 || c == 125)) {

			System.out.println(c + " es un parentesis o una llave.");

		} else if (c >= 33 && c <= 47) {

			System.out.println(c + " es un simbolo de puntuación.");

		} else if (Character.isLowerCase(c)) {

			System.out.println(c + " es una letra mayúscula.");

		} else if (Character.isUpperCase(c)) {

			System.out.println(c + " es una letra minuscula.");

		} else if (Character.isDigit(c)) {

			System.out.println(c + " es un dígito de 0 al 9.");

		} else {

			System.out.println(c + " es otro caracter.");

		}
	}
}
