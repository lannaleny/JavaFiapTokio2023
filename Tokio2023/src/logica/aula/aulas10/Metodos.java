package logica.aula.aulas10;

import java.util.Scanner;

public class Metodos {
 // METODO SEM RETORNO E SEM PAREMETRO
	
	static void saudacao() {
		System.out.println("Bem vindo ao programa");
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Digite seu nome");
	  String nome = sc.nextLine();
	  
	  System.out.println("Digite sua idade");
	  int idade = sc.nextInt();
	  
	  System.out.println("Ola, %s! Voce tem %d anos \n", nome, idade);
	  
	  if(idade >=18) {
		  System.out.println("Maior de idade");
	  } else {
	  System.out.println("Menor de idade");	   
	}
	
	public static void main(String[] args) {
	
    saudacao();
    
   
    
	}

}
