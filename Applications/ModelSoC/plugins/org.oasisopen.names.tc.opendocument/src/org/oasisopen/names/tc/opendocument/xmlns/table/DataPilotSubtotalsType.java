/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pilot Subtotals Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalsType#getDataPilotSubtotal <em>Data Pilot Subtotal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotSubtotalsType()
 * @model extendedMetaData="name='data-pilot-subtotals_._type' kind='elementOnly'"
 * @generated
 */
public interface DataPilotSubtotalsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Pilot Subtotal</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Subtotal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Subtotal</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotSubtotalsType_DataPilotSubtotal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-subtotal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataPilotSubtotalType> getDataPilotSubtotal();

} // DataPilotSubtotalsType
