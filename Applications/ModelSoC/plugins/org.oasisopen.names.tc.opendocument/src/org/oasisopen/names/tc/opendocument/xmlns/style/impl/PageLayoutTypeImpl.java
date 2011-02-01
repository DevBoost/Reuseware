/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageUsageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.StylePageLayoutPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Layout Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.PageLayoutTypeImpl#getPageLayoutProperties <em>Page Layout Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.PageLayoutTypeImpl#getHeaderStyle <em>Header Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.PageLayoutTypeImpl#getFooterStyle <em>Footer Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.PageLayoutTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.PageLayoutTypeImpl#getPageUsage <em>Page Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageLayoutTypeImpl extends EObjectImpl implements PageLayoutType {
	/**
	 * The cached value of the '{@link #getPageLayoutProperties() <em>Page Layout Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageLayoutProperties()
	 * @generated
	 * @ordered
	 */
	protected StylePageLayoutPropertiesContent pageLayoutProperties;

	/**
	 * The cached value of the '{@link #getHeaderStyle() <em>Header Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderStyle()
	 * @generated
	 * @ordered
	 */
	protected HeaderStyleType headerStyle;

	/**
	 * The cached value of the '{@link #getFooterStyle() <em>Footer Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterStyle()
	 * @generated
	 * @ordered
	 */
	protected FooterStyleType footerStyle;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageUsage() <em>Page Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageUsage()
	 * @generated
	 * @ordered
	 */
	protected static final PageUsageType PAGE_USAGE_EDEFAULT = PageUsageType.ALL;

	/**
	 * The cached value of the '{@link #getPageUsage() <em>Page Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageUsage()
	 * @generated
	 * @ordered
	 */
	protected PageUsageType pageUsage = PAGE_USAGE_EDEFAULT;

	/**
	 * This is true if the Page Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pageUsageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageLayoutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getPageLayoutType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePageLayoutPropertiesContent getPageLayoutProperties() {
		return pageLayoutProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageLayoutProperties(StylePageLayoutPropertiesContent newPageLayoutProperties, NotificationChain msgs) {
		StylePageLayoutPropertiesContent oldPageLayoutProperties = pageLayoutProperties;
		pageLayoutProperties = newPageLayoutProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES, oldPageLayoutProperties, newPageLayoutProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageLayoutProperties(StylePageLayoutPropertiesContent newPageLayoutProperties) {
		if (newPageLayoutProperties != pageLayoutProperties) {
			NotificationChain msgs = null;
			if (pageLayoutProperties != null)
				msgs = ((InternalEObject)pageLayoutProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES, null, msgs);
			if (newPageLayoutProperties != null)
				msgs = ((InternalEObject)newPageLayoutProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES, null, msgs);
			msgs = basicSetPageLayoutProperties(newPageLayoutProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES, newPageLayoutProperties, newPageLayoutProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderStyleType getHeaderStyle() {
		return headerStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderStyle(HeaderStyleType newHeaderStyle, NotificationChain msgs) {
		HeaderStyleType oldHeaderStyle = headerStyle;
		headerStyle = newHeaderStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.PAGE_LAYOUT_TYPE__HEADER_STYLE, oldHeaderStyle, newHeaderStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderStyle(HeaderStyleType newHeaderStyle) {
		if (newHeaderStyle != headerStyle) {
			NotificationChain msgs = null;
			if (headerStyle != null)
				msgs = ((InternalEObject)headerStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.PAGE_LAYOUT_TYPE__HEADER_STYLE, null, msgs);
			if (newHeaderStyle != null)
				msgs = ((InternalEObject)newHeaderStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.PAGE_LAYOUT_TYPE__HEADER_STYLE, null, msgs);
			msgs = basicSetHeaderStyle(newHeaderStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.PAGE_LAYOUT_TYPE__HEADER_STYLE, newHeaderStyle, newHeaderStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterStyleType getFooterStyle() {
		return footerStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooterStyle(FooterStyleType newFooterStyle, NotificationChain msgs) {
		FooterStyleType oldFooterStyle = footerStyle;
		footerStyle = newFooterStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.PAGE_LAYOUT_TYPE__FOOTER_STYLE, oldFooterStyle, newFooterStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterStyle(FooterStyleType newFooterStyle) {
		if (newFooterStyle != footerStyle) {
			NotificationChain msgs = null;
			if (footerStyle != null)
				msgs = ((InternalEObject)footerStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.PAGE_LAYOUT_TYPE__FOOTER_STYLE, null, msgs);
			if (newFooterStyle != null)
				msgs = ((InternalEObject)newFooterStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.PAGE_LAYOUT_TYPE__FOOTER_STYLE, null, msgs);
			msgs = basicSetFooterStyle(newFooterStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.PAGE_LAYOUT_TYPE__FOOTER_STYLE, newFooterStyle, newFooterStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.PAGE_LAYOUT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageUsageType getPageUsage() {
		return pageUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageUsage(PageUsageType newPageUsage) {
		PageUsageType oldPageUsage = pageUsage;
		pageUsage = newPageUsage == null ? PAGE_USAGE_EDEFAULT : newPageUsage;
		boolean oldPageUsageESet = pageUsageESet;
		pageUsageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.PAGE_LAYOUT_TYPE__PAGE_USAGE, oldPageUsage, pageUsage, !oldPageUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPageUsage() {
		PageUsageType oldPageUsage = pageUsage;
		boolean oldPageUsageESet = pageUsageESet;
		pageUsage = PAGE_USAGE_EDEFAULT;
		pageUsageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.PAGE_LAYOUT_TYPE__PAGE_USAGE, oldPageUsage, PAGE_USAGE_EDEFAULT, oldPageUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPageUsage() {
		return pageUsageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylePackage.PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES:
				return basicSetPageLayoutProperties(null, msgs);
			case StylePackage.PAGE_LAYOUT_TYPE__HEADER_STYLE:
				return basicSetHeaderStyle(null, msgs);
			case StylePackage.PAGE_LAYOUT_TYPE__FOOTER_STYLE:
				return basicSetFooterStyle(null, msgs);
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
			case StylePackage.PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES:
				return getPageLayoutProperties();
			case StylePackage.PAGE_LAYOUT_TYPE__HEADER_STYLE:
				return getHeaderStyle();
			case StylePackage.PAGE_LAYOUT_TYPE__FOOTER_STYLE:
				return getFooterStyle();
			case StylePackage.PAGE_LAYOUT_TYPE__NAME:
				return getName();
			case StylePackage.PAGE_LAYOUT_TYPE__PAGE_USAGE:
				return getPageUsage();
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
			case StylePackage.PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES:
				setPageLayoutProperties((StylePageLayoutPropertiesContent)newValue);
				return;
			case StylePackage.PAGE_LAYOUT_TYPE__HEADER_STYLE:
				setHeaderStyle((HeaderStyleType)newValue);
				return;
			case StylePackage.PAGE_LAYOUT_TYPE__FOOTER_STYLE:
				setFooterStyle((FooterStyleType)newValue);
				return;
			case StylePackage.PAGE_LAYOUT_TYPE__NAME:
				setName((String)newValue);
				return;
			case StylePackage.PAGE_LAYOUT_TYPE__PAGE_USAGE:
				setPageUsage((PageUsageType)newValue);
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
			case StylePackage.PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES:
				setPageLayoutProperties((StylePageLayoutPropertiesContent)null);
				return;
			case StylePackage.PAGE_LAYOUT_TYPE__HEADER_STYLE:
				setHeaderStyle((HeaderStyleType)null);
				return;
			case StylePackage.PAGE_LAYOUT_TYPE__FOOTER_STYLE:
				setFooterStyle((FooterStyleType)null);
				return;
			case StylePackage.PAGE_LAYOUT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StylePackage.PAGE_LAYOUT_TYPE__PAGE_USAGE:
				unsetPageUsage();
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
			case StylePackage.PAGE_LAYOUT_TYPE__PAGE_LAYOUT_PROPERTIES:
				return pageLayoutProperties != null;
			case StylePackage.PAGE_LAYOUT_TYPE__HEADER_STYLE:
				return headerStyle != null;
			case StylePackage.PAGE_LAYOUT_TYPE__FOOTER_STYLE:
				return footerStyle != null;
			case StylePackage.PAGE_LAYOUT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StylePackage.PAGE_LAYOUT_TYPE__PAGE_USAGE:
				return isSetPageUsage();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", pageUsage: ");
		if (pageUsageESet) result.append(pageUsage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PageLayoutTypeImpl
