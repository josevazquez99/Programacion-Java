package Boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(numeroReves(21));

	}

	public static int numeroReves(int numero) {
		int volteado = 0;

		while (numero > 0) {
			volteado = (volteado * 10) + (numero % 10);//hayo el primer numero
			numero /= 10;//hayo el segundo numero
		}
		return volteado;
	
}
}
