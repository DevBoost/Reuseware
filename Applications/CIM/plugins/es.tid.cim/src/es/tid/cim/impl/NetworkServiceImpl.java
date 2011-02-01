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
import es.tid.cim.NetworkService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NetworkServiceImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkServiceImpl#getServiceURL <em>Service URL</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkServiceImpl#getStartupConditions <em>Startup Conditions</em>}</li>
 *   <li>{@link es.tid.cim.impl.NetworkServiceImpl#getStartupParameters <em>Startup Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NetworkServiceImpl extends ServiceImpl implements NetworkService {
	/**
	 * The default value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected String keywords = KEYWORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceURL() <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceURL() <em>Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceURL()
	 * @generated
	 * @ordered
	 */
	protected String serviceURL = SERVICE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupConditions() <em>Startup Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupConditions()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTUP_CONDITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartupConditions() <em>Startup Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupConditions()
	 * @generated
	 * @ordered
	 */
	protected String startupConditions = STARTUP_CONDITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupParameters() <em>Startup Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTUP_PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartupParameters() <em>Startup Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupParameters()
	 * @generated
	 * @ordered
	 */
	protected String startupParameters = STARTUP_PARAMETERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNetworkService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywords(String newKeywords) {
		String oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_SERVICE__KEYWORDS, oldKeywords, keywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceURL() {
		return serviceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceURL(String newServiceURL) {
		String oldServiceURL = serviceURL;
		serviceURL = newServiceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_SERVICE__SERVICE_URL, oldServiceURL, serviceURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartupConditions() {
		return startupConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupConditions(String newStartupConditions) {
		String oldStartupConditions = startupConditions;
		startupConditions = newStartupConditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_SERVICE__STARTUP_CONDITIONS, oldStartupConditions, startupConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartupParameters() {
		return startupParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupParameters(String newStartupParameters) {
		String oldStartupParameters = startupParameters;
		startupParameters = newStartupParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NETWORK_SERVICE__STARTUP_PARAMETERS, oldStartupParameters, startupParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NETWORK_SERVICE__KEYWORDS:
				return getKeywords();
			case CimPackage.NETWORK_SERVICE__SERVICE_URL:
				return getServiceURL();
			case CimPackage.NETWORK_SERVICE__STARTUP_CONDITIONS:
				return getStartupConditions();
			case CimPackage.NETWORK_SERVICE__STARTUP_PARAMETERS:
				return getStartupParameters();
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
			case CimPackage.NETWORK_SERVICE__KEYWORDS:
				setKeywords((String)newValue);
				return;
			case CimPackage.NETWORK_SERVICE__SERVICE_URL:
				setServiceURL((String)newValue);
				return;
			case CimPackage.NETWORK_SERVICE__STARTUP_CONDITIONS:
				setStartupConditions((String)newValue);
				return;
			case CimPackage.NETWORK_SERVICE__STARTUP_PARAMETERS:
				setStartupParameters((String)newValue);
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
			case CimPackage.NETWORK_SERVICE__KEYWORDS:
				setKeywords(KEYWORDS_EDEFAULT);
				return;
			case CimPackage.NETWORK_SERVICE__SERVICE_URL:
				setServiceURL(SERVICE_URL_EDEFAULT);
				return;
			case CimPackage.NETWORK_SERVICE__STARTUP_CONDITIONS:
				setStartupConditions(STARTUP_CONDITIONS_EDEFAULT);
				return;
			case CimPackage.NETWORK_SERVICE__STARTUP_PARAMETERS:
				setStartupParameters(STARTUP_PARAMETERS_EDEFAULT);
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
			case CimPackage.NETWORK_SERVICE__KEYWORDS:
				return KEYWORDS_EDEFAULT == null ? keywords != null : !KEYWORDS_EDEFAULT.equals(keywords);
			case CimPackage.NETWORK_SERVICE__SERVICE_URL:
				return SERVICE_URL_EDEFAULT == null ? serviceURL != null : !SERVICE_URL_EDEFAULT.equals(serviceURL);
			case CimPackage.NETWORK_SERVICE__STARTUP_CONDITIONS:
				return STARTUP_CONDITIONS_EDEFAULT == null ? startupConditions != null : !STARTUP_CONDITIONS_EDEFAULT.equals(startupConditions);
			case CimPackage.NETWORK_SERVICE__STARTUP_PARAMETERS:
				return STARTUP_PARAMETERS_EDEFAULT == null ? startupParameters != null : !STARTUP_PARAMETERS_EDEFAULT.equals(startupParameters);
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
		result.append(" (keywords: ");
		result.append(keywords);
		result.append(", serviceURL: ");
		result.append(serviceURL);
		result.append(", startupConditions: ");
		result.append(startupConditions);
		result.append(", startupParameters: ");
		result.append(startupParameters);
		result.append(')');
		return result.toString();
	}

} //NetworkServiceImpl
