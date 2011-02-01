/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.ShowType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Listener Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSound <em>Sound</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getAction <em>Action</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getStartScale <em>Start Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType()
 * @model extendedMetaData="name='event-listener_._type' kind='elementOnly'"
 * @generated
 */
public interface EventListenerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound</em>' containment reference.
	 * @see #setSound(SoundType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Sound()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sound' namespace='##targetNamespace'"
	 * @generated
	 */
	SoundType getSound();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSound <em>Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound</em>' containment reference.
	 * @see #getSound()
	 * @generated
	 */
	void setSound(SoundType value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #setAction(ActionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Action()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(ActionType)
	 * @generated
	 */
	void unsetAction();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getAction <em>Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action</em>' attribute is set.
	 * @see #unsetAction()
	 * @see #getAction()
	 * @see #setAction(ActionType)
	 * @generated
	 */
	boolean isSetAction();

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ActuateType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType1
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Actuate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType1 getActuate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType1
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType1)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType1)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(PresentationEffectDirections)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Direction()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationEffectDirections getDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PresentationEffectDirections value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(PresentationEffectDirections)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(PresentationEffectDirections)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #setEffect(PresentationEffects)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Effect()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='effect' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationEffects getEffect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(PresentationEffects value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffect()
	 * @see #getEffect()
	 * @see #setEffect(PresentationEffects)
	 * @generated
	 */
	void unsetEffect();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEffect <em>Effect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effect</em>' attribute is set.
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @see #setEffect(PresentationEffects)
	 * @generated
	 */
	boolean isSetEffect();

	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' attribute.
	 * @see #setEventName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_EventName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='event-name' namespace='urn:oasis:names:tc:opendocument:xmlns:script:1.0'"
	 * @generated
	 */
	String getEventName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getEventName <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' attribute.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Href()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ShowType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3.xlink.ShowType1
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Show()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType1 getShow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3.xlink.ShowType1
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType1)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType1)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"medium"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds
	 * @see #isSetSpeed()
	 * @see #unsetSpeed()
	 * @see #setSpeed(PresentationSpeeds)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Speed()
	 * @model default="medium" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='speed' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationSpeeds getSpeed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds
	 * @see #isSetSpeed()
	 * @see #unsetSpeed()
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(PresentationSpeeds value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeed()
	 * @see #getSpeed()
	 * @see #setSpeed(PresentationSpeeds)
	 * @generated
	 */
	void unsetSpeed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getSpeed <em>Speed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speed</em>' attribute is set.
	 * @see #unsetSpeed()
	 * @see #getSpeed()
	 * @see #setSpeed(PresentationSpeeds)
	 * @generated
	 */
	boolean isSetSpeed();

	/**
	 * Returns the value of the '<em><b>Start Scale</b></em>' attribute.
	 * The default value is <code>"100%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Scale</em>' attribute.
	 * @see #isSetStartScale()
	 * @see #unsetStartScale()
	 * @see #setStartScale(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_StartScale()
	 * @model default="100%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='start-scale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartScale();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getStartScale <em>Start Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Scale</em>' attribute.
	 * @see #isSetStartScale()
	 * @see #unsetStartScale()
	 * @see #getStartScale()
	 * @generated
	 */
	void setStartScale(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getStartScale <em>Start Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartScale()
	 * @see #getStartScale()
	 * @see #setStartScale(String)
	 * @generated
	 */
	void unsetStartScale();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getStartScale <em>Start Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Scale</em>' attribute is set.
	 * @see #unsetStartScale()
	 * @see #getStartScale()
	 * @see #setStartScale(String)
	 * @generated
	 */
	boolean isSetStartScale();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link org.w3.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' attribute.
	 * @see #setVerb(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getEventListenerType_Verb()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='verb' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVerb();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType#getVerb <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' attribute.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(BigInteger value);

} // EventListenerType
