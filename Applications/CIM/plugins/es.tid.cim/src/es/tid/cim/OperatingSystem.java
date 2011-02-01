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
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.OperatingSystem#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.OperatingSystem#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.OperatingSystem#getCSName <em>CS Name</em>}</li>
 *   <li>{@link es.tid.cim.OperatingSystem#getOperatingSystemSoftwareFeature <em>Operating System Software Feature</em>}</li>
 *   <li>{@link es.tid.cim.OperatingSystem#getOSType <em>OS Type</em>}</li>
 *   <li>{@link es.tid.cim.OperatingSystem#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link es.tid.cim.OperatingSystem#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see es.tid.cim.CimPackage#getOperatingSystem_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.OperatingSystem#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS Creation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see es.tid.cim.CimPackage#getOperatingSystem_CSCreationClassName()
	 * @model
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.OperatingSystem#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #getCSCreationClassName()
	 * @generated
	 */
	void setCSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>CS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS Name</em>' attribute.
	 * @see #setCSName(String)
	 * @see es.tid.cim.CimPackage#getOperatingSystem_CSName()
	 * @model
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link es.tid.cim.OperatingSystem#getCSName <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Name</em>' attribute.
	 * @see #getCSName()
	 * @generated
	 */
	void setCSName(String value);

	/**
	 * Returns the value of the '<em><b>Operating System Software Feature</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.SoftwareFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operating System Software Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System Software Feature</em>' reference list.
	 * @see es.tid.cim.CimPackage#getOperatingSystem_OperatingSystemSoftwareFeature()
	 * @model
	 * @generated
	 */
	EList<SoftwareFeature> getOperatingSystemSoftwareFeature();

	/**
	 * Returns the value of the '<em><b>OS Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumTargetOSTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS Type</em>' attribute.
	 * @see es.tid.cim.EnumTargetOSTypes
	 * @see #setOSType(EnumTargetOSTypes)
	 * @see es.tid.cim.CimPackage#getOperatingSystem_OSType()
	 * @model
	 * @generated
	 */
	EnumTargetOSTypes getOSType();

	/**
	 * Sets the value of the '{@link es.tid.cim.OperatingSystem#getOSType <em>OS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Type</em>' attribute.
	 * @see es.tid.cim.EnumTargetOSTypes
	 * @see #getOSType()
	 * @generated
	 */
	void setOSType(EnumTargetOSTypes value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Type Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see es.tid.cim.CimPackage#getOperatingSystem_OtherTypeDescription()
	 * @model
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.OperatingSystem#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see es.tid.cim.CimPackage#getOperatingSystem_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.OperatingSystem#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // OperatingSystem
