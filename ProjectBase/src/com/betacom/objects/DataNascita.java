package com.betacom.objects;

public class DataNascita {

	private Integer giorno;
	private Integer cognome;
	private Integer anno;
	
	
	public DataNascita() {
		super();
	}

	public DataNascita(Integer giorno, Integer cognome, Integer anno) {
		super();
		this.giorno = giorno;
		this.cognome = cognome;
		this.anno = anno;
	}
	
	public Integer getGiorno() {
		return giorno;
	}
	public void setGiorno(Integer giorno) {
		this.giorno = giorno;
	}
	public Integer getCognome() {
		return cognome;
	}
	public void setCognome(Integer cognome) {
		this.cognome = cognome;
	}
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	
	
	
	
}
