package com.betacom;

import com.betacom.objects.Impiegati;

public class MainEredit {

	public static void main(String[] args) {
		System.out.println("Begin Main Eredit");
	
		Impiegati imp = new Impiegati("Paolo", "Verdi", true,  1500L);
		System.out.println(imp);
	
		imp = new Impiegati();
		imp.setCognome("Bianchi");
		imp.setNome("Claudio");
		imp.setSesso(true);
		imp.setSalary(2000L);
		
		System.out.println(imp);
		
	}

}
