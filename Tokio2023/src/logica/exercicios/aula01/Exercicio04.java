package logica.exercicios.aula01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		System.out.println("ola, " + nome + " voce tem " + idade + " anos");
		 
		entrada.close();
		
	}

}
