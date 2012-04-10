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
package org.reuseware.application.ticketshop.integrated.java;


public class Customer {
	private org.reuseware.application.ticketshop.integrated.java.Seat seat ;
	public void setSeat (org.reuseware.application.ticketshop.integrated.java.Seat seat) {
	this.seat = seat ;
}
	public org.reuseware.application.ticketshop.integrated.java.Seat getSeat () {
	return this.seat ;
}
	private org.reuseware.application.ticketshop.integrated.java.Address address ;
	public void setAddress (org.reuseware.application.ticketshop.integrated.java.Address address) {
	this.address = address ;
}
	public org.reuseware.application.ticketshop.integrated.java.Address getAddress () {
	return this.address ;
}
	private org.reuseware.application.ticketshop.integrated.java.Shipment shipment ;
	public void setShipment (org.reuseware.application.ticketshop.integrated.java.Shipment shipment) {
	this.shipment = shipment ;
}
	public org.reuseware.application.ticketshop.integrated.java.Shipment getShipment () {
	return this.shipment ;
}
	private org.reuseware.application.ticketshop.integrated.java.Account account ;
	public void setAccount (org.reuseware.application.ticketshop.integrated.java.Account account) {
	this.account = account ;
}
	public org.reuseware.application.ticketshop.integrated.java.Account getAccount () {
	return this.account ;
}
}



