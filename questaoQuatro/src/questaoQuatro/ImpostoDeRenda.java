package questaoQuatro;

import java.util.Scanner;

public class ImpostoDeRenda {

	public static double impostoBruto(double salarioFuncionario, double salarioMinimo) {

		double impostoBruto = 0;

		if (salarioFuncionario > 12 * salarioMinimo) {
			impostoBruto = salarioFuncionario * 0.20;
		} else if (salarioFuncionario > 5 * salarioMinimo) {
			impostoBruto = salarioFuncionario * 0.08;
		}
		return impostoBruto;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com o valor do salário mínimo: ");
		double salarioMinimo = entrada.nextDouble();

		System.out.print("Entre com o número de dependentes: ");
		int dependentes = entrada.nextInt();

		System.out.print("Entre com o valor do salário do funcionário: ");
		double salarioFuncionario = entrada.nextDouble();

		System.out.print("Entre com a taxa de imposto já paga: ");
		double impostoPago = entrada.nextDouble();

		double impostoB = impostoBruto(salarioFuncionario, salarioMinimo);
		double restituicao = impostoB * (0.02 * dependentes);
		double taxaAdicional = impostoB * 0.04;
		double impostoFinal = impostoB + taxaAdicional - restituicao - impostoPago;

		System.out.println("Imposto Bruto: R$ " + impostoB);
		System.out.println("Restituição por dependentes: R$ " + restituicao);
		System.out.println("Taxa adicional: R$ " + taxaAdicional);
		System.out.println("Imposto já pago: R$ " + impostoPago);

		if (impostoFinal <= 0) {
			System.out.println("O funcionário não tem imposto a pagar.");
		} else {
			System.out.println("Imposto de renda Final a pagar: R$ " + impostoFinal);
		}

	}

}
