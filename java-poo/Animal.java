package Familia24;

public abstract class Animal {

		// Atributo
	
		private String nome;
		private int idade;
		
		// Construtor
		
		public Animal(String nome, int idade) 
		{
			super();
			this.nome = nome;
			this.idade = idade;
			
		}
		
		//metodo abstrato

		abstract public void somAnimal();
		abstract public void andaAnimal();
						
		
		// Get
		public String getNome() {
			return nome;
		}
		// Set
		public void setNome(String nome) {
			this.nome = nome;
		}
		// Get
		public int getIdade() {
			return idade;
		}
		// Set
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public void imprimiAnimal() {
			System.out.println("\nNome animal: " + nome + "\nIdade animal: "+idade);
			
		}
			
}
