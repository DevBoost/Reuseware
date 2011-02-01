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
 * A representation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getEndIndent <em>End Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getRelWidth <em>Rel Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceAfter <em>Space After</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceBefore <em>Space Before</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getStartIndent <em>Start Indent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnType()
 * @model extendedMetaData="name='column_._type' kind='empty'"
 * @generated
 */
public interface ColumnType extends EObject {
	/**
	 * Returns the value of the '<em><b>End Indent</b></em>' attribute.
	 * The default value is <code>"0cm"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Indent</em>' attribute.
	 * @see #isSetEndIndent()
	 * @see #unsetEndIndent()
	 * @see #setEndIndent(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnType_EndIndent()
	 * @model default="0cm" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='end-indent' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	String getEndIndent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getEndIndent <em>End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Indent</em>' attribute.
	 * @see #isSetEndIndent()
	 * @see #unsetEndIndent()
	 * @see #getEndIndent()
	 * @generated
	 */
	void setEndIndent(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getEndIndent <em>End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndIndent()
	 * @see #getEndIndent()
	 * @see #setEndIndent(String)
	 * @generated
	 */
	void unsetEndIndent();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getEndIndent <em>End Indent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Indent</em>' attribute is set.
	 * @see #unsetEndIndent()
	 * @see #getEndIndent()
	 * @see #setEndIndent(String)
	 * @generated
	 */
	boolean isSetEndIndent();

	/**
	 * Returns the value of the '<em><b>Rel Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Width</em>' attribute.
	 * @see #setRelWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnType_RelWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.RelativeLength" required="true"
	 *        extendedMetaData="kind='attribute' name='rel-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRelWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getRelWidth <em>Rel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Width</em>' attribute.
	 * @see #getRelWidth()
	 * @generated
	 */
	void setRelWidth(String value);

	/**
	 * Returns the value of the '<em><b>Space After</b></em>' attribute.
	 * The default value is <code>"0cm"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space After</em>' attribute.
	 * @see #isSetSpaceAfter()
	 * @see #unsetSpaceAfter()
	 * @see #setSpaceAfter(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnType_SpaceAfter()
	 * @model default="0cm" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='space-after' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	String getSpaceAfter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceAfter <em>Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space After</em>' attribute.
	 * @see #isSetSpaceAfter()
	 * @see #unsetSpaceAfter()
	 * @see #getSpaceAfter()
	 * @generated
	 */
	void setSpaceAfter(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceAfter <em>Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpaceAfter()
	 * @see #getSpaceAfter()
	 * @see #setSpaceAfter(String)
	 * @generated
	 */
	void unsetSpaceAfter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceAfter <em>Space After</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space After</em>' attribute is set.
	 * @see #unsetSpaceAfter()
	 * @see #getSpaceAfter()
	 * @see #setSpaceAfter(String)
	 * @generated
	 */
	boolean isSetSpaceAfter();

	/**
	 * Returns the value of the '<em><b>Space Before</b></em>' attribute.
	 * The default value is <code>"0cm"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Before</em>' attribute.
	 * @see #isSetSpaceBefore()
	 * @see #unsetSpaceBefore()
	 * @see #setSpaceBefore(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnType_SpaceBefore()
	 * @model default="0cm" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='space-before' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	String getSpaceBefore();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceBefore <em>Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Before</em>' attribute.
	 * @see #isSetSpaceBefore()
	 * @see #unsetSpaceBefore()
	 * @see #getSpaceBefore()
	 * @generated
	 */
	void setSpaceBefore(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceBefore <em>Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpaceBefore()
	 * @see #getSpaceBefore()
	 * @see #setSpaceBefore(String)
	 * @generated
	 */
	void unsetSpaceBefore();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getSpaceBefore <em>Space Before</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space Before</em>' attribute is set.
	 * @see #unsetSpaceBefore()
	 * @see #getSpaceBefore()
	 * @see #setSpaceBefore(String)
	 * @generated
	 */
	boolean isSetSpaceBefore();

	/**
	 * Returns the value of the '<em><b>Start Indent</b></em>' attribute.
	 * The default value is <code>"0cm"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Indent</em>' attribute.
	 * @see #isSetStartIndent()
	 * @see #unsetStartIndent()
	 * @see #setStartIndent(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getColumnType_StartIndent()
	 * @model default="0cm" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='start-indent' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	String getStartIndent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getStartIndent <em>Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Indent</em>' attribute.
	 * @see #isSetStartIndent()
	 * @see #unsetStartIndent()
	 * @see #getStartIndent()
	 * @generated
	 */
	void setStartIndent(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getStartIndent <em>Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartIndent()
	 * @see #getStartIndent()
	 * @see #setStartIndent(String)
	 * @generated
	 */
	void unsetStartIndent();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType#getStartIndent <em>Start Indent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Indent</em>' attribute is set.
	 * @see #unsetStartIndent()
	 * @see #getStartIndent()
	 * @see #setStartIndent(String)
	 * @generated
	 */
	boolean isSetStartIndent();

} // ColumnType
