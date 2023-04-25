package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Digite o primeiro numero");
	 int numA = sc.nextInt();
	 
	 System.out.println("Digite o segundo numero");
	 int numB = sc.nextInt();
	 
	 if (numA % numB == 0) {
		 System.out.println("Esses numeros sao multiplos entre si");
	 } else {
		 System.out.println("Esse numeros nao sao multiplos entre si");
	 }
	 
      sc.close();
	}

}
