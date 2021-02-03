package proyecto;

public class articulo extends publicacion implements consultar_referencia{
	
	private String nombre_revista;
	private String codigo_doi;
	
	
	public articulo(String nombre_revista, String codigo_doi, String datos_autor, int fecha, String area_tematica) {
		super(datos_autor, fecha, area_tematica);
		this.nombre_revista=nombre_revista;
		this.codigo_doi=codigo_doi;
	}
	
	public articulo() {
		System.out.println("objeto articulo");
	}


	public String getNombre_revista() {
		return nombre_revista;
	}


	public void setNombre_revista(String nombre_revista) {
		this.nombre_revista = nombre_revista;
	}


	public String getCodigo_doi() {
		return codigo_doi;
	}


	public void setCodigo_doi(String codigo_doi) {
		this.codigo_doi = codigo_doi;
	}

	
	public void consultar_referencias() {
		// TODO Auto-generated method stub
		System.out.println("consulta desde articulo");
	}

	

	

}
