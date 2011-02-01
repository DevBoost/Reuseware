/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;
import org.w3.xlink.ActuateType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getFilterOptions <em>Filter Options</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getMode <em>Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getRefreshDelay <em>Refresh Delay</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableSourceType()
 * @model extendedMetaData="name='table-source_._type' kind='empty'"
 * @generated
 */
public interface TableSourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ActuateType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType1
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableSourceType_Actuate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType1 getActuate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType1
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType1)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType1)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Name</em>' attribute.
	 * @see #setFilterName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableSourceType_FilterName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='filter-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilterName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getFilterName <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' attribute.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(String value);

	/**
	 * Returns the value of the '<em><b>Filter Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Options</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Options</em>' attribute.
	 * @see #setFilterOptions(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableSourceType_FilterOptions()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='filter-options' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilterOptions();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getFilterOptions <em>Filter Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Options</em>' attribute.
	 * @see #getFilterOptions()
	 * @generated
	 */
	void setFilterOptions(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableSourceType_Href()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"copy-all"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.table.ModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ModeType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(ModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableSourceType_Mode()
	 * @model default="copy-all" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ModeType getMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.ModeType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(ModeType)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getMode <em>Mode</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Refresh Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Delay</em>' attribute.
	 * @see #setRefreshDelay(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableSourceType_RefreshDelay()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration" required="true"
	 *        extendedMetaData="kind='attribute' name='refresh-delay' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getRefreshDelay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getRefreshDelay <em>Refresh Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Delay</em>' attribute.
	 * @see #getRefreshDelay()
	 * @generated
	 */
	void setRefreshDelay(Duration value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableSourceType_TableName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='table-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link org.w3.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getTableSourceType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // TableSourceType
