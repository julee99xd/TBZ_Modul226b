package interF_ShoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
	public ArrayList<iBuyable> items = new ArrayList<>(); 
	
	public void totalPrice() {
		double total = 0;
		
		for (iBuyable item : items) {
			total += item.price();
		}
		
		System.out.println("Die Summe Ihres Einkaufs beträgt " + total + " CHF");
    }
}
