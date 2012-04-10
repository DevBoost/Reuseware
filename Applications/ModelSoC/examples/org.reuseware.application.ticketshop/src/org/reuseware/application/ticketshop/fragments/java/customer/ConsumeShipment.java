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

import org.reuseware.application.ticketshop.integrated.java.Customer;
import org.reuseware.application.ticketshop.integrated.java.Shipment;
import org.reuseware.lib.systems.exchange.lib.IConsumer;

public class ConsumeShipment implements IConsumer<Shipment, Customer> {

	public void consume(Customer agent, Shipment value) {
		agent.setShipment(value);
		JOptionPane.showMessageDialog(null, 
				"A shipment was received!", 
				"Customer Info",
				JOptionPane.PLAIN_MESSAGE);
	}

}
