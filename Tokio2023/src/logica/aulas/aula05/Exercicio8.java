package logica.aulas.aula05;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

	  Scanner entrada = new Scanner(System.in);
	  
	  System.out.println("Digite o valor que a ser convertido:");
	  double conversao = entrada.nextDouble();
	  
	  double dolar = (conversao * 5.08);
	  double euro = (conversao * 5.57);	
	  double peso = (conversao * 0.023);
	  double libra = (conversao * 6.23);
	  double iene = (conversao * 0.038);
	  
	  System.out.println("Valores convertidos em reais");
	  System.out.println("Valor em dolar: " + dolar);
	  System.out.println("Valor em euro: " + euro); 
	  System.out.println("Valor em peso: " + peso);
	  System.out.println("Valo em libra: " + libra);
	  System.out.println("Valor em iene: " + iene);
	  
	  entrada.close();
	  
	  
	  
	}

}
