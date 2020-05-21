package JavaTeste;

import java.util.Scanner;

public class IdadeCachorro {
	public static void main(String args[])
	{
		System.out.println("Entre com a idade do seu cachorro: ");
		Scanner in = new Scanner (System.in);
		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro*7;
		System.out.println("Seu cachorro tem: " + idadeCachorro + " ano(s)");
		
	}
}
