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
 * A representation of the model object '<em><b>Cut Offs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getMovementCutOff <em>Movement Cut Off</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getInsertionCutOff <em>Insertion Cut Off</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getMovementCutOff1 <em>Movement Cut Off1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCutOffsType()
 * @model extendedMetaData="name='cut-offs_._type' kind='elementOnly'"
 * @generated
 */
public interface CutOffsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Movement Cut Off</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Cut Off</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Cut Off</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCutOffsType_MovementCutOff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='movement-cut-off' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MovementCutOffType> getMovementCutOff();

	/**
	 * Returns the value of the '<em><b>Insertion Cut Off</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertion Cut Off</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion Cut Off</em>' containment reference.
	 * @see #setInsertionCutOff(InsertionCutOffType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCutOffsType_InsertionCutOff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insertion-cut-off' namespace='##targetNamespace'"
	 * @generated
	 */
	InsertionCutOffType getInsertionCutOff();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType#getInsertionCutOff <em>Insertion Cut Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertion Cut Off</em>' containment reference.
	 * @see #getInsertionCutOff()
	 * @generated
	 */
	void setInsertionCutOff(InsertionCutOffType value);

	/**
	 * Returns the value of the '<em><b>Movement Cut Off1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementCutOffType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Cut Off1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Cut Off1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCutOffsType_MovementCutOff1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='movement-cut-off' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MovementCutOffType> getMovementCutOff1();

} // CutOffsType
