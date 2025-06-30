package com.betacom.objects;

import com.betacom.process.interfaces.Predatore;

public class Leone implements Predatore{

	@Override
	public void sonoUnPredatore() {
		System.out.println("Sono un leone e snon un predatore");
		
	}
}
