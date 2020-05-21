package JavaTeste;

import java.util.Scanner;

public class ImcPessoa {
	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		System.out.print("Sexo: ");
		char sexo = teclado.next().charAt(0);
		System.out.print("Peso: ");
		double peso = teclado.nextDouble();
		System.out.print("Altura: ");
		double altura = teclado.nextDouble();

		double imc = peso / (altura * altura);

		if (sexo == 'F' && imc < 19.1) {
			System.out.println(nome + "você está abaixo do peso.");
		} else if (sexo == 'F' && imc <= 25.8) {
			System.out.println(nome + "você está com peso ideal.");
		} else if (sexo == 'F' && imc <= 27.3) {
			System.out.println(nome + "você está um pouco acima do peso.");
		} else if (sexo == 'F' && imc <= 32.3) {
			System.out.println(nome + "você está acima do peso ideal.");
		} else if (sexo == 'F') {
			System.out.println(nome + "você está obeso.");
		} else if (sexo == 'M' && imc < 20.7) {
			System.out.println(nome + "você está abaixo do peso.");
		} else if (sexo == 'M' && imc <= 26.4) {
			System.out.println(nome + "você está com peso ideal.");
		} else if (sexo == 'M' && imc <= 27.8) {
			System.out.println(nome + "você está um pouco acima do peso.");
		} else if (sexo == 'M' && imc <= 31.1) {
			System.out.println(nome + "você está acima do peso ideal.");
		} else if (sexo == 'M') {
			System.out.println(nome + "você está obeso.");
		}

	}
}
