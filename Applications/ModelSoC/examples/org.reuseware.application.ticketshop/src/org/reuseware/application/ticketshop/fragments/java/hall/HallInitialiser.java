package org.reuseware.application.ticketshop.fragments.java.hall;

import org.reuseware.application.ticketshop.integrated.java.Hall;
import org.reuseware.application.ticketshop.integrated.java.Seat;
import org.reuseware.lib.systems.participation.lib.IInitialiser;

public class HallInitialiser implements IInitialiser<Hall> {

	//the hall is a singleton
	private static final Hall theHall = new Hall();
	
	
	public Hall init() {
		if (theHall.getSeats().isEmpty()) {
			for(int i = 1; i <= 10; i++) {
				Seat s = new Seat();
				s.setID("A" + i); 
				theHall.getSeats().add(s);
			}
			for(int i = 1; i <= 10; i++) {
				Seat s = new Seat();
				s.setID("B" + i); 
				theHall.getSeats().add(s);
			}
		}
		return theHall;
	}

}
