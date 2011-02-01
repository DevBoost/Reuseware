/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.air.language.abstractsyntax.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage;
import org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition;
import org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition;
import org.reuseware.air.language.abstractsyntax.NodeFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Node Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.ConcreteNodeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.ConcreteNodeDefinitionImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.ConcreteNodeDefinitionImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.ConcreteNodeDefinitionImpl#getESuperClass <em>ESuper Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteNodeDefinitionImpl extends EObjectImpl implements ConcreteNodeDefinition {
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
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceNodeDefinition> interfaces;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeFeature> members;

	/**
	 * The cached value of the '{@link #getESuperClass() <em>ESuper Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESuperClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eSuperClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteNodeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.CONCRETE_NODE_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceNodeDefinition> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectWithInverseResolvingEList.ManyInverse<InterfaceNodeDefinition>(InterfaceNodeDefinition.class, this, AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__INTERFACES, AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeFeature> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<NodeFeature>(NodeFeature.class, this, AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESuperClass() {
		if (eSuperClass != null && eSuperClass.eIsProxy()) {
			InternalEObject oldESuperClass = (InternalEObject)eSuperClass;
			eSuperClass = (EClass)eResolveProxy(oldESuperClass);
			if (eSuperClass != oldESuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS, oldESuperClass, eSuperClass));
			}
		}
		return eSuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetESuperClass() {
		return eSuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setESuperClass(EClass newESuperClass) {
		EClass oldESuperClass = eSuperClass;
		eSuperClass = newESuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS, oldESuperClass, eSuperClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaces()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME:
				return getName();
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__INTERFACES:
				return getInterfaces();
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS:
				return getMembers();
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS:
				if (resolve) return getESuperClass();
				return basicGetESuperClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfaceNodeDefinition>)newValue);
				return;
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends NodeFeature>)newValue);
				return;
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS:
				setESuperClass((EClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__INTERFACES:
				getInterfaces().clear();
				return;
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS:
				getMembers().clear();
				return;
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS:
				setESuperClass((EClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__MEMBERS:
				return members != null && !members.isEmpty();
			case AbstractsyntaxPackage.CONCRETE_NODE_DEFINITION__ESUPER_CLASS:
				return eSuperClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConcreteNodeDefinitionImpl
