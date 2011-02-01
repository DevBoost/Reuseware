/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.GenericService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.GenericServiceImpl#getGenericProperties <em>Generic Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericServiceImpl extends ServiceImpl implements GenericService {
	/**
	 * The cached value of the '{@link #getGenericProperties() <em>Generic Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericProperties()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> genericProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getGenericService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getGenericProperties() {
		return genericProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericProperties(Map<String, String> newGenericProperties) {
		Map<String, String> oldGenericProperties = genericProperties;
		genericProperties = newGenericProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.GENERIC_SERVICE__GENERIC_PROPERTIES, oldGenericProperties, genericProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.GENERIC_SERVICE__GENERIC_PROPERTIES:
				return getGenericProperties();
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
			case CimPackage.GENERIC_SERVICE__GENERIC_PROPERTIES:
				setGenericProperties((Map<String, String>)newValue);
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
			case CimPackage.GENERIC_SERVICE__GENERIC_PROPERTIES:
				setGenericProperties((Map<String, String>)null);
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
			case CimPackage.GENERIC_SERVICE__GENERIC_PROPERTIES:
				return genericProperties != null;
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
		result.append(" (genericProperties: ");
		result.append(genericProperties);
		result.append(')');
		return result.toString();
	}

} //GenericServiceImpl
