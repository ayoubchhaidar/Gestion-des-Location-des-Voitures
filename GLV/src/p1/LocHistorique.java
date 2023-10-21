package p1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LocHistorique{
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

	public ArrayList<Location> historique=new ArrayList<Location>();
	
	
	public void ajouter(Location l) {
		historique.add(l);
	}
	
	public void afficher() {
		for(int i=0;i<historique.size();i++) {
			System.out.println("+ contrat :"+(i+1));
			System.out.println("voitur en "+historique.get(i).etatv);
			if(historique.get(i).retard==true)
				System.out.println("il y a un retard dans la remise du véhicule");
			else
				System.out.println("il n'y a pas un retard dans la remise du véhicule");
			historique.get(i).V.afficher(historique.get(i).V);
			historique.get(i).afficherclt();
		
		}
	}
	
	
	public void clt_Risque() {
		System.out.println("liste des clients a risque : "); 
		for(int i = 0 ; i < historique.size(); i++) {
			
			if((historique.get(i).retard==true)||(historique.get(i).etatv.compareTo("mauvais etat")==0)) {
				
				historique.get(i).afficherclt();

			}
	}

}
	public int nb(Date d1,Date d2) throws ParseException {
		Date dd,df;
		int nb=0;
	
		for(int i=0;i<historique.size();i++) {
			dd=sdf.parse(historique.get(i).ddl);
			df=sdf.parse(historique.get(i).dfl);
			if((d1.compareTo(dd)<0)||(d1.compareTo(dd)==0))
			{if((d2.compareTo(df)>0)||(d2.compareTo(df)==0))
				nb=nb+1;
			}
		}
return nb;
}
	public int rt(Date d1,Date d2) throws ParseException {
		Date dd,df;
		int r=0;
	
		for(int i=0;i<historique.size();i++) {
			dd=sdf.parse(historique.get(i).ddl);
			df=sdf.parse(historique.get(i).dfl);
			if((d1.compareTo(dd)<0)||(d1.compareTo(dd)==0))
			{if((d2.compareTo(df)>0)||(d2.compareTo(df)==0))
				r=r+historique.get(i).pxl;
			}
		}
return r;
}
}