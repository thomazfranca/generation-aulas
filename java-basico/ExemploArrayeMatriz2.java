package Familia24;

import java.util.Scanner;

public class ExemploArrayeMatriz2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int linha=3,coluna=3;
		int[][] numeros = new int[linha][coluna];
		int somapar=0,somaimpar = 0,somaqualquercoisa=0,l,c;
		
		Scanner leia = new Scanner(System.in);
		for(l=0;l<linha;l++)
		{
			for(c=0;c<coluna;c++)
			{
				System.out.println("\nEntre com um n�mero: ");
				numeros[l][c] = leia.nextInt();
				
				if(l%2==0 && c%2==0)
				{
					somapar = somapar + numeros[l][c];
				}
				else if(l%2==1 && c%2==1)
				{
					somaimpar = somaimpar + numeros[l][c];
				}
				else
				{
					somaqualquercoisa += numeros[l][c];		
				}
				
			}
		}
		/*
		System.out.println("\nentre com a linha que deseja colocar um valor: ");
		l = leia.nextInt();//1
		System.out.println("\nentre com a coluna que deseja colocar um valor: ");
		c = leia.nextInt();//0
		System.out.println("\nentre com a linha que deseja colocar um valor: ");
		valor = leia.nextInt();
		numeros[l][c]=valor;
		*/
		System.out.println("\nSomat�rio dos pares: "+somapar);
		System.out.println("\nSomat�rio dos �mpares: "+somaimpar);
		System.out.println("\nSomat�rio de qualquer coisa: "+somaqualquercoisa);
		leia.close();
	}


}
