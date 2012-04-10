/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.application.ticketshop.integrated.java;


public class Ticketshop {
	public static void main (java.lang.String [] args) {
	org.reuseware.application.ticketshop.integrated.java.Ticketshop.TicketshopWindow window = new org.reuseware.application.ticketshop.integrated.java.Ticketshop.TicketshopWindow ( ) ;
	window.addProcess ( new org.reuseware.application.ticketshop.integrated.java.BookTicket ( ) ) ;
	window.addProcess ( new org.reuseware.application.ticketshop.integrated.java.ChangeSeat ( ) ) ;
	init ( window ) ;
}
	private static void init (org.reuseware.application.ticketshop.integrated.java.Ticketshop.TicketshopWindow window) {
	window.setTitle ( "Ticketshop! What would you like to do?" ) ;
	window.setLayout ( new java.awt. GridLayout ( ) ) ;
	for ( final org.reuseware.lib.systems.usecase.lib. IUseCase process : window.processList ) {
		final javax.swing. JButton startButton = new javax.swing. JButton ( process.getClass ( ).getSimpleName ( ) ) ;
		startButton.addActionListener ( new java.awt.event. ActionListener ( ) {
			public void actionPerformed (java.awt.event.ActionEvent e) {
			process.start ( ) ;
		}
		} ) ;
		startButton.setVisible ( true ) ;
		window.getContentPane ( ).add ( startButton ) ;
	}
	window.pack ( ) ;
	window.setVisible ( true ) ;
}
	public static class TicketshopWindow extends javax.swing. JDialog implements org.reuseware.lib.systems.app.lib. IProcessContainer {
	private static final long serialVersionUID = 1l ;
	private java.util. List < org.reuseware.lib.systems.usecase.lib. IUseCase > processList = new java.util. ArrayList < org.reuseware.lib.systems.usecase.lib. IUseCase > ( ) ;
	public void addProcess (org.reuseware.lib.systems.usecase.lib.IUseCase p) {
	processList.add ( p ) ;
}
}
}



