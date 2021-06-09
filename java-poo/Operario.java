package Familia24;

public class Operario extends Pessoa {
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome,String endereco,String cpf,int telefone,int idade,
			double valorProducao,double comissao)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCpf()+
				"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndere�o: "+getEndereco()+
				"\nValor monet�rio total dos artigos produzidos por: "+getNome()+": "+
				valorProducao+"\nPorcentagem(sem %) da comiss�o deste artigo: "+comissao);
		
	}
	
	public void calcularValorArtigo()
	{
		double valor_total = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\nO valor total a ser recebido pelo oper�rio: "+getNome()+
				" � igual a: "+valor_total);
	}
}



