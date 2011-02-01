/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;
import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl#getBinaryData <em>Binary Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.ImageTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageTypeImpl extends EObjectImpl implements ImageType {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	protected ImageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getImageType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.IMAGE_TYPE__BINARY_DATA, oldBinaryData, binaryData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DrawingPackage.IMAGE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(DrawingPackage.eINSTANCE.getImageType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getGroup().list(DrawingPackage.eINSTANCE.getImageType_List());
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.IMAGE_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.IMAGE_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.IMAGE_TYPE__FILTER_NAME, oldFilterName, filterName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.IMAGE_TYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.IMAGE_TYPE__SHOW, oldShow, show, !oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.IMAGE_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.IMAGE_TYPE__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.IMAGE_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			case DrawingPackage.IMAGE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DrawingPackage.IMAGE_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case DrawingPackage.IMAGE_TYPE__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
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
			case DrawingPackage.IMAGE_TYPE__BINARY_DATA:
				return getBinaryData();
			case DrawingPackage.IMAGE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DrawingPackage.IMAGE_TYPE__P:
				return getP();
			case DrawingPackage.IMAGE_TYPE__LIST:
				return getList();
			case DrawingPackage.IMAGE_TYPE__ACTUATE:
				return getActuate();
			case DrawingPackage.IMAGE_TYPE__FILTER_NAME:
				return getFilterName();
			case DrawingPackage.IMAGE_TYPE__HREF:
				return getHref();
			case DrawingPackage.IMAGE_TYPE__SHOW:
				return getShow();
			case DrawingPackage.IMAGE_TYPE__TYPE:
				return getType();
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
			case DrawingPackage.IMAGE_TYPE__BINARY_DATA:
				setBinaryData((byte[])newValue);
				return;
			case DrawingPackage.IMAGE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DrawingPackage.IMAGE_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case DrawingPackage.IMAGE_TYPE__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case DrawingPackage.IMAGE_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case DrawingPackage.IMAGE_TYPE__FILTER_NAME:
				setFilterName((String)newValue);
				return;
			case DrawingPackage.IMAGE_TYPE__HREF:
				setHref((String)newValue);
				return;
			case DrawingPackage.IMAGE_TYPE__SHOW:
				setShow((ShowType1)newValue);
				return;
			case DrawingPackage.IMAGE_TYPE__TYPE:
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
			case DrawingPackage.IMAGE_TYPE__BINARY_DATA:
				setBinaryData(BINARY_DATA_EDEFAULT);
				return;
			case DrawingPackage.IMAGE_TYPE__GROUP:
				getGroup().clear();
				return;
			case DrawingPackage.IMAGE_TYPE__P:
				getP().clear();
				return;
			case DrawingPackage.IMAGE_TYPE__LIST:
				getList().clear();
				return;
			case DrawingPackage.IMAGE_TYPE__ACTUATE:
				unsetActuate();
				return;
			case DrawingPackage.IMAGE_TYPE__FILTER_NAME:
				setFilterName(FILTER_NAME_EDEFAULT);
				return;
			case DrawingPackage.IMAGE_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case DrawingPackage.IMAGE_TYPE__SHOW:
				unsetShow();
				return;
			case DrawingPackage.IMAGE_TYPE__TYPE:
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
			case DrawingPackage.IMAGE_TYPE__BINARY_DATA:
				return BINARY_DATA_EDEFAULT == null ? binaryData != null : !BINARY_DATA_EDEFAULT.equals(binaryData);
			case DrawingPackage.IMAGE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DrawingPackage.IMAGE_TYPE__P:
				return !getP().isEmpty();
			case DrawingPackage.IMAGE_TYPE__LIST:
				return !getList().isEmpty();
			case DrawingPackage.IMAGE_TYPE__ACTUATE:
				return isSetActuate();
			case DrawingPackage.IMAGE_TYPE__FILTER_NAME:
				return FILTER_NAME_EDEFAULT == null ? filterName != null : !FILTER_NAME_EDEFAULT.equals(filterName);
			case DrawingPackage.IMAGE_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case DrawingPackage.IMAGE_TYPE__SHOW:
				return isSetShow();
			case DrawingPackage.IMAGE_TYPE__TYPE:
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
		result.append(", group: ");
		result.append(group);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", filterName: ");
		result.append(filterName);
		result.append(", href: ");
		result.append(href);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ImageTypeImpl
