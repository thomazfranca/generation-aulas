package Familia24;

public class Cavalo extends Animal {
	
	private String raca;
	private String tipoDeUso;
	
	public Cavalo(String nome, int idade,String raca, String tipoDeUso) {
		super(nome, idade);
		this.raca = raca;
		this.tipoDeUso = tipoDeUso;
	}
	
	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public String getTipoDeUso() {
		return tipoDeUso;
	}


	public void setTipoDeUso(String tipoDeUso) {
		this.tipoDeUso = tipoDeUso;
	}
	
	public void imprimirCavalo()
	{
		
		System.out.println("\nNome do cavalo: "+getNome()+"\nIdade: "+getIdade()+
				"\nRaça: "+raca+"\nTipo de uso: "+tipoDeUso);
	}

	@Override
	public void somAnimal() {
		// TODO Auto-generated method stub
		System.out.println("\nO cavalo faz riririririrr");
	}

	@Override
	public void andaAnimal() {
		// TODO Auto-generated method stub
		System.out.println("\nO cavalo trota");
	}


}
