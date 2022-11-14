package autodidacta.com;

import java.util.Calendar;
import java.util.Scanner;

public class CalculodeNacimiento {

	public static void main(String[] args) {
		int resultado;
		int anioActual;
		Scanner scanner = new Scanner(System.in);
		//int mesActual=Calendar.MONTH, anioActual =Calendar.YEAR, diaActual =Calendar.DAY_OF_MONTH;
		int mes,dia, anio;
		System.out.println("calculo de la edad que tenes,¿viejito? o joven?");
		System.out.println("ingresa tu dia de nacimiento");
	    dia=scanner.nextInt();
	    System.out.println("ingresa mes de nacimiento");
	    mes=scanner.nextInt();
	    System.out.println("ingresa el año de tu nacimiento");
	    anio=scanner.nextInt();
	    System.out.println("ingrese anio actual");
	    anioActual=scanner.nextInt();
	    
	    resultado= anio - anioActual;
	    System.out.println("usted tiene esta cantidad " + resultado + "de años");
	}

}
