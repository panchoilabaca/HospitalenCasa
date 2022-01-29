package hospitalEnCasa;

public class Proveedor {
	
	private String nombre_empresa;
	private String insumo;
	
	
	public Proveedor(String nombre_empresa, String insumo) {
		
		this.nombre_empresa = nombre_empresa;
		this.insumo = insumo;
	}


	public String getNombre_empresa() {
		return nombre_empresa;
	}


	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}


	public String getInsumo() {
		return insumo;
	}


	public void setInsumo(String insumo) {
		this.insumo = insumo;
	}


	
	}
	
	


