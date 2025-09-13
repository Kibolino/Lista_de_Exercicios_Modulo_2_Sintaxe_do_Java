package questaoSete;

import java.util.Scanner;

public class Vetores {

	public static int[] lerVetor(Scanner entrada, int tamanho) {
		int [] v = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Entre com o elemento " + (i + 1) + ": ");
			v[i] = entrada.nextInt();
		}
		return v;
	}
	public static int somaVetor (int[] v) {
		int soma = 0;
		for (int i = 0; i < v.length; i++) {
			soma += v[i];
		}
		return soma;
	}
	public static int produtoVetor (int[] v) {
		int produto = 1;
		for (int i = 0; i < v.length; i++) {
			produto *= v[i];
		}
		return produto;
	}
	public static double mediaVetor(int[] v) {
		return (double) somaVetor(v) / v.length;
	}
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o tamanho dos vetores: ");
		int n = entrada.nextInt();
		
		System.out.println("\nVetor 1");
		int[] v1 = lerVetor(entrada, n);
		
		System.out.println("\nVetor 2");
		int[] v2 = lerVetor(entrada, n);
		
		System.out.println("\nVetor 3");
		int[] v3 = lerVetor(entrada, n);
		
		int soma1 = somaVetor(v1);
		int soma2 = somaVetor(v2);
		int soma3 = somaVetor(v3);
		
		int produto1 = produtoVetor(v1);
		int produto2 = produtoVetor(v2);
		int produto3 = produtoVetor(v3);
		
		double media1 = mediaVetor(v1);
		double media2 = mediaVetor(v2);
		double media3 = mediaVetor(v3);
		
		int[] somas = {soma1, soma2, soma3};
		int[] produtos = {produto1, produto2, produto3};
		double[] medias = {media1, media2, media3};
		
		int somaFinal = somaVetor(somas);
		
		double somaMedias = 0;
		for (int i = 0; i < medias.length; i++) {
			somaMedias += medias[i];
		}
		double mediaFinal = somaMedias / medias.length;
		
		int produtoFinal = produtoVetor(produtos);
		
		System.out.println("\nVetor 1 -> Soma: " + soma1 + " | Produto: " + produto1 + " | Média: " + media1);
        System.out.println("Vetor 2 -> Soma: " + soma2 + " | Produto: " + produto2 + " | Média: " + media2);
        System.out.println("Vetor 3 -> Soma: " + soma3 + " | Produto: " + produto3 + " | Média: " + media3);
        
        System.out.println("\nResultados finais:");
        System.out.println("Soma do vetor de somas: " + somaFinal);
        System.out.println("Média do vetor de médias: " + mediaFinal);
        System.out.println("Produto do vetor de produtos: " + produtoFinal);
	}

}
