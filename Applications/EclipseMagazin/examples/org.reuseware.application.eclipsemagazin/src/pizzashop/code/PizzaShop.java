package pizzashop.code;

import pizzashop.Order;
import pizzashop.Pizza;

public class PizzaShop {

	private static  Order order = null;
	
	public static void Delivery() {
		order = new Order();
		
		System.out.println(" -- setting customer details --");
		
		order.setCustomer("Somebody");
		
		System.out.println(" -- adding ordered pizzas --");
		
		order.setPizzas(new Pizza());
	}
}
