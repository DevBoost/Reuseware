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
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracked Changes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getCellContentChange <em>Cell Content Change</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getInsertion <em>Insertion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getDeletion <em>Deletion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getMovement <em>Movement</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getTrackChanges <em>Track Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTrackedChangesType()
 * @model extendedMetaData="name='tracked-changes_._type' kind='elementOnly'"
 * @generated
 */
public interface TrackedChangesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTrackedChangesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Cell Content Change</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Content Change</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Content Change</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTrackedChangesType_CellContentChange()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cell-content-change' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CellContentChangeType> getCellContentChange();

	/**
	 * Returns the value of the '<em><b>Insertion</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.InsertionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTrackedChangesType_Insertion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='insertion' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<InsertionType> getInsertion();

	/**
	 * Returns the value of the '<em><b>Deletion</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletion</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTrackedChangesType_Deletion()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deletion' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DeletionType> getDeletion();

	/**
	 * Returns the value of the '<em><b>Movement</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTrackedChangesType_Movement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='movement' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MovementType> getMovement();

	/**
	 * Returns the value of the '<em><b>Track Changes</b></em>' attribute.
	 * The default value is <code>"false"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTrackedChangesType_TrackChanges()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='track-changes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTrackChanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getTrackChanges <em>Track Changes</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getTrackChanges <em>Track Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrackChanges()
	 * @see #getTrackChanges()
	 * @see #setTrackChanges(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTrackChanges();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TrackedChangesType#getTrackChanges <em>Track Changes</em>}' attribute is set.
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
