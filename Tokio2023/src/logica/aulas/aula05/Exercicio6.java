package logica.aulas.aula05;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome da peca 1: ");
		String nomePeca1 = entrada.nextLine();

		System.out.println("Digite o numero de pecas:");
		double nmPecas1 = entrada.nextDouble();
		
		System.out.println("");
		float valorPeca1 = entrada.nextFloat();

		
		entrada.close();
	}

}
