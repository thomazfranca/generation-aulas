programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro cont=0, num
		real soma=0.0

	escreva("Digite um número positivo para continuar: ")
		leia(num)
		enquanto(num > 0){
			escreva("\nEntre com o seu valor: ")
			leia(num)
			soma = soma + num
			cont++
			limpa()
			escreva("Digite um número positivo para continuar: ")
			leia(num)
		}

		escreva("\nA soma total foi: ", mat.arredondar(soma, 2))
		escreva("\nA média é: ", mat.arredondar(soma/(cont*1.0), 2))
		escreva("\nA quantidade de valores lidos foi: ", cont)
		



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 552; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */