/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.animation;

import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccelerate <em>Accelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccumulate <em>Accumulate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAutoReverse <em>Auto Reverse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getBy <em>By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getCalcMode <em>Calc Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDecelerate <em>Decelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDur <em>Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFadeColor <em>Fade Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFill <em>Fill</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFillDefault <em>Fill Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFrom <em>From</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getMode <em>Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRepeatDur <em>Repeat Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestartDefault <em>Restart Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getSubItem <em>Sub Item</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getTo <em>To</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType()
 * @model extendedMetaData="name='transitionFilter_._type' kind='empty'"
 * @generated
 */
public interface TransitionFilterType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Accelerate()
	 * @model default="0.0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='accelerate' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	double getAccelerate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccelerate <em>Accelerate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccelerate <em>Accelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccelerate()
	 * @see #getAccelerate()
	 * @see #setAccelerate(double)
	 * @generated
	 */
	void unsetAccelerate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccelerate <em>Accelerate</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Accumulate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accumulate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accumulate</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType
	 * @see #isSetAccumulate()
	 * @see #unsetAccumulate()
	 * @see #setAccumulate(AccumulateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Accumulate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='accumulate' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	AccumulateType getAccumulate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccumulate <em>Accumulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accumulate</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType
	 * @see #isSetAccumulate()
	 * @see #unsetAccumulate()
	 * @see #getAccumulate()
	 * @generated
	 */
	void setAccumulate(AccumulateType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccumulate <em>Accumulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccumulate()
	 * @see #getAccumulate()
	 * @see #setAccumulate(AccumulateType)
	 * @generated
	 */
	void unsetAccumulate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAccumulate <em>Accumulate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accumulate</em>' attribute is set.
	 * @see #unsetAccumulate()
	 * @see #getAccumulate()
	 * @see #setAccumulate(AccumulateType)
	 * @generated
	 */
	boolean isSetAccumulate();

	/**
	 * Returns the value of the '<em><b>Additive</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType
	 * @see #isSetAdditive()
	 * @see #unsetAdditive()
	 * @see #setAdditive(AdditiveType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Additive()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='additive' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	AdditiveType getAdditive();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAdditive <em>Additive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType
	 * @see #isSetAdditive()
	 * @see #unsetAdditive()
	 * @see #getAdditive()
	 * @generated
	 */
	void setAdditive(AdditiveType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAdditive <em>Additive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdditive()
	 * @see #getAdditive()
	 * @see #setAdditive(AdditiveType)
	 * @generated
	 */
	void unsetAdditive();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAdditive <em>Additive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Additive</em>' attribute is set.
	 * @see #unsetAdditive()
	 * @see #getAdditive()
	 * @see #setAdditive(AdditiveType)
	 * @generated
	 */
	boolean isSetAdditive();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_AutoReverse()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='autoReverse' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoReverse();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAutoReverse <em>Auto Reverse</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAutoReverse <em>Auto Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoReverse()
	 * @see #getAutoReverse()
	 * @see #setAutoReverse(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutoReverse();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getAutoReverse <em>Auto Reverse</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Begin()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='begin' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getBegin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(String value);

	/**
	 * Returns the value of the '<em><b>By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By</em>' attribute.
	 * @see #setBy(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_By()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='by' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getBy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getBy <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By</em>' attribute.
	 * @see #getBy()
	 * @generated
	 */
	void setBy(String value);

	/**
	 * Returns the value of the '<em><b>Calc Mode</b></em>' attribute.
	 * The default value is <code>"discrete"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calc Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calc Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType
	 * @see #isSetCalcMode()
	 * @see #unsetCalcMode()
	 * @see #setCalcMode(CalcModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_CalcMode()
	 * @model default="discrete" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='calcMode' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	CalcModeType getCalcMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getCalcMode <em>Calc Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calc Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType
	 * @see #isSetCalcMode()
	 * @see #unsetCalcMode()
	 * @see #getCalcMode()
	 * @generated
	 */
	void setCalcMode(CalcModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getCalcMode <em>Calc Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalcMode()
	 * @see #getCalcMode()
	 * @see #setCalcMode(CalcModeType)
	 * @generated
	 */
	void unsetCalcMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getCalcMode <em>Calc Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Calc Mode</em>' attribute is set.
	 * @see #unsetCalcMode()
	 * @see #getCalcMode()
	 * @see #setCalcMode(CalcModeType)
	 * @generated
	 */
	boolean isSetCalcMode();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Decelerate()
	 * @model default="0.0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='decelerate' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	double getDecelerate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDecelerate <em>Decelerate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDecelerate <em>Decelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecelerate()
	 * @see #getDecelerate()
	 * @see #setDecelerate(double)
	 * @generated
	 */
	void unsetDecelerate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDecelerate <em>Decelerate</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"forward"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(DirectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Direction()
	 * @model default="forward" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	boolean isSetDirection();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Dur()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='dur' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getDur();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getDur <em>Dur</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_End()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='end' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Fade Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fade Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fade Color</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType
	 * @see #isSetFadeColor()
	 * @see #unsetFadeColor()
	 * @see #setFadeColor(FadeColorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_FadeColor()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='fadeColor' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	FadeColorType getFadeColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFadeColor <em>Fade Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fade Color</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType
	 * @see #isSetFadeColor()
	 * @see #unsetFadeColor()
	 * @see #getFadeColor()
	 * @generated
	 */
	void setFadeColor(FadeColorType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFadeColor <em>Fade Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFadeColor()
	 * @see #getFadeColor()
	 * @see #setFadeColor(FadeColorType)
	 * @generated
	 */
	void unsetFadeColor();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFadeColor <em>Fade Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fade Color</em>' attribute is set.
	 * @see #unsetFadeColor()
	 * @see #getFadeColor()
	 * @see #setFadeColor(FadeColorType)
	 * @generated
	 */
	boolean isSetFadeColor();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Fill()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fill' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	FillType getFill();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFill <em>Fill</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFill()
	 * @see #getFill()
	 * @see #setFill(FillType)
	 * @generated
	 */
	void unsetFill();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFill <em>Fill</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_FillDefault()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fillDefault' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	FillDefaultType getFillDefault();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFillDefault <em>Fill Default</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFillDefault <em>Fill Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillDefault()
	 * @see #getFillDefault()
	 * @see #setFillDefault(FillDefaultType)
	 * @generated
	 */
	void unsetFillDefault();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFillDefault <em>Fill Default</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute.
	 * @see #setFormula(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Formula()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='formula' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormula();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFormula <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' attribute.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_From()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='from' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(ModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Mode()
	 * @model default="in" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mode' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	ModeType getMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(ModeType)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(ModeType)
	 * @generated
	 */
	boolean isSetMode();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_RepeatCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountType"
	 *        extendedMetaData="kind='attribute' name='repeatCount' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	Object getRepeatCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRepeatCount <em>Repeat Count</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_RepeatDur()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='repeatDur' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getRepeatDur();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRepeatDur <em>Repeat Dur</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Restart()
	 * @model default="default" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='restart' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	RestartType getRestart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestart <em>Restart</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestart()
	 * @see #getRestart()
	 * @see #setRestart(RestartType)
	 * @generated
	 */
	void unsetRestart();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestart <em>Restart</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_RestartDefault()
	 * @model default="inherit" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='restartDefault' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	RestartDefaultType getRestartDefault();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestartDefault <em>Restart Default</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestartDefault <em>Restart Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestartDefault()
	 * @see #getRestartDefault()
	 * @see #setRestartDefault(RestartDefaultType)
	 * @generated
	 */
	void unsetRestartDefault();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getRestartDefault <em>Restart Default</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_SubItem()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='sub-item' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubItem();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getSubItem <em>Sub Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Item</em>' attribute.
	 * @see #getSubItem()
	 * @generated
	 */
	void setSubItem(String value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Subtype()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='subtype' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_TargetElement()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='targetElement' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getTargetElement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getTargetElement <em>Target Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' attribute.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_To()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='to' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Type()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#getTransitionFilterType_Values()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='values' namespace='urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0'"
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

} // TransitionFilterType
