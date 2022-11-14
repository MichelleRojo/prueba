package autodidacta.com;

public class Planetademo {

	public static void main(String[]args) {
		Planeta tierra = new Planeta();
		tierra.setNombre("Tierra");
		tierra.setCantidadSatelites(1);
	    tierra.setMasa(4);
	    tierra.setDiametro(455);
	    tierra.setTipoPlaneta("terrestre");
	    tierra.setDistanciaMedia(4578);
	    tierra.setEsObservable(true);	    
	    System.out.println(tierra.toString());
	    System.out.println("La densidad de " + tierra.getNombre() + tierra.calcularDensidad());
	    System.out.println("Es un planeta exterior " + tierra.esExterior());
	    
	  
	}
}
