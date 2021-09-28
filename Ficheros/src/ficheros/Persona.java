package ficheros;

public class Persona {

	protected String nie;
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String email;
	
	
	public String getNia() {
		return nie;
	}


	public void setNia(String nie) {
		this.nie = nie;
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


	public Persona(String nia, String nombre, String apellido1, String apellido2, String email) {
		this.nie = nia;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.email = email;
	}
}
