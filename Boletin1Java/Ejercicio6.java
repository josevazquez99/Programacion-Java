package Boletin1Java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce el dia");
		int dia=Integer.valueOf(sc.nextLine());
		System.out.println("Introduce el mes");
		int mes=Integer.valueOf(sc.nextLine());
		
		if(dia>20 && mes==3 || dia>0 && mes==4 || dia>0 && mes==5 || dia<21 && mes==6) {
			System.out.println("Primavera -->20º");
		}else if(dia>20 && mes==6 || dia>0 && mes==7 || dia>0 && mes==8 || dia>21 && mes==9) {
			System.out.println("Verano -->24º");
		}else if(dia>20 && mes==9 || dia>0 && mes==10 || dia>0 && mes==11 || dia>21 && mes==12) {
			System.out.println("Otoño -->19º");
		}else {
			System.out.println("Iniverno -->19º");
		}

	}

}
