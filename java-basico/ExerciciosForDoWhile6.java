package Familia24;

import java.util.Scanner;

/*
 * 6. Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).*/

public class ExerciciosForDoWhile6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, cont=0, soma=0, media;
		
		do {
			System.out.println("Entre com o valor: ");
			num = sc.nextInt();
			
			if(num%3==0 && num!=0) {
				soma += num;
				cont++;
			}
		}while(num!=0);
		media = soma/cont;
		
		System.out.println("Média dos números múltiplos de 3: "+media);
		sc.close();
	}
	
}