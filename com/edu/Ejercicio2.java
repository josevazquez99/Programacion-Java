package com.edu;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad=Integer.valueOf(sc.nextLine());
		if (edad<18) {
			System.out.println("Niño");
		}else if(edad>=18 && edad<=65){
			System.out.println("Adulto");
		}else {
			System.out.println("Anciano");
		}
	}

}
