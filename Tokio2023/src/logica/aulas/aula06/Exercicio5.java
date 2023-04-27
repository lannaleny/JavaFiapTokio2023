package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Digite o primeiro numero");
	  int num1 = sc.nextInt();
	  
	  System.out.println("Digite o segundo numero");
	  int num2 = sc.nextInt();
	  
	  System.out.println("Digite a operacao matematica");
	  char operacao = sc.next().charAt(0);
	  	  	   
	  switch (operacao) {
	    case '+':
	      System.out.println(num1 + num2);
	      break;
	    case '-':
	      System.out.println(num1 - num2);
	    break;
	  case '/':
	    System.out.println(num1 / num2);
	    break;
	  case '*':
	   System.out.println(num1 * num2);
	   break;
	  
		}
	  	 
	 
    sc.close();
	}

}
