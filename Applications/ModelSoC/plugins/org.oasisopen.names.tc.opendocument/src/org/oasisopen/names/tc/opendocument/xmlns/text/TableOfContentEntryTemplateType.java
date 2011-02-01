/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Of Content Entry Template Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType#getTextTableOfContentChildrenGroup <em>Text Table Of Content Children Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType#getTextTableOfContentChildren <em>Text Table Of Content Children</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType#getOutlineLevel <em>Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentEntryTemplateType()
 * @model extendedMetaData="name='table-of-content-entry-template_._type' kind='elementOnly'"
 * @generated
 */
public interface TableOfContentEntryTemplateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Table Of Content Children Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Table Of Content Children Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Table Of Content Children Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentEntryTemplateType_TextTableOfContentChildrenGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='text-table-of-content-children:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTextTableOfContentChildrenGroup();

	/**
	 * Returns the value of the '<em><b>Text Table Of Content Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Table Of Content Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Table Of Content Children</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentEntryTemplateType_TextTableOfContentChildren()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-table-of-content-children' namespace='##targetNamespace' group='text-table-of-content-children:group'"
	 * @generated
	 */
	EList<EObject> getTextTableOfContentChildren();

	/**
	 * Returns the value of the '<em><b>Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline Level</em>' attribute.
	 * @see #setOutlineLevel(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentEntryTemplateType_OutlineLevel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='outline-level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOutlineLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType#getOutlineLevel <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline Level</em>' attribute.
	 * @see #getOutlineLevel()
	 * @generated
	 */
	void setOutlineLevel(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentEntryTemplateType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType23" required="true"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // TableOfContentEntryTemplateType
