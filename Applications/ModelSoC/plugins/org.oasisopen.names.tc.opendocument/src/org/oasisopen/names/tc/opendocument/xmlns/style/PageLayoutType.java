/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.StylePageLayoutPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Layout Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageLayoutProperties <em>Page Layout Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getHeaderStyle <em>Header Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getFooterStyle <em>Footer Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageUsage <em>Page Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPageLayoutType()
 * @model extendedMetaData="name='page-layout_._type' kind='elementOnly'"
 * @generated
 */
public interface PageLayoutType extends EObject {
	/**
	 * Returns the value of the '<em><b>Page Layout Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Layout Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Layout Properties</em>' containment reference.
	 * @see #setPageLayoutProperties(StylePageLayoutPropertiesContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPageLayoutType_PageLayoutProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='page-layout-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	StylePageLayoutPropertiesContent getPageLayoutProperties();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageLayoutProperties <em>Page Layout Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Layout Properties</em>' containment reference.
	 * @see #getPageLayoutProperties()
	 * @generated
	 */
	void setPageLayoutProperties(StylePageLayoutPropertiesContent value);

	/**
	 * Returns the value of the '<em><b>Header Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Style</em>' containment reference.
	 * @see #setHeaderStyle(HeaderStyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPageLayoutType_HeaderStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='header-style' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderStyleType getHeaderStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getHeaderStyle <em>Header Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Style</em>' containment reference.
	 * @see #getHeaderStyle()
	 * @generated
	 */
	void setHeaderStyle(HeaderStyleType value);

	/**
	 * Returns the value of the '<em><b>Footer Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Style</em>' containment reference.
	 * @see #setFooterStyle(FooterStyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPageLayoutType_FooterStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='footer-style' namespace='##targetNamespace'"
	 * @generated
	 */
	FooterStyleType getFooterStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getFooterStyle <em>Footer Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Style</em>' containment reference.
	 * @see #getFooterStyle()
	 * @generated
	 */
	void setFooterStyle(FooterStyleType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPageLayoutType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Page Usage</b></em>' attribute.
	 * The default value is <code>"all"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Usage</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType
	 * @see #isSetPageUsage()
	 * @see #unsetPageUsage()
	 * @see #setPageUsage(PageUsageType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getPageLayoutType_PageUsage()
	 * @model default="all" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='page-usage' namespace='##targetNamespace'"
	 * @generated
	 */
	PageUsageType getPageUsage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageUsage <em>Page Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Usage</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType
	 * @see #isSetPageUsage()
	 * @see #unsetPageUsage()
	 * @see #getPageUsage()
	 * @generated
	 */
	void setPageUsage(PageUsageType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageUsage <em>Page Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPageUsage()
	 * @see #getPageUsage()
	 * @see #setPageUsage(PageUsageType)
	 * @generated
	 */
	void unsetPageUsage();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType#getPageUsage <em>Page Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Page Usage</em>' attribute is set.
	 * @see #unsetPageUsage()
	 * @see #getPageUsage()
	 * @see #setPageUsage(PageUsageType)
	 * @generated
	 */
	boolean isSetPageUsage();

} // PageLayoutType
