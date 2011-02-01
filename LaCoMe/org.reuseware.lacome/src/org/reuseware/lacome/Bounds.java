/*******************************************************************************
 * Copyright (c) 2006-2010
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.lacome;

/**
 * Represents the bounds (position and size) of a diagram.
 */
public class Bounds {

	/**
	 * Constant indicating an unknown measurement unit (-1).
	 */
	public static final int MU_NULL = -1;
	
	/**
	 * Constant for himetric measurement unit (0: as also used by GMF).
	 */
	public static final int MU_HIMETRIC = 0;
	
	/**
	 * Constant pixels as measurement unit (1: as also used by GMF).
	 */
	public static final int MU_PIXEL = 1;
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	protected int modelPosition;

	protected int measurementUnit = MU_NULL;
	
	/**
	 * Constructs a new bounds object.
	 */
	public Bounds() {
		this.x = -1;
		this.y = -1;
		this.width = -1;
		this.height = -1;
	}
	
	/**
	 * Constructs a new bounds object.
	 * 
	 * @param x the x position
	 * @param y the y position
	 */
	public Bounds(int x, int y) {
		
		this.x = x;
		this.y = y;
		this.width = -1;
		this.height = -1;
	}
	
	/**
	 * Constructs a new bounds object.
	 * 
	 * @param x the x position
	 * @param y the y position
	 * @param width  the width
	 * @param height the height
	 */
	public Bounds(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @return the x position
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x position
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y position
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y position
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * @return the position in the model in terms of the position in a list
	 *         of model elements
	 */
	public int getModelPosition() {
		return modelPosition;
	}

	/**
	 * @param modelPosition the position in the model in terms of the position in a list
	 *                      of model elements
	 */
	public void setModelPosition(int modelPosition) {
		this.modelPosition = modelPosition;
	}

	/**
	 * @return the measurement unit
	 */
	public int getMeasurementUnit() {
		return measurementUnit;
	}

	/**
	 * @param measurementUnit the measurement unit
	 */
	public void setMeasurementUnit(int measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

}
