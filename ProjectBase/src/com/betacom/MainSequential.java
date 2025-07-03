package com.betacom;

import com.betacom.process.ProcessCollection;
import com.betacom.process.ProcessSequential;

public class MainSequential {

	public static void main(String[] args) {
		if(new ProcessSequential().execute()) {
			System.out.println("fine normale del processo");
		} else {
			System.out.println("Errore nel processo!");
		}

	}

}
