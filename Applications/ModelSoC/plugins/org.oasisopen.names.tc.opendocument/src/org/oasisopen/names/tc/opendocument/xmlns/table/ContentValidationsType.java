/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Validations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationsType#getContentValidation <em>Content Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationsType()
 * @model extendedMetaData="name='content-validations_._type' kind='elementOnly'"
 * @generated
 */
public interface ContentValidationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Validation</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.ContentValidationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Validation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Validation</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getContentValidationsType_ContentValidation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content-validation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentValidationType> getContentValidation();

} // ContentValidationsType
