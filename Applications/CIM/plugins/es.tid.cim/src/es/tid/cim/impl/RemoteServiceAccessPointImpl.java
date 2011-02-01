/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.EnumAccessContext;
import es.tid.cim.EnumInfoFormat;
import es.tid.cim.RemoteServiceAccessPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Service Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.RemoteServiceAccessPointImpl#getAccessInfo <em>Access Info</em>}</li>
 *   <li>{@link es.tid.cim.impl.RemoteServiceAccessPointImpl#getAccessContext <em>Access Context</em>}</li>
 *   <li>{@link es.tid.cim.impl.RemoteServiceAccessPointImpl#getInfoFormat <em>Info Format</em>}</li>
 *   <li>{@link es.tid.cim.impl.RemoteServiceAccessPointImpl#getOtherAccessContext <em>Other Access Context</em>}</li>
 *   <li>{@link es.tid.cim.impl.RemoteServiceAccessPointImpl#getOtherInfoFormatDescription <em>Other Info Format Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteServiceAccessPointImpl extends ServiceAccessPointImpl implements RemoteServiceAccessPoint {
	/**
	 * The default value of the '{@link #getAccessInfo() <em>Access Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessInfo() <em>Access Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessInfo()
	 * @generated
	 * @ordered
	 */
	protected String accessInfo = ACCESS_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessContext() <em>Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessContext()
	 * @generated
	 * @ordered
	 */
	protected static final EnumAccessContext ACCESS_CONTEXT_EDEFAULT = EnumAccessContext.UNKNOWN;

	/**
	 * The cached value of the '{@link #getAccessContext() <em>Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessContext()
	 * @generated
	 * @ordered
	 */
	protected EnumAccessContext accessContext = ACCESS_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoFormat() <em>Info Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoFormat()
	 * @generated
	 * @ordered
	 */
	protected static final EnumInfoFormat INFO_FORMAT_EDEFAULT = EnumInfoFormat.OTHER;

	/**
	 * The cached value of the '{@link #getInfoFormat() <em>Info Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoFormat()
	 * @generated
	 * @ordered
	 */
	protected EnumInfoFormat infoFormat = INFO_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAccessContext() <em>Other Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAccessContext()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ACCESS_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAccessContext() <em>Other Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAccessContext()
	 * @generated
	 * @ordered
	 */
	protected String otherAccessContext = OTHER_ACCESS_CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherInfoFormatDescription() <em>Other Info Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInfoFormatDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherInfoFormatDescription() <em>Other Info Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherInfoFormatDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherInfoFormatDescription = OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteServiceAccessPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getRemoteServiceAccessPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessInfo() {
		return accessInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessInfo(String newAccessInfo) {
		String oldAccessInfo = accessInfo;
		accessInfo = newAccessInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO, oldAccessInfo, accessInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumAccessContext getAccessContext() {
		return accessContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessContext(EnumAccessContext newAccessContext) {
		EnumAccessContext oldAccessContext = accessContext;
		accessContext = newAccessContext == null ? ACCESS_CONTEXT_EDEFAULT : newAccessContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT, oldAccessContext, accessContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumInfoFormat getInfoFormat() {
		return infoFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoFormat(EnumInfoFormat newInfoFormat) {
		EnumInfoFormat oldInfoFormat = infoFormat;
		infoFormat = newInfoFormat == null ? INFO_FORMAT_EDEFAULT : newInfoFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT, oldInfoFormat, infoFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherAccessContext() {
		return otherAccessContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherAccessContext(String newOtherAccessContext) {
		String oldOtherAccessContext = otherAccessContext;
		otherAccessContext = newOtherAccessContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT, oldOtherAccessContext, otherAccessContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherInfoFormatDescription() {
		return otherInfoFormatDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherInfoFormatDescription(String newOtherInfoFormatDescription) {
		String oldOtherInfoFormatDescription = otherInfoFormatDescription;
		otherInfoFormatDescription = newOtherInfoFormatDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION, oldOtherInfoFormatDescription, otherInfoFormatDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO:
				return getAccessInfo();
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT:
				return getAccessContext();
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT:
				return getInfoFormat();
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT:
				return getOtherAccessContext();
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION:
				return getOtherInfoFormatDescription();
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
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO:
				setAccessInfo((String)newValue);
				return;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT:
				setAccessContext((EnumAccessContext)newValue);
				return;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT:
				setInfoFormat((EnumInfoFormat)newValue);
				return;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT:
				setOtherAccessContext((String)newValue);
				return;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION:
				setOtherInfoFormatDescription((String)newValue);
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
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO:
				setAccessInfo(ACCESS_INFO_EDEFAULT);
				return;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT:
				setAccessContext(ACCESS_CONTEXT_EDEFAULT);
				return;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT:
				setInfoFormat(INFO_FORMAT_EDEFAULT);
				return;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT:
				setOtherAccessContext(OTHER_ACCESS_CONTEXT_EDEFAULT);
				return;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION:
				setOtherInfoFormatDescription(OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT);
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
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO:
				return ACCESS_INFO_EDEFAULT == null ? accessInfo != null : !ACCESS_INFO_EDEFAULT.equals(accessInfo);
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT:
				return accessContext != ACCESS_CONTEXT_EDEFAULT;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT:
				return infoFormat != INFO_FORMAT_EDEFAULT;
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT:
				return OTHER_ACCESS_CONTEXT_EDEFAULT == null ? otherAccessContext != null : !OTHER_ACCESS_CONTEXT_EDEFAULT.equals(otherAccessContext);
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION:
				return OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT == null ? otherInfoFormatDescription != null : !OTHER_INFO_FORMAT_DESCRIPTION_EDEFAULT.equals(otherInfoFormatDescription);
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
		result.append(" (accessInfo: ");
		result.append(accessInfo);
		result.append(", accessContext: ");
		result.append(accessContext);
		result.append(", infoFormat: ");
		result.append(infoFormat);
		result.append(", otherAccessContext: ");
		result.append(otherAccessContext);
		result.append(", otherInfoFormatDescription: ");
		result.append(otherInfoFormatDescription);
		result.append(')');
		return result.toString();
	}

} //RemoteServiceAccessPointImpl
