package autodidacta.com;

public class PropiedadDeSistema {

	public static void main(String[] args) {
		String username =System.getProperty("user.name");
		System.out.println("username = " + username);
       
		String workspace = System.getProperty("user.dir");
		System.out.println(workspace);
		
		String lineSeparator =System.getProperty("line.separator");
		String lineSeparator1 = System.lineSeparator();
		System.out.println("lineSeparator :" + lineSeparator1 + "separar palabras") ;
	}

}
