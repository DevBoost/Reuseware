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
 * A representation of the model object '<em><b>Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.SettingData#getChangeableType <em>Changeable Type</em>}</li>
 *   <li>{@link es.tid.cim.SettingData#getConfigurationName <em>Configuration Name</em>}</li>
 *   <li>{@link es.tid.cim.SettingData#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link es.tid.cim.SettingData#getSettingsDefineCapabilities <em>Settings Define Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSettingData()
 * @model abstract="true"
 * @generated
 */
public interface SettingData extends ManagedElement {
	/**
	 * Returns the value of the '<em><b>Changeable Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumChangeableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable Type</em>' attribute.
	 * @see es.tid.cim.EnumChangeableType
	 * @see #setChangeableType(EnumChangeableType)
	 * @see es.tid.cim.CimPackage#getSettingData_ChangeableType()
	 * @model
	 * @generated
	 */
	EnumChangeableType getChangeableType();

	/**
	 * Sets the value of the '{@link es.tid.cim.SettingData#getChangeableType <em>Changeable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable Type</em>' attribute.
	 * @see es.tid.cim.EnumChangeableType
	 * @see #getChangeableType()
	 * @generated
	 */
	void setChangeableType(EnumChangeableType value);

	/**
	 * Returns the value of the '<em><b>Configuration Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Name</em>' attribute.
	 * @see #setConfigurationName(String)
	 * @see es.tid.cim.CimPackage#getSettingData_ConfigurationName()
	 * @model
	 * @generated
	 */
	String getConfigurationName();

	/**
	 * Sets the value of the '{@link es.tid.cim.SettingData#getConfigurationName <em>Configuration Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Name</em>' attribute.
	 * @see #getConfigurationName()
	 * @generated
	 */
	void setConfigurationName(String value);

	/**
	 * Returns the value of the '<em><b>Instance ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance ID</em>' attribute.
	 * @see #setInstanceID(String)
	 * @see es.tid.cim.CimPackage#getSettingData_InstanceID()
	 * @model
	 * @generated
	 */
	String getInstanceID();

	/**
	 * Sets the value of the '{@link es.tid.cim.SettingData#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Settings Define Capabilities</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.Capabilities}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings Define Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings Define Capabilities</em>' reference list.
	 * @see es.tid.cim.CimPackage#getSettingData_SettingsDefineCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capabilities> getSettingsDefineCapabilities();

} // SettingData
