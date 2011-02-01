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
 * A representation of the model object '<em><b>Cell Content Deletion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getCellAddress <em>Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getChangeTrackTableCell <em>Change Track Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCellContentDeletionType()
 * @model extendedMetaData="name='cell-content-deletion_._type' kind='elementOnly'"
 * @generated
 */
public interface CellContentDeletionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Address</em>' containment reference.
	 * @see #setCellAddress(CellAddressType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCellContentDeletionType_CellAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cell-address' namespace='##targetNamespace'"
	 * @generated
	 */
	CellAddressType getCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getCellAddress <em>Cell Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Address</em>' containment reference.
	 * @see #getCellAddress()
	 * @generated
	 */
	void setCellAddress(CellAddressType value);

	/**
	 * Returns the value of the '<em><b>Change Track Table Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Track Table Cell</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Track Table Cell</em>' containment reference.
	 * @see #setChangeTrackTableCell(ChangeTrackTableCellType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCellContentDeletionType_ChangeTrackTableCell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='change-track-table-cell' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeTrackTableCellType getChangeTrackTableCell();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getChangeTrackTableCell <em>Change Track Table Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Track Table Cell</em>' containment reference.
	 * @see #getChangeTrackTableCell()
	 * @generated
	 */
	void setChangeTrackTableCell(ChangeTrackTableCellType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getCellContentDeletionType_Id()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.CellContentDeletionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CellContentDeletionType
