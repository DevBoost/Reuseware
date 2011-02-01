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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Page Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getHeaderLeft <em>Header Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getFooterLeft <em>Footer Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getRect <em>Rect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getRegularPolygon <em>Regular Polygon</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getCircle <em>Circle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getPageThumbnail <em>Page Thumbnail</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getCustomShape <em>Custom Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getNextStyleName <em>Next Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getPageLayoutName <em>Page Layout Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.MasterPageTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterPageTypeImpl extends EObjectImpl implements MasterPageType {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected HeaderType header;

	/**
	 * The cached value of the '{@link #getHeaderLeft() <em>Header Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderLeft()
	 * @generated
	 * @ordered
	 */
	protected HeaderLeftType headerLeft;

	/**
	 * The cached value of the '{@link #getFooter() <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooter()
	 * @generated
	 * @ordered
	 */
	protected FooterType footer;

	/**
	 * The cached value of the '{@link #getFooterLeft() <em>Footer Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterLeft()
	 * @generated
	 * @ordered
	 */
	protected FooterLeftType footerLeft;

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
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<StyleType1> style;

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
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected NotesType notes;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getNextStyleName() <em>Next Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextStyleName() <em>Next Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStyleName()
	 * @generated
	 * @ordered
	 */
	protected String nextStyleName = NEXT_STYLE_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterPageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getMasterPageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(HeaderType newHeader, NotificationChain msgs) {
		HeaderType oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(HeaderType newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderLeftType getHeaderLeft() {
		return headerLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderLeft(HeaderLeftType newHeaderLeft, NotificationChain msgs) {
		HeaderLeftType oldHeaderLeft = headerLeft;
		headerLeft = newHeaderLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__HEADER_LEFT, oldHeaderLeft, newHeaderLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderLeft(HeaderLeftType newHeaderLeft) {
		if (newHeaderLeft != headerLeft) {
			NotificationChain msgs = null;
			if (headerLeft != null)
				msgs = ((InternalEObject)headerLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__HEADER_LEFT, null, msgs);
			if (newHeaderLeft != null)
				msgs = ((InternalEObject)newHeaderLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__HEADER_LEFT, null, msgs);
			msgs = basicSetHeaderLeft(newHeaderLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__HEADER_LEFT, newHeaderLeft, newHeaderLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterType getFooter() {
		return footer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(FooterType newFooter, NotificationChain msgs) {
		FooterType oldFooter = footer;
		footer = newFooter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__FOOTER, oldFooter, newFooter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooter(FooterType newFooter) {
		if (newFooter != footer) {
			NotificationChain msgs = null;
			if (footer != null)
				msgs = ((InternalEObject)footer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__FOOTER, null, msgs);
			if (newFooter != null)
				msgs = ((InternalEObject)newFooter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__FOOTER, null, msgs);
			msgs = basicSetFooter(newFooter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__FOOTER, newFooter, newFooter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterLeftType getFooterLeft() {
		return footerLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooterLeft(FooterLeftType newFooterLeft, NotificationChain msgs) {
		FooterLeftType oldFooterLeft = footerLeft;
		footerLeft = newFooterLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__FOOTER_LEFT, oldFooterLeft, newFooterLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterLeft(FooterLeftType newFooterLeft) {
		if (newFooterLeft != footerLeft) {
			NotificationChain msgs = null;
			if (footerLeft != null)
				msgs = ((InternalEObject)footerLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__FOOTER_LEFT, null, msgs);
			if (newFooterLeft != null)
				msgs = ((InternalEObject)newFooterLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__FOOTER_LEFT, null, msgs);
			msgs = basicSetFooterLeft(newFooterLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__FOOTER_LEFT, newFooterLeft, newFooterLeft));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__FORMS, oldForms, newForms);
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
				msgs = ((InternalEObject)forms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__FORMS, null, msgs);
			if (newForms != null)
				msgs = ((InternalEObject)newForms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__FORMS, null, msgs);
			msgs = basicSetForms(newForms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__FORMS, newForms, newForms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleType1> getStyle() {
		if (style == null) {
			style = new EObjectContainmentEList<StyleType1>(StyleType1.class, this, StylePackage.MASTER_PAGE_TYPE__STYLE);
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getShape() {
		if (shape == null) {
			shape = new BasicFeatureMap(this, StylePackage.MASTER_PAGE_TYPE__SHAPE);
		}
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectType> getRect() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Rect());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineType> getLine() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Line());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolylineType> getPolyline() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Polyline());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonType> getPolygon() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Polygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegularPolygonType> getRegularPolygon() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_RegularPolygon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathType> getPath() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Path());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CircleType> getCircle() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Circle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseType> getEllipse() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Ellipse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GType> getG() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_G());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageThumbnailType> getPageThumbnail() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_PageThumbnail());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameType> getFrame() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Frame());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Measure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaptionType> getCaption() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Caption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlType> getControl() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Control());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SceneType> getScene() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_Scene());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomShapeType> getCustomShape() {
		return getShape().list(StylePackage.eINSTANCE.getMasterPageType_CustomShape());
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__NOTES, oldNotes, newNotes);
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
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.MASTER_PAGE_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextStyleName() {
		return nextStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStyleName(String newNextStyleName) {
		String oldNextStyleName = nextStyleName;
		nextStyleName = newNextStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__NEXT_STYLE_NAME, oldNextStyleName, nextStyleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__PAGE_LAYOUT_NAME, oldPageLayoutName, pageLayoutName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.MASTER_PAGE_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylePackage.MASTER_PAGE_TYPE__HEADER:
				return basicSetHeader(null, msgs);
			case StylePackage.MASTER_PAGE_TYPE__HEADER_LEFT:
				return basicSetHeaderLeft(null, msgs);
			case StylePackage.MASTER_PAGE_TYPE__FOOTER:
				return basicSetFooter(null, msgs);
			case StylePackage.MASTER_PAGE_TYPE__FOOTER_LEFT:
				return basicSetFooterLeft(null, msgs);
			case StylePackage.MASTER_PAGE_TYPE__FORMS:
				return basicSetForms(null, msgs);
			case StylePackage.MASTER_PAGE_TYPE__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__SHAPE:
				return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__RECT:
				return ((InternalEList<?>)getRect()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__POLYLINE:
				return ((InternalEList<?>)getPolyline()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__POLYGON:
				return ((InternalEList<?>)getPolygon()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__REGULAR_POLYGON:
				return ((InternalEList<?>)getRegularPolygon()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__PATH:
				return ((InternalEList<?>)getPath()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__CIRCLE:
				return ((InternalEList<?>)getCircle()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__ELLIPSE:
				return ((InternalEList<?>)getEllipse()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__G:
				return ((InternalEList<?>)getG()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__PAGE_THUMBNAIL:
				return ((InternalEList<?>)getPageThumbnail()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__FRAME:
				return ((InternalEList<?>)getFrame()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__MEASURE:
				return ((InternalEList<?>)getMeasure()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__CAPTION:
				return ((InternalEList<?>)getCaption()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__CUSTOM_SHAPE:
				return ((InternalEList<?>)getCustomShape()).basicRemove(otherEnd, msgs);
			case StylePackage.MASTER_PAGE_TYPE__NOTES:
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
			case StylePackage.MASTER_PAGE_TYPE__HEADER:
				return getHeader();
			case StylePackage.MASTER_PAGE_TYPE__HEADER_LEFT:
				return getHeaderLeft();
			case StylePackage.MASTER_PAGE_TYPE__FOOTER:
				return getFooter();
			case StylePackage.MASTER_PAGE_TYPE__FOOTER_LEFT:
				return getFooterLeft();
			case StylePackage.MASTER_PAGE_TYPE__FORMS:
				return getForms();
			case StylePackage.MASTER_PAGE_TYPE__STYLE:
				return getStyle();
			case StylePackage.MASTER_PAGE_TYPE__SHAPE:
				if (coreType) return getShape();
				return ((FeatureMap.Internal)getShape()).getWrapper();
			case StylePackage.MASTER_PAGE_TYPE__RECT:
				return getRect();
			case StylePackage.MASTER_PAGE_TYPE__LINE:
				return getLine();
			case StylePackage.MASTER_PAGE_TYPE__POLYLINE:
				return getPolyline();
			case StylePackage.MASTER_PAGE_TYPE__POLYGON:
				return getPolygon();
			case StylePackage.MASTER_PAGE_TYPE__REGULAR_POLYGON:
				return getRegularPolygon();
			case StylePackage.MASTER_PAGE_TYPE__PATH:
				return getPath();
			case StylePackage.MASTER_PAGE_TYPE__CIRCLE:
				return getCircle();
			case StylePackage.MASTER_PAGE_TYPE__ELLIPSE:
				return getEllipse();
			case StylePackage.MASTER_PAGE_TYPE__G:
				return getG();
			case StylePackage.MASTER_PAGE_TYPE__PAGE_THUMBNAIL:
				return getPageThumbnail();
			case StylePackage.MASTER_PAGE_TYPE__FRAME:
				return getFrame();
			case StylePackage.MASTER_PAGE_TYPE__MEASURE:
				return getMeasure();
			case StylePackage.MASTER_PAGE_TYPE__CAPTION:
				return getCaption();
			case StylePackage.MASTER_PAGE_TYPE__CONNECTOR:
				return getConnector();
			case StylePackage.MASTER_PAGE_TYPE__CONTROL:
				return getControl();
			case StylePackage.MASTER_PAGE_TYPE__SCENE:
				return getScene();
			case StylePackage.MASTER_PAGE_TYPE__CUSTOM_SHAPE:
				return getCustomShape();
			case StylePackage.MASTER_PAGE_TYPE__NOTES:
				return getNotes();
			case StylePackage.MASTER_PAGE_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case StylePackage.MASTER_PAGE_TYPE__NAME:
				return getName();
			case StylePackage.MASTER_PAGE_TYPE__NEXT_STYLE_NAME:
				return getNextStyleName();
			case StylePackage.MASTER_PAGE_TYPE__PAGE_LAYOUT_NAME:
				return getPageLayoutName();
			case StylePackage.MASTER_PAGE_TYPE__STYLE_NAME:
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
			case StylePackage.MASTER_PAGE_TYPE__HEADER:
				setHeader((HeaderType)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__HEADER_LEFT:
				setHeaderLeft((HeaderLeftType)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__FOOTER:
				setFooter((FooterType)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__FOOTER_LEFT:
				setFooterLeft((FooterLeftType)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__FORMS:
				setForms((FormsType)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__STYLE:
				getStyle().clear();
				getStyle().addAll((Collection<? extends StyleType1>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__SHAPE:
				((FeatureMap.Internal)getShape()).set(newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__RECT:
				getRect().clear();
				getRect().addAll((Collection<? extends RectType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends LineType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__POLYLINE:
				getPolyline().clear();
				getPolyline().addAll((Collection<? extends PolylineType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__POLYGON:
				getPolygon().clear();
				getPolygon().addAll((Collection<? extends PolygonType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				getRegularPolygon().addAll((Collection<? extends RegularPolygonType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends PathType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__CIRCLE:
				getCircle().clear();
				getCircle().addAll((Collection<? extends CircleType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__ELLIPSE:
				getEllipse().clear();
				getEllipse().addAll((Collection<? extends EllipseType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__G:
				getG().clear();
				getG().addAll((Collection<? extends GType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				getPageThumbnail().addAll((Collection<? extends PageThumbnailType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__FRAME:
				getFrame().clear();
				getFrame().addAll((Collection<? extends FrameType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__MEASURE:
				getMeasure().clear();
				getMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__CAPTION:
				getCaption().clear();
				getCaption().addAll((Collection<? extends CaptionType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends SceneType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				getCustomShape().addAll((Collection<? extends CustomShapeType>)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__NOTES:
				setNotes((NotesType)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__NEXT_STYLE_NAME:
				setNextStyleName((String)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__PAGE_LAYOUT_NAME:
				setPageLayoutName((String)newValue);
				return;
			case StylePackage.MASTER_PAGE_TYPE__STYLE_NAME:
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
			case StylePackage.MASTER_PAGE_TYPE__HEADER:
				setHeader((HeaderType)null);
				return;
			case StylePackage.MASTER_PAGE_TYPE__HEADER_LEFT:
				setHeaderLeft((HeaderLeftType)null);
				return;
			case StylePackage.MASTER_PAGE_TYPE__FOOTER:
				setFooter((FooterType)null);
				return;
			case StylePackage.MASTER_PAGE_TYPE__FOOTER_LEFT:
				setFooterLeft((FooterLeftType)null);
				return;
			case StylePackage.MASTER_PAGE_TYPE__FORMS:
				setForms((FormsType)null);
				return;
			case StylePackage.MASTER_PAGE_TYPE__STYLE:
				getStyle().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__SHAPE:
				getShape().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__RECT:
				getRect().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__LINE:
				getLine().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__POLYLINE:
				getPolyline().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__POLYGON:
				getPolygon().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__REGULAR_POLYGON:
				getRegularPolygon().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__PATH:
				getPath().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__CIRCLE:
				getCircle().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__ELLIPSE:
				getEllipse().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__G:
				getG().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__PAGE_THUMBNAIL:
				getPageThumbnail().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__FRAME:
				getFrame().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__MEASURE:
				getMeasure().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__CAPTION:
				getCaption().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__CONNECTOR:
				getConnector().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__CONTROL:
				getControl().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__SCENE:
				getScene().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__CUSTOM_SHAPE:
				getCustomShape().clear();
				return;
			case StylePackage.MASTER_PAGE_TYPE__NOTES:
				setNotes((NotesType)null);
				return;
			case StylePackage.MASTER_PAGE_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case StylePackage.MASTER_PAGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StylePackage.MASTER_PAGE_TYPE__NEXT_STYLE_NAME:
				setNextStyleName(NEXT_STYLE_NAME_EDEFAULT);
				return;
			case StylePackage.MASTER_PAGE_TYPE__PAGE_LAYOUT_NAME:
				setPageLayoutName(PAGE_LAYOUT_NAME_EDEFAULT);
				return;
			case StylePackage.MASTER_PAGE_TYPE__STYLE_NAME:
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
			case StylePackage.MASTER_PAGE_TYPE__HEADER:
				return header != null;
			case StylePackage.MASTER_PAGE_TYPE__HEADER_LEFT:
				return headerLeft != null;
			case StylePackage.MASTER_PAGE_TYPE__FOOTER:
				return footer != null;
			case StylePackage.MASTER_PAGE_TYPE__FOOTER_LEFT:
				return footerLeft != null;
			case StylePackage.MASTER_PAGE_TYPE__FORMS:
				return forms != null;
			case StylePackage.MASTER_PAGE_TYPE__STYLE:
				return style != null && !style.isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__SHAPE:
				return shape != null && !shape.isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__RECT:
				return !getRect().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__LINE:
				return !getLine().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__POLYLINE:
				return !getPolyline().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__POLYGON:
				return !getPolygon().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__REGULAR_POLYGON:
				return !getRegularPolygon().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__PATH:
				return !getPath().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__CIRCLE:
				return !getCircle().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__ELLIPSE:
				return !getEllipse().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__G:
				return !getG().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__PAGE_THUMBNAIL:
				return !getPageThumbnail().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__FRAME:
				return !getFrame().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__MEASURE:
				return !getMeasure().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__CAPTION:
				return !getCaption().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__CONNECTOR:
				return !getConnector().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__CONTROL:
				return !getControl().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__SCENE:
				return !getScene().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__CUSTOM_SHAPE:
				return !getCustomShape().isEmpty();
			case StylePackage.MASTER_PAGE_TYPE__NOTES:
				return notes != null;
			case StylePackage.MASTER_PAGE_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case StylePackage.MASTER_PAGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StylePackage.MASTER_PAGE_TYPE__NEXT_STYLE_NAME:
				return NEXT_STYLE_NAME_EDEFAULT == null ? nextStyleName != null : !NEXT_STYLE_NAME_EDEFAULT.equals(nextStyleName);
			case StylePackage.MASTER_PAGE_TYPE__PAGE_LAYOUT_NAME:
				return PAGE_LAYOUT_NAME_EDEFAULT == null ? pageLayoutName != null : !PAGE_LAYOUT_NAME_EDEFAULT.equals(pageLayoutName);
			case StylePackage.MASTER_PAGE_TYPE__STYLE_NAME:
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
		result.append(" (shape: ");
		result.append(shape);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", name: ");
		result.append(name);
		result.append(", nextStyleName: ");
		result.append(nextStyleName);
		result.append(", pageLayoutName: ");
		result.append(pageLayoutName);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //MasterPageTypeImpl
