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
 * A representation of the model object '<em><b>Data Pilot Tables Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTablesType#getDataPilotTable <em>Data Pilot Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTablesType()
 * @model extendedMetaData="name='data-pilot-tables_._type' kind='elementOnly'"
 * @generated
 */
public interface DataPilotTablesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Pilot Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.DataPilotTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Pilot Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Pilot Table</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDataPilotTablesType_DataPilotTable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='data-pilot-table' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataPilotTableType> getDataPilotTable();

} // DataPilotTablesType
