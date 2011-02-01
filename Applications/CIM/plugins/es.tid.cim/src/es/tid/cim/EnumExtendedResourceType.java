/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Extended Resource Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumExtendedResourceType()
 * @model
 * @generated
 */
public enum EnumExtendedResourceType implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(1, "Other", "Other"),

	/**
	 * The '<em><b>Not Applicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(2, "NotApplicable", "Not Applicable"),

	/**
	 * The '<em><b>Linux RPM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_RPM_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX_RPM(3, "LinuxRPM", "Linux RPM"),

	/**
	 * The '<em><b>HP UX Depot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP_UX_DEPOT_VALUE
	 * @generated
	 * @ordered
	 */
	HP_UX_DEPOT(4, "HP_UXDepot", "HP_UXDepot"),

	/**
	 * The '<em><b>Windows MSI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_MSI_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS_MSI(5, "WindowsMSI", "Windows MSI"),

	/**
	 * The '<em><b>Solaris Package</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS_PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS_PACKAGE(6, "SolarisPackage", "Solaris Package"),

	/**
	 * The '<em><b>Macintosh Disk Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACINTOSH_DISK_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MACINTOSH_DISK_IMAGE(7, "MacintoshDiskImage", "Macintosh Disk Image"),

	/**
	 * The '<em><b>Debianlinux Package</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIANLINUX_PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIANLINUX_PACKAGE(8, "DebianlinuxPackage", "Debian linux Package");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>Not Applicable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Applicable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE
	 * @model name="NotApplicable" literal="Not Applicable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_APPLICABLE_VALUE = 2;

	/**
	 * The '<em><b>Linux RPM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linux RPM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINUX_RPM
	 * @model name="LinuxRPM" literal="Linux RPM"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_RPM_VALUE = 3;

	/**
	 * The '<em><b>HP UX Depot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HP UX Depot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HP_UX_DEPOT
	 * @model name="HP_UXDepot"
	 * @generated
	 * @ordered
	 */
	public static final int HP_UX_DEPOT_VALUE = 4;

	/**
	 * The '<em><b>Windows MSI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows MSI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_MSI
	 * @model name="WindowsMSI" literal="Windows MSI"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_MSI_VALUE = 5;

	/**
	 * The '<em><b>Solaris Package</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris Package</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS_PACKAGE
	 * @model name="SolarisPackage" literal="Solaris Package"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS_PACKAGE_VALUE = 6;

	/**
	 * The '<em><b>Macintosh Disk Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Macintosh Disk Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACINTOSH_DISK_IMAGE
	 * @model name="MacintoshDiskImage" literal="Macintosh Disk Image"
	 * @generated
	 * @ordered
	 */
	public static final int MACINTOSH_DISK_IMAGE_VALUE = 7;

	/**
	 * The '<em><b>Debianlinux Package</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Debianlinux Package</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEBIANLINUX_PACKAGE
	 * @model name="DebianlinuxPackage" literal="Debian linux Package"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIANLINUX_PACKAGE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Enum Extended Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumExtendedResourceType[] VALUES_ARRAY =
		new EnumExtendedResourceType[] {
			UNKNOWN,
			OTHER,
			NOT_APPLICABLE,
			LINUX_RPM,
			HP_UX_DEPOT,
			WINDOWS_MSI,
			SOLARIS_PACKAGE,
			MACINTOSH_DISK_IMAGE,
			DEBIANLINUX_PACKAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Extended Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumExtendedResourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Extended Resource Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumExtendedResourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumExtendedResourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Extended Resource Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumExtendedResourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumExtendedResourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Extended Resource Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumExtendedResourceType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
			case LINUX_RPM_VALUE: return LINUX_RPM;
			case HP_UX_DEPOT_VALUE: return HP_UX_DEPOT;
			case WINDOWS_MSI_VALUE: return WINDOWS_MSI;
			case SOLARIS_PACKAGE_VALUE: return SOLARIS_PACKAGE;
			case MACINTOSH_DISK_IMAGE_VALUE: return MACINTOSH_DISK_IMAGE;
			case DEBIANLINUX_PACKAGE_VALUE: return DEBIANLINUX_PACKAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumExtendedResourceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EnumExtendedResourceType
