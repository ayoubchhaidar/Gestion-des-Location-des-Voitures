package p1;
import java.util.*;

public class Parc extends Voiture{
	 public ArrayList<Voiture> parc=new ArrayList<Voiture>();
	

		private Scanner S=new Scanner (System.in);
		
		Voiture v;
	
		public void ajouter() {
		
			 String mat,marque,constructeur;
			 v=new Voiture();
				boolean verif=true;
			 do {
				 do {
				
			System.out.println("Numéro d’immatriculation :(***TUN***)");
			mat=S.next();
			if(parc.size()>0) {
				for(Voiture elem:parc) {
					if(mat.compareTo(elem.mat)==0) {
					System.out.println("voiture existatnt");
					verif=false;}
					else
						verif=true;}}
			}while(!verif);
			 }while(mat.contains("TUN")==false);
			System.out.println("constructeur :");
			constructeur=S.next();
			System.out.println("marque :");
			marque=S.next();
			v.voiture(mat, marque, constructeur);
			 parc.add(v);
		}
		
		
		public void afficher() {
		
			  for (Voiture V: parc) {
				  System.out.println("+ voiture : "+(parc.indexOf(V)+1));
		            System.out.println("matricule: "+V.mat+"\n"+"constructeur: "+V.constructeur+"\n"+ "marque:  "+V.marque+"\n"+ "etat: "+V.etat);
		            
		        }
		}
			  
			  public void supp(String m) {
				 for (int i = 0; i < parc.size(); i++) {
			        	 if ((parc.get(i).mat.compareTo(m))==0) {
			           			   parc.remove(parc.get(i));
			            }
			        }}
			  
			  public void modd() {
				  int i;
				  for (Voiture V: parc) {
					  System.out.println("+ voiture : "+(parc.indexOf(V)+1));
					  System.out.println("matricule: "+V.mat+"\n"+"constructeur: "+V.constructeur+"\n"+ "marque:  "+V.marque+"\n"+ "etat: "+V.etat);
			            
			        }
				  do {
				 System.out.println("l'indice de voiture");
				 i=S.nextInt();
				 }while((i>=parc.size()+1)||(i==0));
				 parc.get(i-1).modetat(parc.get(i-1));
			  }
				
			  
			
			public void voitures_dispo(){
				System.out.println(" Liste des véhicules disponible :");
				  for (Voiture V: parc) {
					  if(V.etat.compareTo("disponible")==0) {
						  System.out.println("+ voiture : "+(parc.indexOf(V)+1));
					  System.out.println("matricule: "+V.mat+"\n"+"constructeur: "+V.constructeur+"\n"+ "marque:  "+V.marque+"\n"+ "etat :"+V.etat);
			        }}
				
			}
			public void voitures_loué(){
				System.out.println(" Liste des véhicules loué :");
				  for (Voiture V: parc) {
					  if(V.etat.compareTo("loué")==0) {
						  System.out.println("+ voiture : "+(parc.indexOf(V)+1));
					  System.out.println("matricule: "+V.mat+"\n"+"constructeur: "+V.constructeur+"\n"+ "marque:  "+V.marque+"\n"+ "etat: "+V.etat);
			        }}
				
			}
			public void voitures_rep(){
				System.out.println(" Liste des véhicules en cours de réparation :");
				  for (Voiture V: parc) {
					  if(V.etat.compareTo("en cour de réparation")==0) {
						  System.out.println("+ voiture : "+(parc.indexOf(V)+1));
					  System.out.println("matricule: "+V.mat+"\n"+"constructeur: "+V.constructeur+"\n"+ "marque:  "+V.marque+"\n"+ "etat: "+V.etat);
			        }}
				
			}
				
			
			public Voiture Choixv() {
				int m;
				do {
				for(int i = 0 ; i < parc.size(); i++)  {
					System.out.println((parc.indexOf(parc.get(i))+1));
				    parc.get(i).afficher(parc.get(i));
				}
				do {
				System.out.println("indice du voiture");
				m=S.nextInt();
				}while((m>=parc.size()+1)||(m==0));
				v=parc.get(m-1);
				if((v.etat=="loué")||(v.etat=="en cour de réparation")) {
					System.out.println("voiture deja loué ou en cours de réparation");
				}
				}while(v.etat!="disponible");
				for(int i = 0 ; i < parc.size(); i++){
					if(parc.get(i).mat==v.mat)
						parc.get(i).etat="loué";
				}
				return v;
			}

			}
			  
			  
			  
			  
			  
			
