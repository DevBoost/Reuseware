package org.reuseware.application.reusejava.example;

public class SecureCustomer {
	java.lang.String name;
	java.lang.String ssn;

	public java.lang.String getName() {
		org.reuseware.application.reusejava.example.SecurityManager.check( org.reuseware.application.reusejava.example.SecurityManager.READ);
		return name; 
	}
	
	public java.lang.String getSSN() {
		org.reuseware.application.reusejava.example.SecurityManager.check( org.reuseware.application.reusejava.example.SecurityManager.READ);
		return ssn;
	}
}