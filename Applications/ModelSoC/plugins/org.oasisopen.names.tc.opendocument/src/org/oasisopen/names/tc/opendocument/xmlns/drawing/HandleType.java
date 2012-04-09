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
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandlePolar <em>Handle Polar</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandlePosition <em>Handle Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRadiusRangeMaximum <em>Handle Radius Range Maximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRadiusRangeMinimum <em>Handle Radius Range Minimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeXMaximum <em>Handle Range XMaximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeXMinimum <em>Handle Range XMinimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeYMaximum <em>Handle Range YMaximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeYMinimum <em>Handle Range YMinimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleSwitched <em>Handle Switched</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType()
 * @model extendedMetaData="name='handle_._type' kind='empty'"
 * @generated
 */
public interface HandleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Handle Mirror Horizontal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Mirror Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Mirror Horizontal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleMirrorHorizontal()
	 * @see #unsetHandleMirrorHorizontal()
	 * @see #setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandleMirrorHorizontal()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='handle-mirror-horizontal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleMirrorHorizontal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Mirror Horizontal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleMirrorHorizontal()
	 * @see #unsetHandleMirrorHorizontal()
	 * @see #getHandleMirrorHorizontal()
	 * @generated
	 */
	void setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandleMirrorHorizontal()
	 * @see #getHandleMirrorHorizontal()
	 * @see #setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetHandleMirrorHorizontal();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handle Mirror Horizontal</em>' attribute is set.
	 * @see #unsetHandleMirrorHorizontal()
	 * @see #getHandleMirrorHorizontal()
	 * @see #setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetHandleMirrorHorizontal();

	/**
	 * Returns the value of the '<em><b>Handle Mirror Vertical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Mirror Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Mirror Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleMirrorVertical()
	 * @see #unsetHandleMirrorVertical()
	 * @see #setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandleMirrorVertical()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='handle-mirror-vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleMirrorVertical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Mirror Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleMirrorVertical()
	 * @see #unsetHandleMirrorVertical()
	 * @see #getHandleMirrorVertical()
	 * @generated
	 */
	void setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandleMirrorVertical()
	 * @see #getHandleMirrorVertical()
	 * @see #setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetHandleMirrorVertical();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handle Mirror Vertical</em>' attribute is set.
	 * @see #unsetHandleMirrorVertical()
	 * @see #getHandleMirrorVertical()
	 * @see #setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetHandleMirrorVertical();

	/**
	 * Returns the value of the '<em><b>Handle Polar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Polar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Polar</em>' attribute.
	 * @see #setHandlePolar(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandlePolar()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-polar' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandlePolar();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandlePolar <em>Handle Polar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Polar</em>' attribute.
	 * @see #getHandlePolar()
	 * @generated
	 */
	void setHandlePolar(String value);

	/**
	 * Returns the value of the '<em><b>Handle Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Position</em>' attribute.
	 * @see #setHandlePosition(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandlePosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='handle-position' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandlePosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandlePosition <em>Handle Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Position</em>' attribute.
	 * @see #getHandlePosition()
	 * @generated
	 */
	void setHandlePosition(String value);

	/**
	 * Returns the value of the '<em><b>Handle Radius Range Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Radius Range Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Radius Range Maximum</em>' attribute.
	 * @see #setHandleRadiusRangeMaximum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandleRadiusRangeMaximum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-radius-range-maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRadiusRangeMaximum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRadiusRangeMaximum <em>Handle Radius Range Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Radius Range Maximum</em>' attribute.
	 * @see #getHandleRadiusRangeMaximum()
	 * @generated
	 */
	void setHandleRadiusRangeMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Radius Range Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Radius Range Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Radius Range Minimum</em>' attribute.
	 * @see #setHandleRadiusRangeMinimum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandleRadiusRangeMinimum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-radius-range-minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRadiusRangeMinimum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRadiusRangeMinimum <em>Handle Radius Range Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Radius Range Minimum</em>' attribute.
	 * @see #getHandleRadiusRangeMinimum()
	 * @generated
	 */
	void setHandleRadiusRangeMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Range XMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Range XMaximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Range XMaximum</em>' attribute.
	 * @see #setHandleRangeXMaximum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandleRangeXMaximum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-range-x-maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRangeXMaximum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeXMaximum <em>Handle Range XMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Range XMaximum</em>' attribute.
	 * @see #getHandleRangeXMaximum()
	 * @generated
	 */
	void setHandleRangeXMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Range XMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Range XMinimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Range XMinimum</em>' attribute.
	 * @see #setHandleRangeXMinimum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandleRangeXMinimum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-range-x-minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRangeXMinimum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeXMinimum <em>Handle Range XMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Range XMinimum</em>' attribute.
	 * @see #getHandleRangeXMinimum()
	 * @generated
	 */
	void setHandleRangeXMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Range YMaximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Range YMaximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Range YMaximum</em>' attribute.
	 * @see #setHandleRangeYMaximum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandleRangeYMaximum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-range-y-maximum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRangeYMaximum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeYMaximum <em>Handle Range YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Range YMaximum</em>' attribute.
	 * @see #getHandleRangeYMaximum()
	 * @generated
	 */
	void setHandleRangeYMaximum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Range YMinimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Range YMinimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Range YMinimum</em>' attribute.
	 * @see #setHandleRangeYMinimum(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandleRangeYMinimum()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='handle-range-y-minimum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHandleRangeYMinimum();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleRangeYMinimum <em>Handle Range YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Range YMinimum</em>' attribute.
	 * @see #getHandleRangeYMinimum()
	 * @generated
	 */
	void setHandleRangeYMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Handle Switched</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle Switched</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle Switched</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleSwitched()
	 * @see #unsetHandleSwitched()
	 * @see #setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getHandleType_HandleSwitched()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='handle-switched' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleSwitched();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleSwitched <em>Handle Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle Switched</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHandleSwitched()
	 * @see #unsetHandleSwitched()
	 * @see #getHandleSwitched()
	 * @generated
	 */
	void setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleSwitched <em>Handle Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHandleSwitched()
	 * @see #getHandleSwitched()
	 * @see #setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetHandleSwitched();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType#getHandleSwitched <em>Handle Switched</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Handle Switched</em>' attribute is set.
	 * @see #unsetHandleSwitched()
	 * @see #getHandleSwitched()
	 * @see #setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetHandleSwitched();

} // HandleType
