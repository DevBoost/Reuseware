/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.animation;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAnimationElementGroup <em>Animation Element Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAnimationElement <em>Animation Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAccelerate <em>Accelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAutoReverse <em>Auto Reverse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDecelerate <em>Decelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDur <em>Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEndsync <em>Endsync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFill <em>Fill</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFillDefault <em>Fill Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getIterateInterval <em>Iterate Interval</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getIterateType <em>Iterate Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getMasterElement <em>Master Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetClass <em>Preset Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetId <em>Preset Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetSubType <em>Preset Sub Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRepeatDur <em>Repeat Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestartDefault <em>Restart Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getSubItem <em>Sub Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType()
 * @model extendedMetaData="name='iterate_._type' kind='elementOnly'"
 * @generated
 */
public interface IterateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Animation Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation Element Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation Element Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_AnimationElementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='animation-element:group' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	FeatureMap getAnimationElementGroup();

	/**
	 * Returns the value of the '<em><b>Animation Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation Element</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_AnimationElement()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='animation-element' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element:group'"
	 * @generated
	 */
	EList<EObject> getAnimationElement();

	/**
	 * Returns the value of the '<em><b>Accelerate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accelerate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accelerate</em>' attribute.
	 * @see #isSetAccelerate()
	 * @see #unsetAccelerate()
	 * @see #setAccelerate(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_Accelerate()
	 * @model default="0.0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='accelerate' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	double getAccelerate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAccelerate <em>Accelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accelerate</em>' attribute.
	 * @see #isSetAccelerate()
	 * @see #unsetAccelerate()
	 * @see #getAccelerate()
	 * @generated
	 */
	void setAccelerate(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAccelerate <em>Accelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccelerate()
	 * @see #getAccelerate()
	 * @see #setAccelerate(double)
	 * @generated
	 */
	void unsetAccelerate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAccelerate <em>Accelerate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accelerate</em>' attribute is set.
	 * @see #unsetAccelerate()
	 * @see #getAccelerate()
	 * @see #setAccelerate(double)
	 * @generated
	 */
	boolean isSetAccelerate();

	/**
	 * Returns the value of the '<em><b>Auto Reverse</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Reverse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Reverse</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoReverse()
	 * @see #unsetAutoReverse()
	 * @see #setAutoReverse(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_AutoReverse()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='autoReverse' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoReverse();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAutoReverse <em>Auto Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Reverse</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutoReverse()
	 * @see #unsetAutoReverse()
	 * @see #getAutoReverse()
	 * @generated
	 */
	void setAutoReverse(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAutoReverse <em>Auto Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoReverse()
	 * @see #getAutoReverse()
	 * @see #setAutoReverse(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutoReverse();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getAutoReverse <em>Auto Reverse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Reverse</em>' attribute is set.
	 * @see #unsetAutoReverse()
	 * @see #getAutoReverse()
	 * @see #setAutoReverse(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutoReverse();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_Begin()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='begin' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getBegin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(String value);

	/**
	 * Returns the value of the '<em><b>Decelerate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decelerate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decelerate</em>' attribute.
	 * @see #isSetDecelerate()
	 * @see #unsetDecelerate()
	 * @see #setDecelerate(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_Decelerate()
	 * @model default="0.0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='decelerate' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	double getDecelerate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDecelerate <em>Decelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decelerate</em>' attribute.
	 * @see #isSetDecelerate()
	 * @see #unsetDecelerate()
	 * @see #getDecelerate()
	 * @generated
	 */
	void setDecelerate(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDecelerate <em>Decelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecelerate()
	 * @see #getDecelerate()
	 * @see #setDecelerate(double)
	 * @generated
	 */
	void unsetDecelerate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDecelerate <em>Decelerate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Decelerate</em>' attribute is set.
	 * @see #unsetDecelerate()
	 * @see #getDecelerate()
	 * @see #setDecelerate(double)
	 * @generated
	 */
	boolean isSetDecelerate();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_Dur()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='dur' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getDur();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getDur <em>Dur</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_End()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='end' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Endsync</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endsync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endsync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType
	 * @see #isSetEndsync()
	 * @see #unsetEndsync()
	 * @see #setEndsync(EndsyncType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_Endsync()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='endsync' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	EndsyncType getEndsync();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEndsync <em>Endsync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endsync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType
	 * @see #isSetEndsync()
	 * @see #unsetEndsync()
	 * @see #getEndsync()
	 * @generated
	 */
	void setEndsync(EndsyncType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEndsync <em>Endsync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndsync()
	 * @see #getEndsync()
	 * @see #setEndsync(EndsyncType)
	 * @generated
	 */
	void unsetEndsync();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getEndsync <em>Endsync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endsync</em>' attribute is set.
	 * @see #unsetEndsync()
	 * @see #getEndsync()
	 * @see #setEndsync(EndsyncType)
	 * @generated
	 */
	boolean isSetEndsync();

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillType
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #setFill(FillType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_Fill()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fill' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	FillType getFill();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillType
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #getFill()
	 * @generated
	 */
	void setFill(FillType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFill()
	 * @see #getFill()
	 * @see #setFill(FillType)
	 * @generated
	 */
	void unsetFill();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFill <em>Fill</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill</em>' attribute is set.
	 * @see #unsetFill()
	 * @see #getFill()
	 * @see #setFill(FillType)
	 * @generated
	 */
	boolean isSetFill();

	/**
	 * Returns the value of the '<em><b>Fill Default</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Default</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType
	 * @see #isSetFillDefault()
	 * @see #unsetFillDefault()
	 * @see #setFillDefault(FillDefaultType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_FillDefault()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fillDefault' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	FillDefaultType getFillDefault();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFillDefault <em>Fill Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Default</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType
	 * @see #isSetFillDefault()
	 * @see #unsetFillDefault()
	 * @see #getFillDefault()
	 * @generated
	 */
	void setFillDefault(FillDefaultType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFillDefault <em>Fill Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillDefault()
	 * @see #getFillDefault()
	 * @see #setFillDefault(FillDefaultType)
	 * @generated
	 */
	void unsetFillDefault();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getFillDefault <em>Fill Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Default</em>' attribute is set.
	 * @see #unsetFillDefault()
	 * @see #getFillDefault()
	 * @see #setFillDefault(FillDefaultType)
	 * @generated
	 */
	boolean isSetFillDefault();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_GroupId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='group-id' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getId <em>Id</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_IterateInterval()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='iterate-interval' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getIterateInterval();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getIterateInterval <em>Iterate Interval</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_IterateType()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='iterate-type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIterateType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getIterateType <em>Iterate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterate Type</em>' attribute.
	 * @see #getIterateType()
	 * @generated
	 */
	void setIterateType(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_MasterElement()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='master-element' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getMasterElement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getMasterElement <em>Master Element</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_NodeType()
	 * @model default="default" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='node-type' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	NodeTypeType getNodeType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getNodeType <em>Node Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeType()
	 * @see #getNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @generated
	 */
	void unsetNodeType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getNodeType <em>Node Type</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_PresetClass()
	 * @model default="custom" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='preset-class' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	PresetClassType getPresetClass();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetClass <em>Preset Class</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetClass <em>Preset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresetClass()
	 * @see #getPresetClass()
	 * @see #setPresetClass(PresetClassType)
	 * @generated
	 */
	void unsetPresetClass();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetClass <em>Preset Class</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_PresetId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='preset-id' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getPresetId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetId <em>Preset Id</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_PresetSubType()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='preset-sub-type' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getPresetSubType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getPresetSubType <em>Preset Sub Type</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_RepeatCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountType"
	 *        extendedMetaData="kind='attribute' name='repeatCount' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	Object getRepeatCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRepeatCount <em>Repeat Count</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_RepeatDur()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='repeatDur' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getRepeatDur();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRepeatDur <em>Repeat Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Dur</em>' attribute.
	 * @see #getRepeatDur()
	 * @generated
	 */
	void setRepeatDur(String value);

	/**
	 * Returns the value of the '<em><b>Restart</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType
	 * @see #isSetRestart()
	 * @see #unsetRestart()
	 * @see #setRestart(RestartType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_Restart()
	 * @model default="default" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='restart' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	RestartType getRestart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType
	 * @see #isSetRestart()
	 * @see #unsetRestart()
	 * @see #getRestart()
	 * @generated
	 */
	void setRestart(RestartType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestart()
	 * @see #getRestart()
	 * @see #setRestart(RestartType)
	 * @generated
	 */
	void unsetRestart();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestart <em>Restart</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Restart</em>' attribute is set.
	 * @see #unsetRestart()
	 * @see #getRestart()
	 * @see #setRestart(RestartType)
	 * @generated
	 */
	boolean isSetRestart();

	/**
	 * Returns the value of the '<em><b>Restart Default</b></em>' attribute.
	 * The default value is <code>"inherit"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Default</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType
	 * @see #isSetRestartDefault()
	 * @see #unsetRestartDefault()
	 * @see #setRestartDefault(RestartDefaultType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_RestartDefault()
	 * @model default="inherit" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='restartDefault' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	RestartDefaultType getRestartDefault();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestartDefault <em>Restart Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Default</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType
	 * @see #isSetRestartDefault()
	 * @see #unsetRestartDefault()
	 * @see #getRestartDefault()
	 * @generated
	 */
	void setRestartDefault(RestartDefaultType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestartDefault <em>Restart Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestartDefault()
	 * @see #getRestartDefault()
	 * @see #setRestartDefault(RestartDefaultType)
	 * @generated
	 */
	void unsetRestartDefault();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getRestartDefault <em>Restart Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Restart Default</em>' attribute is set.
	 * @see #unsetRestartDefault()
	 * @see #getRestartDefault()
	 * @see #setRestartDefault(RestartDefaultType)
	 * @generated
	 */
	boolean isSetRestartDefault();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_SubItem()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='sub-item' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubItem();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getSubItem <em>Sub Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Item</em>' attribute.
	 * @see #getSubItem()
	 * @generated
	 */
	void setSubItem(String value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' attribute.
	 * @see #setTargetElement(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getIterateType_TargetElement()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='targetElement' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getTargetElement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType#getTargetElement <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' attribute.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(String value);

} // IterateType
