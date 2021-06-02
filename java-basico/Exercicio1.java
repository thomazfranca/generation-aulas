package Familia24;

import java.util.Scanner;

/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/


public class Exercicio1 {
	public static void main(String[] args) {

		double idade,meses,dias,diasSolicitados;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a idade em anos: ");
		idade = leia.nextFloat();
		System.out.println("\nDigite a quantidade de meses: ");
		meses = leia.nextFloat();
		System.out.println("\ndigite a quantidade de dias: ");
		dias = leia.nextFloat();
		
		diasSolicitados = (idade*365) + (meses*30) + dias;
		System.out.println("Você tem: " +diasSolicitados + " de dias vividos" );
		
		leia.close();
		
		
	}
}
