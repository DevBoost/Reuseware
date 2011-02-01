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
 * A representation of the model object '<em><b>Columns Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType#getTableColumn <em>Table Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableColumnsType()
 * @model extendedMetaData="name='table-columns_._type' kind='elementOnly'"
 * @generated
 */
public interface TableColumnsType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableColumnsType_TableColumn()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='table-column' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TableColumnType> getTableColumn();

} // TableColumnsType
