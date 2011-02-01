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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.CimPackage;
import es.tid.cim.ComputerSystem;
import es.tid.cim.EnumDedicated;
import es.tid.cim.FilterList;
import es.tid.cim.ForwardingService;
import es.tid.cim.OperatingSystem;
import es.tid.cim.RouteCalculationService;
import es.tid.cim.RoutingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computer System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getIdentifyingDescriptions <em>Identifying Descriptions</em>}</li>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getDedicated <em>Dedicated</em>}</li>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getOtherDedicatedDescriptions <em>Other Dedicated Descriptions</em>}</li>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getResetCapability <em>Reset Capability</em>}</li>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getHostedRoutingServices <em>Hosted Routing Services</em>}</li>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getHostedForwardingServices <em>Hosted Forwarding Services</em>}</li>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getHostedRoutingPolicy <em>Hosted Routing Policy</em>}</li>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getHostedFilterList <em>Hosted Filter List</em>}</li>
 *   <li>{@link es.tid.cim.impl.ComputerSystemImpl#getRunningOS <em>Running OS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComputerSystemImpl extends SystemImpl implements ComputerSystem {
	/**
	 * The default value of the '{@link #getOtherIdentifyingInfo() <em>Other Identifying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_IDENTIFYING_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherIdentifyingInfo() <em>Other Identifying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected String otherIdentifyingInfo = OTHER_IDENTIFYING_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifyingDescriptions() <em>Identifying Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFYING_DESCRIPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifyingDescriptions() <em>Identifying Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingDescriptions()
	 * @generated
	 * @ordered
	 */
	protected String identifyingDescriptions = IDENTIFYING_DESCRIPTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDedicated() <em>Dedicated</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDedicated()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumDedicated> dedicated;

	/**
	 * The cached value of the '{@link #getOtherDedicatedDescriptions() <em>Other Dedicated Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDedicatedDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDedicatedDescriptions;

	/**
	 * The default value of the '{@link #getResetCapability() <em>Reset Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetCapability()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_CAPABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResetCapability() <em>Reset Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetCapability()
	 * @generated
	 * @ordered
	 */
	protected String resetCapability = RESET_CAPABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHostedRoutingServices() <em>Hosted Routing Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedRoutingServices()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteCalculationService> hostedRoutingServices;

	/**
	 * The cached value of the '{@link #getHostedForwardingServices() <em>Hosted Forwarding Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedForwardingServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ForwardingService> hostedForwardingServices;

	/**
	 * The cached value of the '{@link #getHostedRoutingPolicy() <em>Hosted Routing Policy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedRoutingPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<RoutingPolicy> hostedRoutingPolicy;

	/**
	 * The cached value of the '{@link #getHostedFilterList() <em>Hosted Filter List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedFilterList()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterList> hostedFilterList;

	/**
	 * The cached value of the '{@link #getRunningOS() <em>Running OS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningOS()
	 * @generated
	 * @ordered
	 */
	protected OperatingSystem runningOS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getComputerSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherIdentifyingInfo() {
		return otherIdentifyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherIdentifyingInfo(String newOtherIdentifyingInfo) {
		String oldOtherIdentifyingInfo = otherIdentifyingInfo;
		otherIdentifyingInfo = newOtherIdentifyingInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.COMPUTER_SYSTEM__OTHER_IDENTIFYING_INFO, oldOtherIdentifyingInfo, otherIdentifyingInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifyingDescriptions() {
		return identifyingDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifyingDescriptions(String newIdentifyingDescriptions) {
		String oldIdentifyingDescriptions = identifyingDescriptions;
		identifyingDescriptions = newIdentifyingDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.COMPUTER_SYSTEM__IDENTIFYING_DESCRIPTIONS, oldIdentifyingDescriptions, identifyingDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumDedicated> getDedicated() {
		if (dedicated == null) {
			dedicated = new EDataTypeUniqueEList<EnumDedicated>(EnumDedicated.class, this, CimPackage.COMPUTER_SYSTEM__DEDICATED);
		}
		return dedicated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOtherDedicatedDescriptions() {
		if (otherDedicatedDescriptions == null) {
			otherDedicatedDescriptions = new EDataTypeUniqueEList<String>(String.class, this, CimPackage.COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS);
		}
		return otherDedicatedDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResetCapability() {
		return resetCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetCapability(String newResetCapability) {
		String oldResetCapability = resetCapability;
		resetCapability = newResetCapability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.COMPUTER_SYSTEM__RESET_CAPABILITY, oldResetCapability, resetCapability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RouteCalculationService> getHostedRoutingServices() {
		if (hostedRoutingServices == null) {
			hostedRoutingServices = new EObjectResolvingEList<RouteCalculationService>(RouteCalculationService.class, this, CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_SERVICES);
		}
		return hostedRoutingServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForwardingService> getHostedForwardingServices() {
		if (hostedForwardingServices == null) {
			hostedForwardingServices = new EObjectResolvingEList<ForwardingService>(ForwardingService.class, this, CimPackage.COMPUTER_SYSTEM__HOSTED_FORWARDING_SERVICES);
		}
		return hostedForwardingServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoutingPolicy> getHostedRoutingPolicy() {
		if (hostedRoutingPolicy == null) {
			hostedRoutingPolicy = new EObjectResolvingEList<RoutingPolicy>(RoutingPolicy.class, this, CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_POLICY);
		}
		return hostedRoutingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterList> getHostedFilterList() {
		if (hostedFilterList == null) {
			hostedFilterList = new EObjectResolvingEList<FilterList>(FilterList.class, this, CimPackage.COMPUTER_SYSTEM__HOSTED_FILTER_LIST);
		}
		return hostedFilterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem getRunningOS() {
		if (runningOS != null && runningOS.eIsProxy()) {
			InternalEObject oldRunningOS = (InternalEObject)runningOS;
			runningOS = (OperatingSystem)eResolveProxy(oldRunningOS);
			if (runningOS != oldRunningOS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.COMPUTER_SYSTEM__RUNNING_OS, oldRunningOS, runningOS));
			}
		}
		return runningOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem basicGetRunningOS() {
		return runningOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunningOS(OperatingSystem newRunningOS) {
		OperatingSystem oldRunningOS = runningOS;
		runningOS = newRunningOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.COMPUTER_SYSTEM__RUNNING_OS, oldRunningOS, runningOS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.COMPUTER_SYSTEM__OTHER_IDENTIFYING_INFO:
				return getOtherIdentifyingInfo();
			case CimPackage.COMPUTER_SYSTEM__IDENTIFYING_DESCRIPTIONS:
				return getIdentifyingDescriptions();
			case CimPackage.COMPUTER_SYSTEM__DEDICATED:
				return getDedicated();
			case CimPackage.COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS:
				return getOtherDedicatedDescriptions();
			case CimPackage.COMPUTER_SYSTEM__RESET_CAPABILITY:
				return getResetCapability();
			case CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_SERVICES:
				return getHostedRoutingServices();
			case CimPackage.COMPUTER_SYSTEM__HOSTED_FORWARDING_SERVICES:
				return getHostedForwardingServices();
			case CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_POLICY:
				return getHostedRoutingPolicy();
			case CimPackage.COMPUTER_SYSTEM__HOSTED_FILTER_LIST:
				return getHostedFilterList();
			case CimPackage.COMPUTER_SYSTEM__RUNNING_OS:
				if (resolve) return getRunningOS();
				return basicGetRunningOS();
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
			case CimPackage.COMPUTER_SYSTEM__OTHER_IDENTIFYING_INFO:
				setOtherIdentifyingInfo((String)newValue);
				return;
			case CimPackage.COMPUTER_SYSTEM__IDENTIFYING_DESCRIPTIONS:
				setIdentifyingDescriptions((String)newValue);
				return;
			case CimPackage.COMPUTER_SYSTEM__DEDICATED:
				getDedicated().clear();
				getDedicated().addAll((Collection<? extends EnumDedicated>)newValue);
				return;
			case CimPackage.COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS:
				getOtherDedicatedDescriptions().clear();
				getOtherDedicatedDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.COMPUTER_SYSTEM__RESET_CAPABILITY:
				setResetCapability((String)newValue);
				return;
			case CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_SERVICES:
				getHostedRoutingServices().clear();
				getHostedRoutingServices().addAll((Collection<? extends RouteCalculationService>)newValue);
				return;
			case CimPackage.COMPUTER_SYSTEM__HOSTED_FORWARDING_SERVICES:
				getHostedForwardingServices().clear();
				getHostedForwardingServices().addAll((Collection<? extends ForwardingService>)newValue);
				return;
			case CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_POLICY:
				getHostedRoutingPolicy().clear();
				getHostedRoutingPolicy().addAll((Collection<? extends RoutingPolicy>)newValue);
				return;
			case CimPackage.COMPUTER_SYSTEM__HOSTED_FILTER_LIST:
				getHostedFilterList().clear();
				getHostedFilterList().addAll((Collection<? extends FilterList>)newValue);
				return;
			case CimPackage.COMPUTER_SYSTEM__RUNNING_OS:
				setRunningOS((OperatingSystem)newValue);
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
			case CimPackage.COMPUTER_SYSTEM__OTHER_IDENTIFYING_INFO:
				setOtherIdentifyingInfo(OTHER_IDENTIFYING_INFO_EDEFAULT);
				return;
			case CimPackage.COMPUTER_SYSTEM__IDENTIFYING_DESCRIPTIONS:
				setIdentifyingDescriptions(IDENTIFYING_DESCRIPTIONS_EDEFAULT);
				return;
			case CimPackage.COMPUTER_SYSTEM__DEDICATED:
				getDedicated().clear();
				return;
			case CimPackage.COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS:
				getOtherDedicatedDescriptions().clear();
				return;
			case CimPackage.COMPUTER_SYSTEM__RESET_CAPABILITY:
				setResetCapability(RESET_CAPABILITY_EDEFAULT);
				return;
			case CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_SERVICES:
				getHostedRoutingServices().clear();
				return;
			case CimPackage.COMPUTER_SYSTEM__HOSTED_FORWARDING_SERVICES:
				getHostedForwardingServices().clear();
				return;
			case CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_POLICY:
				getHostedRoutingPolicy().clear();
				return;
			case CimPackage.COMPUTER_SYSTEM__HOSTED_FILTER_LIST:
				getHostedFilterList().clear();
				return;
			case CimPackage.COMPUTER_SYSTEM__RUNNING_OS:
				setRunningOS((OperatingSystem)null);
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
			case CimPackage.COMPUTER_SYSTEM__OTHER_IDENTIFYING_INFO:
				return OTHER_IDENTIFYING_INFO_EDEFAULT == null ? otherIdentifyingInfo != null : !OTHER_IDENTIFYING_INFO_EDEFAULT.equals(otherIdentifyingInfo);
			case CimPackage.COMPUTER_SYSTEM__IDENTIFYING_DESCRIPTIONS:
				return IDENTIFYING_DESCRIPTIONS_EDEFAULT == null ? identifyingDescriptions != null : !IDENTIFYING_DESCRIPTIONS_EDEFAULT.equals(identifyingDescriptions);
			case CimPackage.COMPUTER_SYSTEM__DEDICATED:
				return dedicated != null && !dedicated.isEmpty();
			case CimPackage.COMPUTER_SYSTEM__OTHER_DEDICATED_DESCRIPTIONS:
				return otherDedicatedDescriptions != null && !otherDedicatedDescriptions.isEmpty();
			case CimPackage.COMPUTER_SYSTEM__RESET_CAPABILITY:
				return RESET_CAPABILITY_EDEFAULT == null ? resetCapability != null : !RESET_CAPABILITY_EDEFAULT.equals(resetCapability);
			case CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_SERVICES:
				return hostedRoutingServices != null && !hostedRoutingServices.isEmpty();
			case CimPackage.COMPUTER_SYSTEM__HOSTED_FORWARDING_SERVICES:
				return hostedForwardingServices != null && !hostedForwardingServices.isEmpty();
			case CimPackage.COMPUTER_SYSTEM__HOSTED_ROUTING_POLICY:
				return hostedRoutingPolicy != null && !hostedRoutingPolicy.isEmpty();
			case CimPackage.COMPUTER_SYSTEM__HOSTED_FILTER_LIST:
				return hostedFilterList != null && !hostedFilterList.isEmpty();
			case CimPackage.COMPUTER_SYSTEM__RUNNING_OS:
				return runningOS != null;
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
		result.append(" (otherIdentifyingInfo: ");
		result.append(otherIdentifyingInfo);
		result.append(", identifyingDescriptions: ");
		result.append(identifyingDescriptions);
		result.append(", dedicated: ");
		result.append(dedicated);
		result.append(", otherDedicatedDescriptions: ");
		result.append(otherDedicatedDescriptions);
		result.append(", resetCapability: ");
		result.append(resetCapability);
		result.append(')');
		return result.toString();
	}

} //ComputerSystemImpl
