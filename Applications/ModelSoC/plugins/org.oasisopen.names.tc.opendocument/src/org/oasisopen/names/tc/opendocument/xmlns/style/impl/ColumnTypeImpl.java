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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnTypeImpl#getEndIndent <em>End Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnTypeImpl#getRelWidth <em>Rel Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnTypeImpl#getSpaceAfter <em>Space After</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnTypeImpl#getSpaceBefore <em>Space Before</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.ColumnTypeImpl#getStartIndent <em>Start Indent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnTypeImpl extends EObjectImpl implements ColumnType {
	/**
	 * The default value of the '{@link #getEndIndent() <em>End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIndent()
	 * @generated
	 * @ordered
	 */
	protected static final String END_INDENT_EDEFAULT = "0cm";

	/**
	 * The cached value of the '{@link #getEndIndent() <em>End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIndent()
	 * @generated
	 * @ordered
	 */
	protected String endIndent = END_INDENT_EDEFAULT;

	/**
	 * This is true if the End Indent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endIndentESet;

	/**
	 * The default value of the '{@link #getRelWidth() <em>Rel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelWidth() <em>Rel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelWidth()
	 * @generated
	 * @ordered
	 */
	protected String relWidth = REL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceAfter() <em>Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceAfter()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACE_AFTER_EDEFAULT = "0cm";

	/**
	 * The cached value of the '{@link #getSpaceAfter() <em>Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceAfter()
	 * @generated
	 * @ordered
	 */
	protected String spaceAfter = SPACE_AFTER_EDEFAULT;

	/**
	 * This is true if the Space After attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spaceAfterESet;

	/**
	 * The default value of the '{@link #getSpaceBefore() <em>Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceBefore()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACE_BEFORE_EDEFAULT = "0cm";

	/**
	 * The cached value of the '{@link #getSpaceBefore() <em>Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceBefore()
	 * @generated
	 * @ordered
	 */
	protected String spaceBefore = SPACE_BEFORE_EDEFAULT;

	/**
	 * This is true if the Space Before attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spaceBeforeESet;

	/**
	 * The default value of the '{@link #getStartIndent() <em>Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndent()
	 * @generated
	 * @ordered
	 */
	protected static final String START_INDENT_EDEFAULT = "0cm";

	/**
	 * The cached value of the '{@link #getStartIndent() <em>Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndent()
	 * @generated
	 * @ordered
	 */
	protected String startIndent = START_INDENT_EDEFAULT;

	/**
	 * This is true if the Start Indent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startIndentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getColumnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndIndent() {
		return endIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndIndent(String newEndIndent) {
		String oldEndIndent = endIndent;
		endIndent = newEndIndent;
		boolean oldEndIndentESet = endIndentESet;
		endIndentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_TYPE__END_INDENT, oldEndIndent, endIndent, !oldEndIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndIndent() {
		String oldEndIndent = endIndent;
		boolean oldEndIndentESet = endIndentESet;
		endIndent = END_INDENT_EDEFAULT;
		endIndentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.COLUMN_TYPE__END_INDENT, oldEndIndent, END_INDENT_EDEFAULT, oldEndIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndIndent() {
		return endIndentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelWidth() {
		return relWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelWidth(String newRelWidth) {
		String oldRelWidth = relWidth;
		relWidth = newRelWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_TYPE__REL_WIDTH, oldRelWidth, relWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpaceAfter() {
		return spaceAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceAfter(String newSpaceAfter) {
		String oldSpaceAfter = spaceAfter;
		spaceAfter = newSpaceAfter;
		boolean oldSpaceAfterESet = spaceAfterESet;
		spaceAfterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_TYPE__SPACE_AFTER, oldSpaceAfter, spaceAfter, !oldSpaceAfterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpaceAfter() {
		String oldSpaceAfter = spaceAfter;
		boolean oldSpaceAfterESet = spaceAfterESet;
		spaceAfter = SPACE_AFTER_EDEFAULT;
		spaceAfterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.COLUMN_TYPE__SPACE_AFTER, oldSpaceAfter, SPACE_AFTER_EDEFAULT, oldSpaceAfterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpaceAfter() {
		return spaceAfterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpaceBefore() {
		return spaceBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceBefore(String newSpaceBefore) {
		String oldSpaceBefore = spaceBefore;
		spaceBefore = newSpaceBefore;
		boolean oldSpaceBeforeESet = spaceBeforeESet;
		spaceBeforeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_TYPE__SPACE_BEFORE, oldSpaceBefore, spaceBefore, !oldSpaceBeforeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpaceBefore() {
		String oldSpaceBefore = spaceBefore;
		boolean oldSpaceBeforeESet = spaceBeforeESet;
		spaceBefore = SPACE_BEFORE_EDEFAULT;
		spaceBeforeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.COLUMN_TYPE__SPACE_BEFORE, oldSpaceBefore, SPACE_BEFORE_EDEFAULT, oldSpaceBeforeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpaceBefore() {
		return spaceBeforeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartIndent() {
		return startIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIndent(String newStartIndent) {
		String oldStartIndent = startIndent;
		startIndent = newStartIndent;
		boolean oldStartIndentESet = startIndentESet;
		startIndentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.COLUMN_TYPE__START_INDENT, oldStartIndent, startIndent, !oldStartIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartIndent() {
		String oldStartIndent = startIndent;
		boolean oldStartIndentESet = startIndentESet;
		startIndent = START_INDENT_EDEFAULT;
		startIndentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.COLUMN_TYPE__START_INDENT, oldStartIndent, START_INDENT_EDEFAULT, oldStartIndentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartIndent() {
		return startIndentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StylePackage.COLUMN_TYPE__END_INDENT:
				return getEndIndent();
			case StylePackage.COLUMN_TYPE__REL_WIDTH:
				return getRelWidth();
			case StylePackage.COLUMN_TYPE__SPACE_AFTER:
				return getSpaceAfter();
			case StylePackage.COLUMN_TYPE__SPACE_BEFORE:
				return getSpaceBefore();
			case StylePackage.COLUMN_TYPE__START_INDENT:
				return getStartIndent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StylePackage.COLUMN_TYPE__END_INDENT:
				setEndIndent((String)newValue);
				return;
			case StylePackage.COLUMN_TYPE__REL_WIDTH:
				setRelWidth((String)newValue);
				return;
			case StylePackage.COLUMN_TYPE__SPACE_AFTER:
				setSpaceAfter((String)newValue);
				return;
			case StylePackage.COLUMN_TYPE__SPACE_BEFORE:
				setSpaceBefore((String)newValue);
				return;
			case StylePackage.COLUMN_TYPE__START_INDENT:
				setStartIndent((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StylePackage.COLUMN_TYPE__END_INDENT:
				unsetEndIndent();
				return;
			case StylePackage.COLUMN_TYPE__REL_WIDTH:
				setRelWidth(REL_WIDTH_EDEFAULT);
				return;
			case StylePackage.COLUMN_TYPE__SPACE_AFTER:
				unsetSpaceAfter();
				return;
			case StylePackage.COLUMN_TYPE__SPACE_BEFORE:
				unsetSpaceBefore();
				return;
			case StylePackage.COLUMN_TYPE__START_INDENT:
				unsetStartIndent();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StylePackage.COLUMN_TYPE__END_INDENT:
				return isSetEndIndent();
			case StylePackage.COLUMN_TYPE__REL_WIDTH:
				return REL_WIDTH_EDEFAULT == null ? relWidth != null : !REL_WIDTH_EDEFAULT.equals(relWidth);
			case StylePackage.COLUMN_TYPE__SPACE_AFTER:
				return isSetSpaceAfter();
			case StylePackage.COLUMN_TYPE__SPACE_BEFORE:
				return isSetSpaceBefore();
			case StylePackage.COLUMN_TYPE__START_INDENT:
				return isSetStartIndent();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (endIndent: ");
		if (endIndentESet) result.append(endIndent); else result.append("<unset>");
		result.append(", relWidth: ");
		result.append(relWidth);
		result.append(", spaceAfter: ");
		if (spaceAfterESet) result.append(spaceAfter); else result.append("<unset>");
		result.append(", spaceBefore: ");
		if (spaceBeforeESet) result.append(spaceBefore); else result.append("<unset>");
		result.append(", startIndent: ");
		if (startIndentESet) result.append(startIndent); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ColumnTypeImpl
