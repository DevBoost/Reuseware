/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.reuseware.air.language.cmsl.CmslPackage;
import org.reuseware.air.language.cmsl.GrammarExtension;
import org.reuseware.air.language.cmsl.GrammarExtensionUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grammar Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.GrammarExtensionImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrammarExtensionImpl extends EObjectImpl implements GrammarExtension {
	/**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
	protected GrammarExtensionUnit unit;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GrammarExtensionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.GRAMMAR_EXTENSION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GrammarExtensionUnit getUnit() {
    return unit;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetUnit(GrammarExtensionUnit newUnit, NotificationChain msgs) {
    GrammarExtensionUnit oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.GRAMMAR_EXTENSION__UNIT, oldUnit, newUnit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUnit(GrammarExtensionUnit newUnit) {
    if (newUnit != unit)
    {
      NotificationChain msgs = null;
      if (unit != null)
        msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.GRAMMAR_EXTENSION__UNIT, null, msgs);
      if (newUnit != null)
        msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.GRAMMAR_EXTENSION__UNIT, null, msgs);
      msgs = basicSetUnit(newUnit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.GRAMMAR_EXTENSION__UNIT, newUnit, newUnit));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case CmslPackage.GRAMMAR_EXTENSION__UNIT:
        return basicSetUnit(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case CmslPackage.GRAMMAR_EXTENSION__UNIT:
        return getUnit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case CmslPackage.GRAMMAR_EXTENSION__UNIT:
        setUnit((GrammarExtensionUnit)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case CmslPackage.GRAMMAR_EXTENSION__UNIT:
        setUnit((GrammarExtensionUnit)null);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case CmslPackage.GRAMMAR_EXTENSION__UNIT:
        return unit != null;
    }
    return super.eIsSet(featureID);
  }

} //GrammarExtensionImpl
