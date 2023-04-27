package logica.aulas.aula09;

public class RevisaoVetores {

	public static void main(String[] args) {
		
		
		int[] numeros = {10, 20, 5, 3};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("pos: %d -- valor: %d \n", i, numeros[i]);
		}
		//UM FOR UM POUCO DIFERENTE
		
        for (int num: numeros) {
        	System.out.println(num);
        }
        
        
	}

}
