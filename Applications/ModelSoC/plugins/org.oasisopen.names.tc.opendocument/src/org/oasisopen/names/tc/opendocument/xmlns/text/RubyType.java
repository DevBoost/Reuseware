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
 * A representation of the model object '<em><b>Ruby Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyType#getRubyBase <em>Ruby Base</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyType#getRubyText <em>Ruby Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyType()
 * @model extendedMetaData="name='ruby_._type' kind='elementOnly'"
 * @generated
 */
public interface RubyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ruby Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruby Base</em>' containment reference.
	 * @see #setRubyBase(RubyBaseType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyType_RubyBase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ruby-base' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyBaseType getRubyBase();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyType#getRubyBase <em>Ruby Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Base</em>' containment reference.
	 * @see #getRubyBase()
	 * @generated
	 */
	void setRubyBase(RubyBaseType value);

	/**
	 * Returns the value of the '<em><b>Ruby Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruby Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruby Text</em>' containment reference.
	 * @see #setRubyText(RubyTextType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyType_RubyText()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ruby-text' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyTextType getRubyText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyType#getRubyText <em>Ruby Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Text</em>' containment reference.
	 * @see #getRubyText()
	 * @generated
	 */
	void setRubyText(RubyTextType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getRubyType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType21"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.RubyType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // RubyType