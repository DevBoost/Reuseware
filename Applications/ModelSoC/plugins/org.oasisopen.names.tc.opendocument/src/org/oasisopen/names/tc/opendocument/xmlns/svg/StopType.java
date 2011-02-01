/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopColor <em>Stop Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopOpacity <em>Stop Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getStopType()
 * @model extendedMetaData="name='stop_._type' kind='empty'"
 * @generated
 */
public interface StopType extends EObject {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getStopType_Offset()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.OffsetType" required="true"
	 *        extendedMetaData="kind='attribute' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getOffset();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Object value);

	/**
	 * Returns the value of the '<em><b>Stop Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Color</em>' attribute.
	 * @see #setStopColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getStopType_StopColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='stop-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStopColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopColor <em>Stop Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Color</em>' attribute.
	 * @see #getStopColor()
	 * @generated
	 */
	void setStopColor(String value);

	/**
	 * Returns the value of the '<em><b>Stop Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Opacity</em>' attribute.
	 * @see #isSetStopOpacity()
	 * @see #unsetStopOpacity()
	 * @see #setStopOpacity(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getStopType_StopOpacity()
	 * @model unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='stop-opacity' namespace='##targetNamespace'"
	 * @generated
	 */
	double getStopOpacity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopOpacity <em>Stop Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Opacity</em>' attribute.
	 * @see #isSetStopOpacity()
	 * @see #unsetStopOpacity()
	 * @see #getStopOpacity()
	 * @generated
	 */
	void setStopOpacity(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopOpacity <em>Stop Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStopOpacity()
	 * @see #getStopOpacity()
	 * @see #setStopOpacity(double)
	 * @generated
	 */
	void unsetStopOpacity();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType#getStopOpacity <em>Stop Opacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stop Opacity</em>' attribute is set.
	 * @see #unsetStopOpacity()
	 * @see #getStopOpacity()
	 * @see #setStopOpacity(double)
	 * @generated
	 */
	boolean isSetStopOpacity();

} // StopType
