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
public class CLASS_SLOT {
	private java.util.List<CLASS_SLOT> NAME_LOWER_CASE_HOOK;

	public java.util.List<CLASS_SLOT> getNAME_HOOKs() {
		if (this.NAME_LOWER_CASE_HOOK == null) {
			this.NAME_LOWER_CASE_HOOK = 
				new java.util.ArrayList<CLASS_SLOT>();
		}
		return this.NAME_LOWER_CASE_HOOK;
	}
}
