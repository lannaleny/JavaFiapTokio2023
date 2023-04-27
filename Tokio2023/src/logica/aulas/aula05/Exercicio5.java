package logica.aulas.aula05;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = entrada.nextDouble();
		
		double mediaPonderada = (nota1 * 0.4) + (nota2 * 0.6);
		
		System.out.println("Sua media ponderada e de: " + mediaPonderada);
		
		entrada.close();
	}

}
