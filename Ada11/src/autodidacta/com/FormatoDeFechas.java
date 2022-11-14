package autodidacta.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatoDeFechas {

	public static void main(String[] args) {
		Date fecha= new Date();
		System.out.println("la fecha es = " + fecha);
		
		SimpleDateFormat mostrar = new SimpleDateFormat("dd-MMM-yyyy");
		String fechaStr = mostrar.format(fecha);
		
		System.out.println("fechaStr =" + fechaStr);
		

	}

}
