package logica.exercicios.aula01;

import java.util.Scanner;

public class Exercico02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		
		System.out.println("Seu nome e " + nome);
		
		entrada.close();

	}

}
