package Familia24;

public class Preguica extends Animal {
	
	private String nacionalidade;
	private String cor;
	
	public Preguica(String nome, int idade,String nacionalidade, String cor) {
		super(nome, idade);
		this.nacionalidade = nacionalidade;
		this.cor = cor;
	}
	
	
	public void imprimirPreguica()
	{
		
		System.out.println("\nNome da pregui�a: "+getNome()+"\nIdade: "+getIdade()+
				"\nNacionalidade: "+nacionalidade+"\nCor: "+cor);
	}


	@Override
	public void somAnimal() {
		// TODO Auto-generated method stub
		System.out.println("\nA pregui�a faz grrrrrr");

	}


	@Override
	public void andaAnimal() {
		// TODO Auto-generated method stub
		System.out.println("\nA n�o corre! Ela s� escala arvores");
	}
	

}
