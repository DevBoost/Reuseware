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
 * A representation of the literals of the enumeration '<em><b>Enum Upgrade Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumUpgradeCondition()
 * @model
 * @generated
 */
public enum EnumUpgradeCondition implements Enumerator {
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
	 * The '<em><b>Residesoffdevice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDESOFFDEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDESOFFDEVICE(2, "Residesoffdevice", "Resides off device"),

	/**
	 * The '<em><b>Owner Upgradeable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWNER_UPGRADEABLE_VALUE
	 * @generated
	 * @ordered
	 */
	OWNER_UPGRADEABLE(3, "OwnerUpgradeable", "Owner Upgradeable"),

	/**
	 * The '<em><b>Factory Upgradeable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FACTORY_UPGRADEABLE_VALUE
	 * @generated
	 * @ordered
	 */
	FACTORY_UPGRADEABLE(4, "FactoryUpgradeable", "Factory Upgradeable"),

	/**
	 * The '<em><b>Not Upgradeable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_UPGRADEABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_UPGRADEABLE(5, "NotUpgradeable", "Not Upgradeable");

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
	 * The '<em><b>Residesoffdevice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Residesoffdevice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIDESOFFDEVICE
	 * @model name="Residesoffdevice" literal="Resides off device"
	 * @generated
	 * @ordered
	 */
	public static final int RESIDESOFFDEVICE_VALUE = 2;

	/**
	 * The '<em><b>Owner Upgradeable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Owner Upgradeable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OWNER_UPGRADEABLE
	 * @model name="OwnerUpgradeable" literal="Owner Upgradeable"
	 * @generated
	 * @ordered
	 */
	public static final int OWNER_UPGRADEABLE_VALUE = 3;

	/**
	 * The '<em><b>Factory Upgradeable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Factory Upgradeable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FACTORY_UPGRADEABLE
	 * @model name="FactoryUpgradeable" literal="Factory Upgradeable"
	 * @generated
	 * @ordered
	 */
	public static final int FACTORY_UPGRADEABLE_VALUE = 4;

	/**
	 * The '<em><b>Not Upgradeable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Upgradeable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_UPGRADEABLE
	 * @model name="NotUpgradeable" literal="Not Upgradeable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_UPGRADEABLE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Enum Upgrade Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumUpgradeCondition[] VALUES_ARRAY =
		new EnumUpgradeCondition[] {
			UNKNOWN,
			OTHER,
			RESIDESOFFDEVICE,
			OWNER_UPGRADEABLE,
			FACTORY_UPGRADEABLE,
			NOT_UPGRADEABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Upgrade Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumUpgradeCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Upgrade Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumUpgradeCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumUpgradeCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Upgrade Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumUpgradeCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumUpgradeCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Upgrade Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumUpgradeCondition get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case RESIDESOFFDEVICE_VALUE: return RESIDESOFFDEVICE;
			case OWNER_UPGRADEABLE_VALUE: return OWNER_UPGRADEABLE;
			case FACTORY_UPGRADEABLE_VALUE: return FACTORY_UPGRADEABLE;
			case NOT_UPGRADEABLE_VALUE: return NOT_UPGRADEABLE;
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
	private EnumUpgradeCondition(int value, String name, String literal) {
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
	
} //EnumUpgradeCondition
