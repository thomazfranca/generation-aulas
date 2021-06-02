programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro idade = 21
		real altura = 1.55, nota1, nota2, nota3, media
		cadeia nome = "Milly"

		escreva("\nMeu nome é: ",nome)
		escreva("\nMinha idade é de: ", idade, " anos")
		escreva("\nMinha altura é: ",altura)

		escreva("\n=========================================")

		escreva("\nEntre com a primeira nota: ")
		leia(nota1)
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)
		escreva("\nEntre com a terceira nota: ")
		leia(nota3)

		media = (nota1 + nota2 + nota3) / 3 

		escreva("\nSua média é: ",mat.arredondar(media,2))

		real minharaiz,minhapotencia

		minharaiz = mat.raiz(nota3, 2.0)
		escreva("\nRaiz da nota 3 é: ",minharaiz)
		minhapotencia = mat.potencia(nota2, 3.0)
		escreva("\nPotência da nota 2 é: ",minhapotencia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 802; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */