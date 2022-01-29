package hospitalEnCasa;

public class Insumos {
	private String oxigeno;
	private String cama_clinica;
	private String guantes;
	private String jeringa;
	
	public Insumos(String oxigeno, String cama_clinica, String guantes, String jeringa) {
		
		this.oxigeno = oxigeno;
		this.cama_clinica = cama_clinica;
		this.guantes = guantes;
		this.jeringa = jeringa;
	}

	public String getOxigeno() {
		return oxigeno;
	}

	public void setOxigeno(String oxigeno) {
		this.oxigeno = oxigeno;
	}

	public String getCama_clinica() {
		return cama_clinica;
	}

	public void setCama_clinica(String cama_clinica) {
		this.cama_clinica = cama_clinica;
	}

	public String getGuantes() {
		return guantes;
	}

	public void setGuantes(String guantes) {
		this.guantes = guantes;
	}

	public String getJeringa() {
		return jeringa;
	}

	public void setJeringa(String jeringa) {
		this.jeringa = jeringa;
	}
	
	

}
