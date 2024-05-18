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

	


    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * @return String return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return String return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return String return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
