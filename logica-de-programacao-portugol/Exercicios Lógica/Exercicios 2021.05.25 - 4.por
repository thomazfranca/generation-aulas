programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real a,b,c,r,s,quadrado1,quadrado2
		escreva("\nEntre com o valor de A:")
		leia(a)
		escreva("\nEntre com o valor de B:")
		leia(b)
		escreva("\nEntre com o valor de C:")
		leia(c)
	
	

		r = (a+b)
		quadrado1 = mat.potencia(r, 2.0)
		s = (b+c)
		quadrado2 = mat.potencia(s, 2.0)
		
		escreva("\nO resultado de R é: ", quadrado1)
		escreva("\nO resultado de S é: ", quadrado2)
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */