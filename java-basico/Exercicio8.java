package Familia24;

import java.util.Scanner;

/* 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
*/



public class Exercicio8 {
	public static void main(String[] args) {
		
			
			Scanner leia = new Scanner (System.in);

			double custoDeFabrica, custoConsumidor;
			
			System.out.println("\nEntre com o custo de f�brica: ");
			custoDeFabrica = leia.nextDouble();
			
			custoConsumidor = custoDeFabrica + (custoDeFabrica+0.73);
			
			System.out.println ("\nCusdo ao consumidor: " + custoConsumidor);

			leia.close();
		
	}
}
