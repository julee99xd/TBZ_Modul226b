package interF_ShoppingCart;

public class Starter {

	public static void main(String[] args) {
		
		Milk m1 = new Milk();
        LightBulbs lb1 = new LightBulbs();
        LightBulbs lb2 = new LightBulbs();
        Strawberries s1 = new Strawberries();

        ShoppingCart sc1 = new ShoppingCart();

        sc1.items.add(m1);
        sc1.items.add(lb1);
        sc1.items.add(lb2);
        sc1.items.add(s1);

        sc1.totalPrice();
		

	}

}
