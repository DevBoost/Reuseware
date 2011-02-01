package org.reuseware.application.ticketshop.integrated.java;


public class Hall {
	private java.util. List < org.reuseware.application.ticketshop.integrated.java.Seat > seat ;
	public java.util. List < org.reuseware.application.ticketshop.integrated.java.Seat > getSeats () {
	if ( this.seat == null ) {
		this.seat = new java.util. ArrayList < org.reuseware.application.ticketshop.integrated.java.Seat > ( ) ;
	}
	return this.seat ;
}
}



