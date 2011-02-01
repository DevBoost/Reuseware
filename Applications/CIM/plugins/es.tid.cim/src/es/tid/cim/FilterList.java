/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.FilterList#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.FilterList#getDirection <em>Direction</em>}</li>
 *   <li>{@link es.tid.cim.FilterList#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.FilterList#getSystemName <em>System Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getFilterList()
 * @model
 * @generated
 */
public interface FilterList extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see es.tid.cim.CimPackage#getFilterList_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterList#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link es.tid.cim.EnumDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see es.tid.cim.EnumDirection
	 * @see #setDirection(EnumDirection)
	 * @see es.tid.cim.CimPackage#getFilterList_Direction()
	 * @model
	 * @generated
	 */
	EnumDirection getDirection();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterList#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see es.tid.cim.EnumDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EnumDirection value);

	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Creation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see es.tid.cim.CimPackage#getFilterList_SystemCreationClassName()
	 * @model
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterList#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see es.tid.cim.CimPackage#getFilterList_SystemName()
	 * @model
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterList#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

} // FilterList
