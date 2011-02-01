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
 * A representation of the model object '<em><b>Index Entry Bibliography Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType#getBibliographyDataField <em>Bibliography Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexEntryBibliographyType()
 * @model extendedMetaData="name='index-entry-bibliography_._type' kind='empty'"
 * @generated
 */
public interface IndexEntryBibliographyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bibliography Data Field</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyDataFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliography Data Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography Data Field</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyDataFieldType
	 * @see #isSetBibliographyDataField()
	 * @see #unsetBibliographyDataField()
	 * @see #setBibliographyDataField(BibliographyDataFieldType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexEntryBibliographyType_BibliographyDataField()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='bibliography-data-field' namespace='##targetNamespace'"
	 * @generated
	 */
	BibliographyDataFieldType getBibliographyDataField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType#getBibliographyDataField <em>Bibliography Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliography Data Field</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyDataFieldType
	 * @see #isSetBibliographyDataField()
	 * @see #unsetBibliographyDataField()
	 * @see #getBibliographyDataField()
	 * @generated
	 */
	void setBibliographyDataField(BibliographyDataFieldType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType#getBibliographyDataField <em>Bibliography Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBibliographyDataField()
	 * @see #getBibliographyDataField()
	 * @see #setBibliographyDataField(BibliographyDataFieldType)
	 * @generated
	 */
	void unsetBibliographyDataField();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType#getBibliographyDataField <em>Bibliography Data Field</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bibliography Data Field</em>' attribute is set.
	 * @see #unsetBibliographyDataField()
	 * @see #getBibliographyDataField()
	 * @see #setBibliographyDataField(BibliographyDataFieldType)
	 * @generated
	 */
	boolean isSetBibliographyDataField();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIndexEntryBibliographyType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType18"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // IndexEntryBibliographyType
