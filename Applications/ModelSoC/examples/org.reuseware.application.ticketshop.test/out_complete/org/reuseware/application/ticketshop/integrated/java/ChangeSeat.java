package org.reuseware.application.ticketshop.integrated.java;


public class ChangeSeat implements org.reuseware.lib.systems.usecase.lib. IUseCase {
	public void start () {
	org.reuseware.application.ticketshop.integrated.java.Customer Customer = new org.reuseware.application.ticketshop.fragments.java.customer.CustomerInitialiser ( ).init ( ) ;
	org.reuseware.application.ticketshop.integrated.java.Clerk Clerk = new org.reuseware.application.ticketshop.fragments.java.clerk.ClerkInitialiser ( ).init ( ) ;
	org.reuseware.application.ticketshop.integrated.java.Hall Hall = new org.reuseware.application.ticketshop.fragments.java.hall.HallInitialiser ( ).init ( ) ;
	{
		org.reuseware.application.ticketshop.fragments.java.customer.ProduceSeat producer = new org.reuseware.application.ticketshop.fragments.java.customer.ProduceSeat ( ) ;
		org.reuseware.application.ticketshop.fragments.java.hall.ConsumeSeat consumer = new org.reuseware.application.ticketshop.fragments.java.hall.ConsumeSeat ( ) ;
		org.reuseware.application.ticketshop.integrated.java.Seat oldSeat = producer.produce ( Customer ) ;
		if ( oldSeat == null ) {
			return ;
		} else {
			consumer.consume ( Hall , oldSeat ) ;
		}
	}
	{
		org.reuseware.application.ticketshop.fragments.java.hall.ProduceSeat producer = new org.reuseware.application.ticketshop.fragments.java.hall.ProduceSeat ( ) ;
		org.reuseware.application.ticketshop.fragments.java.customer.ConsumeSeat consumer = new org.reuseware.application.ticketshop.fragments.java.customer.ConsumeSeat ( ) ;
		org.reuseware.application.ticketshop.integrated.java.Seat newSeat = producer.produce ( Hall ) ;
		if ( newSeat == null ) {
			return ;
		} else {
			consumer.consume ( Customer , newSeat ) ;
		}
	}
	{
		org.reuseware.application.ticketshop.fragments.java.customer.ProduceAddress producer = new org.reuseware.application.ticketshop.fragments.java.customer.ProduceAddress ( ) ;
		org.reuseware.application.ticketshop.fragments.java.clerk.ConsumeAddress consumer = new org.reuseware.application.ticketshop.fragments.java.clerk.ConsumeAddress ( ) ;
		org.reuseware.application.ticketshop.integrated.java.Address add = producer.produce ( Customer ) ;
		if ( add == null ) {
			return ;
		} else {
			consumer.consume ( Clerk , add ) ;
		}
	}
	{
		org.reuseware.application.ticketshop.fragments.java.clerk.ProduceShipment producer = new org.reuseware.application.ticketshop.fragments.java.clerk.ProduceShipment ( ) ;
		org.reuseware.application.ticketshop.fragments.java.customer.ConsumeShipment consumer = new org.reuseware.application.ticketshop.fragments.java.customer.ConsumeShipment ( ) ;
		org.reuseware.application.ticketshop.integrated.java.Shipment M2 = producer.produce ( Clerk ) ;
		if ( M2 == null ) {
			return ;
		} else {
			consumer.consume ( Customer , M2 ) ;
		}
	}
}
}



