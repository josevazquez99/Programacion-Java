package Boletin1Java;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero=1;
		while(numero>0) {
			System.out.println("Introduce un numero entero mayor que 0");
			numero=Integer.valueOf(sc.nextLine());
			double cuadrado=numero*numero;
			System.out.println(cuadrado);

			
		}
	}

}
