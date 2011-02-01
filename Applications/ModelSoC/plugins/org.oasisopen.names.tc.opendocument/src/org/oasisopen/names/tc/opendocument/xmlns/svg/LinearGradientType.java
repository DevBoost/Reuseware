/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Gradient Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getStop <em>Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientTransform <em>Gradient Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientUnits <em>Gradient Units</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getSpreadMethod <em>Spread Method</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX1 <em>X1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX2 <em>X2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY2 <em>Y2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType()
 * @model extendedMetaData="name='linearGradient_._type' kind='elementOnly'"
 * @generated
 */
public interface LinearGradientType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.svg.StopType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_Stop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StopType> getStop();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_DisplayName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='display-name' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Gradient Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Transform</em>' attribute.
	 * @see #setGradientTransform(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_GradientTransform()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='gradientTransform' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGradientTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientTransform <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Transform</em>' attribute.
	 * @see #getGradientTransform()
	 * @generated
	 */
	void setGradientTransform(String value);

	/**
	 * Returns the value of the '<em><b>Gradient Units</b></em>' attribute.
	 * The default value is <code>"objectBoundingBox"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Units</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
	 * @see #isSetGradientUnits()
	 * @see #unsetGradientUnits()
	 * @see #setGradientUnits(GradientUnitsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_GradientUnits()
	 * @model default="objectBoundingBox" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='gradientUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	GradientUnitsType getGradientUnits();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientUnits <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Units</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType
	 * @see #isSetGradientUnits()
	 * @see #unsetGradientUnits()
	 * @see #getGradientUnits()
	 * @generated
	 */
	void setGradientUnits(GradientUnitsType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientUnits <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGradientUnits()
	 * @see #getGradientUnits()
	 * @see #setGradientUnits(GradientUnitsType)
	 * @generated
	 */
	void unsetGradientUnits();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getGradientUnits <em>Gradient Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gradient Units</em>' attribute is set.
	 * @see #unsetGradientUnits()
	 * @see #getGradientUnits()
	 * @see #setGradientUnits(GradientUnitsType)
	 * @generated
	 */
	boolean isSetGradientUnits();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleName" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Spread Method</b></em>' attribute.
	 * The default value is <code>"pad"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spread Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spread Method</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
	 * @see #isSetSpreadMethod()
	 * @see #unsetSpreadMethod()
	 * @see #setSpreadMethod(SpreadMethodType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_SpreadMethod()
	 * @model default="pad" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='spreadMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SpreadMethodType getSpreadMethod();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getSpreadMethod <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spread Method</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType
	 * @see #isSetSpreadMethod()
	 * @see #unsetSpreadMethod()
	 * @see #getSpreadMethod()
	 * @generated
	 */
	void setSpreadMethod(SpreadMethodType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getSpreadMethod <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpreadMethod()
	 * @see #getSpreadMethod()
	 * @see #setSpreadMethod(SpreadMethodType)
	 * @generated
	 */
	void unsetSpreadMethod();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getSpreadMethod <em>Spread Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spread Method</em>' attribute is set.
	 * @see #unsetSpreadMethod()
	 * @see #getSpreadMethod()
	 * @see #setSpreadMethod(SpreadMethodType)
	 * @generated
	 */
	boolean isSetSpreadMethod();

	/**
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * The default value is <code>"0%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #isSetX1()
	 * @see #unsetX1()
	 * @see #setX1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_X1()
	 * @model default="0%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.X1Type"
	 *        extendedMetaData="kind='attribute' name='x1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getX1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #isSetX1()
	 * @see #unsetX1()
	 * @see #getX1()
	 * @generated
	 */
	void setX1(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX1()
	 * @see #getX1()
	 * @see #setX1(String)
	 * @generated
	 */
	void unsetX1();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX1 <em>X1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X1</em>' attribute is set.
	 * @see #unsetX1()
	 * @see #getX1()
	 * @see #setX1(String)
	 * @generated
	 */
	boolean isSetX1();

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * The default value is <code>"100%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #setX2(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_X2()
	 * @model default="100%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.X2Type"
	 *        extendedMetaData="kind='attribute' name='x2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getX2();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #isSetX2()
	 * @see #unsetX2()
	 * @see #getX2()
	 * @generated
	 */
	void setX2(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX2()
	 * @see #getX2()
	 * @see #setX2(String)
	 * @generated
	 */
	void unsetX2();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getX2 <em>X2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X2</em>' attribute is set.
	 * @see #unsetX2()
	 * @see #getX2()
	 * @see #setX2(String)
	 * @generated
	 */
	boolean isSetX2();

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * The default value is <code>"0%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #isSetY1()
	 * @see #unsetY1()
	 * @see #setY1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_Y1()
	 * @model default="0%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.Y1Type"
	 *        extendedMetaData="kind='attribute' name='y1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getY1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #isSetY1()
	 * @see #unsetY1()
	 * @see #getY1()
	 * @generated
	 */
	void setY1(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY1()
	 * @see #getY1()
	 * @see #setY1(String)
	 * @generated
	 */
	void unsetY1();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY1 <em>Y1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y1</em>' attribute is set.
	 * @see #unsetY1()
	 * @see #getY1()
	 * @see #setY1(String)
	 * @generated
	 */
	boolean isSetY1();

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' attribute.
	 * The default value is <code>"100%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2</em>' attribute.
	 * @see #isSetY2()
	 * @see #unsetY2()
	 * @see #setY2(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getLinearGradientType_Y2()
	 * @model default="100%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.Y2Type"
	 *        extendedMetaData="kind='attribute' name='y2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getY2();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #isSetY2()
	 * @see #unsetY2()
	 * @see #getY2()
	 * @generated
	 */
	void setY2(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY2()
	 * @see #getY2()
	 * @see #setY2(String)
	 * @generated
	 */
	void unsetY2();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType#getY2 <em>Y2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y2</em>' attribute is set.
	 * @see #unsetY2()
	 * @see #getY2()
	 * @see #setY2(String)
	 * @generated
	 */
	boolean isSetY2();

} // LinearGradientType
