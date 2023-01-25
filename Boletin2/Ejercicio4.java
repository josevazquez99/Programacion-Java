package Boletin2;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println(cadenaInvertida("Hola mundo"));
	}
	public static String cadenaInvertida(String cadena) {
		int cont=0;
		String cadenaInvertida="";
		while(cont<cadena.length()) {
			if(cont%2!=0) {
				cadenaInvertida+=String.valueOf(cadena.charAt(cont) +String.valueOf(cadena.charAt(cont-1)));
			}
			cont++;
		}
		
		return cadenaInvertida;
	}

}
