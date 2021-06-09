package Familia24;

public class Cavalo extends Animal {
	
	private String raca;
	private String tipoDeUso;
	
	public Cavalo(String nome, int idade,String raca, String tipoDeUso) {
		super(nome, idade);
		this.raca = raca;
		this.tipoDeUso = tipoDeUso;
	}
	
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do cavalo: "+getNome()+"\nIdade: "+getIdade()+"\nRaça: "+raca+"\nTipo de uso: "+tipoDeUso);
	}
	
}
