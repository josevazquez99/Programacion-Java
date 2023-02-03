package Boletin3;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(reemplazarPalabra("Hola jose", "Hola", "adios"));
	}

	public static String reemplazarPalabra(String frase, String palabraBuscar, String palabraReemplazar) {
		StringBuilder resultado = new StringBuilder();
		String tmp = "";
		int ipalabra = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == palabraBuscar.charAt(ipalabra)) {
				tmp += palabraBuscar.charAt(ipalabra);
				ipalabra++;
				if (palabraBuscar.length() == ipalabra) {
					ipalabra = 0;
					resultado.append(palabraReemplazar);
					tmp = "";
				}
			} else {
				resultado.append(tmp + frase.charAt(i));
				ipalabra = 0;
			}
		}
		return resultado.toString();
	}
}
