package Familia24;

import java.util.Scanner;

/*
 
 7. Um sistema de equações lineares do tipo:
 
 ax+by = c
 dx+ey = f, pode ser resolvido segundo mostrado abaixo :
 
 x = ce-bf       y = af-cd
 	------- 		--------
 	 ae-bd			ae-bd

Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.

*/

public class Exercicio7 {
	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);

		double a,b,c,d,e,f,x,y;
		
		
		System.out.println("\nEntre com o valor de A:");
		a = leia.nextDouble();
	
		System.out.println("\nEntre com o valor de B:");
		b = leia.nextDouble();
		
		System.out.println("\nEntre com o valor de C:");
		c = leia.nextDouble();
		
		System.out.println("\nEntre com o valor de D:");
		d = leia.nextDouble();
		
		System.out.println("\nEntre com o valor de E:");
		e = leia.nextDouble();
		
		System.out.println("\nEntre com o valor de F:");
		f = leia.nextDouble();
		
				

		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.println("\nO resultado de X é: "+ x);
		System.out.println("\nO resultado de X é: "+ y);
		
		leia.close();	
		
	}
}
