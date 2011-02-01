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
