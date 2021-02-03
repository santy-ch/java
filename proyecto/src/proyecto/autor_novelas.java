package proyecto;

public class autor_novelas extends autor {

	private String credenciales;
	
	public autor_novelas(String credenciales, String nombre, String apellido, int cedula) {
		super(nombre, apellido, cedula);
		this.credenciales=credenciales;
		
	}
	public autor_novelas() {
		System.out.println("objeto autor de novelas");
		
	}
	public String getCredenciales() {
		return credenciales;
	}
	public void setCredenciales(String credenciales) {
		this.credenciales = credenciales;
	}
	@Override
	public void registro() {
		// TODO Auto-generated method stub
		System.out.println("desde autor novelas");
	}
}
