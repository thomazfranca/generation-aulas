package Familia24;

import java.util.Scanner;

/*4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
calcule a seguinte express�o:

D = R + S/2, onde R = (A+B)�
				  S = (B+C)�
 */

public class Exercicio4 {
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);

		
		double a,b,c,r,s,quadrado1,quadrado2;
		
		System.out.println("\nEntre com o valor de A:");
		a = leia.nextDouble();
		
		System.out.println("\nEntre com o valor de B:");
		b = leia.nextDouble();
		
		System.out.println("\nEntre com o valor de C:");
		c = leia.nextDouble();
	
	

		r = (a+b);
		quadrado1 = Math.sqrt(r);
		s = (b+c);
		quadrado2 = Math.sqrt(s);
		
		System.out.println("\nO resultado de R �: " + quadrado1);
		System.out.println("\nO resultado de S �: " + quadrado2);
		
		leia.close();
		
		
	}
}
