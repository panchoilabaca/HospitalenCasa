package hospitalEnCasa;

public class Tipo_profesional  {
	
	private String medico;
	private String enfermera;
	private String tens;
	
	
	public Tipo_profesional(String medico, String enfermera, String tens) {
		
		this.medico = medico;
		this.enfermera = enfermera;
		this.tens = tens;
	}


	
   
    
    public String getMedico() {
		return medico;
	}


	public void setMedico(String medico) {
		this.medico = medico;
	}


	public String getEnfermera() {
		return enfermera;
	}


	public void setEnfermera(String enfermera) {
		this.enfermera = enfermera;
	}


	public String getTens() {
		return tens;
	}


	public void setTens(String tens) {
		this.tens = tens;
	}

}
