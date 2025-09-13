package questaoDois;

import java.util.Arrays;
import java.util.Scanner;

public class QuestaoArray {

	public static int soma(int vetor[], int n) {

		int soma = 0;

		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		return soma;
	}

	public static int maior(int vetor[], int n) {
		int maior = vetor[0];
		for (int i = 0; i < n; i++) {
			if (vetor[i] > maior)
				maior = vetor[i];
		}
		return maior;
	}

	public static int menor(int vetor[], int n) {
		int menor = vetor[0];
		for (int i = 0; i < n; i++) {
			if (vetor[i] < menor)
				menor = vetor[i];
		}
		return menor;
	}

	public static double mediana(int vetor[], int n) {
		Arrays.sort(vetor);
		double mediana;

		if (n % 2 == 0) {
			mediana = (vetor[n / 2 - 1] + vetor[n / 2]) / 2;
		} else {
			mediana = vetor[n / 2];
		}
		return mediana;
	}

	public static int moda(int vetor[], int n) {
		Arrays.sort(vetor);
		int moda = vetor[0];
		int freqMax = 1;
		int freqAtual = 1;

		for (int i = 1; i < n; i++) {
			if (vetor[i] == vetor[i - 1]) {
				freqAtual++;
			} else {
				freqAtual = 1;
			}
			if (freqAtual > freqMax) {
				freqMax = freqAtual;
				moda = vetor[i];
			}
		}
		return moda;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com o tamanho do vetor: ");
		int n = entrada.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.print("Entre com o valor da posição " + i + ": ");
			vetor[i] = entrada.nextInt();
		}
		System.out.println("Soma = " + soma(vetor, n));
		System.out.println("Maior = " + maior(vetor, n) + ", menor = " + menor(vetor, n));
		System.out.println("Media = " + (double) soma(vetor, n) / n);
		System.out.println("Mediana = " + mediana(vetor, n));
		System.out.println("Moda = " + moda(vetor, n));

	}

}
