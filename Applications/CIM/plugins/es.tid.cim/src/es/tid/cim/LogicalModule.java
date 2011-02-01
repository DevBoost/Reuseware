/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.LogicalModule#getModuleNumber <em>Module Number</em>}</li>
 *   <li>{@link es.tid.cim.LogicalModule#getLogicalModuleType <em>Logical Module Type</em>}</li>
 *   <li>{@link es.tid.cim.LogicalModule#getOtherLogicalModuleTypeDescription <em>Other Logical Module Type Description</em>}</li>
 *   <li>{@link es.tid.cim.LogicalModule#getModulePort <em>Module Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getLogicalModule()
 * @model
 * @generated
 */
public interface LogicalModule extends LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Module Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Number</em>' attribute.
	 * @see #setModuleNumber(int)
	 * @see es.tid.cim.CimPackage#getLogicalModule_ModuleNumber()
	 * @model
	 * @generated
	 */
	int getModuleNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalModule#getModuleNumber <em>Module Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Number</em>' attribute.
	 * @see #getModuleNumber()
	 * @generated
	 */
	void setModuleNumber(int value);

	/**
	 * Returns the value of the '<em><b>Logical Module Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumLogicalModuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Module Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Module Type</em>' attribute.
	 * @see es.tid.cim.EnumLogicalModuleType
	 * @see #setLogicalModuleType(EnumLogicalModuleType)
	 * @see es.tid.cim.CimPackage#getLogicalModule_LogicalModuleType()
	 * @model
	 * @generated
	 */
	EnumLogicalModuleType getLogicalModuleType();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalModule#getLogicalModuleType <em>Logical Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Module Type</em>' attribute.
	 * @see es.tid.cim.EnumLogicalModuleType
	 * @see #getLogicalModuleType()
	 * @generated
	 */
	void setLogicalModuleType(EnumLogicalModuleType value);

	/**
	 * Returns the value of the '<em><b>Other Logical Module Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Logical Module Type Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Logical Module Type Description</em>' attribute.
	 * @see #setOtherLogicalModuleTypeDescription(String)
	 * @see es.tid.cim.CimPackage#getLogicalModule_OtherLogicalModuleTypeDescription()
	 * @model
	 * @generated
	 */
	String getOtherLogicalModuleTypeDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.LogicalModule#getOtherLogicalModuleTypeDescription <em>Other Logical Module Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Logical Module Type Description</em>' attribute.
	 * @see #getOtherLogicalModuleTypeDescription()
	 * @generated
	 */
	void setOtherLogicalModuleTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Module Port</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.NetworkPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Port</em>' reference list.
	 * @see es.tid.cim.CimPackage#getLogicalModule_ModulePort()
	 * @model
	 * @generated
	 */
	EList<NetworkPort> getModulePort();

} // LogicalModule
