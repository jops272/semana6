package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static Connection getConexion() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/db_login";
			String usuario = "root";
			String contrasenia = "soporte";
			
			con = DriverManager.getConnection(url, usuario, contrasenia);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el Driver");
			
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error con la base de datos");
			
			e.printStackTrace();
		}
		return con;
		
		
	}
	
	/*Connection conectar;
    
    String usuario = "root";
    String contrasenia = "soporte";
    String bd = "db_login";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null, "Conectado a BD");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas de conexión"+e.toString());
        }
        return conectar;
    }*/
}
