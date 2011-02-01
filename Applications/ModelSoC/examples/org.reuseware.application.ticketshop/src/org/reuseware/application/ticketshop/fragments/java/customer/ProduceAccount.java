package org.reuseware.application.ticketshop.fragments.java.customer;

import javax.swing.JOptionPane;

import org.reuseware.application.ticketshop.integrated.java.Account;
import org.reuseware.application.ticketshop.integrated.java.Customer;
import org.reuseware.lib.systems.exchange.lib.IProducer;

public class ProduceAccount implements IProducer<Account, Customer> {

	public Account produce(Customer agent) {
		Account account = agent.getAccount();
		String no = "";
		if (account != null) {
			no = account.getID();
		}
		else {
			account = new Account();
			agent.setAccount(account);
		}

		no = JOptionPane.showInputDialog(null, 
				"Please enter your account number.",
				"Question",
				JOptionPane.QUESTION_MESSAGE);
		
		if (no == null) return null;
		account.setID(no);

		return account;
	}

}
