programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real pesoOriginal, pesoExcesso = 0.0, valorDaMulta = 4.0

		escreva("\nQuantos KG de tomate? ")
		leia(pesoOriginal)

		pesoExcesso = pesoOriginal-50
		
		
		se (pesoOriginal>50)
		{
			escreva("\nO valor que você deve pagar de multa pelo execesso de peso é de: R$ ",pesoExcesso*valorDaMulta)
		}
		senao se (pesoOriginal<=50)
		{
			escreva("\nVocê não ultrapassou o limite de peso, peso dos tomates ", pesoOriginal, "\nExcesso ",pesoExcesso-pesoExcesso, "\nValor da Multa R$ ",valorDaMulta)
		}
		


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */