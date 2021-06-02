programa
{
	
	funcao inicio()
	{
		real indice
		
		escreva ("\nQual nivel de poluição? ")
		leia(indice)
		
		se (indice <=0.25)
		{
			escreva ("\nTudo ok")
		}
		senao se (indice >=0.25 e indice <=0.39)
		{
			escreva ("\nGrupo 1 suspender atividades")
		}
		senao se (indice >=0.4 e indice <=0.49)
		{
			escreva ("\nGrupo 1 e 2 suspender atividades")
		}
		senao 
		{
			escreva ("\nGrupo 1 , 2 e 3 suspender atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 105; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */