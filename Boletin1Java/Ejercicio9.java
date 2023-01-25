package Boletin1Java;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int suma = 0;
		while (i >= 1 && i <= 5) {
			System.out.println("Introduce un numero");
			int numero = Integer.valueOf(sc.nextLine());
			i++;
			if (numero%3==0) {
				System.out.println(numero + " Es multiplo de 3");;
			}
		}
	}

}
