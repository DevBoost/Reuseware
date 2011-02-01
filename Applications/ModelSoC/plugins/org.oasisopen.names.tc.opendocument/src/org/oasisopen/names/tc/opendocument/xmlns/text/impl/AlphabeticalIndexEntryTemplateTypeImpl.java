/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexEntryTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryChapterType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryPageNumberType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntrySpanType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTabStopType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTextType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OutlineLevelType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alphabetical Index Entry Template Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexEntryTemplateTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexEntryTemplateTypeImpl#getIndexEntryChapter <em>Index Entry Chapter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexEntryTemplateTypeImpl#getIndexEntryPageNumber <em>Index Entry Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexEntryTemplateTypeImpl#getIndexEntryText <em>Index Entry Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexEntryTemplateTypeImpl#getIndexEntrySpan <em>Index Entry Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexEntryTemplateTypeImpl#getIndexEntryTabStop <em>Index Entry Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexEntryTemplateTypeImpl#getOutlineLevel <em>Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.AlphabeticalIndexEntryTemplateTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlphabeticalIndexEntryTemplateTypeImpl extends EObjectImpl implements AlphabeticalIndexEntryTemplateType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected static final OutlineLevelType OUTLINE_LEVEL_EDEFAULT = OutlineLevelType._1;

	/**
	 * The cached value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected OutlineLevelType outlineLevel = OUTLINE_LEVEL_EDEFAULT;

	/**
	 * This is true if the Outline Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outlineLevelESet;

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
	protected AlphabeticalIndexEntryTemplateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getAlphabeticalIndexEntryTemplateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntryChapterType> getIndexEntryChapter() {
		return getGroup().list(TextPackage.eINSTANCE.getAlphabeticalIndexEntryTemplateType_IndexEntryChapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntryPageNumberType> getIndexEntryPageNumber() {
		return getGroup().list(TextPackage.eINSTANCE.getAlphabeticalIndexEntryTemplateType_IndexEntryPageNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntryTextType> getIndexEntryText() {
		return getGroup().list(TextPackage.eINSTANCE.getAlphabeticalIndexEntryTemplateType_IndexEntryText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntrySpanType> getIndexEntrySpan() {
		return getGroup().list(TextPackage.eINSTANCE.getAlphabeticalIndexEntryTemplateType_IndexEntrySpan());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntryTabStopType> getIndexEntryTabStop() {
		return getGroup().list(TextPackage.eINSTANCE.getAlphabeticalIndexEntryTemplateType_IndexEntryTabStop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlineLevelType getOutlineLevel() {
		return outlineLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineLevel(OutlineLevelType newOutlineLevel) {
		OutlineLevelType oldOutlineLevel = outlineLevel;
		outlineLevel = newOutlineLevel == null ? OUTLINE_LEVEL_EDEFAULT : newOutlineLevel;
		boolean oldOutlineLevelESet = outlineLevelESet;
		outlineLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL, oldOutlineLevel, outlineLevel, !oldOutlineLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOutlineLevel() {
		OutlineLevelType oldOutlineLevel = outlineLevel;
		boolean oldOutlineLevelESet = outlineLevelESet;
		outlineLevel = OUTLINE_LEVEL_EDEFAULT;
		outlineLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL, oldOutlineLevel, OUTLINE_LEVEL_EDEFAULT, oldOutlineLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutlineLevel() {
		return outlineLevelESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_CHAPTER:
				return ((InternalEList<?>)getIndexEntryChapter()).basicRemove(otherEnd, msgs);
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_PAGE_NUMBER:
				return ((InternalEList<?>)getIndexEntryPageNumber()).basicRemove(otherEnd, msgs);
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TEXT:
				return ((InternalEList<?>)getIndexEntryText()).basicRemove(otherEnd, msgs);
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				return ((InternalEList<?>)getIndexEntrySpan()).basicRemove(otherEnd, msgs);
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				return ((InternalEList<?>)getIndexEntryTabStop()).basicRemove(otherEnd, msgs);
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
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_CHAPTER:
				return getIndexEntryChapter();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_PAGE_NUMBER:
				return getIndexEntryPageNumber();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TEXT:
				return getIndexEntryText();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				return getIndexEntrySpan();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				return getIndexEntryTabStop();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL:
				return getOutlineLevel();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
				return getStyleName();
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
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_CHAPTER:
				getIndexEntryChapter().clear();
				getIndexEntryChapter().addAll((Collection<? extends IndexEntryChapterType>)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_PAGE_NUMBER:
				getIndexEntryPageNumber().clear();
				getIndexEntryPageNumber().addAll((Collection<? extends IndexEntryPageNumberType>)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TEXT:
				getIndexEntryText().clear();
				getIndexEntryText().addAll((Collection<? extends IndexEntryTextType>)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				getIndexEntrySpan().clear();
				getIndexEntrySpan().addAll((Collection<? extends IndexEntrySpanType>)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				getIndexEntryTabStop().clear();
				getIndexEntryTabStop().addAll((Collection<? extends IndexEntryTabStopType>)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL:
				setOutlineLevel((OutlineLevelType)newValue);
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
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
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__GROUP:
				getGroup().clear();
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_CHAPTER:
				getIndexEntryChapter().clear();
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_PAGE_NUMBER:
				getIndexEntryPageNumber().clear();
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TEXT:
				getIndexEntryText().clear();
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				getIndexEntrySpan().clear();
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				getIndexEntryTabStop().clear();
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL:
				unsetOutlineLevel();
				return;
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
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
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_CHAPTER:
				return !getIndexEntryChapter().isEmpty();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_PAGE_NUMBER:
				return !getIndexEntryPageNumber().isEmpty();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TEXT:
				return !getIndexEntryText().isEmpty();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				return !getIndexEntrySpan().isEmpty();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				return !getIndexEntryTabStop().isEmpty();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__OUTLINE_LEVEL:
				return isSetOutlineLevel();
			case TextPackage.ALPHABETICAL_INDEX_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", outlineLevel: ");
		if (outlineLevelESet) result.append(outlineLevel); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //AlphabeticalIndexEntryTemplateTypeImpl
