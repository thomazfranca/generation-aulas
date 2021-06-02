programa
{
	
	funcao inicio()
	{

	inteiro ano, mes, dia, dias
	
	
	escreva ("Digite uma quantidade de dias para calcular: ")
	leia(dias)

	ano = dias/365
	mes = (dias%365)/30
	dia = (dias%365)%30

	escreva("A idade em anos, meses e dias é ", ano," anos ", mes," meses ", dia, " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */