/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Managed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ManagedElement#getCaption <em>Caption</em>}</li>
 *   <li>{@link es.tid.cim.ManagedElement#getDescription <em>Description</em>}</li>
 *   <li>{@link es.tid.cim.ManagedElement#getElementName <em>Element Name</em>}</li>
 *   <li>{@link es.tid.cim.ManagedElement#getComponents <em>Components</em>}</li>
 *   <li>{@link es.tid.cim.ManagedElement#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.tid.cim.ManagedElement#getElementCapabilities <em>Element Capabilities</em>}</li>
 *   <li>{@link es.tid.cim.ManagedElement#getHostedDependency <em>Hosted Dependency</em>}</li>
 *   <li>{@link es.tid.cim.ManagedElement#getElementSettingData <em>Element Setting Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getManagedElement()
 * @model abstract="true"
 * @generated
 */
public interface ManagedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see es.tid.cim.CimPackage#getManagedElement_Caption()
	 * @model
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link es.tid.cim.ManagedElement#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.tid.cim.CimPackage#getManagedElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.tid.cim.ManagedElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see es.tid.cim.CimPackage#getManagedElement_ElementName()
	 * @model
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link es.tid.cim.ManagedElement#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link es.tid.cim.ManagedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see es.tid.cim.CimPackage#getManagedElement_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ManagedElement> getComponents();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ManagedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see es.tid.cim.CimPackage#getManagedElement_Dependencies()
	 * @model
	 * @generated
	 */
	EList<ManagedElement> getDependencies();

	/**
	 * Returns the value of the '<em><b>Element Capabilities</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.Capabilities}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Capabilities</em>' reference list.
	 * @see es.tid.cim.CimPackage#getManagedElement_ElementCapabilities()
	 * @model
	 * @generated
	 */
	EList<Capabilities> getElementCapabilities();

	/**
	 * Returns the value of the '<em><b>Hosted Dependency</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ManagedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Dependency</em>' reference list.
	 * @see es.tid.cim.CimPackage#getManagedElement_HostedDependency()
	 * @model
	 * @generated
	 */
	EList<ManagedElement> getHostedDependency();

	/**
	 * Returns the value of the '<em><b>Element Setting Data</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.ElementSettingData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Setting Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Setting Data</em>' reference list.
	 * @see es.tid.cim.CimPackage#getManagedElement_ElementSettingData()
	 * @model
	 * @generated
	 */
	EList<ElementSettingData> getElementSettingData();

} // ManagedElement
