package Logicas.aulas.aula08;
 
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
	 
		Date data = new Date ();
		System.out.println("Data agora " + data);
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("Data e hora atual " + c.getTime());
		
		System.out.println("ano " + c.get(Calendar.YEAR));
		System.out.println("mes " + c.get(Calendar.MONTH));
		System.out.println("Dia do mes " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana " + c.get(Calendar.DAY_OF_WEEK));
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		int minuto = c.get(Calendar.MINUTE);
		
		System.out.println("Hora " + hora);
		System.out.println("Minutos "  + minuto);
		
		

	}

}
