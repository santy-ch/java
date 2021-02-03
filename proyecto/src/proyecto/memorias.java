package proyecto;

public class memorias extends publicacion implements consultar_referencia {
	
	private String nombre_evento;
	private String url;
	

	public memorias(String nombre_evento, String url, String datos_autor, int fecha, String area_tematica) {
		super(datos_autor, fecha, area_tematica);
		this.nombre_evento=nombre_evento;
		this.url=url;
	}
	
	public memorias() {
		System.out.println("objeto memorias");
	}


	public String getNombre_evento() {
		return nombre_evento;
	}


	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}

	
	public void consultar_referencias() {
		// TODO Auto-generated method stub
		System.out.println("consulta desde memorias");
	}

	

	

}
