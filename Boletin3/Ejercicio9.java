package Boletin3;

public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println(numeroDePalabraFraseParrafo("Buenos dias , ¿como estas?."));
	}

	public static String numeroDePalabraFraseParrafo(String cadena) {
		int contFrase = 0;
		int contPalabra = 0;
		int contParrafo = 0;
		if (cadena.length() > 0) {
			contParrafo++;
			for (int i = 0; i < cadena.length(); i++) {
				if (i == 0 && !cadena.substring(i, i + 1).equals(" ")) {
					contPalabra++;
				} else if (!cadena.substring(i, i + 1).isBlank() && cadena.substring(i - 1, i).isBlank()) {
					contPalabra++;
				} else if (cadena.substring(i, i + 1).isBlank() && cadena.substring(i - 1, i).equals(".")) {
					contFrase++;
				} else if (cadena.substring(i, i + 1).equals("\n")) {
					contParrafo++;
				}
			}
		}
		return ("En la cadena introducida hay: " + contPalabra + " palabras, " + contFrase + " frases, y " + contParrafo
				+ " párrafos.");

	}

}
