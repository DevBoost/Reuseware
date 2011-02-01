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
 * A representation of the model object '<em><b>Enabled Logical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.EnabledLogicalElement#getEnabledDefault <em>Enabled Default</em>}</li>
 *   <li>{@link es.tid.cim.EnabledLogicalElement#getEnabledState <em>Enabled State</em>}</li>
 *   <li>{@link es.tid.cim.EnabledLogicalElement#getOtherEnabledState <em>Other Enabled State</em>}</li>
 *   <li>{@link es.tid.cim.EnabledLogicalElement#getOverwritePolicy <em>Overwrite Policy</em>}</li>
 *   <li>{@link es.tid.cim.EnabledLogicalElement#getRemoteAccessAvailableToElement <em>Remote Access Available To Element</em>}</li>
 *   <li>{@link es.tid.cim.EnabledLogicalElement#getRequestedState <em>Requested State</em>}</li>
 *   <li>{@link es.tid.cim.EnabledLogicalElement#getTimeOfLastStateChange <em>Time Of Last State Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getEnabledLogicalElement()
 * @model abstract="true"
 * @generated
 */
public interface EnabledLogicalElement extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Enabled Default</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumEnabledDefault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Default</em>' attribute.
	 * @see es.tid.cim.EnumEnabledDefault
	 * @see #setEnabledDefault(EnumEnabledDefault)
	 * @see es.tid.cim.CimPackage#getEnabledLogicalElement_EnabledDefault()
	 * @model
	 * @generated
	 */
	EnumEnabledDefault getEnabledDefault();

	/**
	 * Sets the value of the '{@link es.tid.cim.EnabledLogicalElement#getEnabledDefault <em>Enabled Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Default</em>' attribute.
	 * @see es.tid.cim.EnumEnabledDefault
	 * @see #getEnabledDefault()
	 * @generated
	 */
	void setEnabledDefault(EnumEnabledDefault value);

	/**
	 * Returns the value of the '<em><b>Enabled State</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumEnabledState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled State</em>' attribute.
	 * @see es.tid.cim.EnumEnabledState
	 * @see #setEnabledState(EnumEnabledState)
	 * @see es.tid.cim.CimPackage#getEnabledLogicalElement_EnabledState()
	 * @model
	 * @generated
	 */
	EnumEnabledState getEnabledState();

	/**
	 * Sets the value of the '{@link es.tid.cim.EnabledLogicalElement#getEnabledState <em>Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled State</em>' attribute.
	 * @see es.tid.cim.EnumEnabledState
	 * @see #getEnabledState()
	 * @generated
	 */
	void setEnabledState(EnumEnabledState value);

	/**
	 * Returns the value of the '<em><b>Other Enabled State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Enabled State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Enabled State</em>' attribute.
	 * @see #setOtherEnabledState(String)
	 * @see es.tid.cim.CimPackage#getEnabledLogicalElement_OtherEnabledState()
	 * @model
	 * @generated
	 */
	String getOtherEnabledState();

	/**
	 * Sets the value of the '{@link es.tid.cim.EnabledLogicalElement#getOtherEnabledState <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled State</em>' attribute.
	 * @see #getOtherEnabledState()
	 * @generated
	 */
	void setOtherEnabledState(String value);

	/**
	 * Returns the value of the '<em><b>Overwrite Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overwrite Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overwrite Policy</em>' attribute.
	 * @see #setOverwritePolicy(String)
	 * @see es.tid.cim.CimPackage#getEnabledLogicalElement_OverwritePolicy()
	 * @model
	 * @generated
	 */
	String getOverwritePolicy();

	/**
	 * Sets the value of the '{@link es.tid.cim.EnabledLogicalElement#getOverwritePolicy <em>Overwrite Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overwrite Policy</em>' attribute.
	 * @see #getOverwritePolicy()
	 * @generated
	 */
	void setOverwritePolicy(String value);

	/**
	 * Returns the value of the '<em><b>Remote Access Available To Element</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.RemoteServiceAccessPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Access Available To Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Access Available To Element</em>' reference list.
	 * @see es.tid.cim.CimPackage#getEnabledLogicalElement_RemoteAccessAvailableToElement()
	 * @model
	 * @generated
	 */
	EList<RemoteServiceAccessPoint> getRemoteAccessAvailableToElement();

	/**
	 * Returns the value of the '<em><b>Requested State</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumRequestedState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested State</em>' attribute.
	 * @see es.tid.cim.EnumRequestedState
	 * @see #setRequestedState(EnumRequestedState)
	 * @see es.tid.cim.CimPackage#getEnabledLogicalElement_RequestedState()
	 * @model
	 * @generated
	 */
	EnumRequestedState getRequestedState();

	/**
	 * Sets the value of the '{@link es.tid.cim.EnabledLogicalElement#getRequestedState <em>Requested State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested State</em>' attribute.
	 * @see es.tid.cim.EnumRequestedState
	 * @see #getRequestedState()
	 * @generated
	 */
	void setRequestedState(EnumRequestedState value);

	/**
	 * Returns the value of the '<em><b>Time Of Last State Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Of Last State Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Of Last State Change</em>' attribute.
	 * @see #setTimeOfLastStateChange(Date)
	 * @see es.tid.cim.CimPackage#getEnabledLogicalElement_TimeOfLastStateChange()
	 * @model
	 * @generated
	 */
	Date getTimeOfLastStateChange();

	/**
	 * Sets the value of the '{@link es.tid.cim.EnabledLogicalElement#getTimeOfLastStateChange <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last State Change</em>' attribute.
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 */
	void setTimeOfLastStateChange(Date value);

} // EnabledLogicalElement
