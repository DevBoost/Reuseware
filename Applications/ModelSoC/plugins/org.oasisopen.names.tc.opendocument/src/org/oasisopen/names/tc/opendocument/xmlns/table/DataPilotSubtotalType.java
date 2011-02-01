/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Pilot Subtotal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotSubtotalType()
 * @model extendedMetaData="name='data-pilot-subtotal_._type' kind='empty'"
 * @generated
 */
public interface DataPilotSubtotalType extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotSubtotalType_Function()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.table.FunctionType" required="true"
	 *        extendedMetaData="kind='attribute' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getFunction();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotSubtotalType#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Object value);

} // DataPilotSubtotalType
