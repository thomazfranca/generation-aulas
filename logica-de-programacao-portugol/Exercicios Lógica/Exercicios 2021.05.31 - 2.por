programa
{
	/*
2 - Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
	
	
	*/
	funcao inicio()
	{

	inteiro valor [10], maiorvalor=0,somavalor=0,media,x
	
	para(x=0;x<10;x++)
		{
			escreva("\nDigite o valor do ",(x+1)," º lançamento: ")
			leia(valor[x])
			somavalor = somavalor + valor[x]
			
			limpa()
			se(valor[x]<= 6 e valor[x]>0)
			{
				maiorvalor = valor[x]
			}
		}	
		
		para(x=0;x<10;x++)
		{
			escreva("\nOs valores anotados nas posições são,: [",(x+1),"] = ", valor[x])
			somavalor = somavalor + valor[x]
			
		}
		media = somavalor/10
		escreva("\nA media dos valores é de: ",media)	
		escreva("\nO maior valor é: ",maiorvalor)
	}
}

	

		

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */