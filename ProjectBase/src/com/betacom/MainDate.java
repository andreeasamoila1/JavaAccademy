package com.betacom;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.betacom.objects.User;

public class MainDate {

	private final static String PATTERN_DATE = "dd/MM/yyyy";
	
	
	
	public static void main(String[] args) {
		System.out.println("Begin Main Date");
		
		User user = new User("Paolo", "Verdi", true, 2000, 03, 07);
		System.out.println(user);
		
		LocalDate adesso = LocalDate.now();
		System.out.println("Adesso: " + adesso);
		
	}
	
	public static String displayDate(String pattern, LocalDate myDate) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		 
		 return LocalDate.parse(pattern);
	}

}
