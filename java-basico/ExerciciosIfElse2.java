package Familia24;

import java.util.Scanner;

/*
 2- Faça um programa que entre com três números e 
 coloque em ordem crescente.
 
 
 
 */



public class ExerciciosIfElse2 {
	public static void main(String[] args) {

		int num1, num2, num3;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nFaça um programa que entre com três números e \r\n"
				+ "coloque em ordem crescente:");
		
		System.out.println("\nEntre com o 1º valor: ");
		num1 = sc.nextInt();
		
		System.out.println("\nEntre com o 2º valor: ");
		num2 = sc.nextInt();
		
		System.out.println("\nEntre com o 3º valor: ");
		num3 = sc.nextInt();
		
		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println(num1 + "\n" + num2 + "\n" + num3);
			} else if (num1 < num3) {
				System.out.println(num1 + "\n" + num3 + "\n" + num2);
			} else {
				System.out.println(num3 + "\n" + num1 + "\n" + num2);
			}
		} else if (num2 < num3) {
			if (num1 < num3) {
				System.out.println(num2 + "\n" + num1 + "\n" + num3);
			} else {
				System.out.println(num2 + "\n" + num3 + "\n" + num1);
			}
		} else {
			System.out.println(num3 + "\n" + num2 + "\n" + num1);
		}
		
		sc.close();
	}
}
