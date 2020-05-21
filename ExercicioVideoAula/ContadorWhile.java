package JavaTeste;

import java.util.Scanner;

public class ContadorWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um numero inicial: ");
		int numInicial = teclado.nextInt();
		System.out.println("Digite um numero final: ");
		int numFinal = teclado.nextInt();
		int numAtual = numInicial;
		
		while (numAtual <= numFinal)
		{
			System.out.println(numAtual);
			numAtual++;
		}
		
	}
}
