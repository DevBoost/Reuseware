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
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType2;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Property Type And Value List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue <em>List Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue1 <em>List Value1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue2 <em>List Value2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue3 <em>List Value3</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue11 <em>List Value11</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue4 <em>List Value4</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue21 <em>List Value21</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue5 <em>List Value5</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue31 <em>List Value31</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue6 <em>List Value6</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue41 <em>List Value41</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue7 <em>List Value7</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue51 <em>List Value51</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getListValue8 <em>List Value8</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList()
 * @model extendedMetaData="name='form-property-type-and-value-list' kind='elementOnly'"
 * @generated
 */
public interface FormPropertyTypeAndValueList extends EObject {
	/**
	 * Returns the value of the '<em><b>List Value</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ListValue:0'"
	 * @generated
	 */
	FeatureMap getListValue();

	/**
	 * Returns the value of the '<em><b>List Value1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value1</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-value' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0' group='#ListValue:0'"
	 * @generated
	 */
	EList<ListValueType5> getListValue1();

	/**
	 * Returns the value of the '<em><b>List Value2</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value2</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ListValue:2'"
	 * @generated
	 */
	FeatureMap getListValue2();

	/**
	 * Returns the value of the '<em><b>List Value3</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value3</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-value' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0' group='#ListValue:2'"
	 * @generated
	 */
	EList<ListValueType5> getListValue3();

	/**
	 * Returns the value of the '<em><b>List Value11</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value11</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value11</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue11()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ListValue1:4'"
	 * @generated
	 */
	FeatureMap getListValue11();

	/**
	 * Returns the value of the '<em><b>List Value4</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value4</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-value' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0' group='#ListValue1:4'"
	 * @generated
	 */
	EList<ListValueType4> getListValue4();

	/**
	 * Returns the value of the '<em><b>List Value21</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value21</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value21</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue21()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ListValue2:6'"
	 * @generated
	 */
	FeatureMap getListValue21();

	/**
	 * Returns the value of the '<em><b>List Value5</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value5</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue5()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-value' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0' group='#ListValue2:6'"
	 * @generated
	 */
	EList<ListValueType> getListValue5();

	/**
	 * Returns the value of the '<em><b>List Value31</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value31</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value31</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue31()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ListValue3:8'"
	 * @generated
	 */
	FeatureMap getListValue31();

	/**
	 * Returns the value of the '<em><b>List Value6</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value6</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue6()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-value' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0' group='#ListValue3:8'"
	 * @generated
	 */
	EList<ListValueType3> getListValue6();

	/**
	 * Returns the value of the '<em><b>List Value41</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value41</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value41</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue41()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ListValue4:10'"
	 * @generated
	 */
	FeatureMap getListValue41();

	/**
	 * Returns the value of the '<em><b>List Value7</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value7</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue7()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-value' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0' group='#ListValue4:10'"
	 * @generated
	 */
	EList<ListValueType1> getListValue7();

	/**
	 * Returns the value of the '<em><b>List Value51</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value51</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value51</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue51()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ListValue5:12'"
	 * @generated
	 */
	FeatureMap getListValue51();

	/**
	 * Returns the value of the '<em><b>List Value8</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Value8</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Value8</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ListValue8()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-value' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0' group='#ListValue5:12'"
	 * @generated
	 */
	EList<ListValueType2> getListValue8();

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #setValueType(ValueTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getFormPropertyTypeAndValueList_ValueType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='value-type' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	ValueTypeType getValueType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType
	 * @see #isSetValueType()
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(ValueTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueType()
	 * @see #getValueType()
	 * @see #setValueType(ValueTypeType)
	 * @generated
	 */
	void unsetValueType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList#getValueType <em>Value Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value Type</em>' attribute is set.
	 * @see #unsetValueType()
	 * @see #getValueType()
	 * @see #setValueType(ValueTypeType)
	 * @generated
	 */
	boolean isSetValueType();

} // FormPropertyTypeAndValueList
