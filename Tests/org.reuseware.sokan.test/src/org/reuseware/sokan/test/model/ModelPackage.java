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
package org.reuseware.sokan.test.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.reuseware.sokan.test.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://test.sokan.reuseware.org";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ModelPackage eINSTANCE = org.reuseware.sokan.test.model.impl.ModelPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.reuseware.sokan.test.model.impl.FacetInstanceImpl
	 * <em>Facet Instance</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.reuseware.sokan.test.model.impl.FacetInstanceImpl
	 * @see org.reuseware.sokan.test.model.impl.ModelPackageImpl#getFacetInstance()
	 * @generated
	 */
	int FACET_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Facet</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACET_INSTANCE__FACET = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACET_INSTANCE__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Facet Instance</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACET_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '
	 * {@link org.reuseware.sokan.test.model.FacetInstance
	 * <em>Facet Instance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Facet Instance</em>'.
	 * @see org.reuseware.sokan.test.model.FacetInstance
	 * @generated
	 */
	EClass getFacetInstance();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.reuseware.sokan.test.model.FacetInstance#getFacet
	 * <em>Facet</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Facet</em>'.
	 * @see org.reuseware.sokan.test.model.FacetInstance#getFacet()
	 * @see #getFacetInstance()
	 * @generated
	 */
	EAttribute getFacetInstance_Facet();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.reuseware.sokan.test.model.FacetInstance#getValues
	 * <em>Values</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.reuseware.sokan.test.model.FacetInstance#getValues()
	 * @see #getFacetInstance()
	 * @generated
	 */
	EAttribute getFacetInstance_Values();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.reuseware.sokan.test.model.impl.FacetInstanceImpl
		 * <em>Facet Instance</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.reuseware.sokan.test.model.impl.FacetInstanceImpl
		 * @see org.reuseware.sokan.test.model.impl.ModelPackageImpl#getFacetInstance()
		 * @generated
		 */
		EClass FACET_INSTANCE = eINSTANCE.getFacetInstance();

		/**
		 * The meta object literal for the '<em><b>Facet</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FACET_INSTANCE__FACET = eINSTANCE.getFacetInstance_Facet();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FACET_INSTANCE__VALUES = eINSTANCE.getFacetInstance_Values();

	}

} // ModelPackage
