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
package org.reuseware.application.ticketshop.fragments.java.hall;

import javax.swing.JOptionPane;

import org.reuseware.application.ticketshop.integrated.java.Hall;
import org.reuseware.application.ticketshop.integrated.java.Seat;
import org.reuseware.lib.systems.exchange.lib.IProducer;

public class ProduceSeat implements IProducer<Seat, Hall> {
	
	public Seat produce(final Hall agent) {
		String id = "";
		while (findSeat(agent, id) == null) {
			id = JOptionPane.showInputDialog(null, 
					"Please select a seat " + agent.getSeats(),
					"Question",
					JOptionPane.QUESTION_MESSAGE);
			//cancel
			if (id == null) return null;
		}
		Seat s = findSeat(agent, id);
		agent.getSeats().remove(s);
		return s;
	}
	
	private Seat findSeat(Hall hall, String id) {
		for(Seat s : hall.getSeats()) {
			if(id.equals(s.getID())) {
				return s;
			}
		}
		return null;
	}

}
