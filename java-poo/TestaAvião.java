package Familia24;

/*2- Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/


public class TestaAvi�o {

	public static void main(String[] args) {
		
		Avi�o av1 = new Avi�o ("Boeing","737 MAX","MXC-63",48);
				av1.imprimiEletronico();
			
				System.out.println("**********************************");
		
		Avi�o cl2 = new Avi�o ("Boeing","A310","JAV-36",36);
				cl2.imprimiEletronico();
			
				
				
	}
	
	
}

/*private String marca;
	private String modelo;
	private String codigoDeSerie;
	private int autonomiaDeVoo;*/
