/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.sokan.test.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facet Instance</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.reuseware.sokan.test.model.FacetInstance#getFacet <em>Facet
 * </em>}</li>
 * <li>{@link org.reuseware.sokan.test.model.FacetInstance#getValues <em>Values
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.reuseware.sokan.test.model.ModelPackage#getFacetInstance()
 * @model
 * @generated
 */
public interface FacetInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Facet</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Facet</em>' attribute.
	 * @see #setFacet(String)
	 * @see org.reuseware.sokan.test.model.ModelPackage#getFacetInstance_Facet()
	 * @model
	 * @generated
	 */
	String getFacet();

	/**
	 * Sets the value of the '
	 * {@link org.reuseware.sokan.test.model.FacetInstance#getFacet
	 * <em>Facet</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Facet</em>' attribute.
	 * @see #getFacet()
	 * @generated
	 */
	void setFacet(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(EList)
	 * @see org.reuseware.sokan.test.model.ModelPackage#getFacetInstance_Values()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Sets the value of the '
	 * {@link org.reuseware.sokan.test.model.FacetInstance#getValues
	 * <em>Values</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(EList<String> value);

} // FacetInstance
