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
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType;
import org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeBodyContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentContentTypeImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentContentTypeImpl#getFontFaceDecls <em>Font Face Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentContentTypeImpl#getAutomaticStyles <em>Automatic Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentContentTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.DocumentContentTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentContentTypeImpl extends EObjectImpl implements DocumentContentType {
	/**
	 * The cached value of the '{@link #getScripts() <em>Scripts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScripts()
	 * @generated
	 * @ordered
	 */
	protected ScriptsType scripts;

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
	 * The cached value of the '{@link #getAutomaticStyles() <em>Automatic Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticStyles()
	 * @generated
	 * @ordered
	 */
	protected AutomaticStylesType automaticStyles;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected OfficeBodyContent body;

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
	protected DocumentContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.DOCUMENT_CONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptsType getScripts() {
		return scripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScripts(ScriptsType newScripts, NotificationChain msgs) {
		ScriptsType oldScripts = scripts;
		scripts = newScripts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_CONTENT_TYPE__SCRIPTS, oldScripts, newScripts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScripts(ScriptsType newScripts) {
		if (newScripts != scripts) {
			NotificationChain msgs = null;
			if (scripts != null)
				msgs = ((InternalEObject)scripts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_CONTENT_TYPE__SCRIPTS, null, msgs);
			if (newScripts != null)
				msgs = ((InternalEObject)newScripts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_CONTENT_TYPE__SCRIPTS, null, msgs);
			msgs = basicSetScripts(newScripts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_CONTENT_TYPE__SCRIPTS, newScripts, newScripts));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS, oldFontFaceDecls, newFontFaceDecls);
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
				msgs = ((InternalEObject)fontFaceDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS, null, msgs);
			if (newFontFaceDecls != null)
				msgs = ((InternalEObject)newFontFaceDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS, null, msgs);
			msgs = basicSetFontFaceDecls(newFontFaceDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS, newFontFaceDecls, newFontFaceDecls));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES, oldAutomaticStyles, newAutomaticStyles);
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
				msgs = ((InternalEObject)automaticStyles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES, null, msgs);
			if (newAutomaticStyles != null)
				msgs = ((InternalEObject)newAutomaticStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES, null, msgs);
			msgs = basicSetAutomaticStyles(newAutomaticStyles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES, newAutomaticStyles, newAutomaticStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeBodyContent getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(OfficeBodyContent newBody, NotificationChain msgs) {
		OfficeBodyContent oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_CONTENT_TYPE__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(OfficeBodyContent newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_CONTENT_TYPE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficePackage.DOCUMENT_CONTENT_TYPE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_CONTENT_TYPE__BODY, newBody, newBody));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OfficePackage.DOCUMENT_CONTENT_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.DOCUMENT_CONTENT_TYPE__SCRIPTS:
				return basicSetScripts(null, msgs);
			case OfficePackage.DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS:
				return basicSetFontFaceDecls(null, msgs);
			case OfficePackage.DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES:
				return basicSetAutomaticStyles(null, msgs);
			case OfficePackage.DOCUMENT_CONTENT_TYPE__BODY:
				return basicSetBody(null, msgs);
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
			case OfficePackage.DOCUMENT_CONTENT_TYPE__SCRIPTS:
				return getScripts();
			case OfficePackage.DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS:
				return getFontFaceDecls();
			case OfficePackage.DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES:
				return getAutomaticStyles();
			case OfficePackage.DOCUMENT_CONTENT_TYPE__BODY:
				return getBody();
			case OfficePackage.DOCUMENT_CONTENT_TYPE__VERSION:
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
			case OfficePackage.DOCUMENT_CONTENT_TYPE__SCRIPTS:
				setScripts((ScriptsType)newValue);
				return;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS:
				setFontFaceDecls((FontFaceDeclsType)newValue);
				return;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES:
				setAutomaticStyles((AutomaticStylesType)newValue);
				return;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__BODY:
				setBody((OfficeBodyContent)newValue);
				return;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__VERSION:
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
			case OfficePackage.DOCUMENT_CONTENT_TYPE__SCRIPTS:
				setScripts((ScriptsType)null);
				return;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS:
				setFontFaceDecls((FontFaceDeclsType)null);
				return;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES:
				setAutomaticStyles((AutomaticStylesType)null);
				return;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__BODY:
				setBody((OfficeBodyContent)null);
				return;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__VERSION:
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
			case OfficePackage.DOCUMENT_CONTENT_TYPE__SCRIPTS:
				return scripts != null;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS:
				return fontFaceDecls != null;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES:
				return automaticStyles != null;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__BODY:
				return body != null;
			case OfficePackage.DOCUMENT_CONTENT_TYPE__VERSION:
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

} //DocumentContentTypeImpl
