programa
{
	
	funcao inicio()
	{
		real horasTrabalhadas, totalHoras, salarioTotal, salario, horasExtras

		escreva("\nQual a quantidade de horas trabalhadas? ")
		leia(horasTrabalhadas)

		horasExtras =  horasTrabalhadas - 50 
	
		se (horasTrabalhadas > 50)
		{
			escreva("\nValor de horas extras: R$ ", horasExtras*20, "\nValor total Salario + Horas Extras é: R$ ",(horasExtras*20) + (horasTrabalhadas*10))
		}
		senao
		{
			escreva("\nTotal de salario hora é de: R$ ",horasTrabalhadas*10)
		}





		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 498; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */