 package logica.aulas.aula05;

import java.util.Scanner;

public class DesafioFinal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos anos voce ja viveu?");
		int diasVividos = entrada.nextInt();
		
		int anos = (diasVividos / 365) ;
		int meses = (diasVividos % 365) / 30;
		int dias = (diasVividos % 365) % 30;
		 
		System.out.println("Voce tem: " + anos + " anos" + "\nVoce tem: " + meses + " mes" + "\nVoce tem: " + dias + " dias");
		
		entrada.close();
	}

}
