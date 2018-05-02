package Horário;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;
	
	
	public Horario(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);		
	}
	
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if(hora>=0 && hora<=23);
		this.hora = hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto>=0 && minuto<=59);
		this.minuto = minuto;
	}	
	
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if(segundo>=0 && segundo<=59);
		this.segundo = segundo;
	}
	
	public int converteHoraParaSegundo() {
		return  hora*3600+ minuto*60+segundo;
	
		
	}
	
	public void converteSegundoParaHora(int horaEmSegundo) {
		 int h, m,s,resto;
		
		 h = horaEmSegundo/3600;
		 resto = horaEmSegundo %3600;
		 m = resto/60;
		 s =  resto % 60;
		 setHora(h);
		 setMinuto(m);
		 setSegundo(s);
		 
				
		
		
	}
	
	public String toString() {
		return " Hoário: " + hora + ":" + minuto + ":" + segundo;
		
	}
	
	

}
