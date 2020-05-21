package JavaTeste;

import java.util.Scanner;

public class TiposDeForComArray {
	
 public static void main(String[] args) {
	 
	 Scanner teclado = new Scanner (System.in);
	 
	 int[] arrayUm = { 12, 15, 200, 40, 60, 4, 5, 3, 7, 56};
	 int[] arrayDois = {2, 1, 5, 6, 15, 80, 100};
	 
	 float[] nota = new float[5];
	 
	 if(arrayDois.length >8) {
		 System.out.println("O tamanho do arrayDois é maior que 8");
	 }else {
		 System.out.println("O tamanho do arrayDois é menor que 8");
	 }
	 System.out.println("\n Tamanho do arrayDois = " + arrayDois.length);	
	 
	 //utilização do for-each
	 
	 String[] cars = {"Volvo", "Ford", "Ferrari", "BMW"};
	 
	 for( String i: cars) {
		 System.out.println(i);
	 }
	 
	 for(int i = 0; i < 5; i++) {
		 System.out.println("Entre com uma nota: ");
		 nota[i] = teclado.nextFloat();		 
	 }
	 
	 for(int i = 0; i < 5; i++) {
		 System.out.println("Nota " + (i+1) + " = " + nota[i]);
	 }	 
	 
	}
}
