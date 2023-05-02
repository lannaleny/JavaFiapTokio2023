package logica.aula.aulas10;

import java.util.Scanner;

public class MetodosComArg {

	//METODOS SEM RETORNO COM ARGUMENTOS
	
	static void saudacaoComArgs(String nome, int idade) {
	
		if (idade>=18) {
			System.out.printf("ola, %s! Voce tem %d anos e eh maior de idade", nome, idade);
		} else {
			System.out.printf("Ola, %s! Voce tem %d anos e eh menor de idade", nome, idade);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite seu nome");
		  String nomeDigitado = sc.nextLine();
		  
		  System.out.println("Digite sua idade");
		  int idadeDigitada = sc.nextInt();
		
		saudacaoComArgs(nomeDigitado, idadeDigitada);
		
      sc.close();
      
	}

}
