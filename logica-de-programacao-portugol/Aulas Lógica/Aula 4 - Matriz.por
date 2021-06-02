programa
{
	
	funcao inicio()
	{
		inteiro numeros [2][5],somapar=0,quantpar=0,linha,coluna
		real mediapar

		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<5;coluna++)
			{

				escreva("\nEntre com um número para a linha ",linha, ": coluna ",coluna,": ")
				leia(numeros[linha][coluna])

				se(numeros[linha][coluna]%2==0)
				{
					somapar = somapar+numeros[linha][coluna]
					quantpar++
				}
			}
		}
		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<5;coluna++)
			{
				escreva("\nValor linha ",linha,": e coluna ",coluna,":",numeros[linha][coluna])
			}
	
		}
		mediapar = somapar / quantpar
		quantpar++
		escreva("\nMédia Par: ", mediapar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 675; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7}-{somapar, 6, 25, 7}-{quantpar, 6, 35, 8}-{mediapar, 7, 7, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */