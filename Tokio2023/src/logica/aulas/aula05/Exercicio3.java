package logica.aulas.aula05;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
	    System.out.println("Digite o seu nome:");
	    String nome = entrada.nextLine();
	    
	    System.out.println("Me diga seu genero:");
	    System.out.println("\n[M] masculino" + "\n[F] feminino" + "\n[O] outro" + "\n[N] nao responder");
		char genero = entrada.nextLine().charAt(0);
		
		System.out.println("Ola," + nome + " seu genero e " + genero);
		
		entrada.close();
		
		
		
		
	}

}
