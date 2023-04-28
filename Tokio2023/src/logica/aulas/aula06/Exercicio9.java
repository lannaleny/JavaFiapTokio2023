package logica.aulas.aula06;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma das opcoes de atendimento:");
		System.out.println("\n[1]Residencia" + "\n[2]Comercio" + "\n[3]Industria");
		char local = sc.next().charAt(0);
	
		System.out.println("Digite o valor de consumo mensal em kw/h");
		double valorMensal = sc.nextDouble();
		
		double valorKm = 0;
		
		switch(local) {
		case '1':
			valorKm = 0.60;
			break;
		case '2':
			valorKm = 0.48;
			break;
		case '3':
			valorKm = 1.29;
			break;
			default:
				System.out.println("opcao invalida");	
		}
		
		double conta = (valorKm * valorMensal);
		
		System.out.println("O valor da conta e de R$" + conta + " reais");
		
		sc.close();
	}

}
