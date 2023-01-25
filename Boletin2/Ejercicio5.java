package Boletin2;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println(hayarMultiplo(15, 5));
	}

	public static boolean hayarMultiplo(int numero, int numero2) {
		boolean multiplo = false;
		if ((numero2 % numero) == 0 || (numero%numero2)==0) {
			multiplo = true;
		}
		return multiplo;

	}

}
