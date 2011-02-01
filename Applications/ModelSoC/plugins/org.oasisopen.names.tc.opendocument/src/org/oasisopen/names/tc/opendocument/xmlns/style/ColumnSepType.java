/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Sep Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnSepType()
 * @model extendedMetaData="name='column-sep_._type' kind='empty'"
 * @generated
 */
public interface ColumnSepType extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"#000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #setColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnSepType_Color()
	 * @model default="#000000" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(String)
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getColor <em>Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color</em>' attribute is set.
	 * @see #unsetColor()
	 * @see #getColor()
	 * @see #setColor(String)
	 * @generated
	 */
	boolean isSetColor();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"100%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #setHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnSepType_Height()
	 * @model default="100%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(String)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(String)
	 * @generated
	 */
	boolean isSetHeight();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The default value is <code>"solid"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #setStyle(StyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnSepType_Style()
	 * @model default="solid" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='style' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleType getStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleType)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getStyle <em>Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style</em>' attribute is set.
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @see #setStyle(StyleType)
	 * @generated
	 */
	boolean isSetStyle();

	/**
	 * Returns the value of the '<em><b>Vertical Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType
	 * @see #isSetVerticalAlign()
	 * @see #unsetVerticalAlign()
	 * @see #setVerticalAlign(VerticalAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnSepType_VerticalAlign()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='vertical-align' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalAlignType getVerticalAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getVerticalAlign <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.VerticalAlignType
	 * @see #isSetVerticalAlign()
	 * @see #unsetVerticalAlign()
	 * @see #getVerticalAlign()
	 * @generated
	 */
	void setVerticalAlign(VerticalAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getVerticalAlign <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalAlign()
	 * @see #getVerticalAlign()
	 * @see #setVerticalAlign(VerticalAlignType)
	 * @generated
	 */
	void unsetVerticalAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getVerticalAlign <em>Vertical Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Align</em>' attribute is set.
	 * @see #unsetVerticalAlign()
	 * @see #getVerticalAlign()
	 * @see #setVerticalAlign(VerticalAlignType)
	 * @generated
	 */
	boolean isSetVerticalAlign();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnSepType_Width()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length" required="true"
	 *        extendedMetaData="kind='attribute' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // ColumnSepType
