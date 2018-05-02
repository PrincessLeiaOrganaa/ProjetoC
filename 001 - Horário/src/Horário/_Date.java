package Horário;

import java.time.DayOfWeek;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;


public class _Date {
	public static void main(String[] args) {
		Date data = new Date();
		System.out.println("Data Agora: "+data);
		Date agora = new Date();
		System.out.println(agora.toString());
		//errado
		Date umDia = new Date(2011,12,23);
		System.out.println(umDia.toString());
		
		
		DayOfWeek ds = DayOfWeek.MONDAY;
		System.out.println(ds);
		System.out.println(ds.plus(2));
		System.out.println(ds.getDisplayName(TextStyle.
		FULL, Locale.getDefault()));
		System.out.println(ds.getDisplayName(TextStyle.
		NARROW, Locale.getDefault()));
		System.out.println(ds.getDisplayName(TextStyle.
		SHORT, Locale.getDefault()));
		
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		System.out.println(hoje.plusDays(30));
		
		
		
		
		

	}
}