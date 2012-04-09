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
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

import java.util.Collection;
import java.util.List;

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
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CaptionType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CircleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ConnectorType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ControlType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.CustomShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.EllipseType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.LineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MeasureType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageThumbnailType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PageType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PathType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.PolylineType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RectType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.RegularPolygonType;
import org.oasisopen.names.tc.opendocument.xmlns.office.FormsType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getAnimations <em>Animations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getAnimationElementGroup <em>Animation Element Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getAnimationElement <em>Animation Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getMasterPageName <em>Master Page Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getNavOrder <em>Nav Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getPresentationPageLayoutName <em>Presentation Page Layout Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getUseDateTimeName <em>Use Date Time Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getUseFooterName <em>Use Footer Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.PageTypeImpl#getUseHeaderName <em>Use Header Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageTypeImpl extends EObjectImpl implements PageType {
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
	 * The cached value of the '{@link #getAnimations() <em>Animations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimations()
	 * @generated
	 * @ordered
	 */
	protected AnimationsType1 animations;

	/**
	 * The cached value of the '{@link #getAnimationElementGroup() <em>Animation Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap animationElementGroup;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected NotesType notes;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_PAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected String masterPageName = MASTER_PAGE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getNavOrder() <em>Nav Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavOrder()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> NAV_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavOrder() <em>Nav Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavOrder()
	 * @generated
	 * @ordered
	 */
	protected List<String> navOrder = NAV_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentationPageLayoutName() <em>Presentation Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationPageLayoutName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentationPageLayoutName() <em>Presentation Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationPageLayoutName()
	 * @generated
	 * @ordered
	 */
	protected String presentationPageLayoutName = PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT;

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
	protected PageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getPageType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__FORMS, oldForms, newForms);
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
				msgs = ((InternalEObject)forms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.PAGE_TYPE__FORMS, null, msgs);
			if (newForms != null)
				msgs = ((InternalEObject)newForms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.PAGE_TYPE__FORMS, null, msgs);
			msgs = basicSetForms(newForms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__FORMS, newForms, newForms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getShape() {
		if (shape == null) {
			shape = new BasicFeatureMap(this, DrawingPackage.PAGE_TYPE__SHAPE);
		}
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getShape().list(DrawingPackage.eINSTANCE.getPageType_CustomShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationsType1 getAnimations() {
		return animations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimations(AnimationsType1 newAnimations, NotificationChain msgs) {
		AnimationsType1 oldAnimations = animations;
		animations = newAnimations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__ANIMATIONS, oldAnimations, newAnimations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimations(AnimationsType1 newAnimations) {
		if (newAnimations != animations) {
			NotificationChain msgs = null;
			if (animations != null)
				msgs = ((InternalEObject)animations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.PAGE_TYPE__ANIMATIONS, null, msgs);
			if (newAnimations != null)
				msgs = ((InternalEObject)newAnimations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.PAGE_TYPE__ANIMATIONS, null, msgs);
			msgs = basicSetAnimations(newAnimations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__ANIMATIONS, newAnimations, newAnimations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnimationElementGroup() {
		if (animationElementGroup == null) {
			animationElementGroup = new BasicFeatureMap(this, DrawingPackage.PAGE_TYPE__ANIMATION_ELEMENT_GROUP);
		}
		return animationElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAnimationElement() {
		return (EObject)getAnimationElementGroup().get(DrawingPackage.eINSTANCE.getPageType_AnimationElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimationElement(EObject newAnimationElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAnimationElementGroup()).basicAdd(DrawingPackage.eINSTANCE.getPageType_AnimationElement(), newAnimationElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotesType getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(NotesType newNotes, NotificationChain msgs) {
		NotesType oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__NOTES, oldNotes, newNotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(NotesType newNotes) {
		if (newNotes != notes) {
			NotificationChain msgs = null;
			if (notes != null)
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.PAGE_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.PAGE_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterPageName() {
		return masterPageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterPageName(String newMasterPageName) {
		String oldMasterPageName = masterPageName;
		masterPageName = newMasterPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__MASTER_PAGE_NAME, oldMasterPageName, masterPageName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getNavOrder() {
		return navOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavOrder(List<String> newNavOrder) {
		List<String> oldNavOrder = navOrder;
		navOrder = newNavOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__NAV_ORDER, oldNavOrder, navOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentationPageLayoutName() {
		return presentationPageLayoutName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationPageLayoutName(String newPresentationPageLayoutName) {
		String oldPresentationPageLayoutName = presentationPageLayoutName;
		presentationPageLayoutName = newPresentationPageLayoutName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__PRESENTATION_PAGE_LAYOUT_NAME, oldPresentationPageLayoutName, presentationPageLayoutName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__STYLE_NAME, oldStyleName, styleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__USE_DATE_TIME_NAME, oldUseDateTimeName, useDateTimeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__USE_FOOTER_NAME, oldUseFooterName, useFooterName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.PAGE_TYPE__USE_HEADER_NAME, oldUseHeaderName, useHeaderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawingPackage.PAGE_TYPE__FORMS:
				return basicSetForms(null, msgs);
			case DrawingPackage.PAGE_TYPE__SHAPE:
				return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__ANIMATIONS:
				return basicSetAnimations(null, msgs);
			case DrawingPackage.PAGE_TYPE__ANIMATION_ELEMENT_GROUP:
				return ((InternalEList<?>)getAnimationElementGroup()).basicRemove(otherEnd, msgs);
			case DrawingPackage.PAGE_TYPE__ANIMATION_ELEMENT:
				return basicSetAnimationElement(null, msgs);
			case DrawingPackage.PAGE_TYPE__NOTES:
				return basicSetNotes(null, msgs);
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
			case DrawingPackage.PAGE_TYPE__FORMS:
				return getForms();
			case DrawingPackage.PAGE_TYPE__SHAPE:
				if (coreType) return getShape();
				return ((FeatureMap.Internal)getShape()).getWrapper();
			case DrawingPackage.PAGE_TYPE__RECT:
				return getRect();
			case DrawingPackage.PAGE_TYPE__LINE:
				return getLine();
			case DrawingPackage.PAGE_TYPE__POLYLINE:
				return getPolyline();
			case DrawingPackage.PAGE_TYPE__POLYGON:
				return getPolygon();
			case DrawingPackage.PAGE_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case DrawingPackage.PAGE_TYPE__PATH:
				return getPath();
			case DrawingPackage.PAGE_TYPE__CIRCLE:
				return getCircle();
			case DrawingPackage.PAGE_TYPE__ELLIPSE:
				return getEllipse();
			case DrawingPackage.PAGE_TYPE__G:
				return getG();
			case DrawingPackage.PAGE_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case DrawingPackage.PAGE_TYPE__FRAME:
				return getFrame();
			case DrawingPackage.PAGE_TYPE__MEASURE:
				return getMeasure();
			case DrawingPackage.PAGE_TYPE__CAPTION:
				return getCaption();
			case DrawingPackage.PAGE_TYPE__CONNECTOR:
				return getConnector();
			case DrawingPackage.PAGE_TYPE__CONTROL:
				return getControl();
			case DrawingPackage.PAGE_TYPE__SCENE:
				return getScene();
			case DrawingPackage.PAGE_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case DrawingPackage.PAGE_TYPE__ANIMATIONS:
				return getAnimations();
			case DrawingPackage.PAGE_TYPE__ANIMATION_ELEMENT_GROUP:
				if (coreType) return getAnimationElementGroup();
				return ((FeatureMap.Internal)getAnimationElementGroup()).getWrapper();
			case DrawingPackage.PAGE_TYPE__ANIMATION_ELEMENT:
				return getAnimationElement();
			case DrawingPackage.PAGE_TYPE__NOTES:
				return getNotes();
			case DrawingPackage.PAGE_TYPE__ID:
				return getId();
			case DrawingPackage.PAGE_TYPE__MASTER_PAGE_NAME:
				return getMasterPageName();
			case DrawingPackage.PAGE_TYPE__NAME:
				return getName();
			case DrawingPackage.PAGE_TYPE__NAV_ORDER:
				return getNavOrder();
			case DrawingPackage.PAGE_TYPE__PRESENTATION_PAGE_LAYOUT_NAME:
				return getPresentationPageLayoutName();
			case DrawingPackage.PAGE_TYPE__STYLE_NAME:
				return getStyleName();
			case DrawingPackage.PAGE_TYPE__USE_DATE_TIME_NAME:
				return getUseDateTimeName();
			case DrawingPackage.PAGE_TYPE__USE_FOOTER_NAME:
				return getUseFooterName();
			case DrawingPackage.PAGE_TYPE__USE_HEADER_NAME:
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
			case DrawingPackage.PAGE_TYPE__FORMS:
				setForms((FormsType)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__SHAPE:
				((FeatureMap.Internal)getShape()).set(newValue);
				return;
			case DrawingPackage.PAGE_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__ANIMATIONS:
				setAnimations((AnimationsType1)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__ANIMATION_ELEMENT_GROUP:
				((FeatureMap.Internal)getAnimationElementGroup()).set(newValue);
				return;
			case DrawingPackage.PAGE_TYPE__NOTES:
				setNotes((NotesType)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__ID:
				setId((String)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__MASTER_PAGE_NAME:
				setMasterPageName((String)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__NAV_ORDER:
				setNavOrder((List<String>)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__PRESENTATION_PAGE_LAYOUT_NAME:
				setPresentationPageLayoutName((String)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__USE_DATE_TIME_NAME:
				setUseDateTimeName((String)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__USE_FOOTER_NAME:
				setUseFooterName((String)newValue);
				return;
			case DrawingPackage.PAGE_TYPE__USE_HEADER_NAME:
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
			case DrawingPackage.PAGE_TYPE__FORMS:
				setForms((FormsType)null);
				return;
			case DrawingPackage.PAGE_TYPE__SHAPE:
				getShape().clear();
				return;
			case DrawingPackage.PAGE_TYPE__RECT:
				getRect().clear();
				return;
			case DrawingPackage.PAGE_TYPE__LINE:
				getLine().clear();
				return;
			case DrawingPackage.PAGE_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case DrawingPackage.PAGE_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case DrawingPackage.PAGE_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case DrawingPackage.PAGE_TYPE__PATH:
				getPath().clear();
				return;
			case DrawingPackage.PAGE_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case DrawingPackage.PAGE_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case DrawingPackage.PAGE_TYPE__G:
				getG().clear();
				return;
			case DrawingPackage.PAGE_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case DrawingPackage.PAGE_TYPE__FRAME:
				getFrame().clear();
				return;
			case DrawingPackage.PAGE_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case DrawingPackage.PAGE_TYPE__CAPTION:
				getCaption().clear();
				return;
			case DrawingPackage.PAGE_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case DrawingPackage.PAGE_TYPE__CONTROL:
				getControl().clear();
				return;
			case DrawingPackage.PAGE_TYPE__SCENE:
				getScene().clear();
				return;
			case DrawingPackage.PAGE_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case DrawingPackage.PAGE_TYPE__ANIMATIONS:
				setAnimations((AnimationsType1)null);
				return;
			case DrawingPackage.PAGE_TYPE__ANIMATION_ELEMENT_GROUP:
				getAnimationElementGroup().clear();
				return;
			case DrawingPackage.PAGE_TYPE__NOTES:
				setNotes((NotesType)null);
				return;
			case DrawingPackage.PAGE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DrawingPackage.PAGE_TYPE__MASTER_PAGE_NAME:
				setMasterPageName(MASTER_PAGE_NAME_EDEFAULT);
				return;
			case DrawingPackage.PAGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DrawingPackage.PAGE_TYPE__NAV_ORDER:
				setNavOrder(NAV_ORDER_EDEFAULT);
				return;
			case DrawingPackage.PAGE_TYPE__PRESENTATION_PAGE_LAYOUT_NAME:
				setPresentationPageLayoutName(PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT);
				return;
			case DrawingPackage.PAGE_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case DrawingPackage.PAGE_TYPE__USE_DATE_TIME_NAME:
				setUseDateTimeName(USE_DATE_TIME_NAME_EDEFAULT);
				return;
			case DrawingPackage.PAGE_TYPE__USE_FOOTER_NAME:
				setUseFooterName(USE_FOOTER_NAME_EDEFAULT);
				return;
			case DrawingPackage.PAGE_TYPE__USE_HEADER_NAME:
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
			case DrawingPackage.PAGE_TYPE__FORMS:
				return forms != null;
			case DrawingPackage.PAGE_TYPE__SHAPE:
				return shape != null && !shape.isEmpty();
			case DrawingPackage.PAGE_TYPE__RECT:
				return !getRect().isEmpty();
			case DrawingPackage.PAGE_TYPE__LINE:
				return !getLine().isEmpty();
			case DrawingPackage.PAGE_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case DrawingPackage.PAGE_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case DrawingPackage.PAGE_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case DrawingPackage.PAGE_TYPE__PATH:
				return !getPath().isEmpty();
			case DrawingPackage.PAGE_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case DrawingPackage.PAGE_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case DrawingPackage.PAGE_TYPE__G:
				return !getG().isEmpty();
			case DrawingPackage.PAGE_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case DrawingPackage.PAGE_TYPE__FRAME:
				return !getFrame().isEmpty();
			case DrawingPackage.PAGE_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case DrawingPackage.PAGE_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case DrawingPackage.PAGE_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case DrawingPackage.PAGE_TYPE__CONTROL:
				return !getControl().isEmpty();
			case DrawingPackage.PAGE_TYPE__SCENE:
				return !getScene().isEmpty();
			case DrawingPackage.PAGE_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case DrawingPackage.PAGE_TYPE__ANIMATIONS:
				return animations != null;
			case DrawingPackage.PAGE_TYPE__ANIMATION_ELEMENT_GROUP:
				return animationElementGroup != null && !animationElementGroup.isEmpty();
			case DrawingPackage.PAGE_TYPE__ANIMATION_ELEMENT:
				return getAnimationElement() != null;
			case DrawingPackage.PAGE_TYPE__NOTES:
				return notes != null;
			case DrawingPackage.PAGE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DrawingPackage.PAGE_TYPE__MASTER_PAGE_NAME:
				return MASTER_PAGE_NAME_EDEFAULT == null ? masterPageName != null : !MASTER_PAGE_NAME_EDEFAULT.equals(masterPageName);
			case DrawingPackage.PAGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DrawingPackage.PAGE_TYPE__NAV_ORDER:
				return NAV_ORDER_EDEFAULT == null ? navOrder != null : !NAV_ORDER_EDEFAULT.equals(navOrder);
			case DrawingPackage.PAGE_TYPE__PRESENTATION_PAGE_LAYOUT_NAME:
				return PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT == null ? presentationPageLayoutName != null : !PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT.equals(presentationPageLayoutName);
			case DrawingPackage.PAGE_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case DrawingPackage.PAGE_TYPE__USE_DATE_TIME_NAME:
				return USE_DATE_TIME_NAME_EDEFAULT == null ? useDateTimeName != null : !USE_DATE_TIME_NAME_EDEFAULT.equals(useDateTimeName);
			case DrawingPackage.PAGE_TYPE__USE_FOOTER_NAME:
				return USE_FOOTER_NAME_EDEFAULT == null ? useFooterName != null : !USE_FOOTER_NAME_EDEFAULT.equals(useFooterName);
			case DrawingPackage.PAGE_TYPE__USE_HEADER_NAME:
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
		result.append(", animationElementGroup: ");
		result.append(animationElementGroup);
		result.append(", id: ");
		result.append(id);
		result.append(", masterPageName: ");
		result.append(masterPageName);
		result.append(", name: ");
		result.append(name);
		result.append(", navOrder: ");
		result.append(navOrder);
		result.append(", presentationPageLayoutName: ");
		result.append(presentationPageLayoutName);
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

} //PageTypeImpl
