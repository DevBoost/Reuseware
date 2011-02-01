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
import org.reuseware.air.language.cmsl.DefinitionConstruct;
import org.reuseware.air.language.cmsl.DefinitionList;
import org.reuseware.air.language.cmsl.NonTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.DefinitionConstructImpl#getNewConstruct <em>New Construct</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.DefinitionConstructImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionConstructImpl extends EObjectImpl implements DefinitionConstruct {
	/**
   * The cached value of the '{@link #getNewConstruct() <em>New Construct</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNewConstruct()
   * @generated
   * @ordered
   */
	protected NonTerminal newConstruct;

	/**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
	protected DefinitionList definition;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DefinitionConstructImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.DEFINITION_CONSTRUCT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NonTerminal getNewConstruct() {
    return newConstruct;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetNewConstruct(NonTerminal newNewConstruct, NotificationChain msgs) {
    NonTerminal oldNewConstruct = newConstruct;
    newConstruct = newNewConstruct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT, oldNewConstruct, newNewConstruct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNewConstruct(NonTerminal newNewConstruct) {
    if (newNewConstruct != newConstruct)
    {
      NotificationChain msgs = null;
      if (newConstruct != null)
        msgs = ((InternalEObject)newConstruct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT, null, msgs);
      if (newNewConstruct != null)
        msgs = ((InternalEObject)newNewConstruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT, null, msgs);
      msgs = basicSetNewConstruct(newNewConstruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT, newNewConstruct, newNewConstruct));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DefinitionList getDefinition() {
    return definition;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetDefinition(DefinitionList newDefinition, NotificationChain msgs) {
    DefinitionList oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_CONSTRUCT__DEFINITION, oldDefinition, newDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDefinition(DefinitionList newDefinition) {
    if (newDefinition != definition)
    {
      NotificationChain msgs = null;
      if (definition != null)
        msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_CONSTRUCT__DEFINITION, null, msgs);
      if (newDefinition != null)
        msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_CONSTRUCT__DEFINITION, null, msgs);
      msgs = basicSetDefinition(newDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_CONSTRUCT__DEFINITION, newDefinition, newDefinition));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT:
        return basicSetNewConstruct(null, msgs);
      case CmslPackage.DEFINITION_CONSTRUCT__DEFINITION:
        return basicSetDefinition(null, msgs);
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
      case CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT:
        return getNewConstruct();
      case CmslPackage.DEFINITION_CONSTRUCT__DEFINITION:
        return getDefinition();
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
      case CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT:
        setNewConstruct((NonTerminal)newValue);
        return;
      case CmslPackage.DEFINITION_CONSTRUCT__DEFINITION:
        setDefinition((DefinitionList)newValue);
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
      case CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT:
        setNewConstruct((NonTerminal)null);
        return;
      case CmslPackage.DEFINITION_CONSTRUCT__DEFINITION:
        setDefinition((DefinitionList)null);
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
      case CmslPackage.DEFINITION_CONSTRUCT__NEW_CONSTRUCT:
        return newConstruct != null;
      case CmslPackage.DEFINITION_CONSTRUCT__DEFINITION:
        return definition != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionConstructImpl
