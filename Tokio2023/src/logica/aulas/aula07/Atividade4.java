package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2;
		
		do {
			System.out.println("Digite a primerira nota =");
			nota1 = sc.nextDouble();
			
			if (nota1 < 10 || nota1 > 10) {
				System.out.println("Valor invalido. Digite novamente");
			}
		} while (nota1 < 10 || nota1 > 10);
		
		
		do {
			System.out.println("Digite a primerira nota =");
			nota1 = sc.nextDouble();
			
			if (nota1 < 10 || nota1 > 10) {
				System.out.println("Valor invalido. Digite novamente");
			}
		} while (nota1 < 10 || nota1 > 10);
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Media " + media);
		System.out.println("Media %.2f %.2f %.2f ", media );
		
		sc.close();
	}

}
