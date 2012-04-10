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
import org.reuseware.application.ticketshop.integrated.java.Seat;
import org.reuseware.lib.systems.exchange.lib.IProducer;

public class ProduceSeat implements IProducer<Seat, Customer> {

	public Seat produce(Customer agent) {
		Seat seat = agent.getSeat();
		String no = "";
		if (seat != null) {
			no = seat.getID();
		}
		else {
			seat = new Seat();
			agent.setSeat(seat);
		}

		no = JOptionPane.showInputDialog(null,
				"Please enter the seat number you want to change.",
				 "Question",
				JOptionPane.QUESTION_MESSAGE);
		
		if (no == null) return null;
		seat.setID(no);

		return seat;
	}

}
