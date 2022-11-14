package autodidacta.com;

import java.util.Date;
import java.util.cantidad;
public class Bill {

	
private static final double TAXES  =0.2;
private static final String Item = null;
private long number;
private String customer;
private Date date;
private Boletas [] Articulo;  
private int lastAddIndex=0;
private autodidacta.com.Articulo[] Boletas;


public  Bill(long number, String customer,int billItemsQuantity) {
	this.number =number;
	this.customer=customer;
      this.Boletas = new Articulo[billItemsQuantity];	
      this.date = date ();
}
      

private Date date() {
	// TODO Auto-generated method stub
	return null;
}


//public int addItem(Articulo articulo,int cantidad ) {
//}

public void addItem(Articulo item, int quantity ) {
	Boletas billItem = new Boletas(Item,quantity );
	Object items;
	if (lastAddIndex < item.length) {
		
	 
}
}
public double calcularTotal() {
	return lastAddIndex;
}
}
