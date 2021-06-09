package Familia24;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome,String endereco,String cpf,int telefone,int idade,
			double valorCredito,double valorDivida)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCpf()+
				"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndere�o: "+getEndereco()+
				"\nValor cr�dito: "+valorCredito+"\nValor divida: "+valorDivida);
		
	}
	
	public void validarCpf()
	{
		if(getCpf().length()!=11)
		{
			System.out.println("\n--CPF Inv�lido--");
		}
		else
		{
			System.out.println("\n--CPF V�lido--");
		}
	}
	
	public void obterSaldo()
	{
		double diferencacd = valorCredito - valorDivida;
		System.out.println("\nO saldo referente ao fornecedor � igual a: "+diferencacd);
	}
	

}



