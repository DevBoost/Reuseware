/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.dr3d;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getClassNames1 <em>Class Names1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getMaxEdge <em>Max Edge</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getMinEdge <em>Min Edge</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getStyleName1 <em>Style Name1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType()
 * @model extendedMetaData="name='cube_._type' kind='empty'"
 * @generated
 */
public interface CubeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names</em>' attribute.
	 * @see #setClassNames(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_ClassNames()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	List<String> getClassNames();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getClassNames <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names</em>' attribute.
	 * @see #getClassNames()
	 * @generated
	 */
	void setClassNames(List<String> value);

	/**
	 * Returns the value of the '<em><b>Class Names1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names1</em>' attribute.
	 * @see #setClassNames1(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_ClassNames1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	List<String> getClassNames1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getClassNames1 <em>Class Names1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names1</em>' attribute.
	 * @see #getClassNames1()
	 * @generated
	 */
	void setClassNames1(List<String> value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' attribute.
	 * @see #setLayer(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_Layer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='layer' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getLayer();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(String value);

	/**
	 * Returns the value of the '<em><b>Max Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Edge</em>' attribute.
	 * @see #setMaxEdge(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_MaxEdge()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='max-edge' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxEdge();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getMaxEdge <em>Max Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Edge</em>' attribute.
	 * @see #getMaxEdge()
	 * @generated
	 */
	void setMaxEdge(String value);

	/**
	 * Returns the value of the '<em><b>Min Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Edge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Edge</em>' attribute.
	 * @see #setMinEdge(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_MinEdge()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='min-edge' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinEdge();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getMinEdge <em>Min Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Edge</em>' attribute.
	 * @see #getMinEdge()
	 * @generated
	 */
	void setMinEdge(String value);

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Style Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name1</em>' attribute.
	 * @see #setStyleName1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_StyleName1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.presentation.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getStyleName1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getStyleName1 <em>Style Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name1</em>' attribute.
	 * @see #getStyleName1()
	 * @generated
	 */
	void setStyleName1(String value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #setTransform(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_Transform()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Object value);

	/**
	 * Returns the value of the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZIndex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZIndex</em>' attribute.
	 * @see #setZIndex(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getCubeType_ZIndex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='z-index' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	BigInteger getZIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZIndex</em>' attribute.
	 * @see #getZIndex()
	 * @generated
	 */
	void setZIndex(BigInteger value);

} // CubeType
