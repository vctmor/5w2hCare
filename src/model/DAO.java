package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	
	private Connection con;
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://192.168.15.22:3306/db5w2h";
	private String user = "root";
	private String password = "a1234567";
	
	public Connection connect() {
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			return con;
			
		} catch (Exception e) {
			
			System.out.println(e);
			//e.printStackTrace(); // Alterado para imprimir o stack trace completo para facilitar a depuração
			return null;
		}
	}

}
