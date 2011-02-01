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
 * A representation of the model object '<em><b>Label Ranges Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangesType#getLabelRange <em>Label Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLabelRangesType()
 * @model extendedMetaData="name='label-ranges_._type' kind='elementOnly'"
 * @generated
 */
public interface LabelRangesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Range</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.LabelRangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Range</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getLabelRangesType_LabelRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='label-range' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LabelRangeType> getLabelRange();

} // LabelRangesType
