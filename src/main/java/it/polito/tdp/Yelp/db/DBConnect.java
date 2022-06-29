package it.polito.tdp.Yelp.db;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class DBConnect {
	
	private static HikariDataSource ds = null;
	static private String jdbcurl="jdbc:mysql://localhost:3306/yelp";

	public static Connection getConnection() {
		
		if(ds==null) { /* PATTERN SINGLETON */
			// creazione nuova DataSource
			ds = new HikariDataSource();
			ds.setJdbcUrl(jdbcurl);
			ds.setUsername("root");
			ds.setPassword("root");
		}
		
		// ritornare la DS
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
//		String url = "jdbc:mysql://localhost:3306/yelp?user=root&password=root";
//		try {
//			Connection conn = DriverManager.getConnection(url);
//			return conn ;
//		} catch (SQLException e) {
//			System.out.println("ERRORE di connessione al database");
//			e.printStackTrace();
//			return null ;
//		}
	}
}
