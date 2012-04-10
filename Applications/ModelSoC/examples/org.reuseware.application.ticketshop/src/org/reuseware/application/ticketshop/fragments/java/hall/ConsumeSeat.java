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
import org.reuseware.lib.systems.exchange.lib.IConsumer;

public class ConsumeSeat implements IConsumer<Seat, Hall> {

	public void consume(Hall agent, Seat value) {
		agent.getSeats().add(value);
	}

}
