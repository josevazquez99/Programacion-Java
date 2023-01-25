package Boletin1Java;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres");
		int numero = Integer.valueOf(sc.nextLine());
		int num1 = 0;
		int num2 = 1;
		int suma = 1;
		for (int i = 1; i <= numero; i++) {

			System.out.println(suma);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}
	}
}
