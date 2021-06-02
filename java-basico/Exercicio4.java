package Familia24;

import java.util.Scanner;

/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:

D = R + S/2, onde R = (A+B)²
				  S = (B+C)²
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
		
		System.out.println("\nO resultado de R é: " + quadrado1);
		System.out.println("\nO resultado de S é: " + quadrado2);
		
		leia.close();
		
		
	}
}
