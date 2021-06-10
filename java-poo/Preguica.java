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
		
		System.out.println("\nNome da preguiça: "+getNome()+"\nIdade: "+getIdade()+
				"\nNacionalidade: "+nacionalidade+"\nCor: "+cor);
	}


	@Override
	public void somAnimal() {
		// TODO Auto-generated method stub
		System.out.println("\nA preguiça faz grrrrrr");

	}


	@Override
	public void andaAnimal() {
		// TODO Auto-generated method stub
		System.out.println("\nA não corre! Ela só escala arvores");
	}
	

}
