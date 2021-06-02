programa
{

	/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.*/
	inclua biblioteca Matematica
-->mat
	
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
 * @POSICAO-CURSOR = 656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */