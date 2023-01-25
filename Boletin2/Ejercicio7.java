package Boletin2;

/*
Realizar un método llamado segundosEntre que recibirá seis valores enteros, los
tres primeros representarán la hora, minuto y segundos de la primera hora y los
otros tres de la segunda hora. Se deberá devolver el número de segundos que hay
entre la primera hora y la segunda (el valor debe ser siempre en positivo). Si los
datos no son correctos se deberá devolver -1000.

 */
public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(segundosEntre(1, 20, 50, 2, 20, 60));
	}

	public static int segundosEntre(int hora, int minuto, int segundo, int hora2, int minuto2, int segundo2) {
		int resultado = 0;
		int segundoTotal1 = hora * 3600 + minuto * 60 + segundo;
		int segundoTotal2 = hora2 * 3600 + minuto2 * 60 + segundo2;

		if (hora > 0 && minuto > 0 && segundo > 0 && hora2 > 0 && minuto2 > 0 && segundo2 > 0) {
			if (segundoTotal1 > segundoTotal2) {
				resultado = segundoTotal1 - segundoTotal2;
			} else {
				resultado = segundoTotal2 - segundoTotal1;

			}
		} else {
			resultado = -1000;

		}return resultado;
	}
}
