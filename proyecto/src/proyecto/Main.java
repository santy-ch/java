package proyecto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		publicacion publi = new publicacion();
		
		
		
		publi.setDatos_autor("aqui va los datos detallados del autor");
		System.out.println(publi.getDatos_autor());
		
		publi.setFecha(2020);
		System.out.println(publi.getFecha());
		
		publi.setArea_tematica("aqui va la area tematica");
		System.out.println(publi.getArea_tematica());
	}

}
