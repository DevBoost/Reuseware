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
 * A representation of the literals of the enumeration '<em><b>Enum Classifications</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumClassifications()
 * @model
 * @generated
 */
public enum EnumClassifications implements Enumerator {
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
	 * The '<em><b>Driver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRIVER_VALUE
	 * @generated
	 * @ordered
	 */
	DRIVER(2, "Driver", "Driver"),

	/**
	 * The '<em><b>Configuration Software</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_SOFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION_SOFTWARE(3, "ConfigurationSoftware", "Configuration Software"),

	/**
	 * The '<em><b>Application Software</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SOFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_SOFTWARE(4, "ApplicationSoftware", "Application Software"),

	/**
	 * The '<em><b>Instrumentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	INSTRUMENTATION(5, "Instrumentation", "Instrumentation"),

	/**
	 * The '<em><b>Firmware BIOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRMWARE_BIOS_VALUE
	 * @generated
	 * @ordered
	 */
	FIRMWARE_BIOS(6, "Firmware_BIOS", "Firmware/BIOS"),

	/**
	 * The '<em><b>Diagnostic Software</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTIC_SOFTWARE_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTIC_SOFTWARE(7, "DiagnosticSoftware", "Diagnostic Software"),

	/**
	 * The '<em><b>Operating System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATING_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATING_SYSTEM(8, "OperatingSystem", "Operating System"),

	/**
	 * The '<em><b>Middleware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLEWARE_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLEWARE(9, "Middleware", "Middleware"),

	/**
	 * The '<em><b>Firmware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRMWARE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRMWARE(10, "Firmware", "Firmware"),

	/**
	 * The '<em><b>BIOS FCode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOS_FCODE_VALUE
	 * @generated
	 * @ordered
	 */
	BIOS_FCODE(11, "BIOS_FCode", "BIOS/FCode"),

	/**
	 * The '<em><b>Support Service Pack</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORT_SERVICE_PACK_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORT_SERVICE_PACK(12, "Support_ServicePack", "Support/Service Pack"),

	/**
	 * The '<em><b>Software Bundle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_BUNDLE_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_BUNDLE(13, "SoftwareBundle", "Software Bundle");

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
	 * The '<em><b>Driver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Driver</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRIVER
	 * @model name="Driver"
	 * @generated
	 * @ordered
	 */
	public static final int DRIVER_VALUE = 2;

	/**
	 * The '<em><b>Configuration Software</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configuration Software</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_SOFTWARE
	 * @model name="ConfigurationSoftware" literal="Configuration Software"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_SOFTWARE_VALUE = 3;

	/**
	 * The '<em><b>Application Software</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Application Software</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_SOFTWARE
	 * @model name="ApplicationSoftware" literal="Application Software"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_SOFTWARE_VALUE = 4;

	/**
	 * The '<em><b>Instrumentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instrumentation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTRUMENTATION
	 * @model name="Instrumentation"
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUMENTATION_VALUE = 5;

	/**
	 * The '<em><b>Firmware BIOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Firmware BIOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRMWARE_BIOS
	 * @model name="Firmware_BIOS" literal="Firmware/BIOS"
	 * @generated
	 * @ordered
	 */
	public static final int FIRMWARE_BIOS_VALUE = 6;

	/**
	 * The '<em><b>Diagnostic Software</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diagnostic Software</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTIC_SOFTWARE
	 * @model name="DiagnosticSoftware" literal="Diagnostic Software"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTIC_SOFTWARE_VALUE = 7;

	/**
	 * The '<em><b>Operating System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operating System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATING_SYSTEM
	 * @model name="OperatingSystem" literal="Operating System"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SYSTEM_VALUE = 8;

	/**
	 * The '<em><b>Middleware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Middleware</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIDDLEWARE
	 * @model name="Middleware"
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLEWARE_VALUE = 9;

	/**
	 * The '<em><b>Firmware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Firmware</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRMWARE
	 * @model name="Firmware"
	 * @generated
	 * @ordered
	 */
	public static final int FIRMWARE_VALUE = 10;

	/**
	 * The '<em><b>BIOS FCode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIOS FCode</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIOS_FCODE
	 * @model name="BIOS_FCode" literal="BIOS/FCode"
	 * @generated
	 * @ordered
	 */
	public static final int BIOS_FCODE_VALUE = 11;

	/**
	 * The '<em><b>Support Service Pack</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Support Service Pack</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPORT_SERVICE_PACK
	 * @model name="Support_ServicePack" literal="Support/Service Pack"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORT_SERVICE_PACK_VALUE = 12;

	/**
	 * The '<em><b>Software Bundle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Software Bundle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_BUNDLE
	 * @model name="SoftwareBundle" literal="Software Bundle"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_BUNDLE_VALUE = 13;

	/**
	 * An array of all the '<em><b>Enum Classifications</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumClassifications[] VALUES_ARRAY =
		new EnumClassifications[] {
			UNKNOWN,
			OTHER,
			DRIVER,
			CONFIGURATION_SOFTWARE,
			APPLICATION_SOFTWARE,
			INSTRUMENTATION,
			FIRMWARE_BIOS,
			DIAGNOSTIC_SOFTWARE,
			OPERATING_SYSTEM,
			MIDDLEWARE,
			FIRMWARE,
			BIOS_FCODE,
			SUPPORT_SERVICE_PACK,
			SOFTWARE_BUNDLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Classifications</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumClassifications> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Classifications</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumClassifications get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumClassifications result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Classifications</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumClassifications getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumClassifications result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Classifications</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumClassifications get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case DRIVER_VALUE: return DRIVER;
			case CONFIGURATION_SOFTWARE_VALUE: return CONFIGURATION_SOFTWARE;
			case APPLICATION_SOFTWARE_VALUE: return APPLICATION_SOFTWARE;
			case INSTRUMENTATION_VALUE: return INSTRUMENTATION;
			case FIRMWARE_BIOS_VALUE: return FIRMWARE_BIOS;
			case DIAGNOSTIC_SOFTWARE_VALUE: return DIAGNOSTIC_SOFTWARE;
			case OPERATING_SYSTEM_VALUE: return OPERATING_SYSTEM;
			case MIDDLEWARE_VALUE: return MIDDLEWARE;
			case FIRMWARE_VALUE: return FIRMWARE;
			case BIOS_FCODE_VALUE: return BIOS_FCODE;
			case SUPPORT_SERVICE_PACK_VALUE: return SUPPORT_SERVICE_PACK;
			case SOFTWARE_BUNDLE_VALUE: return SOFTWARE_BUNDLE;
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
	private EnumClassifications(int value, String name, String literal) {
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
	
} //EnumClassifications
