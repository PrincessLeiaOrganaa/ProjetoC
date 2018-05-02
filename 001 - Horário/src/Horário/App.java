package Horário;
import java.util.ArrayList;
import java.util.Scanner;



public class App {
	
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		Horario hora;
		
		int h, m, s;
		for(int i = 0; i<4; i++) {
			System.out.println("Digite a hora: " );
			h = in.nextInt();
			System.out.println("Digite o minuto: " );
			m = in.nextInt();
			System.out.println("Digite o segundo: " );
			s = in.nextInt();
			hora = new Horario(h, m, s);
		
			
		}
		
		
		System.out.println("lista : " + lista);
		
			
	}

}
