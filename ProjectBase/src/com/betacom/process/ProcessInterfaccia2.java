package com.betacom.process;

import com.betacom.objects.Leone;
import com.betacom.objects.Pesce;
import com.betacom.objects.Gazella;
import com.betacom.process.implementations.ImpiegatiProcess;
import com.betacom.process.interfaces.IDispalaySalary;
import com.betacom.process.interfaces.ISalaryInsert;
import com.betacom.process.interfaces.Preda;
import com.betacom.process.interfaces.Predatore;

public class ProcessInterfaccia2 {
	
	public boolean execute() {
		System.out.println("Begin Process Interfaccia 2");
		
		Preda p = new Pesce();
		Predatore p1 = new Pesce();
		p1.sonoUnPredatore();
		p.sonoUnaPreda();
		
		p = new Gazella();
		p.sonoUnaPreda();
		
		p1 = new Leone();
		p1.sonoUnPredatore();
		
		return true;
	}
	/*
	 * oppure
	 * public boolean execute() {
		System.out.println("Begin ProcessInterfaccia2");
		identificate( new Leone());
		identificate( new Gazella());
		identificate( new Pesce());
		
		return true;
	}
	
	private void identificate(Object o) {
		if (o instanceof Preda) {
			Preda p = (Preda)o;
			p.sonoUnaPreda();
		}
		if (o instanceof Predatore) {
			Predatore p1 = (Predatore)o;
			p1.sonoUnPredatore();
		}
		
		
	}
	 */
}
