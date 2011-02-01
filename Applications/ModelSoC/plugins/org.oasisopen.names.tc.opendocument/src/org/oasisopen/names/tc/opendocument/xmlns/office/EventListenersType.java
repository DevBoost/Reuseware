/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Listeners Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType#getEventListener <em>Event Listener</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType#getEventListener1 <em>Event Listener1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getEventListenersType()
 * @model extendedMetaData="name='event-listeners_._type' kind='elementOnly'"
 * @generated
 */
public interface EventListenersType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getEventListenersType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Event Listener</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Listener</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listener</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getEventListenersType_EventListener()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event-listener' namespace='urn:oasis:names:tc:opendocument:xmlns:script:1.0' group='#group:0'"
	 * @generated
	 */
	EList<EventListenerType> getEventListener();

	/**
	 * Returns the value of the '<em><b>Event Listener1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Listener1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listener1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getEventListenersType_EventListener1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event-listener' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0' group='#group:0'"
	 * @generated
	 */
	EList<org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType> getEventListener1();

} // EventListenersType
