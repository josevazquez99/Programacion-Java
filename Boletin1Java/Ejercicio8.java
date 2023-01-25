package Boletin1Java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		int suma=0;
		while (i>=1 && i<=15) {
			System.out.println("Introduce un numero");
			int numero=Integer.valueOf(sc.nextLine());
			i++;
			suma+=numero;
			
		}
		System.out.println(suma);
	}

}
