package org.reuseware.application.ticketshop.fragments.java.hall;

import org.reuseware.application.ticketshop.integrated.java.Hall;
import org.reuseware.application.ticketshop.integrated.java.Seat;
import org.reuseware.lib.systems.exchange.lib.IConsumer;

public class ConsumeSeat implements IConsumer<Seat, Hall> {

	public void consume(Hall agent, Seat value) {
		agent.getSeats().add(value);
	}

}
