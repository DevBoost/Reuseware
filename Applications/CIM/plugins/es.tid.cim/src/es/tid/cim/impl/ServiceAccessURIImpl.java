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
import es.tid.cim.ServiceAccessURI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Access URI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ServiceAccessURIImpl#getLabeledURI <em>Labeled URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceAccessURIImpl extends ServiceAccessPointImpl implements ServiceAccessURI {
	/**
	 * The default value of the '{@link #getLabeledURI() <em>Labeled URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeledURI()
	 * @generated
	 * @ordered
	 */
	protected static final String LABELED_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabeledURI() <em>Labeled URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeledURI()
	 * @generated
	 * @ordered
	 */
	protected String labeledURI = LABELED_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceAccessURIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getServiceAccessURI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabeledURI() {
		return labeledURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabeledURI(String newLabeledURI) {
		String oldLabeledURI = labeledURI;
		labeledURI = newLabeledURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.SERVICE_ACCESS_URI__LABELED_URI, oldLabeledURI, labeledURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.SERVICE_ACCESS_URI__LABELED_URI:
				return getLabeledURI();
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
			case CimPackage.SERVICE_ACCESS_URI__LABELED_URI:
				setLabeledURI((String)newValue);
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
			case CimPackage.SERVICE_ACCESS_URI__LABELED_URI:
				setLabeledURI(LABELED_URI_EDEFAULT);
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
			case CimPackage.SERVICE_ACCESS_URI__LABELED_URI:
				return LABELED_URI_EDEFAULT == null ? labeledURI != null : !LABELED_URI_EDEFAULT.equals(labeledURI);
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
		result.append(" (labeledURI: ");
		result.append(labeledURI);
		result.append(')');
		return result.toString();
	}

} //ServiceAccessURIImpl
