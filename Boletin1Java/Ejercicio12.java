package Boletin1Java;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numero=1;
		int contador=0;
		while(numero>0) {
			System.out.println("Introduce un numero entero mayor que 0");
			numero=Integer.valueOf(sc.nextLine());
			contador+=1;

			
		}
		System.out.println("Se han introducido "+ contador);
	}

}
