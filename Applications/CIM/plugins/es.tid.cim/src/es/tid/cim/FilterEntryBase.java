/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Entry Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.FilterEntryBase#isIsNegated <em>Is Negated</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getFilterEntryBase()
 * @model abstract="true"
 * @generated
 */
public interface FilterEntryBase extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Is Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Negated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Negated</em>' attribute.
	 * @see #setIsNegated(boolean)
	 * @see es.tid.cim.CimPackage#getFilterEntryBase_IsNegated()
	 * @model
	 * @generated
	 */
	boolean isIsNegated();

	/**
	 * Sets the value of the '{@link es.tid.cim.FilterEntryBase#isIsNegated <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Negated</em>' attribute.
	 * @see #isIsNegated()
	 * @generated
	 */
	void setIsNegated(boolean value);

} // FilterEntryBase
