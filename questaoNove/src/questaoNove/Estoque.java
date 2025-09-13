package questaoNove;

import java.util.Scanner;

public class Estoque {

	public static void cadastrarProdutos(String[] nomes, int[] quantidades, Scanner entrada) {
		for (int i = 0; i < nomes.length; i++) {
			
			System.out.print("Entre com o nome do produto " + (i + 1) + ": ");
			nomes[i] = entrada.next();
			System.out.print("Entre com a quantidade inicial de " + nomes[i] + ": ");
			quantidades[i] = entrada.nextInt();
		}
	}

	public static void consultarProduto(String[] nomes, int[] quantidades, Scanner entrada) {
		System.out.print("Entre com o nome do produto a consultar: ");
		String nome = entrada.next();

		boolean encontrado = false;
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equalsIgnoreCase(nome)) {
				System.out.println("Produto: " + nomes[i] + " | Quantidade em estoque: " + quantidades[i]);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Produto não encontrado.");
		}
	}

	public static void atualizarEstoque(String[] nomes, int[] quantidades, Scanner entrada) {
		System.out.print("Entre com o nome do produto para atualizar: ");
		String nome = entrada.next();

		boolean encontrado = false;
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equalsIgnoreCase(nome)) {
				System.out.print("Entre com a quantidade a alterar (use negativo para retirar): ");
				int alteracao = entrada.nextInt();


				quantidades[i] += alteracao;

				if (quantidades[i] < 0) {
					quantidades[i] = 0;
				}

				System.out.println("Novo estoque de " + nomes[i] + ": " + quantidades[i]);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Produto não encontrado.");
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com a quantidade de produtos a serem cadastrados: ");
		int n = entrada.nextInt();

		String[] nomes = new String[n];
		int[] quantidades = new int[n];

		cadastrarProdutos(nomes, quantidades, entrada);

		int opcao;
		do {
			System.out.println("\nMENU");
			System.out.println("1 - Consultar produto");
			System.out.println("2 - Atualizar estoque");
			System.out.println("3 - Listar todos os produtos");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				consultarProduto(nomes, quantidades, entrada);
				break;
			case 2:
				atualizarEstoque(nomes, quantidades, entrada);
				break;
			case 3:
				System.out.println("\nEstoque Atual");
				for (int i = 0; i < nomes.length; i++) {
					System.out.println("Produto: " + nomes[i] + " | Quantidade: " + quantidades[i]);
				}
				break;
			case 0:
				System.out.println("Sistema encerrado");
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

	}

}
