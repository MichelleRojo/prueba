package autodidacta.com;

import java.util.Scanner;

public class CantidadCaracteres {

	public static void main(String[] args) {
      
	  Scanner scanner = new Scanner(System.in);
	  
      String nombre1= "";
      String nomGrande="";
      String nomChico ="---";
      
      for (int i = 0; i < 3; i++) { 
      System.out.println(" ingresa el nombre " + i+":");
      nombre1 =scanner.nextLine();
      
      if (nombre1.length ()>=nomGrande.length()) {
    	  nomGrande= nombre1;
      }
    
	}
      if (nombre1.length ()<=nomChico.length()) {
    	  nomChico= nombre1;
      }
      System.out.println("------");
      System.out.println("el nombre mas grande es " + nomGrande);
      System.out.println("el nombre mas chico es " + nomChico);
	}
	}

	
