package Familia24;

public class TestaEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado[] lista = new Empregado[3];
		lista[0]= new Empregado("Jesus",6500);
		lista[1]= new Empregado("Rosenbaum",3500);
		lista[2]= new Empregado("Amanda",2500);
		
		for(Empregado outraroda:lista)
		{
			outraroda.imprimirInfo();
		}
		
		System.out.println("*******************************");
		for(Empregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimirInfo();
		}
		
		
	}

}

