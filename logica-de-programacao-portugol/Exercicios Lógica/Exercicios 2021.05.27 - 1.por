programa
{
	
/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
*/

	
	funcao inicio()
	{
		real salario, mediafilhos=0.0, mediasalario=0.0,porcento=0.0, maiorsalario=0.0
		inteiro x,filhos

		
		para (x=1;x<3
		;x++)
		
			escreva("\nQual a faixa salarial da familia? ")
			leia(salario)
			escreva("\nQuantos filhos a familia tem? ")
			leia(filhos)

			se(maiorsalario<salario)
			{
				maiorsalario=salario
			}
			mediafilhos = mediafilhos+filhos
			mediasalario = mediasalario+salario

			se(salario<=100)
			{
				porcento++
			}
			limpa()
			

			
		}
		mediasalario = mediasalario/20
		mediafilhos = mediafilhos/20
		porcento = (porcento*100)/20
		
		
		escreva("\nQual a media do salario da população? ",mediasalario)		
		escreva("\nQual o maior salario? ",maiorsalario)
		escreva("\nQual a media de filhos? ",mediafilhos)
		escreva("\nQual a porcentagem de pessoas com salario até $100,0? ",porcento)
	




		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 657; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */