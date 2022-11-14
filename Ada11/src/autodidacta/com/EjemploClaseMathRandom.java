package autodidacta.com;

public class EjemploClaseMathRandom {

	public static void main(String[] args) {
		String [] colores= {"azul", "marron", "verde", "amarillo", "naranja", "vioelta","lila"};
		double random = Math.random();
	System.out.println("random = " + random);
	//Para pedir un numero aleartorio del 1 al 7 se pide asi:
	random *= colores.length;
    System.out.println(random);
    random =Math.floor(random);
    System.out.println("random = " + random);
	System.out.println("colores = " + colores[(int) random] );
	
	}

}
