package questaoOito;

import java.util.Scanner;

public class Funcionarios {

	public static String vencedor(int[] votos, String[] funcionarios) {
		int indice = 0;
		for (int i = 1; i < votos.length; i++) {
			if (votos[i] > votos[indice]) {
				indice = i;
			}
		}
		return funcionarios[indice] + " com " + votos[indice] + " votos.";
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com o número de funcionários: ");
		int n = entrada.nextInt();

		String[] funcionarios = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o nome do funcionário " + (i + 1) + ": ");
			funcionarios[i] = entrada.next();
		}

		int[] votos = new int[n];

		System.out.print("\nEntre com o número de votantes: ");
		int votantes = entrada.nextInt();

		System.out.println("\nLista de candidatos:");
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println(i + " - " + funcionarios[i]);
		}

		for (int i = 0; i < votantes; i++) {
			System.out.print("\nVotante " + (i + 1) + ", entre com o número do candidato: ");
			int voto = entrada.nextInt();

			if (voto >= 0 && voto < funcionarios.length) {
				votos[voto]++;
			} else {
				System.out.println("Voto inválido!");
			}
		}

		String resultado = vencedor(votos, funcionarios);
		System.out.println("\nFuncionário do mês: " + resultado);

	}

}