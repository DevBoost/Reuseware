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

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getAudioLevel <em>Audio Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getDur <em>Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getMasterElement <em>Master Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetClass <em>Preset Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetId <em>Preset Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetSubType <em>Preset Sub Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getRepeatDur <em>Repeat Dur</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType()
 * @model extendedMetaData="name='audio_._type' kind='empty'"
 * @generated
 */
public interface AudioType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_AudioLevel()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='audio-level' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAudioLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getAudioLevel <em>Audio Level</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getAudioLevel <em>Audio Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAudioLevel()
	 * @see #getAudioLevel()
	 * @see #setAudioLevel(double)
	 * @generated
	 */
	void unsetAudioLevel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getAudioLevel <em>Audio Level</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_Begin()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='begin' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getBegin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(String value);

	/**
	 * Returns the value of the '<em><b>Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dur</em>' attribute.
	 * @see #setDur(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_Dur()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='dur' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getDur();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getDur <em>Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dur</em>' attribute.
	 * @see #getDur()
	 * @generated
	 */
	void setDur(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_End()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='end' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_GroupId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='group-id' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_Href()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Master Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Element</em>' attribute.
	 * @see #setMasterElement(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_MasterElement()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='master-element' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getMasterElement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getMasterElement <em>Master Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Element</em>' attribute.
	 * @see #getMasterElement()
	 * @generated
	 */
	void setMasterElement(String value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
	 * @see #isSetNodeType()
	 * @see #unsetNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_NodeType()
	 * @model default="default" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='node-type' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	NodeTypeType getNodeType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
	 * @see #isSetNodeType()
	 * @see #unsetNodeType()
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(NodeTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeType()
	 * @see #getNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @generated
	 */
	void unsetNodeType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getNodeType <em>Node Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Type</em>' attribute is set.
	 * @see #unsetNodeType()
	 * @see #getNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @generated
	 */
	boolean isSetNodeType();

	/**
	 * Returns the value of the '<em><b>Preset Class</b></em>' attribute.
	 * The default value is <code>"custom"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preset Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preset Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
	 * @see #isSetPresetClass()
	 * @see #unsetPresetClass()
	 * @see #setPresetClass(PresetClassType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_PresetClass()
	 * @model default="custom" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='preset-class' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	PresetClassType getPresetClass();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetClass <em>Preset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preset Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
	 * @see #isSetPresetClass()
	 * @see #unsetPresetClass()
	 * @see #getPresetClass()
	 * @generated
	 */
	void setPresetClass(PresetClassType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetClass <em>Preset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresetClass()
	 * @see #getPresetClass()
	 * @see #setPresetClass(PresetClassType)
	 * @generated
	 */
	void unsetPresetClass();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetClass <em>Preset Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preset Class</em>' attribute is set.
	 * @see #unsetPresetClass()
	 * @see #getPresetClass()
	 * @see #setPresetClass(PresetClassType)
	 * @generated
	 */
	boolean isSetPresetClass();

	/**
	 * Returns the value of the '<em><b>Preset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preset Id</em>' attribute.
	 * @see #setPresetId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_PresetId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='preset-id' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getPresetId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetId <em>Preset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preset Id</em>' attribute.
	 * @see #getPresetId()
	 * @generated
	 */
	void setPresetId(String value);

	/**
	 * Returns the value of the '<em><b>Preset Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preset Sub Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preset Sub Type</em>' attribute.
	 * @see #setPresetSubType(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_PresetSubType()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='preset-sub-type' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getPresetSubType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getPresetSubType <em>Preset Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preset Sub Type</em>' attribute.
	 * @see #getPresetSubType()
	 * @generated
	 */
	void setPresetSubType(String value);

	/**
	 * Returns the value of the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Count</em>' attribute.
	 * @see #setRepeatCount(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_RepeatCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountType"
	 *        extendedMetaData="kind='attribute' name='repeatCount' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	Object getRepeatCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getRepeatCount <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Count</em>' attribute.
	 * @see #getRepeatCount()
	 * @generated
	 */
	void setRepeatCount(Object value);

	/**
	 * Returns the value of the '<em><b>Repeat Dur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Dur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Dur</em>' attribute.
	 * @see #setRepeatDur(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getAudioType_RepeatDur()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='repeatDur' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getRepeatDur();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType#getRepeatDur <em>Repeat Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Dur</em>' attribute.
	 * @see #getRepeatDur()
	 * @generated
	 */
	void setRepeatDur(String value);

} // AudioType
