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
import org.reuseware.air.language.cmsl.ConstructReference;
import org.reuseware.air.language.cmsl.DefinitionPart;
import org.reuseware.air.language.cmsl.Role;
import org.reuseware.air.language.cmsl.UpperLevelReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.DefinitionPartImpl#getRolename <em>Rolename</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.DefinitionPartImpl#getConstruct <em>Construct</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.DefinitionPartImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionPartImpl extends EObjectImpl implements DefinitionPart {
	/**
   * The cached value of the '{@link #getRolename() <em>Rolename</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRolename()
   * @generated
   * @ordered
   */
	protected Role rolename;

	/**
   * The cached value of the '{@link #getConstruct() <em>Construct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getConstruct()
   * @generated
   * @ordered
   */
	protected ConstructReference construct;

	/**
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
	protected UpperLevelReference annotation;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DefinitionPartImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.DEFINITION_PART;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Role getRolename() {
    return rolename;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetRolename(Role newRolename, NotificationChain msgs) {
    Role oldRolename = rolename;
    rolename = newRolename;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_PART__ROLENAME, oldRolename, newRolename);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRolename(Role newRolename) {
    if (newRolename != rolename)
    {
      NotificationChain msgs = null;
      if (rolename != null)
        msgs = ((InternalEObject)rolename).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_PART__ROLENAME, null, msgs);
      if (newRolename != null)
        msgs = ((InternalEObject)newRolename).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_PART__ROLENAME, null, msgs);
      msgs = basicSetRolename(newRolename, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_PART__ROLENAME, newRolename, newRolename));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ConstructReference getConstruct() {
    return construct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetConstruct(ConstructReference newConstruct, NotificationChain msgs) {
    ConstructReference oldConstruct = construct;
    construct = newConstruct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_PART__CONSTRUCT, oldConstruct, newConstruct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setConstruct(ConstructReference newConstruct) {
    if (newConstruct != construct)
    {
      NotificationChain msgs = null;
      if (construct != null)
        msgs = ((InternalEObject)construct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_PART__CONSTRUCT, null, msgs);
      if (newConstruct != null)
        msgs = ((InternalEObject)newConstruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_PART__CONSTRUCT, null, msgs);
      msgs = basicSetConstruct(newConstruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_PART__CONSTRUCT, newConstruct, newConstruct));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public UpperLevelReference getAnnotation() {
    return annotation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAnnotation(UpperLevelReference newAnnotation, NotificationChain msgs) {
    UpperLevelReference oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_PART__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAnnotation(UpperLevelReference newAnnotation) {
    if (newAnnotation != annotation)
    {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_PART__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_PART__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_PART__ANNOTATION, newAnnotation, newAnnotation));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case CmslPackage.DEFINITION_PART__ROLENAME:
        return basicSetRolename(null, msgs);
      case CmslPackage.DEFINITION_PART__CONSTRUCT:
        return basicSetConstruct(null, msgs);
      case CmslPackage.DEFINITION_PART__ANNOTATION:
        return basicSetAnnotation(null, msgs);
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
      case CmslPackage.DEFINITION_PART__ROLENAME:
        return getRolename();
      case CmslPackage.DEFINITION_PART__CONSTRUCT:
        return getConstruct();
      case CmslPackage.DEFINITION_PART__ANNOTATION:
        return getAnnotation();
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
      case CmslPackage.DEFINITION_PART__ROLENAME:
        setRolename((Role)newValue);
        return;
      case CmslPackage.DEFINITION_PART__CONSTRUCT:
        setConstruct((ConstructReference)newValue);
        return;
      case CmslPackage.DEFINITION_PART__ANNOTATION:
        setAnnotation((UpperLevelReference)newValue);
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
      case CmslPackage.DEFINITION_PART__ROLENAME:
        setRolename((Role)null);
        return;
      case CmslPackage.DEFINITION_PART__CONSTRUCT:
        setConstruct((ConstructReference)null);
        return;
      case CmslPackage.DEFINITION_PART__ANNOTATION:
        setAnnotation((UpperLevelReference)null);
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
      case CmslPackage.DEFINITION_PART__ROLENAME:
        return rolename != null;
      case CmslPackage.DEFINITION_PART__CONSTRUCT:
        return construct != null;
      case CmslPackage.DEFINITION_PART__ANNOTATION:
        return annotation != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionPartImpl
