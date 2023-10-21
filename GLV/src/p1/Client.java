package p1;

import java.util.Scanner;

public class Client {
	
String NCIN;
String nom;
String prenom;
String adresse;

private Scanner sc=new  Scanner (System.in);
public void init() {
	System.out.println("nom");
	nom=sc.next();
	System.out.println("prenom");
	prenom=sc.next();
	System.out.println("adresse");
	sc.nextLine();
	adresse=sc.nextLine();
	do {
	System.out.println("CIN");
    NCIN=sc.next();
}while((NCIN.length()!=8)&&((NCIN.substring(0,0).compareTo("0")!=0)||(NCIN.substring(0,0).compareTo("1")!=0)));
}

public void afficher(Client c) {
	
	System.out.println("nom : "+c.nom);

	System.out.println("prenom : "+c.prenom);
	
	System.out.println("adresse : "+c.adresse);

	System.out.println("CIN : "+c.NCIN);
  
	
}
}
