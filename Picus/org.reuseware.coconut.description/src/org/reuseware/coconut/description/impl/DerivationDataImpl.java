/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.coconut.description.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.reuseware.coconut.description.DerivationData;
import org.reuseware.coconut.description.DescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derivation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.coconut.description.impl.DerivationDataImpl#getDerivatorID <em>Derivator ID</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.DerivationDataImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.reuseware.coconut.description.impl.DerivationDataImpl#isDerivationDone <em>Derivation Done</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DerivationDataImpl extends EObjectImpl implements DerivationData {
	/**
	 * The default value of the '{@link #getDerivatorID() <em>Derivator ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivatorID()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVATOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivatorID() <em>Derivator ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivatorID()
	 * @generated
	 * @ordered
	 */
	protected String derivatorID = DERIVATOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected String rule = RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDerivationDone() <em>Derivation Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerivationDone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVATION_DONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerivationDone() <em>Derivation Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerivationDone()
	 * @generated
	 * @ordered
	 */
	protected boolean derivationDone = DERIVATION_DONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.DERIVATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDerivatorID() {
		return derivatorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivatorID(String newDerivatorID) {
		String oldDerivatorID = derivatorID;
		derivatorID = newDerivatorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.DERIVATION_DATA__DERIVATOR_ID, oldDerivatorID, derivatorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(String newRule) {
		String oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.DERIVATION_DATA__RULE, oldRule, rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerivationDone() {
		return derivationDone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationDone(boolean newDerivationDone) {
		boolean oldDerivationDone = derivationDone;
		derivationDone = newDerivationDone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.DERIVATION_DATA__DERIVATION_DONE, oldDerivationDone, derivationDone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescriptionPackage.DERIVATION_DATA__DERIVATOR_ID:
				return getDerivatorID();
			case DescriptionPackage.DERIVATION_DATA__RULE:
				return getRule();
			case DescriptionPackage.DERIVATION_DATA__DERIVATION_DONE:
				return isDerivationDone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DescriptionPackage.DERIVATION_DATA__DERIVATOR_ID:
				setDerivatorID((String)newValue);
				return;
			case DescriptionPackage.DERIVATION_DATA__RULE:
				setRule((String)newValue);
				return;
			case DescriptionPackage.DERIVATION_DATA__DERIVATION_DONE:
				setDerivationDone((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DescriptionPackage.DERIVATION_DATA__DERIVATOR_ID:
				setDerivatorID(DERIVATOR_ID_EDEFAULT);
				return;
			case DescriptionPackage.DERIVATION_DATA__RULE:
				setRule(RULE_EDEFAULT);
				return;
			case DescriptionPackage.DERIVATION_DATA__DERIVATION_DONE:
				setDerivationDone(DERIVATION_DONE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DescriptionPackage.DERIVATION_DATA__DERIVATOR_ID:
				return DERIVATOR_ID_EDEFAULT == null ? derivatorID != null : !DERIVATOR_ID_EDEFAULT.equals(derivatorID);
			case DescriptionPackage.DERIVATION_DATA__RULE:
				return RULE_EDEFAULT == null ? rule != null : !RULE_EDEFAULT.equals(rule);
			case DescriptionPackage.DERIVATION_DATA__DERIVATION_DONE:
				return derivationDone != DERIVATION_DONE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (derivatorID: ");
		result.append(derivatorID);
		result.append(", rule: ");
		result.append(rule);
		result.append(", derivationDone: ");
		result.append(derivationDone);
		result.append(')');
		return result.toString();
	}

} //DerivationDataImpl
