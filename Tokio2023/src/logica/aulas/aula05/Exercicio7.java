package logica.aulas.aula05;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o valor do produto");
		Double valorProduto = entrada.nextDouble();
		
		System.out.println("Qual sera o valor pago");
		Double valorPago = entrada.nextDouble();
		
		Double troco = (valorPago - valorProduto);

		System.out.println("Seu troco e " + "R$" + troco);
		
		entrada.close();
		
	
	}

}
