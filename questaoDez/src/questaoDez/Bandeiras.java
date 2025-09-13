package questaoDez;

import java.util.Scanner;

public class Bandeiras {

	public static void desenharAsterisco() {
		System.out.print("*");
	}

	public static void desenharEComercial() {
		System.out.print("&");
	}

	public static void desenharPorcento() {
		System.out.print("%");
	}

	public static void bandeiraBrasil(int n) {

		if (n % 2 == 0)
			n++;

		int meio = n / 2;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				int meiaAltura = n / 6;
				int meiaLargura = n / 4;

				if ((Math.abs(i - meio) <= meiaAltura) && (Math.abs(j - meio) <= meiaLargura)) {
					desenharEComercial();
				} else if (Math.abs(i - meio) + Math.abs(j - meio) == meio - 1) {
					desenharPorcento();
				} else {
					desenharAsterisco();
				}
			}
			System.out.println();
		}
	}

	public static void bandeiraAlemanha(int n) {
		int faixa = n / 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < faixa) {
					desenharAsterisco();
				} else if (i < 2 * faixa) {
					desenharPorcento();
				} else {
					desenharEComercial();
				}
			}
			System.out.println();
		}
	}

	public static void bandeiraArgentina(int n) {

		while (n % 3 != 0 || n % 2 == 0)
			n++;

		int faixa = n / 3;
		int centro = n / 2;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < faixa || i >= (n - faixa)) {
					desenharAsterisco();
				} else {
					if (j >= faixa && j < (n - faixa)) {
						if (i == centro && j == centro) {
							desenharAsterisco();
						} else {
							desenharEComercial();
						}
					} else {
						desenharPorcento();
					}
				}
			}
			System.out.println();
		}
	}

	public static void bandeiraBelgica(int n) {
		int faixa = n / 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < faixa) {
					desenharAsterisco();
				} else if (j < 2 * faixa) {
					desenharEComercial();
				} else {
					desenharPorcento();
				}
			}
			System.out.println();
		}
	}

	public static void bandeiraInglaterra(int n) {

		if (n % 2 == 0)
			n++;

		int meio = n / 2;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if ((i >= meio - 1 && i <= meio + 1) || (j >= meio - 1 && j <= meio + 1)) {
					desenharPorcento();
				} else {
					desenharAsterisco();
				}
			}
			System.out.println();
		}
	}

	public static void bandeiraCoreia(int n) {
		if (n % 2 == 0)
			n++;

		int meio = n / 2;
		int quarto = n / 4;
		int tresQuartos = n - 1 - quarto;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int meiaAltura = n / 9;
				int meiaLargura = n / 6;

				if ((Math.abs(i - meio) <= meiaAltura) && (Math.abs(j - meio) <= meiaLargura)) {
					desenharEComercial();
				} else if ((i < quarto && j < quarto) || (i < quarto && j > tresQuartos)
						|| (i > tresQuartos && j < quarto) || (i > tresQuartos && j > tresQuartos)) {
					desenharPorcento();
				} else {
					desenharAsterisco();
				}
			}
			System.out.println();
		}
	}

	public static void bandeiraUSA(int n) {

		if (n < 13) {
			System.out.println("O tamanho deve ser no mínimo 13.");
			return;
		}

		int faixa = n / 13;
		int alturaBloco = 7 * faixa;
		int larguraBloco = (int) (n * 0.4);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < alturaBloco && j < larguraBloco) {
					desenharAsterisco();
				} else if (i / faixa % 2 == 0) {
					desenharPorcento();
				} else {
					desenharEComercial();
				}
			}
			System.out.println();
		}
	}

	public static void bandeiraCatar(int n) {
		int limite = n / 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < limite + (i % 2)) {
					desenharAsterisco();
				} else {
					desenharEComercial();
				}
			}
			System.out.println();
		}
	}

	public static void bandeiraJapao(int n) {

		if (n % 2 == 0)
			n++;

		int meio = n / 2;
		int bloco = n / 4;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if ((i >= meio - bloco && i <= meio + bloco) && (j >= meio - bloco && j <= meio + bloco)) {
					desenharEComercial();
				} else {
					desenharAsterisco();
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com o tamanho (linhas = colunas): ");
		int n = entrada.nextInt();

		int opcao;

		do {

			System.out.println("1 - Brasil");
			System.out.println("2 - Alemanha");
			System.out.println("3 - Argentina");
			System.out.println("4 - Bélgica");
			System.out.println("5 - Inglaterra");
			System.out.println("6 - Coreia do Sul");
			System.out.println("7 - USA");
			System.out.println("8 - Catar");
			System.out.println("9 - Japão");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");

			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				bandeiraBrasil(n);
				break;
			case 2:
				bandeiraAlemanha(n);
				break;
			case 3:
				bandeiraArgentina(n);
				break;
			case 4:
				bandeiraBelgica(n);
				break;
			case 5:
				bandeiraInglaterra(n);
				break;
			case 6:
				bandeiraCoreia(n);
				break;
			case 7:
				bandeiraUSA(n);
				break;
			case 8:
				bandeiraCatar(n);
				break;
			case 9:
				bandeiraJapao(n);
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
