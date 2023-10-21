package p1;

import java.text.SimpleDateFormat;
import java.util.*;
 
public class Location extends Clients {

	 
	
 Voiture V=new Voiture();
Client clt=new Client();
String ddl=new String();
String dfl=new String();
int pxlu=80;
int pxl;
int avance;
int nb;
String etatv;
boolean retard=true;
private Scanner sc=new  Scanner (System.in);

	
public void afecterC(Client c) {
	clt.adresse=c.adresse;
	clt.NCIN=c.NCIN;
	clt.nom=c.nom;
	clt.prenom=c.prenom;

}

	
	public  void afecterV(Voiture v) {
		V.constructeur=v.constructeur;
		V.etat=v.etat;
		V.marque=v.marque;
		V.mat=v.mat;
}
	
	
	public void dates_l() {
		
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		  Calendar c = Calendar.getInstance();
		  ddl=sdf.format(c.getTime());
		  System.out.println("La date de debut de location "+ddl);
		     System.out.println("nombre de jour de location :");
		     nb=sc.nextInt();
		  c.add(Calendar.DAY_OF_MONTH, nb); 
		   dfl = sdf.format(c.getTime());  
		  System.out.println("Date de fin de location: "+dfl);
		  
	}
	
public void prix() {
	int t;
	pxl=(pxlu*nb);
	do {
	System.out.println("payer montant de l'avance :(1=oui & 0=non)"+"("+(pxl*40/100)+")");
	t=sc.nextInt();
	}while((t!=1)&&(t!=0));
	if(t==1) {
		avance=pxl*40/100;
	}
	if(t==0)
		avance=0;
	
}

}



