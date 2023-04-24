package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Me digite o primeiro");
		int num1 = entrada.nextInt();
		
		System.out.println("Me digite o segundo numero");
	    int num2 = entrada.nextInt();
	    
	    if (num1 > num2) {
	    	System.out.println(num1+" e o numero maior");
	    } else if (num1 < num2) {
	    	System.out.println(num2 +" e o numero maior");    	   
	       } else {
	    	   System.out.println("Esses numeros sao iguais");
	       }
	    	 	    			    	  	
	      entrada.close();	
	}

}
