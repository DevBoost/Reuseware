/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.smil;

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
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccelerate <em>Accelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccumulate <em>Accumulate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAutoReverse <em>Auto Reverse</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getBy <em>By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getCalcMode <em>Calc Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDecelerate <em>Decelerate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDur <em>Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEnd <em>End</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEndsync <em>Endsync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFill <em>Fill</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFillDefault <em>Fill Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFrom <em>From</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getKeySplines <em>Key Splines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getKeyTimes <em>Key Times</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getMode <em>Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRepeatDur <em>Repeat Dur</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestart <em>Restart</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestartDefault <em>Restart Default</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getTo <em>To</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Mixed()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Accelerate</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Accelerate()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='accelerate' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAccelerate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccelerate <em>Accelerate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccelerate <em>Accelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccelerate()
	 * @see #getAccelerate()
	 * @see #setAccelerate(double)
	 * @generated
	 */
	void unsetAccelerate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccelerate <em>Accelerate</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Accumulate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='accumulate' namespace='##targetNamespace'"
	 * @generated
	 */
	AccumulateType getAccumulate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccumulate <em>Accumulate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccumulate <em>Accumulate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccumulate()
	 * @see #getAccumulate()
	 * @see #setAccumulate(AccumulateType)
	 * @generated
	 */
	void unsetAccumulate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAccumulate <em>Accumulate</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Additive()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='additive' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditiveType getAdditive();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAdditive <em>Additive</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAdditive <em>Additive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdditive()
	 * @see #getAdditive()
	 * @see #setAdditive(AdditiveType)
	 * @generated
	 */
	void unsetAdditive();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAdditive <em>Additive</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_AttributeName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='attributeName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Auto Reverse</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_AutoReverse()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='autoReverse' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutoReverse();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAutoReverse <em>Auto Reverse</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAutoReverse <em>Auto Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoReverse()
	 * @see #getAutoReverse()
	 * @see #setAutoReverse(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutoReverse();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getAutoReverse <em>Auto Reverse</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Begin()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='begin' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBegin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getBegin <em>Begin</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_By()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='by' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getBy <em>By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By</em>' attribute.
	 * @see #getBy()
	 * @generated
	 */
	void setBy(String value);

	/**
	 * Returns the value of the '<em><b>Calc Mode</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_CalcMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='calcMode' namespace='##targetNamespace'"
	 * @generated
	 */
	CalcModeType getCalcMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getCalcMode <em>Calc Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getCalcMode <em>Calc Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalcMode()
	 * @see #getCalcMode()
	 * @see #setCalcMode(CalcModeType)
	 * @generated
	 */
	void unsetCalcMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getCalcMode <em>Calc Mode</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Decelerate()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='decelerate' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDecelerate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDecelerate <em>Decelerate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDecelerate <em>Decelerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecelerate()
	 * @see #getDecelerate()
	 * @see #setDecelerate(double)
	 * @generated
	 */
	void unsetDecelerate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDecelerate <em>Decelerate</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Direction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDirection <em>Direction</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionType)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDirection <em>Direction</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Dur()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='dur' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDur();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getDur <em>Dur</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_End()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEnd <em>End</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Endsync()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='endsync' namespace='##targetNamespace'"
	 * @generated
	 */
	EndsyncType getEndsync();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEndsync <em>Endsync</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEndsync <em>Endsync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndsync()
	 * @see #getEndsync()
	 * @see #setEndsync(EndsyncType)
	 * @generated
	 */
	void unsetEndsync();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getEndsync <em>Endsync</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Fill()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fill' namespace='##targetNamespace'"
	 * @generated
	 */
	FillType getFill();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFill <em>Fill</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFill()
	 * @see #getFill()
	 * @see #setFill(FillType)
	 * @generated
	 */
	void unsetFill();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFill <em>Fill</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_FillDefault()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fillDefault' namespace='##targetNamespace'"
	 * @generated
	 */
	FillDefaultType getFillDefault();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFillDefault <em>Fill Default</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFillDefault <em>Fill Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillDefault()
	 * @see #getFillDefault()
	 * @see #setFillDefault(FillDefaultType)
	 * @generated
	 */
	void unsetFillDefault();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFillDefault <em>Fill Default</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_From()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='from' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Key Splines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Splines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Splines</em>' attribute.
	 * @see #setKeySplines(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_KeySplines()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='keySplines' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeySplines();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getKeySplines <em>Key Splines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Splines</em>' attribute.
	 * @see #getKeySplines()
	 * @generated
	 */
	void setKeySplines(String value);

	/**
	 * Returns the value of the '<em><b>Key Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Times</em>' attribute.
	 * @see #setKeyTimes(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_KeyTimes()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='keyTimes' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeyTimes();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getKeyTimes <em>Key Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Times</em>' attribute.
	 * @see #getKeyTimes()
	 * @generated
	 */
	void setKeyTimes(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Mode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ModeType getMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getMode <em>Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(ModeType)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getMode <em>Mode</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_RepeatCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountType"
	 *        extendedMetaData="kind='attribute' name='repeatCount' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getRepeatCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRepeatCount <em>Repeat Count</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_RepeatDur()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='repeatDur' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRepeatDur();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRepeatDur <em>Repeat Dur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Dur</em>' attribute.
	 * @see #getRepeatDur()
	 * @generated
	 */
	void setRepeatDur(String value);

	/**
	 * Returns the value of the '<em><b>Restart</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Restart()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='restart' namespace='##targetNamespace'"
	 * @generated
	 */
	RestartType getRestart();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestart <em>Restart</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestart()
	 * @see #getRestart()
	 * @see #setRestart(RestartType)
	 * @generated
	 */
	void unsetRestart();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestart <em>Restart</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_RestartDefault()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='restartDefault' namespace='##targetNamespace'"
	 * @generated
	 */
	RestartDefaultType getRestartDefault();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestartDefault <em>Restart Default</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestartDefault <em>Restart Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestartDefault()
	 * @see #getRestartDefault()
	 * @see #setRestartDefault(RestartDefaultType)
	 * @generated
	 */
	void unsetRestartDefault();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getRestartDefault <em>Restart Default</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Subtype()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='subtype' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getSubtype <em>Subtype</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_TargetElement()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='targetElement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetElement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getTargetElement <em>Target Element</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_To()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='to' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getTo <em>To</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Type()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getType <em>Type</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#getDocumentRoot_Values()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='values' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

} // DocumentRoot
