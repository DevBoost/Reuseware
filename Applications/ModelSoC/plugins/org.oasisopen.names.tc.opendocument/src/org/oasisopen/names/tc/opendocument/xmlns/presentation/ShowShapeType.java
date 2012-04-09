/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Show Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSound <em>Sound</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getPathId <em>Path Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getShapeId <em>Shape Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getStartScale <em>Start Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getShowShapeType()
 * @model extendedMetaData="name='show-shape_._type' kind='elementOnly'"
 * @generated
 */
public interface ShowShapeType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getShowShapeType_Sound()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sound' namespace='##targetNamespace'"
	 * @generated
	 */
	SoundType getSound();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSound <em>Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound</em>' containment reference.
	 * @see #getSound()
	 * @generated
	 */
	void setSound(SoundType value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getShowShapeType_Delay()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='delay' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDelay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Duration value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getShowShapeType_Direction()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationEffectDirections getDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDirection <em>Direction</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(PresentationEffectDirections)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getDirection <em>Direction</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getShowShapeType_Effect()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='effect' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationEffects getEffect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getEffect <em>Effect</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffect()
	 * @see #getEffect()
	 * @see #setEffect(PresentationEffects)
	 * @generated
	 */
	void unsetEffect();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getEffect <em>Effect</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Path Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Id</em>' attribute.
	 * @see #setPathId(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getShowShapeType_PathId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='path-id' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPathId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getPathId <em>Path Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Id</em>' attribute.
	 * @see #getPathId()
	 * @generated
	 */
	void setPathId(Object value);

	/**
	 * Returns the value of the '<em><b>Shape Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Id</em>' attribute.
	 * @see #setShapeId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getShowShapeType_ShapeId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='shape-id' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getShapeId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getShapeId <em>Shape Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Id</em>' attribute.
	 * @see #getShapeId()
	 * @generated
	 */
	void setShapeId(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getShowShapeType_Speed()
	 * @model default="medium" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='speed' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationSpeeds getSpeed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSpeed <em>Speed</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeed()
	 * @see #getSpeed()
	 * @see #setSpeed(PresentationSpeeds)
	 * @generated
	 */
	void unsetSpeed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getSpeed <em>Speed</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getShowShapeType_StartScale()
	 * @model default="100%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='start-scale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartScale();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getStartScale <em>Start Scale</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getStartScale <em>Start Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartScale()
	 * @see #getStartScale()
	 * @see #setStartScale(String)
	 * @generated
	 */
	void unsetStartScale();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType#getStartScale <em>Start Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Scale</em>' attribute is set.
	 * @see #unsetStartScale()
	 * @see #getStartScale()
	 * @see #setStartScale(String)
	 * @generated
	 */
	boolean isSetStartScale();

} // ShowShapeType
