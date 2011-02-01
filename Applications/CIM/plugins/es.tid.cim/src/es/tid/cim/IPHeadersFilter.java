/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP Headers Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrDestPortEnd <em>Hdr Dest Port End</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrDestPortStart <em>Hdr Dest Port Start</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrIPVersion <em>Hdr IP Version</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrProtocolID <em>Hdr Protocol ID</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrSrcPortEnd <em>Hdr Src Port End</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrSrcPortStart <em>Hdr Src Port Start</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrDestAddress <em>Hdr Dest Address</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrDestAddressEndOfRange <em>Hdr Dest Address End Of Range</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrDestMask <em>Hdr Dest Mask</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrDSCP <em>Hdr DSCP</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrFlowLabel <em>Hdr Flow Label</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrSrcAddressEndOfRange <em>Hdr Src Address End Of Range</em>}</li>
 *   <li>{@link es.tid.cim.IPHeadersFilter#getHdrSrcMask <em>Hdr Src Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getIPHeadersFilter()
 * @model
 * @generated
 */
public interface IPHeadersFilter extends FilterEntryBase {
	/**
	 * Returns the value of the '<em><b>Hdr Dest Port End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Dest Port End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Dest Port End</em>' attribute.
	 * @see #setHdrDestPortEnd(int)
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrDestPortEnd()
	 * @model
	 * @generated
	 */
	int getHdrDestPortEnd();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPHeadersFilter#getHdrDestPortEnd <em>Hdr Dest Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Dest Port End</em>' attribute.
	 * @see #getHdrDestPortEnd()
	 * @generated
	 */
	void setHdrDestPortEnd(int value);

	/**
	 * Returns the value of the '<em><b>Hdr Dest Port Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Dest Port Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Dest Port Start</em>' attribute.
	 * @see #setHdrDestPortStart(int)
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrDestPortStart()
	 * @model
	 * @generated
	 */
	int getHdrDestPortStart();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPHeadersFilter#getHdrDestPortStart <em>Hdr Dest Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Dest Port Start</em>' attribute.
	 * @see #getHdrDestPortStart()
	 * @generated
	 */
	void setHdrDestPortStart(int value);

	/**
	 * Returns the value of the '<em><b>Hdr IP Version</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumIPVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr IP Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr IP Version</em>' attribute.
	 * @see es.tid.cim.EnumIPVersion
	 * @see #setHdrIPVersion(EnumIPVersion)
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrIPVersion()
	 * @model
	 * @generated
	 */
	EnumIPVersion getHdrIPVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPHeadersFilter#getHdrIPVersion <em>Hdr IP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr IP Version</em>' attribute.
	 * @see es.tid.cim.EnumIPVersion
	 * @see #getHdrIPVersion()
	 * @generated
	 */
	void setHdrIPVersion(EnumIPVersion value);

	/**
	 * Returns the value of the '<em><b>Hdr Protocol ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Protocol ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Protocol ID</em>' attribute.
	 * @see #setHdrProtocolID(byte)
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrProtocolID()
	 * @model
	 * @generated
	 */
	byte getHdrProtocolID();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPHeadersFilter#getHdrProtocolID <em>Hdr Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Protocol ID</em>' attribute.
	 * @see #getHdrProtocolID()
	 * @generated
	 */
	void setHdrProtocolID(byte value);

	/**
	 * Returns the value of the '<em><b>Hdr Src Port End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Src Port End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Src Port End</em>' attribute.
	 * @see #setHdrSrcPortEnd(int)
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrSrcPortEnd()
	 * @model
	 * @generated
	 */
	int getHdrSrcPortEnd();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPHeadersFilter#getHdrSrcPortEnd <em>Hdr Src Port End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Src Port End</em>' attribute.
	 * @see #getHdrSrcPortEnd()
	 * @generated
	 */
	void setHdrSrcPortEnd(int value);

	/**
	 * Returns the value of the '<em><b>Hdr Src Port Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Src Port Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Src Port Start</em>' attribute.
	 * @see #setHdrSrcPortStart(int)
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrSrcPortStart()
	 * @model
	 * @generated
	 */
	int getHdrSrcPortStart();

	/**
	 * Sets the value of the '{@link es.tid.cim.IPHeadersFilter#getHdrSrcPortStart <em>Hdr Src Port Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hdr Src Port Start</em>' attribute.
	 * @see #getHdrSrcPortStart()
	 * @generated
	 */
	void setHdrSrcPortStart(int value);

	/**
	 * Returns the value of the '<em><b>Hdr Dest Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Dest Address</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Dest Address</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrDestAddress()
	 * @model
	 * @generated
	 */
	EList<Integer> getHdrDestAddress();

	/**
	 * Returns the value of the '<em><b>Hdr Dest Address End Of Range</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Dest Address End Of Range</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Dest Address End Of Range</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrDestAddressEndOfRange()
	 * @model
	 * @generated
	 */
	EList<Integer> getHdrDestAddressEndOfRange();

	/**
	 * Returns the value of the '<em><b>Hdr Dest Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Dest Mask</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Dest Mask</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrDestMask()
	 * @model
	 * @generated
	 */
	EList<Integer> getHdrDestMask();

	/**
	 * Returns the value of the '<em><b>Hdr DSCP</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr DSCP</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr DSCP</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrDSCP()
	 * @model
	 * @generated
	 */
	EList<Integer> getHdrDSCP();

	/**
	 * Returns the value of the '<em><b>Hdr Flow Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Flow Label</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Flow Label</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrFlowLabel()
	 * @model
	 * @generated
	 */
	EList<Integer> getHdrFlowLabel();

	/**
	 * Returns the value of the '<em><b>Hdr Src Address End Of Range</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Src Address End Of Range</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Src Address End Of Range</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrSrcAddressEndOfRange()
	 * @model
	 * @generated
	 */
	EList<Integer> getHdrSrcAddressEndOfRange();

	/**
	 * Returns the value of the '<em><b>Hdr Src Mask</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hdr Src Mask</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hdr Src Mask</em>' attribute list.
	 * @see es.tid.cim.CimPackage#getIPHeadersFilter_HdrSrcMask()
	 * @model
	 * @generated
	 */
	EList<Integer> getHdrSrcMask();

} // IPHeadersFilter
