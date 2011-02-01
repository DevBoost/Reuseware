/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editing Duration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType#getDataStyleName <em>Data Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType#getFixed <em>Fixed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getEditingDurationType()
 * @model extendedMetaData="name='editing-duration_._type' kind='mixed'"
 * @generated
 */
public interface EditingDurationType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getEditingDurationType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Data Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Style Name</em>' attribute.
	 * @see #setDataStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getEditingDurationType_DataStyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.DataStyleNameType"
	 *        extendedMetaData="kind='attribute' name='data-style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	String getDataStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType#getDataStyleName <em>Data Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Style Name</em>' attribute.
	 * @see #getDataStyleName()
	 * @generated
	 */
	void setDataStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getEditingDurationType_Duration()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFixed()
	 * @see #unsetFixed()
	 * @see #setFixed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getEditingDurationType_Fixed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fixed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFixed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType#getFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFixed()
	 * @see #unsetFixed()
	 * @see #getFixed()
	 * @generated
	 */
	void setFixed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType#getFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFixed()
	 * @see #getFixed()
	 * @see #setFixed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFixed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.EditingDurationType#getFixed <em>Fixed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fixed</em>' attribute is set.
	 * @see #unsetFixed()
	 * @see #getFixed()
	 * @see #setFixed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFixed();

} // EditingDurationType
