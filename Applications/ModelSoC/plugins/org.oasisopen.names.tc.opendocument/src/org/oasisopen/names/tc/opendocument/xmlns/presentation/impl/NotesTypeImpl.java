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
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.office.FormsType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getPageLayoutName <em>Page Layout Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getUseDateTimeName <em>Use Date Time Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getUseFooterName <em>Use Footer Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.NotesTypeImpl#getUseHeaderName <em>Use Header Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotesTypeImpl extends EObjectImpl implements NotesType {
	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected FormsType forms;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap shape;

	/**
	 * The default value of the '{@link #getPageLayoutName() <em>Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageLayoutName()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_LAYOUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageLayoutName() <em>Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageLayoutName()
	 * @generated
	 * @ordered
	 */
	protected String pageLayoutName = PAGE_LAYOUT_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getUseDateTimeName() <em>Use Date Time Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDateTimeName()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_DATE_TIME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseDateTimeName() <em>Use Date Time Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDateTimeName()
	 * @generated
	 * @ordered
	 */
	protected String useDateTimeName = USE_DATE_TIME_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseFooterName() <em>Use Footer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseFooterName()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_FOOTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseFooterName() <em>Use Footer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseFooterName()
	 * @generated
	 * @ordered
	 */
	protected String useFooterName = USE_FOOTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseHeaderName() <em>Use Header Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseHeaderName()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_HEADER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseHeaderName() <em>Use Header Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseHeaderName()
	 * @generated
	 * @ordered
	 */
	protected String useHeaderName = USE_HEADER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.NOTES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsType getForms() {
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForms(FormsType newForms, NotificationChain msgs) {
		FormsType oldForms = forms;
		forms = newForms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PresentationPackage.NOTES_TYPE__FORMS, oldForms, newForms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForms(FormsType newForms) {
		if (newForms != forms) {
			NotificationChain msgs = null;
			if (forms != null)
				msgs = ((InternalEObject)forms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.NOTES_TYPE__FORMS, null, msgs);
			if (newForms != null)
				msgs = ((InternalEObject)newForms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PresentationPackage.NOTES_TYPE__FORMS, null, msgs);
			msgs = basicSetForms(newForms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.NOTES_TYPE__FORMS, newForms, newForms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getShape() {
		if (shape == null) {
			shape = new BasicFeatureMap(this, PresentationPackage.NOTES_TYPE__SHAPE);
		}
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__RECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__LINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__POLYLINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__POLYGON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__REGULAR_POLYGON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__PATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__CIRCLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__ELLIPSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__G);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__PAGE_THUMBNAIL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__FRAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__MEASURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__CAPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__CONNECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__CONTROL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__SCENE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getShape().list(PresentationPackage.Literals.NOTES_TYPE__CUSTOM_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageLayoutName() {
		return pageLayoutName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageLayoutName(String newPageLayoutName) {
		String oldPageLayoutName = pageLayoutName;
		pageLayoutName = newPageLayoutName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.NOTES_TYPE__PAGE_LAYOUT_NAME, oldPageLayoutName, pageLayoutName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.NOTES_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseDateTimeName() {
		return useDateTimeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDateTimeName(String newUseDateTimeName) {
		String oldUseDateTimeName = useDateTimeName;
		useDateTimeName = newUseDateTimeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.NOTES_TYPE__USE_DATE_TIME_NAME, oldUseDateTimeName, useDateTimeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseFooterName() {
		return useFooterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFooterName(String newUseFooterName) {
		String oldUseFooterName = useFooterName;
		useFooterName = newUseFooterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.NOTES_TYPE__USE_FOOTER_NAME, oldUseFooterName, useFooterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseHeaderName() {
		return useHeaderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseHeaderName(String newUseHeaderName) {
		String oldUseHeaderName = useHeaderName;
		useHeaderName = newUseHeaderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.NOTES_TYPE__USE_HEADER_NAME, oldUseHeaderName, useHeaderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PresentationPackage.NOTES_TYPE__FORMS:
				return basicSetForms(null, msgs);
			case PresentationPackage.NOTES_TYPE__SHAPE:
				return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case PresentationPackage.NOTES_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
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
			case PresentationPackage.NOTES_TYPE__FORMS:
				return getForms();
			case PresentationPackage.NOTES_TYPE__SHAPE:
				if (coreType) return getShape();
				return ((FeatureMap.Internal)getShape()).getWrapper();
			case PresentationPackage.NOTES_TYPE__RECT:
				return getRect();
			case PresentationPackage.NOTES_TYPE__LINE:
				return getLine();
			case PresentationPackage.NOTES_TYPE__POLYLINE:
				return getPolyline();
			case PresentationPackage.NOTES_TYPE__POLYGON:
				return getPolygon();
			case PresentationPackage.NOTES_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case PresentationPackage.NOTES_TYPE__PATH:
				return getPath();
			case PresentationPackage.NOTES_TYPE__CIRCLE:
				return getCircle();
			case PresentationPackage.NOTES_TYPE__ELLIPSE:
				return getEllipse();
			case PresentationPackage.NOTES_TYPE__G:
				return getG();
			case PresentationPackage.NOTES_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case PresentationPackage.NOTES_TYPE__FRAME:
				return getFrame();
			case PresentationPackage.NOTES_TYPE__MEASURE:
				return getMeasure();
			case PresentationPackage.NOTES_TYPE__CAPTION:
				return getCaption();
			case PresentationPackage.NOTES_TYPE__CONNECTOR:
				return getConnector();
			case PresentationPackage.NOTES_TYPE__CONTROL:
				return getControl();
			case PresentationPackage.NOTES_TYPE__SCENE:
				return getScene();
			case PresentationPackage.NOTES_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case PresentationPackage.NOTES_TYPE__PAGE_LAYOUT_NAME:
				return getPageLayoutName();
			case PresentationPackage.NOTES_TYPE__STYLE_NAME:
				return getStyleName();
			case PresentationPackage.NOTES_TYPE__USE_DATE_TIME_NAME:
				return getUseDateTimeName();
			case PresentationPackage.NOTES_TYPE__USE_FOOTER_NAME:
				return getUseFooterName();
			case PresentationPackage.NOTES_TYPE__USE_HEADER_NAME:
				return getUseHeaderName();
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
			case PresentationPackage.NOTES_TYPE__FORMS:
				setForms((FormsType)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__SHAPE:
				((FeatureMap.Internal)getShape()).set(newValue);
				return;
			case PresentationPackage.NOTES_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__PAGE_LAYOUT_NAME:
				setPageLayoutName((String)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__USE_DATE_TIME_NAME:
				setUseDateTimeName((String)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__USE_FOOTER_NAME:
				setUseFooterName((String)newValue);
				return;
			case PresentationPackage.NOTES_TYPE__USE_HEADER_NAME:
				setUseHeaderName((String)newValue);
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
			case PresentationPackage.NOTES_TYPE__FORMS:
				setForms((FormsType)null);
				return;
			case PresentationPackage.NOTES_TYPE__SHAPE:
				getShape().clear();
				return;
			case PresentationPackage.NOTES_TYPE__RECT:
				getRect().clear();
				return;
			case PresentationPackage.NOTES_TYPE__LINE:
				getLine().clear();
				return;
			case PresentationPackage.NOTES_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case PresentationPackage.NOTES_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case PresentationPackage.NOTES_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case PresentationPackage.NOTES_TYPE__PATH:
				getPath().clear();
				return;
			case PresentationPackage.NOTES_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case PresentationPackage.NOTES_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case PresentationPackage.NOTES_TYPE__G:
				getG().clear();
				return;
			case PresentationPackage.NOTES_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case PresentationPackage.NOTES_TYPE__FRAME:
				getFrame().clear();
				return;
			case PresentationPackage.NOTES_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case PresentationPackage.NOTES_TYPE__CAPTION:
				getCaption().clear();
				return;
			case PresentationPackage.NOTES_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case PresentationPackage.NOTES_TYPE__CONTROL:
				getControl().clear();
				return;
			case PresentationPackage.NOTES_TYPE__SCENE:
				getScene().clear();
				return;
			case PresentationPackage.NOTES_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case PresentationPackage.NOTES_TYPE__PAGE_LAYOUT_NAME:
				setPageLayoutName(PAGE_LAYOUT_NAME_EDEFAULT);
				return;
			case PresentationPackage.NOTES_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case PresentationPackage.NOTES_TYPE__USE_DATE_TIME_NAME:
				setUseDateTimeName(USE_DATE_TIME_NAME_EDEFAULT);
				return;
			case PresentationPackage.NOTES_TYPE__USE_FOOTER_NAME:
				setUseFooterName(USE_FOOTER_NAME_EDEFAULT);
				return;
			case PresentationPackage.NOTES_TYPE__USE_HEADER_NAME:
				setUseHeaderName(USE_HEADER_NAME_EDEFAULT);
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
			case PresentationPackage.NOTES_TYPE__FORMS:
				return forms != null;
			case PresentationPackage.NOTES_TYPE__SHAPE:
				return shape != null && !shape.isEmpty();
			case PresentationPackage.NOTES_TYPE__RECT:
				return !getRect().isEmpty();
			case PresentationPackage.NOTES_TYPE__LINE:
				return !getLine().isEmpty();
			case PresentationPackage.NOTES_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case PresentationPackage.NOTES_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case PresentationPackage.NOTES_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case PresentationPackage.NOTES_TYPE__PATH:
				return !getPath().isEmpty();
			case PresentationPackage.NOTES_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case PresentationPackage.NOTES_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case PresentationPackage.NOTES_TYPE__G:
				return !getG().isEmpty();
			case PresentationPackage.NOTES_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case PresentationPackage.NOTES_TYPE__FRAME:
				return !getFrame().isEmpty();
			case PresentationPackage.NOTES_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case PresentationPackage.NOTES_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case PresentationPackage.NOTES_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case PresentationPackage.NOTES_TYPE__CONTROL:
				return !getControl().isEmpty();
			case PresentationPackage.NOTES_TYPE__SCENE:
				return !getScene().isEmpty();
			case PresentationPackage.NOTES_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case PresentationPackage.NOTES_TYPE__PAGE_LAYOUT_NAME:
				return PAGE_LAYOUT_NAME_EDEFAULT == null ? pageLayoutName != null : !PAGE_LAYOUT_NAME_EDEFAULT.equals(pageLayoutName);
			case PresentationPackage.NOTES_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case PresentationPackage.NOTES_TYPE__USE_DATE_TIME_NAME:
				return USE_DATE_TIME_NAME_EDEFAULT == null ? useDateTimeName != null : !USE_DATE_TIME_NAME_EDEFAULT.equals(useDateTimeName);
			case PresentationPackage.NOTES_TYPE__USE_FOOTER_NAME:
				return USE_FOOTER_NAME_EDEFAULT == null ? useFooterName != null : !USE_FOOTER_NAME_EDEFAULT.equals(useFooterName);
			case PresentationPackage.NOTES_TYPE__USE_HEADER_NAME:
				return USE_HEADER_NAME_EDEFAULT == null ? useHeaderName != null : !USE_HEADER_NAME_EDEFAULT.equals(useHeaderName);
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
		result.append(" (shape: ");
		result.append(shape);
		result.append(", pageLayoutName: ");
		result.append(pageLayoutName);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(", useDateTimeName: ");
		result.append(useDateTimeName);
		result.append(", useFooterName: ");
		result.append(useFooterName);
		result.append(", useHeaderName: ");
		result.append(useHeaderName);
		result.append(')');
		return result.toString();
	}

} //NotesTypeImpl
