package Boletin2;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(comprobarContrasena("JoseVazquez9!"));
	}

	public static boolean comprobarContrasena(String contrasena) {
		int cont = 0;
		boolean seguro = false;
		int mayuscula = 0;
		int minuscula = 0;
		int digito = 0;
		int signoPuntuacion = 0;
		char c = contrasena.charAt(cont);
		if (contrasena.length() >= 8) {
			while (cont < contrasena.length()) {
				if (Character.isUpperCase(contrasena.charAt(cont))) {
					mayuscula++;
				} else if ((Character.isLowerCase(contrasena.charAt(cont)))) {
					minuscula++;
				} else if ((Character.isDigit(contrasena.charAt(cont)))) {
					digito++;
				} else if (contrasena.charAt(cont) == '!' || contrasena.charAt(cont) == '?') {
					signoPuntuacion++;
				}
				cont++;
			}
			if (mayuscula >= 1 && minuscula >= 1 && digito >= 1 && signoPuntuacion >= 1) {
				seguro = true;

			}

		}

		return seguro;

	}
}