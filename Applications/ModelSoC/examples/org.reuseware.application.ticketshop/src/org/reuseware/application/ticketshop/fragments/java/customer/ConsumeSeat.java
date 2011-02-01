package org.reuseware.application.ticketshop.fragments.java.customer;

import org.reuseware.application.ticketshop.integrated.java.Customer;
import org.reuseware.application.ticketshop.integrated.java.Seat;
import org.reuseware.lib.systems.exchange.lib.IConsumer;

public class ConsumeSeat implements IConsumer<Seat, Customer> {

	public void consume(Customer agent, Seat value) {
		agent.setSeat(value);
	}

}
