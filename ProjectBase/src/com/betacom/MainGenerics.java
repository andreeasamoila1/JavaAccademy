package com.betacom;

import com.betacom.process.ProcessGenerics;

public class MainGenerics {

	public static void main(String[] args) {
		if(new ProcessGenerics().execute()) {
			System.out.println("fine normale del processo");
		} else {
			System.out.println("Errore nel processo!");
		}

	}

}
