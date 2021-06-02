package Familia24;

import java.util.Scanner;

/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

public class Exercicio2 {
	public static void main(String[] args) {
		
		double ano, mes, dia, dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite uma quantidade de dias para calcular: ");
		dias = leia.nextFloat();

		ano = dias/365;
		mes = (dias%365)/30;
		dia = (dias%365)%30;
		
		System.out.println("A idade em anos, meses e dias é " + ano + " anos " + mes + " meses " + dia + " dias");
		
		
		leia.close();


	}
}
