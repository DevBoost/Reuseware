/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bibliography Entry Template Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getIndexEntrySpan <em>Index Entry Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getIndexEntryTabStop <em>Index Entry Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getIndexEntryBibliography <em>Index Entry Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getBibliographyType <em>Bibliography Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyEntryTemplateType()
 * @model extendedMetaData="name='bibliography-entry-template_._type' kind='elementOnly'"
 * @generated
 */
public interface BibliographyEntryTemplateType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyEntryTemplateType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyEntryTemplateType_IndexEntrySpan()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyEntryTemplateType_IndexEntryTabStop()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-entry-tab-stop' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndexEntryTabStopType> getIndexEntryTabStop();

	/**
	 * Returns the value of the '<em><b>Index Entry Bibliography</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Entry Bibliography</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Entry Bibliography</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyEntryTemplateType_IndexEntryBibliography()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-entry-bibliography' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IndexEntryBibliographyType> getIndexEntryBibliography();

	/**
	 * Returns the value of the '<em><b>Bibliography Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.TextBibliographyTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliography Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextBibliographyTypes
	 * @see #isSetBibliographyType()
	 * @see #unsetBibliographyType()
	 * @see #setBibliographyType(TextBibliographyTypes)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyEntryTemplateType_BibliographyType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='bibliography-type' namespace='##targetNamespace'"
	 * @generated
	 */
	TextBibliographyTypes getBibliographyType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getBibliographyType <em>Bibliography Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliography Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextBibliographyTypes
	 * @see #isSetBibliographyType()
	 * @see #unsetBibliographyType()
	 * @see #getBibliographyType()
	 * @generated
	 */
	void setBibliographyType(TextBibliographyTypes value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getBibliographyType <em>Bibliography Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBibliographyType()
	 * @see #getBibliographyType()
	 * @see #setBibliographyType(TextBibliographyTypes)
	 * @generated
	 */
	void unsetBibliographyType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getBibliographyType <em>Bibliography Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bibliography Type</em>' attribute is set.
	 * @see #unsetBibliographyType()
	 * @see #getBibliographyType()
	 * @see #setBibliographyType(TextBibliographyTypes)
	 * @generated
	 */
	boolean isSetBibliographyType();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyEntryTemplateType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType2" required="true"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // BibliographyEntryTemplateType
