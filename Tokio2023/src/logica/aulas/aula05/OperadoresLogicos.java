package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean verificaSenha = true;
		boolean verificaEmail = true;
		
		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
				
		boolean negacao = !true;
		System.out.println(negacao);
		
		// Operadores de Strings
		
		String nome1 = "joana";
		String nome2 = "joana";
		String nome3 = new String ("joana");
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome3));
	}

}
