package Familia24;

/*1 - Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente ("Thomaz França","11-969323-5225","Rua MXCC, 63",29);
		
		// troca de mensagens(chamada ao método imprimirInfo())
				cl1.imprimiCliente();
				System.out.println("\n*****Mudança de Endereço*****");
				cl1.setEndereço("Rua PXX1, 49");
				cl1.imprimiCliente();
		
		Cliente cl2 = new Cliente ("Julio Mota","11-96663-3398","Rua MXCC, 22",60);
				cl2.imprimiCliente();
			
				
				
	}
	
	
}

