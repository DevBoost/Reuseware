/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.cmsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.reuseware.air.language.cmsl.BaseDeclaration;
import org.reuseware.air.language.cmsl.CmslPackage;
import org.reuseware.air.language.cmsl.ExtensionDeclaration;
import org.reuseware.air.language.cmsl.ExtensionProgram;
import org.reuseware.air.language.cmsl.ExtensionStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.ExtensionProgramImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.ExtensionProgramImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.ExtensionProgramImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionProgramImpl extends EObjectImpl implements ExtensionProgram {
	/**
   * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
	protected BaseDeclaration base;

	/**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
	protected ExtensionDeclaration extension;

	/**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
	protected EList statements;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ExtensionProgramImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.EXTENSION_PROGRAM;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BaseDeclaration getBase() {
    return base;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetBase(BaseDeclaration newBase, NotificationChain msgs) {
    BaseDeclaration oldBase = base;
    base = newBase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.EXTENSION_PROGRAM__BASE, oldBase, newBase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBase(BaseDeclaration newBase) {
    if (newBase != base)
    {
      NotificationChain msgs = null;
      if (base != null)
        msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.EXTENSION_PROGRAM__BASE, null, msgs);
      if (newBase != null)
        msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.EXTENSION_PROGRAM__BASE, null, msgs);
      msgs = basicSetBase(newBase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.EXTENSION_PROGRAM__BASE, newBase, newBase));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ExtensionDeclaration getExtension() {
    return extension;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetExtension(ExtensionDeclaration newExtension, NotificationChain msgs) {
    ExtensionDeclaration oldExtension = extension;
    extension = newExtension;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.EXTENSION_PROGRAM__EXTENSION, oldExtension, newExtension);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setExtension(ExtensionDeclaration newExtension) {
    if (newExtension != extension)
    {
      NotificationChain msgs = null;
      if (extension != null)
        msgs = ((InternalEObject)extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.EXTENSION_PROGRAM__EXTENSION, null, msgs);
      if (newExtension != null)
        msgs = ((InternalEObject)newExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.EXTENSION_PROGRAM__EXTENSION, null, msgs);
      msgs = basicSetExtension(newExtension, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.EXTENSION_PROGRAM__EXTENSION, newExtension, newExtension));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList getStatements() {
    if (statements == null)
    {
      statements = new EObjectContainmentEList(ExtensionStatement.class, this, CmslPackage.EXTENSION_PROGRAM__STATEMENTS);
    }
    return statements;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case CmslPackage.EXTENSION_PROGRAM__BASE:
        return basicSetBase(null, msgs);
      case CmslPackage.EXTENSION_PROGRAM__EXTENSION:
        return basicSetExtension(null, msgs);
      case CmslPackage.EXTENSION_PROGRAM__STATEMENTS:
        return ((InternalEList)getStatements()).basicRemove(otherEnd, msgs);
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
      case CmslPackage.EXTENSION_PROGRAM__BASE:
        return getBase();
      case CmslPackage.EXTENSION_PROGRAM__EXTENSION:
        return getExtension();
      case CmslPackage.EXTENSION_PROGRAM__STATEMENTS:
        return getStatements();
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
      case CmslPackage.EXTENSION_PROGRAM__BASE:
        setBase((BaseDeclaration)newValue);
        return;
      case CmslPackage.EXTENSION_PROGRAM__EXTENSION:
        setExtension((ExtensionDeclaration)newValue);
        return;
      case CmslPackage.EXTENSION_PROGRAM__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection)newValue);
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
      case CmslPackage.EXTENSION_PROGRAM__BASE:
        setBase((BaseDeclaration)null);
        return;
      case CmslPackage.EXTENSION_PROGRAM__EXTENSION:
        setExtension((ExtensionDeclaration)null);
        return;
      case CmslPackage.EXTENSION_PROGRAM__STATEMENTS:
        getStatements().clear();
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
      case CmslPackage.EXTENSION_PROGRAM__BASE:
        return base != null;
      case CmslPackage.EXTENSION_PROGRAM__EXTENSION:
        return extension != null;
      case CmslPackage.EXTENSION_PROGRAM__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExtensionProgramImpl
