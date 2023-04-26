package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano do seu nascimento");
		int anoNas = sc.nextInt();
		
		
		if (anoNas <= 2005 && anoNas >= 1953) {
			System.out.println("Voto obrigatorio");
		} else if (anoNas <= 2007 && anoNas > 2005) {
			System.out.println("Voto opcional");
		} else if (anoNas > 2007 )
			System.out.println("Proibido");	
		
		
		sc.close();
    	}
	
	}


