package Boletin2;

/*
Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y
devuelva el máximo común divisor según el algoritmo de Euclides.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		System.out.println(greaterCommonDivisor(24, 36));
	}

	public static double greaterCommonDivisor(double a, double b) {
		while (b > 0) {

			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}

		return a;

	}

}
