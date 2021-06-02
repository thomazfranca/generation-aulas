programa
{
    
    funcao inicio()
    {
        
         
         inteiro N, Par

         escreva("\nEscreva um número inteiro ")
         leia(N)
         limpa()

         Par = N % 2

        se (N > 0){

            escreva("\nPositivo\n")
                    
        } senao {
            
            escreva("\nNegativo\n")
                    
        }
        
         se(Par == 0) {

             escreva("\nEsse número é par \n\n", N, "\n")
         
         } senao {
             
             escreva("\nEsse número é impar \n\n", N, "\n")
         
         }

         
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */