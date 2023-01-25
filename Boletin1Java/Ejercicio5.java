package Boletin1Java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce la hora");
		int hora=Integer.valueOf(sc.nextLine());
		if (hora>=06 && hora<=12) {
			System.out.println("Buenos dias");
		}else if(hora>=13 && hora<=20) {
			System.out.println("Buenas tardes");
		}else{
			System.out.println("Buenas noches");
		}
		

	}

}
