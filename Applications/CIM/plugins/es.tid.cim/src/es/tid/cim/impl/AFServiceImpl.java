/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.AFService;
import es.tid.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AF Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.AFServiceImpl#getClassNumber <em>Class Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.AFServiceImpl#getDropperNumber <em>Dropper Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.AFServiceImpl#getAFRelatedServices <em>AF Related Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AFServiceImpl extends DiffServServiceImpl implements AFService {
	/**
	 * The default value of the '{@link #getClassNumber() <em>Class Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CLASS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClassNumber() <em>Class Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNumber()
	 * @generated
	 * @ordered
	 */
	protected int classNumber = CLASS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDropperNumber() <em>Dropper Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropperNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int DROPPER_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDropperNumber() <em>Dropper Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropperNumber()
	 * @generated
	 * @ordered
	 */
	protected int dropperNumber = DROPPER_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAFRelatedServices() <em>AF Related Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFRelatedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<AFService> afRelatedServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getAFService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClassNumber() {
		return classNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassNumber(int newClassNumber) {
		int oldClassNumber = classNumber;
		classNumber = newClassNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.AF_SERVICE__CLASS_NUMBER, oldClassNumber, classNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDropperNumber() {
		return dropperNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropperNumber(int newDropperNumber) {
		int oldDropperNumber = dropperNumber;
		dropperNumber = newDropperNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.AF_SERVICE__DROPPER_NUMBER, oldDropperNumber, dropperNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AFService> getAFRelatedServices() {
		if (afRelatedServices == null) {
			afRelatedServices = new EObjectResolvingEList<AFService>(AFService.class, this, CimPackage.AF_SERVICE__AF_RELATED_SERVICES);
		}
		return afRelatedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.AF_SERVICE__CLASS_NUMBER:
				return getClassNumber();
			case CimPackage.AF_SERVICE__DROPPER_NUMBER:
				return getDropperNumber();
			case CimPackage.AF_SERVICE__AF_RELATED_SERVICES:
				return getAFRelatedServices();
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
			case CimPackage.AF_SERVICE__CLASS_NUMBER:
				setClassNumber((Integer)newValue);
				return;
			case CimPackage.AF_SERVICE__DROPPER_NUMBER:
				setDropperNumber((Integer)newValue);
				return;
			case CimPackage.AF_SERVICE__AF_RELATED_SERVICES:
				getAFRelatedServices().clear();
				getAFRelatedServices().addAll((Collection<? extends AFService>)newValue);
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
			case CimPackage.AF_SERVICE__CLASS_NUMBER:
				setClassNumber(CLASS_NUMBER_EDEFAULT);
				return;
			case CimPackage.AF_SERVICE__DROPPER_NUMBER:
				setDropperNumber(DROPPER_NUMBER_EDEFAULT);
				return;
			case CimPackage.AF_SERVICE__AF_RELATED_SERVICES:
				getAFRelatedServices().clear();
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
			case CimPackage.AF_SERVICE__CLASS_NUMBER:
				return classNumber != CLASS_NUMBER_EDEFAULT;
			case CimPackage.AF_SERVICE__DROPPER_NUMBER:
				return dropperNumber != DROPPER_NUMBER_EDEFAULT;
			case CimPackage.AF_SERVICE__AF_RELATED_SERVICES:
				return afRelatedServices != null && !afRelatedServices.isEmpty();
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
		result.append(" (classNumber: ");
		result.append(classNumber);
		result.append(", dropperNumber: ");
		result.append(dropperNumber);
		result.append(')');
		return result.toString();
	}

} //AFServiceImpl
