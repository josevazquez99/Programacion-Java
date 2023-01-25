package Boletin1Java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notaFinal=0;
		System.out.println("Introduce la nota de la parte práctica: ");
		Double notaPractica = Double.valueOf(sc.nextLine());
		while (notaPractica < 0 || notaPractica > 10) {
			System.out.println("Introduce la nota de la parte práctica correctamente: ");
			notaPractica = Double.valueOf(sc.nextLine());
		}

		System.out.println("Introduce la nota de la parte de problemas: ");
		Double notaProblemas = Double.valueOf(sc.nextLine());
		while (notaProblemas < 0 || notaProblemas > 10) {
			System.out.println("Introduce la nota de la parte de problemas correctamente: ");
			notaProblemas = Double.valueOf(sc.nextLine());
		}

		System.out.println("Introduce la nota de la parte teóricas: ");
		Double notaTeorica = Double.valueOf(sc.nextLine());
		while (notaTeorica < 0 || notaTeorica > 10) {
			System.out.println("Introduce la nota de la parte teórica correctamente: ");
			notaTeorica = Double.valueOf(sc.nextLine());
		}
		notaFinal=notaPractica*0.10+notaProblemas*0.5+notaTeorica*0.4;
		if(notaFinal<5) {
			System.out.println("Insuficiente");
		}else if(notaFinal==5){
			System.out.println("Suficiente");
		}else if(notaFinal>5 && notaFinal<=6){
			System.out.println("Bien");
		}else if(notaFinal>6 && notaFinal<=8){
			System.out.println("Notable");
		}else {
			System.out.println("Sobresaliente");
		}
	}

}
