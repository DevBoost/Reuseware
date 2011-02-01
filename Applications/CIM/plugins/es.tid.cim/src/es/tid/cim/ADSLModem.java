/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADSL Modem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ADSLModem#getLineAttenuation <em>Line Attenuation</em>}</li>
 *   <li>{@link es.tid.cim.ADSLModem#getLineState <em>Line State</em>}</li>
 *   <li>{@link es.tid.cim.ADSLModem#getMaxDataRate <em>Max Data Rate</em>}</li>
 *   <li>{@link es.tid.cim.ADSLModem#getNoiseMargin <em>Noise Margin</em>}</li>
 *   <li>{@link es.tid.cim.ADSLModem#getTotalOutputPower <em>Total Output Power</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getADSLModem()
 * @model
 * @generated
 */
public interface ADSLModem extends DSLModem {
	/**
	 * Returns the value of the '<em><b>Line Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Attenuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Attenuation</em>' attribute.
	 * @see #setLineAttenuation(int)
	 * @see es.tid.cim.CimPackage#getADSLModem_LineAttenuation()
	 * @model
	 * @generated
	 */
	int getLineAttenuation();

	/**
	 * Sets the value of the '{@link es.tid.cim.ADSLModem#getLineAttenuation <em>Line Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Attenuation</em>' attribute.
	 * @see #getLineAttenuation()
	 * @generated
	 */
	void setLineAttenuation(int value);

	/**
	 * Returns the value of the '<em><b>Line State</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumLineState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line State</em>' attribute.
	 * @see es.tid.cim.EnumLineState
	 * @see #setLineState(EnumLineState)
	 * @see es.tid.cim.CimPackage#getADSLModem_LineState()
	 * @model
	 * @generated
	 */
	EnumLineState getLineState();

	/**
	 * Sets the value of the '{@link es.tid.cim.ADSLModem#getLineState <em>Line State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line State</em>' attribute.
	 * @see es.tid.cim.EnumLineState
	 * @see #getLineState()
	 * @generated
	 */
	void setLineState(EnumLineState value);

	/**
	 * Returns the value of the '<em><b>Max Data Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Data Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Data Rate</em>' attribute.
	 * @see #setMaxDataRate(int)
	 * @see es.tid.cim.CimPackage#getADSLModem_MaxDataRate()
	 * @model
	 * @generated
	 */
	int getMaxDataRate();

	/**
	 * Sets the value of the '{@link es.tid.cim.ADSLModem#getMaxDataRate <em>Max Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Rate</em>' attribute.
	 * @see #getMaxDataRate()
	 * @generated
	 */
	void setMaxDataRate(int value);

	/**
	 * Returns the value of the '<em><b>Noise Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noise Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noise Margin</em>' attribute.
	 * @see #setNoiseMargin(int)
	 * @see es.tid.cim.CimPackage#getADSLModem_NoiseMargin()
	 * @model
	 * @generated
	 */
	int getNoiseMargin();

	/**
	 * Sets the value of the '{@link es.tid.cim.ADSLModem#getNoiseMargin <em>Noise Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise Margin</em>' attribute.
	 * @see #getNoiseMargin()
	 * @generated
	 */
	void setNoiseMargin(int value);

	/**
	 * Returns the value of the '<em><b>Total Output Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Output Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Output Power</em>' attribute.
	 * @see #setTotalOutputPower(int)
	 * @see es.tid.cim.CimPackage#getADSLModem_TotalOutputPower()
	 * @model
	 * @generated
	 */
	int getTotalOutputPower();

	/**
	 * Sets the value of the '{@link es.tid.cim.ADSLModem#getTotalOutputPower <em>Total Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Output Power</em>' attribute.
	 * @see #getTotalOutputPower()
	 * @generated
	 */
	void setTotalOutputPower(int value);

} // ADSLModem
