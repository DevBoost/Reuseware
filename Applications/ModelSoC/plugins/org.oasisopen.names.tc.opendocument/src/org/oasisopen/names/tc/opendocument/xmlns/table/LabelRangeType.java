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
 * A representation of the model object '<em><b>Label Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getDataCellRangeAddress <em>Data Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getLabelCellRangeAddress <em>Label Cell Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLabelRangeType()
 * @model extendedMetaData="name='label-range_._type' kind='empty'"
 * @generated
 */
public interface LabelRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Cell Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Cell Range Address</em>' attribute.
	 * @see #setDataCellRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLabelRangeType_DataCellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress" required="true"
	 *        extendedMetaData="kind='attribute' name='data-cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getDataCellRangeAddress <em>Data Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Cell Range Address</em>' attribute.
	 * @see #getDataCellRangeAddress()
	 * @generated
	 */
	void setDataCellRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Label Cell Range Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Cell Range Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Cell Range Address</em>' attribute.
	 * @see #setLabelCellRangeAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLabelRangeType_LabelCellRangeAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddress" required="true"
	 *        extendedMetaData="kind='attribute' name='label-cell-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabelCellRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getLabelCellRangeAddress <em>Label Cell Range Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Cell Range Address</em>' attribute.
	 * @see #getLabelCellRangeAddress()
	 * @generated
	 */
	void setLabelCellRangeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(OrientationType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLabelRangeType_Orientation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType1 getOrientation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.OrientationType1
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType1)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType1)
	 * @generated
	 */
	boolean isSetOrientation();

} // LabelRangeType
