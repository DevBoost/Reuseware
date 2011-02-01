package org.reuseware.application.ticketshop.fragments.java.clerk;

import org.reuseware.application.ticketshop.integrated.java.Clerk;
import org.reuseware.lib.systems.participation.lib.IInitialiser;

public class ClerkInitialiser implements IInitialiser<Clerk> {

	public Clerk init() {
		return new Clerk();
	}

}
