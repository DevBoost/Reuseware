package org.reuseware.application.ticketshop.fragments.java.bank;

import org.reuseware.application.ticketshop.integrated.java.Bank;
import org.reuseware.lib.systems.participation.lib.IInitialiser;

public class BankInitialiser implements IInitialiser<Bank> {

	public Bank init() {
		return new Bank();
	}

}
