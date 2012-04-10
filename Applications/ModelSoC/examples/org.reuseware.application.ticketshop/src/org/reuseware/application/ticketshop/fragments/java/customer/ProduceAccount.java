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
