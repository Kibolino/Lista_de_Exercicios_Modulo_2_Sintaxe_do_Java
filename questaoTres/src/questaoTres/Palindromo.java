package questaoTres;

import java.util.Scanner;

public class Palindromo {

	public static boolean verificaPalindromo(char letras[]) {

		boolean palindromo = true;

		for (int i = 0; i < letras.length / 2; i++) {
			if (letras[i] != letras[letras.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		return palindromo;
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com uma palavra: ");
		String palavra = entrada.next();

		char[] letras = palavra.toCharArray();

		if (verificaPalindromo(letras)) {
			System.out.println("A palavra é um palíndromo");
		} else {
			System.out.println("A palavra não é um palíndromo");
		}

	}

}
