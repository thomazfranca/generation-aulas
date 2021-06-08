package Familia24;

public class TestaAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instanciando um objeto da classe Automovel
		Automovel auto1 = new Automovel("Mara Jozicleia", "BMW", "XL92", 2022);

		// troca de mensagens(chamada ao método imprimirInfo())
		auto1.imprimirInfo();
		System.out.println("\n*****Transferência de Proprietaria(o)*****");
		auto1.setNomeProprietario("Bruno Constantino");
		auto1.imprimirInfo();

		Automovel auto2 = new Automovel("Denise Mignoli", "Toyota", "KY85", 2021);
		auto2.imprimirInfo();
		System.out.println("\n*****Mudança de Placa*****");
		auto2.setPlaca("AC27");
		auto2.imprimirInfo();
	}

}





