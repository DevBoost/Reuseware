/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.ReferenceFormatType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SequenceRefType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SequenceRefTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SequenceRefTypeImpl#getReferenceFormat <em>Reference Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SequenceRefTypeImpl#getRefName <em>Ref Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceRefTypeImpl extends EObjectImpl implements SequenceRefType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getReferenceFormat() <em>Reference Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFormat()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceFormatType REFERENCE_FORMAT_EDEFAULT = ReferenceFormatType.PAGE;

	/**
	 * The cached value of the '{@link #getReferenceFormat() <em>Reference Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFormat()
	 * @generated
	 * @ordered
	 */
	protected ReferenceFormatType referenceFormat = REFERENCE_FORMAT_EDEFAULT;

	/**
	 * This is true if the Reference Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceFormatESet;

	/**
	 * The default value of the '{@link #getRefName() <em>Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefName()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefName() <em>Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefName()
	 * @generated
	 * @ordered
	 */
	protected String refName = REF_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getSequenceRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TextPackage.SEQUENCE_REF_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceFormatType getReferenceFormat() {
		return referenceFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceFormat(ReferenceFormatType newReferenceFormat) {
		ReferenceFormatType oldReferenceFormat = referenceFormat;
		referenceFormat = newReferenceFormat == null ? REFERENCE_FORMAT_EDEFAULT : newReferenceFormat;
		boolean oldReferenceFormatESet = referenceFormatESet;
		referenceFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SEQUENCE_REF_TYPE__REFERENCE_FORMAT, oldReferenceFormat, referenceFormat, !oldReferenceFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferenceFormat() {
		ReferenceFormatType oldReferenceFormat = referenceFormat;
		boolean oldReferenceFormatESet = referenceFormatESet;
		referenceFormat = REFERENCE_FORMAT_EDEFAULT;
		referenceFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.SEQUENCE_REF_TYPE__REFERENCE_FORMAT, oldReferenceFormat, REFERENCE_FORMAT_EDEFAULT, oldReferenceFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferenceFormat() {
		return referenceFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefName() {
		return refName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefName(String newRefName) {
		String oldRefName = refName;
		refName = newRefName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SEQUENCE_REF_TYPE__REF_NAME, oldRefName, refName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.SEQUENCE_REF_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case TextPackage.SEQUENCE_REF_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TextPackage.SEQUENCE_REF_TYPE__REFERENCE_FORMAT:
				return getReferenceFormat();
			case TextPackage.SEQUENCE_REF_TYPE__REF_NAME:
				return getRefName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextPackage.SEQUENCE_REF_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TextPackage.SEQUENCE_REF_TYPE__REFERENCE_FORMAT:
				setReferenceFormat((ReferenceFormatType)newValue);
				return;
			case TextPackage.SEQUENCE_REF_TYPE__REF_NAME:
				setRefName((String)newValue);
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
			case TextPackage.SEQUENCE_REF_TYPE__MIXED:
				getMixed().clear();
				return;
			case TextPackage.SEQUENCE_REF_TYPE__REFERENCE_FORMAT:
				unsetReferenceFormat();
				return;
			case TextPackage.SEQUENCE_REF_TYPE__REF_NAME:
				setRefName(REF_NAME_EDEFAULT);
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
			case TextPackage.SEQUENCE_REF_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TextPackage.SEQUENCE_REF_TYPE__REFERENCE_FORMAT:
				return isSetReferenceFormat();
			case TextPackage.SEQUENCE_REF_TYPE__REF_NAME:
				return REF_NAME_EDEFAULT == null ? refName != null : !REF_NAME_EDEFAULT.equals(refName);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", referenceFormat: ");
		if (referenceFormatESet) result.append(referenceFormat); else result.append("<unset>");
		result.append(", refName: ");
		result.append(refName);
		result.append(')');
		return result.toString();
	}

} //SequenceRefTypeImpl
