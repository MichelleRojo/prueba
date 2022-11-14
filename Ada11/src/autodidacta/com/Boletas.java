package autodidacta.com;

public class Boletas {

	private Articulo articulo;
	private int cantidad;
	
	public  Boletas(String item, int cantidad) {
    this.articulo = item;
    this.cantidad = cantidad;  
	}

	public int getCantidad() {
		return cantidad;
	}


	public Articulo getArticulo() {
		return articulo;
	}

	
	}
	


