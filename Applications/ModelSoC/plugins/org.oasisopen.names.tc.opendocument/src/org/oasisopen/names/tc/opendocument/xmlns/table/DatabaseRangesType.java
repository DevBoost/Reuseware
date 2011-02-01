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
 * A representation of the model object '<em><b>Database Ranges Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangesType#getDatabaseRange <em>Database Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangesType()
 * @model extendedMetaData="name='database-ranges_._type' kind='elementOnly'"
 * @generated
 */
public interface DatabaseRangesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Database Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.DatabaseRangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Range</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDatabaseRangesType_DatabaseRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-range' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatabaseRangeType> getDatabaseRange();

} // DatabaseRangesType
