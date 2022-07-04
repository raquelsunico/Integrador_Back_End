package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonaDAO implements Validar {
	Connection con;
	Conexion cn=new Conexion();
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public int validar(Persona per) {
		int r=0;
		String sql="select *from  usuarios where nombres=? and email=?";
		
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, per.getNombres());
			ps.setString(2, per.getEmail());
			rs=ps.executeQuery();
			
			while(rs.next()) {
				r=r+1;
				per.setNombres(rs.getString("Nombres"));
				per.setEmail(rs.getString("Email"));
				
			}
			if (r==1) {
				return 1;
			}else {
				return 0;
			}
			
			
		} catch (Exception e) {
			return 0;
	}
}



	private PreparedStatement PreparedStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
