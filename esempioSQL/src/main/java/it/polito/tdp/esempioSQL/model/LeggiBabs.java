package it.polito.tdp.esempioSQL.model;


import java.util.List;

import it.polito.tdp.esempioSQL.db.BabsDAO;


public class LeggiBabs {
	
	
	public void run() {
	//porta d'accesso al mio db
	 BabsDAO dao = new BabsDAO();
	 //i metodi del dao lavorano a oggetti
	 List <Station> tutte = dao.listStation();
 		
	 for(Station s: tutte) {
		 System.out.println(s.getName());
	 }
	 System.out.println("------");
	 List <Station > paloAlto = dao.listStationByLandmark("Paolo Alto");
	
	 for(Station s: paloAlto) {
		 System.out.println(s.getName());
	 }
	}
	
	public static void main (String args[]) {
		LeggiBabs babs = new LeggiBabs();
		babs.run();
		
	}

}
