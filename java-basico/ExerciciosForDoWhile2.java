package Familia24;

import java.util.Scanner;

/*
 * 2. Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */

public class ExerciciosForDoWhile2 {

    public static void main(String[] argss){
		Scanner sc = new Scanner(System.in);
		int num, contPar = 0, contImpar = 0;

		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Digite o " + i + "� n�mero");
			num = sc.nextInt();

			if (num % 2 == 0)
			{
				contPar++;
			}

			 if(num % 2 == 1)
			 { 
				 contImpar++; 
			 }
			 sc.close();
		}

		System.out.println("Foram digitados " + contPar + " n�meros pares \n");
		System.out.println("E " + contImpar + " n�meros �mpares");

	}
}
