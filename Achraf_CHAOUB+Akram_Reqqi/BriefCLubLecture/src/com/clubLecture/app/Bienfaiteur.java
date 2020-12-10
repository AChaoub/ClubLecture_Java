package com.clubLecture.app;

public class Bienfaiteur extends Personne {
	
	private static int compteurBienfaiteur;
	private static int compteurSuperFideleBienfaiteur = 0;
	private  String surnom;
	
	

	public Bienfaiteur(int id, String email, int carteFidelite,String surnom) {
		super(id, email, carteFidelite);
		this.surnom = surnom;
		compteurBienfaiteur++;
		if(carteFidelite>=3) {
			
			compteurSuperFideleBienfaiteur++;
			
		}
	}
	
	public String getSurnom() {
		return surnom;
	}
	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}


	public static int getCompteurBienfaiteur() {
		return compteurBienfaiteur;
	}


	public static void setCompteurBienfaiteur(int compteurBienfaiteur) {
		Bienfaiteur.compteurBienfaiteur = compteurBienfaiteur;
	}



	public static int getCompteurSuperFideleBienfaiteur() {
		return compteurSuperFideleBienfaiteur;
	}

	public static void setCompteurSuperFideleBienfaiteur(int compteurSuperFideleBienfaiteur) {
		Bienfaiteur.compteurSuperFideleBienfaiteur = compteurSuperFideleBienfaiteur;
	}

	@Override
	public  String toString() {
		return super.toString() + " , Le surnom : " + getSurnom()  ;
	}


	
	
	
	
	

}
