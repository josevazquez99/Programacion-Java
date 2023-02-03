package Boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(obtenerCaracterPosicion("Hola", false));
	}

	public static String obtenerCaracterPosicion(String cadena, boolean par) {
		String resultado="";
		for (int i = 0; i < cadena.length(); i++) {
			if ((par) && (i%2==0)){
				resultado+=cadena.charAt(i);

			} else if((!par) && (i%2!=0)){
				resultado+=cadena.charAt(i);

			}
		

		}
		return resultado;

	}

}
