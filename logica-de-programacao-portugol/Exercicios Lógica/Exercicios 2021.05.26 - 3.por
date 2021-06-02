programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro num1, num2, num3, num4

		escreva("1 - Digite um numero inteiro: ")
		leia(num1)
		escreva("2 - Digite um numero inteiro: ")
		leia(num2)
		escreva("3 - Digite um numero inteiro: ")
		leia(num3)
		escreva("4 - Digite um numero inteiro: ")
		leia(num4)

		num1 = mat.potencia(num1, 2.0)
		num2 = mat.potencia(num2, 2.0)
		num3 = mat.potencia(num3, 2.0)
		num4 = mat.potencia(num4, 2.0)

		se(num3 >=1000)
		{
			escreva("\nO valor de 3 é: ", num3)
		}
		senao
		{
			escreva("\nO valor de 1 é: ", num1, "\nO valor de 2 é: ",num2, "\nO valor de 3 é: ",num3, "\nO valor de 4 é: ",num4)
		}
		
	}
}
		
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 667; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */