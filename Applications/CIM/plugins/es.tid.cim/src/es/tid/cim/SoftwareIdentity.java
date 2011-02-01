/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getBuildNumber <em>Build Number</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getElementSoftwareIdentity <em>Element Software Identity</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getExtendedResourceType <em>Extended Resource Type</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getInstanceID <em>Instance ID</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#isIsEntity <em>Is Entity</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getMinExtendedResourceTypeBuildNumber <em>Min Extended Resource Type Build Number</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getMinExtendedResourceTypeMajorVersion <em>Min Extended Resource Type Major Version</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getMinExtendedResourceTypeMinorVersion <em>Min Extended Resource Type Minor Version</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getMinExtendedResourceTypeRevisionNumber <em>Min Extended Resource Type Revision Number</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getOtherExtendedResourceTypeDescription <em>Other Extended Resource Type Description</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getVersionString <em>Version String</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getClassificationDescriptions <em>Classification Descriptions</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getIdentityInfoType <em>Identity Info Type</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getIdentityInfoValue <em>Identity Info Value</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getTargetOperatingSystems <em>Target Operating Systems</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getTargetOSTypes <em>Target OS Types</em>}</li>
 *   <li>{@link es.tid.cim.SoftwareIdentity#getTargetTypes <em>Target Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSoftwareIdentity()
 * @model
 * @generated
 */
public interface SoftwareIdentity extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Number</em>' attribute.
	 * @see #setBuildNumber(int)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_BuildNumber()
	 * @model
	 * @generated
	 */
	int getBuildNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getBuildNumber <em>Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Number</em>' attribute.
	 * @see #getBuildNumber()
	 * @generated
	 */
	void setBuildNumber(int value);

	/**
	 * Returns the value of the '<em><b>Element Software Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Software Identity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Software Identity</em>' reference.
	 * @see #setElementSoftwareIdentity(ElementSoftwareIdentity)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_ElementSoftwareIdentity()
	 * @model
	 * @generated
	 */
	ElementSoftwareIdentity getElementSoftwareIdentity();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getElementSoftwareIdentity <em>Element Software Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Software Identity</em>' reference.
	 * @see #getElementSoftwareIdentity()
	 * @generated
	 */
	void setElementSoftwareIdentity(ElementSoftwareIdentity value);

	/**
	 * Returns the value of the '<em><b>Extended Resource Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumExtendedResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Resource Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Resource Type</em>' attribute.
	 * @see es.tid.cim.EnumExtendedResourceType
	 * @see #setExtendedResourceType(EnumExtendedResourceType)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_ExtendedResourceType()
	 * @model
	 * @generated
	 */
	EnumExtendedResourceType getExtendedResourceType();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getExtendedResourceType <em>Extended Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Resource Type</em>' attribute.
	 * @see es.tid.cim.EnumExtendedResourceType
	 * @see #getExtendedResourceType()
	 * @generated
	 */
	void setExtendedResourceType(EnumExtendedResourceType value);

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
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_InstanceID()
	 * @model
	 * @generated
	 */
	String getInstanceID();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getInstanceID <em>Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance ID</em>' attribute.
	 * @see #getInstanceID()
	 * @generated
	 */
	void setInstanceID(String value);

	/**
	 * Returns the value of the '<em><b>Is Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Entity</em>' attribute.
	 * @see #setIsEntity(boolean)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_IsEntity()
	 * @model
	 * @generated
	 */
	boolean isIsEntity();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#isIsEntity <em>Is Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Entity</em>' attribute.
	 * @see #isIsEntity()
	 * @generated
	 */
	void setIsEntity(boolean value);

	/**
	 * Returns the value of the '<em><b>Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major Version</em>' attribute.
	 * @see #setMajorVersion(int)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_MajorVersion()
	 * @model
	 * @generated
	 */
	int getMajorVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getMajorVersion <em>Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major Version</em>' attribute.
	 * @see #getMajorVersion()
	 * @generated
	 */
	void setMajorVersion(int value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_Manufacturer()
	 * @model
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Min Extended Resource Type Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Extended Resource Type Build Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Extended Resource Type Build Number</em>' attribute.
	 * @see #setMinExtendedResourceTypeBuildNumber(int)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_MinExtendedResourceTypeBuildNumber()
	 * @model
	 * @generated
	 */
	int getMinExtendedResourceTypeBuildNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getMinExtendedResourceTypeBuildNumber <em>Min Extended Resource Type Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Extended Resource Type Build Number</em>' attribute.
	 * @see #getMinExtendedResourceTypeBuildNumber()
	 * @generated
	 */
	void setMinExtendedResourceTypeBuildNumber(int value);

	/**
	 * Returns the value of the '<em><b>Min Extended Resource Type Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Extended Resource Type Major Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Extended Resource Type Major Version</em>' attribute.
	 * @see #setMinExtendedResourceTypeMajorVersion(int)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_MinExtendedResourceTypeMajorVersion()
	 * @model
	 * @generated
	 */
	int getMinExtendedResourceTypeMajorVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getMinExtendedResourceTypeMajorVersion <em>Min Extended Resource Type Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Extended Resource Type Major Version</em>' attribute.
	 * @see #getMinExtendedResourceTypeMajorVersion()
	 * @generated
	 */
	void setMinExtendedResourceTypeMajorVersion(int value);

	/**
	 * Returns the value of the '<em><b>Min Extended Resource Type Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Extended Resource Type Minor Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Extended Resource Type Minor Version</em>' attribute.
	 * @see #setMinExtendedResourceTypeMinorVersion(int)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_MinExtendedResourceTypeMinorVersion()
	 * @model
	 * @generated
	 */
	int getMinExtendedResourceTypeMinorVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getMinExtendedResourceTypeMinorVersion <em>Min Extended Resource Type Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Extended Resource Type Minor Version</em>' attribute.
	 * @see #getMinExtendedResourceTypeMinorVersion()
	 * @generated
	 */
	void setMinExtendedResourceTypeMinorVersion(int value);

	/**
	 * Returns the value of the '<em><b>Min Extended Resource Type Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Extended Resource Type Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Extended Resource Type Revision Number</em>' attribute.
	 * @see #setMinExtendedResourceTypeRevisionNumber(int)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_MinExtendedResourceTypeRevisionNumber()
	 * @model
	 * @generated
	 */
	int getMinExtendedResourceTypeRevisionNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getMinExtendedResourceTypeRevisionNumber <em>Min Extended Resource Type Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Extended Resource Type Revision Number</em>' attribute.
	 * @see #getMinExtendedResourceTypeRevisionNumber()
	 * @generated
	 */
	void setMinExtendedResourceTypeRevisionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor Version</em>' attribute.
	 * @see #setMinorVersion(int)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_MinorVersion()
	 * @model
	 * @generated
	 */
	int getMinorVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getMinorVersion <em>Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor Version</em>' attribute.
	 * @see #getMinorVersion()
	 * @generated
	 */
	void setMinorVersion(int value);

	/**
	 * Returns the value of the '<em><b>Other Extended Resource Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Extended Resource Type Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Extended Resource Type Description</em>' attribute.
	 * @see #setOtherExtendedResourceTypeDescription(String)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_OtherExtendedResourceTypeDescription()
	 * @model
	 * @generated
	 */
	String getOtherExtendedResourceTypeDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getOtherExtendedResourceTypeDescription <em>Other Extended Resource Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Extended Resource Type Description</em>' attribute.
	 * @see #getOtherExtendedResourceTypeDescription()
	 * @generated
	 */
	void setOtherExtendedResourceTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_ReleaseDate()
	 * @model
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #setRevisionNumber(int)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_RevisionNumber()
	 * @model
	 * @generated
	 */
	int getRevisionNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version String</em>' attribute.
	 * @see #setVersionString(String)
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_VersionString()
	 * @model
	 * @generated
	 */
	String getVersionString();

	/**
	 * Sets the value of the '{@link es.tid.cim.SoftwareIdentity#getVersionString <em>Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version String</em>' attribute.
	 * @see #getVersionString()
	 * @generated
	 */
	void setVersionString(String value);

	/**
	 * Returns the value of the '<em><b>Classification Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Descriptions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Descriptions</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_ClassificationDescriptions()
	 * @model
	 * @generated
	 */
	EList<String> getClassificationDescriptions();

	/**
	 * Returns the value of the '<em><b>Identity Info Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity Info Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Info Type</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_IdentityInfoType()
	 * @model
	 * @generated
	 */
	EList<String> getIdentityInfoType();

	/**
	 * Returns the value of the '<em><b>Identity Info Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity Info Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity Info Value</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_IdentityInfoValue()
	 * @model
	 * @generated
	 */
	EList<String> getIdentityInfoValue();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_Languages()
	 * @model
	 * @generated
	 */
	EList<String> getLanguages();

	/**
	 * Returns the value of the '<em><b>Target Operating Systems</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Operating Systems</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Operating Systems</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_TargetOperatingSystems()
	 * @model
	 * @generated
	 */
	EList<String> getTargetOperatingSystems();

	/**
	 * Returns the value of the '<em><b>Target OS Types</b></em>' attribute list.
	 * The list contents are of type {@link es.tid.cim.EnumTargetOSTypes}.
	 * The literals are from the enumeration {@link es.tid.cim.EnumTargetOSTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target OS Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target OS Types</em>' attribute list.
	 * @see es.tid.cim.EnumTargetOSTypes
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_TargetOSTypes()
	 * @model
	 * @generated
	 */
	EList<EnumTargetOSTypes> getTargetOSTypes();

	/**
	 * Returns the value of the '<em><b>Target Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Types</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getSoftwareIdentity_TargetTypes()
	 * @model
	 * @generated
	 */
	EList<String> getTargetTypes();

} // SoftwareIdentity
