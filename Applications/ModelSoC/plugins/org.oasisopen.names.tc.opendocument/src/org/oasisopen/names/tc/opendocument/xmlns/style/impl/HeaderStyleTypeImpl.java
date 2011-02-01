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
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleHeaderFooterPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HeaderStyleTypeImpl#getHeaderFooterProperties <em>Header Footer Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderStyleTypeImpl extends EObjectImpl implements HeaderStyleType {
	/**
	 * The cached value of the '{@link #getHeaderFooterProperties() <em>Header Footer Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderFooterProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleHeaderFooterPropertiesContent headerFooterProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getHeaderStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleHeaderFooterPropertiesContent getHeaderFooterProperties() {
		return headerFooterProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderFooterProperties(StyleHeaderFooterPropertiesContent newHeaderFooterProperties, NotificationChain msgs) {
		StyleHeaderFooterPropertiesContent oldHeaderFooterProperties = headerFooterProperties;
		headerFooterProperties = newHeaderFooterProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES, oldHeaderFooterProperties, newHeaderFooterProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderFooterProperties(StyleHeaderFooterPropertiesContent newHeaderFooterProperties) {
		if (newHeaderFooterProperties != headerFooterProperties) {
			NotificationChain msgs = null;
			if (headerFooterProperties != null)
				msgs = ((InternalEObject)headerFooterProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES, null, msgs);
			if (newHeaderFooterProperties != null)
				msgs = ((InternalEObject)newHeaderFooterProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES, null, msgs);
			msgs = basicSetHeaderFooterProperties(newHeaderFooterProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES, newHeaderFooterProperties, newHeaderFooterProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylePackage.HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES:
				return basicSetHeaderFooterProperties(null, msgs);
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
			case StylePackage.HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES:
				return getHeaderFooterProperties();
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
			case StylePackage.HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES:
				setHeaderFooterProperties((StyleHeaderFooterPropertiesContent)newValue);
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
			case StylePackage.HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES:
				setHeaderFooterProperties((StyleHeaderFooterPropertiesContent)null);
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
			case StylePackage.HEADER_STYLE_TYPE__HEADER_FOOTER_PROPERTIES:
				return headerFooterProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //HeaderStyleTypeImpl
