programa
{

/*
1-Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/


funcao inicio()
	{

		real valor [5], maiorvalor=0.0
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("\nDigite o ",(x+1)," º valor: ")
			leia(valor[x])
			limpa()
			se(valor[x]>maiorvalor)
			{
				maiorvalor = valor[x]
			}
		}	
		
		para(x=0;x<5;x++)
		{
			escreva("\nNota [",(x+1),"] = ", valor[x])
			
		}
			
			
		escreva("\nO maior valor é: ",maiorvalor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */