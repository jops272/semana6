package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.Usuario;

public class VLogin {
	
	public Usuario validarUsuario(Usuario usu){
		
		Usuario usuario = null;
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
        try {
			con = Conexion.getConexion();
			
			String sql = "SELECT * FROM usuario WHERE Username = ? AND Password = ?";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, usu.getUsername());
			pst.setString(2, usu.getPassword());
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				usuario = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3));
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener usuario");
		}
        return usuario;
    }
}
