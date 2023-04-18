package logica.exercicios.aula01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite seu salario");
		double salario = entrada.nextDouble();
		
		System.out.println("Seu salario " + salario);
		
		entrada.close();
	}

}
