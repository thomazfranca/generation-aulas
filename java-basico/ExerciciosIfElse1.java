package Familia24;

import java.util.Scanner;

/*
 Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 
 */


public class ExerciciosIfElse1 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEntre com o 1� valor: ");
		a = sc.nextInt();
		
		System.out.println("\nEntre com o 2� valor: ");
		b = sc.nextInt();
		
		System.out.println("\nEntre com o 3� valor: ");
		c = sc.nextInt();
		
		
		
		if(a>b)
		{
			System.out.println("\nO maior numero �: " + a );
		}
		else if(a<c)
		{
			System.out.println("\nO maior numero �: " + c);
		}
		else if(b>c)
		{
			System.out.println("\nO maior numero �: " + b);
		}
		else
		{
			System.out.println("\nO maior numero �: " + c);
		}
		
		
		sc.close();
	}
}
