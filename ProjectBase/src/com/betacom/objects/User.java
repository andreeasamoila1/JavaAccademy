package com.betacom.objects;

import java.time.LocalDate;


public class User {

	private String nome;
	private String cognome;
	private Boolean sesso;
	private LocalDate nascita;
	
	
	
	public User() {
	}
	
	public User(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		/*
		 * setNome(nome);
		 * setCognome(cognome);
		 */
	}
	
	public User(String nome, String cognome, Boolean sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
	}
	
	public User(String nome, String cognome, Boolean sesso, LocalDate nascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.nascita = nascita;
	}

	public User(String nome, String cognome, Boolean sesso, int anno, int mese, int giorno) {
		this(nome, cognome, sesso, LocalDate.of(anno, mese, giorno));
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Boolean getSesso() {
		return sesso;
	}
	public void setSesso(Boolean sesso) {
		this.sesso = sesso;
	}

	public LocalDate getNascita() {
		return nascita;
	}

	public void setNascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	@Override
	public String toString() {
		String resp = "User [nome=" + nome + ", cognome=" + cognome;
		if(sesso != null)
			resp = resp + ", sesso=" + sesso;
		if(nascita != null)
			resp = resp + ", nascita=" + nascita;
		resp = resp + "]";
		return resp;
	}
	
	
	
	
}
