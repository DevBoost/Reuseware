/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routing Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.RoutingPolicy#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.RoutingPolicy#getAction <em>Action</em>}</li>
 *   <li>{@link es.tid.cim.RoutingPolicy#getAttributeAction <em>Attribute Action</em>}</li>
 *   <li>{@link es.tid.cim.RoutingPolicy#getBGPAction <em>BGP Action</em>}</li>
 *   <li>{@link es.tid.cim.RoutingPolicy#getBGPValue <em>BGP Value</em>}</li>
 *   <li>{@link es.tid.cim.RoutingPolicy#getRemarkAction <em>Remark Action</em>}</li>
 *   <li>{@link es.tid.cim.RoutingPolicy#getRemarkValue <em>Remark Value</em>}</li>
 *   <li>{@link es.tid.cim.RoutingPolicy#getConditioningAction <em>Conditioning Action</em>}</li>
 *   <li>{@link es.tid.cim.RoutingPolicy#getOtherConditioningAction <em>Other Conditioning Action</em>}</li>
 *   <li>{@link es.tid.cim.RoutingPolicy#getConditioningValue <em>Conditioning Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getRoutingPolicy()
 * @model
 * @generated
 */
public interface RoutingPolicy extends LogicalElement {
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
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Action</em>' attribute.
	 * @see #setAttributeAction(String)
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_AttributeAction()
	 * @model
	 * @generated
	 */
	String getAttributeAction();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getAttributeAction <em>Attribute Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Action</em>' attribute.
	 * @see #getAttributeAction()
	 * @generated
	 */
	void setAttributeAction(String value);

	/**
	 * Returns the value of the '<em><b>BGP Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BGP Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BGP Action</em>' attribute.
	 * @see #setBGPAction(String)
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_BGPAction()
	 * @model
	 * @generated
	 */
	String getBGPAction();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getBGPAction <em>BGP Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Action</em>' attribute.
	 * @see #getBGPAction()
	 * @generated
	 */
	void setBGPAction(String value);

	/**
	 * Returns the value of the '<em><b>BGP Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BGP Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BGP Value</em>' attribute.
	 * @see #setBGPValue(String)
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_BGPValue()
	 * @model
	 * @generated
	 */
	String getBGPValue();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getBGPValue <em>BGP Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Value</em>' attribute.
	 * @see #getBGPValue()
	 * @generated
	 */
	void setBGPValue(String value);

	/**
	 * Returns the value of the '<em><b>Remark Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark Action</em>' attribute.
	 * @see #setRemarkAction(String)
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_RemarkAction()
	 * @model
	 * @generated
	 */
	String getRemarkAction();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getRemarkAction <em>Remark Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark Action</em>' attribute.
	 * @see #getRemarkAction()
	 * @generated
	 */
	void setRemarkAction(String value);

	/**
	 * Returns the value of the '<em><b>Remark Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark Value</em>' attribute.
	 * @see #setRemarkValue(String)
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_RemarkValue()
	 * @model
	 * @generated
	 */
	String getRemarkValue();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getRemarkValue <em>Remark Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark Value</em>' attribute.
	 * @see #getRemarkValue()
	 * @generated
	 */
	void setRemarkValue(String value);

	/**
	 * Returns the value of the '<em><b>Conditioning Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditioning Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditioning Action</em>' attribute.
	 * @see #setConditioningAction(String)
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_ConditioningAction()
	 * @model
	 * @generated
	 */
	String getConditioningAction();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getConditioningAction <em>Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditioning Action</em>' attribute.
	 * @see #getConditioningAction()
	 * @generated
	 */
	void setConditioningAction(String value);

	/**
	 * Returns the value of the '<em><b>Other Conditioning Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Conditioning Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Conditioning Action</em>' attribute.
	 * @see #setOtherConditioningAction(String)
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_OtherConditioningAction()
	 * @model
	 * @generated
	 */
	String getOtherConditioningAction();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getOtherConditioningAction <em>Other Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Conditioning Action</em>' attribute.
	 * @see #getOtherConditioningAction()
	 * @generated
	 */
	void setOtherConditioningAction(String value);

	/**
	 * Returns the value of the '<em><b>Conditioning Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditioning Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditioning Value</em>' attribute.
	 * @see #setConditioningValue(String)
	 * @see es.tid.cim.CimPackage#getRoutingPolicy_ConditioningValue()
	 * @model
	 * @generated
	 */
	String getConditioningValue();

	/**
	 * Sets the value of the '{@link es.tid.cim.RoutingPolicy#getConditioningValue <em>Conditioning Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditioning Value</em>' attribute.
	 * @see #getConditioningValue()
	 * @generated
	 */
	void setConditioningValue(String value);

} // RoutingPolicy
