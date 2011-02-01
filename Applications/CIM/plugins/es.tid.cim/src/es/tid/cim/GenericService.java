/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.GenericService#getGenericProperties <em>Generic Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getGenericService()
 * @model
 * @generated
 */
public interface GenericService extends Service {
	/**
	 * Returns the value of the '<em><b>Generic Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Properties</em>' attribute.
	 * @see #setGenericProperties(Map)
	 * @see es.tid.cim.CimPackage#getGenericService_GenericProperties()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<String, String> getGenericProperties();

	/**
	 * Sets the value of the '{@link es.tid.cim.GenericService#getGenericProperties <em>Generic Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Properties</em>' attribute.
	 * @see #getGenericProperties()
	 * @generated
	 */
	void setGenericProperties(Map<String, String> value);

} // GenericService
