package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	Connection con;
	
	public Connection getConnection() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/boostrap", "root","");
		} catch (Exception e) {
			
		System.out.println("Error de Conexion");
			
		}		
		return con;
	}
	
}