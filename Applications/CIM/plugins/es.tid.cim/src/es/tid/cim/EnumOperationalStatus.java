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
 * A representation of the literals of the enumeration '<em><b>Enum Operational Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumOperationalStatus()
 * @model
 * @generated
 */
public enum EnumOperationalStatus implements Enumerator {
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
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(3, "OK", "OK"),

	/**
	 * The '<em><b>Degraded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEGRADED_VALUE
	 * @generated
	 * @ordered
	 */
	DEGRADED(4, "Degraded", "Degraded"),

	/**
	 * The '<em><b>Stressed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRESSED_VALUE
	 * @generated
	 * @ordered
	 */
	STRESSED(5, "Stressed", "Stressed"),

	/**
	 * The '<em><b>Predictive Failure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDICTIVE_FAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	PREDICTIVE_FAILURE(6, "PredictiveFailure", "Predictive Failure"),

	/**
	 * The '<em><b>Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(7, "Error", "Error"),

	/**
	 * The '<em><b>Non Recoverable Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_RECOVERABLE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	NON_RECOVERABLE_ERROR(8, "NonRecoverableError", "NonRecoverableError"),

	/**
	 * The '<em><b>Starting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTING_VALUE
	 * @generated
	 * @ordered
	 */
	STARTING(9, "Starting", "Starting"),

	/**
	 * The '<em><b>Stopping</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOPPING_VALUE
	 * @generated
	 * @ordered
	 */
	STOPPING(10, "Stopping", "Stopping"),

	/**
	 * The '<em><b>Stopped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOPPED_VALUE
	 * @generated
	 * @ordered
	 */
	STOPPED(11, "Stopped", "Stopped"),

	/**
	 * The '<em><b>In Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	IN_SERVICE(12, "InService", "InService"),

	/**
	 * The '<em><b>No Contact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONTACT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONTACT(13, "NoContact", "NoContact"),

	/**
	 * The '<em><b>Lost Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOST_COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOST_COMMUNICATION(14, "LostCommunication", "LostCommunication"),

	/**
	 * The '<em><b>Aborted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORTED_VALUE
	 * @generated
	 * @ordered
	 */
	ABORTED(15, "Aborted", "Aborted"),

	/**
	 * The '<em><b>Dormant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DORMANT_VALUE
	 * @generated
	 * @ordered
	 */
	DORMANT(16, "Dormant", "Dormant"),

	/**
	 * The '<em><b>Supporting Entityin Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORTING_ENTITYIN_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORTING_ENTITYIN_ERROR(17, "SupportingEntityinError", "Supporting Entity in Error"),

	/**
	 * The '<em><b>Completed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(18, "Completed", "Completed"),

	/**
	 * The '<em><b>Power Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_MODE(19, "PowerMode", "PowerMode");

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
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 3;

	/**
	 * The '<em><b>Degraded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Degraded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEGRADED
	 * @model name="Degraded"
	 * @generated
	 * @ordered
	 */
	public static final int DEGRADED_VALUE = 4;

	/**
	 * The '<em><b>Stressed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stressed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRESSED
	 * @model name="Stressed"
	 * @generated
	 * @ordered
	 */
	public static final int STRESSED_VALUE = 5;

	/**
	 * The '<em><b>Predictive Failure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Predictive Failure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREDICTIVE_FAILURE
	 * @model name="PredictiveFailure" literal="Predictive Failure"
	 * @generated
	 * @ordered
	 */
	public static final int PREDICTIVE_FAILURE_VALUE = 6;

	/**
	 * The '<em><b>Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model name="Error"
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 7;

	/**
	 * The '<em><b>Non Recoverable Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Recoverable Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_RECOVERABLE_ERROR
	 * @model name="NonRecoverableError"
	 * @generated
	 * @ordered
	 */
	public static final int NON_RECOVERABLE_ERROR_VALUE = 8;

	/**
	 * The '<em><b>Starting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Starting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STARTING
	 * @model name="Starting"
	 * @generated
	 * @ordered
	 */
	public static final int STARTING_VALUE = 9;

	/**
	 * The '<em><b>Stopping</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stopping</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOPPING
	 * @model name="Stopping"
	 * @generated
	 * @ordered
	 */
	public static final int STOPPING_VALUE = 10;

	/**
	 * The '<em><b>Stopped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stopped</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOPPED
	 * @model name="Stopped"
	 * @generated
	 * @ordered
	 */
	public static final int STOPPED_VALUE = 11;

	/**
	 * The '<em><b>In Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_SERVICE
	 * @model name="InService"
	 * @generated
	 * @ordered
	 */
	public static final int IN_SERVICE_VALUE = 12;

	/**
	 * The '<em><b>No Contact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Contact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CONTACT
	 * @model name="NoContact"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONTACT_VALUE = 13;

	/**
	 * The '<em><b>Lost Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lost Communication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOST_COMMUNICATION
	 * @model name="LostCommunication"
	 * @generated
	 * @ordered
	 */
	public static final int LOST_COMMUNICATION_VALUE = 14;

	/**
	 * The '<em><b>Aborted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aborted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORTED
	 * @model name="Aborted"
	 * @generated
	 * @ordered
	 */
	public static final int ABORTED_VALUE = 15;

	/**
	 * The '<em><b>Dormant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dormant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DORMANT
	 * @model name="Dormant"
	 * @generated
	 * @ordered
	 */
	public static final int DORMANT_VALUE = 16;

	/**
	 * The '<em><b>Supporting Entityin Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Supporting Entityin Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPORTING_ENTITYIN_ERROR
	 * @model name="SupportingEntityinError" literal="Supporting Entity in Error"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORTING_ENTITYIN_ERROR_VALUE = 17;

	/**
	 * The '<em><b>Completed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Completed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETED
	 * @model name="Completed"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 18;

	/**
	 * The '<em><b>Power Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Power Mode</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWER_MODE
	 * @model name="PowerMode"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_MODE_VALUE = 19;

	/**
	 * An array of all the '<em><b>Enum Operational Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumOperationalStatus[] VALUES_ARRAY =
		new EnumOperationalStatus[] {
			UNKNOWN,
			OTHER,
			OK,
			DEGRADED,
			STRESSED,
			PREDICTIVE_FAILURE,
			ERROR,
			NON_RECOVERABLE_ERROR,
			STARTING,
			STOPPING,
			STOPPED,
			IN_SERVICE,
			NO_CONTACT,
			LOST_COMMUNICATION,
			ABORTED,
			DORMANT,
			SUPPORTING_ENTITYIN_ERROR,
			COMPLETED,
			POWER_MODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Operational Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumOperationalStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Operational Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumOperationalStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumOperationalStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Operational Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumOperationalStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumOperationalStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Operational Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumOperationalStatus get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case OK_VALUE: return OK;
			case DEGRADED_VALUE: return DEGRADED;
			case STRESSED_VALUE: return STRESSED;
			case PREDICTIVE_FAILURE_VALUE: return PREDICTIVE_FAILURE;
			case ERROR_VALUE: return ERROR;
			case NON_RECOVERABLE_ERROR_VALUE: return NON_RECOVERABLE_ERROR;
			case STARTING_VALUE: return STARTING;
			case STOPPING_VALUE: return STOPPING;
			case STOPPED_VALUE: return STOPPED;
			case IN_SERVICE_VALUE: return IN_SERVICE;
			case NO_CONTACT_VALUE: return NO_CONTACT;
			case LOST_COMMUNICATION_VALUE: return LOST_COMMUNICATION;
			case ABORTED_VALUE: return ABORTED;
			case DORMANT_VALUE: return DORMANT;
			case SUPPORTING_ENTITYIN_ERROR_VALUE: return SUPPORTING_ENTITYIN_ERROR;
			case COMPLETED_VALUE: return COMPLETED;
			case POWER_MODE_VALUE: return POWER_MODE;
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
	private EnumOperationalStatus(int value, String name, String literal) {
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
	
} //EnumOperationalStatus
