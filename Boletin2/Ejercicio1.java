package Boletin2;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println(numeroSolucionesEcuacionSegundoGrado(6, -5, 1));
	}

	public static String numeroSolucionesEcuacionSegundoGrado(int a, int b, int c) {

		double x1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		String val1=String.valueOf(x1);
		double x2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		String val2=String.valueOf(x2);

		String resultado = ("Esto tiene dos soluciones la primera: " + val1 + " la segunda: " + val2);
		return resultado;
	}
}
