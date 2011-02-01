/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.reuseware.air.language.cmsl.CmslPackage;
import org.reuseware.air.language.cmsl.ExtensionDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.ExtensionDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.ExtensionDeclarationImpl#getNsuri <em>Nsuri</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.ExtensionDeclarationImpl#getNsprefix <em>Nsprefix</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.ExtensionDeclarationImpl#getTargeturl <em>Targeturl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionDeclarationImpl extends EObjectImpl implements ExtensionDeclaration {
	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getNsuri() <em>Nsuri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNsuri()
   * @generated
   * @ordered
   */
	protected static final String NSURI_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getNsuri() <em>Nsuri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNsuri()
   * @generated
   * @ordered
   */
	protected String nsuri = NSURI_EDEFAULT;

	/**
   * The default value of the '{@link #getNsprefix() <em>Nsprefix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNsprefix()
   * @generated
   * @ordered
   */
	protected static final String NSPREFIX_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getNsprefix() <em>Nsprefix</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNsprefix()
   * @generated
   * @ordered
   */
	protected String nsprefix = NSPREFIX_EDEFAULT;

	/**
   * The default value of the '{@link #getTargeturl() <em>Targeturl</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargeturl()
   * @generated
   * @ordered
   */
	protected static final String TARGETURL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getTargeturl() <em>Targeturl</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTargeturl()
   * @generated
   * @ordered
   */
	protected String targeturl = TARGETURL_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ExtensionDeclarationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.EXTENSION_DECLARATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.EXTENSION_DECLARATION__NAME, oldName, name));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getNsuri() {
    return nsuri;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNsuri(String newNsuri) {
    String oldNsuri = nsuri;
    nsuri = newNsuri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.EXTENSION_DECLARATION__NSURI, oldNsuri, nsuri));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getNsprefix() {
    return nsprefix;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNsprefix(String newNsprefix) {
    String oldNsprefix = nsprefix;
    nsprefix = newNsprefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.EXTENSION_DECLARATION__NSPREFIX, oldNsprefix, nsprefix));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getTargeturl() {
    return targeturl;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTargeturl(String newTargeturl) {
    String oldTargeturl = targeturl;
    targeturl = newTargeturl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.EXTENSION_DECLARATION__TARGETURL, oldTargeturl, targeturl));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case CmslPackage.EXTENSION_DECLARATION__NAME:
        return getName();
      case CmslPackage.EXTENSION_DECLARATION__NSURI:
        return getNsuri();
      case CmslPackage.EXTENSION_DECLARATION__NSPREFIX:
        return getNsprefix();
      case CmslPackage.EXTENSION_DECLARATION__TARGETURL:
        return getTargeturl();
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
      case CmslPackage.EXTENSION_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case CmslPackage.EXTENSION_DECLARATION__NSURI:
        setNsuri((String)newValue);
        return;
      case CmslPackage.EXTENSION_DECLARATION__NSPREFIX:
        setNsprefix((String)newValue);
        return;
      case CmslPackage.EXTENSION_DECLARATION__TARGETURL:
        setTargeturl((String)newValue);
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
      case CmslPackage.EXTENSION_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CmslPackage.EXTENSION_DECLARATION__NSURI:
        setNsuri(NSURI_EDEFAULT);
        return;
      case CmslPackage.EXTENSION_DECLARATION__NSPREFIX:
        setNsprefix(NSPREFIX_EDEFAULT);
        return;
      case CmslPackage.EXTENSION_DECLARATION__TARGETURL:
        setTargeturl(TARGETURL_EDEFAULT);
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
      case CmslPackage.EXTENSION_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CmslPackage.EXTENSION_DECLARATION__NSURI:
        return NSURI_EDEFAULT == null ? nsuri != null : !NSURI_EDEFAULT.equals(nsuri);
      case CmslPackage.EXTENSION_DECLARATION__NSPREFIX:
        return NSPREFIX_EDEFAULT == null ? nsprefix != null : !NSPREFIX_EDEFAULT.equals(nsprefix);
      case CmslPackage.EXTENSION_DECLARATION__TARGETURL:
        return TARGETURL_EDEFAULT == null ? targeturl != null : !TARGETURL_EDEFAULT.equals(targeturl);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", nsuri: ");
    result.append(nsuri);
    result.append(", nsprefix: ");
    result.append(nsprefix);
    result.append(", targeturl: ");
    result.append(targeturl);
    result.append(')');
    return result.toString();
  }

} //ExtensionDeclarationImpl
