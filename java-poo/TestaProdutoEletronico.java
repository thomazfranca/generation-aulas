package Familia24;

/*3- Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console..*/


public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico ele1 = new ProdutoEletronico ("TV","ULTRA HD","Samsumg",48);
				ele1.imprimiEletronico();
			
				System.out.println("**********************************");
		
		ProdutoEletronico ele2 = new ProdutoEletronico ("Celular","A310","Samsumg",36);
				ele2.imprimiEletronico();
			
				System.out.println("**********************************");
	
		ProdutoEletronico ele3 = new ProdutoEletronico ("Console","Playstation 5","Sony",0);
				ele3.imprimiEletronico();
				
	}
	
	
}

/*private String marca;
	private String modelo;
	private String codigoDeSerie;
	private int autonomiaDeVoo;*/
