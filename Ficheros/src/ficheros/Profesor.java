package ficheros;

public class Profesor extends Persona {

	


	private String nombre;
	private String apellido1;
	private String apellido2;
	private  String email;
	private String departamento;
	
	
	public Profesor(String nie, String nombre, String apellido1, String apellido2, String email,String dep) {
		super(nie, nombre, apellido1, apellido2, email);
		this.departamento=dep;
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
