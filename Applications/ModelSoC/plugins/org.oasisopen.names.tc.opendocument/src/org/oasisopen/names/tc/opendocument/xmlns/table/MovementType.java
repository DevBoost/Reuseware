/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getSourceRangeAddress <em>Source Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getTargetRangeAddress <em>Target Range Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getChangeInfo <em>Change Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getDeletions <em>Deletions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getAcceptanceState <em>Acceptance State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getRejectingChangeId <em>Rejecting Change Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getMovementType()
 * @model extendedMetaData="name='movement_._type' kind='elementOnly'"
 * @generated
 */
public interface MovementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Range Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Range Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Range Address</em>' containment reference.
	 * @see #setSourceRangeAddress(SourceRangeAddressType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getMovementType_SourceRangeAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceRangeAddressType getSourceRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getSourceRangeAddress <em>Source Range Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Range Address</em>' containment reference.
	 * @see #getSourceRangeAddress()
	 * @generated
	 */
	void setSourceRangeAddress(SourceRangeAddressType value);

	/**
	 * Returns the value of the '<em><b>Target Range Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Range Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Range Address</em>' containment reference.
	 * @see #setTargetRangeAddress(TargetRangeAddressType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getMovementType_TargetRangeAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target-range-address' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetRangeAddressType getTargetRangeAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getTargetRangeAddress <em>Target Range Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Range Address</em>' containment reference.
	 * @see #getTargetRangeAddress()
	 * @generated
	 */
	void setTargetRangeAddress(TargetRangeAddressType value);

	/**
	 * Returns the value of the '<em><b>Change Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Info</em>' containment reference.
	 * @see #setChangeInfo(ChangeInfoType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getMovementType_ChangeInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='change-info' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	ChangeInfoType getChangeInfo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getChangeInfo <em>Change Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Info</em>' containment reference.
	 * @see #getChangeInfo()
	 * @generated
	 */
	void setChangeInfo(ChangeInfoType value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependenciesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getMovementType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	DependenciesType getDependencies();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(DependenciesType value);

	/**
	 * Returns the value of the '<em><b>Deletions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deletions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletions</em>' containment reference.
	 * @see #setDeletions(DeletionsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getMovementType_Deletions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deletions' namespace='##targetNamespace'"
	 * @generated
	 */
	DeletionsType getDeletions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getDeletions <em>Deletions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletions</em>' containment reference.
	 * @see #getDeletions()
	 * @generated
	 */
	void setDeletions(DeletionsType value);

	/**
	 * Returns the value of the '<em><b>Acceptance State</b></em>' attribute.
	 * The default value is <code>"pending"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType
	 * @see #isSetAcceptanceState()
	 * @see #unsetAcceptanceState()
	 * @see #setAcceptanceState(AcceptanceStateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getMovementType_AcceptanceState()
	 * @model default="pending" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='acceptance-state' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptanceStateType getAcceptanceState();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getAcceptanceState <em>Acceptance State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.AcceptanceStateType
	 * @see #isSetAcceptanceState()
	 * @see #unsetAcceptanceState()
	 * @see #getAcceptanceState()
	 * @generated
	 */
	void setAcceptanceState(AcceptanceStateType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getAcceptanceState <em>Acceptance State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcceptanceState()
	 * @see #getAcceptanceState()
	 * @see #setAcceptanceState(AcceptanceStateType)
	 * @generated
	 */
	void unsetAcceptanceState();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getAcceptanceState <em>Acceptance State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acceptance State</em>' attribute is set.
	 * @see #unsetAcceptanceState()
	 * @see #getAcceptanceState()
	 * @see #setAcceptanceState(AcceptanceStateType)
	 * @generated
	 */
	boolean isSetAcceptanceState();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getMovementType_Id()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rejecting Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejecting Change Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejecting Change Id</em>' attribute.
	 * @see #setRejectingChangeId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getMovementType_RejectingChangeId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='rejecting-change-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRejectingChangeId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.MovementType#getRejectingChangeId <em>Rejecting Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejecting Change Id</em>' attribute.
	 * @see #getRejectingChangeId()
	 * @generated
	 */
	void setRejectingChangeId(String value);

} // MovementType