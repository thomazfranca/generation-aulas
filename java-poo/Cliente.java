package Familia24;
/*1 - Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Cliente {

	private String nome;
	private String telefone;
	private String endereço;
	private int idade;

	public Cliente(String nome, String telefone, String endereço, int idade) {

		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
		this.idade = idade;
	}

	public void imprimiCliente() {
		System.out.println(
				"\nCliente: " + nome + "\nTelefone: " + telefone + "\nReside em: " + endereço + "\nIdade: " + idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
