/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deletion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getChangeInfo <em>Change Info</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getDeletions <em>Deletions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getCutOffs <em>Cut Offs</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getAcceptanceState <em>Acceptance State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getMultiDeletionSpanned <em>Multi Deletion Spanned</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getPosition <em>Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getRejectingChangeId <em>Rejecting Change Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType()
 * @model extendedMetaData="name='deletion_._type' kind='elementOnly'"
 * @generated
 */
public interface DeletionType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_ChangeInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='change-info' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	ChangeInfoType getChangeInfo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getChangeInfo <em>Change Info</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	DependenciesType getDependencies();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getDependencies <em>Dependencies</em>}' containment reference.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_Deletions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deletions' namespace='##targetNamespace'"
	 * @generated
	 */
	DeletionsType getDeletions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getDeletions <em>Deletions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletions</em>' containment reference.
	 * @see #getDeletions()
	 * @generated
	 */
	void setDeletions(DeletionsType value);

	/**
	 * Returns the value of the '<em><b>Cut Offs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cut Offs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Offs</em>' containment reference.
	 * @see #setCutOffs(CutOffsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_CutOffs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cut-offs' namespace='##targetNamespace'"
	 * @generated
	 */
	CutOffsType getCutOffs();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getCutOffs <em>Cut Offs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Offs</em>' containment reference.
	 * @see #getCutOffs()
	 * @generated
	 */
	void setCutOffs(CutOffsType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_AcceptanceState()
	 * @model default="pending" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='acceptance-state' namespace='##targetNamespace'"
	 * @generated
	 */
	AcceptanceStateType getAcceptanceState();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getAcceptanceState <em>Acceptance State</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getAcceptanceState <em>Acceptance State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcceptanceState()
	 * @see #getAcceptanceState()
	 * @see #setAcceptanceState(AcceptanceStateType)
	 * @generated
	 */
	void unsetAcceptanceState();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getAcceptanceState <em>Acceptance State</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_Id()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Multi Deletion Spanned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Deletion Spanned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Deletion Spanned</em>' attribute.
	 * @see #setMultiDeletionSpanned(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_MultiDeletionSpanned()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='multi-deletion-spanned' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMultiDeletionSpanned();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getMultiDeletionSpanned <em>Multi Deletion Spanned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Deletion Spanned</em>' attribute.
	 * @see #getMultiDeletionSpanned()
	 * @generated
	 */
	void setMultiDeletionSpanned(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_Position()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_RejectingChangeId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='rejecting-change-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRejectingChangeId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getRejectingChangeId <em>Rejecting Change Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejecting Change Id</em>' attribute.
	 * @see #getRejectingChangeId()
	 * @generated
	 */
	void setRejectingChangeId(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_Table()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getDeletionType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.DeletionType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // DeletionType
