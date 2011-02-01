/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handout Master Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getPageLayoutName <em>Page Layout Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getPresentationPageLayoutName <em>Presentation Page Layout Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getUseDateTimeName <em>Use Date Time Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getUseFooterName <em>Use Footer Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.HandoutMasterTypeImpl#getUseHeaderName <em>Use Header Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandoutMasterTypeImpl extends EObjectImpl implements HandoutMasterType {
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
	protected HandoutMasterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getHandoutMasterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getShape() {
		if (shape == null) {
			shape = new BasicFeatureMap(this, StylePackage.HANDOUT_MASTER_TYPE__SHAPE);
		}
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getShape().list(StylePackage.eINSTANCE.getHandoutMasterType_CustomShape());
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.HANDOUT_MASTER_TYPE__PAGE_LAYOUT_NAME, oldPageLayoutName, pageLayoutName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.HANDOUT_MASTER_TYPE__PRESENTATION_PAGE_LAYOUT_NAME, oldPresentationPageLayoutName, presentationPageLayoutName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.HANDOUT_MASTER_TYPE__STYLE_NAME, oldStyleName, styleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.HANDOUT_MASTER_TYPE__USE_DATE_TIME_NAME, oldUseDateTimeName, useDateTimeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.HANDOUT_MASTER_TYPE__USE_FOOTER_NAME, oldUseFooterName, useFooterName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.HANDOUT_MASTER_TYPE__USE_HEADER_NAME, oldUseHeaderName, useHeaderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylePackage.HANDOUT_MASTER_TYPE__SHAPE:
				return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case StylePackage.HANDOUT_MASTER_TYPE__CUSTOM_SHAPE:
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
			case StylePackage.HANDOUT_MASTER_TYPE__SHAPE:
				if (coreType) return getShape();
				return ((FeatureMap.Internal)getShape()).getWrapper();
			case StylePackage.HANDOUT_MASTER_TYPE__RECT:
				return getRect();
			case StylePackage.HANDOUT_MASTER_TYPE__LINE:
				return getLine();
			case StylePackage.HANDOUT_MASTER_TYPE__POLYLINE:
				return getPolyline();
			case StylePackage.HANDOUT_MASTER_TYPE__POLYGON:
				return getPolygon();
			case StylePackage.HANDOUT_MASTER_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case StylePackage.HANDOUT_MASTER_TYPE__PATH:
				return getPath();
			case StylePackage.HANDOUT_MASTER_TYPE__CIRCLE:
				return getCircle();
			case StylePackage.HANDOUT_MASTER_TYPE__ELLIPSE:
				return getEllipse();
			case StylePackage.HANDOUT_MASTER_TYPE__G:
				return getG();
			case StylePackage.HANDOUT_MASTER_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case StylePackage.HANDOUT_MASTER_TYPE__FRAME:
				return getFrame();
			case StylePackage.HANDOUT_MASTER_TYPE__MEASURE:
				return getMeasure();
			case StylePackage.HANDOUT_MASTER_TYPE__CAPTION:
				return getCaption();
			case StylePackage.HANDOUT_MASTER_TYPE__CONNECTOR:
				return getConnector();
			case StylePackage.HANDOUT_MASTER_TYPE__CONTROL:
				return getControl();
			case StylePackage.HANDOUT_MASTER_TYPE__SCENE:
				return getScene();
			case StylePackage.HANDOUT_MASTER_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case StylePackage.HANDOUT_MASTER_TYPE__PAGE_LAYOUT_NAME:
				return getPageLayoutName();
			case StylePackage.HANDOUT_MASTER_TYPE__PRESENTATION_PAGE_LAYOUT_NAME:
				return getPresentationPageLayoutName();
			case StylePackage.HANDOUT_MASTER_TYPE__STYLE_NAME:
				return getStyleName();
			case StylePackage.HANDOUT_MASTER_TYPE__USE_DATE_TIME_NAME:
				return getUseDateTimeName();
			case StylePackage.HANDOUT_MASTER_TYPE__USE_FOOTER_NAME:
				return getUseFooterName();
			case StylePackage.HANDOUT_MASTER_TYPE__USE_HEADER_NAME:
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
			case StylePackage.HANDOUT_MASTER_TYPE__SHAPE:
				((FeatureMap.Internal)getShape()).set(newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__PAGE_LAYOUT_NAME:
				setPageLayoutName((String)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__PRESENTATION_PAGE_LAYOUT_NAME:
				setPresentationPageLayoutName((String)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__USE_DATE_TIME_NAME:
				setUseDateTimeName((String)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__USE_FOOTER_NAME:
				setUseFooterName((String)newValue);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__USE_HEADER_NAME:
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
			case StylePackage.HANDOUT_MASTER_TYPE__SHAPE:
				getShape().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__RECT:
				getRect().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__LINE:
				getLine().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__PATH:
				getPath().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__G:
				getG().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__FRAME:
				getFrame().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CAPTION:
				getCaption().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CONTROL:
				getControl().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__SCENE:
				getScene().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__PAGE_LAYOUT_NAME:
				setPageLayoutName(PAGE_LAYOUT_NAME_EDEFAULT);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__PRESENTATION_PAGE_LAYOUT_NAME:
				setPresentationPageLayoutName(PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__USE_DATE_TIME_NAME:
				setUseDateTimeName(USE_DATE_TIME_NAME_EDEFAULT);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__USE_FOOTER_NAME:
				setUseFooterName(USE_FOOTER_NAME_EDEFAULT);
				return;
			case StylePackage.HANDOUT_MASTER_TYPE__USE_HEADER_NAME:
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
			case StylePackage.HANDOUT_MASTER_TYPE__SHAPE:
				return shape != null && !shape.isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__RECT:
				return !getRect().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__LINE:
				return !getLine().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__PATH:
				return !getPath().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__G:
				return !getG().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__FRAME:
				return !getFrame().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__CONTROL:
				return !getControl().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__SCENE:
				return !getScene().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case StylePackage.HANDOUT_MASTER_TYPE__PAGE_LAYOUT_NAME:
				return PAGE_LAYOUT_NAME_EDEFAULT == null ? pageLayoutName != null : !PAGE_LAYOUT_NAME_EDEFAULT.equals(pageLayoutName);
			case StylePackage.HANDOUT_MASTER_TYPE__PRESENTATION_PAGE_LAYOUT_NAME:
				return PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT == null ? presentationPageLayoutName != null : !PRESENTATION_PAGE_LAYOUT_NAME_EDEFAULT.equals(presentationPageLayoutName);
			case StylePackage.HANDOUT_MASTER_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
			case StylePackage.HANDOUT_MASTER_TYPE__USE_DATE_TIME_NAME:
				return USE_DATE_TIME_NAME_EDEFAULT == null ? useDateTimeName != null : !USE_DATE_TIME_NAME_EDEFAULT.equals(useDateTimeName);
			case StylePackage.HANDOUT_MASTER_TYPE__USE_FOOTER_NAME:
				return USE_FOOTER_NAME_EDEFAULT == null ? useFooterName != null : !USE_FOOTER_NAME_EDEFAULT.equals(useFooterName);
			case StylePackage.HANDOUT_MASTER_TYPE__USE_HEADER_NAME:
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

} //HandoutMasterTypeImpl
