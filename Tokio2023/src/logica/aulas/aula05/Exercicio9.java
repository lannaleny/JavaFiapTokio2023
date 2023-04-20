package logica.aulas.aula05;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numDig =  entrada.nextInt();
		
		int centena = (numDig / 100) * 100;
	    int dezena = (numDig % 100) * 1;
	    int unidade = (numDig % 10);
	    
	    
	    System.out.println("Centena: " + centena);
	    System.out.println("Dezena: " + dezena);
	    System.out.println("unudade: " + unidade);
	    
	    
	 
	    
	    entrada.close();
	}

}
