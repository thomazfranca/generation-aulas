programa
{
/*	
4-Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.

*/
	
	funcao inicio()
	{
		inteiro numeros [3][3],somageral=0,somadiagonal=0,linha,coluna
				
		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{

				escreva("\nEntre com um número para a linha ",linha+1, ": coluna ",coluna+1,": ")
				leia(numeros[linha][coluna])

				somageral = somageral + numeros[linha][coluna]

				se(linha==coluna)
				{
					somadiagonal = somadiagonal + numeros[linha][coluna]
				}
				
				
			}
		
		}
		escreva("\nA soma da matriz é de: ",somageral,"\n")
		escreva("\nA soma da diagonal é de: ",somadiagonal)
	}
}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 658; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */