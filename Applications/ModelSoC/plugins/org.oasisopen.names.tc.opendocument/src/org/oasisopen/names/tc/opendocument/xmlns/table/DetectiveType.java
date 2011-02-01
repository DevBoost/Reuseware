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
 * A representation of the model object '<em><b>Detective Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType#getHighlightedRange <em>Highlighted Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DetectiveType#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDetectiveType()
 * @model extendedMetaData="name='detective_._type' kind='elementOnly'"
 * @generated
 */
public interface DetectiveType extends EObject {
	/**
	 * Returns the value of the '<em><b>Highlighted Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.HighlightedRangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Highlighted Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highlighted Range</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDetectiveType_HighlightedRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='highlighted-range' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HighlightedRangeType> getHighlightedRange();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.OperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDetectiveType_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OperationType> getOperation();

} // DetectiveType
