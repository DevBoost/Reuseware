/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Software Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ElementSoftwareIdentity#getElementSoftwareStatus <em>Element Software Status</em>}</li>
 *   <li>{@link es.tid.cim.ElementSoftwareIdentity#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link es.tid.cim.ElementSoftwareIdentity#getOtherUpgradeCondition <em>Other Upgrade Condition</em>}</li>
 *   <li>{@link es.tid.cim.ElementSoftwareIdentity#getUpgradeCondition <em>Upgrade Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getElementSoftwareIdentity()
 * @model
 * @generated
 */
public interface ElementSoftwareIdentity extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Software Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumElementSoftwareStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Software Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Software Status</em>' attribute.
	 * @see es.tid.cim.EnumElementSoftwareStatus
	 * @see #setElementSoftwareStatus(EnumElementSoftwareStatus)
	 * @see es.tid.cim.CimPackage#getElementSoftwareIdentity_ElementSoftwareStatus()
	 * @model
	 * @generated
	 */
	EnumElementSoftwareStatus getElementSoftwareStatus();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSoftwareIdentity#getElementSoftwareStatus <em>Element Software Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Software Status</em>' attribute.
	 * @see es.tid.cim.EnumElementSoftwareStatus
	 * @see #getElementSoftwareStatus()
	 * @generated
	 */
	void setElementSoftwareStatus(EnumElementSoftwareStatus value);

	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(ManagedElement)
	 * @see es.tid.cim.CimPackage#getElementSoftwareIdentity_ManagedElement()
	 * @model required="true"
	 * @generated
	 */
	ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSoftwareIdentity#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Other Upgrade Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Upgrade Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Upgrade Condition</em>' attribute.
	 * @see #setOtherUpgradeCondition(String)
	 * @see es.tid.cim.CimPackage#getElementSoftwareIdentity_OtherUpgradeCondition()
	 * @model
	 * @generated
	 */
	String getOtherUpgradeCondition();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSoftwareIdentity#getOtherUpgradeCondition <em>Other Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Upgrade Condition</em>' attribute.
	 * @see #getOtherUpgradeCondition()
	 * @generated
	 */
	void setOtherUpgradeCondition(String value);

	/**
	 * Returns the value of the '<em><b>Upgrade Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumUpgradeCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upgrade Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upgrade Condition</em>' attribute.
	 * @see es.tid.cim.EnumUpgradeCondition
	 * @see #setUpgradeCondition(EnumUpgradeCondition)
	 * @see es.tid.cim.CimPackage#getElementSoftwareIdentity_UpgradeCondition()
	 * @model
	 * @generated
	 */
	EnumUpgradeCondition getUpgradeCondition();

	/**
	 * Sets the value of the '{@link es.tid.cim.ElementSoftwareIdentity#getUpgradeCondition <em>Upgrade Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upgrade Condition</em>' attribute.
	 * @see es.tid.cim.EnumUpgradeCondition
	 * @see #getUpgradeCondition()
	 * @generated
	 */
	void setUpgradeCondition(EnumUpgradeCondition value);

} // ElementSoftwareIdentity
