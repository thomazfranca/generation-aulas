programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
			real x1,x2,y1,y2,d1,d2,dfinal,dquadrado, quadrado1, quadrado2
		
				
		escreva("\nEntre com o valor de x1:")
		leia(x1)
		escreva("\nEntre com o valor de x1:")
		leia(x2)
		escreva("\nEntre com o valor de y1:")
		leia(y1)
		escreva("\nEntre com o valor de y2:")
		leia(y2)
	
		
		d1 = (x2-x1)
		quadrado1 = mat.potencia(d1, 2.0)
		d2 = (y2-y1)
		quadrado2 = mat.potencia(d2, 2.0)
		dquadrado = quadrado1 + quadrado2
		dfinal = mat.raiz(dquadrado, 2.0)

				
		escreva("\nA distancia entre os pontos é: ", dfinal)
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */