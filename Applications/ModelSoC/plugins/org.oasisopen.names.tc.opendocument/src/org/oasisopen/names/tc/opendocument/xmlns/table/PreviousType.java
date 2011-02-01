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
 * A representation of the model object '<em><b>Previous Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType#getChangeTrackTableCell <em>Change Track Table Cell</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getPreviousType()
 * @model extendedMetaData="name='previous_._type' kind='elementOnly'"
 * @generated
 */
public interface PreviousType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getPreviousType_ChangeTrackTableCell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='change-track-table-cell' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeTrackTableCellType getChangeTrackTableCell();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType#getChangeTrackTableCell <em>Change Track Table Cell</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getPreviousType_Id()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.PreviousType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PreviousType
