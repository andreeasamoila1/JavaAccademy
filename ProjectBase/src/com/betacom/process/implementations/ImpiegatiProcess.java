package com.betacom.process.implementations;
import java.text.NumberFormat;
import java.util.Locale;

import com.betacom.objects.Impiegati;
import com.betacom.process.interfaces.IDispalaySalary;
import com.betacom.process.interfaces.ISalaryInsert;

public class ImpiegatiProcess implements ISalaryInsert, IDispalaySalary{

	@Override
	public void newSalaryInsert(Impiegati imp) {
		long quota = 2;
		if(imp.getSesso()) {
			quota = 2;
			imp.setSalary(imp.getSalary() * quota);
		} else {
			quota = (long) 1.5;
			imp.setSalary(imp.getSalary() * quota);
		}
	}
	
	@Override
	public void formatSalary(Impiegati imp) {

		System.out.println("Salary: " + NumberFormat.getCurrencyInstance(Locale.ITALY).format(imp.getSalary()));
		
	}

	/*
	 * metodo fuori interface
	 */
	public void cambioSalary(Impiegati imp, long salary) {
		imp.setSalary(salary);
	}

	
	
	
}
