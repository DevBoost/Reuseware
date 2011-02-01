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
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldReferenceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotFieldType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotGroupsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLevelType;
import org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pilot Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl#getDataPilotLevel <em>Data Pilot Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl#getDataPilotFieldReference <em>Data Pilot Field Reference</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl#getDataPilotGroups <em>Data Pilot Groups</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl#getIsDataLayoutField <em>Is Data Layout Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl#getSelectedPage <em>Selected Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl#getSourceFieldName <em>Source Field Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.DataPilotFieldTypeImpl#getUsedHierarchy <em>Used Hierarchy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPilotFieldTypeImpl extends EObjectImpl implements DataPilotFieldType {
	/**
	 * The cached value of the '{@link #getDataPilotLevel() <em>Data Pilot Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotLevel()
	 * @generated
	 * @ordered
	 */
	protected DataPilotLevelType dataPilotLevel;

	/**
	 * The cached value of the '{@link #getDataPilotFieldReference() <em>Data Pilot Field Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotFieldReference()
	 * @generated
	 * @ordered
	 */
	protected DataPilotFieldReferenceType dataPilotFieldReference;

	/**
	 * The cached value of the '{@link #getDataPilotGroups() <em>Data Pilot Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPilotGroups()
	 * @generated
	 * @ordered
	 */
	protected DataPilotGroupsType dataPilotGroups;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final Object FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Object function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDataLayoutField() <em>Is Data Layout Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataLayoutField()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_DATA_LAYOUT_FIELD_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getIsDataLayoutField() <em>Is Data Layout Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDataLayoutField()
	 * @generated
	 * @ordered
	 */
	protected String isDataLayoutField = IS_DATA_LAYOUT_FIELD_EDEFAULT;

	/**
	 * This is true if the Is Data Layout Field attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDataLayoutFieldESet;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationType ORIENTATION_EDEFAULT = OrientationType.ROW;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType orientation = ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orientationESet;

	/**
	 * The default value of the '{@link #getSelectedPage() <em>Selected Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedPage()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedPage() <em>Selected Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedPage()
	 * @generated
	 * @ordered
	 */
	protected String selectedPage = SELECTED_PAGE_EDEFAULT;

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
	 * The default value of the '{@link #getUsedHierarchy() <em>Used Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedHierarchy()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger USED_HIERARCHY_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getUsedHierarchy() <em>Used Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedHierarchy()
	 * @generated
	 * @ordered
	 */
	protected BigInteger usedHierarchy = USED_HIERARCHY_EDEFAULT;

	/**
	 * This is true if the Used Hierarchy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usedHierarchyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPilotFieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getDataPilotFieldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotLevelType getDataPilotLevel() {
		return dataPilotLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotLevel(DataPilotLevelType newDataPilotLevel, NotificationChain msgs) {
		DataPilotLevelType oldDataPilotLevel = dataPilotLevel;
		dataPilotLevel = newDataPilotLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL, oldDataPilotLevel, newDataPilotLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotLevel(DataPilotLevelType newDataPilotLevel) {
		if (newDataPilotLevel != dataPilotLevel) {
			NotificationChain msgs = null;
			if (dataPilotLevel != null)
				msgs = ((InternalEObject)dataPilotLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL, null, msgs);
			if (newDataPilotLevel != null)
				msgs = ((InternalEObject)newDataPilotLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL, null, msgs);
			msgs = basicSetDataPilotLevel(newDataPilotLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL, newDataPilotLevel, newDataPilotLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotFieldReferenceType getDataPilotFieldReference() {
		return dataPilotFieldReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotFieldReference(DataPilotFieldReferenceType newDataPilotFieldReference, NotificationChain msgs) {
		DataPilotFieldReferenceType oldDataPilotFieldReference = dataPilotFieldReference;
		dataPilotFieldReference = newDataPilotFieldReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE, oldDataPilotFieldReference, newDataPilotFieldReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotFieldReference(DataPilotFieldReferenceType newDataPilotFieldReference) {
		if (newDataPilotFieldReference != dataPilotFieldReference) {
			NotificationChain msgs = null;
			if (dataPilotFieldReference != null)
				msgs = ((InternalEObject)dataPilotFieldReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE, null, msgs);
			if (newDataPilotFieldReference != null)
				msgs = ((InternalEObject)newDataPilotFieldReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE, null, msgs);
			msgs = basicSetDataPilotFieldReference(newDataPilotFieldReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE, newDataPilotFieldReference, newDataPilotFieldReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPilotGroupsType getDataPilotGroups() {
		return dataPilotGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPilotGroups(DataPilotGroupsType newDataPilotGroups, NotificationChain msgs) {
		DataPilotGroupsType oldDataPilotGroups = dataPilotGroups;
		dataPilotGroups = newDataPilotGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS, oldDataPilotGroups, newDataPilotGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPilotGroups(DataPilotGroupsType newDataPilotGroups) {
		if (newDataPilotGroups != dataPilotGroups) {
			NotificationChain msgs = null;
			if (dataPilotGroups != null)
				msgs = ((InternalEObject)dataPilotGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS, null, msgs);
			if (newDataPilotGroups != null)
				msgs = ((InternalEObject)newDataPilotGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS, null, msgs);
			msgs = basicSetDataPilotGroups(newDataPilotGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS, newDataPilotGroups, newDataPilotGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Object newFunction) {
		Object oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsDataLayoutField() {
		return isDataLayoutField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDataLayoutField(String newIsDataLayoutField) {
		String oldIsDataLayoutField = isDataLayoutField;
		isDataLayoutField = newIsDataLayoutField;
		boolean oldIsDataLayoutFieldESet = isDataLayoutFieldESet;
		isDataLayoutFieldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__IS_DATA_LAYOUT_FIELD, oldIsDataLayoutField, isDataLayoutField, !oldIsDataLayoutFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDataLayoutField() {
		String oldIsDataLayoutField = isDataLayoutField;
		boolean oldIsDataLayoutFieldESet = isDataLayoutFieldESet;
		isDataLayoutField = IS_DATA_LAYOUT_FIELD_EDEFAULT;
		isDataLayoutFieldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_FIELD_TYPE__IS_DATA_LAYOUT_FIELD, oldIsDataLayoutField, IS_DATA_LAYOUT_FIELD_EDEFAULT, oldIsDataLayoutFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDataLayoutField() {
		return isDataLayoutFieldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationType newOrientation) {
		OrientationType oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		boolean oldOrientationESet = orientationESet;
		orientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__ORIENTATION, oldOrientation, orientation, !oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrientation() {
		OrientationType oldOrientation = orientation;
		boolean oldOrientationESet = orientationESet;
		orientation = ORIENTATION_EDEFAULT;
		orientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_FIELD_TYPE__ORIENTATION, oldOrientation, ORIENTATION_EDEFAULT, oldOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrientation() {
		return orientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectedPage() {
		return selectedPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedPage(String newSelectedPage) {
		String oldSelectedPage = selectedPage;
		selectedPage = newSelectedPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__SELECTED_PAGE, oldSelectedPage, selectedPage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__SOURCE_FIELD_NAME, oldSourceFieldName, sourceFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUsedHierarchy() {
		return usedHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedHierarchy(BigInteger newUsedHierarchy) {
		BigInteger oldUsedHierarchy = usedHierarchy;
		usedHierarchy = newUsedHierarchy;
		boolean oldUsedHierarchyESet = usedHierarchyESet;
		usedHierarchyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.DATA_PILOT_FIELD_TYPE__USED_HIERARCHY, oldUsedHierarchy, usedHierarchy, !oldUsedHierarchyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsedHierarchy() {
		BigInteger oldUsedHierarchy = usedHierarchy;
		boolean oldUsedHierarchyESet = usedHierarchyESet;
		usedHierarchy = USED_HIERARCHY_EDEFAULT;
		usedHierarchyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.DATA_PILOT_FIELD_TYPE__USED_HIERARCHY, oldUsedHierarchy, USED_HIERARCHY_EDEFAULT, oldUsedHierarchyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsedHierarchy() {
		return usedHierarchyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL:
				return basicSetDataPilotLevel(null, msgs);
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE:
				return basicSetDataPilotFieldReference(null, msgs);
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS:
				return basicSetDataPilotGroups(null, msgs);
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
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL:
				return getDataPilotLevel();
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE:
				return getDataPilotFieldReference();
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS:
				return getDataPilotGroups();
			case TablePackage.DATA_PILOT_FIELD_TYPE__FUNCTION:
				return getFunction();
			case TablePackage.DATA_PILOT_FIELD_TYPE__IS_DATA_LAYOUT_FIELD:
				return getIsDataLayoutField();
			case TablePackage.DATA_PILOT_FIELD_TYPE__ORIENTATION:
				return getOrientation();
			case TablePackage.DATA_PILOT_FIELD_TYPE__SELECTED_PAGE:
				return getSelectedPage();
			case TablePackage.DATA_PILOT_FIELD_TYPE__SOURCE_FIELD_NAME:
				return getSourceFieldName();
			case TablePackage.DATA_PILOT_FIELD_TYPE__USED_HIERARCHY:
				return getUsedHierarchy();
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
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL:
				setDataPilotLevel((DataPilotLevelType)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE:
				setDataPilotFieldReference((DataPilotFieldReferenceType)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS:
				setDataPilotGroups((DataPilotGroupsType)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__FUNCTION:
				setFunction(newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__IS_DATA_LAYOUT_FIELD:
				setIsDataLayoutField((String)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__ORIENTATION:
				setOrientation((OrientationType)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__SELECTED_PAGE:
				setSelectedPage((String)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__SOURCE_FIELD_NAME:
				setSourceFieldName((String)newValue);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__USED_HIERARCHY:
				setUsedHierarchy((BigInteger)newValue);
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
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL:
				setDataPilotLevel((DataPilotLevelType)null);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE:
				setDataPilotFieldReference((DataPilotFieldReferenceType)null);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS:
				setDataPilotGroups((DataPilotGroupsType)null);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__IS_DATA_LAYOUT_FIELD:
				unsetIsDataLayoutField();
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__ORIENTATION:
				unsetOrientation();
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__SELECTED_PAGE:
				setSelectedPage(SELECTED_PAGE_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__SOURCE_FIELD_NAME:
				setSourceFieldName(SOURCE_FIELD_NAME_EDEFAULT);
				return;
			case TablePackage.DATA_PILOT_FIELD_TYPE__USED_HIERARCHY:
				unsetUsedHierarchy();
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
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_LEVEL:
				return dataPilotLevel != null;
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_FIELD_REFERENCE:
				return dataPilotFieldReference != null;
			case TablePackage.DATA_PILOT_FIELD_TYPE__DATA_PILOT_GROUPS:
				return dataPilotGroups != null;
			case TablePackage.DATA_PILOT_FIELD_TYPE__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case TablePackage.DATA_PILOT_FIELD_TYPE__IS_DATA_LAYOUT_FIELD:
				return isSetIsDataLayoutField();
			case TablePackage.DATA_PILOT_FIELD_TYPE__ORIENTATION:
				return isSetOrientation();
			case TablePackage.DATA_PILOT_FIELD_TYPE__SELECTED_PAGE:
				return SELECTED_PAGE_EDEFAULT == null ? selectedPage != null : !SELECTED_PAGE_EDEFAULT.equals(selectedPage);
			case TablePackage.DATA_PILOT_FIELD_TYPE__SOURCE_FIELD_NAME:
				return SOURCE_FIELD_NAME_EDEFAULT == null ? sourceFieldName != null : !SOURCE_FIELD_NAME_EDEFAULT.equals(sourceFieldName);
			case TablePackage.DATA_PILOT_FIELD_TYPE__USED_HIERARCHY:
				return isSetUsedHierarchy();
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
		result.append(" (function: ");
		result.append(function);
		result.append(", isDataLayoutField: ");
		if (isDataLayoutFieldESet) result.append(isDataLayoutField); else result.append("<unset>");
		result.append(", orientation: ");
		if (orientationESet) result.append(orientation); else result.append("<unset>");
		result.append(", selectedPage: ");
		result.append(selectedPage);
		result.append(", sourceFieldName: ");
		result.append(sourceFieldName);
		result.append(", usedHierarchy: ");
		if (usedHierarchyESet) result.append(usedHierarchy); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataPilotFieldTypeImpl
