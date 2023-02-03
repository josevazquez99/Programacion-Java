package Boletin3;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println(esCapicua(11));
	}

	public static boolean esCapicua(int numero) {
		boolean esCapicua=false;
		String numeroInvertido=numero+"";
		StringBuilder numeroInvertir=new StringBuilder();
		for(int i=numeroInvertido.length()-1;i>=0;i--) {
			if(numeroInvertido.charAt(i)=='.') {
				numeroInvertido=numeroInvertido.substring(0,i)+numeroInvertido.substring(i,i+1);
				i--;
				
			}numeroInvertir.append(numeroInvertido.substring(i,i+1));
			if(numeroInvertido.equals(numeroInvertir.toString())) {
				esCapicua=true;
			}
		}return esCapicua;
	}

}
