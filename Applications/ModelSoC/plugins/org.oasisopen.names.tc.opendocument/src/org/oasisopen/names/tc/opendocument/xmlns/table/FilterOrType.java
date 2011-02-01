/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Or Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType#getFilterAnd <em>Filter And</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterOrType#getFilterCondition <em>Filter Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterOrType()
 * @model extendedMetaData="name='filter-or_._type' kind='elementOnly'"
 * @generated
 */
public interface FilterOrType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterOrType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Filter And</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterAndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter And</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter And</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterOrType_FilterAnd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter-and' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FilterAndType> getFilterAnd();

	/**
	 * Returns the value of the '<em><b>Filter Condition</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.FilterConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Condition</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getFilterOrType_FilterCondition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter-condition' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FilterConditionType> getFilterCondition();

} // FilterOrType
