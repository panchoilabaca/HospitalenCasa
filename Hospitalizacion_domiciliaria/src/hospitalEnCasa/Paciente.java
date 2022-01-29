package hospitalEnCasa;

public class Paciente {
	
	private String nombre;
	private String apellido;
	private int rut;
	private String direccion;
	Profesional_medico profesional_medico;
	Tipo_profesional tipo_profesional;
	
	
	public Paciente(String nombre, String apellido, int rut, String direccion) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	
	
	
	

}
