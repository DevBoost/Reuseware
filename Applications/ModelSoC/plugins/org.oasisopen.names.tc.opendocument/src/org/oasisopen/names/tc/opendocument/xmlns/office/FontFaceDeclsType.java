/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Face Decls Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType#getFontFace <em>Font Face</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getFontFaceDeclsType()
 * @model extendedMetaData="name='font-face-decls_._type' kind='elementOnly'"
 * @generated
 */
public interface FontFaceDeclsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Font Face</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getFontFaceDeclsType_FontFace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='font-face' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	EList<FontFaceType> getFontFace();

} // FontFaceDeclsType
