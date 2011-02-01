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
 * A representation of the model object '<em><b>Outline Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.OutlineStyleType#getOutlineLevelStyle <em>Outline Level Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOutlineStyleType()
 * @model extendedMetaData="name='outline-style_._type' kind='elementOnly'"
 * @generated
 */
public interface OutlineStyleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Outline Level Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.OutlineLevelStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline Level Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline Level Style</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getOutlineStyleType_OutlineLevelStyle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outline-level-style' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutlineLevelStyleType> getOutlineLevelStyle();

} // OutlineStyleType
