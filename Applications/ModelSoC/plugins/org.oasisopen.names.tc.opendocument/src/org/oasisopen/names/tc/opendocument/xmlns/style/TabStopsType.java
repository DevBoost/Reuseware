/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Stops Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType#getTabStop <em>Tab Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopsType()
 * @model extendedMetaData="name='tab-stops_._type' kind='elementOnly'"
 * @generated
 */
public interface TabStopsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tab Stop</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Stop</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getTabStopsType_TabStop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tab-stop' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TabStopType> getTabStop();

} // TabStopsType
