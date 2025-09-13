package questaoCinco;

import java.util.Scanner;

public class VogaisConsoantes {

	public static boolean vogal(char c) {
		c = Character.toLowerCase(c);
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de nomes desejada: ");
		int n = entrada.nextInt();
		
		String[] nomes = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o nome " + (i+1) + ": ");
			nomes[i] = entrada.next();
		}
		
		for (int i = 0; i < n; i++) {
			String nome = nomes[i];
			System.out.println("\nNome: " + nome);
			
			System.out.print("Vogais: ");
			for (int j = 0; j < nome.length(); j++) {
				char letra = nome.charAt(j);
				if (Character.isLetter(letra) && vogal(letra)) {
					System.out.print(letra + " ");
				}
			}
			
			System.out.print("\nConsoantes: ");
			for (int j = 0; j < nome.length(); j++) {
				char letra = nome.charAt(j);
				if (Character.isLetter(letra) && !vogal(letra)) {
					System.out.print(letra + " ");
				}
			}
			System.out.println();
		}
	}

}
