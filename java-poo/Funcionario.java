package Familia24;
/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/


public class Funcionario {

	private String nome;
	private String cargo;
	private int idade;
	private float salario;
	private int matricula;

	public Funcionario(String nome,String cargo, int idade, float salario, int matricula) {

		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		this.matricula = matricula;
	}

	public void imprimiFuncionario() {
		System.out.println("\nColaborador: " + nome + "\nCargo: "+ cargo +
				"\nIdade: " + idade + "\nSalario: R$ " 
						+ salario + "\nMatricula: " + matricula);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}