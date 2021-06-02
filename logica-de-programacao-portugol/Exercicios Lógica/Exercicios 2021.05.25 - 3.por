programa
{
	
	funcao inicio()
	{

	inteiro hora, minutos, segundos, totalSegundos
	
	
	escreva ("\nDigite o valor em segundos para verificar a duração do evento: ")
	leia(totalSegundos)

	hora = totalSegundos/3600 
	minutos = (totalSegundos%3600)/60
	segundos = (totalSegundos%3600)%60

	escreva("Total de horas é: ", hora," hora ", minutos, " minutos ", segundos, " segundos")


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 285; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */