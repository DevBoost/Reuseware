/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.reuseware.air.language.cmsl.CmslPackage;
import org.reuseware.air.language.cmsl.ConstructReference;
import org.reuseware.air.language.cmsl.Fragtypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragtypes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.FragtypesImpl#getFragtype <em>Fragtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FragtypesImpl extends EObjectImpl implements Fragtypes {
	/**
   * The cached value of the '{@link #getFragtype() <em>Fragtype</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFragtype()
   * @generated
   * @ordered
   */
	protected EList fragtype;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FragtypesImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.FRAGTYPES;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList getFragtype() {
    if (fragtype == null)
    {
      fragtype = new EObjectContainmentEList(ConstructReference.class, this, CmslPackage.FRAGTYPES__FRAGTYPE);
    }
    return fragtype;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case CmslPackage.FRAGTYPES__FRAGTYPE:
        return ((InternalEList)getFragtype()).basicRemove(otherEnd, msgs);
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
      case CmslPackage.FRAGTYPES__FRAGTYPE:
        return getFragtype();
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
      case CmslPackage.FRAGTYPES__FRAGTYPE:
        getFragtype().clear();
        getFragtype().addAll((Collection)newValue);
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
      case CmslPackage.FRAGTYPES__FRAGTYPE:
        getFragtype().clear();
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
      case CmslPackage.FRAGTYPES__FRAGTYPE:
        return fragtype != null && !fragtype.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FragtypesImpl
