/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ObjectType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType;
import org.oasisopen.names.tc.opendocument.xmlns.text.MathMarkup;
import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectTypeImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectTypeImpl#getMath <em>Math</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectTypeImpl#getNotifyOnUpdateOfRanges <em>Notify On Update Of Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ObjectTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectTypeImpl extends EObjectImpl implements ObjectType {
	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected DocumentType document;

	/**
	 * The cached value of the '{@link #getMath() <em>Math</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMath()
	 * @generated
	 * @ordered
	 */
	protected MathMarkup math;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotifyOnUpdateOfRanges() <em>Notify On Update Of Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyOnUpdateOfRanges()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotifyOnUpdateOfRanges() <em>Notify On Update Of Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifyOnUpdateOfRanges()
	 * @generated
	 * @ordered
	 */
	protected String notifyOnUpdateOfRanges = NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType1 SHOW_EDEFAULT = ShowType1.EMBED;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType1 show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.SIMPLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getObjectType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(DocumentType newDocument, NotificationChain msgs) {
		DocumentType oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DrawingPackage.OBJECT_TYPE__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(DocumentType newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.OBJECT_TYPE__DOCUMENT, null, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.OBJECT_TYPE__DOCUMENT, null, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.OBJECT_TYPE__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathMarkup getMath() {
		return math;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMath(MathMarkup newMath, NotificationChain msgs) {
		MathMarkup oldMath = math;
		math = newMath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DrawingPackage.OBJECT_TYPE__MATH, oldMath, newMath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMath(MathMarkup newMath) {
		if (newMath != math) {
			NotificationChain msgs = null;
			if (math != null)
				msgs = ((InternalEObject)math).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.OBJECT_TYPE__MATH, null, msgs);
			if (newMath != null)
				msgs = ((InternalEObject)newMath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DrawingPackage.OBJECT_TYPE__MATH, null, msgs);
			msgs = basicSetMath(newMath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.OBJECT_TYPE__MATH, newMath, newMath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.OBJECT_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.OBJECT_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.OBJECT_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotifyOnUpdateOfRanges() {
		return notifyOnUpdateOfRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotifyOnUpdateOfRanges(String newNotifyOnUpdateOfRanges) {
		String oldNotifyOnUpdateOfRanges = notifyOnUpdateOfRanges;
		notifyOnUpdateOfRanges = newNotifyOnUpdateOfRanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.OBJECT_TYPE__NOTIFY_ON_UPDATE_OF_RANGES, oldNotifyOnUpdateOfRanges, notifyOnUpdateOfRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType1 getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(ShowType1 newShow) {
		ShowType1 oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.OBJECT_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		ShowType1 oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.OBJECT_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.OBJECT_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.OBJECT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DrawingPackage.OBJECT_TYPE__DOCUMENT:
				return basicSetDocument(null, msgs);
			case DrawingPackage.OBJECT_TYPE__MATH:
				return basicSetMath(null, msgs);
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
			case DrawingPackage.OBJECT_TYPE__DOCUMENT:
				return getDocument();
			case DrawingPackage.OBJECT_TYPE__MATH:
				return getMath();
			case DrawingPackage.OBJECT_TYPE__ACTUATE:
				return getActuate();
			case DrawingPackage.OBJECT_TYPE__HREF:
				return getHref();
			case DrawingPackage.OBJECT_TYPE__NOTIFY_ON_UPDATE_OF_RANGES:
				return getNotifyOnUpdateOfRanges();
			case DrawingPackage.OBJECT_TYPE__SHOW:
				return getShow();
			case DrawingPackage.OBJECT_TYPE__TYPE:
				return getType();
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
			case DrawingPackage.OBJECT_TYPE__DOCUMENT:
				setDocument((DocumentType)newValue);
				return;
			case DrawingPackage.OBJECT_TYPE__MATH:
				setMath((MathMarkup)newValue);
				return;
			case DrawingPackage.OBJECT_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DrawingPackage.OBJECT_TYPE__HREF:
				setHref((String)newValue);
				return;
			case DrawingPackage.OBJECT_TYPE__NOTIFY_ON_UPDATE_OF_RANGES:
				setNotifyOnUpdateOfRanges((String)newValue);
				return;
			case DrawingPackage.OBJECT_TYPE__SHOW:
				setShow((ShowType1)newValue);
				return;
			case DrawingPackage.OBJECT_TYPE__TYPE:
				setType((TypeType)newValue);
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
			case DrawingPackage.OBJECT_TYPE__DOCUMENT:
				setDocument((DocumentType)null);
				return;
			case DrawingPackage.OBJECT_TYPE__MATH:
				setMath((MathMarkup)null);
				return;
			case DrawingPackage.OBJECT_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DrawingPackage.OBJECT_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DrawingPackage.OBJECT_TYPE__NOTIFY_ON_UPDATE_OF_RANGES:
				setNotifyOnUpdateOfRanges(NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT);
				return;
			case DrawingPackage.OBJECT_TYPE__SHOW:
				unsetShow();
				return;
			case DrawingPackage.OBJECT_TYPE__TYPE:
				unsetType();
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
			case DrawingPackage.OBJECT_TYPE__DOCUMENT:
				return document != null;
			case DrawingPackage.OBJECT_TYPE__MATH:
				return math != null;
			case DrawingPackage.OBJECT_TYPE__ACTUATE:
				return isSetActuate();
			case DrawingPackage.OBJECT_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DrawingPackage.OBJECT_TYPE__NOTIFY_ON_UPDATE_OF_RANGES:
				return NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT == null ? notifyOnUpdateOfRanges != null : !NOTIFY_ON_UPDATE_OF_RANGES_EDEFAULT.equals(notifyOnUpdateOfRanges);
			case DrawingPackage.OBJECT_TYPE__SHOW:
				return isSetShow();
			case DrawingPackage.OBJECT_TYPE__TYPE:
				return isSetType();
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
		result.append(" (actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", href: ");
		result.append(href);
		result.append(", notifyOnUpdateOfRanges: ");
		result.append(notifyOnUpdateOfRanges);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObjectTypeImpl
