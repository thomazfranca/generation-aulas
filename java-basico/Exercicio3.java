package Familia24;

import java.util.Scanner;


/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class Exercicio3 {
	public static void main(String[] args) {
			
	double hora, minutos, segundos, totalSegundos;
	Scanner leia = new Scanner (System.in);
	
	System.out.println("\nDigite o valor em segundos para verificar a duração do evento: ");
	totalSegundos = leia.nextFloat();
		
	hora = totalSegundos/3600;
	minutos = (totalSegundos%3600)/60;
	segundos = (totalSegundos%3600)%60;
	
	
	System.out.println("Total de horas é: "+ hora +" hora "+ minutos + " minutos " + segundos + " segundos");
	
	leia.close();
		
	}
}
