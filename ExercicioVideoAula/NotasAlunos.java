package JavaTeste;

import java.util.Scanner;

public class NotasAlunos {
	
	public static void main (String args[])
	{
		
		System.out.print("Digite a sua nota: ");
		Scanner nt = new Scanner (System.in);
		double nota = nt.nextDouble();
		if (nota >= 7)
			System.out.print("Voc� foi aprovado!");
		else
			System.out.print("Voc� foi reprovado, estude mais!");
	}	

}
