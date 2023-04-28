package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual");
		int anoAtual = sc.nextInt();
		
		System.out.println("Digite o ano do seu nascimento");
		int anoNas = sc.nextInt();
		
		int idade = (anoAtual - anoNas);
		
		if ( idade == 18||idade == 70) {
			System.out.println("Se tiver " + idade + " anos ");
		}
					
		if (idade >= 18 && idade <= 70) {
			System.out.println("Voto obrigatorio");
		} else if (idade >= 16 && idade < 18 || idade > 70) {
			System.out.println("Voto opcional");
		} else if (idade < 16 )
			System.out.println("Proibido");	
		
		
		sc.close();
    	}
	
	}


