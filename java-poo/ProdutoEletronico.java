package Familia24;
/*3- Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/


public class ProdutoEletronico {

	private String tipoDeEletronico;
	private String modelo;
	private String marca;
	private int quantidadeEstoque;

	public ProdutoEletronico(String tipoDeEletronico, String modelo, String marca, int quantidadeEstoque) {

		this.tipoDeEletronico = tipoDeEletronico;
		this.modelo = modelo;
		this.marca = marca;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void imprimiEletronico() {
		System.out.println(
				"\nEletronico: " + tipoDeEletronico + "\nModelo: " + modelo + "\nMarca: " 
						+ marca + "\nQtde Em estoque: " + quantidadeEstoque);
	}

	public String getTipoDeEletronico() {
		return tipoDeEletronico;
	}

	public void setTipoDeEletronico(String tipoDeEletronico) {
		this.tipoDeEletronico = tipoDeEletronico;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}


}
