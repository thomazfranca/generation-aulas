package Familia24;

import java.util.Scanner;

/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é:    _____________
 						    V(x2-x1)²+(y2-y1)²		
 
 */

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		double x1,x2,y1,y2,d1,d2,dquadrado, quadrado1, quadrado2,dfinal;
		
		System.out.println("\nEntre com o valor de x1:");
		x1 = leia.nextFloat();
		System.out.println("\nEntre com o valor de x2:");
		x2 = leia.nextFloat();
		System.out.println("\nEntre com o valor de y1:");
		y1 = leia.nextFloat();
		System.out.println("\nEntre com o valor de y2:");
		y2 = leia.nextFloat();
		
		

		d1 = (x2-x1);
		quadrado1 = Math.pow(d1, 2.0);
		d2 = (y2-y1);
		quadrado2 = Math.pow(d2, 2.0);
		dquadrado = quadrado1 + quadrado2;
		dfinal = Math.sqrt(dquadrado);
		
		
		
		System.out.println("O valor ao quadrado é: "+ dfinal);
		
		
		
		leia.close();
		
		
		
	}
}
