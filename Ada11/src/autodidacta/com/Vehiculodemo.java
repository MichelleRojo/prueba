package autodidacta.com;

public class Vehiculodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setAñoFabricacion(2014);
		vehiculo.setColor("marron");
		vehiculo.setMarca("Peugot");
		vehiculo.setMotor(1.8);
		vehiculo.setNumDeAsientos(5);
		vehiculo.setNumeroDePuertas(5);
		vehiculo.setTipoDeAutomovil("familiar");
		vehiculo.setVelocidadActual(0);
		vehiculo.setVelocidadMaxima(250);
		vehiculo.setdistanciaRecorrerEnKm();
		vehiculo.toString();
		//vehiculo.setfrenarCoche();
	}

}
