package org.reuseware.application.ticketshop.fragments.java.customer;

import javax.swing.JOptionPane;

import org.reuseware.application.ticketshop.integrated.java.Customer;
import org.reuseware.application.ticketshop.integrated.java.Seat;
import org.reuseware.lib.systems.exchange.lib.IProducer;

public class ProduceSeat implements IProducer<Seat, Customer> {

	public Seat produce(Customer agent) {
		Seat seat = agent.getSeat();
		String no = "";
		if (seat != null) {
			no = seat.getID();
		}
		else {
			seat = new Seat();
			agent.setSeat(seat);
		}

		no = JOptionPane.showInputDialog(null,
				"Please enter the seat number you want to change.",
				 "Question",
				JOptionPane.QUESTION_MESSAGE);
		
		if (no == null) return null;
		seat.setID(no);

		return seat;
	}

}
