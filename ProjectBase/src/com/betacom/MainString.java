package com.betacom;

import java.util.StringTokenizer;

public class MainString {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		/*
		 * Build string using append
		 */
		sb.append("Buongiorno");
		sb.append(", ");
		sb.append("sono");
		sb.append(" ");
		sb.append("Andreea");
		
		String rS = sb.toString();
		System.out.println(rS);
		
		/*
		 * Build string using string format
		 */
		String n = "Andreea";
		String f = "Rumena";
		String r = String.format("Il mio nome è: %s e sono %s!", n, f);
		String r1 = "Il mio nome è: " + n + " e sono " + f;
		System.out.println(r);
		
		if(n.equalsIgnoreCase("Andreea")) {
			System.out.println("Found...");
		}else {
			System.out.println("Not found...");
		}
		
		if(rS.contains(",")) {
			System.out.println("Found comma");
		}else {
			System.out.println("Not found comma");
		}
		
		String test = "   ".trim();
		if(test.isEmpty())
			System.out.println("parametro vuoto...");
		
		/*
		 * String compare
		 */
		String p1 = "Samsung";
		String p2 = "Samsungaa";
		int result = p2.compareTo(p1);
		System.out.println("Comparetion: " + result);
		
		/*
		 * Transform string in array
		 */
		String parameters = "token1, token2, token3, token4, token5, token6, token7";
		String[] tokens = parameters.split(",");
		for(String it: tokens) {
			System.out.println(it);
		}
		
		/*
		 * Transform string in token
		 */
		System.out.println("****String Tokenizer****");
		StringTokenizer st = new StringTokenizer(parameters, ",");
		
		while(st.hasMoreTokens()) {
			String tst = st.nextToken();
			System.out.println("Token trovato: " + tst);
		}
		
	}

}
