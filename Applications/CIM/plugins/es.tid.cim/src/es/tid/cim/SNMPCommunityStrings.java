/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SNMP Community Strings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.SNMPCommunityStrings#getCommunityString <em>Community String</em>}</li>
 *   <li>{@link es.tid.cim.SNMPCommunityStrings#getTypeOfAccess <em>Type Of Access</em>}</li>
 *   <li>{@link es.tid.cim.SNMPCommunityStrings#getLogicalEntitiesAccessed <em>Logical Entities Accessed</em>}</li>
 *   <li>{@link es.tid.cim.SNMPCommunityStrings#getLogicalEntitiesDescriptions <em>Logical Entities Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getSNMPCommunityStrings()
 * @model
 * @generated
 */
public interface SNMPCommunityStrings extends ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Community String</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Community String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Community String</em>' attribute.
	 * @see #setCommunityString(String)
	 * @see es.tid.cim.CimPackage#getSNMPCommunityStrings_CommunityString()
	 * @model default=""
	 * @generated
	 */
	String getCommunityString();

	/**
	 * Sets the value of the '{@link es.tid.cim.SNMPCommunityStrings#getCommunityString <em>Community String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Community String</em>' attribute.
	 * @see #getCommunityString()
	 * @generated
	 */
	void setCommunityString(String value);

	/**
	 * Returns the value of the '<em><b>Type Of Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of Access</em>' attribute.
	 * @see #setTypeOfAccess(String)
	 * @see es.tid.cim.CimPackage#getSNMPCommunityStrings_TypeOfAccess()
	 * @model
	 * @generated
	 */
	String getTypeOfAccess();

	/**
	 * Sets the value of the '{@link es.tid.cim.SNMPCommunityStrings#getTypeOfAccess <em>Type Of Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Access</em>' attribute.
	 * @see #getTypeOfAccess()
	 * @generated
	 */
	void setTypeOfAccess(String value);

	/**
	 * Returns the value of the '<em><b>Logical Entities Accessed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Entities Accessed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Entities Accessed</em>' attribute.
	 * @see #setLogicalEntitiesAccessed(String)
	 * @see es.tid.cim.CimPackage#getSNMPCommunityStrings_LogicalEntitiesAccessed()
	 * @model
	 * @generated
	 */
	String getLogicalEntitiesAccessed();

	/**
	 * Sets the value of the '{@link es.tid.cim.SNMPCommunityStrings#getLogicalEntitiesAccessed <em>Logical Entities Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Entities Accessed</em>' attribute.
	 * @see #getLogicalEntitiesAccessed()
	 * @generated
	 */
	void setLogicalEntitiesAccessed(String value);

	/**
	 * Returns the value of the '<em><b>Logical Entities Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Entities Descriptions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Entities Descriptions</em>' attribute.
	 * @see #setLogicalEntitiesDescriptions(String)
	 * @see es.tid.cim.CimPackage#getSNMPCommunityStrings_LogicalEntitiesDescriptions()
	 * @model
	 * @generated
	 */
	String getLogicalEntitiesDescriptions();

	/**
	 * Sets the value of the '{@link es.tid.cim.SNMPCommunityStrings#getLogicalEntitiesDescriptions <em>Logical Entities Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Entities Descriptions</em>' attribute.
	 * @see #getLogicalEntitiesDescriptions()
	 * @generated
	 */
	void setLogicalEntitiesDescriptions(String value);

} // SNMPCommunityStrings
