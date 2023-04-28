package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Digite a distancia percorrida do automovel em km");
		double km = sc.nextDouble();
		
		System.out.println("Digite o total de combustivel gasto em litros");
		double combustivel = sc.nextDouble();
		
	    double consumo = (km / combustivel);
	 
	    System.out.println("O consumo medio do automovel e " + consumo + "km/litro");
	    
	    if (consumo < 8 ) {
	    	System.out.println("Esse carro bebe hein!");
	    } else {
	    	System.out.println("Autonomia legal!");	 
	    }
		  
     sc.close();
	}

}
