package proyecto;

public abstract class autor {
	
	private String nombre;
	private String apellido;
	private int cedula;
	


	public autor(String nombre, String apellido, int cedula) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.cedula=cedula;
	
	}

	public autor() {
		
		System.out.println("objeto autor");
	
	}
	
	public  abstract void registro();
	
	
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
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	
	
}
