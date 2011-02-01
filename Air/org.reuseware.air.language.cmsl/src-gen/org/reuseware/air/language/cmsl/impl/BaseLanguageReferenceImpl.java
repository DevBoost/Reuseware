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

import org.reuseware.air.language.cmsl.BaseLanguageReference;
import org.reuseware.air.language.cmsl.CmslPackage;
import org.reuseware.air.language.cmsl.NonTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Language Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.BaseLanguageReferenceImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.BaseLanguageReferenceImpl#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseLanguageReferenceImpl extends EObjectImpl implements BaseLanguageReference {
	/**
   * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
	protected String language = LANGUAGE_EDEFAULT;

	/**
   * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
	protected NonTerminal base;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BaseLanguageReferenceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.BASE_LANGUAGE_REFERENCE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLanguage() {
    return language;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLanguage(String newLanguage) {
    String oldLanguage = language;
    language = newLanguage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE, oldLanguage, language));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NonTerminal getBase() {
    return base;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBase(NonTerminal newBase, NotificationChain msgs) {
    NonTerminal oldBase = base;
    base = newBase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.BASE_LANGUAGE_REFERENCE__BASE, oldBase, newBase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBase(NonTerminal newBase) {
    if (newBase != base)
    {
      NotificationChain msgs = null;
      if (base != null)
        msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.BASE_LANGUAGE_REFERENCE__BASE, null, msgs);
      if (newBase != null)
        msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.BASE_LANGUAGE_REFERENCE__BASE, null, msgs);
      msgs = basicSetBase(newBase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.BASE_LANGUAGE_REFERENCE__BASE, newBase, newBase));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case CmslPackage.BASE_LANGUAGE_REFERENCE__BASE:
        return basicSetBase(null, msgs);
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
      case CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE:
        return getLanguage();
      case CmslPackage.BASE_LANGUAGE_REFERENCE__BASE:
        return getBase();
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
      case CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE:
        setLanguage((String)newValue);
        return;
      case CmslPackage.BASE_LANGUAGE_REFERENCE__BASE:
        setBase((NonTerminal)newValue);
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
      case CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE:
        setLanguage(LANGUAGE_EDEFAULT);
        return;
      case CmslPackage.BASE_LANGUAGE_REFERENCE__BASE:
        setBase((NonTerminal)null);
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
      case CmslPackage.BASE_LANGUAGE_REFERENCE__LANGUAGE:
        return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
      case CmslPackage.BASE_LANGUAGE_REFERENCE__BASE:
        return base != null;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (language: ");
    result.append(language);
    result.append(')');
    return result.toString();
  }

} //BaseLanguageReferenceImpl
