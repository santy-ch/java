package proyecto;

public class publicacion {

	private String datos_autor;
	private int fecha;
	private String area_tematica;
	

	public publicacion(String datos_autor, int fecha, String area_tematica) {
		this.datos_autor=datos_autor;
		this.fecha=fecha;
		this.area_tematica=area_tematica;
	
	}
	
	public publicacion() {
		
		System.out.println("objeto publicacion");
	
	}
	

	public String getDatos_autor() {
		return datos_autor;
	}

	public void setDatos_autor(String datos_autor) {
		this.datos_autor = datos_autor;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getArea_tematica() {
		return area_tematica;
	}

	public void setArea_tematica(String area_tematica) {
		this.area_tematica = area_tematica;
	}
	
	
	
	
}
