/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.dr3d;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLight <em>Light</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShapes3dGroup <em>Shapes3d Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShapes3d <em>Shapes3d</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAmbientColor <em>Ambient Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorPageNumber <em>Anchor Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorType <em>Anchor Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getCaptionId <em>Caption Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getClassNames1 <em>Class Names1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndCellAddress <em>End Cell Address</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndX <em>End X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndY <em>End Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getFocalLength <em>Focal Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLayer <em>Layer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLightingMode <em>Lighting Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadeMode <em>Shade Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadowSlant <em>Shadow Slant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getStyleName1 <em>Style Name1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTableBackground <em>Table Background</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVpn <em>Vpn</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVrp <em>Vrp</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVup <em>Vup</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getY <em>Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getZIndex <em>ZIndex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType()
 * @model extendedMetaData="name='scene_._type' kind='elementOnly'"
 * @generated
 */
public interface SceneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='desc' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Light()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='light' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LightType> getLight();

	/**
	 * Returns the value of the '<em><b>Shapes3d Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shapes3d Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes3d Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Shapes3dGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='shapes3d:group' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	FeatureMap getShapes3dGroup();

	/**
	 * Returns the value of the '<em><b>Shapes3d</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shapes3d</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes3d</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Shapes3d()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shapes3d' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0' group='urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d:group'"
	 * @generated
	 */
	EList<EObject> getShapes3d();

	/**
	 * Returns the value of the '<em><b>Ambient Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambient Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambient Color</em>' attribute.
	 * @see #setAmbientColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_AmbientColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='ambient-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAmbientColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAmbientColor <em>Ambient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient Color</em>' attribute.
	 * @see #getAmbientColor()
	 * @generated
	 */
	void setAmbientColor(String value);

	/**
	 * Returns the value of the '<em><b>Anchor Page Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Page Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Page Number</em>' attribute.
	 * @see #setAnchorPageNumber(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_AnchorPageNumber()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='anchor-page-number' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	BigInteger getAnchorPageNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorPageNumber <em>Anchor Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Page Number</em>' attribute.
	 * @see #getAnchorPageNumber()
	 * @generated
	 */
	void setAnchorPageNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Anchor Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchor Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType
	 * @see #isSetAnchorType()
	 * @see #unsetAnchorType()
	 * @see #setAnchorType(AnchorTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_AnchorType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='anchor-type' namespace='urn:oasis:names:tc:opendocument:xmlns:text:1.0'"
	 * @generated
	 */
	AnchorTypeType getAnchorType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorType <em>Anchor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchor Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.AnchorTypeType
	 * @see #isSetAnchorType()
	 * @see #unsetAnchorType()
	 * @see #getAnchorType()
	 * @generated
	 */
	void setAnchorType(AnchorTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorType <em>Anchor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorType()
	 * @see #getAnchorType()
	 * @see #setAnchorType(AnchorTypeType)
	 * @generated
	 */
	void unsetAnchorType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getAnchorType <em>Anchor Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchor Type</em>' attribute is set.
	 * @see #unsetAnchorType()
	 * @see #getAnchorType()
	 * @see #setAnchorType(AnchorTypeType)
	 * @generated
	 */
	boolean isSetAnchorType();

	/**
	 * Returns the value of the '<em><b>Caption Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Id</em>' attribute.
	 * @see #setCaptionId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_CaptionId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='caption-id' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getCaptionId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getCaptionId <em>Caption Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Id</em>' attribute.
	 * @see #getCaptionId()
	 * @generated
	 */
	void setCaptionId(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_ClassNames()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	List<String> getClassNames();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getClassNames <em>Class Names</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_ClassNames1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	List<String> getClassNames1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getClassNames1 <em>Class Names1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names1</em>' attribute.
	 * @see #getClassNames1()
	 * @generated
	 */
	void setClassNames1(List<String> value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Distance()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(String value);

	/**
	 * Returns the value of the '<em><b>End Cell Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Cell Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Cell Address</em>' attribute.
	 * @see #setEndCellAddress(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_EndCellAddress()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellAddress"
	 *        extendedMetaData="kind='attribute' name='end-cell-address' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getEndCellAddress();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndCellAddress <em>End Cell Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Cell Address</em>' attribute.
	 * @see #getEndCellAddress()
	 * @generated
	 */
	void setEndCellAddress(String value);

	/**
	 * Returns the value of the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End X</em>' attribute.
	 * @see #setEndX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_EndX()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='end-x' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getEndX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndX <em>End X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End X</em>' attribute.
	 * @see #getEndX()
	 * @generated
	 */
	void setEndX(String value);

	/**
	 * Returns the value of the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Y</em>' attribute.
	 * @see #setEndY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_EndY()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='end-y' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	String getEndY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getEndY <em>End Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Y</em>' attribute.
	 * @see #getEndY()
	 * @generated
	 */
	void setEndY(String value);

	/**
	 * Returns the value of the '<em><b>Focal Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focal Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focal Length</em>' attribute.
	 * @see #setFocalLength(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_FocalLength()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='focal-length' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFocalLength();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getFocalLength <em>Focal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Length</em>' attribute.
	 * @see #getFocalLength()
	 * @generated
	 */
	void setFocalLength(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Height()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length" required="true"
	 *        extendedMetaData="kind='attribute' name='height' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Id()
	 * @model id="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getId <em>Id</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Layer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='layer' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getLayer();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(String value);

	/**
	 * Returns the value of the '<em><b>Lighting Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lighting Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lighting Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLightingMode()
	 * @see #unsetLightingMode()
	 * @see #setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_LightingMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='lighting-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getLightingMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLightingMode <em>Lighting Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lighting Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetLightingMode()
	 * @see #unsetLightingMode()
	 * @see #getLightingMode()
	 * @generated
	 */
	void setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLightingMode <em>Lighting Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLightingMode()
	 * @see #getLightingMode()
	 * @see #setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetLightingMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getLightingMode <em>Lighting Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lighting Mode</em>' attribute is set.
	 * @see #unsetLightingMode()
	 * @see #getLightingMode()
	 * @see #setLightingMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetLightingMode();

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
	 * @see #isSetProjection()
	 * @see #unsetProjection()
	 * @see #setProjection(ProjectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Projection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='projection' namespace='##targetNamespace'"
	 * @generated
	 */
	ProjectionType getProjection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getProjection <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType
	 * @see #isSetProjection()
	 * @see #unsetProjection()
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(ProjectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getProjection <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjection()
	 * @see #getProjection()
	 * @see #setProjection(ProjectionType)
	 * @generated
	 */
	void unsetProjection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getProjection <em>Projection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Projection</em>' attribute is set.
	 * @see #unsetProjection()
	 * @see #getProjection()
	 * @see #setProjection(ProjectionType)
	 * @generated
	 */
	boolean isSetProjection();

	/**
	 * Returns the value of the '<em><b>Shade Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shade Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shade Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
	 * @see #isSetShadeMode()
	 * @see #unsetShadeMode()
	 * @see #setShadeMode(ShadeModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_ShadeMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shade-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ShadeModeType getShadeMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadeMode <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shade Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType
	 * @see #isSetShadeMode()
	 * @see #unsetShadeMode()
	 * @see #getShadeMode()
	 * @generated
	 */
	void setShadeMode(ShadeModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadeMode <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShadeMode()
	 * @see #getShadeMode()
	 * @see #setShadeMode(ShadeModeType)
	 * @generated
	 */
	void unsetShadeMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadeMode <em>Shade Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shade Mode</em>' attribute is set.
	 * @see #unsetShadeMode()
	 * @see #getShadeMode()
	 * @see #setShadeMode(ShadeModeType)
	 * @generated
	 */
	boolean isSetShadeMode();

	/**
	 * Returns the value of the '<em><b>Shadow Slant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow Slant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Slant</em>' attribute.
	 * @see #setShadowSlant(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_ShadowSlant()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='shadow-slant' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getShadowSlant();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getShadowSlant <em>Shadow Slant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Slant</em>' attribute.
	 * @see #getShadowSlant()
	 * @generated
	 */
	void setShadowSlant(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getStyleName <em>Style Name</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_StyleName1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.presentation.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='urn:oasis:names:tc:opendocument:xmlns:presentation:1.0'"
	 * @generated
	 */
	String getStyleName1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getStyleName1 <em>Style Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name1</em>' attribute.
	 * @see #getStyleName1()
	 * @generated
	 */
	void setStyleName1(String value);

	/**
	 * Returns the value of the '<em><b>Table Background</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Background</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTableBackground()
	 * @see #unsetTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_TableBackground()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='table-background' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTableBackground();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTableBackground <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Background</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTableBackground()
	 * @see #unsetTableBackground()
	 * @see #getTableBackground()
	 * @generated
	 */
	void setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTableBackground <em>Table Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTableBackground()
	 * @see #getTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTableBackground();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTableBackground <em>Table Background</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table Background</em>' attribute is set.
	 * @see #unsetTableBackground()
	 * @see #getTableBackground()
	 * @see #setTableBackground(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTableBackground();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Transform()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Object value);

	/**
	 * Returns the value of the '<em><b>Vpn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpn</em>' attribute.
	 * @see #setVpn(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Vpn()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='vpn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVpn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVpn <em>Vpn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpn</em>' attribute.
	 * @see #getVpn()
	 * @generated
	 */
	void setVpn(String value);

	/**
	 * Returns the value of the '<em><b>Vrp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vrp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vrp</em>' attribute.
	 * @see #setVrp(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Vrp()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='vrp' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVrp();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVrp <em>Vrp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vrp</em>' attribute.
	 * @see #getVrp()
	 * @generated
	 */
	void setVrp(String value);

	/**
	 * Returns the value of the '<em><b>Vup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vup</em>' attribute.
	 * @see #setVup(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Vup()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='vup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVup();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getVup <em>Vup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vup</em>' attribute.
	 * @see #getVup()
	 * @generated
	 */
	void setVup(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Width()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length" required="true"
	 *        extendedMetaData="kind='attribute' name='width' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_X()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate" required="true"
	 *        extendedMetaData="kind='attribute' name='x' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_Y()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate" required="true"
	 *        extendedMetaData="kind='attribute' name='y' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getSceneType_ZIndex()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='z-index' namespace='urn:oasis:names:tc:opendocument:xmlns:drawing:1.0'"
	 * @generated
	 */
	BigInteger getZIndex();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZIndex</em>' attribute.
	 * @see #getZIndex()
	 * @generated
	 */
	void setZIndex(BigInteger value);

} // SceneType
