package JavaTeste;

import java.util.Scanner;

public class DiasSemana {
	
	public static void main (String args[])
	{
		Scanner teclado = new Scanner (System.in);
		int dia = 0;
		System.out.println("Digite um número para encontrar seu dia: ");
		dia = teclado.nextInt();
		
		switch (dia) {
		
		case 1:
			System.out.print("Domingo");
		break;
		
		case 2:
			System.out.print("Segunda");
		break;
		
		case 3:
			System.out.print("Terça");
		break;
		
		case 4:
			System.out.print("Quarta");
		break;
		
		case 5:
			System.out.print("Quinta");
		break;
		
		case 6:
			System.out.print("Sexta");
		break;
		
		case 7:
			System.out.print("Sabado");
		break;
		
		default:
			System.out.print("Esse numero não foi encontrado!");
		break;
		}		
	}
}
