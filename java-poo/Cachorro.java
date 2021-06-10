package Familia24;

public class Cachorro extends Animal {
	//atributos caracteristos do tipo de animal
	public String raca;
	public String cor;
	public String porte;
	// Construtor
	public Cachorro(String nome, int idade,String raca,String cor,String porte) {
		super(nome, idade);
		this.raca = raca;
		this.cor = cor;
		this.porte = porte;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	

	public void imprimiCachorro()
	{
		
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade: "+getIdade()+"\nRaça: "+raca+
				"\nCor: "+cor+"\nTipo de orte: "+porte);
	}

	
	//sobrescrevendo os metodos da classe mãe abstrada;
	
	
	@Override
	public void somAnimal() {
		// TODO Auto-generated method stub
		System.out.println("\nO som do animal: Au! Au! Au......!");

	}

	@Override
	public void andaAnimal() {
		// TODO Auto-generated method stub
		System.out.println("\nCorre muito rapido!");

	}
	
}
