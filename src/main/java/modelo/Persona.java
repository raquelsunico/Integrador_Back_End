package modelo;

public class Persona {
	private int id;
	private String nombres;
	private String email;
	
	public Persona() {
		
	}

	public Persona(int id, String nombres, String email) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
		
}