package Familia24;
/*1 6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informa��es deste objeto no
console.*/
public class ContaBancaria {

	private String nome;
	private String telefone;
	private String endere�o;
	private int idade;

	public ContaBancaria(String nome, String telefone, String endere�o, int idade) {

		this.nome = nome;
		this.telefone = telefone;
		this.endere�o = endere�o;
		this.idade = idade;
	}

	public void imprimiCliente() {
		System.out.println(
				"\nCliente: " + nome + "\nTelefone: " + telefone + "\nReside em: " + endere�o + "\nIdade: " + idade);
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
