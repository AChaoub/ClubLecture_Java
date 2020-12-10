package com.clubLecture.app;

import java.util.Date;

public class Livre {
	
	private int identifiant;
	private String titre;
	private String �dition; 
	private Date dateEdition;
	private static int nombreLivre = 0;

	
	
	public Livre(int identifiant, String titre, String �dition, Date dateEdition) {
		this.identifiant = identifiant;
		this.titre = titre;
		this.�dition = �dition;
		this.dateEdition = dateEdition;
		nombreLivre++;
	}
	

	public int getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String get�dition() {
		return �dition;
	}


	public void set�dition(String �dition) {
		this.�dition = �dition;
	}


	public Date getDateEdition() {
		return dateEdition;
	}


	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}

	public static int getNombreLivre() {
		return nombreLivre;
	}


	public static void setNombreLivre(int nombreLivre) {
		Livre.nombreLivre = nombreLivre;
	}


	@Override
	public String toString() {
		return "\t \t Idenfiant : " + getIdentifiant() + ", Titre : " + getTitre() + ", Edition : " + get�dition()+" ,Date Edition : " + getDateEdition();
	}
	
	
	
	
	
	
	
	
	 
	 

}
