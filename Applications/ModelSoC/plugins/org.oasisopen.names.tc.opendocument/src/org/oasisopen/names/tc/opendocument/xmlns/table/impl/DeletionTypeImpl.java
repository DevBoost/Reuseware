/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType;
import org.oasisopen.names.tc.opendocument.xmlns.table.CutOffsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DeletionsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DependenciesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deletion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getChangeInfo <em>Change Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getDeletions <em>Deletions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getCutOffs <em>Cut Offs</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getAcceptanceState <em>Acceptance State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getMultiDeletionSpanned <em>Multi Deletion Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getRejectingChangeId <em>Rejecting Change Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DeletionTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeletionTypeImpl extends EObjectImpl implements DeletionType {
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
	 * The cached value of the '{@link #getCutOffs() <em>Cut Offs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOffs()
	 * @generated
	 * @ordered
	 */
	protected CutOffsType cutOffs;

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
	 * The default value of the '{@link #getMultiDeletionSpanned() <em>Multi Deletion Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiDeletionSpanned()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MULTI_DELETION_SPANNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiDeletionSpanned() <em>Multi Deletion Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiDeletionSpanned()
	 * @generated
	 * @ordered
	 */
	protected BigInteger multiDeletionSpanned = MULTI_DELETION_SPANNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger position = POSITION_EDEFAULT;

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
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected BigInteger table = TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.ROW;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

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
	protected DeletionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDeletionType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__CHANGE_INFO, oldChangeInfo, newChangeInfo);
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
				msgs = ((InternalEObject)changeInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DELETION_TYPE__CHANGE_INFO, null, msgs);
			if (newChangeInfo != null)
				msgs = ((InternalEObject)newChangeInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DELETION_TYPE__CHANGE_INFO, null, msgs);
			msgs = basicSetChangeInfo(newChangeInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__CHANGE_INFO, newChangeInfo, newChangeInfo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__DEPENDENCIES, oldDependencies, newDependencies);
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
				msgs = ((InternalEObject)dependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DELETION_TYPE__DEPENDENCIES, null, msgs);
			if (newDependencies != null)
				msgs = ((InternalEObject)newDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DELETION_TYPE__DEPENDENCIES, null, msgs);
			msgs = basicSetDependencies(newDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__DEPENDENCIES, newDependencies, newDependencies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__DELETIONS, oldDeletions, newDeletions);
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
				msgs = ((InternalEObject)deletions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DELETION_TYPE__DELETIONS, null, msgs);
			if (newDeletions != null)
				msgs = ((InternalEObject)newDeletions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DELETION_TYPE__DELETIONS, null, msgs);
			msgs = basicSetDeletions(newDeletions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__DELETIONS, newDeletions, newDeletions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CutOffsType getCutOffs() {
		return cutOffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutOffs(CutOffsType newCutOffs, NotificationChain msgs) {
		CutOffsType oldCutOffs = cutOffs;
		cutOffs = newCutOffs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__CUT_OFFS, oldCutOffs, newCutOffs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutOffs(CutOffsType newCutOffs) {
		if (newCutOffs != cutOffs) {
			NotificationChain msgs = null;
			if (cutOffs != null)
				msgs = ((InternalEObject)cutOffs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DELETION_TYPE__CUT_OFFS, null, msgs);
			if (newCutOffs != null)
				msgs = ((InternalEObject)newCutOffs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DELETION_TYPE__CUT_OFFS, null, msgs);
			msgs = basicSetCutOffs(newCutOffs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__CUT_OFFS, newCutOffs, newCutOffs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__ACCEPTANCE_STATE, oldAcceptanceState, acceptanceState, !oldAcceptanceStateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DELETION_TYPE__ACCEPTANCE_STATE, oldAcceptanceState, ACCEPTANCE_STATE_EDEFAULT, oldAcceptanceStateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMultiDeletionSpanned() {
		return multiDeletionSpanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiDeletionSpanned(BigInteger newMultiDeletionSpanned) {
		BigInteger oldMultiDeletionSpanned = multiDeletionSpanned;
		multiDeletionSpanned = newMultiDeletionSpanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__MULTI_DELETION_SPANNED, oldMultiDeletionSpanned, multiDeletionSpanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(BigInteger newPosition) {
		BigInteger oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__POSITION, oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__REJECTING_CHANGE_ID, oldRejectingChangeId, rejectingChangeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(BigInteger newTable) {
		BigInteger oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DELETION_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DELETION_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DELETION_TYPE__CHANGE_INFO:
				return basicSetChangeInfo(null, msgs);
			case TablePackage.DELETION_TYPE__DEPENDENCIES:
				return basicSetDependencies(null, msgs);
			case TablePackage.DELETION_TYPE__DELETIONS:
				return basicSetDeletions(null, msgs);
			case TablePackage.DELETION_TYPE__CUT_OFFS:
				return basicSetCutOffs(null, msgs);
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
			case TablePackage.DELETION_TYPE__CHANGE_INFO:
				return getChangeInfo();
			case TablePackage.DELETION_TYPE__DEPENDENCIES:
				return getDependencies();
			case TablePackage.DELETION_TYPE__DELETIONS:
				return getDeletions();
			case TablePackage.DELETION_TYPE__CUT_OFFS:
				return getCutOffs();
			case TablePackage.DELETION_TYPE__ACCEPTANCE_STATE:
				return getAcceptanceState();
			case TablePackage.DELETION_TYPE__ID:
				return getId();
			case TablePackage.DELETION_TYPE__MULTI_DELETION_SPANNED:
				return getMultiDeletionSpanned();
			case TablePackage.DELETION_TYPE__POSITION:
				return getPosition();
			case TablePackage.DELETION_TYPE__REJECTING_CHANGE_ID:
				return getRejectingChangeId();
			case TablePackage.DELETION_TYPE__TABLE:
				return getTable();
			case TablePackage.DELETION_TYPE__TYPE:
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
			case TablePackage.DELETION_TYPE__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)newValue);
				return;
			case TablePackage.DELETION_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)newValue);
				return;
			case TablePackage.DELETION_TYPE__DELETIONS:
				setDeletions((DeletionsType)newValue);
				return;
			case TablePackage.DELETION_TYPE__CUT_OFFS:
				setCutOffs((CutOffsType)newValue);
				return;
			case TablePackage.DELETION_TYPE__ACCEPTANCE_STATE:
				setAcceptanceState((AcceptanceStateType)newValue);
				return;
			case TablePackage.DELETION_TYPE__ID:
				setId((String)newValue);
				return;
			case TablePackage.DELETION_TYPE__MULTI_DELETION_SPANNED:
				setMultiDeletionSpanned((BigInteger)newValue);
				return;
			case TablePackage.DELETION_TYPE__POSITION:
				setPosition((BigInteger)newValue);
				return;
			case TablePackage.DELETION_TYPE__REJECTING_CHANGE_ID:
				setRejectingChangeId((String)newValue);
				return;
			case TablePackage.DELETION_TYPE__TABLE:
				setTable((BigInteger)newValue);
				return;
			case TablePackage.DELETION_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case TablePackage.DELETION_TYPE__CHANGE_INFO:
				setChangeInfo((ChangeInfoType)null);
				return;
			case TablePackage.DELETION_TYPE__DEPENDENCIES:
				setDependencies((DependenciesType)null);
				return;
			case TablePackage.DELETION_TYPE__DELETIONS:
				setDeletions((DeletionsType)null);
				return;
			case TablePackage.DELETION_TYPE__CUT_OFFS:
				setCutOffs((CutOffsType)null);
				return;
			case TablePackage.DELETION_TYPE__ACCEPTANCE_STATE:
				unsetAcceptanceState();
				return;
			case TablePackage.DELETION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case TablePackage.DELETION_TYPE__MULTI_DELETION_SPANNED:
				setMultiDeletionSpanned(MULTI_DELETION_SPANNED_EDEFAULT);
				return;
			case TablePackage.DELETION_TYPE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case TablePackage.DELETION_TYPE__REJECTING_CHANGE_ID:
				setRejectingChangeId(REJECTING_CHANGE_ID_EDEFAULT);
				return;
			case TablePackage.DELETION_TYPE__TABLE:
				setTable(TABLE_EDEFAULT);
				return;
			case TablePackage.DELETION_TYPE__TYPE:
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
			case TablePackage.DELETION_TYPE__CHANGE_INFO:
				return changeInfo != null;
			case TablePackage.DELETION_TYPE__DEPENDENCIES:
				return dependencies != null;
			case TablePackage.DELETION_TYPE__DELETIONS:
				return deletions != null;
			case TablePackage.DELETION_TYPE__CUT_OFFS:
				return cutOffs != null;
			case TablePackage.DELETION_TYPE__ACCEPTANCE_STATE:
				return isSetAcceptanceState();
			case TablePackage.DELETION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TablePackage.DELETION_TYPE__MULTI_DELETION_SPANNED:
				return MULTI_DELETION_SPANNED_EDEFAULT == null ? multiDeletionSpanned != null : !MULTI_DELETION_SPANNED_EDEFAULT.equals(multiDeletionSpanned);
			case TablePackage.DELETION_TYPE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case TablePackage.DELETION_TYPE__REJECTING_CHANGE_ID:
				return REJECTING_CHANGE_ID_EDEFAULT == null ? rejectingChangeId != null : !REJECTING_CHANGE_ID_EDEFAULT.equals(rejectingChangeId);
			case TablePackage.DELETION_TYPE__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
			case TablePackage.DELETION_TYPE__TYPE:
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
		result.append(" (acceptanceState: ");
		if (acceptanceStateESet) result.append(acceptanceState); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", multiDeletionSpanned: ");
		result.append(multiDeletionSpanned);
		result.append(", position: ");
		result.append(position);
		result.append(", rejectingChangeId: ");
		result.append(rejectingChangeId);
		result.append(", table: ");
		result.append(table);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeletionTypeImpl
