/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Based Modem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.CallBasedModem#getCallSpeed <em>Call Speed</em>}</li>
 *   <li>{@link es.tid.cim.CallBasedModem#getModulationScheme <em>Modulation Scheme</em>}</li>
 *   <li>{@link es.tid.cim.CallBasedModem#getNumberDialed <em>Number Dialed</em>}</li>
 *   <li>{@link es.tid.cim.CallBasedModem#getOtherModulationDescription <em>Other Modulation Description</em>}</li>
 *   <li>{@link es.tid.cim.CallBasedModem#getModulationSupported <em>Modulation Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getCallBasedModem()
 * @model abstract="true"
 * @generated
 */
public interface CallBasedModem extends Modem {
	/**
	 * Returns the value of the '<em><b>Call Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Speed</em>' attribute.
	 * @see #setCallSpeed(BigInteger)
	 * @see es.tid.cim.CimPackage#getCallBasedModem_CallSpeed()
	 * @model
	 * @generated
	 */
	BigInteger getCallSpeed();

	/**
	 * Sets the value of the '{@link es.tid.cim.CallBasedModem#getCallSpeed <em>Call Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Speed</em>' attribute.
	 * @see #getCallSpeed()
	 * @generated
	 */
	void setCallSpeed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Modulation Scheme</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumModulationScheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulation Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulation Scheme</em>' attribute.
	 * @see es.tid.cim.EnumModulationScheme
	 * @see #setModulationScheme(EnumModulationScheme)
	 * @see es.tid.cim.CimPackage#getCallBasedModem_ModulationScheme()
	 * @model
	 * @generated
	 */
	EnumModulationScheme getModulationScheme();

	/**
	 * Sets the value of the '{@link es.tid.cim.CallBasedModem#getModulationScheme <em>Modulation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Scheme</em>' attribute.
	 * @see es.tid.cim.EnumModulationScheme
	 * @see #getModulationScheme()
	 * @generated
	 */
	void setModulationScheme(EnumModulationScheme value);

	/**
	 * Returns the value of the '<em><b>Number Dialed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Dialed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Dialed</em>' attribute.
	 * @see #setNumberDialed(String)
	 * @see es.tid.cim.CimPackage#getCallBasedModem_NumberDialed()
	 * @model
	 * @generated
	 */
	String getNumberDialed();

	/**
	 * Sets the value of the '{@link es.tid.cim.CallBasedModem#getNumberDialed <em>Number Dialed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Dialed</em>' attribute.
	 * @see #getNumberDialed()
	 * @generated
	 */
	void setNumberDialed(String value);

	/**
	 * Returns the value of the '<em><b>Other Modulation Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Modulation Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Modulation Description</em>' attribute.
	 * @see #setOtherModulationDescription(String)
	 * @see es.tid.cim.CimPackage#getCallBasedModem_OtherModulationDescription()
	 * @model
	 * @generated
	 */
	String getOtherModulationDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.CallBasedModem#getOtherModulationDescription <em>Other Modulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Modulation Description</em>' attribute.
	 * @see #getOtherModulationDescription()
	 * @generated
	 */
	void setOtherModulationDescription(String value);

	/**
	 * Returns the value of the '<em><b>Modulation Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumModulationScheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulation Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulation Supported</em>' attribute.
	 * @see es.tid.cim.EnumModulationScheme
	 * @see #setModulationSupported(EnumModulationScheme)
	 * @see es.tid.cim.CimPackage#getCallBasedModem_ModulationSupported()
	 * @model
	 * @generated
	 */
	EnumModulationScheme getModulationSupported();

	/**
	 * Sets the value of the '{@link es.tid.cim.CallBasedModem#getModulationSupported <em>Modulation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation Supported</em>' attribute.
	 * @see es.tid.cim.EnumModulationScheme
	 * @see #getModulationSupported()
	 * @generated
	 */
	void setModulationSupported(EnumModulationScheme value);

} // CallBasedModem
