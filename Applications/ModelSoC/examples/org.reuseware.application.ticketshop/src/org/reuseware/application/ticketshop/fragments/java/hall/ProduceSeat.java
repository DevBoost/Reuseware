package org.reuseware.application.ticketshop.fragments.java.hall;

import javax.swing.JOptionPane;

import org.reuseware.application.ticketshop.integrated.java.Hall;
import org.reuseware.application.ticketshop.integrated.java.Seat;
import org.reuseware.lib.systems.exchange.lib.IProducer;

public class ProduceSeat implements IProducer<Seat, Hall> {
	
	public Seat produce(final Hall agent) {
		String id = "";
		while (findSeat(agent, id) == null) {
			id = JOptionPane.showInputDialog(null, 
					"Please select a seat " + agent.getSeats(),
					"Question",
					JOptionPane.QUESTION_MESSAGE);
			//cancel
			if (id == null) return null;
		}
		Seat s = findSeat(agent, id);
		agent.getSeats().remove(s);
		return s;
	}
	
	private Seat findSeat(Hall hall, String id) {
		for(Seat s : hall.getSeats()) {
			if(id.equals(s.getID())) {
				return s;
			}
		}
		return null;
	}

}
