package logica.aulas.aula05;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome da peca 1 ");
		String nomePeca1 = entrada.nextLine();

		System.out.println("Digite o numero de pecas");
		int nmPeca1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite o valor da peca");
		double valorPeca1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite o nome da peca 2");
		String nomePeca2 = entrada.nextLine();
		
		System.out.println("Digite o numero da peca 2");
        int nmPeca2 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Digite o valor das peca 2");
        double valorPeca2 = Double.parseDouble(entrada.nextLine());
        
        double valor1 = nmPeca1 * valorPeca1;
		double valor2 = nmPeca2 * valorPeca2;
                      
        double total = valor1 + valor2;
        
        System.out.println("O valor total com a peca " + nomePeca1 + "e a peca " + nomePeca2 + "e de R$" + total);
		
		entrada.close();
	}

}
