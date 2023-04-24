package logica.aulas.aula06;

import java.util.Scanner;

class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		int nota1 = entrada.nextInt();
		
		System.out.println("Digite a segunda nota");
		int nota2 = entrada.nextInt();
		
		System.out.println("Digite a terceira nota");
		int nota3 = entrada.nextInt();
		
		System.out.println("Digite a quarta nota");
		int nota4 = entrada.nextInt();
		 
		int notaFinal = (nota1 + nota2 + nota3 + nota4 / 4);
		 
		if (notaFinal <7) {
			System.out.println("Aprovado");
		}else if (notaFinal >5) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Recuperacao");
		}
			
	   }
	}


