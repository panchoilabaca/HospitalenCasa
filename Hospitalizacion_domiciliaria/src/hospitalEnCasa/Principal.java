package hospitalEnCasa;

public class Principal {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("Juan", "Perez", 53363451, "Calle Los patos");
		Paciente paciente2 = new Paciente("Pedro", "Gonzalez", 14563245, "Calle los gatos");
		Paciente paciente3 = new Paciente("Francisco", "Torres", 21334675, "Calle azul");
		
		Profesional_medico profesional_medico1 = new Profesional_medico("Mario", 21543678);
		Profesional_medico profesional_medico2 = new Profesional_medico("Ana", 17654323);
		Profesional_medico profesional_medico3 = new Profesional_medico("Jose", 17654323);
		
		Tipo_profesional tipo_profesional1 = new Tipo_profesional("Medico", "", "");
		Tipo_profesional tipo_profesional2 = new Tipo_profesional("", "Enfermera", "");
		Tipo_profesional tipo_profesional3 = new Tipo_profesional("", "", "Tens");
		
		Procedimiento procedimiento1 = new Procedimiento("Control General", "", "");
		Procedimiento procedimiento2 = new Procedimiento("", "Curacion Herida", "");
		Procedimiento procedimiento3 = new Procedimiento("", "", "Cambio de Oxigeno");
		
		
		Insumos insumos1 = new Insumos("Oxigeno", "", "", "");
		Insumos insumos2 = new Insumos("", "Cama Clinica", "", "");
		Insumos insumos3 = new Insumos("", "", "Guantes", "");
		Insumos insumos4 = new Insumos("", "", "", "Jeringa");
		
		Proveedor Proveedor1 = new Proveedor("Oxigeno Pepe", "Oxigeno");
		Proveedor Proveedor2 = new Proveedor("Camas Juanito", "Cama Clinica");
		Proveedor Proveedor3 = new Proveedor("Guantes Don Jose", "Guantes");
		Proveedor Proveedor4 = new Proveedor("Jeringas Pincha", "Jeringas");
		
		System.out.println("El paciente de nombre " + paciente1.getNombre() + " y de apellido "  +  paciente1.getApellido() + " Numero de rut " + paciente1.getRut() + " y vive en " + paciente1.getDireccion() ); 
		System.out.println("Fue visitado por " +profesional_medico1.getNombre());
		System.out.println("Quien es " + tipo_profesional1.getMedico() + " y tiene el numero de rut " + profesional_medico1.getRut());
		System.out.println("Para realizar el procedimiento de " + procedimiento1.getControl_general());
		System.out.println("Donde se usaron " + insumos3.getGuantes());
		System.out.println("Del proveedor " + Proveedor3.getNombre_empresa());
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("El paciente de nombre " + paciente2.getNombre() + " y de apellido "  +  paciente2.getApellido() + " Numero de rut " + paciente2.getRut() + " y vive en " + paciente2.getDireccion() ); 
		System.out.println("Fue visitado por " +profesional_medico2.getNombre());
		System.out.println("Quien es " + tipo_profesional2.getEnfermera() + " y tiene el numero de rut " + profesional_medico2.getRut());
		System.out.println("Para realizar el procedimiento de " + procedimiento2.getCuracion());
		System.out.println("Donde se usaron " + insumos3.getGuantes() + " y " + insumos4.getJeringa());
		System.out.println("Del proveedor " + Proveedor3.getNombre_empresa() + " y del " +  Proveedor4.getNombre_empresa());
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("El paciente de nombre " + paciente3.getNombre() + " y de apellido "  +  paciente3.getApellido() + " Numero de rut " + paciente3.getRut() + " y vive en " + paciente3.getDireccion() ); 
		System.out.println("Fue visitado por " +profesional_medico3.getNombre());
		System.out.println("Quien es " + tipo_profesional3.getTens() + " y tiene el numero de rut " + profesional_medico3.getRut());
		System.out.println("Para realizar el procedimiento de " + procedimiento3.getCambio_oxigeno());
		System.out.println("Donde se usaron " + insumos3.getGuantes() + " y " + insumos4.getJeringa() + " y " + insumos1.getOxigeno());
		System.out.println("Del proveedor " + Proveedor1.getNombre_empresa() + " y del " +  Proveedor4.getNombre_empresa() + " y del " + Proveedor3.getNombre_empresa());
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		
	}
      
	 
}


