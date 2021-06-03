package Familia24;

import java.util.Scanner;

/*
 4. Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 
 
 

 */



public class ExerciciosIfElse4 {
	public static void main(String[] args) {

		int numero;
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nLeia o número: ");
		numero = sc.nextInt();
		
		if(numero % 2 == 0) 
		{
			resultado = Math.sqrt(numero);
		}
		else
		{
			resultado = Math.pow(numero, 2);
		}
		System.out.println("\nNumero digitado: "+ numero+"\nResultado: " + resultado);
	
	sc.close();
	}
}
