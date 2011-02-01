/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.RepeatType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background Image Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl#getBinaryData <em>Binary Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.BackgroundImageTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BackgroundImageTypeImpl extends EObjectImpl implements BackgroundImageType {
	/**
	 * The default value of the '{@link #getBinaryData() <em>Binary Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BINARY_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinaryData() <em>Binary Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryData()
	 * @generated
	 * @ordered
	 */
	protected byte[] binaryData = BINARY_DATA_EDEFAULT;

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
	 * The default value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected String filterName = FILTER_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String OPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected String opacity = OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Object POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Object position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final RepeatType REPEAT_EDEFAULT = RepeatType.REPEAT;

	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected RepeatType repeat = REPEAT_EDEFAULT;

	/**
	 * This is true if the Repeat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repeatESet;

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
	protected BackgroundImageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getBackgroundImageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBinaryData() {
		return binaryData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryData(byte[] newBinaryData) {
		byte[] oldBinaryData = binaryData;
		binaryData = newBinaryData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.BACKGROUND_IMAGE_TYPE__BINARY_DATA, oldBinaryData, binaryData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.BACKGROUND_IMAGE_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.BACKGROUND_IMAGE_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
	public String getFilterName() {
		return filterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterName(String newFilterName) {
		String oldFilterName = filterName;
		filterName = newFilterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.BACKGROUND_IMAGE_TYPE__FILTER_NAME, oldFilterName, filterName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.BACKGROUND_IMAGE_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(String newOpacity) {
		String oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.BACKGROUND_IMAGE_TYPE__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Object newPosition) {
		Object oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.BACKGROUND_IMAGE_TYPE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatType getRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat(RepeatType newRepeat) {
		RepeatType oldRepeat = repeat;
		repeat = newRepeat == null ? REPEAT_EDEFAULT : newRepeat;
		boolean oldRepeatESet = repeatESet;
		repeatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.BACKGROUND_IMAGE_TYPE__REPEAT, oldRepeat, repeat, !oldRepeatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepeat() {
		RepeatType oldRepeat = repeat;
		boolean oldRepeatESet = repeatESet;
		repeat = REPEAT_EDEFAULT;
		repeatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.BACKGROUND_IMAGE_TYPE__REPEAT, oldRepeat, REPEAT_EDEFAULT, oldRepeatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepeat() {
		return repeatESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.BACKGROUND_IMAGE_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.BACKGROUND_IMAGE_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.BACKGROUND_IMAGE_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.BACKGROUND_IMAGE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StylePackage.BACKGROUND_IMAGE_TYPE__BINARY_DATA:
				return getBinaryData();
			case StylePackage.BACKGROUND_IMAGE_TYPE__ACTUATE:
				return getActuate();
			case StylePackage.BACKGROUND_IMAGE_TYPE__FILTER_NAME:
				return getFilterName();
			case StylePackage.BACKGROUND_IMAGE_TYPE__HREF:
				return getHref();
			case StylePackage.BACKGROUND_IMAGE_TYPE__OPACITY:
				return getOpacity();
			case StylePackage.BACKGROUND_IMAGE_TYPE__POSITION:
				return getPosition();
			case StylePackage.BACKGROUND_IMAGE_TYPE__REPEAT:
				return getRepeat();
			case StylePackage.BACKGROUND_IMAGE_TYPE__SHOW:
				return getShow();
			case StylePackage.BACKGROUND_IMAGE_TYPE__TYPE:
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
			case StylePackage.BACKGROUND_IMAGE_TYPE__BINARY_DATA:
				setBinaryData((byte[])newValue);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__FILTER_NAME:
				setFilterName((String)newValue);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__OPACITY:
				setOpacity((String)newValue);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__POSITION:
				setPosition(newValue);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__REPEAT:
				setRepeat((RepeatType)newValue);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__SHOW:
				setShow((ShowType1)newValue);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__TYPE:
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
			case StylePackage.BACKGROUND_IMAGE_TYPE__BINARY_DATA:
				setBinaryData(BINARY_DATA_EDEFAULT);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__ACTUATE:
				unsetActuate();
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__FILTER_NAME:
				setFilterName(FILTER_NAME_EDEFAULT);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__REPEAT:
				unsetRepeat();
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__SHOW:
				unsetShow();
				return;
			case StylePackage.BACKGROUND_IMAGE_TYPE__TYPE:
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
			case StylePackage.BACKGROUND_IMAGE_TYPE__BINARY_DATA:
				return BINARY_DATA_EDEFAULT == null ? binaryData != null : !BINARY_DATA_EDEFAULT.equals(binaryData);
			case StylePackage.BACKGROUND_IMAGE_TYPE__ACTUATE:
				return isSetActuate();
			case StylePackage.BACKGROUND_IMAGE_TYPE__FILTER_NAME:
				return FILTER_NAME_EDEFAULT == null ? filterName != null : !FILTER_NAME_EDEFAULT.equals(filterName);
			case StylePackage.BACKGROUND_IMAGE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case StylePackage.BACKGROUND_IMAGE_TYPE__OPACITY:
				return OPACITY_EDEFAULT == null ? opacity != null : !OPACITY_EDEFAULT.equals(opacity);
			case StylePackage.BACKGROUND_IMAGE_TYPE__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case StylePackage.BACKGROUND_IMAGE_TYPE__REPEAT:
				return isSetRepeat();
			case StylePackage.BACKGROUND_IMAGE_TYPE__SHOW:
				return isSetShow();
			case StylePackage.BACKGROUND_IMAGE_TYPE__TYPE:
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
		result.append(" (binaryData: ");
		result.append(binaryData);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", filterName: ");
		result.append(filterName);
		result.append(", href: ");
		result.append(href);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", position: ");
		result.append(position);
		result.append(", repeat: ");
		if (repeatESet) result.append(repeat); else result.append("<unset>");
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BackgroundImageTypeImpl
