package autodidacta.com;

import java.util.Scanner;

public class OperadorLogin {

	public static void main(String[] args) {
	
		String nombre = "Michelle";
        String contraseña = "1243";
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese nombre");
        String nom= scanner.next();
        
        System.out.println("Ingrese contraseña");
        String contra = scanner.next();
        
        boolean esAutentico = false;
        
        if(nombre.equals(nom)&& contraseña.equals(contra)) {
        	esAutentico = true;
        	
        }
        if (esAutentico) {
        	
        }else {
        	System.out.println("BIENVENIDA SEÑORITA ".concat(nom).concat("usted esta bellizima hoy"));
        }
        	
        	 
        	
        }
        
        
        
        
	}


