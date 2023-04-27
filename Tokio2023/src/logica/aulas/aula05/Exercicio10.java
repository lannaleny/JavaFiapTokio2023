package logica.aulas.aula05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos anos voce tem?");
		int idade = entrada.nextInt();
		
		System.out.println("Quantos meses?");
		int meses = entrada.nextInt();
		
		System.out.println("Quantos dias?");
		int dias = entrada.nextInt();
		
		int diasVividos = (idade * 365) + (meses * 30) + dias;
		
		System.out.println("Voce viveu " + diasVividos + " dias");
		
		entrada.close();
	}

}
