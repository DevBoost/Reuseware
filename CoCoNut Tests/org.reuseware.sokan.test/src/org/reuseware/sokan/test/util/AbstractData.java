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
