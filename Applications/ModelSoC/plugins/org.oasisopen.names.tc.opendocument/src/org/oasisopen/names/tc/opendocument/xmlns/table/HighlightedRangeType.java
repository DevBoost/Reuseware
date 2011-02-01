/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Highlighted Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getCellRangeAddress <em>Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getContainsError <em>Contains Error</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getMarkedInvalid <em>Marked Invalid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getHighlightedRangeType()
 * @model extendedMetaData="name='highlighted-range_._type' kind='empty'"
 * @generated
 */
public interface HighlightedRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Range Address</em>' attribute.
	 * @see #setCellRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getHighlightedRangeType_CellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress"
	 *        extendedMetaData="kind='attribute' name='cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getCellRangeAddress <em>Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Range Address</em>' attribute.
	 * @see #getCellRangeAddress()
	 * @generated
	 */
	void setCellRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Contains Error</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Error</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetContainsError()
	 * @see #unsetContainsError()
	 * @see #setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getHighlightedRangeType_ContainsError()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='contains-error' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getContainsError();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getContainsError <em>Contains Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Error</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetContainsError()
	 * @see #unsetContainsError()
	 * @see #getContainsError()
	 * @generated
	 */
	void setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getContainsError <em>Contains Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainsError()
	 * @see #getContainsError()
	 * @see #setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetContainsError();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getContainsError <em>Contains Error</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contains Error</em>' attribute is set.
	 * @see #unsetContainsError()
	 * @see #getContainsError()
	 * @see #setContainsError(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetContainsError();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(DirectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getHighlightedRangeType_Direction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Marked Invalid</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marked Invalid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marked Invalid</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMarkedInvalid()
	 * @see #unsetMarkedInvalid()
	 * @see #setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getHighlightedRangeType_MarkedInvalid()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='marked-invalid' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMarkedInvalid();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getMarkedInvalid <em>Marked Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marked Invalid</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMarkedInvalid()
	 * @see #unsetMarkedInvalid()
	 * @see #getMarkedInvalid()
	 * @generated
	 */
	void setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getMarkedInvalid <em>Marked Invalid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarkedInvalid()
	 * @see #getMarkedInvalid()
	 * @see #setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMarkedInvalid();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType#getMarkedInvalid <em>Marked Invalid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marked Invalid</em>' attribute is set.
	 * @see #unsetMarkedInvalid()
	 * @see #getMarkedInvalid()
	 * @see #setMarkedInvalid(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMarkedInvalid();

} // HighlightedRangeType
