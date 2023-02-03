package Boletin3;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println(startsWirth("Hola", "H"));
		System.out.println(contains("Hola", "o"));
	}
	public static boolean startsWirth (String cadena,String letra) {
		return (cadena.substring(0, letra.length()).equals(letra));

	}
	public static boolean endsWirth(String cadena,String letra) {
		return (cadena.substring(cadena.indexOf(letra.charAt(0)), cadena.length()).equals(letra));
	}
	
	public static boolean contains (String cadena,String letra) {
		boolean contiene=false;
		int contador=0;
		int coincidencia=0;
		while(contador<cadena.length()) {
			if((cadena.charAt(coincidencia))==(letra.charAt(contador))){
				coincidencia++;
				contiene=true;
			}else {
				coincidencia=0;
			}if (coincidencia == cadena.length()) {
				coincidencia = 0;

			}contador++;
		}return contiene;
	}
}


