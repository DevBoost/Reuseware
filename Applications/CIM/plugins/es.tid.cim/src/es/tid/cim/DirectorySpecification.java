/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.DirectorySpecification#getDirectorySpecificationFiles <em>Directory Specification Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getDirectorySpecification()
 * @model
 * @generated
 */
public interface DirectorySpecification extends Check {
	/**
	 * Returns the value of the '<em><b>Directory Specification Files</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.FileSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory Specification Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Specification Files</em>' reference list.
	 * @see es.tid.cim.CimPackage#getDirectorySpecification_DirectorySpecificationFiles()
	 * @model
	 * @generated
	 */
	EList<FileSpecification> getDirectorySpecificationFiles();

} // DirectorySpecification
