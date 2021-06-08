package Familia24;
/*2- Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/


public class Avi�o {

	private String marca;
	private String modelo;
	private String codigoDeSerie;
	private int autonomiaDeVoo;

	public Avi�o(String marca, String modelo, String codigoDeSerie, int autonomiaDeVoo) {

		this.marca = marca;
		this.modelo = modelo;
		this.codigoDeSerie = codigoDeSerie;
		this.autonomiaDeVoo = autonomiaDeVoo;
	}

	public void imprimiEletronico() {
		System.out.println(
				"\nAvi�o: " + marca + "\nModelo: " + modelo + "\nN� de serie: " + codigoDeSerie + "\nAutonomia: " + autonomiaDeVoo +" horas de voo");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCodigoDeSerie() {
		return codigoDeSerie;
	}

	public void setCodigoDeSerie(String codigoDeSerie) {
		this.codigoDeSerie = codigoDeSerie;
	}

	public int getAutonomiaDeVoo() {
		return autonomiaDeVoo;
	}

	public void setAutonomiaDeVoo(int autonomiaDeVoo) {
		this.autonomiaDeVoo = autonomiaDeVoo;
	}


}
