package org.reuseware.application.ticketshop.fragments.java.clerk;

import javax.swing.JOptionPane;

import org.reuseware.application.ticketshop.integrated.java.Clerk;
import org.reuseware.application.ticketshop.integrated.java.Shipment;
import org.reuseware.lib.systems.exchange.lib.IProducer;

public class ProduceShipment implements IProducer<Shipment, Clerk> {

	public Shipment produce(final Clerk agent) {
		Shipment shipment = new Shipment();
		shipment.setID("X");

		JOptionPane.showMessageDialog(null, 
				"Sending shipment to: " + agent.getAddress().getID(), 
				"Customer Info",
				JOptionPane.PLAIN_MESSAGE);

		return shipment;
	}

}
