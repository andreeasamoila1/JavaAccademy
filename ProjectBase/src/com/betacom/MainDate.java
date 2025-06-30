package com.betacom;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.betacom.objects.User;
import com.betacom.process.ProcessDate;

import static com.betacom.utils.Utilities.displayDate;
import static com.betacom.utils.Utilities.stringToDate;;

public class MainDate {

	
	
	public static void main(String[] args) {
		System.out.println("Begin Main Date: " /*+ args[0]*/);
		
		String input = "01/06/2025";
		
		if(new ProcessDate().execute(input)) {
			
			System.out.println("Fine normale del proceso");
		} else {
			
			System.out.println("Errore nel processo!");
		}
		
		
		
	}



}
