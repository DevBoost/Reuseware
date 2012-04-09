/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
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
import org.oasisopen.names.tc.opendocument.xmlns.table.ConsolidationType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.UseLabelsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consolidation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ConsolidationTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ConsolidationTypeImpl#getLinkToSourceData <em>Link To Source Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ConsolidationTypeImpl#getSourceCellRangeAddresses <em>Source Cell Range Addresses</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ConsolidationTypeImpl#getTargetCellAddress <em>Target Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ConsolidationTypeImpl#getUseLabels <em>Use Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsolidationTypeImpl extends EObjectImpl implements ConsolidationType {
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
	 * The default value of the '{@link #getLinkToSourceData() <em>Link To Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToSourceData()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean LINK_TO_SOURCE_DATA_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getLinkToSourceData() <em>Link To Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToSourceData()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean linkToSourceData = LINK_TO_SOURCE_DATA_EDEFAULT;

	/**
	 * This is true if the Link To Source Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linkToSourceDataESet;

	/**
	 * The default value of the '{@link #getSourceCellRangeAddresses() <em>Source Cell Range Addresses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCellRangeAddresses()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceCellRangeAddresses() <em>Source Cell Range Addresses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCellRangeAddresses()
	 * @generated
	 * @ordered
	 */
	protected String sourceCellRangeAddresses = SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCellAddress() <em>Target Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCellAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CELL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetCellAddress() <em>Target Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCellAddress()
	 * @generated
	 * @ordered
	 */
	protected String targetCellAddress = TARGET_CELL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseLabels() <em>Use Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLabels()
	 * @generated
	 * @ordered
	 */
	protected static final UseLabelsType USE_LABELS_EDEFAULT = UseLabelsType.NONE;

	/**
	 * The cached value of the '{@link #getUseLabels() <em>Use Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLabels()
	 * @generated
	 * @ordered
	 */
	protected UseLabelsType useLabels = USE_LABELS_EDEFAULT;

	/**
	 * This is true if the Use Labels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useLabelsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsolidationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getConsolidationType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONSOLIDATION_TYPE__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLinkToSourceData() {
		return linkToSourceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkToSourceData(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newLinkToSourceData) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLinkToSourceData = linkToSourceData;
		linkToSourceData = newLinkToSourceData == null ? LINK_TO_SOURCE_DATA_EDEFAULT : newLinkToSourceData;
		boolean oldLinkToSourceDataESet = linkToSourceDataESet;
		linkToSourceDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONSOLIDATION_TYPE__LINK_TO_SOURCE_DATA, oldLinkToSourceData, linkToSourceData, !oldLinkToSourceDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinkToSourceData() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldLinkToSourceData = linkToSourceData;
		boolean oldLinkToSourceDataESet = linkToSourceDataESet;
		linkToSourceData = LINK_TO_SOURCE_DATA_EDEFAULT;
		linkToSourceDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CONSOLIDATION_TYPE__LINK_TO_SOURCE_DATA, oldLinkToSourceData, LINK_TO_SOURCE_DATA_EDEFAULT, oldLinkToSourceDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinkToSourceData() {
		return linkToSourceDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceCellRangeAddresses() {
		return sourceCellRangeAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCellRangeAddresses(String newSourceCellRangeAddresses) {
		String oldSourceCellRangeAddresses = sourceCellRangeAddresses;
		sourceCellRangeAddresses = newSourceCellRangeAddresses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONSOLIDATION_TYPE__SOURCE_CELL_RANGE_ADDRESSES, oldSourceCellRangeAddresses, sourceCellRangeAddresses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetCellAddress() {
		return targetCellAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCellAddress(String newTargetCellAddress) {
		String oldTargetCellAddress = targetCellAddress;
		targetCellAddress = newTargetCellAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONSOLIDATION_TYPE__TARGET_CELL_ADDRESS, oldTargetCellAddress, targetCellAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseLabelsType getUseLabels() {
		return useLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseLabels(UseLabelsType newUseLabels) {
		UseLabelsType oldUseLabels = useLabels;
		useLabels = newUseLabels == null ? USE_LABELS_EDEFAULT : newUseLabels;
		boolean oldUseLabelsESet = useLabelsESet;
		useLabelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.CONSOLIDATION_TYPE__USE_LABELS, oldUseLabels, useLabels, !oldUseLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseLabels() {
		UseLabelsType oldUseLabels = useLabels;
		boolean oldUseLabelsESet = useLabelsESet;
		useLabels = USE_LABELS_EDEFAULT;
		useLabelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.CONSOLIDATION_TYPE__USE_LABELS, oldUseLabels, USE_LABELS_EDEFAULT, oldUseLabelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseLabels() {
		return useLabelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.CONSOLIDATION_TYPE__FUNCTION:
				return getFunction();
			case TablePackage.CONSOLIDATION_TYPE__LINK_TO_SOURCE_DATA:
				return getLinkToSourceData();
			case TablePackage.CONSOLIDATION_TYPE__SOURCE_CELL_RANGE_ADDRESSES:
				return getSourceCellRangeAddresses();
			case TablePackage.CONSOLIDATION_TYPE__TARGET_CELL_ADDRESS:
				return getTargetCellAddress();
			case TablePackage.CONSOLIDATION_TYPE__USE_LABELS:
				return getUseLabels();
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
			case TablePackage.CONSOLIDATION_TYPE__FUNCTION:
				setFunction(newValue);
				return;
			case TablePackage.CONSOLIDATION_TYPE__LINK_TO_SOURCE_DATA:
				setLinkToSourceData((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.CONSOLIDATION_TYPE__SOURCE_CELL_RANGE_ADDRESSES:
				setSourceCellRangeAddresses((String)newValue);
				return;
			case TablePackage.CONSOLIDATION_TYPE__TARGET_CELL_ADDRESS:
				setTargetCellAddress((String)newValue);
				return;
			case TablePackage.CONSOLIDATION_TYPE__USE_LABELS:
				setUseLabels((UseLabelsType)newValue);
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
			case TablePackage.CONSOLIDATION_TYPE__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case TablePackage.CONSOLIDATION_TYPE__LINK_TO_SOURCE_DATA:
				unsetLinkToSourceData();
				return;
			case TablePackage.CONSOLIDATION_TYPE__SOURCE_CELL_RANGE_ADDRESSES:
				setSourceCellRangeAddresses(SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT);
				return;
			case TablePackage.CONSOLIDATION_TYPE__TARGET_CELL_ADDRESS:
				setTargetCellAddress(TARGET_CELL_ADDRESS_EDEFAULT);
				return;
			case TablePackage.CONSOLIDATION_TYPE__USE_LABELS:
				unsetUseLabels();
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
			case TablePackage.CONSOLIDATION_TYPE__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case TablePackage.CONSOLIDATION_TYPE__LINK_TO_SOURCE_DATA:
				return isSetLinkToSourceData();
			case TablePackage.CONSOLIDATION_TYPE__SOURCE_CELL_RANGE_ADDRESSES:
				return SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT == null ? sourceCellRangeAddresses != null : !SOURCE_CELL_RANGE_ADDRESSES_EDEFAULT.equals(sourceCellRangeAddresses);
			case TablePackage.CONSOLIDATION_TYPE__TARGET_CELL_ADDRESS:
				return TARGET_CELL_ADDRESS_EDEFAULT == null ? targetCellAddress != null : !TARGET_CELL_ADDRESS_EDEFAULT.equals(targetCellAddress);
			case TablePackage.CONSOLIDATION_TYPE__USE_LABELS:
				return isSetUseLabels();
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
		result.append(", linkToSourceData: ");
		if (linkToSourceDataESet) result.append(linkToSourceData); else result.append("<unset>");
		result.append(", sourceCellRangeAddresses: ");
		result.append(sourceCellRangeAddresses);
		result.append(", targetCellAddress: ");
		result.append(targetCellAddress);
		result.append(", useLabels: ");
		if (useLabelsESet) result.append(useLabels); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConsolidationTypeImpl
