package com.betacom;

import com.betacom.process.ProcessInterface;

public class MainInterfaces {

	public static void main(String[] args) {

		if(new ProcessInterface().execute()) {
			System.out.println("fine normale del processo");
		} else {
			System.out.println("Errore nel processo!");
		}

	}

}
