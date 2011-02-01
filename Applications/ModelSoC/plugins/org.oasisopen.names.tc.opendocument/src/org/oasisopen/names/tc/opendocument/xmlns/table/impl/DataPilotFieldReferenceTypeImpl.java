/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.MemberTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TypeType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pilot Field Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldReferenceTypeImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldReferenceTypeImpl#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldReferenceTypeImpl#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldReferenceTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPilotFieldReferenceTypeImpl extends EObjectImpl implements DataPilotFieldReferenceType {
	/**
	 * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldName()
	 * @generated
	 * @ordered
	 */
	protected String fieldName = FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberName() <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberName()
	 * @generated
	 * @ordered
	 */
	protected String memberName = MEMBER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemberType() <em>Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberType()
	 * @generated
	 * @ordered
	 */
	protected static final MemberTypeType MEMBER_TYPE_EDEFAULT = MemberTypeType.NAMED;

	/**
	 * The cached value of the '{@link #getMemberType() <em>Member Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberType()
	 * @generated
	 * @ordered
	 */
	protected MemberTypeType memberType = MEMBER_TYPE_EDEFAULT;

	/**
	 * This is true if the Member Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memberTypeESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType1 TYPE_EDEFAULT = TypeType1.NONE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType1 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPilotFieldReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDataPilotFieldReferenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldName(String newFieldName) {
		String oldFieldName = fieldName;
		fieldName = newFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__FIELD_NAME, oldFieldName, fieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberName(String newMemberName) {
		String oldMemberName = memberName;
		memberName = newMemberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_NAME, oldMemberName, memberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberTypeType getMemberType() {
		return memberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberType(MemberTypeType newMemberType) {
		MemberTypeType oldMemberType = memberType;
		memberType = newMemberType == null ? MEMBER_TYPE_EDEFAULT : newMemberType;
		boolean oldMemberTypeESet = memberTypeESet;
		memberTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_TYPE, oldMemberType, memberType, !oldMemberTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemberType() {
		MemberTypeType oldMemberType = memberType;
		boolean oldMemberTypeESet = memberTypeESet;
		memberType = MEMBER_TYPE_EDEFAULT;
		memberTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_TYPE, oldMemberType, MEMBER_TYPE_EDEFAULT, oldMemberTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberType() {
		return memberTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType1 newType) {
		TypeType1 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType1 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__FIELD_NAME:
				return getFieldName();
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_NAME:
				return getMemberName();
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_TYPE:
				return getMemberType();
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__TYPE:
				return getType();
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
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__FIELD_NAME:
				setFieldName((String)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_NAME:
				setMemberName((String)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_TYPE:
				setMemberType((MemberTypeType)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__TYPE:
				setType((TypeType1)newValue);
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
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__FIELD_NAME:
				setFieldName(FIELD_NAME_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_NAME:
				setMemberName(MEMBER_NAME_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_TYPE:
				unsetMemberType();
				return;
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__TYPE:
				unsetType();
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
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__FIELD_NAME:
				return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_NAME:
				return MEMBER_NAME_EDEFAULT == null ? memberName != null : !MEMBER_NAME_EDEFAULT.equals(memberName);
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__MEMBER_TYPE:
				return isSetMemberType();
			case TablePackage.DATA_PILOT_FIELD_REFERENCE_TYPE__TYPE:
				return isSetType();
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
		result.append(" (fieldName: ");
		result.append(fieldName);
		result.append(", memberName: ");
		result.append(memberName);
		result.append(", memberType: ");
		if (memberTypeESet) result.append(memberType); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataPilotFieldReferenceTypeImpl
