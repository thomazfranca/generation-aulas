package Familia24;

public class Preguica extends Animal {
	
	private String nacionalidade;
	private String cor;
	
	public Preguica(String nome, int idade,String nacionalidade, String cor) {
		super(nome, idade);
		this.nacionalidade = nacionalidade;
		this.cor = cor;
	}
	
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do cavalo: "+getNome()+"\nIdade: "+getIdade()+"\nNacionalidade: "+nacionalidade+"\nCor: "+cor);
	}
	

}
