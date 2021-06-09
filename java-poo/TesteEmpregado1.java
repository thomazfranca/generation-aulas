package Familia24;

public class TesteEmpregado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado1 felipe = new Empregado1 ("Felipe","Rua Que Sobe e Desce,1222","23344455566",976654433,20,111,4500,15);
		
		felipe.imprimirInfo();
		felipe.calcularSalario();
		felipe.validarCpf();
		
		Empregado1 thomaz = new Empregado1 ("Thomaz","Rua Quem sabe onde é,1222","12345678910",362425698,32,132,6500,15);
		thomaz.imprimirInfo();
		thomaz.calcularSalario();
		thomaz.validarCpf();
		
		
		
		
	}

}
