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
 * A representation of the model object '<em><b>Bibliography Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getSortKey <em>Sort Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getNumberedEntries <em>Numbered Entries</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getSortAlgorithm <em>Sort Algorithm</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getSortByPosition <em>Sort By Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyConfigurationType()
 * @model extendedMetaData="name='bibliography-configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface BibliographyConfigurationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sort Key</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SortKeyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Key</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyConfigurationType_SortKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sort-key' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SortKeyType> getSortKey();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyConfigurationType_Country()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='country' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyConfigurationType_Language()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='language' namespace='urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Numbered Entries</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numbered Entries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbered Entries</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumberedEntries()
	 * @see #unsetNumberedEntries()
	 * @see #setNumberedEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyConfigurationType_NumberedEntries()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='numbered-entries' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumberedEntries();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getNumberedEntries <em>Numbered Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbered Entries</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumberedEntries()
	 * @see #unsetNumberedEntries()
	 * @see #getNumberedEntries()
	 * @generated
	 */
	void setNumberedEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getNumberedEntries <em>Numbered Entries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberedEntries()
	 * @see #getNumberedEntries()
	 * @see #setNumberedEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetNumberedEntries();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getNumberedEntries <em>Numbered Entries</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numbered Entries</em>' attribute is set.
	 * @see #unsetNumberedEntries()
	 * @see #getNumberedEntries()
	 * @see #setNumberedEntries(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetNumberedEntries();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyConfigurationType_Prefix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='prefix' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Sort Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Algorithm</em>' attribute.
	 * @see #setSortAlgorithm(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyConfigurationType_SortAlgorithm()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='sort-algorithm' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSortAlgorithm();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getSortAlgorithm <em>Sort Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Algorithm</em>' attribute.
	 * @see #getSortAlgorithm()
	 * @generated
	 */
	void setSortAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Sort By Position</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort By Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort By Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSortByPosition()
	 * @see #unsetSortByPosition()
	 * @see #setSortByPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyConfigurationType_SortByPosition()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='sort-by-position' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSortByPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getSortByPosition <em>Sort By Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort By Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSortByPosition()
	 * @see #unsetSortByPosition()
	 * @see #getSortByPosition()
	 * @generated
	 */
	void setSortByPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getSortByPosition <em>Sort By Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortByPosition()
	 * @see #getSortByPosition()
	 * @see #setSortByPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetSortByPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getSortByPosition <em>Sort By Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort By Position</em>' attribute is set.
	 * @see #unsetSortByPosition()
	 * @see #getSortByPosition()
	 * @see #setSortByPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetSortByPosition();

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getBibliographyConfigurationType_Suffix()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='suffix' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

} // BibliographyConfigurationType
