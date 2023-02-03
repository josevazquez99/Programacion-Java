package Boletin3;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(contarNumeroVecesPalabra("Hola jose , encantado jose", "jose"));
	}

	public static int contarNumeroVecesPalabra(String cadena, String palabra) {
		int contador = 0;
		int coincidencia = 0;
		int numeroDeVeces = 0;
		while (contador < cadena.length()) {
			if ((palabra.charAt(coincidencia)) == (cadena.charAt(contador))) {
				coincidencia++;
			} else {
				coincidencia = 0;
			}
			if (coincidencia == palabra.length()) {

				numeroDeVeces++;

				coincidencia = 0;

			}
			contador++;

		}
		return numeroDeVeces;

	}
}
