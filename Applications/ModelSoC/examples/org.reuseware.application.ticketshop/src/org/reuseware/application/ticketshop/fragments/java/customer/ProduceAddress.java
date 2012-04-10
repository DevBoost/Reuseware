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
package org.reuseware.application.ticketshop.fragments.java.customer;

import javax.swing.JOptionPane;

import org.reuseware.application.ticketshop.integrated.java.Address;
import org.reuseware.application.ticketshop.integrated.java.Customer;
import org.reuseware.lib.systems.exchange.lib.IProducer;

public class ProduceAddress implements IProducer<Address, Customer> {

	public Address produce(Customer agent) {
		Address address = agent.getAddress();
		String no = "";
		if (address != null) {
			no = address.getID();
		}
		else {
			address = new Address();
			agent.setAddress(address);
		}
		
		no = JOptionPane.showInputDialog(null,
				"Please enter your address.",
				"Question",
				JOptionPane.QUESTION_MESSAGE);
		
		if (no == null) return null;
		address.setID(no);
		
		return address;
	}

}
