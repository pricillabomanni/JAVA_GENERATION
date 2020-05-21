package JavaTeste;

import java.util.Scanner;

public class SomaParSomaImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int i, somarPar = 0, somarImpar = 0, valor; 
		System.out.println("Digite um numero: ");		
		valor = teclado.nextInt();		
		
		for(i=0; i <= valor; i++){
			
			if (i % 2 == 0) {
				somarPar = somarPar + i;
			}
			else {
				somarImpar = somarImpar + i;
			}
		}
		
		System.out.println("Soma dos numeros pares: " + somarPar);
		System.out.println("Soma dos numeros impares: " + somarImpar);
	}
	
}
