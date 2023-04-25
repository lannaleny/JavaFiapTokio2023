package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a qtd de produtos");
    int qtdProdutos = sc.nextInt();
    
    for (int i = 0; i < qtdProdutos; i++) {
    	System.out.println("Produto " + (i+1));
   
    	sc.close();
      }
    
	 }

   }
