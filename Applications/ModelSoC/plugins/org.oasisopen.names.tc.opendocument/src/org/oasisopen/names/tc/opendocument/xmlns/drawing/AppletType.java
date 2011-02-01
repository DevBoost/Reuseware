/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.w3.xlink.ActuateType;
import org.w3.xlink.ShowType1;
import org.w3.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getParam <em>Param</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getArchive <em>Archive</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getCode <em>Code</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getHref <em>Href</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getMayScript <em>May Script</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getObject <em>Object</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType()
 * @model extendedMetaData="name='applet_._type' kind='elementOnly'"
 * @generated
 */
public interface AppletType extends EObject {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.ParamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParamType> getParam();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType_Actuate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getActuate <em>Actuate</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getActuate <em>Actuate</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive</em>' attribute.
	 * @see #setArchive(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType_Archive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='archive' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getArchive();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getArchive <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' attribute.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(Object value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType_Href()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>May Script</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Script</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMayScript()
	 * @see #unsetMayScript()
	 * @see #setMayScript(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType_MayScript()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='may-script' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMayScript();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getMayScript <em>May Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>May Script</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMayScript()
	 * @see #unsetMayScript()
	 * @see #getMayScript()
	 * @generated
	 */
	void setMayScript(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getMayScript <em>May Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMayScript()
	 * @see #getMayScript()
	 * @see #setMayScript(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMayScript();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getMayScript <em>May Script</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>May Script</em>' attribute is set.
	 * @see #unsetMayScript()
	 * @see #getMayScript()
	 * @see #setMayScript(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMayScript();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType_Object()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getObject();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Object value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType_Show()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType1 getShow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getShow <em>Show</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType1)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getShow <em>Show</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getAppletType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.AppletType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // AppletType
