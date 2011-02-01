/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bibliography Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographySourceType#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographySourceType#getBibliographyEntryTemplate <em>Bibliography Entry Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographySourceType()
 * @model extendedMetaData="name='bibliography-source_._type' kind='elementOnly'"
 * @generated
 */
public interface BibliographySourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Index Title Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Title Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Title Template</em>' containment reference.
	 * @see #setIndexTitleTemplate(IndexTitleTemplateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographySourceType_IndexTitleTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index-title-template' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexTitleTemplateType getIndexTitleTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographySourceType#getIndexTitleTemplate <em>Index Title Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Title Template</em>' containment reference.
	 * @see #getIndexTitleTemplate()
	 * @generated
	 */
	void setIndexTitleTemplate(IndexTitleTemplateType value);

	/**
	 * Returns the value of the '<em><b>Bibliography Entry Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliography Entry Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography Entry Template</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographySourceType_BibliographyEntryTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bibliography-entry-template' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BibliographyEntryTemplateType> getBibliographyEntryTemplate();

} // BibliographySourceType
