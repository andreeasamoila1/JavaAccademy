package com.betacom;

import com.betacom.process.ProcessJson;
import com.betacom.process.ProcessSequential;

public class MainJson {

	public static void main(String[] args) {
		if(new ProcessJson().execute()) {
			System.out.println("fine normale del processo");
		} else {
			System.out.println("Errore nel processo!");
		}

	}

}
