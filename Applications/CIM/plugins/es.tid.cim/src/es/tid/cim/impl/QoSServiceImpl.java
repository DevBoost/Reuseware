/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.tid.cim.CimPackage;
import es.tid.cim.ConditioningService;
import es.tid.cim.QoSService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo SService</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.QoSServiceImpl#getQoSSubService <em>Qo SSub Service</em>}</li>
 *   <li>{@link es.tid.cim.impl.QoSServiceImpl#getQoSConditioningSubService <em>Qo SConditioning Sub Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QoSServiceImpl extends ServiceImpl implements QoSService {
	/**
	 * The cached value of the '{@link #getQoSSubService() <em>Qo SSub Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQoSSubService()
	 * @generated
	 * @ordered
	 */
	protected EList<QoSService> qoSSubService;

	/**
	 * The cached value of the '{@link #getQoSConditioningSubService() <em>Qo SConditioning Sub Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQoSConditioningSubService()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditioningService> qoSConditioningSubService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getQoSService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoSService> getQoSSubService() {
		if (qoSSubService == null) {
			qoSSubService = new EObjectContainmentEList<QoSService>(QoSService.class, this, CimPackage.QO_SSERVICE__QO_SSUB_SERVICE);
		}
		return qoSSubService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditioningService> getQoSConditioningSubService() {
		if (qoSConditioningSubService == null) {
			qoSConditioningSubService = new EObjectContainmentEList<ConditioningService>(ConditioningService.class, this, CimPackage.QO_SSERVICE__QO_SCONDITIONING_SUB_SERVICE);
		}
		return qoSConditioningSubService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.QO_SSERVICE__QO_SSUB_SERVICE:
				return ((InternalEList<?>)getQoSSubService()).basicRemove(otherEnd, msgs);
			case CimPackage.QO_SSERVICE__QO_SCONDITIONING_SUB_SERVICE:
				return ((InternalEList<?>)getQoSConditioningSubService()).basicRemove(otherEnd, msgs);
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
			case CimPackage.QO_SSERVICE__QO_SSUB_SERVICE:
				return getQoSSubService();
			case CimPackage.QO_SSERVICE__QO_SCONDITIONING_SUB_SERVICE:
				return getQoSConditioningSubService();
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
			case CimPackage.QO_SSERVICE__QO_SSUB_SERVICE:
				getQoSSubService().clear();
				getQoSSubService().addAll((Collection<? extends QoSService>)newValue);
				return;
			case CimPackage.QO_SSERVICE__QO_SCONDITIONING_SUB_SERVICE:
				getQoSConditioningSubService().clear();
				getQoSConditioningSubService().addAll((Collection<? extends ConditioningService>)newValue);
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
			case CimPackage.QO_SSERVICE__QO_SSUB_SERVICE:
				getQoSSubService().clear();
				return;
			case CimPackage.QO_SSERVICE__QO_SCONDITIONING_SUB_SERVICE:
				getQoSConditioningSubService().clear();
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
			case CimPackage.QO_SSERVICE__QO_SSUB_SERVICE:
				return qoSSubService != null && !qoSSubService.isEmpty();
			case CimPackage.QO_SSERVICE__QO_SCONDITIONING_SUB_SERVICE:
				return qoSConditioningSubService != null && !qoSConditioningSubService.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QoSServiceImpl
