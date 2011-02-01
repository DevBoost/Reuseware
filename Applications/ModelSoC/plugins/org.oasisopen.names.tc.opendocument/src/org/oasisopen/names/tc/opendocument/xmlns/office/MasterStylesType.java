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
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Styles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getMasterPage <em>Master Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getHandoutMaster <em>Handout Master</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType#getLayerSet <em>Layer Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getMasterStylesType()
 * @model extendedMetaData="name='master-styles_._type' kind='elementOnly'"
 * @generated
 */
public interface MasterStylesType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getMasterStylesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Master Page</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Page</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getMasterStylesType_MasterPage()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='master-page' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0' group='#group:0'"
	 * @generated
	 */
	EList<MasterPageType> getMasterPage();

	/**
	 * Returns the value of the '<em><b>Handout Master</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handout Master</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handout Master</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getMasterStylesType_HandoutMaster()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='handout-master' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0' group='#group:0'"
	 * @generated
	 */
	EList<HandoutMasterType> getHandoutMaster();

	/**
	 * Returns the value of the '<em><b>Layer Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.LayerSetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Set</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getMasterStylesType_LayerSet()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='layer-set' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0' group='#group:0'"
	 * @generated
	 */
	EList<LayerSetType> getLayerSet();

} // MasterStylesType
