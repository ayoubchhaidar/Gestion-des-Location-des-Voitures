package p1;


import java.text.ParseException;

import java.util.*;

public class Main {
	
	
public static  void main (String[]args) throws ParseException  {
	    Parc parc=new Parc();
	    Location clients=new Location();
		LocEnCours locations=new LocEnCours();
	int choix;
	int choix1;
	
	Scanner s=new Scanner(System.in);
	do {
		
	    System.out.println("================================================");
	    System.out.println("|                  MENU                        |");
	    System.out.println("================================================");
	    System.out.println("| Options:                                     |"); 
	    System.out.println("|        1. Gestion du Parc de l’Agence :      |");
	    System.out.println("|        2. Gestion Locations :	               |");
	    System.out.println("|        3. gestion des clients                |");
	    System.out.println("|        4. stats                              |");
	    System.out.println("|        5. exit                               |");
	    System.out.println("================================================");
		choix=s.nextInt();
	
		 switch (choix) {
		    case 1:
		    		    	do {
		    		    	
		        System.out.println("================================================");
		   	    System.out.println("|      Gestion du Parc de l’Agence :           |");
		   	    System.out.println("================================================");
		   	    System.out.println("| Options:                                     |");
		   	    System.out.println("|       1. Nouvelle acquisition                |");
		   	    System.out.println("|       2. Modification de l’Etat              |");
		   	    System.out.println("|       3. Suppression d’un Véhicule           |");
		   	    System.out.println("|       4. Consultation Parc                   |");
		      	System.out.println("|       5. Liste des véhicules loués           |");
		     	System.out.println("|       6. Liste des véhicules en réparation   |");
		     	System.out.println("|       7. Liste des véhicules disponibles     |");
		     	System.out.println("|       8.menu principal                       |");
		   	    System.out.println("================================================");
		   		choix1=s.nextInt();
		   			
		   	    switch (choix1) {
		   	    case 1:
		   	  parc.ajouter();
		    	choix1=0;
		    	
              break;
		   	    case 2:
		   	     parc.modd();
		   	  choix1=0;
		  
		   	      break;
		   	    case 3:
		   	    	String mat;
		   	    	parc.afficher();
		   	    	do {
		   	    	System.out.println("Numéro d’immatriculation de voiture a supprimer :(***TUN***)");
					mat=s.next();
		   	     }while(mat.contains("TUN")==false);
		   	     parc.supp(mat);
		   	  choix1=0;
		   	      break;
		   	 case 4:
		   parc.afficher();
		   choix1=0;
		   	      break;
		   	case 5:
		   	     parc.voitures_loué();
		   	  choix1=0;
		   	      break;
		   	case 6:
		   	  parc.voitures_rep();
		   	choix1=0;
		   	      break;
		   	case 7:
		   	     parc.voitures_dispo();
		   	  choix1=0;
		   	      break;
		   	case 8:
		   		choix=0;
		   	    }
		    	}while((choix1!=1)&&(choix1!=2)&&(choix1!=3)&&(choix1!=4)&&(choix1!=5)&&(choix1!=6)&&(choix1!=7)&&(choix1!=8));
		      break;
		    	
		    case 2:
		    	do {
		    	    System.out.println("================================================");
			   	    System.out.println("|             Gestion Locations :              |");
			   	    System.out.println("================================================");
			   	    System.out.println("| Options:                                     |");
			   	    System.out.println("|       1. Nouvelle Location                   |");
			   	    System.out.println("|       2. Fin de Location                     |");
			   	    System.out.println("|       3. Consultation des locations en cours |");
			     	System.out.println("|       4.Consultation des Véhicules Loués     |");
			     	System.out.println("|                 par un client                |");
			     	System.out.println("|       5.historique                           |");
			     	System.out.println("|       6.menu principal                       |");
			   	    System.out.println("================================================");
			   		choix1=s.nextInt();
			   	    switch (choix1) {
			   	    case 1:
			   	      locations.ajouter(parc.Choixv(), clients.choix_clt());
			   	   choix1=0;
			   	      break;
			   	    case 2:
			   	      locations.supp_loc();
			   	     parc.modd();
			   	   choix1=0;
			   	      break;
			   	    case 3:
			   	     locations.afficher_loc();
			   	  choix1=0;
			   	      break;
			   	 case 4:
			   		 String a;
			   		 clients.afficherclt();
			   		do {
			   			System.out.println("donner le cin de client :");
			   			a=s.next();
			   			}while((a.length()!=8)&&((a.substring(0,0).compareTo("0")!=0)||(a.substring(0,0).compareTo("1")!=0)));
			   	     locations.afficher_loc_clt(a);
			   	  choix1=0;break;
			   	      
			   	 case 5:
			   	    locations.his();
			   	 choix1=0;  
			   	    break;
			   	 case 6:
			   		 choix=0;
			   		 break;
			   	    }
		    	}while((choix1!=1)&&(choix1!=2)&&(choix1!=3)&&(choix1!=4)&&(choix1!=5)&&(choix1!=6));
		      break;
		    case 3:
		    	do {
		    	    System.out.println("================================================");
			   	    System.out.println("|             gestion des clients:             |");
			   	    System.out.println("================================================");
			   	    System.out.println("| Options:                                     |");
			   	    System.out.println("|       1. ajouter un client                   |");
			   	    System.out.println("|       2. afficher les clients                |");
			     	System.out.println("|       3.menu principal                       |");
			   	    System.out.println("================================================");
			   		choix1=s.nextInt();
			   		switch (choix1) {
			   	    case 1:
			   	      clients.ajouterclt();
			   	   choix1=0;
			   	      break;
			   	    case 2:
			   	      clients.afficherclt();
			   	   choix1=0;
			   	      break;
			   	    case 3:
			   	    choix=0;
			   	    }}while((choix1!=1)&&(choix1!=2)&&(choix1!=3));
			      break;
			   
		    case 4:
		    	do {
		  	    System.out.println("================================================");
		   	    System.out.println("|               Statistiques :                 |");
		   	    System.out.println("================================================");
		   	    System.out.println("| Options:                                     |");
		   	    System.out.println("|       1. Nombre de locations                 |");
		   	    System.out.println("|       2. Total des revenus                   |");
		   	    System.out.println("|       3. Liste des clients à risque          |");
		     	System.out.println("|       4.menu principal                       |");
		   	    System.out.println("================================================");
		   		choix1=s.nextInt();
		   		switch (choix1) {
		   	    case 1:
		   	      locations.nbl();
		   	   choix1=0;
		   	      break;
		   	    case 2:
		   	      locations.rt();
		   	   choix1=0;
		   	      break;
		   	    case 3:
		   	     locations.cltr();
		   	  choix1=0;
		   	      break;
		   	    case 4:
		   	    choix=0;
		   	    }}while((choix1!=1)&&(choix1!=2)&&(choix1!=3)&&(choix1!=4));
		      break;
 		    }
	}while((choix!=1)&&(choix!=2)&&(choix!=3)&&(choix!=4)&&(choix!=5));
		
		
}}		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		




