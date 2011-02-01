/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyDataFieldType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Entry Bibliography Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexEntryBibliographyTypeImpl#getBibliographyDataField <em>Bibliography Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IndexEntryBibliographyTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexEntryBibliographyTypeImpl extends EObjectImpl implements IndexEntryBibliographyType {
	/**
	 * The default value of the '{@link #getBibliographyDataField() <em>Bibliography Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographyDataField()
	 * @generated
	 * @ordered
	 */
	protected static final BibliographyDataFieldType BIBLIOGRAPHY_DATA_FIELD_EDEFAULT = BibliographyDataFieldType.ADDRESS;

	/**
	 * The cached value of the '{@link #getBibliographyDataField() <em>Bibliography Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographyDataField()
	 * @generated
	 * @ordered
	 */
	protected BibliographyDataFieldType bibliographyDataField = BIBLIOGRAPHY_DATA_FIELD_EDEFAULT;

	/**
	 * This is true if the Bibliography Data Field attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bibliographyDataFieldESet;

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
	protected IndexEntryBibliographyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getIndexEntryBibliographyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyDataFieldType getBibliographyDataField() {
		return bibliographyDataField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliographyDataField(BibliographyDataFieldType newBibliographyDataField) {
		BibliographyDataFieldType oldBibliographyDataField = bibliographyDataField;
		bibliographyDataField = newBibliographyDataField == null ? BIBLIOGRAPHY_DATA_FIELD_EDEFAULT : newBibliographyDataField;
		boolean oldBibliographyDataFieldESet = bibliographyDataFieldESet;
		bibliographyDataFieldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__BIBLIOGRAPHY_DATA_FIELD, oldBibliographyDataField, bibliographyDataField, !oldBibliographyDataFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBibliographyDataField() {
		BibliographyDataFieldType oldBibliographyDataField = bibliographyDataField;
		boolean oldBibliographyDataFieldESet = bibliographyDataFieldESet;
		bibliographyDataField = BIBLIOGRAPHY_DATA_FIELD_EDEFAULT;
		bibliographyDataFieldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__BIBLIOGRAPHY_DATA_FIELD, oldBibliographyDataField, BIBLIOGRAPHY_DATA_FIELD_EDEFAULT, oldBibliographyDataFieldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBibliographyDataField() {
		return bibliographyDataFieldESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__BIBLIOGRAPHY_DATA_FIELD:
				return getBibliographyDataField();
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__STYLE_NAME:
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
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__BIBLIOGRAPHY_DATA_FIELD:
				setBibliographyDataField((BibliographyDataFieldType)newValue);
				return;
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__STYLE_NAME:
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
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__BIBLIOGRAPHY_DATA_FIELD:
				unsetBibliographyDataField();
				return;
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__STYLE_NAME:
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
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__BIBLIOGRAPHY_DATA_FIELD:
				return isSetBibliographyDataField();
			case TextPackage.INDEX_ENTRY_BIBLIOGRAPHY_TYPE__STYLE_NAME:
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
		result.append(" (bibliographyDataField: ");
		if (bibliographyDataFieldESet) result.append(bibliographyDataField); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //IndexEntryBibliographyTypeImpl
