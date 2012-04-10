/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
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
