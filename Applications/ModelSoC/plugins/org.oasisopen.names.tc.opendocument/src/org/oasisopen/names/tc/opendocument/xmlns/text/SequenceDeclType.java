/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Decl Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType#getDisplayOutlineLevel <em>Display Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType#getSeparationCharacter <em>Separation Character</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSequenceDeclType()
 * @model extendedMetaData="name='sequence-decl_._type' kind='empty'"
 * @generated
 */
public interface SequenceDeclType extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Outline Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Outline Level</em>' attribute.
	 * @see #setDisplayOutlineLevel(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSequenceDeclType_DisplayOutlineLevel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='display-outline-level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDisplayOutlineLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType#getDisplayOutlineLevel <em>Display Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Outline Level</em>' attribute.
	 * @see #getDisplayOutlineLevel()
	 * @generated
	 */
	void setDisplayOutlineLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSequenceDeclType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.VariableName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Separation Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separation Character</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separation Character</em>' attribute.
	 * @see #setSeparationCharacter(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getSequenceDeclType_SeparationCharacter()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Character"
	 *        extendedMetaData="kind='attribute' name='separation-character' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSeparationCharacter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType#getSeparationCharacter <em>Separation Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separation Character</em>' attribute.
	 * @see #getSeparationCharacter()
	 * @generated
	 */
	void setSeparationCharacter(String value);

} // SequenceDeclType
