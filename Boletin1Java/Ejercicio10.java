package Boletin1Java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero entero mayor que 0");
		int numero=Integer.valueOf(sc.nextLine());
		int contador=0;
		int suma=0;
		while(numero>0 && contador<=100) {
			numero++;
			contador+=1;
			suma+=numero;
			
		}
		System.out.println("La suma es " +suma);
	}

}
