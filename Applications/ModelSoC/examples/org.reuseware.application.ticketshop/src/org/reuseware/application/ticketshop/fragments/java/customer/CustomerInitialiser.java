package org.reuseware.application.ticketshop.fragments.java.customer;

import org.reuseware.application.ticketshop.integrated.java.Customer;
import org.reuseware.lib.systems.participation.lib.IInitialiser;

public class CustomerInitialiser implements IInitialiser<Customer> {

	public Customer init() {
		return new Customer();
	}

}
