package com.clubLecture.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class app {
	
	//Attributs Livre
	public static int identifiantLivre;
	public static String titreLivre ;
	public static String editionLivre ;
	public static String dateEditionLivre ;
	
	// Attributs Bienfaiteur
	public static int identifiantBienfaiteur;
	public static String surnomBienfaiteur ;
	public static String emailBienfaiteur ;
	public static int carteFideliteBienfaiteur ;
	
	// Attributs Lecteur
	public static int identifiantLecteur;
	public static String nomLecteur ;
	public static String prenomLecteur ;
	public static String TelephoneLecteur ;
	public static String emailLecteur ;
	public static int carteFideliteLecteur ;

	// le choix d'utilisateur
	public static int caractereMenuPricipale = 0;
	public static int caractereSousMenuBienfaiteur = 0;
	public static int caractereSousMenuLecteur = 0;
	public static int caractereSousMenuLivre = 0;
	

	
	
	public static ArrayList<Livre> ListLivre = new ArrayList<Livre>();
	public static ArrayList<Lecteur> ListLecteur = new ArrayList<Lecteur>();
	public static ArrayList<Bienfaiteur> ListBienfaiteur = new ArrayList<Bienfaiteur>();
	
	
	//Menu 
	public static  int menuPrincipale() {
		
		
		Scanner inputMenuPrincipale = new Scanner(System.in);
		
		// ---------------Menu
		System.out.println("+---------------------------------MENU PRINCIPALE---------------------------------------+");
		System.out.println("-\t \t \t \t 1 - CRUD BIENFAITEUR \t \t \t \t \t-");
		System.out.println("-\t \t \t \t 2 - CRUD LECTEUR \t \t \t \t \t-");
		System.out.println("-\t \t \t \t 3 - CRUD LIVRE \t \t \t \t \t-");
		System.out.println("-\t \t \t \t 4 - QUITTER \t \t \t \t \t \t-");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.print("Selectionnez votre choix :\t");
			       
		caractereMenuPricipale = inputMenuPrincipale.nextInt();
		return caractereMenuPricipale;
	}
	
	//Menu SousBienfaiteur
	public static  int menuBienfaiteur() {
			
		int selectionBienfaiteur;
		Scanner inputBienfaiteur = new Scanner(System.in);

		System.out.println("+---------------------------------MENU BIENFAITEUR--------------------------------------+");
		System.out.println("-\t \t \t \t 1 -  Ajouter bienfaiteur   \t \t \t \t-");
	    System.out.println("-\t \t \t \t 2 -  Rechercher bienfaiteur \t \t \t \t-");
	    System.out.println("-\t \t \t \t 3 -  Modifier bienfaiteur \t \t \t \t-");
	    System.out.println("-\t \t \t \t 4 -  Supprimer bienfaiteur \t \t \t \t-");
	    System.out.println("-\t \t \t \t 5 -  Lister la liste des bienfaiteurs \t \t \t-");
	    System.out.println("-\t \t \t \t 6 -  Retour au Menu principale \t \t \t-");
	   	System.out.println("+---------------------------------------------------------------------------------------+");
	       	
		System.out.print("Selectionnez votre choix :\t");
				       
		caractereSousMenuBienfaiteur =  inputBienfaiteur.nextInt();
		return caractereSousMenuBienfaiteur;
	}
	
	//Menu SousLivre
	public static  int menuLivre() {
			
		int selectionLivre;
		Scanner inputLivre = new Scanner(System.in);

		System.out.println("+---------------------------------MENU LIVRE------------------------------------------+");
		System.out.println("-\t \t \t \t 1 -  Ajouter livre  \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 2 -  Rechercher un livre \t \t \t \t-");
       	System.out.println("-\t \t \t \t 3 -  Modifier livre \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 4 -  Supprimer livre \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 5 -  Lister la liste des livres \t \t \t-");
       	System.out.println("-\t \t \t \t 6 -  Retour au Menu principale \t \t \t-");
       	System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.print("Selectionnez votre choix :\t");
			       
		caractereSousMenuLivre =  inputLivre.nextInt();
		return caractereSousMenuLivre;
	}
	
	//Me,u SousLecteur
	public static  int menuLecteur() {
		
		int selectionLecteur;
		Scanner inputLecteur = new Scanner(System.in);

		System.out.println("+---------------------------------MENU LECTEUR------------------------------------------+");
		System.out.println("-\t \t \t \t 1 -  Ajouter lecteur  \t \t \t \t \t-");
       	System.out.println("-\t \t \t \t 2 -  Rechercher lecteur  \t \t \t \t-");
       	System.out.println("-\t \t \t \t 3 -  Modifier lecteur  \t \t \t \t-");
       	System.out.println("-\t \t \t \t 4 -  Supprimer lecteur  \t \t \t \t-");
       	System.out.println("-\t \t \t \t 5 -  Lister la liste des lecteurs  \t \t \t-");
       	System.out.println("-\t \t \t \t 6 -  Retour au Menu principale \t \t \t-");
       	System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.print("Selectionnez votre choix :\t");
			       
		caractereSousMenuLecteur =  inputLecteur.nextInt();
		return caractereSousMenuLecteur;
	}
	
	
	
	
	
	// Menu de Confirmation de retour au menu principale.
	public static  String affichageSousMenu() {
			
		String selectionSousMenu;
		Scanner inputSousMenu = new Scanner(System.in);

		System.out.println("Voulez-vous retourner au menu pricipale ");
		System.out.println("n --NON / y---- YES");
		       
		selectionSousMenu = inputSousMenu.nextLine();    
		return selectionSousMenu;
	}
	
	// Traitement des choix Menu Confirmation retour (y/n)
	public static void switchCondition() {
		
		switch(affichageSousMenu()) {
			case "y":
				break;
			case "n":
				System.out.println("Fin!!");
				System.exit(-1);
				break;
		}
	}
	
	
	
	
	//Methode d'affichage Livre
	public static  void affichageLivre(Livre livre,int position) {
		
		System.out.println("\t Le livre "+(position+1)+":");
		System.out.println(livre.toString());
		
	}
	
	//Methode d'affichage Bienfaiteur
	public static void affichageBienfaiteur(Bienfaiteur bienfaiteur,int position) {
		
		System.out.println("\t Le bienfaiteur "+(position+1)+":");
		System.out.println(bienfaiteur.toString());
		
	}
	
	
	//Methode d'affichage Lecteur
	public static void affichageLecteur(Lecteur lecteur,int position) {
		
		System.out.println("\t Lecteur "+(position+1)+":");
		System.out.println(lecteur.toString());
		
	}
	
		
	
	//Pour afficher les noms des attribus de la classe Livre
	public static  int affichageAttLivre() {
		
		int selectionAttLivre;
		Scanner inputAttLivre = new Scanner(System.in);

		System.out.println("1 - IDENTIDIANT ");
		System.out.println("2 - TITRE ");
		System.out.println("3 - EDITION");
		System.out.println("4 - DATE_EDITION");
		       
		selectionAttLivre =  inputAttLivre.nextInt();
		return selectionAttLivre;
	}

	//Pour afficher les noms des attribus de la classe Lecteur
	public static  int affichageAttLecteur() {
		
		int selectionAttLecteur;
		Scanner inputAttLecteur = new Scanner(System.in);
			
		System.out.println("1-IDENTIFIANT");
		System.out.println("2-NOM ");
		System.out.println("3-PRENOM");
		System.out.println("4-NUMERO_TELEPHONE");
		System.out.println("5-EMAIL");
		System.out.println("6-CARTE_FIDELITE");
			 
		selectionAttLecteur = inputAttLecteur.nextInt();
		return selectionAttLecteur;
	}
		
	//Pour afficher les noms des attribus de la classe Bienfaiteur
	public static  int affichageAttBienfaiteur() {
		
		int selectionAttBienfaiteur;
		Scanner inputAttBienfaiteur = new Scanner(System.in);

		System.out.println("1-IDENTIFIANT ");
		System.out.println("2-SURNOM ");
		System.out.println("3-EMAIL");
		System.out.println("4-CARTE_FIDELITE");
		       
		selectionAttBienfaiteur = inputAttBienfaiteur.nextInt();
		return selectionAttBienfaiteur;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Bienfaiteur b = new Bienfaiteur(1, "email", 1, "surnom");
		ListBienfaiteur.add(b);
		
		Lecteur lec = new Lecteur(1, "email", 5, "tel", "nom", "prenom");
		ListLecteur.add(lec);
		
		
		
		//Scanner  clavier1 = new Scanner(System.in);
		  
		do {
			
			switch(menuPrincipale()) {
			
				case 1 :
				
					do {
						
						switch(menuBienfaiteur()) {
					
							case 1 :
								
								Scanner inputAjouterIdBienfaiteur = new Scanner(System.in);
								Scanner inputAjouterSurnomBienfaiteur = new Scanner(System.in);
								Scanner inputAjouterEmailBienfaiteur= new Scanner(System.in);
								Scanner inputAjouterCarteFideliteBienfaiteur = new Scanner(System.in);
								
					        	System.out.println("Saisir identifiant Bienfaiteur:");
					        	identifiantBienfaiteur = inputAjouterIdBienfaiteur.nextInt();
					        	
					        	System.out.println("Saisir surnom Bienfaiteur:");
					        	surnomBienfaiteur = inputAjouterSurnomBienfaiteur.nextLine();
					        	
					        	System.out.println("Saisir email Bienfaiteur:");
					        	emailBienfaiteur = inputAjouterEmailBienfaiteur.nextLine();
					        	
					        	System.out.println("Saisir carte fidelite :");
					        	carteFideliteBienfaiteur = inputAjouterCarteFideliteBienfaiteur.nextInt();
					        	
					        	
					        	Bienfaiteur bienfaiteur = new Bienfaiteur(identifiantBienfaiteur, emailBienfaiteur, carteFideliteBienfaiteur,surnomBienfaiteur);
					        	ListBienfaiteur.add(bienfaiteur);
					        	System.out.println(" \t L'ajout de Bienfaiteur fait avec succes ");
					        	
					        	switchCondition();
					        	break;
					        	// fin case 1
					        	
							case 2 :
								
								Scanner inputAjouterPositionBienfaiteur = new Scanner(System.in);
								System.out.println("\t Entrez une position pour rechercher sur un bienfaiteur :");
								int positionBienfaiteur = inputAjouterPositionBienfaiteur.nextInt();
								
								if(ListBienfaiteur.get(positionBienfaiteur) == null) {
									System.out.println("Bienfaiteur introuvable ");
								}
								else {
								System.out.println("Bienfaiteur trouvé: ");
								
					    			affichageBienfaiteur(ListBienfaiteur.get(positionBienfaiteur), positionBienfaiteur);
					    		
								}
								
					    		switchCondition();
					    		
					    		break;
					    		//fin case 2
								
							case 3 : 
								
								Scanner inputPositionModifBienfaiteur = new Scanner(System.in);
								int positionModifBienfaiteur;
								
					        	System.out.println("Entrez la position du bienfaiteur pour le modifier :");
					        	positionModifBienfaiteur = inputPositionModifBienfaiteur.nextInt();
					        	
					        	if(ListBienfaiteur.get(positionModifBienfaiteur) == null) {
									System.out.println("Bienfaiteur introuvable ");
								}
								else {
									
						        	switch(affichageAttBienfaiteur()) {
						        	
							        	case 1:
							        		
											Scanner inputModificationId= new Scanner(System.in);
											
											System.out.println("Entrez le nouveau Identifiant:");
											int nouvelleValeurId  = inputModificationId.nextInt();
											
											ListBienfaiteur.get(positionModifBienfaiteur).setId(nouvelleValeurId);
											System.out.println("Modification id faite avec succes");
											
											break;
											
										case 2:
											
											Scanner inputModificationSurnom = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur de la surnom :");
											String nouvelleValeurSurnom  = inputModificationSurnom.nextLine();
											
											ListBienfaiteur.get(positionModifBienfaiteur).setSurnom(nouvelleValeurSurnom);
											System.out.println("Modification surnom faite avec succes");
											
										    break;
										    
										case 3:
											
											Scanner inputModificationEmail = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur d'email:");
											String nouvelleValeurEmail  = inputModificationEmail.nextLine();
										
											ListBienfaiteur.get(positionModifBienfaiteur).setEmail(nouvelleValeurEmail);
											System.out.println("Modification email faite avec succes");
											
											break;
											
										case 4:
											
											Scanner inputModificationCarteFid = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur du carte fidelite:");
											int nouvelleValeurCarteFid  = inputModificationCarteFid.nextInt();
											
											ListBienfaiteur.get(positionModifBienfaiteur).setCarteFidelite(nouvelleValeurCarteFid);
											System.out.println("Modification carte Fidelite faite avec succes");
											
										    break;
									}
					        	
					        	}
					        	
					        	switchCondition();
					        	
					        	break;
					        	//fin case 3
					        	
							case 4 :
								
								Scanner inputPositionSuppBienfaiteur = new Scanner(System.in);
								int positionSuppBienfaiteur;
								
					        	System.out.print("Entrez la position du bienfaiteur pour le supprimer :\t");
					        	positionSuppBienfaiteur = inputPositionSuppBienfaiteur.nextInt();
					        	
					        	if(ListBienfaiteur.get(positionSuppBienfaiteur) == null) {
									System.out.println("Bienfaiteur introuvable ");
								}
								else {
									
									
									// pour diminuer le compteur nbr livre
									Bienfaiteur.setCompteurBienfaiteur(Bienfaiteur.getCompteurBienfaiteur()-1);
									
									
									// condition pour diminuer le nombre Lecteur Fidele
									if(ListBienfaiteur.get(positionSuppBienfaiteur).getCarteFidelite() >= 3) {
										
										Bienfaiteur.setCompteurSuperFideleBienfaiteur(Bienfaiteur.getCompteurSuperFideleBienfaiteur() - 1);
									}
									
									ListBienfaiteur.remove(positionSuppBienfaiteur);
									System.out.println("\t La suppression a été faite avec succes  !! \n");
									
								}
								
								switchCondition();
			
					        	//fin case 4
								break;
					        	
					        	
							case 5:
								
								if(ListBienfaiteur.size() == 0) {
									
									System.out.println(" \t Liste bienfaiteurs est vide !!!!!\n ");
								}
								else {
									
									System.out.println("Liste des bienfaiteurs : ");
									
						    		for(int i = 0 ; i < ListBienfaiteur.size();i++) {
						    			
						    			affichageBienfaiteur(ListBienfaiteur.get(i),i);
						    		}
						    		
						    		System.out.println("Le nombre total des bienfaiteurs est : "+Bienfaiteur.getCompteurBienfaiteur());
						    		System.out.println("Le nombre total des 'SUPER' bienfaiteurs est : "+Bienfaiteur.getCompteurSuperFideleBienfaiteur());
						    		
								}
					 
					    		switchCondition();
					    		
					    		break;
					    		// fin case 5
					    		
						}
						
				}while(caractereSousMenuBienfaiteur <= 5);
					break;
					
				
				case 2  :
					
					do {
						
						switch(menuLecteur()) {
					
							case 1 :
								
								Scanner inputAjouterIdLecteur = new Scanner(System.in);
								Scanner inputAjouterNomLecteur = new Scanner(System.in);
								Scanner inputAjouterPrenomLecteur = new Scanner(System.in);
								Scanner inputAjouterTelLecteur = new Scanner(System.in);
								Scanner inputAjouterEmailLecteur= new Scanner(System.in);
								Scanner inputAjouterCarteFideliteLecteur = new Scanner(System.in);
								
					        	System.out.println("Saisir identifiant Lecteur :");
					        	identifiantLecteur = inputAjouterIdLecteur.nextInt();
					        	
					        	System.out.println("Saisir nom Lecteur :");
					        	nomLecteur = inputAjouterNomLecteur.nextLine();
					        	
					        	System.out.println("Saisir prenom Lecteur :");
					        	prenomLecteur = inputAjouterPrenomLecteur.nextLine();
					        	
					        	System.out.println("Saisir tel Lecteur :");
					        	TelephoneLecteur = inputAjouterTelLecteur.nextLine();
					        	
					        	System.out.println("Saisir email Lecteur:");
					        	emailLecteur = inputAjouterEmailLecteur.nextLine();
					        	
					        	System.out.println("Saisir carte fidelite Lecteur:");
					        	carteFideliteLecteur = inputAjouterCarteFideliteLecteur.nextInt();
					        	
					        	
					        	Lecteur lecteur = new Lecteur(identifiantLecteur, emailLecteur, carteFideliteLecteur, TelephoneLecteur, nomLecteur, prenomLecteur);
					        	ListLecteur.add(lecteur);
					        	System.out.println(" \t L'ajout d'un lecteur fait avec succes ");
					        	
					        	switchCondition();
					        	break;
					        	// fin case 1
					        	
							case 2 :
								
								Scanner inputAjouterPositionLecteur = new Scanner(System.in);
								System.out.println("\t Entrez une position pour rechercher sur un lecteur :");
								int positionLecteur = inputAjouterPositionLecteur.nextInt();
								
								if(ListLecteur.get(positionLecteur) == null) {
									System.out.println("Lecteur introuvable ");
								}
								else {
								System.out.println("Lecteur trouvé: ");
								
					    			affichageLecteur(ListLecteur.get(positionLecteur), positionLecteur);
					    		
								}
								
					    		switchCondition();
					    		
					    		break;
					    		//fin case 2
								
							case 3 : 
								
								Scanner inputPositionModifLecteur = new Scanner(System.in);
								int positionModifLecteur;
								
					        	System.out.println("Entrez la position du lecteur pour le modifier :");
					        	positionModifLecteur = inputPositionModifLecteur.nextInt();
					        	
					        	if(ListLecteur.get(positionModifLecteur) == null) {
									System.out.println("Lecteur introuvable ");
								}
								else {
									
						        	switch(affichageAttLecteur()) {
						        	
							        	case 1:
							        		
											Scanner inputModificationId= new Scanner(System.in);
											
											System.out.println("Entrez le nouveau Identifiant Lecteur:");
											int nouvelleValeurId  = inputModificationId.nextInt();
											
											ListLecteur.get(positionModifLecteur).setId(nouvelleValeurId);
											System.out.println("Modification id faite avec succes");
											
											break;
											
										case 2:
											
											Scanner inputModificationNom = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur nom lecteur :");
											String nouvelleValeurNom  = inputModificationNom.nextLine();
											
											ListLecteur.get(positionModifLecteur).setNom(nouvelleValeurNom);
											System.out.println("Modification nom lecteur faite avec succes");
											
										    break;
										    
										case 3:
											
											Scanner inputModificationPrenom = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur prenom lecteur :");
											String nouvelleValeurPrenom  = inputModificationPrenom.nextLine();
										
											ListLecteur.get(positionModifLecteur).setPrenom(nouvelleValeurPrenom);
											System.out.println("Modification prenom faite avec succes");
											
											break;
											
										case 4:
											
											Scanner inputModificationTel = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur d'email:");
											String nouvelleValeurTel  = inputModificationTel.nextLine();
										
											ListLecteur.get(positionModifLecteur).setTel(nouvelleValeurTel);
											System.out.println("Modification email faite avec succes");
											
											break;
											
										case 5:
											
											Scanner inputModificationEmail = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur d'email:");
											String nouvelleValeurEmail  = inputModificationEmail.nextLine();
										
											ListLecteur.get(positionModifLecteur).setEmail(nouvelleValeurEmail);
											System.out.println("Modification email faite avec succes");
											
											break;
											
										case 6:
											
											Scanner inputModificationCarteFid = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur du carte fidelite:");
											int nouvelleValeurCarteFid  = inputModificationCarteFid.nextInt();
											
											ListLecteur.get(positionModifLecteur).setCarteFidelite(nouvelleValeurCarteFid);
											System.out.println("Modification carte Fidelite faite avec succes");
											
										    break;
									}
					        	
					        	}
					        	
					        	switchCondition();
					        	
					        	break;
					        	//fin case 3
					        	
							case 4 :
								
								Scanner inputPositionSuppLecteur = new Scanner(System.in);
								int positionSuppLecteur;
								
					        	System.out.print("Entrez la position du lecteur pour le supprimer :\t");
					        	positionSuppLecteur = inputPositionSuppLecteur.nextInt();
					        	
					        	if(ListLecteur.get(positionSuppLecteur) == null) {
					        		
									System.out.println("Lecteur introuvable ");
								}
								else {
									
									
									
									// pour diminuer le compteur nbr livre
									Lecteur.setCompteurLecteurs(Lecteur.getCompteurLecteurs()-1);
									
									
									// condition pour diminuer le nombre Lecteur Fidele
									if(ListLecteur.get(positionSuppLecteur).getCarteFidelite() >= 4) {
										
										Lecteur.setCompteurLecteurFidele(Lecteur.getCompteurLecteurFidele()-1);
									}
									
									//affichage 
									ListLecteur.remove(positionSuppLecteur);
									System.out.println("\t La suppression a été faite avec succes  !! \n");
									
								}
								
								switchCondition();
			
					        	//fin case 4
								break;
					        	
					        	
							case 5:
								
								if(ListLecteur.size() == 0) {
									
									System.out.println(" \t Liste lecteurs est vide !!!!!\n ");
								}
								else {
									
									System.out.println("Liste des lecteurs : ");
									
						    		for(int i = 0 ; i < ListLecteur.size();i++) {
						    			
						    			affichageLecteur(ListLecteur.get(i),i);
						    		}
						    		
						    		System.out.println("Le nombre total des lecteurs est : "+Lecteur.getCompteurLecteurFidele());
						    		System.out.println("Le nombre total des lecteurs 'FIDELE' est : "+Lecteur.getCompteurLecteurFidele());
						    		
								}
					 
					    		
								switchCondition();
					    		break;
					    		// fin case 5	
						}
						
					
				}while(caractereSousMenuLecteur <= 5);
					break;
					
					
				case 3 :
					
					do {
						
						switch(menuLivre()) {
					
							case 1 :
								
								Scanner inputAjouterIdLivre = new Scanner(System.in);
								Scanner inputAjouterTitre = new Scanner(System.in);
								Scanner inputAjouterEdition = new Scanner(System.in);
								Scanner inputAjouterDateEdition = new Scanner(System.in);

					        	System.out.println("Saisir identifiant Livre :");
					        	identifiantLivre = inputAjouterIdLivre.nextInt();
					        	
					        	System.out.println("Saisir titre Livre :");
					        	titreLivre = inputAjouterTitre.nextLine();
					        	
					        	System.out.println("Saisir edition Livre :");
					        	editionLivre= inputAjouterEdition.nextLine();
					        	
					        	System.out.println("Saisir date edition Livre (MM-JJ-AAAA) :");
					        	dateEditionLivre = inputAjouterDateEdition.nextLine();
					        	
					        	SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy");
					        	
								Date dateEdition = null;
								try {
									dateEdition = f.parse(dateEditionLivre);
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						        	
					        	
					        	Livre livre = new Livre(identifiantLivre, titreLivre, editionLivre, dateEdition);
					        	ListLivre.add(livre);
					        	System.out.println(" \t L'ajout d'un lecteur fait avec succes ");
					        	
					        	switchCondition();
					        	break;
					        	// fin case 1
					        	
							case 2 :
								
								Scanner inputAjouterPositionLivre = new Scanner(System.in);
								System.out.println("\t Entrez une position pour rechercher sur un livre :");
								int positionLivre = inputAjouterPositionLivre.nextInt();
								
								if(ListBienfaiteur.get(positionLivre) == null) {
									System.out.println("Livre introuvable ");
								}
								else {
								System.out.println("Livre trouvé: ");
								
					    			affichageLivre(ListLivre.get(positionLivre), positionLivre);
					    		
								}
								
					    		switchCondition();
					    		
					    		break;
					    		//fin case 2
								
							case 3 : 
								
								Scanner inputPositionModifLivre = new Scanner(System.in);
								int positionModifLivre;
								
					        	System.out.println("Entrez la position de la livre pour le modifier :");
					        	positionModifLivre = inputPositionModifLivre.nextInt();
					        	
					        	if(ListLivre.get(positionModifLivre) == null) {
									System.out.println("Livre introuvable ");
								}
								else {
									
						        	switch(affichageAttLivre()) {
						        	
							        	case 1:
							        		
											Scanner inputModificationId= new Scanner(System.in);
											
											System.out.println("Entrez le nouveau Identifiant Livre:");
											int nouvelleValeurId  = inputModificationId.nextInt();
											
											ListLivre.get(positionModifLivre).setIdentifiant(nouvelleValeurId);
											System.out.println("Modification id faite avec succes");
											
											break;
											
										case 2:
											
											Scanner inputModificationTitre = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur titre livre :");
											String nouvelleValeurTitre  = inputModificationTitre.nextLine();
											
											ListLivre.get(positionModifLivre).setTitre(nouvelleValeurTitre);
											System.out.println("Modification titre livre faite avec succes");
											
										    break;
										    
										case 3:
											
											Scanner inputModificationEdition = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur d'edition livre :");
											String nouvelleValeurEdition  = inputModificationEdition.nextLine();
										
											ListLivre.get(positionModifLivre).setÉdition(nouvelleValeurEdition);
											System.out.println("Modification prenom faite avec succes");
											
											break;
											
										case 4:
											
											SimpleDateFormat f1 = new SimpleDateFormat("MM-dd-yyyy");
											Scanner inputModificationDateEdition = new Scanner(System.in);
											System.out.println("Entrez la nouvelle valeur date edition livre (MM-JJ-AAAA):");
											String nouvelleValeurDateEdition  = inputModificationDateEdition.nextLine();
										
											Date dateE = null;
											try {
												dateE = f1.parse(nouvelleValeurDateEdition);
											} catch (ParseException e) {
												// TODO Auto-generated catch block
												System.out.println("Format invalide veuillez entre une date sous format MM-JJ-AAAA");;
											}
											
											ListLivre.get(positionModifLivre).setDateEdition(dateE);
											System.out.println("Modification email faite avec succes");
											
											break;
											
									}
					        	
					        	}
					        	
					        	switchCondition();
					        	
					        	break;
					        	//fin case 3
					        	
							case 4 :
								
								Scanner inputPositionSuppLivre = new Scanner(System.in);
								int positionSuppLivre;
								
					        	System.out.print("Entrez la position du lecteur pour le supprimer :\t");
					        	positionSuppLivre = inputPositionSuppLivre.nextInt();
					        	
					        	if(ListLecteur.get(positionSuppLivre) == null) {
					        		
									System.out.println("Livre introuvable ");
								}
								else {
									
									ListLivre.remove(positionSuppLivre);
									
									
									// pour diminuer le compteur nbr livre
									Livre.setNombreLivre(Livre.getNombreLivre() -1);
									
									System.out.println("\t La suppression a été faite avec succes  !! \n");
									
									
								}
								
								switchCondition();
			
					        	//fin case 4
								break;
					        	
					        	
							case 5:
								
								if(ListLivre.size() == 0) {
									
									System.out.println(" \t Liste livre est vide !!!!!\n ");
								}
								else {
									
									System.out.println("Liste des lecteurs : ");
									
						    		for(int i = 0 ; i < ListLivre.size();i++) {
						    			
						    			affichageLivre(ListLivre.get(i),i);
						    		}
						    		
						    		System.out.println("Le nombre total des livres est : "+Livre.getNombreLivre());
						    		
								}
					 
					    		switchCondition();
					    		
					    		break;
					    		// fin case 5	
						}
					
				}while(caractereSousMenuLivre <= 5);
					break;
					
			}

			
		}while(caractereMenuPricipale <=3);
	}
}
