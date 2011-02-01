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
 * A representation of the model object '<em><b>Data Pilot Layout Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getAddEmptyLines <em>Add Empty Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getLayoutMode <em>Layout Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLayoutInfoType()
 * @model extendedMetaData="name='data-pilot-layout-info_._type' kind='empty'"
 * @generated
 */
public interface DataPilotLayoutInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Add Empty Lines</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Empty Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Empty Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAddEmptyLines()
	 * @see #unsetAddEmptyLines()
	 * @see #setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLayoutInfoType_AddEmptyLines()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='add-empty-lines' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAddEmptyLines();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getAddEmptyLines <em>Add Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Empty Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAddEmptyLines()
	 * @see #unsetAddEmptyLines()
	 * @see #getAddEmptyLines()
	 * @generated
	 */
	void setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getAddEmptyLines <em>Add Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddEmptyLines()
	 * @see #getAddEmptyLines()
	 * @see #setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAddEmptyLines();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getAddEmptyLines <em>Add Empty Lines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Add Empty Lines</em>' attribute is set.
	 * @see #unsetAddEmptyLines()
	 * @see #getAddEmptyLines()
	 * @see #setAddEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAddEmptyLines();

	/**
	 * Returns the value of the '<em><b>Layout Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType
	 * @see #isSetLayoutMode()
	 * @see #unsetLayoutMode()
	 * @see #setLayoutMode(LayoutModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotLayoutInfoType_LayoutMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='layout-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	LayoutModeType getLayoutMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getLayoutMode <em>Layout Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.LayoutModeType
	 * @see #isSetLayoutMode()
	 * @see #unsetLayoutMode()
	 * @see #getLayoutMode()
	 * @generated
	 */
	void setLayoutMode(LayoutModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getLayoutMode <em>Layout Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayoutMode()
	 * @see #getLayoutMode()
	 * @see #setLayoutMode(LayoutModeType)
	 * @generated
	 */
	void unsetLayoutMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotLayoutInfoType#getLayoutMode <em>Layout Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layout Mode</em>' attribute is set.
	 * @see #unsetLayoutMode()
	 * @see #getLayoutMode()
	 * @see #setLayoutMode(LayoutModeType)
	 * @generated
	 */
	boolean isSetLayoutMode();

} // DataPilotLayoutInfoType
