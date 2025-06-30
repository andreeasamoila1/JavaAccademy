package com.betacom;

import com.betacom.process.ProcessInterfaccia2;

public class MainInterfaccia2 {

	public static void main(String[] args) {
		if(new ProcessInterfaccia2().execute()) {
			System.out.println("fine normale del processo");
		} else {
			System.out.println("Errore nel processo!");
		}
	}
}
