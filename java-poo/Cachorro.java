package Familia24;

public class Cachorro extends Animal {
	
	private String raca;
	private String cor;
	
	public Cachorro(String nome, int idade,String raca,String cor) {
		super(nome, idade);
		this.raca = raca;
		this.cor = cor;
		
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade: "+getIdade()+"\nRaça: "+raca+"\nCor: "+cor);
	}
	
	
}
