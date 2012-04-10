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
import javax.swing.JOptionPane;

class PLACEHOLDER {
	
	Object VALUE_SLOT;
	
	public void SECURITY_BEFORE_SEND() {
		//String pin  = 
		javax.swing.JOptionPane.showInputDialog(null, "Please enter your PIN code.",
				"Security Question",
				JOptionPane.QUESTION_MESSAGE);

		VALUE_SLOT = /* DO ENCRYPTION */ VALUE_SLOT;	
	}
	
	public void SECURITY_AFTER_RECEIVE() {
		VALUE_SLOT = /* DO DECRIPT */ VALUE_SLOT;	
	}
}
