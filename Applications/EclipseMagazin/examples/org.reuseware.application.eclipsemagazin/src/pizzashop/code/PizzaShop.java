package pizzashop.code;

import javax.swing.JOptionPane;

import pizzashop.Order;

public class PizzaShop {

	private static  
		Order order = null;
	{ getClientAddress: {	 
		order = new Order();
		String customerName =
			JOptionPane.showInputDialog(null,
				"Enter Name", "Question",
				JOptionPane.QUESTION_MESSAGE);

		order.setCustomer(
			customerName);
		System.out.println(
			"Recorded Customer: "
			+ customerName);
	} }
	
	{ getProductDetails: {
		
		System.out.println("Get Details...");
	} }
}
