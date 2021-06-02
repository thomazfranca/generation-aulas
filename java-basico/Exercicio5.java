package Familia24;

import java.util.Scanner;

/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
 */

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);

		
		double n1,n2,n3,media;
		
		
		System.out.println("\nEntre com a primera nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();
	

	
		media = ((n1*2) + (n2*3) + (n3*5)) / (2+3+5);

		System.out.println("\nSua média é: "+ media);
		
		System.out.printf("\nMédia arredondada: %2.2f",media);
				
		
		leia.close();
		
		
		
	}

}
