/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Decls Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SequenceDeclsTypeImpl#getSequenceDecl <em>Sequence Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceDeclsTypeImpl extends EObjectImpl implements SequenceDeclsType {
	/**
	 * The cached value of the '{@link #getSequenceDecl() <em>Sequence Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceDeclType> sequenceDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceDeclsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getSequenceDeclsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceDeclType> getSequenceDecl() {
		if (sequenceDecl == null) {
			sequenceDecl = new EObjectContainmentEList<SequenceDeclType>(SequenceDeclType.class, this, TextPackage.SEQUENCE_DECLS_TYPE__SEQUENCE_DECL);
		}
		return sequenceDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.SEQUENCE_DECLS_TYPE__SEQUENCE_DECL:
				return ((InternalEList<?>)getSequenceDecl()).basicRemove(otherEnd, msgs);
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
			case TextPackage.SEQUENCE_DECLS_TYPE__SEQUENCE_DECL:
				return getSequenceDecl();
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
			case TextPackage.SEQUENCE_DECLS_TYPE__SEQUENCE_DECL:
				getSequenceDecl().clear();
				getSequenceDecl().addAll((Collection<? extends SequenceDeclType>)newValue);
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
			case TextPackage.SEQUENCE_DECLS_TYPE__SEQUENCE_DECL:
				getSequenceDecl().clear();
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
			case TextPackage.SEQUENCE_DECLS_TYPE__SEQUENCE_DECL:
				return sequenceDecl != null && !sequenceDecl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceDeclsTypeImpl
