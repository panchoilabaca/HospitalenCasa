package hospitalEnCasa;



public class Profesional_medico{
	private String nombre;
	private int rut;
	Tipo_profesional tipo_profesional;
	
	public Profesional_medico(String nombre, int rut) {
		
		this.nombre = nombre;
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}
	
	
	
	
	

}
