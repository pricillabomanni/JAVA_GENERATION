package JavaTeste;

import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int operacao = 0;
		double num1, num2, resultado = 0;

		do {

			System.out.println("1) Somar");
			System.out.println("2) Subtrair");
			System.out.println("3) multiplicar");
			System.out.println("4) dividir");
			System.out.println("0) sair");

			System.out.println("Digite a opção desejada: ");
			operacao = teclado.nextInt();

			if (operacao != 0) {

				System.out.println("Digite o numero 1: ");
				num1 = teclado.nextInt();

				System.out.println("Digite o numero 2: ");
				num2 = teclado.nextInt();

				if (operacao == 1) {
					resultado = num1 + num2;
				} else if (operacao == 2) {

					resultado = num1 - num2;
				} else if (operacao == 3) {
					resultado = num1 * num2;
				} else if (operacao == 4) {
					resultado = num1 / num2;
				}

				System.out.println();
				System.out.println("O resultado é: " + resultado);
				System.out.println();

			} else {
				resultado = 0;
			}
		} while (operacao != 0);
	}
}
