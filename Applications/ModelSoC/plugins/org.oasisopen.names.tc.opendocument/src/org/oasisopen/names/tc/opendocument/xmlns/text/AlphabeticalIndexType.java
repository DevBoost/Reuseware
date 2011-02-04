/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alphabetical Index Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getAlphabeticalIndexSource <em>Alphabetical Index Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getIndexBody <em>Index Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getProtectionKey <em>Protection Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexType()
 * @model extendedMetaData="name='alphabetical-index_._type' kind='elementOnly'"
 * @generated
 */
public interface AlphabeticalIndexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alphabetical Index Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Source</em>' containment reference.
	 * @see #setAlphabeticalIndexSource(AlphabeticalIndexSourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexType_AlphabeticalIndexSource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-source' namespace='##targetNamespace'"
	 * @generated
	 */
	AlphabeticalIndexSourceType getAlphabeticalIndexSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getAlphabeticalIndexSource <em>Alphabetical Index Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabetical Index Source</em>' containment reference.
	 * @see #getAlphabeticalIndexSource()
	 * @generated
	 */
	void setAlphabeticalIndexSource(AlphabeticalIndexSourceType value);

	/**
	 * Returns the value of the '<em><b>Index Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Body</em>' containment reference.
	 * @see #setIndexBody(IndexBodyType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexType_IndexBody()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='index-body' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexBodyType getIndexBody();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getIndexBody <em>Index Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Body</em>' containment reference.
	 * @see #getIndexBody()
	 * @generated
	 */
	void setIndexBody(IndexBodyType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Protected</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtected()
	 * @see #unsetProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexType_Protected()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='protected' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtected()
	 * @see #unsetProtected()
	 * @see #getProtected()
	 * @generated
	 */
	void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtected()
	 * @see #getProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetProtected();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getProtected <em>Protected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protected</em>' attribute is set.
	 * @see #unsetProtected()
	 * @see #getProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetProtected();

	/**
	 * Returns the value of the '<em><b>Protection Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Key</em>' attribute.
	 * @see #setProtectionKey(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexType_ProtectionKey()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='protection-key' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProtectionKey();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getProtectionKey <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Key</em>' attribute.
	 * @see #getProtectionKey()
	 * @generated
	 */
	void setProtectionKey(String value);

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getAlphabeticalIndexType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType16"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // AlphabeticalIndexType