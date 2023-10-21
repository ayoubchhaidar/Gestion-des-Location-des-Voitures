package p1;

import java.util.ArrayList;
import java.util.Scanner;

public class Clients extends Client {
	private Scanner sc=new  Scanner (System.in);

	public ArrayList<Client> clients=new ArrayList<Client>();


	public void ajouterclt() {
		Client c=new Client();
		boolean verif=true;
	do{
	    
		c.init();
		if(clients.size()>0) {
		for(Client elem:clients) {
			if(c.NCIN.compareTo(elem.NCIN)==0) {
			System.out.println("client existatnt");
			verif=false;}
			else
				verif=true;}}
	}while(!verif);
				clients.add(c); 
			

		}

	public void afficherclt() {
		for(int i = 0 ; i < clients.size(); i++) {
			System.out.println("clt"+(i+1));
			 System.out.println("numero C.I.N : "+clients.get(i).NCIN); 
			 System.out.println("prenom : "+clients.get(i).prenom);
			 System.out.println("nom : "+clients.get(i).nom);
			 System.out.println("adresse : "+clients.get(i).adresse);
		}}
	public  Client choix_clt() {
		Client C=new Client();
		int t;
		int choix;
		do {
		System.out.println("-client existant?('1 = oui'&'0 = non') :");
		t=sc.nextInt();
		}while((t!=1)&&(t!=0));
		if(t==1) {
			for(int i = 0 ; i < clients.size(); i++) {
				System.out.println("clt"+(i+1));
				 System.out.println("numero C.I.N : "+clients.get(i).NCIN); 
				 System.out.println("prenom : "+clients.get(i).prenom);
				 System.out.println("nom : "+clients.get(i).nom);
				 System.out.println("adresse : "+clients.get(i).adresse);
			}
			do {
			System.out.println("choisir l'indice du client :");
			choix=sc.nextInt();
			}while((choix>=clients.size()+1	)||(choix==0));
			C=clients.get(choix-1);
		}
		
		if(t==0) {
			
			boolean verif=true;
		do{
		    
			C.init();
			if(clients.size()>0) {
			for(Client elem:clients) {
				if(C.NCIN.compareTo(elem.NCIN)==0) {
				System.out.println("client existatnt");
				verif=false;}
				else
					verif=true;}}
		}while(!verif);
				
	clients.add(C);


		}

	return C;
	}
}
