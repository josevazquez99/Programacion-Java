package Boletin3;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println(esPalindromo("a na "));
	}

	public static boolean esPalindromo(String cadena) {
		boolean esPalindromo=false;
		StringBuilder cadenaInvertida =new StringBuilder();
		for (int i = cadena.length() - 1; i >= 0; i--) {
			if (Character.isWhitespace(cadena.charAt(i))) {

				cadena = cadena.substring(0, i) + cadena.substring(i + 1);

				i--;

			}cadenaInvertida.append(cadena.substring(i,i+1));
		}if(cadena.equals(cadenaInvertida.toString())) {
			esPalindromo=true;
		}
		return esPalindromo;
	}
}
