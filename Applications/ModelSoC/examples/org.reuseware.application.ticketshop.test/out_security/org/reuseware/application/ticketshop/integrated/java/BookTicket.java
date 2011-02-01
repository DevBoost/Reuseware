package org.reuseware.application.ticketshop.integrated.java;


public class BookTicket implements org.reuseware.lib.systems.usecase.lib. IUseCase {
	public void start () {
	org.reuseware.application.ticketshop.integrated.java.Hall Hall = new org.reuseware.application.ticketshop.fragments.java.hall.HallInitialiser ( ).init ( ) ;
	org.reuseware.application.ticketshop.integrated.java.Bank Bank = new org.reuseware.application.ticketshop.fragments.java.bank.BankInitialiser ( ).init ( ) ;
	org.reuseware.application.ticketshop.integrated.java.Clerk Clerk = new org.reuseware.application.ticketshop.fragments.java.clerk.ClerkInitialiser ( ).init ( ) ;
	org.reuseware.application.ticketshop.integrated.java.Customer Customer = new org.reuseware.application.ticketshop.fragments.java.customer.CustomerInitialiser ( ).init ( ) ;
	{
		org.reuseware.application.ticketshop.fragments.java.hall.ProduceSeat producer = new org.reuseware.application.ticketshop.fragments.java.hall.ProduceSeat ( ) ;
		org.reuseware.application.ticketshop.fragments.java.customer.ConsumeSeat consumer = new org.reuseware.application.ticketshop.fragments.java.customer.ConsumeSeat ( ) ;
		org.reuseware.application.ticketshop.integrated.java.Seat N = producer.produce ( Hall ) ;
		if ( N == null ) {
			return ;
		} else {
			consumer.consume ( Customer , N ) ;
		}
	}
	{
		org.reuseware.application.ticketshop.fragments.java.customer.ProduceAccount producer = new org.reuseware.application.ticketshop.fragments.java.customer.ProduceAccount ( ) ;
		org.reuseware.application.ticketshop.fragments.java.bank.ConsumeAccount consumer = new org.reuseware.application.ticketshop.fragments.java.bank.ConsumeAccount ( ) ;
		org.reuseware.application.ticketshop.integrated.java.Account acc1 = producer.produce ( Customer ) ;
		javax.swing.JOptionPane.showInputDialog ( null , "Please enter your PIN code." , "Security Question" , javax.swing.JOptionPane.QUESTION_MESSAGE ) ;
		acc1 = acc1 ;
		if ( acc1 == null ) {
			return ;
		} else {
			acc1 = acc1 ;
			consumer.consume ( Bank , acc1 ) ;
		}
	}
	{
		org.reuseware.application.ticketshop.fragments.java.customer.ProduceAddress producer = new org.reuseware.application.ticketshop.fragments.java.customer.ProduceAddress ( ) ;
		org.reuseware.application.ticketshop.fragments.java.clerk.ConsumeAddress consumer = new org.reuseware.application.ticketshop.fragments.java.clerk.ConsumeAddress ( ) ;
		org.reuseware.application.ticketshop.integrated.java.Address add1 = producer.produce ( Customer ) ;
		if ( add1 == null ) {
			return ;
		} else {
			consumer.consume ( Clerk , add1 ) ;
		}
	}
	{
		org.reuseware.application.ticketshop.fragments.java.clerk.ProduceShipment producer = new org.reuseware.application.ticketshop.fragments.java.clerk.ProduceShipment ( ) ;
		org.reuseware.application.ticketshop.fragments.java.customer.ConsumeShipment consumer = new org.reuseware.application.ticketshop.fragments.java.customer.ConsumeShipment ( ) ;
		org.reuseware.application.ticketshop.integrated.java.Shipment M = producer.produce ( Clerk ) ;
		if ( M == null ) {
			return ;
		} else {
			consumer.consume ( Customer , M ) ;
		}
	}
}
}



