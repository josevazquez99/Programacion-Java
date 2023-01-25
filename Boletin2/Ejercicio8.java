package Boletin2;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(toBinary(2));
	}

	public static String toBinary(int numero) {
		String resultado = "";
		while(numero>0) {
			if(numero%2==0) {
;				resultado="0"+resultado;
			}else {
				resultado="1"+resultado;
			}
			numero=(int)numero/2;
		}

		return resultado;
	}

}
