package p1;
import java.util.*;  
import java.text.SimpleDateFormat;  
import java.text.ParseException; 
public class LocEnCours extends Location  {
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	public ArrayList<Location> locations=new ArrayList<Location>();
	 LocHistorique historique =new LocHistorique();
	private Scanner sc=new Scanner (System.in);
	
Location loc;
	
	public void afficher_loc() {
		System.out.println("+location :");
		for(int i = 0 ; i < locations.size(); i++) {
			System.out.println("+location :"+(i+1));
		locations.get(i).V.afficher(locations.get(i).V);
		locations.get(i).clt.afficher(locations.get(i).clt);
		
	}}
	public void afficher_loc_clt(String CIN) {
	
		for(int i = 0 ; i < locations.size(); i++) {
				if(locations.get(i).clt.NCIN.compareTo(CIN)==0)
		   locations.get(i).V.afficher(locations.get(i).V);
		
		
	}}
	
	
	public void ajouter(Voiture a , Client c) {
		
		loc=new Location();
		loc.afecterC(c);
		loc.afecterV(a);
		loc.dates_l();
		loc.prix();
		if(loc.avance!=0)
		locations.add(loc);
		if(loc.avance==0) {
			System.out.println("il faut  payer une avance ");
		
		}
		
		
	}
	public void supp_loc() throws ParseException {

long difference_In_Time;
long difference_In_Days;
		String a=new String();
		String z=new String();
		 String now;
		 Date NOW;
		 Date date;
		 int choix,C;
		Calendar c = Calendar.getInstance();
		  now=sdf.format(c.getTime());
		  do {
		System.out.println("donner le cin de client :");
		a=sc.next();
		}while((a.length()!=8)&&((a.substring(0,0).compareTo("0")!=0)||(a.substring(0,0).compareTo("1")!=0)));
		do {
		  System.out.println("donner le mat de voiture :");
		z=sc.next();
		}while(z.contains("TUN")==false);
		for(int i=0;i<locations.size();i++) {
			if(locations.get(i).clt.NCIN.compareTo(a)==0) {
			if(locations.get(i).V.mat.compareTo(z)==0) {
				do {
				System.out.println("voiture en bon etat?('1'oui,'0'non)");
				C=sc.nextInt();
				}while((C!=1)&&(C!=0));
				if(C==1) {
					locations.get(i).etatv="bon etat";
				}
				if(C==0) {
					locations.get(i).etatv="mauvais etat";
				}
				  NOW=sdf.parse(now);
				   date =sdf.parse(locations.get(i).dfl);
				   if((NOW.compareTo(date)==0)||(NOW.compareTo(date)<0)) {
					   locations.get(i).retard=false;
				   historique.ajouter(locations.get(i));
					locations.remove(locations.get(i));
				   }
				   if(NOW.compareTo(date)>0) {
					   difference_In_Time= NOW.getTime() - date.getTime();
					   difference_In_Days= (difference_In_Time / (1000 * 60 * 60 * 24))% 365;
					   do {
					   System.out.println("il faut payer les jour en retatrd pour suprimer le contrat"+(locations.get(i).pxlu*difference_In_Days)+"dt"+"('1'=oui;'0'=non)");
				  choix=sc.nextInt();
					   }while((choix!=1)&&(choix!=0));
				  if(choix==1)
					 
					  historique.ajouter(locations.get(i));
					  locations.remove(locations.get(i));
					 
				  
				   }
					 
				  
			
			}		
		}
			else System.out.println("contrat n'existe pas");
			
	}

 }
	


public void his() {
	historique.afficher();
}


//statss
public void nbl() throws ParseException {
Date dd,df,d1,d2;

int nbl=0;

	System.out.println("donner le date de debut de la periode :(annee/mois/jouur) ");
	d1=sdf.parse(sc.next());
	System.out.println("donner le date de fin de la periode :(annee/mois/jouur )");
	d2=sdf.parse(sc.next());
for(int i=0;i<locations.size();i++) {
	dd=sdf.parse(locations.get(i).ddl);
	df=sdf.parse(locations.get(i).dfl);
	if((d1.compareTo(dd)<0)||(d1.compareTo(dd)==0))
	{if((d2.compareTo(df)>0)||(d2.compareTo(df)==0))
		nbl=nbl+1;
	}
}
nbl=nbl+historique.nb(d1, d2);
System.out.println("nombre de location :"+nbl);
}







public void rt() throws ParseException {
Date dd,df,d1,d2;

int revenu=0;
System.out.println("donner le date de debut de la periode :(annee/mois/jouur )");
d1=sdf.parse(sc.next());
System.out.println("donner le date de fin de la periode :(annee/mois/jouur) ");
d2=sdf.parse(sc.next());
for(int i=0;i<locations.size();i++) {
	dd=sdf.parse(locations.get(i).ddl);
	df=sdf.parse(locations.get(i).dfl);
	if((d1.compareTo(dd)<0)||(d1.compareTo(dd)==0))
	{if((d2.compareTo(df)>0)||(d2.compareTo(df)==0))
		revenu=revenu+locations.get(i).pxl;
	}
} 
revenu=revenu+historique.rt(d1, d2);
System.out.println("le revenu total de cette periode c'est :"+revenu+"dt");
}

public void cltr() {
	historique.clt_Risque();
}



}