package Boletin2;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(horaMayor(-1, 20, 30, 1, 20, 30));
		System.out.println(horaMayor(1, 20, 30, 1, 50, 30));
		System.out.println(horaMayor(1, 20, 30, 1, 20, 30));
		System.out.println(horaMayor(1, 20, 30, 1, 20, 50));

	}

	public static int horaMayor(int hora, int minuto, int segundo, int hora2, int minuto2, int segundo2) {
		int resultado = 0;
		if (hora > 0 && minuto > 0 && segundo > 0 && hora2 > 0 && minuto2 > 0 && segundo2 > 0) {
			if (hora > hora2) {
				resultado = 1;
			} else if (hora < hora2) {
				resultado = 2;
			} else {
				if (minuto > minuto2) {
					resultado = 1;
				} else if (minuto < minuto2) {
					resultado = 2;
				} else {
					if (segundo > segundo2) {
						resultado = 1;
					} else if (segundo < segundo2) {
						resultado = 2;
					} else {
						resultado = 0;
					}
				}
			}

		} else {
			resultado = -1000;
		}

		return resultado;

	}
}
