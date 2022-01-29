package hospitalEnCasa;

public class Procedimiento {
	private String control_general;
	private String curacion;
	private String cambio_oxigeno;
    Proveedor proveedor;
	
	
	public Procedimiento(String control_general, String curacion, String cambio_oxigeno) {
		
		this.control_general = control_general;
		this.curacion = curacion;
		this.cambio_oxigeno = cambio_oxigeno;
	}


	public String getControl_general() {
		return control_general;
	}


	public void setControl_general(String control_general) {
		this.control_general = control_general;
	}


	public String getCuracion() {
		return curacion;
	}


	public void setCuracion(String curacion) {
		this.curacion = curacion;
	}


	public String getCambio_oxigeno() {
		return cambio_oxigeno;
	}


	public void setCambio_oxigeno(String cambio_oxigeno) {
		this.cambio_oxigeno = cambio_oxigeno;
	}
	
	
	

}
