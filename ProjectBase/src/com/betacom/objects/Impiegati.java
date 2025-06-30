package com.betacom.objects;

import com.betacom.singletone.MySingleTone;

public class Impiegati extends User{

	private Long salary;
	private String mySesso;

	public Impiegati() {
		super();
	}

	public Impiegati(String nome, String cognome, Boolean sesso, Long salary) {
		super(nome, cognome, sesso);
		
//		super.setNome(nome);
//		super.setCognome(cognome);
//		super.setSesso(sesso);
		
		this.salary = salary;
		
		Integer idx = MySingleTone.getInstance().computerIndice();
		System.out.println("Valore di idx: "+ idx);
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getMySesso() {
		return (getSesso()) ? "M" : "F";
	}

	public void setMySesso(String mySesso) {
		this.mySesso = mySesso;
	}

	@Override
	public String toString() {
		return "Impiegati [salary=" + salary + ", getNome()=" + getNome() + ", getCognome()=" + getCognome()
				+ ", getSesso()=" + getSesso()  + ", getMySesso()=" + getMySesso() + "]";
	}
	
	
	
	
	
}
