package questaoSeis;

import java.util.Scanner;

public class Radioativo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a massa inicial (g): ");
		double massaInicial = entrada.nextDouble();
		
		double massaFinal = massaInicial;
		int tempoSegundos = 0;
		
		while (massaFinal >= 0.5) {
			massaFinal /= 2;
			tempoSegundos += 50;
		}
		
		int horas = tempoSegundos / 3600;
		int minutos = (tempoSegundos % 3600) /60;
		int segundos = tempoSegundos % 60;
		
		System.out.println("Massa inicial: " + massaInicial + " g");
		System.out.println("Massa Final: " + massaFinal + " g");
		System.out.println("Tempo necessário: " + horas + "h " + minutos + "m " + segundos + "s");

	}

}
