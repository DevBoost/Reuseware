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
package org.reuseware.sokan.test.util;

import java.lang.reflect.Field;

public abstract class AbstractData {

	public Object get(String fieldName) {
		String name = fieldName.toLowerCase();
		Field field;
		try {
			field = this.getClass().getField(name);
			return field.get(this);
		} catch (NoSuchFieldException e) {
		} catch (Exception e) {
			System.out.println("[ERROR] Was not able to open field '"
					+ fieldName + "'");
			return null;
		}

		name = fieldName;
		try {
			field = this.getClass().getField(name);
			return field.get(this);
		} catch (Exception e) {
			System.out.println("[ERROR] Was not able to open field '"
					+ fieldName + "'");
			return null;
		}
	}

	public boolean set(String fieldName, Object value) {
		String name = fieldName.toLowerCase();
		Field field;
		try {
			field = this.getClass().getField(name);

			field.set(this, value);
			return true;
		} catch (NoSuchFieldException e) {
		} catch (Exception e) {
			System.out.println("[ERROR] Field '" + name + "' was not set to: "
					+ value);
			return false;
		}

		name = fieldName;
		try {
			field = this.getClass().getField(fieldName);

			field.set(this, value);
			return true;
		} catch (Exception e) {
			System.out.println("[ERROR] Field '" + name + "' was not set to: "
					+ value);
			return false;
		}
	}
}
