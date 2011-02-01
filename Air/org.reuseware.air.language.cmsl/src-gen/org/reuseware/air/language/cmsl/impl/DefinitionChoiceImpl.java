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

import org.reuseware.air.language.cmsl.CmslPackage;
import org.reuseware.air.language.cmsl.DefinitionChoice;
import org.reuseware.air.language.cmsl.NonTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.DefinitionChoiceImpl#getNewConstruct <em>New Construct</em>}</li>
 *   <li>{@link org.reuseware.air.language.cmsl.impl.DefinitionChoiceImpl#getChoice <em>Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionChoiceImpl extends EObjectImpl implements DefinitionChoice {
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
   * The cached value of the '{@link #getChoice() <em>Choice</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChoice()
   * @generated
   * @ordered
   */
	protected EList choice;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DefinitionChoiceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EClass eStaticClass() {
    return CmslPackage.Literals.DEFINITION_CHOICE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT, oldNewConstruct, newNewConstruct);
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
        msgs = ((InternalEObject)newConstruct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT, null, msgs);
      if (newNewConstruct != null)
        msgs = ((InternalEObject)newNewConstruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT, null, msgs);
      msgs = basicSetNewConstruct(newNewConstruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT, newNewConstruct, newNewConstruct));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList getChoice() {
    if (choice == null)
    {
      choice = new EObjectContainmentEList(NonTerminal.class, this, CmslPackage.DEFINITION_CHOICE__CHOICE);
    }
    return choice;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT:
        return basicSetNewConstruct(null, msgs);
      case CmslPackage.DEFINITION_CHOICE__CHOICE:
        return ((InternalEList)getChoice()).basicRemove(otherEnd, msgs);
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
      case CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT:
        return getNewConstruct();
      case CmslPackage.DEFINITION_CHOICE__CHOICE:
        return getChoice();
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
      case CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT:
        setNewConstruct((NonTerminal)newValue);
        return;
      case CmslPackage.DEFINITION_CHOICE__CHOICE:
        getChoice().clear();
        getChoice().addAll((Collection)newValue);
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
      case CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT:
        setNewConstruct((NonTerminal)null);
        return;
      case CmslPackage.DEFINITION_CHOICE__CHOICE:
        getChoice().clear();
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
      case CmslPackage.DEFINITION_CHOICE__NEW_CONSTRUCT:
        return newConstruct != null;
      case CmslPackage.DEFINITION_CHOICE__CHOICE:
        return choice != null && !choice.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefinitionChoiceImpl
