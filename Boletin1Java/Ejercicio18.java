package Boletin1Java;

public class Ejercicio18 {

	public static void main(String[] args) {
		double num1=5;
		System.out.println("El area es " +calcularAreaCirculo(num1));
		System.out.println("La longitud es " +calcularLongitudCirculo(num1));

	}
	public static double calcularAreaCirculo(double num1) {
		double pi=3.14;
		return pi*(num1*num1);
	}
	public static double calcularLongitudCirculo(double num1) {
		double pi=3.14;
		return (2*pi)*num1;
	}
	

}
