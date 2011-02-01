/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Columns Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType#getTableColumn <em>Table Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableHeaderColumnsType()
 * @model extendedMetaData="name='table-header-columns_._type' kind='elementOnly'"
 * @generated
 */
public interface TableHeaderColumnsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Column</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableHeaderColumnsType_TableColumn()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='table-column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TableColumnType> getTableColumn();

} // TableHeaderColumnsType
