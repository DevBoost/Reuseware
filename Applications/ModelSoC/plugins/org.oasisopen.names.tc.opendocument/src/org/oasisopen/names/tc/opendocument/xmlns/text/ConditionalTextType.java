/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getStringValueIfFalse <em>String Value If False</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getStringValueIfTrue <em>String Value If True</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConditionalTextType()
 * @model extendedMetaData="name='conditional-text_._type' kind='mixed'"
 * @generated
 */
public interface ConditionalTextType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConditionalTextType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConditionalTextType_Condition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Formula" required="true"
	 *        extendedMetaData="kind='attribute' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCurrentValue()
	 * @see #unsetCurrentValue()
	 * @see #setCurrentValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConditionalTextType_CurrentValue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='current-value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCurrentValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCurrentValue()
	 * @see #unsetCurrentValue()
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentValue()
	 * @see #getCurrentValue()
	 * @see #setCurrentValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCurrentValue();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getCurrentValue <em>Current Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Value</em>' attribute is set.
	 * @see #unsetCurrentValue()
	 * @see #getCurrentValue()
	 * @see #setCurrentValue(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCurrentValue();

	/**
	 * Returns the value of the '<em><b>String Value If False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value If False</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value If False</em>' attribute.
	 * @see #setStringValueIfFalse(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConditionalTextType_StringValueIfFalse()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='string-value-if-false' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStringValueIfFalse();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getStringValueIfFalse <em>String Value If False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value If False</em>' attribute.
	 * @see #getStringValueIfFalse()
	 * @generated
	 */
	void setStringValueIfFalse(String value);

	/**
	 * Returns the value of the '<em><b>String Value If True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value If True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value If True</em>' attribute.
	 * @see #setStringValueIfTrue(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getConditionalTextType_StringValueIfTrue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='string-value-if-true' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStringValueIfTrue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ConditionalTextType#getStringValueIfTrue <em>String Value If True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value If True</em>' attribute.
	 * @see #getStringValueIfTrue()
	 * @generated
	 */
	void setStringValueIfTrue(String value);

} // ConditionalTextType
