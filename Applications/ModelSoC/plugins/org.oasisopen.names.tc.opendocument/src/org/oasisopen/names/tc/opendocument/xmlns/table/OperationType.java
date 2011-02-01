/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getIndex <em>Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getOperationType()
 * @model extendedMetaData="name='operation_._type' kind='empty'"
 * @generated
 */
public interface OperationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getOperationType_Index()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.NameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(NameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getOperationType_Name()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.NameType
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(NameType)
	 * @generated
	 */
	boolean isSetName();

} // OperationType
