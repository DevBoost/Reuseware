/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.GroupedByType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pilot Groups Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl#getDataPilotGroup <em>Data Pilot Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl#getDateEnd <em>Date End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl#getDateStart <em>Date Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl#getGroupedBy <em>Grouped By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl#getSourceFieldName <em>Source Field Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotGroupsTypeImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPilotGroupsTypeImpl extends EObjectImpl implements DataPilotGroupsType {
	/**
	 * The cached value of the '{@link #getDataPilotGroup() <em>Data Pilot Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPilotGroupType> dataPilotGroup;

	/**
	 * The default value of the '{@link #getDateEnd() <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATE_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEnd() <em>Date End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnd()
	 * @generated
	 * @ordered
	 */
	protected Object dateEnd = DATE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateStart() <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateStart()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATE_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateStart() <em>Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateStart()
	 * @generated
	 * @ordered
	 */
	protected Object dateStart = DATE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Object END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Object end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupedBy() <em>Grouped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedBy()
	 * @generated
	 * @ordered
	 */
	protected static final GroupedByType GROUPED_BY_EDEFAULT = GroupedByType.SECONDS;

	/**
	 * The cached value of the '{@link #getGroupedBy() <em>Grouped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedBy()
	 * @generated
	 * @ordered
	 */
	protected GroupedByType groupedBy = GROUPED_BY_EDEFAULT;

	/**
	 * This is true if the Grouped By attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean groupedByESet;

	/**
	 * The default value of the '{@link #getSourceFieldName() <em>Source Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceFieldName() <em>Source Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFieldName()
	 * @generated
	 * @ordered
	 */
	protected String sourceFieldName = SOURCE_FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Object START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Object start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected double step = STEP_EDEFAULT;

	/**
	 * This is true if the Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPilotGroupsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDataPilotGroupsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPilotGroupType> getDataPilotGroup() {
		if (dataPilotGroup == null) {
			dataPilotGroup = new EObjectContainmentEList<DataPilotGroupType>(DataPilotGroupType.class, this, TablePackage.DATA_PILOT_GROUPS_TYPE__DATA_PILOT_GROUP);
		}
		return dataPilotGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDateEnd() {
		return dateEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEnd(Object newDateEnd) {
		Object oldDateEnd = dateEnd;
		dateEnd = newDateEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_END, oldDateEnd, dateEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDateStart() {
		return dateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateStart(Object newDateStart) {
		Object oldDateStart = dateStart;
		dateStart = newDateStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_START, oldDateStart, dateStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Object newEnd) {
		Object oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_GROUPS_TYPE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupedByType getGroupedBy() {
		return groupedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupedBy(GroupedByType newGroupedBy) {
		GroupedByType oldGroupedBy = groupedBy;
		groupedBy = newGroupedBy == null ? GROUPED_BY_EDEFAULT : newGroupedBy;
		boolean oldGroupedByESet = groupedByESet;
		groupedByESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_GROUPS_TYPE__GROUPED_BY, oldGroupedBy, groupedBy, !oldGroupedByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGroupedBy() {
		GroupedByType oldGroupedBy = groupedBy;
		boolean oldGroupedByESet = groupedByESet;
		groupedBy = GROUPED_BY_EDEFAULT;
		groupedByESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_GROUPS_TYPE__GROUPED_BY, oldGroupedBy, GROUPED_BY_EDEFAULT, oldGroupedByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGroupedBy() {
		return groupedByESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceFieldName() {
		return sourceFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFieldName(String newSourceFieldName) {
		String oldSourceFieldName = sourceFieldName;
		sourceFieldName = newSourceFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_GROUPS_TYPE__SOURCE_FIELD_NAME, oldSourceFieldName, sourceFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Object newStart) {
		Object oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_GROUPS_TYPE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(double newStep) {
		double oldStep = step;
		step = newStep;
		boolean oldStepESet = stepESet;
		stepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_GROUPS_TYPE__STEP, oldStep, step, !oldStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStep() {
		double oldStep = step;
		boolean oldStepESet = stepESet;
		step = STEP_EDEFAULT;
		stepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_GROUPS_TYPE__STEP, oldStep, STEP_EDEFAULT, oldStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStep() {
		return stepESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATA_PILOT_GROUP:
				return ((InternalEList<?>)getDataPilotGroup()).basicRemove(otherEnd, msgs);
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
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATA_PILOT_GROUP:
				return getDataPilotGroup();
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_END:
				return getDateEnd();
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_START:
				return getDateStart();
			case TablePackage.DATA_PILOT_GROUPS_TYPE__END:
				return getEnd();
			case TablePackage.DATA_PILOT_GROUPS_TYPE__GROUPED_BY:
				return getGroupedBy();
			case TablePackage.DATA_PILOT_GROUPS_TYPE__SOURCE_FIELD_NAME:
				return getSourceFieldName();
			case TablePackage.DATA_PILOT_GROUPS_TYPE__START:
				return getStart();
			case TablePackage.DATA_PILOT_GROUPS_TYPE__STEP:
				return new Double(getStep());
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
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATA_PILOT_GROUP:
				getDataPilotGroup().clear();
				getDataPilotGroup().addAll((Collection<? extends DataPilotGroupType>)newValue);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_END:
				setDateEnd(newValue);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_START:
				setDateStart(newValue);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__END:
				setEnd(newValue);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__GROUPED_BY:
				setGroupedBy((GroupedByType)newValue);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__SOURCE_FIELD_NAME:
				setSourceFieldName((String)newValue);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__START:
				setStart(newValue);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__STEP:
				setStep(((Double)newValue).doubleValue());
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
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATA_PILOT_GROUP:
				getDataPilotGroup().clear();
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_END:
				setDateEnd(DATE_END_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_START:
				setDateStart(DATE_START_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__GROUPED_BY:
				unsetGroupedBy();
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__SOURCE_FIELD_NAME:
				setSourceFieldName(SOURCE_FIELD_NAME_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__START:
				setStart(START_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_GROUPS_TYPE__STEP:
				unsetStep();
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
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATA_PILOT_GROUP:
				return dataPilotGroup != null && !dataPilotGroup.isEmpty();
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_END:
				return DATE_END_EDEFAULT == null ? dateEnd != null : !DATE_END_EDEFAULT.equals(dateEnd);
			case TablePackage.DATA_PILOT_GROUPS_TYPE__DATE_START:
				return DATE_START_EDEFAULT == null ? dateStart != null : !DATE_START_EDEFAULT.equals(dateStart);
			case TablePackage.DATA_PILOT_GROUPS_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case TablePackage.DATA_PILOT_GROUPS_TYPE__GROUPED_BY:
				return isSetGroupedBy();
			case TablePackage.DATA_PILOT_GROUPS_TYPE__SOURCE_FIELD_NAME:
				return SOURCE_FIELD_NAME_EDEFAULT == null ? sourceFieldName != null : !SOURCE_FIELD_NAME_EDEFAULT.equals(sourceFieldName);
			case TablePackage.DATA_PILOT_GROUPS_TYPE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case TablePackage.DATA_PILOT_GROUPS_TYPE__STEP:
				return isSetStep();
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
		result.append(" (dateEnd: ");
		result.append(dateEnd);
		result.append(", dateStart: ");
		result.append(dateStart);
		result.append(", end: ");
		result.append(end);
		result.append(", groupedBy: ");
		if (groupedByESet) result.append(groupedBy); else result.append("<unset>");
		result.append(", sourceFieldName: ");
		result.append(sourceFieldName);
		result.append(", start: ");
		result.append(start);
		result.append(", step: ");
		if (stepESet) result.append(step); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataPilotGroupsTypeImpl
