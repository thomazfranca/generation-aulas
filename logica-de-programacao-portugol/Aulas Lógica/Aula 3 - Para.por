programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real n1,n2,n3,media,somamedia=0.0,mediageral,maiormedia=0.0
		inteiro x,num
		cadeia nome
		escreva("\nEntre com o número total de alunes: ")
		leia(num)
		para(x=1;x<=num;x++) //x++ é exatamente igual a x = x + 1
		{
			escreva("\nEntre com o nome do alune: ")
			leia(nome)
			escreva("\nEntre com a primeira nota: ")
			leia(n1)
			escreva("\nEntre com a segunda nota: ")
			leia(n2)
			escreva("\nEntre com a terceira nota: ")
			leia(n3)

			media = (n1+n2+n3)/3 //7.5 8.5 5.5 4.5 8.2
			limpa()
			escreva("\nMédia do aluno(a) ",nome," foi de: ",mat.arredondar(media,2))
			
			se(maiormedia<media)
			{
				maiormedia = media
			}

			somamedia = somamedia + media
			
		}
		mediageral = somamedia / num
		limpa()
		escreva("\nMédia geral da turma: ",mat.arredondar(mediageral,2))
		escreva("\nMaior média da turma: ",maiormedia)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */