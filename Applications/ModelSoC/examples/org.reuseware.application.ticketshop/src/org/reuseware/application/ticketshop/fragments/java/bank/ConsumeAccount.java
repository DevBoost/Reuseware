package org.reuseware.application.ticketshop.fragments.java.bank;

import org.reuseware.application.ticketshop.integrated.java.Account;
import org.reuseware.application.ticketshop.integrated.java.Bank;
import org.reuseware.lib.systems.exchange.lib.IConsumer;

public class ConsumeAccount implements IConsumer<Account, Bank> {

	public void consume(Bank bank, Account value) {
		bank.getAccounts().add(value);
	}
	

}
