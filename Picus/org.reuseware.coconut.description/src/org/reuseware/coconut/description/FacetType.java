/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.coconut.description;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.FacetType#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FacetType#isMultiValue <em>Multi Value</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FacetType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FacetType#getValues <em>Values</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FacetType#getContainer <em>Container</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.FacetType#getDerivationData <em>Derivation Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetType()
 * @model abstract="true"
 * @generated
 */
public interface FacetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FacetType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Value</em>' attribute.
	 * @see #setMultiValue(boolean)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetType_MultiValue()
	 * @model
	 * @generated
	 */
	boolean isMultiValue();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FacetType#isMultiValue <em>Multi Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Value</em>' attribute.
	 * @see #isMultiValue()
	 * @generated
	 */
	void setMultiValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FacetType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.reuseware.coconut.description.FacetValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetType_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FacetValue> getValues();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.reuseware.coconut.description.FacetDefinition#getFacetTypes <em>Facet Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(FacetDefinition)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetType_Container()
	 * @see org.reuseware.coconut.description.FacetDefinition#getFacetTypes
	 * @model opposite="facetTypes" required="true" derived="true"
	 * @generated
	 */
	FacetDefinition getContainer();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FacetType#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(FacetDefinition value);

	/**
	 * Returns the value of the '<em><b>Derivation Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derivation Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Data</em>' containment reference.
	 * @see #setDerivationData(DerivationData)
	 * @see org.reuseware.coconut.description.DescriptionPackage#getFacetType_DerivationData()
	 * @model containment="true"
	 * @generated
	 */
	DerivationData getDerivationData();

	/**
	 * Sets the value of the '{@link org.reuseware.coconut.description.FacetType#getDerivationData <em>Derivation Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Data</em>' containment reference.
	 * @see #getDerivationData()
	 * @generated
	 */
	void setDerivationData(DerivationData value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQuery();

} // FacetType
