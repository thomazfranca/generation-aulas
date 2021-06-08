package Familia24;
/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


public class Patinete {

	private String modelo;
	private String cor;
	private String marca;
	private int velocidadeMedia;

	public Patinete(String modelo, String cor, String marca, int velocidadeMedia) {

		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
		this.velocidadeMedia = velocidadeMedia;
	}

	public void imprimiPatinete() {
		System.out.println(
				"\nO patinete " + modelo + ", da cor " + cor + ", da marca " 
						+ marca + " atingi uma velocidade média de " + velocidadeMedia +" km/h");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(int velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}


}