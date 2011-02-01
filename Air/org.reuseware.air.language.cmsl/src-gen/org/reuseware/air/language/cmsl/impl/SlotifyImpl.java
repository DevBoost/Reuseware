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

import org.reuseware.air.language.cmsl.BaseReference;
import org.reuseware.air.language.cmsl.CmslPackage;
import org.reuseware.air.language.cmsl.Slotify;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slotify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.SlotifyImpl#getConstruct <em>Construct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotifyImpl extends EObjectImpl implements Slotify {
	/**
   * The cached value of the '{@link #getConstruct() <em>Construct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConstruct()
   * @generated
   * @ordered
   */
	protected BaseReference construct;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SlotifyImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.SLOTIFY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BaseReference getConstruct() {
    return construct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetConstruct(BaseReference newConstruct, NotificationChain msgs) {
    BaseReference oldConstruct = construct;
    construct = newConstruct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.SLOTIFY__CONSTRUCT, oldConstruct, newConstruct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConstruct(BaseReference newConstruct) {
    if (newConstruct != construct)
    {
      NotificationChain msgs = null;
      if (construct != null)
        msgs = ((InternalEObject)construct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.SLOTIFY__CONSTRUCT, null, msgs);
      if (newConstruct != null)
        msgs = ((InternalEObject)newConstruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.SLOTIFY__CONSTRUCT, null, msgs);
      msgs = basicSetConstruct(newConstruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.SLOTIFY__CONSTRUCT, newConstruct, newConstruct));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case CmslPackage.SLOTIFY__CONSTRUCT:
        return basicSetConstruct(null, msgs);
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
      case CmslPackage.SLOTIFY__CONSTRUCT:
        return getConstruct();
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
      case CmslPackage.SLOTIFY__CONSTRUCT:
        setConstruct((BaseReference)newValue);
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
      case CmslPackage.SLOTIFY__CONSTRUCT:
        setConstruct((BaseReference)null);
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
      case CmslPackage.SLOTIFY__CONSTRUCT:
        return construct != null;
    }
    return super.eIsSet(featureID);
  }

} //SlotifyImpl
