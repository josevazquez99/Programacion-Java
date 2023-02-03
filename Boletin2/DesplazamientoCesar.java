package Boletin2;

public class DesplazamientoCesar {

	public static void main(String[] args) {
		System.out.println(obtenerDesplazamientoCesar("joselito", 2));
	}

	public static String obtenerDesplazamientoCesar(String cadena, int posicion) {
		String abc = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789 ";
		String cadenaCod = "";
		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < abc.length(); j++) {
				if (cadena.charAt(i) == abc.charAt(j)) {
					cadenaCod += abc.charAt((j + posicion) % abc.length());
				}
			}
		}
		cadena = cadenaCod;
		return cadena;
	}
}
