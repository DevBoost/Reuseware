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
 * A representation of the literals of the enumeration '<em><b>Enum Line State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumLineState()
 * @model
 * @generated
 */
public enum EnumLineState implements Enumerator {
	/**
	 * The '<em><b>No Defect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DEFECT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_DEFECT(1, "NoDefect", "NoDefect"),

	/**
	 * The '<em><b>Loss Of Framing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_FRAMING_VALUE
	 * @generated
	 * @ordered
	 */
	LOSS_OF_FRAMING(2, "LossOfFraming", "Loss Of Framing"),

	/**
	 * The '<em><b>Loss Of Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_SIGNAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOSS_OF_SIGNAL(4, "LossOfSignal", "Loss Of Signal"),

	/**
	 * The '<em><b>Loss Of Power</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_POWER_VALUE
	 * @generated
	 * @ordered
	 */
	LOSS_OF_POWER(8, "LossOfPower", "Loss Of Power"),

	/**
	 * The '<em><b>Loss Of Signal Quality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_SIGNAL_QUALITY_VALUE
	 * @generated
	 * @ordered
	 */
	LOSS_OF_SIGNAL_QUALITY(32, "LossOfSignalQuality", "Loss Of Signal Quality");

	/**
	 * The '<em><b>No Defect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Defect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_DEFECT
	 * @model name="NoDefect"
	 * @generated
	 * @ordered
	 */
	public static final int NO_DEFECT_VALUE = 1;

	/**
	 * The '<em><b>Loss Of Framing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loss Of Framing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_FRAMING
	 * @model name="LossOfFraming" literal="Loss Of Framing"
	 * @generated
	 * @ordered
	 */
	public static final int LOSS_OF_FRAMING_VALUE = 2;

	/**
	 * The '<em><b>Loss Of Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loss Of Signal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_SIGNAL
	 * @model name="LossOfSignal" literal="Loss Of Signal"
	 * @generated
	 * @ordered
	 */
	public static final int LOSS_OF_SIGNAL_VALUE = 4;

	/**
	 * The '<em><b>Loss Of Power</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loss Of Power</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_POWER
	 * @model name="LossOfPower" literal="Loss Of Power"
	 * @generated
	 * @ordered
	 */
	public static final int LOSS_OF_POWER_VALUE = 8;

	/**
	 * The '<em><b>Loss Of Signal Quality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loss Of Signal Quality</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOSS_OF_SIGNAL_QUALITY
	 * @model name="LossOfSignalQuality" literal="Loss Of Signal Quality"
	 * @generated
	 * @ordered
	 */
	public static final int LOSS_OF_SIGNAL_QUALITY_VALUE = 32;

	/**
	 * An array of all the '<em><b>Enum Line State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumLineState[] VALUES_ARRAY =
		new EnumLineState[] {
			NO_DEFECT,
			LOSS_OF_FRAMING,
			LOSS_OF_SIGNAL,
			LOSS_OF_POWER,
			LOSS_OF_SIGNAL_QUALITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Line State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumLineState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Line State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLineState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLineState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Line State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLineState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLineState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Line State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumLineState get(int value) {
		switch (value) {
			case NO_DEFECT_VALUE: return NO_DEFECT;
			case LOSS_OF_FRAMING_VALUE: return LOSS_OF_FRAMING;
			case LOSS_OF_SIGNAL_VALUE: return LOSS_OF_SIGNAL;
			case LOSS_OF_POWER_VALUE: return LOSS_OF_POWER;
			case LOSS_OF_SIGNAL_QUALITY_VALUE: return LOSS_OF_SIGNAL_QUALITY;
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
	private EnumLineState(int value, String name, String literal) {
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
	
} //EnumLineState
