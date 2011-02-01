/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Service Access Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.RemoteServiceAccessPoint#getAccessInfo <em>Access Info</em>}</li>
 *   <li>{@link es.tid.cim.RemoteServiceAccessPoint#getAccessContext <em>Access Context</em>}</li>
 *   <li>{@link es.tid.cim.RemoteServiceAccessPoint#getInfoFormat <em>Info Format</em>}</li>
 *   <li>{@link es.tid.cim.RemoteServiceAccessPoint#getOtherAccessContext <em>Other Access Context</em>}</li>
 *   <li>{@link es.tid.cim.RemoteServiceAccessPoint#getOtherInfoFormatDescription <em>Other Info Format Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getRemoteServiceAccessPoint()
 * @model
 * @generated
 */
public interface RemoteServiceAccessPoint extends ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Access Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Info</em>' attribute.
	 * @see #setAccessInfo(String)
	 * @see es.tid.cim.CimPackage#getRemoteServiceAccessPoint_AccessInfo()
	 * @model annotation="Qualifiers ModelCorrespondence='RemoteServiceAccessPoint.infoFormat'"
	 * @generated
	 */
	String getAccessInfo();

	/**
	 * Sets the value of the '{@link es.tid.cim.RemoteServiceAccessPoint#getAccessInfo <em>Access Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Info</em>' attribute.
	 * @see #getAccessInfo()
	 * @generated
	 */
	void setAccessInfo(String value);

	/**
	 * Returns the value of the '<em><b>Access Context</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumAccessContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Context</em>' attribute.
	 * @see es.tid.cim.EnumAccessContext
	 * @see #setAccessContext(EnumAccessContext)
	 * @see es.tid.cim.CimPackage#getRemoteServiceAccessPoint_AccessContext()
	 * @model annotation="Qualifiers experimental='true'"
	 * @generated
	 */
	EnumAccessContext getAccessContext();

	/**
	 * Sets the value of the '{@link es.tid.cim.RemoteServiceAccessPoint#getAccessContext <em>Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Context</em>' attribute.
	 * @see es.tid.cim.EnumAccessContext
	 * @see #getAccessContext()
	 * @generated
	 */
	void setAccessContext(EnumAccessContext value);

	/**
	 * Returns the value of the '<em><b>Info Format</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumInfoFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Format</em>' attribute.
	 * @see es.tid.cim.EnumInfoFormat
	 * @see #setInfoFormat(EnumInfoFormat)
	 * @see es.tid.cim.CimPackage#getRemoteServiceAccessPoint_InfoFormat()
	 * @model
	 * @generated
	 */
	EnumInfoFormat getInfoFormat();

	/**
	 * Sets the value of the '{@link es.tid.cim.RemoteServiceAccessPoint#getInfoFormat <em>Info Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Format</em>' attribute.
	 * @see es.tid.cim.EnumInfoFormat
	 * @see #getInfoFormat()
	 * @generated
	 */
	void setInfoFormat(EnumInfoFormat value);

	/**
	 * Returns the value of the '<em><b>Other Access Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Access Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Access Context</em>' attribute.
	 * @see #setOtherAccessContext(String)
	 * @see es.tid.cim.CimPackage#getRemoteServiceAccessPoint_OtherAccessContext()
	 * @model annotation="Qualifiers ModelCorrespondence='RemoteServiceAccessPoint.accessContext'"
	 * @generated
	 */
	String getOtherAccessContext();

	/**
	 * Sets the value of the '{@link es.tid.cim.RemoteServiceAccessPoint#getOtherAccessContext <em>Other Access Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Access Context</em>' attribute.
	 * @see #getOtherAccessContext()
	 * @generated
	 */
	void setOtherAccessContext(String value);

	/**
	 * Returns the value of the '<em><b>Other Info Format Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Info Format Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Info Format Description</em>' attribute.
	 * @see #setOtherInfoFormatDescription(String)
	 * @see es.tid.cim.CimPackage#getRemoteServiceAccessPoint_OtherInfoFormatDescription()
	 * @model annotation="Qualifiers ModelCorrespondence='RemoteServiceAccessPoint.infoFormat'"
	 * @generated
	 */
	String getOtherInfoFormatDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.RemoteServiceAccessPoint#getOtherInfoFormatDescription <em>Other Info Format Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Info Format Description</em>' attribute.
	 * @see #getOtherInfoFormatDescription()
	 * @generated
	 */
	void setOtherInfoFormatDescription(String value);

} // RemoteServiceAccessPoint
