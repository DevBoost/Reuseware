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

import org.reuseware.air.language.cmsl.BaseDeclaration;
import org.reuseware.air.language.cmsl.CmslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.BaseDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.BaseDeclarationImpl#getNsuri <em>Nsuri</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.BaseDeclarationImpl#getSourceurl <em>Sourceurl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseDeclarationImpl extends EObjectImpl implements BaseDeclaration {
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
   * The default value of the '{@link #getSourceurl() <em>Sourceurl</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSourceurl()
   * @generated
   * @ordered
   */
	protected static final String SOURCEURL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getSourceurl() <em>Sourceurl</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSourceurl()
   * @generated
   * @ordered
   */
	protected String sourceurl = SOURCEURL_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BaseDeclarationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.BASE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.BASE_DECLARATION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.BASE_DECLARATION__NSURI, oldNsuri, nsuri));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getSourceurl() {
    return sourceurl;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSourceurl(String newSourceurl) {
    String oldSourceurl = sourceurl;
    sourceurl = newSourceurl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.BASE_DECLARATION__SOURCEURL, oldSourceurl, sourceurl));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case CmslPackage.BASE_DECLARATION__NAME:
        return getName();
      case CmslPackage.BASE_DECLARATION__NSURI:
        return getNsuri();
      case CmslPackage.BASE_DECLARATION__SOURCEURL:
        return getSourceurl();
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
      case CmslPackage.BASE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case CmslPackage.BASE_DECLARATION__NSURI:
        setNsuri((String)newValue);
        return;
      case CmslPackage.BASE_DECLARATION__SOURCEURL:
        setSourceurl((String)newValue);
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
      case CmslPackage.BASE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CmslPackage.BASE_DECLARATION__NSURI:
        setNsuri(NSURI_EDEFAULT);
        return;
      case CmslPackage.BASE_DECLARATION__SOURCEURL:
        setSourceurl(SOURCEURL_EDEFAULT);
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
      case CmslPackage.BASE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CmslPackage.BASE_DECLARATION__NSURI:
        return NSURI_EDEFAULT == null ? nsuri != null : !NSURI_EDEFAULT.equals(nsuri);
      case CmslPackage.BASE_DECLARATION__SOURCEURL:
        return SOURCEURL_EDEFAULT == null ? sourceurl != null : !SOURCEURL_EDEFAULT.equals(sourceurl);
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
    result.append(", sourceurl: ");
    result.append(sourceurl);
    result.append(')');
    return result.toString();
  }

} //BaseDeclarationImpl
