/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dde Connection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionType#getConnectionName <em>Connection Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDdeConnectionType()
 * @model extendedMetaData="name='dde-connection_._type' kind='mixed'"
 * @generated
 */
public interface DdeConnectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDdeConnectionType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Connection Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Name</em>' attribute.
	 * @see #setConnectionName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getDdeConnectionType_ConnectionName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='connection-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getConnectionName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionType#getConnectionName <em>Connection Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Name</em>' attribute.
	 * @see #getConnectionName()
	 * @generated
	 */
	void setConnectionName(String value);

} // DdeConnectionType
