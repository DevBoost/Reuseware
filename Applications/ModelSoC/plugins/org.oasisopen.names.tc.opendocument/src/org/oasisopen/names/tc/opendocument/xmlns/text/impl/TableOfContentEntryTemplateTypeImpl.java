/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Of Content Entry Template Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentEntryTemplateTypeImpl#getTextTableOfContentChildrenGroup <em>Text Table Of Content Children Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentEntryTemplateTypeImpl#getTextTableOfContentChildren <em>Text Table Of Content Children</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentEntryTemplateTypeImpl#getOutlineLevel <em>Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentEntryTemplateTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableOfContentEntryTemplateTypeImpl extends EObjectImpl implements TableOfContentEntryTemplateType {
	/**
	 * The cached value of the '{@link #getTextTableOfContentChildrenGroup() <em>Text Table Of Content Children Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextTableOfContentChildrenGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap textTableOfContentChildrenGroup;

	/**
	 * The default value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OUTLINE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger outlineLevel = OUTLINE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableOfContentEntryTemplateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getTableOfContentEntryTemplateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTextTableOfContentChildrenGroup() {
		if (textTableOfContentChildrenGroup == null) {
			textTableOfContentChildrenGroup = new BasicFeatureMap(this, TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__TEXT_TABLE_OF_CONTENT_CHILDREN_GROUP);
		}
		return textTableOfContentChildrenGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTextTableOfContentChildren() {
		return getTextTableOfContentChildrenGroup().list(TextPackage.eINSTANCE.getTableOfContentEntryTemplateType_TextTableOfContentChildren());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOutlineLevel() {
		return outlineLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineLevel(BigInteger newOutlineLevel) {
		BigInteger oldOutlineLevel = outlineLevel;
		outlineLevel = newOutlineLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL, oldOutlineLevel, outlineLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__TEXT_TABLE_OF_CONTENT_CHILDREN_GROUP:
				return ((InternalEList<?>)getTextTableOfContentChildrenGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__TEXT_TABLE_OF_CONTENT_CHILDREN:
				return ((InternalEList<?>)getTextTableOfContentChildren()).basicRemove(otherEnd, msgs);
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
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__TEXT_TABLE_OF_CONTENT_CHILDREN_GROUP:
				if (coreType) return getTextTableOfContentChildrenGroup();
				return ((FeatureMap.Internal)getTextTableOfContentChildrenGroup()).getWrapper();
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__TEXT_TABLE_OF_CONTENT_CHILDREN:
				return getTextTableOfContentChildren();
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL:
				return getOutlineLevel();
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
				return getStyleName();
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
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__TEXT_TABLE_OF_CONTENT_CHILDREN_GROUP:
				((FeatureMap.Internal)getTextTableOfContentChildrenGroup()).set(newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL:
				setOutlineLevel((BigInteger)newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
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
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__TEXT_TABLE_OF_CONTENT_CHILDREN_GROUP:
				getTextTableOfContentChildrenGroup().clear();
				return;
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL:
				setOutlineLevel(OUTLINE_LEVEL_EDEFAULT);
				return;
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
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
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__TEXT_TABLE_OF_CONTENT_CHILDREN_GROUP:
				return textTableOfContentChildrenGroup != null && !textTableOfContentChildrenGroup.isEmpty();
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__TEXT_TABLE_OF_CONTENT_CHILDREN:
				return !getTextTableOfContentChildren().isEmpty();
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL:
				return OUTLINE_LEVEL_EDEFAULT == null ? outlineLevel != null : !OUTLINE_LEVEL_EDEFAULT.equals(outlineLevel);
			case TextPackage.TABLE_OF_CONTENT_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
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
		result.append(" (textTableOfContentChildrenGroup: ");
		result.append(textTableOfContentChildrenGroup);
		result.append(", outlineLevel: ");
		result.append(outlineLevel);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //TableOfContentEntryTemplateTypeImpl
