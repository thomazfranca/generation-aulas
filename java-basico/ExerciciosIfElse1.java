package Familia24;

import java.util.Scanner;

/*
 Faça um programa que receba três inteiros e diga qual deles é o maior.
 
 */


public class ExerciciosIfElse1 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEntre com o 1º valor: ");
		a = sc.nextInt();
		
		System.out.println("\nEntre com o 2º valor: ");
		b = sc.nextInt();
		
		System.out.println("\nEntre com o 3º valor: ");
		c = sc.nextInt();
		
		
		
		if(a>b)
		{
			System.out.println("\nO maior numero é: " + a );
		}
		else if(a<c)
		{
			System.out.println("\nO maior numero é: " + c);
		}
		else if(b>c)
		{
			System.out.println("\nO maior numero é: " + b);
		}
		else
		{
			System.out.println("\nO maior numero é: " + c);
		}
		
		
		sc.close();
	}
}
