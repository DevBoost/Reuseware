package org.reuseware.application.ticketshop.integrated.java;


public class Bank {
	private java.util. List < org.reuseware.application.ticketshop.integrated.java.Account > account ;
	public java.util. List < org.reuseware.application.ticketshop.integrated.java.Account > getAccounts () {
	if ( this.account == null ) {
		this.account = new java.util. ArrayList < org.reuseware.application.ticketshop.integrated.java.Account > ( ) ;
	}
	return this.account ;
}
}



