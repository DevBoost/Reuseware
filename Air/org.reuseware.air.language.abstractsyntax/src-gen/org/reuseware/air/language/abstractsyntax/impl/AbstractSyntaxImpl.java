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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.reuseware.air.language.abstractsyntax.ASUnit;
import org.reuseware.air.language.abstractsyntax.AbstractSyntax;
import org.reuseware.air.language.abstractsyntax.AbstractsyntaxPackage;
import org.reuseware.air.language.abstractsyntax.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.AbstractSyntaxImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.AbstractSyntaxImpl#getNsuri <em>Nsuri</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.AbstractSyntaxImpl#getNsprefix <em>Nsprefix</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.AbstractSyntaxImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.reuseware.air.language.abstractsyntax.impl.AbstractSyntaxImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractSyntaxImpl extends EObjectImpl implements AbstractSyntax {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected ASUnit unit;

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
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> import_;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.ABSTRACT_SYNTAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(ASUnit newUnit, NotificationChain msgs) {
		ASUnit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(ASUnit newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT, newUnit, newUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI, oldNsuri, nsuri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX, oldNsprefix, nsprefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<Import>(Import.class, this, AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT);
		}
		return import_;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT:
				return basicSetUnit(null, msgs);
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT:
				return getUnit();
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI:
				return getNsuri();
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX:
				return getNsprefix();
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT:
				return getImport();
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME:
				return getName();
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT:
				setUnit((ASUnit)newValue);
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI:
				setNsuri((String)newValue);
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX:
				setNsprefix((String)newValue);
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Import>)newValue);
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME:
				setName((String)newValue);
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT:
				setUnit((ASUnit)null);
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI:
				setNsuri(NSURI_EDEFAULT);
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX:
				setNsprefix(NSPREFIX_EDEFAULT);
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT:
				getImport().clear();
				return;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME:
				setName(NAME_EDEFAULT);
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
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__UNIT:
				return unit != null;
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSURI:
				return NSURI_EDEFAULT == null ? nsuri != null : !NSURI_EDEFAULT.equals(nsuri);
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NSPREFIX:
				return NSPREFIX_EDEFAULT == null ? nsprefix != null : !NSPREFIX_EDEFAULT.equals(nsprefix);
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__IMPORT:
				return import_ != null && !import_.isEmpty();
			case AbstractsyntaxPackage.ABSTRACT_SYNTAX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (nsuri: ");
		result.append(nsuri);
		result.append(", nsprefix: ");
		result.append(nsprefix);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractSyntaxImpl
