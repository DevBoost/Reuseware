package org.reuseware.application.ticketshop.fragments.java.clerk;

import org.reuseware.application.ticketshop.integrated.java.Address;
import org.reuseware.application.ticketshop.integrated.java.Clerk;
import org.reuseware.lib.systems.exchange.lib.IConsumer;

public class ConsumeAddress implements IConsumer<Address, Clerk> {

	public void consume(Clerk agent, Address value) {
		agent.setAddress(value);
	}

}
