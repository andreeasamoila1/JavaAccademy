package com.betacom.process;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.*;
import java.util.StringTokenizer;

import com.betacom.objects.Impiegati;

public class ProcessCollection {

	public boolean execute() {
		System.out.println("Begin Process Collection");
		
//		executeList();
//		executeMap();
//		String params = "p1 = aaaa, p2 = 25, p3 = Paolo";
//		convertStringToMap(params);
//		
		mapTest();
		return true;
	}
	
	
	private void executeList() {
		System.out.println("List process !!!");
		/*
		 * List create
		 */
		List<Impiegati> lI = new ArrayList<Impiegati>(); //List init
		lI.add(new Impiegati("Andrea", "Vercelli", true, 1500L));
		lI.add(new Impiegati("Paolo", "Mancini", true, 2000L));
		lI.add(new Impiegati("Riccardo", "Pascal", true, 1600L));
		lI.add(new Impiegati("Anna", "Bianchi", false, 1300L));
		lI.add(new Impiegati("Clara", "Arancio", false, 1900L));
		lI.add(new Impiegati("Gloria", "Bianchi", true, 2500L));
		lI.add(new Impiegati("Martino", "Vertici", true, 2100L));
		lI.add(new Impiegati("Marta", "Bruni", true, 1500L));
		
		for(Impiegati it: lI) {
			System.out.println(it);
		}
		
		/*
		 * search position
		 */
//		int position = 0;
//		String search = "Bianchi";
//		for (Impiegati it : lI) {
//			if(it.getCognome().equalsIgnoreCase(search))
//				break;
//				position++;
//		}
//		System.out.println(search + " trovato alla pisizione " + position);
		
		
		/*
		 * cancellare un elemento
		 */
//		lI.remove(position);
//		listImpiegati(lI);
		
		/*
		 * aggiungere un elemento
		 */
		System.out.println("*************LIST****************");
		
		Impiegati save = removeFromImpiegato("Vertici", lI);
		System.out.println("After remove");
		listImpiegati(lI);
		if(save != null) {
			lI.add(save);
		}
		System.out.println("After first save");
		listImpiegati(lI);
		
		lI.add(save);
		System.out.println("After second save");
		listImpiegati(lI);
		
		save = removeFromImpiegato("Vertici", lI);
		System.out.println("After remove first save");
		listImpiegati(lI);
		
		
		lI.sort(new Comparator<Impiegati>() {

			@Override
			public int compare(Impiegati o1, Impiegati o2) {
				return Double.compare(o1.getSalary(), o2.getSalary());
			}
			
		});
		System.out.println("After sort salary");
		listImpiegati(lI);
	}
	
	private void executeMap() {
		System.out.println("****************MAP********************");
		/*
		 * Definizione map
		 */
		Map<String, String> mappa = new HashMap<String, String>();
		mappa.put("k1", "v1");
		mappa.put("k2", "v2");
		mappa.put("k3", "v3");
		mappa.put("k4", "v4");
		mappa.put("k5", "v5");
		mappa.put("k6", "v6");
		mappa.put("k7", "v7");
		mappa.put("k8", "v8");
		mappa.put("k9", "v9");
		mappa.put("k10", "v10");
		
		System.out.println("numero di elementi di map: " + mappa.size());
		
		/*
		 * trovare un elemento
		 */
		String keySearch = "k6";
		if(mappa.containsKey(keySearch))
			System.out.println("key " + keySearch + " trovata");
		else
			System.out.println("Key " + keySearch + " NON trovata");
		
		String valueSearch = "v8";
		if(mappa.containsValue(valueSearch))
			System.out.println("Value " + valueSearch + " trovata");
		else
			System.out.println("Value " + valueSearch + " NON trovata");
		
		
		String value = null;
		value = mappa.get("k10");
		
		System.out.println("Valore di k10: " + value);
		
		mappa.put("k10" , "bla bla bla ...");
		System.out.println("Valore dopo k10: " + mappa.get("k10"));
		
		mappa.put("k99", "Nuovo valore");
		System.out.println("Nuomero di elementi della mappa: " + mappa.size() + " valore K99: " + mappa.get("K99"));
		
		
		for(Entry<String, String> it:mappa.entrySet()) {
			System.out.println("key : " + it.getKey() + " value: " + it.getValue());
		}
		
		for(String it:mappa.keySet()) {
			System.out.println("Key: " + it + " value: " + mappa.get(it));
		}
		
		
	}

	private void mapTest() {
		String params = "p1 = aaaa, p2 = 25, p3 = Paolo";
		Map<String, String> map = new HashMap<String, String>();
		String[] elementi = params.split(",");
		for(String it:elementi) {
			String[] kv = it.split("=");
			map.put(kv[0].trim(), kv[1].trim());
		}
		for(Entry<String, String> it: map.entrySet()) {
			System.out.println("key: " + it.getKey() + "value: " + it.getValue());
		}
		

	}
	
	private void listImpiegati(List<Impiegati> lI) {
		int position = 0; 
		for(Impiegati it:lI) {
			
			System.out.println(position + " " + it);
			position++;
		}
	}
	
	private Impiegati removeFromImpiegato(String search, List<Impiegati> lI) {
		int position = 0; 
		Impiegati rc = null;
		for(Impiegati it:lI) {
			if(it.getCognome().equalsIgnoreCase(search)) {
				rc = it;
				break;
			}
	
			position++;
		}
		
		if(rc != null) {
			System.out.println("remove item: " + position);
			lI.remove(position);
		}
		
		return rc;
	}
	
}
