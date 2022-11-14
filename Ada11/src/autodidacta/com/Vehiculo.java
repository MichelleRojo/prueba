package autodidacta.com;

import java.util.Scanner;

public class Vehiculo {

	String marca;
	int añoFabricacion;
	double motor;
	double tipoDeCombustible;
	String tipoDeAutomovil;
	int numeroDePuertas;
	int numDeAsientos;
	double velocidadMaxima;
	String color;
	double velocidadActual;
	int distanciaRecorrerEnKm=20;
	int velocidad;
	//int frenarCoche;
	public Vehiculo() {
	}
    
	public int  setdistanciaRecorrerEnKm() {
		return distanciaRecorrerEnKm ;
		
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}
//	public void setfrenarCoche() {
	//	return ;
		
	//}

	public double getTipoDeCombustible() {
		return tipoDeCombustible;
	}

	public void setTipoDeCombustible(double tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}

	public String getTipoDeAutomovil() {
		return tipoDeAutomovil;
	}

	//public String setTipoDeAutomovil(double tipoDeAutomovil) {
		//this.tipoDeAutomovil = tipoDeAutomovil;
	//}

	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}

	public int getNumDeAsientos() {
		return numDeAsientos;
	}

	public void setNumDeAsientos(int numDeAsientos) {
		this.numDeAsientos = numDeAsientos;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getVelocidadActual() {
		return velocidadActual;
	}
   
	public int getDistanciaRecorrerEnKm() {
		return distanciaRecorrerEnKm;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidadActual(double velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public void acelerarVelocidad() {
		System.out.println("Ingrese velocidad actual");
		Scanner teclado = new Scanner(System.in);
		velocidad=teclado.nextInt();
		if(velocidad < 0) {
			System.out.println("esta acelerando");
			
		}else {
				int restultado = velocidad - 1;
				System.out.println("esta desacelerando");
		}
		
	} 
	
	public double calcularTiempoDeLlegada(double distanciaRecorrerEnKm) {
		return distanciaRecorrerEnKm / velocidadActual;
	}
    

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", añoFabricacion=" + añoFabricacion + ", motor=" + motor
				+ ", tipoDeCombustible=" + tipoDeCombustible + ", tipoDeAutomovil=" + tipoDeAutomovil
				+ ", numeroDePuertas=" + numeroDePuertas + ", numDeAsientos=" + numDeAsientos + ", velocidadMaxima="
				+ velocidadMaxima + ", color=" + color + ", velocidadActual=" + velocidadActual
				+ ", distanciaRecorrerEnKm=" + distanciaRecorrerEnKm + ", velocidad=" + velocidad + "]";
	}

	public void setTipoDeAutomovil(String string) {
		// TODO Auto-generated method stub
		
	}
}