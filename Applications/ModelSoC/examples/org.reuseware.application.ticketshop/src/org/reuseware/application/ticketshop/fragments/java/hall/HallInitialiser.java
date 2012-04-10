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

import org.reuseware.application.ticketshop.integrated.java.Hall;
import org.reuseware.application.ticketshop.integrated.java.Seat;
import org.reuseware.lib.systems.participation.lib.IInitialiser;

public class HallInitialiser implements IInitialiser<Hall> {

	//the hall is a singleton
	private static final Hall theHall = new Hall();
	
	
	public Hall init() {
		if (theHall.getSeats().isEmpty()) {
			for(int i = 1; i <= 10; i++) {
				Seat s = new Seat();
				s.setID("A" + i); 
				theHall.getSeats().add(s);
			}
			for(int i = 1; i <= 10; i++) {
				Seat s = new Seat();
				s.setID("B" + i); 
				theHall.getSeats().add(s);
			}
		}
		return theHall;
	}

}
