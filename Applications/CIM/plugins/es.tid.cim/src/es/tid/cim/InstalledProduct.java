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
 * A representation of the model object '<em><b>Installed Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.InstalledProduct#getSoftwareElements <em>Software Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getInstalledProduct()
 * @model
 * @generated
 */
public interface InstalledProduct extends Collection {
	/**
	 * Returns the value of the '<em><b>Software Elements</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.SoftwareElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Elements</em>' reference list.
	 * @see es.tid.cim.CimPackage#getInstalledProduct_SoftwareElements()
	 * @model
	 * @generated
	 */
	EList<SoftwareElement> getSoftwareElements();

} // InstalledProduct
