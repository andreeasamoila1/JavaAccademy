package com.betacom.process;

import static com.betacom.utils.Utilities.displayDate;
import static com.betacom.utils.Utilities.stringToDate;

import java.time.LocalDate;

import com.betacom.objects.User;

public class ProcessDate {
	private final static String PATTERN_DATE = "dd/MM/yyyy";
	private final static String PATTERN_DATE_ESTESO = "EEEE dd MM yyyy";

public boolean execute(String input) {
	
	
	
	User user = null;
	try {
		user = new User("Paolo", "Verdi", true, 2000, 3, 25, stringToDate(PATTERN_DATE, input), 6);
		System.out.println(user);
		
		LocalDate adesso = LocalDate.now();
		System.out.println("Adesso: " + displayDate(PATTERN_DATE, adesso));
		
		System.out.println("Adesso: " + displayDate(PATTERN_DATE_ESTESO, user.getNascita()));
		System.out.println("Giorno dell'anno: " + user.getNascita().getDayOfYear());
		
		int plusGiorni = 25;
		user.setNascita(user.getNascita().plusDays(plusGiorni));
		System.out.println("Data nascita modificata:  " + displayDate(PATTERN_DATE, user.getNascita()));
		
		System.out.println("Data fine validità: " + displayDate(PATTERN_DATE, user.getFineValidita()));
		return true;
	} catch (Exception e) {
		System.out.println("Errore in create user: " + e.getMessage());
		System.exit(9);
		return false;
	}
}
}
