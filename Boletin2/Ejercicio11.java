package Boletin2;
/*
 Realizar un método llamado minimoComunMultiplo que reciba dos números y
calcule el mínimo común múltiplo de dos números. Con el máximo común divisor de
una pareja de números podemos obtener fácilmente el mínimo común múltiplo de
dicha pareja. El mínimo común múltiplo de dos números es igual al producto de los
números dividido entre su máximo común divisor. Por ejemplo, el máximo común
divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es
(24×36)/12=72.
 */

public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println(minimoComunMultiplo(24,36));
	}

	public static double minimoComunMultiplo(double a, double b) {
		double comunDivisor=Ejercicio10.greaterCommonDivisor(a, b);
		double resultado=(a*b)/comunDivisor;
		return resultado;
		

	}

}
