package Boletin2;

public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println(toDecimal("1100"));
	}


	public static int toDecimal(String numero) {
		int decimal = 0;
		int posicion = 0;
		for (int x = numero.length() - 1; x >= 0; x--) {
			int digito = 1;
			if (numero.charAt(x) == '0') {
				digito = 0;
			}

			double multiplicador = Math.pow(2, posicion);
			decimal += digito * multiplicador;
			posicion++;
		}
		return decimal;
	}

}