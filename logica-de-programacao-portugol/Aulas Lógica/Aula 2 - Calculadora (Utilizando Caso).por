programa
{
	
	funcao inicio()
	{
		real num1, num2, res=0.0
		inteiro op

		escreva("\nDigite o primeiro número: ")
		leia(num1)
		escreva("\nDigite o segundo número número: ")
		leia(num2)

		escreva("\n\t\tMenu de opções da calculadora")
		escreva("\n1-Soma\n2-Diferença\n3-Multiplicação\n4-Divisão")
		escreva("\nDigite sua opção: ")
		leia(op)
	
		escolha (op)
		{
			caso 1:
			res = num1 + num2
			pare
			caso 2:
			res = num1 - num2
			pare
			caso 3:
			res = num1 * num2
			pare

			caso 4:
			res = num1 / num2
			pare
			caso contrario:
			escreva("\nOpção inválida!!!")			
		}
		escreva("\nResultado: ",res)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 62; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */