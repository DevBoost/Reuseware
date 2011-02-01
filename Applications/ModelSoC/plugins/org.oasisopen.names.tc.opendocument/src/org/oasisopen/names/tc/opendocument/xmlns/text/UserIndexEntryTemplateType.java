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
 * A representation of the model object '<em><b>User Index Entry Template Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getIndexEntryChapter <em>Index Entry Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getIndexEntryPageNumber <em>Index Entry Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getIndexEntryText <em>Index Entry Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getIndexEntrySpan <em>Index Entry Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getIndexEntryTabStop <em>Index Entry Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getOutlineLevel <em>Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexEntryTemplateType()
 * @model extendedMetaData="name='user-index-entry-template_._type' kind='elementOnly'"
 * @generated
 */
public interface UserIndexEntryTemplateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexEntryTemplateType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Index Entry Chapter</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryChapterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Entry Chapter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Entry Chapter</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexEntryTemplateType_IndexEntryChapter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-entry-chapter' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndexEntryChapterType> getIndexEntryChapter();

	/**
	 * Returns the value of the '<em><b>Index Entry Page Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryPageNumberType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Entry Page Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Entry Page Number</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexEntryTemplateType_IndexEntryPageNumber()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-entry-page-number' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndexEntryPageNumberType> getIndexEntryPageNumber();

	/**
	 * Returns the value of the '<em><b>Index Entry Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Entry Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Entry Text</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexEntryTemplateType_IndexEntryText()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-entry-text' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndexEntryTextType> getIndexEntryText();

	/**
	 * Returns the value of the '<em><b>Index Entry Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntrySpanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Entry Span</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Entry Span</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexEntryTemplateType_IndexEntrySpan()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-entry-span' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndexEntrySpanType> getIndexEntrySpan();

	/**
	 * Returns the value of the '<em><b>Index Entry Tab Stop</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTabStopType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Entry Tab Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Entry Tab Stop</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexEntryTemplateType_IndexEntryTabStop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-entry-tab-stop' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndexEntryTabStopType> getIndexEntryTabStop();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexEntryTemplateType_OutlineLevel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='outline-level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOutlineLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getOutlineLevel <em>Outline Level</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexEntryTemplateType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType11" required="true"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // UserIndexEntryTemplateType
