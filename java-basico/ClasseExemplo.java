package Familia24;

import java.util.Scanner;

public class ClasseExemplo {

	public static void main(String[] args) {
		
		double n1,n2,n3,media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a primera nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("\nMédia aritmética: " + media);
		System.out.printf("\nMédia arredondada: %2.2f",media);
		
		n1 = Math.sqrt(Math.sqrt(n2)); 
		n3 = Math.pow(n1, 3);
		media = n1 % n2;
		
		leia.close();
	
	
	}
}