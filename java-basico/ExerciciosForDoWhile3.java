package Familia24;

import java.util.Scanner;

/*
 * 3. Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */

public class ExerciciosForDoWhile3 {

    public static void main(String[] argss){
		
    	Scanner sc = new Scanner(System.in);
		
    	int idade=0, cont21=0, cont50=0;
			
    	   	
		while(idade!=-99)
		{
			
			System.out.println("\nEntre com uma idade: ");
			idade = sc.nextInt();
						

			if(idade < 21 && idade > 0) {
				cont21++;
			}
			if(idade > 50) {
				cont50++;
			}
	
		}
		System.out.println("Quantidade de idades menores de 21 anos - "+cont21);
		System.out.println("Quantidade de idades maiores de 50 anos - "+cont50);
		sc.close();
    }
}