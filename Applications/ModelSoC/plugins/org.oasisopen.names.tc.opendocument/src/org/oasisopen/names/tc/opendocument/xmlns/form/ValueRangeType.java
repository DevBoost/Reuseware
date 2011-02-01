/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form;

import java.math.BigInteger;

import javax.xml.datatype.Duration;

import org.oasisopen.names.tc.opendocument.xmlns.text.CommonFormControlContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getBind <em>Bind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDelayForRepeat <em>Delay For Repeat</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPageStepSize <em>Page Step Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getStepSize <em>Step Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType()
 * @model extendedMetaData="name='value-range_._type' kind='elementOnly'"
 * @generated
 */
public interface ValueRangeType extends CommonFormControlContent {
	/**
	 * Returns the value of the '<em><b>Bind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind</em>' attribute.
	 * @see #setBind(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_Bind()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='bind' namespace='http://www.w3.org/2002/xforms'"
	 * @generated
	 */
	String getBind();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getBind <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind</em>' attribute.
	 * @see #getBind()
	 * @generated
	 */
	void setBind(String value);

	/**
	 * Returns the value of the '<em><b>Control Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Implementation</em>' attribute.
	 * @see #setControlImplementation(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_ControlImplementation()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NamespacedToken"
	 *        extendedMetaData="kind='attribute' name='control-implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControlImplementation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getControlImplementation <em>Control Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Implementation</em>' attribute.
	 * @see #getControlImplementation()
	 * @generated
	 */
	void setControlImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Delay For Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay For Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay For Repeat</em>' attribute.
	 * @see #setDelayForRepeat(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_DelayForRepeat()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='delay-for-repeat' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDelayForRepeat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDelayForRepeat <em>Delay For Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay For Repeat</em>' attribute.
	 * @see #getDelayForRepeat()
	 * @generated
	 */
	void setDelayForRepeat(Duration value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_Disabled()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='disabled' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisabled();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisabled()
	 * @see #getDisabled()
	 * @see #setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisabled();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getDisabled <em>Disabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disabled</em>' attribute is set.
	 * @see #unsetDisabled()
	 * @see #getDisabled()
	 * @see #setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisabled();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_MaxValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='max-value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(String value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_MinValue()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='min-value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(OrientationType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_Orientation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(OrientationType)
	 * @generated
	 */
	boolean isSetOrientation();

	/**
	 * Returns the value of the '<em><b>Page Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Step Size</em>' attribute.
	 * @see #setPageStepSize(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_PageStepSize()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='page-step-size' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPageStepSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPageStepSize <em>Page Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Step Size</em>' attribute.
	 * @see #getPageStepSize()
	 * @generated
	 */
	void setPageStepSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Printable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printable</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrintable()
	 * @see #unsetPrintable()
	 * @see #setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_Printable()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='printable' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrintable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPrintable <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printable</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPrintable()
	 * @see #unsetPrintable()
	 * @see #getPrintable()
	 * @generated
	 */
	void setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPrintable <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrintable()
	 * @see #getPrintable()
	 * @see #setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPrintable();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getPrintable <em>Printable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Printable</em>' attribute is set.
	 * @see #unsetPrintable()
	 * @see #getPrintable()
	 * @see #setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPrintable();

	/**
	 * Returns the value of the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Size</em>' attribute.
	 * @see #setStepSize(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_StepSize()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='step-size' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStepSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getStepSize <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' attribute.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Tab Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Index</em>' attribute.
	 * @see #isSetTabIndex()
	 * @see #unsetTabIndex()
	 * @see #setTabIndex(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_TabIndex()
	 * @model default="0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='tab-index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTabIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabIndex <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Index</em>' attribute.
	 * @see #isSetTabIndex()
	 * @see #unsetTabIndex()
	 * @see #getTabIndex()
	 * @generated
	 */
	void setTabIndex(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabIndex <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabIndex()
	 * @see #getTabIndex()
	 * @see #setTabIndex(BigInteger)
	 * @generated
	 */
	void unsetTabIndex();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabIndex <em>Tab Index</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tab Index</em>' attribute is set.
	 * @see #unsetTabIndex()
	 * @see #getTabIndex()
	 * @see #setTabIndex(BigInteger)
	 * @generated
	 */
	boolean isSetTabIndex();

	/**
	 * Returns the value of the '<em><b>Tab Stop</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Stop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Stop</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTabStop()
	 * @see #unsetTabStop()
	 * @see #setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_TabStop()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tab-stop' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTabStop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabStop <em>Tab Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Stop</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTabStop()
	 * @see #unsetTabStop()
	 * @see #getTabStop()
	 * @generated
	 */
	void setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabStop <em>Tab Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabStop()
	 * @see #getTabStop()
	 * @see #setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTabStop();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTabStop <em>Tab Stop</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tab Stop</em>' attribute is set.
	 * @see #unsetTabStop()
	 * @see #getTabStop()
	 * @see #setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTabStop();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getValueRangeType_Value()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ValueRangeType
