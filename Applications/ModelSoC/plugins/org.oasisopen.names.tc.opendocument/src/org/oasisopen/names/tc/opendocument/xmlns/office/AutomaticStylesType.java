/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListStyleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automatic Styles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getListStyle <em>List Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getNumberStyle <em>Number Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getCurrencyStyle <em>Currency Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getPercentageStyle <em>Percentage Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getDateStyle <em>Date Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getTimeStyle <em>Time Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getBooleanStyle <em>Boolean Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType#getPageLayout <em>Page Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType()
 * @model extendedMetaData="name='automatic-styles_._type' kind='elementOnly'"
 * @generated
 */
public interface AutomaticStylesType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_Style()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='style' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0' group='#group:0'"
	 * @generated
	 */
	EList<StyleType1> getStyle();

	/**
	 * Returns the value of the '<em><b>List Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ListStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_ListStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-style' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:0'"
	 * @generated
	 */
	EList<ListStyleType> getListStyle();

	/**
	 * Returns the value of the '<em><b>Number Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_NumberStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='number-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<NumberStyleType> getNumberStyle();

	/**
	 * Returns the value of the '<em><b>Currency Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_CurrencyStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='currency-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<CurrencyStyleType> getCurrencyStyle();

	/**
	 * Returns the value of the '<em><b>Percentage Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_PercentageStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='percentage-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<PercentageStyleType> getPercentageStyle();

	/**
	 * Returns the value of the '<em><b>Date Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_DateStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<DateStyleType> getDateStyle();

	/**
	 * Returns the value of the '<em><b>Time Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_TimeStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='time-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<TimeStyleType> getTimeStyle();

	/**
	 * Returns the value of the '<em><b>Boolean Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_BooleanStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='boolean-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<BooleanStyleType> getBooleanStyle();

	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_TextStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-style' namespace='urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0' group='#group:0'"
	 * @generated
	 */
	EList<TextStyleType> getTextStyle();

	/**
	 * Returns the value of the '<em><b>Page Layout</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Layout</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Layout</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getAutomaticStylesType_PageLayout()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page-layout' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0' group='#group:0'"
	 * @generated
	 */
	EList<PageLayoutType> getPageLayout();

} // AutomaticStylesType
