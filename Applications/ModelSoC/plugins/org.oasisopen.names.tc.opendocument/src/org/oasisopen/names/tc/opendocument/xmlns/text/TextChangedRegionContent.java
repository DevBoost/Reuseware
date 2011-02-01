/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Changed Region Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextChangedRegionContent#getTextChangedRegionContentGroup <em>Text Changed Region Content Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TextChangedRegionContent#getTextChangedRegionContent <em>Text Changed Region Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextChangedRegionContent()
 * @model extendedMetaData="name='text-changed-region-content' kind='elementOnly'"
 * @generated
 */
public interface TextChangedRegionContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Changed Region Content Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Changed Region Content Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Changed Region Content Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextChangedRegionContent_TextChangedRegionContentGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='text-changed-region-content:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTextChangedRegionContentGroup();

	/**
	 * Returns the value of the '<em><b>Text Changed Region Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Changed Region Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Changed Region Content</em>' containment reference.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTextChangedRegionContent_TextChangedRegionContent()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='text-changed-region-content' namespace='##targetNamespace' group='text-changed-region-content:group'"
	 * @generated
	 */
	EObject getTextChangedRegionContent();

} // TextChangedRegionContent
