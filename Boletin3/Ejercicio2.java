package Boletin3;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(esDivisible(156));
	}

	public static boolean esDivisible(int numero) {
		String numeroCadena = numero + "";
		boolean divisible = false;
		int resultado = 0;
		for (int i = 0; i < numeroCadena.length(); i++) {
			resultado += Integer.valueOf(numeroCadena.substring(i, i + 1));
			if (resultado % 3 == 0) {
				divisible = true;
			}

		}
		return divisible;

	}

}
