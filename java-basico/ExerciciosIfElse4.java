package Familia24;

import java.util.Scanner;

/*
 4. Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 
 
 

 */



public class ExerciciosIfElse4 {
	public static void main(String[] args) {

		int numero;
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nLeia o n�mero: ");
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
