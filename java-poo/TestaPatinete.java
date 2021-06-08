package Familia24;

/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


public class TestaPatinete {

	public static void main(String[] args) {

		Patinete pat1 = new Patinete ("Ultra","Azul","Beses",53);
			pat1.imprimiPatinete();
		System.out.println("**********************************");

		Patinete pat2 = new Patinete("XMAX", "Amarelo", "Caloi", 20);
			pat2.imprimiPatinete();
		System.out.println("**********************************");

		Patinete pat3 = new Patinete("Super", "Verde Limão", "Supra", 30);
		pat3.imprimiPatinete();
	}

}

/*		private String modelo;
	private String cor;
	private String marca;
	private int velocidadeMedia;*/
