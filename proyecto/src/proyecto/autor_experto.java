package proyecto;

public class autor_experto extends autor{
	

	private String listas;
	
	public autor_experto(String listas, String nombre, String apellido, int cedula) {
		super(nombre, apellido, cedula);
		this.listas=listas;
		
	}
	
	public autor_experto() {
		System.out.println("objeto autor esperto");
	}

	public String getListas() {
		return listas;
	}

	public void setListas(String listas) {
		this.listas = listas;
	}

	@Override
	public void registro() {
		// TODO Auto-generated method stub
		
		System.out.println("desde autor experto");
	}
}
