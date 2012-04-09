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
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.StylesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Styles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentStylesTypeImpl#getFontFaceDecls <em>Font Face Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentStylesTypeImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentStylesTypeImpl#getAutomaticStyles <em>Automatic Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentStylesTypeImpl#getMasterStyles <em>Master Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentStylesTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentStylesTypeImpl extends EObjectImpl implements DocumentStylesType {
	/**
	 * The cached value of the '{@link #getFontFaceDecls() <em>Font Face Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFaceDecls()
	 * @generated
	 * @ordered
	 */
	protected FontFaceDeclsType fontFaceDecls;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected StylesType styles;

	/**
	 * The cached value of the '{@link #getAutomaticStyles() <em>Automatic Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticStyles()
	 * @generated
	 * @ordered
	 */
	protected AutomaticStylesType automaticStyles;

	/**
	 * The cached value of the '{@link #getMasterStyles() <em>Master Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterStyles()
	 * @generated
	 * @ordered
	 */
	protected MasterStylesType masterStyles;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentStylesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.DOCUMENT_STYLES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceDeclsType getFontFaceDecls() {
		return fontFaceDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontFaceDecls(FontFaceDeclsType newFontFaceDecls, NotificationChain msgs) {
		FontFaceDeclsType oldFontFaceDecls = fontFaceDecls;
		fontFaceDecls = newFontFaceDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS, oldFontFaceDecls, newFontFaceDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFaceDecls(FontFaceDeclsType newFontFaceDecls) {
		if (newFontFaceDecls != fontFaceDecls) {
			NotificationChain msgs = null;
			if (fontFaceDecls != null)
				msgs = ((InternalEObject)fontFaceDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS, null, msgs);
			if (newFontFaceDecls != null)
				msgs = ((InternalEObject)newFontFaceDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS, null, msgs);
			msgs = basicSetFontFaceDecls(newFontFaceDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS, newFontFaceDecls, newFontFaceDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesType getStyles() {
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyles(StylesType newStyles, NotificationChain msgs) {
		StylesType oldStyles = styles;
		styles = newStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_STYLES_TYPE__STYLES, oldStyles, newStyles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyles(StylesType newStyles) {
		if (newStyles != styles) {
			NotificationChain msgs = null;
			if (styles != null)
				msgs = ((InternalEObject)styles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_STYLES_TYPE__STYLES, null, msgs);
			if (newStyles != null)
				msgs = ((InternalEObject)newStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_STYLES_TYPE__STYLES, null, msgs);
			msgs = basicSetStyles(newStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_STYLES_TYPE__STYLES, newStyles, newStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomaticStylesType getAutomaticStyles() {
		return automaticStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomaticStyles(AutomaticStylesType newAutomaticStyles, NotificationChain msgs) {
		AutomaticStylesType oldAutomaticStyles = automaticStyles;
		automaticStyles = newAutomaticStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES, oldAutomaticStyles, newAutomaticStyles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticStyles(AutomaticStylesType newAutomaticStyles) {
		if (newAutomaticStyles != automaticStyles) {
			NotificationChain msgs = null;
			if (automaticStyles != null)
				msgs = ((InternalEObject)automaticStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES, null, msgs);
			if (newAutomaticStyles != null)
				msgs = ((InternalEObject)newAutomaticStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES, null, msgs);
			msgs = basicSetAutomaticStyles(newAutomaticStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES, newAutomaticStyles, newAutomaticStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterStylesType getMasterStyles() {
		return masterStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterStyles(MasterStylesType newMasterStyles, NotificationChain msgs) {
		MasterStylesType oldMasterStyles = masterStyles;
		masterStyles = newMasterStyles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_STYLES_TYPE__MASTER_STYLES, oldMasterStyles, newMasterStyles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterStyles(MasterStylesType newMasterStyles) {
		if (newMasterStyles != masterStyles) {
			NotificationChain msgs = null;
			if (masterStyles != null)
				msgs = ((InternalEObject)masterStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_STYLES_TYPE__MASTER_STYLES, null, msgs);
			if (newMasterStyles != null)
				msgs = ((InternalEObject)newMasterStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_STYLES_TYPE__MASTER_STYLES, null, msgs);
			msgs = basicSetMasterStyles(newMasterStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_STYLES_TYPE__MASTER_STYLES, newMasterStyles, newMasterStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_STYLES_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS:
				return basicSetFontFaceDecls(null, msgs);
			case OfficePackage.DOCUMENT_STYLES_TYPE__STYLES:
				return basicSetStyles(null, msgs);
			case OfficePackage.DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES:
				return basicSetAutomaticStyles(null, msgs);
			case OfficePackage.DOCUMENT_STYLES_TYPE__MASTER_STYLES:
				return basicSetMasterStyles(null, msgs);
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
			case OfficePackage.DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS:
				return getFontFaceDecls();
			case OfficePackage.DOCUMENT_STYLES_TYPE__STYLES:
				return getStyles();
			case OfficePackage.DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES:
				return getAutomaticStyles();
			case OfficePackage.DOCUMENT_STYLES_TYPE__MASTER_STYLES:
				return getMasterStyles();
			case OfficePackage.DOCUMENT_STYLES_TYPE__VERSION:
				return getVersion();
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
			case OfficePackage.DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS:
				setFontFaceDecls((FontFaceDeclsType)newValue);
				return;
			case OfficePackage.DOCUMENT_STYLES_TYPE__STYLES:
				setStyles((StylesType)newValue);
				return;
			case OfficePackage.DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES:
				setAutomaticStyles((AutomaticStylesType)newValue);
				return;
			case OfficePackage.DOCUMENT_STYLES_TYPE__MASTER_STYLES:
				setMasterStyles((MasterStylesType)newValue);
				return;
			case OfficePackage.DOCUMENT_STYLES_TYPE__VERSION:
				setVersion((String)newValue);
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
			case OfficePackage.DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS:
				setFontFaceDecls((FontFaceDeclsType)null);
				return;
			case OfficePackage.DOCUMENT_STYLES_TYPE__STYLES:
				setStyles((StylesType)null);
				return;
			case OfficePackage.DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES:
				setAutomaticStyles((AutomaticStylesType)null);
				return;
			case OfficePackage.DOCUMENT_STYLES_TYPE__MASTER_STYLES:
				setMasterStyles((MasterStylesType)null);
				return;
			case OfficePackage.DOCUMENT_STYLES_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case OfficePackage.DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS:
				return fontFaceDecls != null;
			case OfficePackage.DOCUMENT_STYLES_TYPE__STYLES:
				return styles != null;
			case OfficePackage.DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES:
				return automaticStyles != null;
			case OfficePackage.DOCUMENT_STYLES_TYPE__MASTER_STYLES:
				return masterStyles != null;
			case OfficePackage.DOCUMENT_STYLES_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //DocumentStylesTypeImpl
