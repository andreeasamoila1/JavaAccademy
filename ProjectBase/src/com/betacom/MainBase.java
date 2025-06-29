package com.betacom;

import java.util.ArrayList;
import java.util.Scanner;

import com.betacom.objects.User;
import com.betacom.utils.PromozioneAutomatica;

public class MainBase {

	public static void main(String[] args) {

		/*
		 * primitive
		 */
		byte b = 127;
		int i= 2_000_000_000;
		long j = 9_473479_237L;
		short k = 32767;
		float l = 5.345611f;
		double m = 5.123552345657678;
		char n = 'z';
		boolean o = false;
		
		/*
		 * referenze
		 */
		String str = "Ciao sono una stringa";
		System.out.println(str + "\n");
		System.out.println(str.toUpperCase() + "\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nome: ");
		String nome = sc.nextLine();
		System.out.println("Il tuo nome è: " + nome);
		
		/*
		 * operatori logici
		 */
//		boolean rc = (10 < 6) && (n != 'p');
//		System.out.println("risposta logica: " + rc);
		
		int eta = 30;
		String result = "";
		if(eta < 50) {
			result = "sono un ragazzino";
		}else {
			result = "Sono vecchio";
		}
		
		// operatore ternario
		// String result= (eta < 50) ? "Sono un ragazzino" : "Sono vecchio";
		
		System.out.println("Ciao sono " + nome + result);
		
		/*
		 * operatori aritmetici
		 */
		i = 20;
		i++;
		int jj = 3;
		int res = i * jj;
		int div = res / 2;
		int remi = res % 2;
		System.out.println("Il valore di i: " + i + "i * jj: " + res + "res / 2: " + div + "resto: " + remi);
		
		
		String param = "1234";
		div = Integer.parseInt(param) / 2;
		System.out.println("result: " + div);
		
		String text = "hnkjadskjdkjdkjshdhsdfdgbudsjdbskbdsjk";
		System.out.println("Text length: " + text.length() + " " + text.substring(4, 6));
		
		
		text = "     inizio    corso     di java     ";
		System.out.println(">>" + text.trim() + "<<");
		
		String search = "corso";
		if(text.trim().contains(search)) {
			System.out.println("Trovata la string: " + search);
		} else {
			System.out.println("Non trovata la string: " + search);
		}
		
		if(text.trim().startsWith("inizio")) {
			System.out.println("prefisso trovato!");
		} else {
			System.out.println("Prefisso non trovato!");
		}
		
		/*
		 * array fissi
		 */
		String[] array = new String[4];
		array[0] = "Primo";
		array[1] = "Secondo";
		array[2] = "Terzo";
		array[3] = "Quarto";
		
//		for(int idx = 0; idx < array.length; i++) {
//			System.out.println("Idx: " + idx + " " + array[idx] + "String length: " + array[idx].length());
//		}
		
		for(String it:array) {
			System.out.println(it);
		}
		
		int[] numeri = {10, 20, 30, 40, 50};
		numeri[3] = 100;
		for(int numero:numeri) {
			System.out.println(numero);
		}
		
		/*
		 * array dinamici
		 */
		ArrayList<String> dynam = new ArrayList<String>();
		dynam.add("dynam 1");
		dynam.add("dynam 2");
		dynam.add("dynam 3");
		dynam.add("dynam 4");
		dynam.add("dynam 5");
		dynam.add("dynam 6");
		dynam.add("dynam 7");
		dynam.add("dynam 8");
		dynam.add("dynam 9");
		dynam.add("dynam 10");
		dynam.add("dynam 11");
		
		System.out.println("Dynam length: " + dynam.size());
		
		for(String it:dynam) {
			System.out.println(it + " string length: " + it.length());
		}
		
		/*
		 * array 2D
		 */
		String [][] classi = new String[3][2];
		
		classi[0][0] = "elem 0 class 0";
		classi[0][1] = "elem 1 class 0";
		
		classi[1][0] = "elem 0 class 1";
		classi[1][1] = "elem 1 class 1";
		
		classi[2][0] = "elem 0 class 2";
		classi[2][1] = "elem 1 class 2";
		
		/*
		 * ESERCIZIO -> stampare le stringhe degli array 2D
		 */
		
		//Primo modo
		for(String[] classe : classi) {
			for(String stringaClasse : classe) {
				System.out.println(stringaClasse);
			}
		}
		
		//Secondo modo
		for(int classe1 = 0; classe1 < classi.length; classe1++) {
			for(int classe2 = 0; classe2 < classi[classe1].length; classe2++) {
				System.out.println(classi[classe1][classe2]);
			}
		}
		
//		
//		Integer aaa = null;
//		Boolean bbb = null;
//		Double  ddd = null;
//		Character ccc = null;
//		
//		int aap = 0;
//		
//		Integer.bitCount(aap);
//		aaa.compareTo(aap);
		
		
		/*
		 * wrapper class
		 */
		Integer prim;
		Boolean boole;
		Double doub;
		Character car;
		Float fl;
		Long lon;
		
		
		
		User user = new User();
		user.setNome("Marta");
		user.setCognome("Rossi");
		/*
		 * ==
		 */
		User user1 = new User("Giorgio", "Verdi");
		
		System.out.println("User: " + user);
		
		
		ArrayList<User> lUsers = new ArrayList<User>();
		lUsers.add(new User("Pietro", "Uno"));
		lUsers.add(new User("Marco", "Due"));
		lUsers.add(new User("Carlo", "Tre", true));
		lUsers.add(new User("Martina", "Quattro"));
		lUsers.add(new User("Sofia", "Cinque"));
		
		System.out.println(lUsers);
		
		for(User it: lUsers) {
			System.out.println(it);
		}
		
		
		PromozioneAutomatica pA = new PromozioneAutomatica();
		pA.method(10);
		pA.method(2.0f);
		pA.method("parametro string");
		
		
		
		
		
		
	}

}
