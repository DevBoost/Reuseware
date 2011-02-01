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

import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage;
import org.reuseware.air.language.abstractsyntax.Definition;
import org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Node Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.InterfaceNodeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.InterfaceNodeDefinitionImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.InterfaceNodeDefinitionImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceNodeDefinitionImpl extends EObjectImpl implements InterfaceNodeDefinition {
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
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceNodeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.INTERFACE_NODE_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceNodeDefinition> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectWithInverseResolvingEList.ManyInverse<InterfaceNodeDefinition>(InterfaceNodeDefinition.class, this, AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__INTERFACES, AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Definition> getOptions() {
		if (options == null) {
			options = new EObjectWithInverseResolvingEList.ManyInverse<Definition>(Definition.class, this, AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS, AbstractsyntaxPackage.DEFINITION__INTERFACES);
		}
		return options;
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
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaces()).basicAdd(otherEnd, msgs);
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOptions()).basicAdd(otherEnd, msgs);
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
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME:
				return getName();
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__INTERFACES:
				return getInterfaces();
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS:
				return getOptions();
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
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfaceNodeDefinition>)newValue);
				return;
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Definition>)newValue);
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
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__INTERFACES:
				getInterfaces().clear();
				return;
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS:
				getOptions().clear();
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
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case AbstractsyntaxPackage.INTERFACE_NODE_DEFINITION__OPTIONS:
				return options != null && !options.isEmpty();
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

} //InterfaceNodeDefinitionImpl
