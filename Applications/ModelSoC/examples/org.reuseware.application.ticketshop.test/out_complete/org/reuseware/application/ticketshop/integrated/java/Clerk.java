package org.reuseware.application.ticketshop.integrated.java;


public class Clerk {
	private java.util. List < org.reuseware.application.ticketshop.integrated.java.Shipment > shipment ;
	public java.util. List < org.reuseware.application.ticketshop.integrated.java.Shipment > getShipments () {
	if ( this.shipment == null ) {
		this.shipment = new java.util. ArrayList < org.reuseware.application.ticketshop.integrated.java.Shipment > ( ) ;
	}
	return this.shipment ;
}
	private org.reuseware.application.ticketshop.integrated.java.Address address ;
	public void setAddress (org.reuseware.application.ticketshop.integrated.java.Address address) {
	this.address = address ;
}
	public org.reuseware.application.ticketshop.integrated.java.Address getAddress () {
	return this.address ;
}
}



