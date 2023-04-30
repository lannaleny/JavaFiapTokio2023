package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite seu salario atual");
      double salarioAtual = sc.nextDouble();
      
      System.out.println(" ");
      
      double aumentoSalario = 0;
      if (salarioAtual <= 280.0 ) {
        aumentoSalario = 0.2;
	}else if (salarioAtual > 280 && salarioAtual <= 700) {
		aumentoSalario = 0.15;
	}else if (salarioAtual > 700 && salarioAtual <=1500) {
		aumentoSalario = 0.10;
	}else {
		aumentoSalario = 0.05;
	}

      double aumento = (salarioAtual * aumentoSalario);
      double novoSalario = (salarioAtual + aumento);
      
      
      System.out.println("O salario era de : R$" + salarioAtual);
      System.out.println("O percentual do aumento: " + (aumentoSalario * 100) + "%");
      System.out.println("O valor do aumento: R$" + aumento );
      System.out.println("O valor do salario depois do aumento: R$" + novoSalario);
      
      
      
      
      
      
      
      
      
      sc.close();
}
}