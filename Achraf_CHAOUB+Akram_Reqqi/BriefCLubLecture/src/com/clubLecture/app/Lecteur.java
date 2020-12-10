package com.clubLecture.app;

public class Lecteur extends Personne {

	private String tel ;
	private String prenom ;
	private String nom ; 
	private  static int compteurLecteurs =0;
	private static int compteurLecteurFidele = 0;
	
	public Lecteur(int id, String email, int carteFidelite, String tel , String nom , String prenom) {
		super(id, email, carteFidelite);
		this.tel = tel;
		this.nom = nom;
		this.prenom = prenom;
		compteurLecteurs++;
		if(carteFidelite >= 4)
			compteurLecteurFidele ++;

	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static int getCompteurLecteurs() {
		return compteurLecteurs;
	}

	public static void setCompteurLecteurs(int compteurLecteurs) {
		Lecteur.compteurLecteurs = compteurLecteurs;
	}

	public static int getCompteurLecteurFidele() {
		return compteurLecteurFidele;
	}

	public static void setCompteurLecteurFidele(int compteurLecteurFidele) {
		Lecteur.compteurLecteurFidele = compteurLecteurFidele;
	}

	@Override
	public  String toString() {
		return super.toString() +" , Nom : " + getNom() + " , Prenom : " + getPrenom() +" , tel : " + getTel()  ;
	}
	
	
	

}
