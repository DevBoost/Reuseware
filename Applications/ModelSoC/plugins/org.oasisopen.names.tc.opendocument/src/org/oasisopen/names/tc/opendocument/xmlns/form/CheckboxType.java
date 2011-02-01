/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form;

import java.math.BigInteger;

import org.oasisopen.names.tc.opendocument.xmlns.text.CommonFormControlContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.States;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checkbox Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getBind <em>Bind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImageAlign <em>Image Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImagePosition <em>Image Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getIsTristate <em>Is Tristate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getLabel <em>Label</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getState <em>State</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getValue <em>Value</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getVisualEffect <em>Visual Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType()
 * @model extendedMetaData="name='checkbox_._type' kind='elementOnly'"
 * @generated
 */
public interface CheckboxType extends CommonFormControlContent {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_Bind()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='bind' namespace='http://www.w3.org/2002/xforms'"
	 * @generated
	 */
	String getBind();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getBind <em>Bind</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_ControlImplementation()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NamespacedToken"
	 *        extendedMetaData="kind='attribute' name='control-implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControlImplementation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getControlImplementation <em>Control Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Implementation</em>' attribute.
	 * @see #getControlImplementation()
	 * @generated
	 */
	void setControlImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.States}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.States
	 * @see #isSetCurrentState()
	 * @see #unsetCurrentState()
	 * @see #setCurrentState(States)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_CurrentState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='current-state' namespace='##targetNamespace'"
	 * @generated
	 */
	States getCurrentState();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getCurrentState <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.States
	 * @see #isSetCurrentState()
	 * @see #unsetCurrentState()
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(States value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getCurrentState <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentState()
	 * @see #getCurrentState()
	 * @see #setCurrentState(States)
	 * @generated
	 */
	void unsetCurrentState();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getCurrentState <em>Current State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current State</em>' attribute is set.
	 * @see #unsetCurrentState()
	 * @see #getCurrentState()
	 * @see #setCurrentState(States)
	 * @generated
	 */
	boolean isSetCurrentState();

	/**
	 * Returns the value of the '<em><b>Data Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Field</em>' attribute.
	 * @see #setDataField(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_DataField()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='data-field' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDataField <em>Data Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Field</em>' attribute.
	 * @see #getDataField()
	 * @generated
	 */
	void setDataField(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_Disabled()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='disabled' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisabled();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDisabled <em>Disabled</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisabled()
	 * @see #getDisabled()
	 * @see #setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisabled();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getDisabled <em>Disabled</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Image Align</b></em>' attribute.
	 * The default value is <code>"center"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType
	 * @see #isSetImageAlign()
	 * @see #unsetImageAlign()
	 * @see #setImageAlign(ImageAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_ImageAlign()
	 * @model default="center" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='image-align' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageAlignType getImageAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImageAlign <em>Image Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType
	 * @see #isSetImageAlign()
	 * @see #unsetImageAlign()
	 * @see #getImageAlign()
	 * @generated
	 */
	void setImageAlign(ImageAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImageAlign <em>Image Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImageAlign()
	 * @see #getImageAlign()
	 * @see #setImageAlign(ImageAlignType)
	 * @generated
	 */
	void unsetImageAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImageAlign <em>Image Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Image Align</em>' attribute is set.
	 * @see #unsetImageAlign()
	 * @see #getImageAlign()
	 * @see #setImageAlign(ImageAlignType)
	 * @generated
	 */
	boolean isSetImageAlign();

	/**
	 * Returns the value of the '<em><b>Image Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType
	 * @see #isSetImagePosition()
	 * @see #unsetImagePosition()
	 * @see #setImagePosition(ImagePositionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_ImagePosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='image-position' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagePositionType getImagePosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImagePosition <em>Image Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType
	 * @see #isSetImagePosition()
	 * @see #unsetImagePosition()
	 * @see #getImagePosition()
	 * @generated
	 */
	void setImagePosition(ImagePositionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImagePosition <em>Image Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImagePosition()
	 * @see #getImagePosition()
	 * @see #setImagePosition(ImagePositionType)
	 * @generated
	 */
	void unsetImagePosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getImagePosition <em>Image Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Image Position</em>' attribute is set.
	 * @see #unsetImagePosition()
	 * @see #getImagePosition()
	 * @see #setImagePosition(ImagePositionType)
	 * @generated
	 */
	boolean isSetImagePosition();

	/**
	 * Returns the value of the '<em><b>Is Tristate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tristate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tristate</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsTristate()
	 * @see #unsetIsTristate()
	 * @see #setIsTristate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_IsTristate()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='is-tristate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsTristate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getIsTristate <em>Is Tristate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tristate</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsTristate()
	 * @see #unsetIsTristate()
	 * @see #getIsTristate()
	 * @generated
	 */
	void setIsTristate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getIsTristate <em>Is Tristate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTristate()
	 * @see #getIsTristate()
	 * @see #setIsTristate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIsTristate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getIsTristate <em>Is Tristate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Tristate</em>' attribute is set.
	 * @see #unsetIsTristate()
	 * @see #getIsTristate()
	 * @see #setIsTristate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIsTristate();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_Label()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='label' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_Printable()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='printable' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrintable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getPrintable <em>Printable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getPrintable <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrintable()
	 * @see #getPrintable()
	 * @see #setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPrintable();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getPrintable <em>Printable</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"unchecked"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.States}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.States
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(States)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_State()
	 * @model default="unchecked" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	States getState();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.States
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(States value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(States)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(States)
	 * @generated
	 */
	boolean isSetState();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_TabIndex()
	 * @model default="0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='tab-index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTabIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabIndex <em>Tab Index</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabIndex <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabIndex()
	 * @see #getTabIndex()
	 * @see #setTabIndex(BigInteger)
	 * @generated
	 */
	void unsetTabIndex();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabIndex <em>Tab Index</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_TabStop()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tab-stop' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTabStop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabStop <em>Tab Stop</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabStop <em>Tab Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabStop()
	 * @see #getTabStop()
	 * @see #setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTabStop();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTabStop <em>Tab Stop</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getTitle <em>Title</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_Value()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Visual Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Effect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType
	 * @see #isSetVisualEffect()
	 * @see #unsetVisualEffect()
	 * @see #setVisualEffect(VisualEffectType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getCheckboxType_VisualEffect()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visual-effect' namespace='##targetNamespace'"
	 * @generated
	 */
	VisualEffectType getVisualEffect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getVisualEffect <em>Visual Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Effect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType
	 * @see #isSetVisualEffect()
	 * @see #unsetVisualEffect()
	 * @see #getVisualEffect()
	 * @generated
	 */
	void setVisualEffect(VisualEffectType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getVisualEffect <em>Visual Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisualEffect()
	 * @see #getVisualEffect()
	 * @see #setVisualEffect(VisualEffectType)
	 * @generated
	 */
	void unsetVisualEffect();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType#getVisualEffect <em>Visual Effect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visual Effect</em>' attribute is set.
	 * @see #unsetVisualEffect()
	 * @see #getVisualEffect()
	 * @see #setVisualEffect(VisualEffectType)
	 * @generated
	 */
	boolean isSetVisualEffect();

} // CheckboxType
