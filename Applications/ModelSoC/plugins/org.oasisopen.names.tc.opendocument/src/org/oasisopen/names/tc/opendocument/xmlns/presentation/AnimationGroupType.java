/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType#getPresentationAnimationElementsGroup <em>Presentation Animation Elements Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType#getPresentationAnimationElements <em>Presentation Animation Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getAnimationGroupType()
 * @model extendedMetaData="name='animation-group_._type' kind='elementOnly'"
 * @generated
 */
public interface AnimationGroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Presentation Animation Elements Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Animation Elements Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Animation Elements Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getAnimationGroupType_PresentationAnimationElementsGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='presentation-animation-elements:group' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	FeatureMap getPresentationAnimationElementsGroup();

	/**
	 * Returns the value of the '<em><b>Presentation Animation Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Animation Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Animation Elements</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getAnimationGroupType_PresentationAnimationElements()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='presentation-animation-elements' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements:group'"
	 * @generated
	 */
	EList<EObject> getPresentationAnimationElements();

} // AnimationGroupType
