package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano do seu nascimento");
		String anoNas = sc.nextLine();
		
		if (anoNas >= 2005 && <= 70) {
			System.out.println("Voto obrigatorio");
		}else if (anoNAs >=16 && <18) {
			System.out.println("Voto opcional");
		}else {
			System.out.println("Proibido");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
