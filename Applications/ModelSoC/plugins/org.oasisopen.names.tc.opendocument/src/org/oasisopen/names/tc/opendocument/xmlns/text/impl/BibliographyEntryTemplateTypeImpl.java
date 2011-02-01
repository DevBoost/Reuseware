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
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyEntryTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryBibliographyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntrySpanType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexEntryTabStopType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextBibliographyTypes;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bibliography Entry Template Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyEntryTemplateTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyEntryTemplateTypeImpl#getIndexEntrySpan <em>Index Entry Span</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyEntryTemplateTypeImpl#getIndexEntryTabStop <em>Index Entry Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyEntryTemplateTypeImpl#getIndexEntryBibliography <em>Index Entry Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyEntryTemplateTypeImpl#getBibliographyType <em>Bibliography Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.BibliographyEntryTemplateTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibliographyEntryTemplateTypeImpl extends EObjectImpl implements BibliographyEntryTemplateType {
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
	 * The default value of the '{@link #getBibliographyType() <em>Bibliography Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographyType()
	 * @generated
	 * @ordered
	 */
	protected static final TextBibliographyTypes BIBLIOGRAPHY_TYPE_EDEFAULT = TextBibliographyTypes.ARTICLE;

	/**
	 * The cached value of the '{@link #getBibliographyType() <em>Bibliography Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBibliographyType()
	 * @generated
	 * @ordered
	 */
	protected TextBibliographyTypes bibliographyType = BIBLIOGRAPHY_TYPE_EDEFAULT;

	/**
	 * This is true if the Bibliography Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bibliographyTypeESet;

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
	protected BibliographyEntryTemplateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getBibliographyEntryTemplateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntrySpanType> getIndexEntrySpan() {
		return getGroup().list(TextPackage.eINSTANCE.getBibliographyEntryTemplateType_IndexEntrySpan());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntryTabStopType> getIndexEntryTabStop() {
		return getGroup().list(TextPackage.eINSTANCE.getBibliographyEntryTemplateType_IndexEntryTabStop());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexEntryBibliographyType> getIndexEntryBibliography() {
		return getGroup().list(TextPackage.eINSTANCE.getBibliographyEntryTemplateType_IndexEntryBibliography());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBibliographyTypes getBibliographyType() {
		return bibliographyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBibliographyType(TextBibliographyTypes newBibliographyType) {
		TextBibliographyTypes oldBibliographyType = bibliographyType;
		bibliographyType = newBibliographyType == null ? BIBLIOGRAPHY_TYPE_EDEFAULT : newBibliographyType;
		boolean oldBibliographyTypeESet = bibliographyTypeESet;
		bibliographyTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__BIBLIOGRAPHY_TYPE, oldBibliographyType, bibliographyType, !oldBibliographyTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBibliographyType() {
		TextBibliographyTypes oldBibliographyType = bibliographyType;
		boolean oldBibliographyTypeESet = bibliographyTypeESet;
		bibliographyType = BIBLIOGRAPHY_TYPE_EDEFAULT;
		bibliographyTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__BIBLIOGRAPHY_TYPE, oldBibliographyType, BIBLIOGRAPHY_TYPE_EDEFAULT, oldBibliographyTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBibliographyType() {
		return bibliographyTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				return ((InternalEList<?>)getIndexEntrySpan()).basicRemove(otherEnd, msgs);
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				return ((InternalEList<?>)getIndexEntryTabStop()).basicRemove(otherEnd, msgs);
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_BIBLIOGRAPHY:
				return ((InternalEList<?>)getIndexEntryBibliography()).basicRemove(otherEnd, msgs);
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
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				return getIndexEntrySpan();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				return getIndexEntryTabStop();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_BIBLIOGRAPHY:
				return getIndexEntryBibliography();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__BIBLIOGRAPHY_TYPE:
				return getBibliographyType();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
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
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				getIndexEntrySpan().clear();
				getIndexEntrySpan().addAll((Collection<? extends IndexEntrySpanType>)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				getIndexEntryTabStop().clear();
				getIndexEntryTabStop().addAll((Collection<? extends IndexEntryTabStopType>)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_BIBLIOGRAPHY:
				getIndexEntryBibliography().clear();
				getIndexEntryBibliography().addAll((Collection<? extends IndexEntryBibliographyType>)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__BIBLIOGRAPHY_TYPE:
				setBibliographyType((TextBibliographyTypes)newValue);
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
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
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__GROUP:
				getGroup().clear();
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				getIndexEntrySpan().clear();
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				getIndexEntryTabStop().clear();
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_BIBLIOGRAPHY:
				getIndexEntryBibliography().clear();
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__BIBLIOGRAPHY_TYPE:
				unsetBibliographyType();
				return;
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
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
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_SPAN:
				return !getIndexEntrySpan().isEmpty();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_TAB_STOP:
				return !getIndexEntryTabStop().isEmpty();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__INDEX_ENTRY_BIBLIOGRAPHY:
				return !getIndexEntryBibliography().isEmpty();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__BIBLIOGRAPHY_TYPE:
				return isSetBibliographyType();
			case TextPackage.BIBLIOGRAPHY_ENTRY_TEMPLATE_TYPE__STYLE_NAME:
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
		result.append(", bibliographyType: ");
		if (bibliographyTypeESet) result.append(bibliographyType); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //BibliographyEntryTemplateTypeImpl
