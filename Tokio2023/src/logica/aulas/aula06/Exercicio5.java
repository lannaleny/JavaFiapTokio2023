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
//	  String car1 =  (sc.nextLine() +sc.nextLine());
	  
	  
	  int  resposta = sc.nextInt();
	  	   
	  switch (resposta) {
	    case 1:
	      resposta = num1 + num2;
	      System.out.println(resposta);
	      break;
	    case 2:
	      resposta = num1 / num2;
	      System.out.println(resposta);
	    break;
	  case 3:
	    resposta = num1 - num2;
	    System.out.println(resposta);
	    break;
	  case 4:
	   resposta = num1 * num2;
	   System.out.println(resposta);
	   break;
	   default:
		   System.out.println("Valor invalido");
		}
	  	 
	 
    sc.close();
	}

}
