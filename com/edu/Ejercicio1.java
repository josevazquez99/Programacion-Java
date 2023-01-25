package com.edu;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad=Integer.valueOf(sc.nextLine());
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No eres mayor de edad");
		}
	}
	}

