package modelo;

import java.sql.Date;

public class Persona {
	private String Rut;
	private String Nombre;
	private String Apellido;
	private String Telefono;
	private Date FechaIngreso;
	
	
	public Persona(String rut, String nombre, String apellido, String telefono, Date fechaIngreso) {
		
		Rut = rut;
		Nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
		FechaIngreso = fechaIngreso;
	}


	public String getRut() {
		return Rut;
	}


	public void setRut(String rut) {
		Rut = rut;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public Date getFechaIngreso() {
		return FechaIngreso;
	}


	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	
	
	
}
