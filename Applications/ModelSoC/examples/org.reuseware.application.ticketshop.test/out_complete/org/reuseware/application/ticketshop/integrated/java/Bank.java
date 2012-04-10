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


public class Bank {
	private java.util. List < org.reuseware.application.ticketshop.integrated.java.Account > account ;
	public java.util. List < org.reuseware.application.ticketshop.integrated.java.Account > getAccounts () {
	if ( this.account == null ) {
		this.account = new java.util. ArrayList < org.reuseware.application.ticketshop.integrated.java.Account > ( ) ;
	}
	return this.account ;
}
}



