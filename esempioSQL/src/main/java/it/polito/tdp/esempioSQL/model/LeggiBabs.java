package it.polito.tdp.esempioSQL.model;


import java.util.List;

import it.polito.tdp.esempioSQL.DB.BabsDAO;


public class LeggiBabs {
	
	
	public void run() {
	//porta d'accesso al mio db
	 BabsDAO dao = new BabsDAO();
	 
	 List <Station> tutte = dao.listStation();
 		
	 for(Station s: tutte) {
		 System.out.println(s.getName());
	 }
	}
	
	public static void main (String args[]) {
		LeggiBabs babs = new LeggiBabs();
		babs.run();
		
	}

}
