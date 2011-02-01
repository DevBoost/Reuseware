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
