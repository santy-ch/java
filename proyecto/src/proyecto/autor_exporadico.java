package proyecto;

public class autor_exporadico extends autor{
	
	private String institucion;

	public autor_exporadico(String institucion, String nombre, String apellido, int cedula) {
		super(nombre, apellido, cedula);
		this.institucion=institucion;
	}
	
		public autor_exporadico() {
			
			System.out.println("objeto autor exporadico");
			
	}

		public String getInstitucion() {
			return institucion;
		}

		public void setInstitucion(String institucion) {
			this.institucion = institucion;
		}

		@Override
		public void registro() {
			// TODO Auto-generated method stub
			System.out.println("desde autor exporadico");
		}
		
}
