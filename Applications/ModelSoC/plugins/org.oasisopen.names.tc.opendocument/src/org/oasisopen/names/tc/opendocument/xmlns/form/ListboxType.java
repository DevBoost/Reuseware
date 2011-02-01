/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.oasisopen.names.tc.opendocument.xmlns.text.CommonFormControlContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listbox Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getOption <em>Option</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getBind <em>Bind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getBoundColumn <em>Bound Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDataField <em>Data Field</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDropdown <em>Dropdown</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSource <em>List Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSourceType <em>List Source Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getSize <em>Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabIndex <em>Tab Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabStop <em>Tab Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getXformsListSource <em>Xforms List Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType()
 * @model extendedMetaData="name='listbox_._type' kind='elementOnly'"
 * @generated
 */
public interface ListboxType extends CommonFormControlContent {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.OptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Option()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OptionType> getOption();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Bind()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='bind' namespace='http://www.w3.org/2002/xforms'"
	 * @generated
	 */
	String getBind();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getBind <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind</em>' attribute.
	 * @see #getBind()
	 * @generated
	 */
	void setBind(String value);

	/**
	 * Returns the value of the '<em><b>Bound Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Column</em>' attribute.
	 * @see #setBoundColumn(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_BoundColumn()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='bound-column' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBoundColumn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getBoundColumn <em>Bound Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Column</em>' attribute.
	 * @see #getBoundColumn()
	 * @generated
	 */
	void setBoundColumn(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_ControlImplementation()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NamespacedToken"
	 *        extendedMetaData="kind='attribute' name='control-implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getControlImplementation();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getControlImplementation <em>Control Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Implementation</em>' attribute.
	 * @see #getControlImplementation()
	 * @generated
	 */
	void setControlImplementation(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_DataField()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='data-field' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataField();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDataField <em>Data Field</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Disabled()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='disabled' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisabled();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDisabled <em>Disabled</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisabled()
	 * @see #getDisabled()
	 * @see #setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisabled();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDisabled <em>Disabled</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Dropdown</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dropdown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropdown</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDropdown()
	 * @see #unsetDropdown()
	 * @see #setDropdown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Dropdown()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dropdown' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDropdown();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDropdown <em>Dropdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropdown</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDropdown()
	 * @see #unsetDropdown()
	 * @see #getDropdown()
	 * @generated
	 */
	void setDropdown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDropdown <em>Dropdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDropdown()
	 * @see #getDropdown()
	 * @see #setDropdown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDropdown();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getDropdown <em>Dropdown</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dropdown</em>' attribute is set.
	 * @see #unsetDropdown()
	 * @see #getDropdown()
	 * @see #setDropdown(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDropdown();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>List Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Source</em>' attribute.
	 * @see #setListSource(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_ListSource()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='list-source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getListSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSource <em>List Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Source</em>' attribute.
	 * @see #getListSource()
	 * @generated
	 */
	void setListSource(String value);

	/**
	 * Returns the value of the '<em><b>List Source Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Source Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType
	 * @see #isSetListSourceType()
	 * @see #unsetListSourceType()
	 * @see #setListSourceType(ListSourceTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_ListSourceType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='list-source-type' namespace='##targetNamespace'"
	 * @generated
	 */
	ListSourceTypeType getListSourceType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSourceType <em>List Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Source Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType
	 * @see #isSetListSourceType()
	 * @see #unsetListSourceType()
	 * @see #getListSourceType()
	 * @generated
	 */
	void setListSourceType(ListSourceTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSourceType <em>List Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetListSourceType()
	 * @see #getListSourceType()
	 * @see #setListSourceType(ListSourceTypeType)
	 * @generated
	 */
	void unsetListSourceType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getListSourceType <em>List Source Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>List Source Type</em>' attribute is set.
	 * @see #unsetListSourceType()
	 * @see #getListSourceType()
	 * @see #setListSourceType(ListSourceTypeType)
	 * @generated
	 */
	boolean isSetListSourceType();

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMultiple()
	 * @see #unsetMultiple()
	 * @see #setMultiple(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Multiple()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multiple' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMultiple();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMultiple()
	 * @see #unsetMultiple()
	 * @see #getMultiple()
	 * @generated
	 */
	void setMultiple(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiple()
	 * @see #getMultiple()
	 * @see #setMultiple(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMultiple();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getMultiple <em>Multiple</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiple</em>' attribute is set.
	 * @see #unsetMultiple()
	 * @see #getMultiple()
	 * @see #setMultiple(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMultiple();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getName <em>Name</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Printable()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='printable' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrintable();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getPrintable <em>Printable</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getPrintable <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrintable()
	 * @see #getPrintable()
	 * @see #setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPrintable();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getPrintable <em>Printable</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Size()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_TabIndex()
	 * @model default="0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='tab-index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTabIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabIndex <em>Tab Index</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabIndex <em>Tab Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabIndex()
	 * @see #getTabIndex()
	 * @see #setTabIndex(BigInteger)
	 * @generated
	 */
	void unsetTabIndex();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabIndex <em>Tab Index</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_TabStop()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='tab-stop' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTabStop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabStop <em>Tab Stop</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabStop <em>Tab Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTabStop()
	 * @see #getTabStop()
	 * @see #setTabStop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTabStop();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTabStop <em>Tab Stop</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Xforms List Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xforms List Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xforms List Source</em>' attribute.
	 * @see #setXformsListSource(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#getListboxType_XformsListSource()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='xforms-list-source' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXformsListSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType#getXformsListSource <em>Xforms List Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xforms List Source</em>' attribute.
	 * @see #getXformsListSource()
	 * @generated
	 */
	void setXformsListSource(String value);

} // ListboxType
