/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellAddressType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CellContentChangeType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DependenciesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Content Change Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl#getCellAddress <em>Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl#getChangeInfo <em>Change Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl#getDeletions <em>Deletions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl#getAcceptanceState <em>Acceptance State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.CellContentChangeTypeImpl#getRejectingChangeId <em>Rejecting Change Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellContentChangeTypeImpl extends EObjectImpl implements CellContentChangeType {
	/**
	 * The cached value of the '{@link #getCellAddress() <em>Cell Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellAddress()
	 * @generated
	 * @ordered
	 */
	protected CellAddressType cellAddress;

	/**
	 * The cached value of the '{@link #getChangeInfo() <em>Change Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeInfo()
	 * @generated
	 * @ordered
	 */
	protected ChangeInfoType changeInfo;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected DependenciesType dependencies;

	/**
	 * The cached value of the '{@link #getDeletions() <em>Deletions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletions()
	 * @generated
	 * @ordered
	 */
	protected DeletionsType deletions;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected PreviousType previous;

	/**
	 * The default value of the '{@link #getAcceptanceState() <em>Acceptance State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceState()
	 * @generated
	 * @ordered
	 */
	protected static final AcceptanceStateType ACCEPTANCE_STATE_EDEFAULT = AcceptanceStateType.PENDING;

	/**
	 * The cached value of the '{@link #getAcceptanceState() <em>Acceptance State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceState()
	 * @generated
	 * @ordered
	 */
	protected AcceptanceStateType acceptanceState = ACCEPTANCE_STATE_EDEFAULT;

	/**
	 * This is true if the Acceptance State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acceptanceStateESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRejectingChangeId() <em>Rejecting Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectingChangeId()
	 * @generated
	 * @ordered
	 */
	protected static final String REJECTING_CHANGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRejectingChangeId() <em>Rejecting Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectingChangeId()
	 * @generated
	 * @ordered
	 */
	protected String rejectingChangeId = REJECTING_CHANGE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellContentChangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getCellContentChangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellAddressType getCellAddress() {
		return cellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellAddress(CellAddressType newCellAddress, NotificationChain msgs) {
		CellAddressType oldCellAddress = cellAddress;
		cellAddress = newCellAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS, oldCellAddress, newCellAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellAddress(CellAddressType newCellAddress) {
		if (newCellAddress != cellAddress) {
			NotificationChain msgs = null;
			if (cellAddress != null)
				msgs = ((InternalEObject)cellAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS, null, msgs);
			if (newCellAddress != null)
				msgs = ((InternalEObject)newCellAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS, null, msgs);
			msgs = basicSetCellAddress(newCellAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS, newCellAddress, newCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInfoType getChangeInfo() {
		return changeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeInfo(ChangeInfoType newChangeInfo, NotificationChain msgs) {
		ChangeInfoType oldChangeInfo = changeInfo;
		changeInfo = newChangeInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO, oldChangeInfo, newChangeInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeInfo(ChangeInfoType newChangeInfo) {
		if (newChangeInfo != changeInfo) {
			NotificationChain msgs = null;
			if (changeInfo != null)
				msgs = ((InternalEObject)changeInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO, null, msgs);
			if (newChangeInfo != null)
				msgs = ((InternalEObject)newChangeInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO, null, msgs);
			msgs = basicSetChangeInfo(newChangeInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO, newChangeInfo, newChangeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenciesType getDependencies() {
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencies(DependenciesType newDependencies, NotificationChain msgs) {
		DependenciesType oldDependencies = dependencies;
		dependencies = newDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES, oldDependencies, newDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencies(DependenciesType newDependencies) {
		if (newDependencies != dependencies) {
			NotificationChain msgs = null;
			if (dependencies != null)
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES, newDependencies, newDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeletionsType getDeletions() {
		return deletions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeletions(DeletionsType newDeletions, NotificationChain msgs) {
		DeletionsType oldDeletions = deletions;
		deletions = newDeletions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__DELETIONS, oldDeletions, newDeletions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletions(DeletionsType newDeletions) {
		if (newDeletions != deletions) {
			NotificationChain msgs = null;
			if (deletions != null)
				msgs = ((InternalEObject)deletions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__DELETIONS, null, msgs);
			if (newDeletions != null)
				msgs = ((InternalEObject)newDeletions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__DELETIONS, null, msgs);
			msgs = basicSetDeletions(newDeletions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__DELETIONS, newDeletions, newDeletions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreviousType getPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(PreviousType newPrevious, NotificationChain msgs) {
		PreviousType oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(PreviousType newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__PREVIOUS, null, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.CELL_CONTENT_CHANGE_TYPE__PREVIOUS, null, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceStateType getAcceptanceState() {
		return acceptanceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceState(AcceptanceStateType newAcceptanceState) {
		AcceptanceStateType oldAcceptanceState = acceptanceState;
		acceptanceState = newAcceptanceState == null ? ACCEPTANCE_STATE_EDEFAULT : newAcceptanceState;
		boolean oldAcceptanceStateESet = acceptanceStateESet;
		acceptanceStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__ACCEPTANCE_STATE, oldAcceptanceState, acceptanceState, !oldAcceptanceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcceptanceState() {
		AcceptanceStateType oldAcceptanceState = acceptanceState;
		boolean oldAcceptanceStateESet = acceptanceStateESet;
		acceptanceState = ACCEPTANCE_STATE_EDEFAULT;
		acceptanceStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CELL_CONTENT_CHANGE_TYPE__ACCEPTANCE_STATE, oldAcceptanceState, ACCEPTANCE_STATE_EDEFAULT, oldAcceptanceStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcceptanceState() {
		return acceptanceStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRejectingChangeId() {
		return rejectingChangeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRejectingChangeId(String newRejectingChangeId) {
		String oldRejectingChangeId = rejectingChangeId;
		rejectingChangeId = newRejectingChangeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CELL_CONTENT_CHANGE_TYPE__REJECTING_CHANGE_ID, oldRejectingChangeId, rejectingChangeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS:
				return basicSetCellAddress(null, msgs);
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO:
				return basicSetChangeInfo(null, msgs);
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DELETIONS:
				return basicSetDeletions(null, msgs);
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__PREVIOUS:
				return basicSetPrevious(null, msgs);
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
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS:
				return getCellAddress();
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO:
				return getChangeInfo();
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES:
				return getDependencies();
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DELETIONS:
				return getDeletions();
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__PREVIOUS:
				return getPrevious();
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__ACCEPTANCE_STATE:
				return getAcceptanceState();
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__ID:
				return getId();
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__REJECTING_CHANGE_ID:
				return getRejectingChangeId();
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
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS:
				setCellAddress((CellAddressType)newValue);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)newValue);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DELETIONS:
				setDeletions((DeletionsType)newValue);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__PREVIOUS:
				setPrevious((PreviousType)newValue);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__ACCEPTANCE_STATE:
				setAcceptanceState((AcceptanceStateType)newValue);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__ID:
				setId((String)newValue);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__REJECTING_CHANGE_ID:
				setRejectingChangeId((String)newValue);
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
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS:
				setCellAddress((CellAddressType)null);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)null);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DELETIONS:
				setDeletions((DeletionsType)null);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__PREVIOUS:
				setPrevious((PreviousType)null);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__ACCEPTANCE_STATE:
				unsetAcceptanceState();
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__REJECTING_CHANGE_ID:
				setRejectingChangeId(REJECTING_CHANGE_ID_EDEFAULT);
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
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CELL_ADDRESS:
				return cellAddress != null;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__CHANGE_INFO:
				return changeInfo != null;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DEPENDENCIES:
				return dependencies != null;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__DELETIONS:
				return deletions != null;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__PREVIOUS:
				return previous != null;
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__ACCEPTANCE_STATE:
				return isSetAcceptanceState();
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TablePackage.CELL_CONTENT_CHANGE_TYPE__REJECTING_CHANGE_ID:
				return REJECTING_CHANGE_ID_EDEFAULT == null ? rejectingChangeId != null : !REJECTING_CHANGE_ID_EDEFAULT.equals(rejectingChangeId);
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
		result.append(" (acceptanceState: ");
		if (acceptanceStateESet) result.append(acceptanceState); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", rejectingChangeId: ");
		result.append(rejectingChangeId);
		result.append(')');
		return result.toString();
	}

} //CellContentChangeTypeImpl
