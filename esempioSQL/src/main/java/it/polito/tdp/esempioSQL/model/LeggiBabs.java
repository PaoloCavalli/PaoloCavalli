package it.polito.tdp.esempioSQL.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LeggiBabs {
	
	
	public void run() {
		String jdbcURL = "jdbc:mysql://localhost/babs?user=root&password=root";
	
		try {
			Connection conn= DriverManager.getConnection(jdbcURL);
		
			
			
			String sql = "SELECT name FROM station WHERE landmark = ?";
			
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1, "Palo Alto");
			
		    ResultSet res = st.executeQuery();
		     
		    while (res.next()) {
		    	String nomeStazione=res.getString("name");
		    	
		    	System.out.println(nomeStazione);
		    }
		    st.close();
		    
			//Statement st2 = conn.createStatement();
			
		    
	       conn.close();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	 // ^ FACTORY = creazione di un oggetto di una classe,
	// senza conoscere il tipo della classe
		//NON posso usare il new uso un metodo fornito da un altra 
		//classe che fara lei il NEW.
		
	}
	
	public static void main (String args[]) {
		LeggiBabs babs = new LeggiBabs();
		babs.run();
		
	}

}
