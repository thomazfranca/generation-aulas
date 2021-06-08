package Familia24;

/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/


public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario ("Thomaz França","Desenvolvedor JAVA",30,5000,0001);
				func1.imprimiFuncionario();
			
				System.out.println("**********************************");
		
		Funcionario func2 = new Funcionario ("Otavio Melo","Desenvolvedor J",19,3000,0002);
				func2.imprimiFuncionario();
			
				System.out.println("**********************************");
	
		Funcionario func3 = new Funcionario ("Paulo Rogerio","Scrum Master",53,6000,0003);
				func3.imprimiFuncionario();
		
		System.out.println("\n***Atualização Salarial***");
				func1.setSalario(6000);
				func2.setSalario(4000);
				func3.setSalario(7500);
				func1.imprimiFuncionario();
				func2.imprimiFuncionario();
				func3.imprimiFuncionario();
	}
	
	
}