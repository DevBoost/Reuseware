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
package org.oasisopen.names.tc.opendocument.xmlns.animation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage
 * @generated
 */
public interface AnimationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnimationFactory eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Animate Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animate Color Type</em>'.
	 * @generated
	 */
	AnimateColorType createAnimateColorType();

	/**
	 * Returns a new object of class '<em>Animate Motion Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animate Motion Type</em>'.
	 * @generated
	 */
	AnimateMotionType createAnimateMotionType();

	/**
	 * Returns a new object of class '<em>Animate Transform Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animate Transform Type</em>'.
	 * @generated
	 */
	AnimateTransformType createAnimateTransformType();

	/**
	 * Returns a new object of class '<em>Animate Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animate Type</em>'.
	 * @generated
	 */
	AnimateType createAnimateType();

	/**
	 * Returns a new object of class '<em>Audio Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Type</em>'.
	 * @generated
	 */
	AudioType createAudioType();

	/**
	 * Returns a new object of class '<em>Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Type</em>'.
	 * @generated
	 */
	CommandType createCommandType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Iterate Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterate Type</em>'.
	 * @generated
	 */
	IterateType createIterateType();

	/**
	 * Returns a new object of class '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Type</em>'.
	 * @generated
	 */
	ParamType createParamType();

	/**
	 * Returns a new object of class '<em>Par Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Par Type</em>'.
	 * @generated
	 */
	ParType createParType();

	/**
	 * Returns a new object of class '<em>Seq Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seq Type</em>'.
	 * @generated
	 */
	SeqType createSeqType();

	/**
	 * Returns a new object of class '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Type</em>'.
	 * @generated
	 */
	SetType createSetType();

	/**
	 * Returns a new object of class '<em>Transition Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Filter Type</em>'.
	 * @generated
	 */
	TransitionFilterType createTransitionFilterType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnimationPackage getAnimationPackage();

} //AnimationFactory
