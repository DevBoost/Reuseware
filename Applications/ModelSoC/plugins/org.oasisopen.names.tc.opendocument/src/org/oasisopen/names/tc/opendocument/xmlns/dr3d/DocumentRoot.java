/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.dr3d;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCube <em>Cube</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getExtrude <em>Extrude</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getLight <em>Light</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getScene <em>Scene</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getAmbientColor <em>Ambient Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackfaceCulling <em>Backface Culling</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackScale <em>Back Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCenter <em>Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseBack <em>Close Back</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseFront <em>Close Front</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDiffuseColor <em>Diffuse Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRounding <em>Edge Rounding</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRoundingMode <em>Edge Rounding Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEmissiveColor <em>Emissive Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEndAngle <em>End Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getFocalLength <em>Focal Length</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getHorizontalSegments <em>Horizontal Segments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMaxEdge <em>Max Edge</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMinEdge <em>Min Edge</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsDirection <em>Normals Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsKind <em>Normals Kind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadeMode <em>Shade Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadow <em>Shadow</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadowSlant <em>Shadow Slant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShininess <em>Shininess</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSize <em>Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecular <em>Specular</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecularColor <em>Specular Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureFilter <em>Texture Filter</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeX <em>Texture Generation Mode X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeY <em>Texture Generation Mode Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureKind <em>Texture Kind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureMode <em>Texture Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVerticalSegments <em>Vertical Segments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVpn <em>Vpn</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVrp <em>Vrp</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVup <em>Vup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Cube</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cube</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube</em>' containment reference.
	 * @see #setCube(CubeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Cube()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cube' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d'"
	 * @generated
	 */
	CubeType getCube();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCube <em>Cube</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube</em>' containment reference.
	 * @see #getCube()
	 * @generated
	 */
	void setCube(CubeType value);

	/**
	 * Returns the value of the '<em><b>Extrude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrude</em>' containment reference.
	 * @see #setExtrude(ExtrudeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Extrude()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extrude' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d'"
	 * @generated
	 */
	ExtrudeType getExtrude();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getExtrude <em>Extrude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrude</em>' containment reference.
	 * @see #getExtrude()
	 * @generated
	 */
	void setExtrude(ExtrudeType value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' containment reference.
	 * @see #setLight(LightType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Light()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='light' namespace='##targetNamespace'"
	 * @generated
	 */
	LightType getLight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getLight <em>Light</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' containment reference.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(LightType value);

	/**
	 * Returns the value of the '<em><b>Rotate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotate</em>' containment reference.
	 * @see #setRotate(RotateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Rotate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rotate' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d'"
	 * @generated
	 */
	RotateType getRotate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getRotate <em>Rotate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotate</em>' containment reference.
	 * @see #getRotate()
	 * @generated
	 */
	void setRotate(RotateType value);

	/**
	 * Returns the value of the '<em><b>Scene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' containment reference.
	 * @see #setScene(SceneType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Scene()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scene' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d'"
	 * @generated
	 */
	SceneType getScene();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getScene <em>Scene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene</em>' containment reference.
	 * @see #getScene()
	 * @generated
	 */
	void setScene(SceneType value);

	/**
	 * Returns the value of the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sphere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sphere</em>' containment reference.
	 * @see #setSphere(SphereType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Sphere()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sphere' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d'"
	 * @generated
	 */
	SphereType getSphere();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSphere <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sphere</em>' containment reference.
	 * @see #getSphere()
	 * @generated
	 */
	void setSphere(SphereType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_AmbientColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='ambient-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAmbientColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getAmbientColor <em>Ambient Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambient Color</em>' attribute.
	 * @see #getAmbientColor()
	 * @generated
	 */
	void setAmbientColor(String value);

	/**
	 * Returns the value of the '<em><b>Backface Culling</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backface Culling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backface Culling</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType
	 * @see #isSetBackfaceCulling()
	 * @see #unsetBackfaceCulling()
	 * @see #setBackfaceCulling(BackfaceCullingType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_BackfaceCulling()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='backface-culling' namespace='##targetNamespace'"
	 * @generated
	 */
	BackfaceCullingType getBackfaceCulling();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackfaceCulling <em>Backface Culling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backface Culling</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType
	 * @see #isSetBackfaceCulling()
	 * @see #unsetBackfaceCulling()
	 * @see #getBackfaceCulling()
	 * @generated
	 */
	void setBackfaceCulling(BackfaceCullingType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackfaceCulling <em>Backface Culling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackfaceCulling()
	 * @see #getBackfaceCulling()
	 * @see #setBackfaceCulling(BackfaceCullingType)
	 * @generated
	 */
	void unsetBackfaceCulling();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackfaceCulling <em>Backface Culling</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Backface Culling</em>' attribute is set.
	 * @see #unsetBackfaceCulling()
	 * @see #getBackfaceCulling()
	 * @see #setBackfaceCulling(BackfaceCullingType)
	 * @generated
	 */
	boolean isSetBackfaceCulling();

	/**
	 * Returns the value of the '<em><b>Back Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Scale</em>' attribute.
	 * @see #setBackScale(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_BackScale()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='back-scale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBackScale();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getBackScale <em>Back Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Scale</em>' attribute.
	 * @see #getBackScale()
	 * @generated
	 */
	void setBackScale(String value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' attribute.
	 * @see #setCenter(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Center()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='center' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCenter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCenter <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' attribute.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(String value);

	/**
	 * Returns the value of the '<em><b>Close Back</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Close Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Back</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCloseBack()
	 * @see #unsetCloseBack()
	 * @see #setCloseBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_CloseBack()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='close-back' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCloseBack();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseBack <em>Close Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Back</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCloseBack()
	 * @see #unsetCloseBack()
	 * @see #getCloseBack()
	 * @generated
	 */
	void setCloseBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseBack <em>Close Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCloseBack()
	 * @see #getCloseBack()
	 * @see #setCloseBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCloseBack();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseBack <em>Close Back</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Close Back</em>' attribute is set.
	 * @see #unsetCloseBack()
	 * @see #getCloseBack()
	 * @see #setCloseBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCloseBack();

	/**
	 * Returns the value of the '<em><b>Close Front</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Close Front</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Front</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCloseFront()
	 * @see #unsetCloseFront()
	 * @see #setCloseFront(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_CloseFront()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='close-front' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCloseFront();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseFront <em>Close Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close Front</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCloseFront()
	 * @see #unsetCloseFront()
	 * @see #getCloseFront()
	 * @generated
	 */
	void setCloseFront(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseFront <em>Close Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCloseFront()
	 * @see #getCloseFront()
	 * @see #setCloseFront(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCloseFront();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getCloseFront <em>Close Front</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Close Front</em>' attribute is set.
	 * @see #unsetCloseFront()
	 * @see #getCloseFront()
	 * @see #setCloseFront(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCloseFront();

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Depth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='depth' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(String value);

	/**
	 * Returns the value of the '<em><b>Diffuse Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Color</em>' attribute.
	 * @see #setDiffuseColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_DiffuseColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='diffuse-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDiffuseColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDiffuseColor <em>Diffuse Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Color</em>' attribute.
	 * @see #getDiffuseColor()
	 * @generated
	 */
	void setDiffuseColor(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Direction()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Distance()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDistance();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(String value);

	/**
	 * Returns the value of the '<em><b>Edge Rounding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Rounding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Rounding</em>' attribute.
	 * @see #setEdgeRounding(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_EdgeRounding()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='edge-rounding' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEdgeRounding();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRounding <em>Edge Rounding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Rounding</em>' attribute.
	 * @see #getEdgeRounding()
	 * @generated
	 */
	void setEdgeRounding(String value);

	/**
	 * Returns the value of the '<em><b>Edge Rounding Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Rounding Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Rounding Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType
	 * @see #isSetEdgeRoundingMode()
	 * @see #unsetEdgeRoundingMode()
	 * @see #setEdgeRoundingMode(EdgeRoundingModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_EdgeRoundingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='edge-rounding-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	EdgeRoundingModeType getEdgeRoundingMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRoundingMode <em>Edge Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Rounding Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType
	 * @see #isSetEdgeRoundingMode()
	 * @see #unsetEdgeRoundingMode()
	 * @see #getEdgeRoundingMode()
	 * @generated
	 */
	void setEdgeRoundingMode(EdgeRoundingModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRoundingMode <em>Edge Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeRoundingMode()
	 * @see #getEdgeRoundingMode()
	 * @see #setEdgeRoundingMode(EdgeRoundingModeType)
	 * @generated
	 */
	void unsetEdgeRoundingMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEdgeRoundingMode <em>Edge Rounding Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edge Rounding Mode</em>' attribute is set.
	 * @see #unsetEdgeRoundingMode()
	 * @see #getEdgeRoundingMode()
	 * @see #setEdgeRoundingMode(EdgeRoundingModeType)
	 * @generated
	 */
	boolean isSetEdgeRoundingMode();

	/**
	 * Returns the value of the '<em><b>Emissive Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emissive Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emissive Color</em>' attribute.
	 * @see #setEmissiveColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_EmissiveColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='emissive-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmissiveColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEmissiveColor <em>Emissive Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emissive Color</em>' attribute.
	 * @see #getEmissiveColor()
	 * @generated
	 */
	void setEmissiveColor(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Enabled()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEnabled();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #getEnabled()
	 * @see #setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #getEnabled()
	 * @see #setEnabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetEnabled();

	/**
	 * Returns the value of the '<em><b>End Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Angle</em>' attribute.
	 * @see #setEndAngle(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_EndAngle()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='end-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getEndAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getEndAngle <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Angle</em>' attribute.
	 * @see #getEndAngle()
	 * @generated
	 */
	void setEndAngle(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_FocalLength()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='focal-length' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFocalLength();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getFocalLength <em>Focal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Length</em>' attribute.
	 * @see #getFocalLength()
	 * @generated
	 */
	void setFocalLength(String value);

	/**
	 * Returns the value of the '<em><b>Horizontal Segments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Segments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Segments</em>' attribute.
	 * @see #setHorizontalSegments(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_HorizontalSegments()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='horizontal-segments' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getHorizontalSegments();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getHorizontalSegments <em>Horizontal Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Segments</em>' attribute.
	 * @see #getHorizontalSegments()
	 * @generated
	 */
	void setHorizontalSegments(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_MaxEdge()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='max-edge' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxEdge();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMaxEdge <em>Max Edge</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_MinEdge()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='min-edge' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinEdge();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getMinEdge <em>Min Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Edge</em>' attribute.
	 * @see #getMinEdge()
	 * @generated
	 */
	void setMinEdge(String value);

	/**
	 * Returns the value of the '<em><b>Normals Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normals Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normals Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType
	 * @see #isSetNormalsDirection()
	 * @see #unsetNormalsDirection()
	 * @see #setNormalsDirection(NormalsDirectionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_NormalsDirection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='normals-direction' namespace='##targetNamespace'"
	 * @generated
	 */
	NormalsDirectionType getNormalsDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsDirection <em>Normals Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normals Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType
	 * @see #isSetNormalsDirection()
	 * @see #unsetNormalsDirection()
	 * @see #getNormalsDirection()
	 * @generated
	 */
	void setNormalsDirection(NormalsDirectionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsDirection <em>Normals Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalsDirection()
	 * @see #getNormalsDirection()
	 * @see #setNormalsDirection(NormalsDirectionType)
	 * @generated
	 */
	void unsetNormalsDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsDirection <em>Normals Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normals Direction</em>' attribute is set.
	 * @see #unsetNormalsDirection()
	 * @see #getNormalsDirection()
	 * @see #setNormalsDirection(NormalsDirectionType)
	 * @generated
	 */
	boolean isSetNormalsDirection();

	/**
	 * Returns the value of the '<em><b>Normals Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normals Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normals Kind</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType
	 * @see #isSetNormalsKind()
	 * @see #unsetNormalsKind()
	 * @see #setNormalsKind(NormalsKindType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_NormalsKind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='normals-kind' namespace='##targetNamespace'"
	 * @generated
	 */
	NormalsKindType getNormalsKind();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsKind <em>Normals Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normals Kind</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType
	 * @see #isSetNormalsKind()
	 * @see #unsetNormalsKind()
	 * @see #getNormalsKind()
	 * @generated
	 */
	void setNormalsKind(NormalsKindType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsKind <em>Normals Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalsKind()
	 * @see #getNormalsKind()
	 * @see #setNormalsKind(NormalsKindType)
	 * @generated
	 */
	void unsetNormalsKind();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getNormalsKind <em>Normals Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normals Kind</em>' attribute is set.
	 * @see #unsetNormalsKind()
	 * @see #getNormalsKind()
	 * @see #setNormalsKind(NormalsKindType)
	 * @generated
	 */
	boolean isSetNormalsKind();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Projection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='projection' namespace='##targetNamespace'"
	 * @generated
	 */
	ProjectionType getProjection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getProjection <em>Projection</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getProjection <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjection()
	 * @see #getProjection()
	 * @see #setProjection(ProjectionType)
	 * @generated
	 */
	void unsetProjection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getProjection <em>Projection</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_ShadeMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shade-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	ShadeModeType getShadeMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadeMode <em>Shade Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadeMode <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShadeMode()
	 * @see #getShadeMode()
	 * @see #setShadeMode(ShadeModeType)
	 * @generated
	 */
	void unsetShadeMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadeMode <em>Shade Mode</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Shadow</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType
	 * @see #isSetShadow()
	 * @see #unsetShadow()
	 * @see #setShadow(ShadowType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Shadow()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shadow' namespace='##targetNamespace'"
	 * @generated
	 */
	ShadowType getShadow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadow <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType
	 * @see #isSetShadow()
	 * @see #unsetShadow()
	 * @see #getShadow()
	 * @generated
	 */
	void setShadow(ShadowType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadow <em>Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShadow()
	 * @see #getShadow()
	 * @see #setShadow(ShadowType)
	 * @generated
	 */
	void unsetShadow();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadow <em>Shadow</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shadow</em>' attribute is set.
	 * @see #unsetShadow()
	 * @see #getShadow()
	 * @see #setShadow(ShadowType)
	 * @generated
	 */
	boolean isSetShadow();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_ShadowSlant()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='shadow-slant' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getShadowSlant();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShadowSlant <em>Shadow Slant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Slant</em>' attribute.
	 * @see #getShadowSlant()
	 * @generated
	 */
	void setShadowSlant(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Shininess</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shininess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shininess</em>' attribute.
	 * @see #setShininess(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Shininess()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='shininess' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShininess();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getShininess <em>Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shininess</em>' attribute.
	 * @see #getShininess()
	 * @generated
	 */
	void setShininess(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Size()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Specular</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specular</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSpecular()
	 * @see #unsetSpecular()
	 * @see #setSpecular(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Specular()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='specular' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getSpecular();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecular <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetSpecular()
	 * @see #unsetSpecular()
	 * @see #getSpecular()
	 * @generated
	 */
	void setSpecular(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecular <em>Specular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecular()
	 * @see #getSpecular()
	 * @see #setSpecular(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetSpecular();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecular <em>Specular</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specular</em>' attribute is set.
	 * @see #unsetSpecular()
	 * @see #getSpecular()
	 * @see #setSpecular(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetSpecular();

	/**
	 * Returns the value of the '<em><b>Specular Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specular Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular Color</em>' attribute.
	 * @see #setSpecularColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_SpecularColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='specular-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpecularColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getSpecularColor <em>Specular Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular Color</em>' attribute.
	 * @see #getSpecularColor()
	 * @generated
	 */
	void setSpecularColor(String value);

	/**
	 * Returns the value of the '<em><b>Texture Filter</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Filter</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType
	 * @see #isSetTextureFilter()
	 * @see #unsetTextureFilter()
	 * @see #setTextureFilter(TextureFilterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_TextureFilter()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='texture-filter' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureFilterType getTextureFilter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureFilter <em>Texture Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Filter</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType
	 * @see #isSetTextureFilter()
	 * @see #unsetTextureFilter()
	 * @see #getTextureFilter()
	 * @generated
	 */
	void setTextureFilter(TextureFilterType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureFilter <em>Texture Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureFilter()
	 * @see #getTextureFilter()
	 * @see #setTextureFilter(TextureFilterType)
	 * @generated
	 */
	void unsetTextureFilter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureFilter <em>Texture Filter</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Texture Filter</em>' attribute is set.
	 * @see #unsetTextureFilter()
	 * @see #getTextureFilter()
	 * @see #setTextureFilter(TextureFilterType)
	 * @generated
	 */
	boolean isSetTextureFilter();

	/**
	 * Returns the value of the '<em><b>Texture Generation Mode X</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Generation Mode X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Generation Mode X</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType
	 * @see #isSetTextureGenerationModeX()
	 * @see #unsetTextureGenerationModeX()
	 * @see #setTextureGenerationModeX(TextureGenerationModeXType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_TextureGenerationModeX()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='texture-generation-mode-x' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureGenerationModeXType getTextureGenerationModeX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeX <em>Texture Generation Mode X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Generation Mode X</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType
	 * @see #isSetTextureGenerationModeX()
	 * @see #unsetTextureGenerationModeX()
	 * @see #getTextureGenerationModeX()
	 * @generated
	 */
	void setTextureGenerationModeX(TextureGenerationModeXType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeX <em>Texture Generation Mode X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureGenerationModeX()
	 * @see #getTextureGenerationModeX()
	 * @see #setTextureGenerationModeX(TextureGenerationModeXType)
	 * @generated
	 */
	void unsetTextureGenerationModeX();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeX <em>Texture Generation Mode X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Texture Generation Mode X</em>' attribute is set.
	 * @see #unsetTextureGenerationModeX()
	 * @see #getTextureGenerationModeX()
	 * @see #setTextureGenerationModeX(TextureGenerationModeXType)
	 * @generated
	 */
	boolean isSetTextureGenerationModeX();

	/**
	 * Returns the value of the '<em><b>Texture Generation Mode Y</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Generation Mode Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Generation Mode Y</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType
	 * @see #isSetTextureGenerationModeY()
	 * @see #unsetTextureGenerationModeY()
	 * @see #setTextureGenerationModeY(TextureGenerationModeYType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_TextureGenerationModeY()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='texture-generation-mode-y' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureGenerationModeYType getTextureGenerationModeY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeY <em>Texture Generation Mode Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Generation Mode Y</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType
	 * @see #isSetTextureGenerationModeY()
	 * @see #unsetTextureGenerationModeY()
	 * @see #getTextureGenerationModeY()
	 * @generated
	 */
	void setTextureGenerationModeY(TextureGenerationModeYType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeY <em>Texture Generation Mode Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureGenerationModeY()
	 * @see #getTextureGenerationModeY()
	 * @see #setTextureGenerationModeY(TextureGenerationModeYType)
	 * @generated
	 */
	void unsetTextureGenerationModeY();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureGenerationModeY <em>Texture Generation Mode Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Texture Generation Mode Y</em>' attribute is set.
	 * @see #unsetTextureGenerationModeY()
	 * @see #getTextureGenerationModeY()
	 * @see #setTextureGenerationModeY(TextureGenerationModeYType)
	 * @generated
	 */
	boolean isSetTextureGenerationModeY();

	/**
	 * Returns the value of the '<em><b>Texture Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Kind</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType
	 * @see #isSetTextureKind()
	 * @see #unsetTextureKind()
	 * @see #setTextureKind(TextureKindType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_TextureKind()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='texture-kind' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureKindType getTextureKind();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureKind <em>Texture Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Kind</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType
	 * @see #isSetTextureKind()
	 * @see #unsetTextureKind()
	 * @see #getTextureKind()
	 * @generated
	 */
	void setTextureKind(TextureKindType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureKind <em>Texture Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureKind()
	 * @see #getTextureKind()
	 * @see #setTextureKind(TextureKindType)
	 * @generated
	 */
	void unsetTextureKind();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureKind <em>Texture Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Texture Kind</em>' attribute is set.
	 * @see #unsetTextureKind()
	 * @see #getTextureKind()
	 * @see #setTextureKind(TextureKindType)
	 * @generated
	 */
	boolean isSetTextureKind();

	/**
	 * Returns the value of the '<em><b>Texture Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType
	 * @see #isSetTextureMode()
	 * @see #unsetTextureMode()
	 * @see #setTextureMode(TextureModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_TextureMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='texture-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureModeType getTextureMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureMode <em>Texture Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType
	 * @see #isSetTextureMode()
	 * @see #unsetTextureMode()
	 * @see #getTextureMode()
	 * @generated
	 */
	void setTextureMode(TextureModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureMode <em>Texture Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureMode()
	 * @see #getTextureMode()
	 * @see #setTextureMode(TextureModeType)
	 * @generated
	 */
	void unsetTextureMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTextureMode <em>Texture Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Texture Mode</em>' attribute is set.
	 * @see #unsetTextureMode()
	 * @see #getTextureMode()
	 * @see #setTextureMode(TextureModeType)
	 * @generated
	 */
	boolean isSetTextureMode();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Transform()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='transform' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Object value);

	/**
	 * Returns the value of the '<em><b>Vertical Segments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Segments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Segments</em>' attribute.
	 * @see #setVerticalSegments(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_VerticalSegments()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='vertical-segments' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVerticalSegments();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVerticalSegments <em>Vertical Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Segments</em>' attribute.
	 * @see #getVerticalSegments()
	 * @generated
	 */
	void setVerticalSegments(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Vpn()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='vpn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVpn();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVpn <em>Vpn</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Vrp()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='vrp' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVrp();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVrp <em>Vrp</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#getDocumentRoot_Vup()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='vup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVup();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot#getVup <em>Vup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vup</em>' attribute.
	 * @see #getVup()
	 * @generated
	 */
	void setVup(String value);

} // DocumentRoot
