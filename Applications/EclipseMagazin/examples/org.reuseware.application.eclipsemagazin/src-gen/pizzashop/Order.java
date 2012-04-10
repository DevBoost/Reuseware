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
package pizzashop;

public class Order {

	private String customer;

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCustomer() {
		return customer;
	}

	private boolean active;

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getActive() {
		return active;
	}

	private boolean processed;

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}

	public boolean getProcessed() {
		return processed;
	}

	private int timeToDeliver;

	public void setTimeToDeliver(int timeToDeliver) {
		this.timeToDeliver = timeToDeliver;
	}

	public int getTimeToDeliver() {
		return timeToDeliver;
	}

	private Pizza pizzas;

	public void setPizzas(Pizza pizzas) {
		this.pizzas = pizzas;
	}

	public Pizza getPizzas() {
		return pizzas;
	}

}
