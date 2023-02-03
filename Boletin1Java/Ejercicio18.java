package Boletin1Java;

public class Ejercicio18 {

	public static void main(String[] args) {
		System.out.println("El area es " +calcularAreaCirculo(1));
		System.out.println("La longitud es " +calcularLongitudCirculo(1));

	}
	public static double calcularAreaCirculo(double num1) {
		return Math.PI*Math.pow(num1, 2);
	}
	public static double calcularLongitudCirculo(double num1) {
		return (2*Math.PI)*num1;
	}
	

}
