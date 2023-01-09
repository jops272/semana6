package modelo;

public class Usuario {
	 private String Rut;
	 private String Username; 
	 private String Password;
	 
	 
	public Usuario(String rut, String username, String password) {
		
		Rut = rut;
		Username = username;
		Password = password;
	}


	public Usuario() {
		
	}


	public String getRut() {
		return Rut;
	}


	public void setRut(String rut) {
		Rut = rut;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	 
	
	 
}
