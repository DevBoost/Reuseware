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
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracked Changes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType#getChangedRegion <em>Changed Region</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType#getTrackChanges <em>Track Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTrackedChangesType()
 * @model extendedMetaData="name='tracked-changes_._type' kind='elementOnly'"
 * @generated
 */
public interface TrackedChangesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Changed Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ChangedRegionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changed Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed Region</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTrackedChangesType_ChangedRegion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changed-region' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChangedRegionType> getChangedRegion();

	/**
	 * Returns the value of the '<em><b>Track Changes</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Changes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Changes</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTrackChanges()
	 * @see #unsetTrackChanges()
	 * @see #setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTrackedChangesType_TrackChanges()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='track-changes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTrackChanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType#getTrackChanges <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Changes</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTrackChanges()
	 * @see #unsetTrackChanges()
	 * @see #getTrackChanges()
	 * @generated
	 */
	void setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType#getTrackChanges <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrackChanges()
	 * @see #getTrackChanges()
	 * @see #setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTrackChanges();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType#getTrackChanges <em>Track Changes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Track Changes</em>' attribute is set.
	 * @see #unsetTrackChanges()
	 * @see #getTrackChanges()
	 * @see #setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTrackChanges();

} // TrackedChangesType
