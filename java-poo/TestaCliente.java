package Familia24;

/*1 - Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/


public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente ("Thomaz Fran�a","11-969323-5225","Rua MXCC, 63",29);
		
		// troca de mensagens(chamada ao m�todo imprimirInfo())
				cl1.imprimiCliente();
				System.out.println("\n*****Mudan�a de Endere�o*****");
				cl1.setEndere�o("Rua PXX1, 49");
				cl1.imprimiCliente();
		
		Cliente cl2 = new Cliente ("Julio Mota","11-96663-3398","Rua MXCC, 22",60);
				cl2.imprimiCliente();
			
				
				
	}
	
	
}

