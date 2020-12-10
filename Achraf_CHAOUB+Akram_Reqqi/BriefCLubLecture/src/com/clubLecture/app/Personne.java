package com.clubLecture.app;

public abstract class  Personne {
	
	private int  id ;
	private String email;
	private int carteFidelite;
	
	
	public  Personne(int id, String email, int carteFidelite) {
		this.id = id;
		this.email = email;
		this.carteFidelite = carteFidelite;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getCarteFidelite() {
		return carteFidelite;
	}


	public void setCarteFidelite(int carteFidelite) {
		this.carteFidelite = carteFidelite;
	}


	@Override
	public String toString() {
		return "\t \t Idenfiant : " + getId() + ", Email : " + getEmail() + ", Carte Fidelite : " + getCarteFidelite();
	}
	
	
	
	
	

}
