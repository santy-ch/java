package proyecto;

public class libro extends publicacion implements consultar_referencia {
	
	
	public libro(String datos_autor, int fecha, String area_tematica) {
		super(datos_autor, fecha, area_tematica);
		
	}
	
	public libro() {
		System.out.println("objeto libro");
	}

	
	public void consultar_referencias() {
		// TODO Auto-generated method stub
		System.out.println("consulta desde libro");
	}
	

	
	
}
