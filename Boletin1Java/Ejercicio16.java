package Boletin1Java;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mayorMil=0;
		int contador=0;
		int suma=0;
		while(contador<10) {
			System.out.println("Introduce el salario mensual");
			double numero =Double.valueOf(sc.nextLine());
			contador+=1;
			suma+=numero;
			if (numero>1000) {
				mayorMil+=1;
				
			}
			
			
		}System.out.println("Hay  " + mayorMil + " mayores que 1000");
		System.out.println("La suma es " + suma);
		
	}

}
