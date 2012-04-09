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
package org.oasisopen.names.tc.opendocument.xmlns.animation;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimate <em>Animate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateColor <em>Animate Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateMotion <em>Animate Motion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateTransform <em>Animate Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudio <em>Audio</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getCommand <em>Command</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterate <em>Iterate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getPar <em>Par</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getParam <em>Param</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSeq <em>Seq</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSet <em>Set</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getTransitionFilter <em>Transition Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudioLevel <em>Audio Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolation <em>Color Interpolation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolationDirection <em>Color Interpolation Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getCommand1 <em>Command1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterateInterval <em>Iterate Interval</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterateType <em>Iterate Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSubItem <em>Sub Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Animate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animate</em>' containment reference.
	 * @see #setAnimate(AnimateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Animate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='animate' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	AnimateType getAnimate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimate <em>Animate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animate</em>' containment reference.
	 * @see #getAnimate()
	 * @generated
	 */
	void setAnimate(AnimateType value);

	/**
	 * Returns the value of the '<em><b>Animate Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animate Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animate Color</em>' containment reference.
	 * @see #setAnimateColor(AnimateColorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_AnimateColor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='animateColor' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	AnimateColorType getAnimateColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateColor <em>Animate Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animate Color</em>' containment reference.
	 * @see #getAnimateColor()
	 * @generated
	 */
	void setAnimateColor(AnimateColorType value);

	/**
	 * Returns the value of the '<em><b>Animate Motion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animate Motion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animate Motion</em>' containment reference.
	 * @see #setAnimateMotion(AnimateMotionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_AnimateMotion()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='animateMotion' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	AnimateMotionType getAnimateMotion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateMotion <em>Animate Motion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animate Motion</em>' containment reference.
	 * @see #getAnimateMotion()
	 * @generated
	 */
	void setAnimateMotion(AnimateMotionType value);

	/**
	 * Returns the value of the '<em><b>Animate Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animate Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animate Transform</em>' containment reference.
	 * @see #setAnimateTransform(AnimateTransformType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_AnimateTransform()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='animateTransform' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	AnimateTransformType getAnimateTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAnimateTransform <em>Animate Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animate Transform</em>' containment reference.
	 * @see #getAnimateTransform()
	 * @generated
	 */
	void setAnimateTransform(AnimateTransformType value);

	/**
	 * Returns the value of the '<em><b>Audio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio</em>' containment reference.
	 * @see #setAudio(AudioType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Audio()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='audio' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	AudioType getAudio();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudio <em>Audio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio</em>' containment reference.
	 * @see #getAudio()
	 * @generated
	 */
	void setAudio(AudioType value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(CommandType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Command()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='command' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	CommandType getCommand();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(CommandType value);

	/**
	 * Returns the value of the '<em><b>Iterate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterate</em>' containment reference.
	 * @see #setIterate(IterateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Iterate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='iterate' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	IterateType getIterate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterate <em>Iterate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterate</em>' containment reference.
	 * @see #getIterate()
	 * @generated
	 */
	void setIterate(IterateType value);

	/**
	 * Returns the value of the '<em><b>Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Par</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par</em>' containment reference.
	 * @see #setPar(ParType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Par()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='par' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	ParType getPar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getPar <em>Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par</em>' containment reference.
	 * @see #getPar()
	 * @generated
	 */
	void setPar(ParType value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference.
	 * @see #setParam(ParamType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Param()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamType getParam();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getParam <em>Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' containment reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(ParamType value);

	/**
	 * Returns the value of the '<em><b>Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq</em>' containment reference.
	 * @see #setSeq(SeqType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Seq()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seq' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	SeqType getSeq();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSeq <em>Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq</em>' containment reference.
	 * @see #getSeq()
	 * @generated
	 */
	void setSeq(SeqType value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' containment reference.
	 * @see #setSet(SetType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Set()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='set' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	SetType getSet();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSet <em>Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' containment reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(SetType value);

	/**
	 * Returns the value of the '<em><b>Transition Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Filter</em>' containment reference.
	 * @see #setTransitionFilter(TransitionFilterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_TransitionFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transitionFilter' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element'"
	 * @generated
	 */
	TransitionFilterType getTransitionFilter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getTransitionFilter <em>Transition Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Filter</em>' containment reference.
	 * @see #getTransitionFilter()
	 * @generated
	 */
	void setTransitionFilter(TransitionFilterType value);

	/**
	 * Returns the value of the '<em><b>Audio Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Level</em>' attribute.
	 * @see #isSetAudioLevel()
	 * @see #unsetAudioLevel()
	 * @see #setAudioLevel(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_AudioLevel()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='audio-level' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAudioLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudioLevel <em>Audio Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio Level</em>' attribute.
	 * @see #isSetAudioLevel()
	 * @see #unsetAudioLevel()
	 * @see #getAudioLevel()
	 * @generated
	 */
	void setAudioLevel(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudioLevel <em>Audio Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAudioLevel()
	 * @see #getAudioLevel()
	 * @see #setAudioLevel(double)
	 * @generated
	 */
	void unsetAudioLevel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getAudioLevel <em>Audio Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Audio Level</em>' attribute is set.
	 * @see #unsetAudioLevel()
	 * @see #getAudioLevel()
	 * @see #setAudioLevel(double)
	 * @generated
	 */
	boolean isSetAudioLevel();

	/**
	 * Returns the value of the '<em><b>Color Interpolation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Interpolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Interpolation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType
	 * @see #isSetColorInterpolation()
	 * @see #unsetColorInterpolation()
	 * @see #setColorInterpolation(ColorInterpolationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_ColorInterpolation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='color-interpolation' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorInterpolationType getColorInterpolation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolation <em>Color Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Interpolation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType
	 * @see #isSetColorInterpolation()
	 * @see #unsetColorInterpolation()
	 * @see #getColorInterpolation()
	 * @generated
	 */
	void setColorInterpolation(ColorInterpolationType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolation <em>Color Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColorInterpolation()
	 * @see #getColorInterpolation()
	 * @see #setColorInterpolation(ColorInterpolationType)
	 * @generated
	 */
	void unsetColorInterpolation();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolation <em>Color Interpolation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color Interpolation</em>' attribute is set.
	 * @see #unsetColorInterpolation()
	 * @see #getColorInterpolation()
	 * @see #setColorInterpolation(ColorInterpolationType)
	 * @generated
	 */
	boolean isSetColorInterpolation();

	/**
	 * Returns the value of the '<em><b>Color Interpolation Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Interpolation Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Interpolation Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType
	 * @see #isSetColorInterpolationDirection()
	 * @see #unsetColorInterpolationDirection()
	 * @see #setColorInterpolationDirection(ColorInterpolationDirectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_ColorInterpolationDirection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='color-interpolation-direction' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorInterpolationDirectionType getColorInterpolationDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolationDirection <em>Color Interpolation Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Interpolation Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType
	 * @see #isSetColorInterpolationDirection()
	 * @see #unsetColorInterpolationDirection()
	 * @see #getColorInterpolationDirection()
	 * @generated
	 */
	void setColorInterpolationDirection(ColorInterpolationDirectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolationDirection <em>Color Interpolation Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColorInterpolationDirection()
	 * @see #getColorInterpolationDirection()
	 * @see #setColorInterpolationDirection(ColorInterpolationDirectionType)
	 * @generated
	 */
	void unsetColorInterpolationDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getColorInterpolationDirection <em>Color Interpolation Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color Interpolation Direction</em>' attribute is set.
	 * @see #unsetColorInterpolationDirection()
	 * @see #getColorInterpolationDirection()
	 * @see #setColorInterpolationDirection(ColorInterpolationDirectionType)
	 * @generated
	 */
	boolean isSetColorInterpolationDirection();

	/**
	 * Returns the value of the '<em><b>Command1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command1</em>' attribute.
	 * @see #setCommand1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Command1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='command' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCommand1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getCommand1 <em>Command1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command1</em>' attribute.
	 * @see #getCommand1()
	 * @generated
	 */
	void setCommand1(String value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Formula()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='formula' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Iterate Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterate Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterate Interval</em>' attribute.
	 * @see #setIterateInterval(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_IterateInterval()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='iterate-interval' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getIterateInterval();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterateInterval <em>Iterate Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterate Interval</em>' attribute.
	 * @see #getIterateInterval()
	 * @generated
	 */
	void setIterateInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Iterate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterate Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterate Type</em>' attribute.
	 * @see #setIterateType(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_IterateType()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='iterate-type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIterateType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getIterateType <em>Iterate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterate Type</em>' attribute.
	 * @see #getIterateType()
	 * @generated
	 */
	void setIterateType(String value);

	/**
	 * Returns the value of the '<em><b>Sub Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Item</em>' attribute.
	 * @see #setSubItem(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getDocumentRoot_SubItem()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='sub-item' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubItem();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot#getSubItem <em>Sub Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Item</em>' attribute.
	 * @see #getSubItem()
	 * @generated
	 */
	void setSubItem(String value);

} // DocumentRoot
