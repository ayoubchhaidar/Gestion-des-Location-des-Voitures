package p1;
import java.util.*;
public  class Voiture {
     String mat;
	String marque;
	String constructeur;
	String etat="disponible";

	private Scanner d = new Scanner (System.in);

		 public void voiture(String mat, String marque, String constructeur){
		        this.mat =  mat;
		        this.marque = marque;
		        this.constructeur = constructeur;

		    }
	
		public void afficher (Voiture c){
		 
		System.out.println("voiture : ");
		System.out.println("mat : "+c.mat);
		System.out.println("const : "+c.constructeur);
		System.out.println("marque : "+c.marque);	
		System.out.println("état : "+c.etat);	
	}	
		public void modetat(Voiture c) {
			
				  int e;
					  System.out.println("etat de voiture : "+c.etat);
					  do {
					  System.out.println("changer l'etat de voiture?:('0'pour <disponible> ,'1' pour <loué> ,'2' pour  <en Réparation>)");
			        		 e=d.nextInt();
					  }while((e!=1)&&(e!=0)&&(e!=2));
			        		if(e==1) {c.etat="loué";}	
			                if(e==0) {c.etat="disponible";}
			        		if(e==2) {c.etat="en cour de réparation";	}
			        		}}


