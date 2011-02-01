/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;
import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getBinaryData <em>Binary Data</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType()
 * @model extendedMetaData="name='image_._type' kind='elementOnly'"
 * @generated
 */
public interface ImageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Binary Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Data</em>' attribute.
	 * @see #setBinaryData(byte[])
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType_BinaryData()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Base64Binary"
	 *        extendedMetaData="kind='element' name='binary-data' namespace='urn:oasis:names:tc:opendocument:xmlns:office:1.0'"
	 * @generated
	 */
	byte[] getBinaryData();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getBinaryData <em>Binary Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Data</em>' attribute.
	 * @see #getBinaryData()
	 * @generated
	 */
	void setBinaryData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:1'"
	 * @generated
	 */
	EList<PType> getP();

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType_List()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='#group:1'"
	 * @generated
	 */
	EList<ListType> getList();

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType_Actuate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType_FilterName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='filter-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilterName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getFilterName <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' attribute.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType_Href()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.xlink.ShowType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3.xlink.ShowType1
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType_Show()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType1 getShow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3.xlink.ShowType1
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType1)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType1)
	 * @generated
	 */
	boolean isSetShow();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getImageType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ImageType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // ImageType
