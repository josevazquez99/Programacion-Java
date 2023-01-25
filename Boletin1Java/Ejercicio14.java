package Boletin1Java;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		int mayorPar = 0;
		int mediaImpar = 0;
		int contadorImpar=0;
		while (numero >= 0) {
			System.out.println("Introduce un numero mayor que 0");
			numero = Integer.valueOf(sc.nextLine());
			contador += 1;
			if (numero % 2 == 0) {
				if (numero > mayorPar) {
					mayorPar = numero;
				}
			} else {
				mediaImpar = mediaImpar + numero;
				contadorImpar+=1;
			}

		}
		System.out.println("Has introducido " + (contador - 1) + " numeros positivos ");
		System.out.println("El mayor par es " + mayorPar);
		System.out.println("La media de los impares es " + mediaImpar/(contadorImpar-1));

	}

}
