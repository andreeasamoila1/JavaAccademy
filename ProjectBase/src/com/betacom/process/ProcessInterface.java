package com.betacom.process;

import com.betacom.objects.Impiegati;
import com.betacom.process.implementations.ImpiegatiProcess;
import com.betacom.process.interfaces.IDispalaySalary;
import com.betacom.process.interfaces.ISalaryInsert;
import com.betacom.singletone.MySingleTone;

public class ProcessInterface {

	public boolean execute() {
		System.out.println("Begin Process Interface");
		
		/*
		 * implementazione singletone
		 */
		Integer idx = MySingleTone.getInstance().computerIndice();
		System.out.println("Valore di idx: "+ idx);
		
		
		
		Impiegati i = new Impiegati("Paolo", "Bianchi", true, 2000L);
		System.out.println("Iniziale: " + i);
		
//		Object o = new ImpiegatiProcess();
		Object o = new ImpiegatiProcess();
		
		if(o instanceof ISalaryInsert) {
			ISalaryInsert s = (ISalaryInsert) o;
			s.newSalaryInsert(i);
			System.out.println("Dopo: " + i);
		}
		
		if(o instanceof IDispalaySalary) {
			IDispalaySalary d = (IDispalaySalary) o;
			d.formatSalary(i);
		}
		
		if(o instanceof ImpiegatiProcess) {
			ImpiegatiProcess p = (ImpiegatiProcess) o;
			p.cambioSalary(i, 2500L);
			System.out.println("Dopo cambio salary: " + i);
		}
		
		return true;
	}
}
