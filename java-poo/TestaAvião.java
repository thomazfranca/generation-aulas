package Familia24;

/*2- Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


public class TestaAvião {

	public static void main(String[] args) {
		
		Avião av1 = new Avião ("Boeing","737 MAX","MXC-63",48);
				av1.imprimiEletronico();
			
				System.out.println("**********************************");
		
		Avião cl2 = new Avião ("Boeing","A310","JAV-36",36);
				cl2.imprimiEletronico();
			
				
				
	}
	
	
}

/*private String marca;
	private String modelo;
	private String codigoDeSerie;
	private int autonomiaDeVoo;*/
