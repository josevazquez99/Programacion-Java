package Boletin3;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(buscarPalabra("hola", "shybaoxlna"));
	}

	public static boolean buscarPalabra(String palabra, String frase) {
		boolean encontrada = false;
		int coincidencia = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(coincidencia < palabra.length()) {
				if((palabra.charAt(coincidencia)) == frase.charAt(i)) {
				coincidencia ++;
				}
			}if(coincidencia == palabra.length()) {
				encontrada = true;
				}
		}return encontrada;
		
	}
}
