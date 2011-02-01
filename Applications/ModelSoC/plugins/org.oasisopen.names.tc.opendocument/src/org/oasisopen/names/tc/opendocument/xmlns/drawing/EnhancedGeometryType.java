/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enhanced Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getEquation <em>Equation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getHandle <em>Handle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getEnhancedPath <em>Enhanced Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusion <em>Extrusion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionAllowed <em>Extrusion Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionBrightness <em>Extrusion Brightness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionColor <em>Extrusion Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDepth <em>Extrusion Depth</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDiffusion <em>Extrusion Diffusion</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionLightFace <em>Extrusion Light Face</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionMetal <em>Extrusion Metal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionOrigin <em>Extrusion Origin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationCenter <em>Extrusion Rotation Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionShininess <em>Extrusion Shininess</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSkew <em>Extrusion Skew</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSpecularity <em>Extrusion Specularity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointLeavingDirections <em>Glue Point Leaving Directions</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePoints <em>Glue Points</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointType <em>Glue Point Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorHorizontal <em>Mirror Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorVertical <em>Mirror Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointX <em>Path Stretchpoint X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointY <em>Path Stretchpoint Y</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getShadeMode <em>Shade Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextAreas <em>Text Areas</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPath <em>Text Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathAllowed <em>Text Path Allowed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathMode <em>Text Path Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathScale <em>Text Path Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextRotateAngle <em>Text Rotate Angle</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getViewBox <em>View Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType()
 * @model extendedMetaData="name='enhanced-geometry_._type' kind='elementOnly'"
 * @generated
 */
public interface EnhancedGeometryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Equation</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EquationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_Equation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='equation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EquationType> getEquation();

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_Handle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HandleType> getHandle();

	/**
	 * Returns the value of the '<em><b>Concentric Gradient Fill Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentric Gradient Fill Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentric Gradient Fill Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetConcentricGradientFillAllowed()
	 * @see #unsetConcentricGradientFillAllowed()
	 * @see #setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ConcentricGradientFillAllowed()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='concentric-gradient-fill-allowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getConcentricGradientFillAllowed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentric Gradient Fill Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetConcentricGradientFillAllowed()
	 * @see #unsetConcentricGradientFillAllowed()
	 * @see #getConcentricGradientFillAllowed()
	 * @generated
	 */
	void setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConcentricGradientFillAllowed()
	 * @see #getConcentricGradientFillAllowed()
	 * @see #setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetConcentricGradientFillAllowed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getConcentricGradientFillAllowed <em>Concentric Gradient Fill Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Concentric Gradient Fill Allowed</em>' attribute is set.
	 * @see #unsetConcentricGradientFillAllowed()
	 * @see #getConcentricGradientFillAllowed()
	 * @see #setConcentricGradientFillAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetConcentricGradientFillAllowed();

	/**
	 * Returns the value of the '<em><b>Enhanced Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enhanced Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhanced Path</em>' attribute.
	 * @see #setEnhancedPath(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_EnhancedPath()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='enhanced-path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEnhancedPath();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getEnhancedPath <em>Enhanced Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enhanced Path</em>' attribute.
	 * @see #getEnhancedPath()
	 * @generated
	 */
	void setEnhancedPath(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusion()
	 * @see #unsetExtrusion()
	 * @see #setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_Extrusion()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusion <em>Extrusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusion()
	 * @see #unsetExtrusion()
	 * @see #getExtrusion()
	 * @generated
	 */
	void setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusion <em>Extrusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusion()
	 * @see #getExtrusion()
	 * @see #setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusion();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusion <em>Extrusion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion</em>' attribute is set.
	 * @see #unsetExtrusion()
	 * @see #getExtrusion()
	 * @see #setExtrusion(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusion();

	/**
	 * Returns the value of the '<em><b>Extrusion Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionAllowed()
	 * @see #unsetExtrusionAllowed()
	 * @see #setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionAllowed()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-allowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionAllowed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionAllowed <em>Extrusion Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionAllowed()
	 * @see #unsetExtrusionAllowed()
	 * @see #getExtrusionAllowed()
	 * @generated
	 */
	void setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionAllowed <em>Extrusion Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionAllowed()
	 * @see #getExtrusionAllowed()
	 * @see #setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionAllowed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionAllowed <em>Extrusion Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Allowed</em>' attribute is set.
	 * @see #unsetExtrusionAllowed()
	 * @see #getExtrusionAllowed()
	 * @see #setExtrusionAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionAllowed();

	/**
	 * Returns the value of the '<em><b>Extrusion Brightness</b></em>' attribute.
	 * The default value is <code>"33%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Brightness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Brightness</em>' attribute.
	 * @see #isSetExtrusionBrightness()
	 * @see #unsetExtrusionBrightness()
	 * @see #setExtrusionBrightness(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionBrightness()
	 * @model default="33%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-brightness' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionBrightness();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionBrightness <em>Extrusion Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Brightness</em>' attribute.
	 * @see #isSetExtrusionBrightness()
	 * @see #unsetExtrusionBrightness()
	 * @see #getExtrusionBrightness()
	 * @generated
	 */
	void setExtrusionBrightness(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionBrightness <em>Extrusion Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionBrightness()
	 * @see #getExtrusionBrightness()
	 * @see #setExtrusionBrightness(String)
	 * @generated
	 */
	void unsetExtrusionBrightness();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionBrightness <em>Extrusion Brightness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Brightness</em>' attribute is set.
	 * @see #unsetExtrusionBrightness()
	 * @see #getExtrusionBrightness()
	 * @see #setExtrusionBrightness(String)
	 * @generated
	 */
	boolean isSetExtrusionBrightness();

	/**
	 * Returns the value of the '<em><b>Extrusion Color</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Color</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionColor()
	 * @see #unsetExtrusionColor()
	 * @see #setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionColor()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-color' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionColor <em>Extrusion Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Color</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionColor()
	 * @see #unsetExtrusionColor()
	 * @see #getExtrusionColor()
	 * @generated
	 */
	void setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionColor <em>Extrusion Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionColor()
	 * @see #getExtrusionColor()
	 * @see #setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionColor();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionColor <em>Extrusion Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Color</em>' attribute is set.
	 * @see #unsetExtrusionColor()
	 * @see #getExtrusionColor()
	 * @see #setExtrusionColor(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionColor();

	/**
	 * Returns the value of the '<em><b>Extrusion Depth</b></em>' attribute.
	 * The default value is <code>"36pt 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Depth</em>' attribute.
	 * @see #isSetExtrusionDepth()
	 * @see #unsetExtrusionDepth()
	 * @see #setExtrusionDepth(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionDepth()
	 * @model default="36pt 0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.ExtrusionDepthType" many="false"
	 *        extendedMetaData="kind='attribute' name='extrusion-depth' namespace='##targetNamespace'"
	 * @generated
	 */
	List getExtrusionDepth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDepth <em>Extrusion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Depth</em>' attribute.
	 * @see #isSetExtrusionDepth()
	 * @see #unsetExtrusionDepth()
	 * @see #getExtrusionDepth()
	 * @generated
	 */
	void setExtrusionDepth(List value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDepth <em>Extrusion Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionDepth()
	 * @see #getExtrusionDepth()
	 * @see #setExtrusionDepth(List)
	 * @generated
	 */
	void unsetExtrusionDepth();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDepth <em>Extrusion Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Depth</em>' attribute is set.
	 * @see #unsetExtrusionDepth()
	 * @see #getExtrusionDepth()
	 * @see #setExtrusionDepth(List)
	 * @generated
	 */
	boolean isSetExtrusionDepth();

	/**
	 * Returns the value of the '<em><b>Extrusion Diffusion</b></em>' attribute.
	 * The default value is <code>"0%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Diffusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Diffusion</em>' attribute.
	 * @see #isSetExtrusionDiffusion()
	 * @see #unsetExtrusionDiffusion()
	 * @see #setExtrusionDiffusion(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionDiffusion()
	 * @model default="0%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-diffusion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionDiffusion();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDiffusion <em>Extrusion Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Diffusion</em>' attribute.
	 * @see #isSetExtrusionDiffusion()
	 * @see #unsetExtrusionDiffusion()
	 * @see #getExtrusionDiffusion()
	 * @generated
	 */
	void setExtrusionDiffusion(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDiffusion <em>Extrusion Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionDiffusion()
	 * @see #getExtrusionDiffusion()
	 * @see #setExtrusionDiffusion(String)
	 * @generated
	 */
	void unsetExtrusionDiffusion();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionDiffusion <em>Extrusion Diffusion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Diffusion</em>' attribute is set.
	 * @see #unsetExtrusionDiffusion()
	 * @see #getExtrusionDiffusion()
	 * @see #setExtrusionDiffusion(String)
	 * @generated
	 */
	boolean isSetExtrusionDiffusion();

	/**
	 * Returns the value of the '<em><b>Extrusion First Light Direction</b></em>' attribute.
	 * The default value is <code>"(5 0 1)"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion First Light Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion First Light Direction</em>' attribute.
	 * @see #isSetExtrusionFirstLightDirection()
	 * @see #unsetExtrusionFirstLightDirection()
	 * @see #setExtrusionFirstLightDirection(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionFirstLightDirection()
	 * @model default="(5 0 1)" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='extrusion-first-light-direction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionFirstLightDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion First Light Direction</em>' attribute.
	 * @see #isSetExtrusionFirstLightDirection()
	 * @see #unsetExtrusionFirstLightDirection()
	 * @see #getExtrusionFirstLightDirection()
	 * @generated
	 */
	void setExtrusionFirstLightDirection(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionFirstLightDirection()
	 * @see #getExtrusionFirstLightDirection()
	 * @see #setExtrusionFirstLightDirection(String)
	 * @generated
	 */
	void unsetExtrusionFirstLightDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightDirection <em>Extrusion First Light Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion First Light Direction</em>' attribute is set.
	 * @see #unsetExtrusionFirstLightDirection()
	 * @see #getExtrusionFirstLightDirection()
	 * @see #setExtrusionFirstLightDirection(String)
	 * @generated
	 */
	boolean isSetExtrusionFirstLightDirection();

	/**
	 * Returns the value of the '<em><b>Extrusion First Light Harsh</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion First Light Harsh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion First Light Harsh</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionFirstLightHarsh()
	 * @see #unsetExtrusionFirstLightHarsh()
	 * @see #setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionFirstLightHarsh()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-first-light-harsh' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionFirstLightHarsh();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion First Light Harsh</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionFirstLightHarsh()
	 * @see #unsetExtrusionFirstLightHarsh()
	 * @see #getExtrusionFirstLightHarsh()
	 * @generated
	 */
	void setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionFirstLightHarsh()
	 * @see #getExtrusionFirstLightHarsh()
	 * @see #setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionFirstLightHarsh();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightHarsh <em>Extrusion First Light Harsh</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion First Light Harsh</em>' attribute is set.
	 * @see #unsetExtrusionFirstLightHarsh()
	 * @see #getExtrusionFirstLightHarsh()
	 * @see #setExtrusionFirstLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionFirstLightHarsh();

	/**
	 * Returns the value of the '<em><b>Extrusion First Light Level</b></em>' attribute.
	 * The default value is <code>"66%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion First Light Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion First Light Level</em>' attribute.
	 * @see #isSetExtrusionFirstLightLevel()
	 * @see #unsetExtrusionFirstLightLevel()
	 * @see #setExtrusionFirstLightLevel(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionFirstLightLevel()
	 * @model default="66%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-first-light-level' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionFirstLightLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion First Light Level</em>' attribute.
	 * @see #isSetExtrusionFirstLightLevel()
	 * @see #unsetExtrusionFirstLightLevel()
	 * @see #getExtrusionFirstLightLevel()
	 * @generated
	 */
	void setExtrusionFirstLightLevel(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionFirstLightLevel()
	 * @see #getExtrusionFirstLightLevel()
	 * @see #setExtrusionFirstLightLevel(String)
	 * @generated
	 */
	void unsetExtrusionFirstLightLevel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionFirstLightLevel <em>Extrusion First Light Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion First Light Level</em>' attribute is set.
	 * @see #unsetExtrusionFirstLightLevel()
	 * @see #getExtrusionFirstLightLevel()
	 * @see #setExtrusionFirstLightLevel(String)
	 * @generated
	 */
	boolean isSetExtrusionFirstLightLevel();

	/**
	 * Returns the value of the '<em><b>Extrusion Light Face</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Light Face</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Light Face</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionLightFace()
	 * @see #unsetExtrusionLightFace()
	 * @see #setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionLightFace()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-light-face' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionLightFace();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionLightFace <em>Extrusion Light Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Light Face</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionLightFace()
	 * @see #unsetExtrusionLightFace()
	 * @see #getExtrusionLightFace()
	 * @generated
	 */
	void setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionLightFace <em>Extrusion Light Face</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionLightFace()
	 * @see #getExtrusionLightFace()
	 * @see #setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionLightFace();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionLightFace <em>Extrusion Light Face</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Light Face</em>' attribute is set.
	 * @see #unsetExtrusionLightFace()
	 * @see #getExtrusionLightFace()
	 * @see #setExtrusionLightFace(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionLightFace();

	/**
	 * Returns the value of the '<em><b>Extrusion Metal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Metal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Metal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionMetal()
	 * @see #unsetExtrusionMetal()
	 * @see #setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionMetal()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-metal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionMetal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionMetal <em>Extrusion Metal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Metal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionMetal()
	 * @see #unsetExtrusionMetal()
	 * @see #getExtrusionMetal()
	 * @generated
	 */
	void setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionMetal <em>Extrusion Metal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionMetal()
	 * @see #getExtrusionMetal()
	 * @see #setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionMetal();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionMetal <em>Extrusion Metal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Metal</em>' attribute is set.
	 * @see #unsetExtrusionMetal()
	 * @see #getExtrusionMetal()
	 * @see #setExtrusionMetal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionMetal();

	/**
	 * Returns the value of the '<em><b>Extrusion Number Of Line Segments</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Number Of Line Segments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Number Of Line Segments</em>' attribute.
	 * @see #isSetExtrusionNumberOfLineSegments()
	 * @see #unsetExtrusionNumberOfLineSegments()
	 * @see #setExtrusionNumberOfLineSegments(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionNumberOfLineSegments()
	 * @model default="30" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='extrusion-number-of-line-segments' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getExtrusionNumberOfLineSegments();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Number Of Line Segments</em>' attribute.
	 * @see #isSetExtrusionNumberOfLineSegments()
	 * @see #unsetExtrusionNumberOfLineSegments()
	 * @see #getExtrusionNumberOfLineSegments()
	 * @generated
	 */
	void setExtrusionNumberOfLineSegments(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionNumberOfLineSegments()
	 * @see #getExtrusionNumberOfLineSegments()
	 * @see #setExtrusionNumberOfLineSegments(BigInteger)
	 * @generated
	 */
	void unsetExtrusionNumberOfLineSegments();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionNumberOfLineSegments <em>Extrusion Number Of Line Segments</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Number Of Line Segments</em>' attribute is set.
	 * @see #unsetExtrusionNumberOfLineSegments()
	 * @see #getExtrusionNumberOfLineSegments()
	 * @see #setExtrusionNumberOfLineSegments(BigInteger)
	 * @generated
	 */
	boolean isSetExtrusionNumberOfLineSegments();

	/**
	 * Returns the value of the '<em><b>Extrusion Origin</b></em>' attribute.
	 * The default value is <code>"0.5 -0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Origin</em>' attribute.
	 * @see #isSetExtrusionOrigin()
	 * @see #unsetExtrusionOrigin()
	 * @see #setExtrusionOrigin(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionOrigin()
	 * @model default="0.5 -0.5" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.ExtrusionOriginType" many="false"
	 *        extendedMetaData="kind='attribute' name='extrusion-origin' namespace='##targetNamespace'"
	 * @generated
	 */
	List getExtrusionOrigin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionOrigin <em>Extrusion Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Origin</em>' attribute.
	 * @see #isSetExtrusionOrigin()
	 * @see #unsetExtrusionOrigin()
	 * @see #getExtrusionOrigin()
	 * @generated
	 */
	void setExtrusionOrigin(List value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionOrigin <em>Extrusion Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionOrigin()
	 * @see #getExtrusionOrigin()
	 * @see #setExtrusionOrigin(List)
	 * @generated
	 */
	void unsetExtrusionOrigin();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionOrigin <em>Extrusion Origin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Origin</em>' attribute is set.
	 * @see #unsetExtrusionOrigin()
	 * @see #getExtrusionOrigin()
	 * @see #setExtrusionOrigin(List)
	 * @generated
	 */
	boolean isSetExtrusionOrigin();

	/**
	 * Returns the value of the '<em><b>Extrusion Rotation Angle</b></em>' attribute.
	 * The default value is <code>"0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Rotation Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Rotation Angle</em>' attribute.
	 * @see #isSetExtrusionRotationAngle()
	 * @see #unsetExtrusionRotationAngle()
	 * @see #setExtrusionRotationAngle(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionRotationAngle()
	 * @model default="0 0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.ExtrusionRotationAngleType" many="false"
	 *        extendedMetaData="kind='attribute' name='extrusion-rotation-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	List getExtrusionRotationAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Rotation Angle</em>' attribute.
	 * @see #isSetExtrusionRotationAngle()
	 * @see #unsetExtrusionRotationAngle()
	 * @see #getExtrusionRotationAngle()
	 * @generated
	 */
	void setExtrusionRotationAngle(List value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionRotationAngle()
	 * @see #getExtrusionRotationAngle()
	 * @see #setExtrusionRotationAngle(List)
	 * @generated
	 */
	void unsetExtrusionRotationAngle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationAngle <em>Extrusion Rotation Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Rotation Angle</em>' attribute is set.
	 * @see #unsetExtrusionRotationAngle()
	 * @see #getExtrusionRotationAngle()
	 * @see #setExtrusionRotationAngle(List)
	 * @generated
	 */
	boolean isSetExtrusionRotationAngle();

	/**
	 * Returns the value of the '<em><b>Extrusion Rotation Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Rotation Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Rotation Center</em>' attribute.
	 * @see #setExtrusionRotationCenter(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionRotationCenter()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='extrusion-rotation-center' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionRotationCenter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionRotationCenter <em>Extrusion Rotation Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Rotation Center</em>' attribute.
	 * @see #getExtrusionRotationCenter()
	 * @generated
	 */
	void setExtrusionRotationCenter(String value);

	/**
	 * Returns the value of the '<em><b>Extrusion Second Light Direction</b></em>' attribute.
	 * The default value is <code>"(-5 0 1)"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Second Light Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Second Light Direction</em>' attribute.
	 * @see #isSetExtrusionSecondLightDirection()
	 * @see #unsetExtrusionSecondLightDirection()
	 * @see #setExtrusionSecondLightDirection(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionSecondLightDirection()
	 * @model default="(-5 0 1)" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Vector3D"
	 *        extendedMetaData="kind='attribute' name='extrusion-second-light-direction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionSecondLightDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Second Light Direction</em>' attribute.
	 * @see #isSetExtrusionSecondLightDirection()
	 * @see #unsetExtrusionSecondLightDirection()
	 * @see #getExtrusionSecondLightDirection()
	 * @generated
	 */
	void setExtrusionSecondLightDirection(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionSecondLightDirection()
	 * @see #getExtrusionSecondLightDirection()
	 * @see #setExtrusionSecondLightDirection(String)
	 * @generated
	 */
	void unsetExtrusionSecondLightDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightDirection <em>Extrusion Second Light Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Second Light Direction</em>' attribute is set.
	 * @see #unsetExtrusionSecondLightDirection()
	 * @see #getExtrusionSecondLightDirection()
	 * @see #setExtrusionSecondLightDirection(String)
	 * @generated
	 */
	boolean isSetExtrusionSecondLightDirection();

	/**
	 * Returns the value of the '<em><b>Extrusion Second Light Harsh</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Second Light Harsh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Second Light Harsh</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionSecondLightHarsh()
	 * @see #unsetExtrusionSecondLightHarsh()
	 * @see #setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionSecondLightHarsh()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='extrusion-second-light-harsh' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getExtrusionSecondLightHarsh();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Second Light Harsh</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetExtrusionSecondLightHarsh()
	 * @see #unsetExtrusionSecondLightHarsh()
	 * @see #getExtrusionSecondLightHarsh()
	 * @generated
	 */
	void setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionSecondLightHarsh()
	 * @see #getExtrusionSecondLightHarsh()
	 * @see #setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetExtrusionSecondLightHarsh();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightHarsh <em>Extrusion Second Light Harsh</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Second Light Harsh</em>' attribute is set.
	 * @see #unsetExtrusionSecondLightHarsh()
	 * @see #getExtrusionSecondLightHarsh()
	 * @see #setExtrusionSecondLightHarsh(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetExtrusionSecondLightHarsh();

	/**
	 * Returns the value of the '<em><b>Extrusion Second Light Level</b></em>' attribute.
	 * The default value is <code>"66%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Second Light Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Second Light Level</em>' attribute.
	 * @see #isSetExtrusionSecondLightLevel()
	 * @see #unsetExtrusionSecondLightLevel()
	 * @see #setExtrusionSecondLightLevel(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionSecondLightLevel()
	 * @model default="66%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-second-light-level' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionSecondLightLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Second Light Level</em>' attribute.
	 * @see #isSetExtrusionSecondLightLevel()
	 * @see #unsetExtrusionSecondLightLevel()
	 * @see #getExtrusionSecondLightLevel()
	 * @generated
	 */
	void setExtrusionSecondLightLevel(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionSecondLightLevel()
	 * @see #getExtrusionSecondLightLevel()
	 * @see #setExtrusionSecondLightLevel(String)
	 * @generated
	 */
	void unsetExtrusionSecondLightLevel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSecondLightLevel <em>Extrusion Second Light Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Second Light Level</em>' attribute is set.
	 * @see #unsetExtrusionSecondLightLevel()
	 * @see #getExtrusionSecondLightLevel()
	 * @see #setExtrusionSecondLightLevel(String)
	 * @generated
	 */
	boolean isSetExtrusionSecondLightLevel();

	/**
	 * Returns the value of the '<em><b>Extrusion Shininess</b></em>' attribute.
	 * The default value is <code>"50%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Shininess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Shininess</em>' attribute.
	 * @see #isSetExtrusionShininess()
	 * @see #unsetExtrusionShininess()
	 * @see #setExtrusionShininess(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionShininess()
	 * @model default="50%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-shininess' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionShininess();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionShininess <em>Extrusion Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Shininess</em>' attribute.
	 * @see #isSetExtrusionShininess()
	 * @see #unsetExtrusionShininess()
	 * @see #getExtrusionShininess()
	 * @generated
	 */
	void setExtrusionShininess(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionShininess <em>Extrusion Shininess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionShininess()
	 * @see #getExtrusionShininess()
	 * @see #setExtrusionShininess(String)
	 * @generated
	 */
	void unsetExtrusionShininess();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionShininess <em>Extrusion Shininess</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Shininess</em>' attribute is set.
	 * @see #unsetExtrusionShininess()
	 * @see #getExtrusionShininess()
	 * @see #setExtrusionShininess(String)
	 * @generated
	 */
	boolean isSetExtrusionShininess();

	/**
	 * Returns the value of the '<em><b>Extrusion Skew</b></em>' attribute.
	 * The default value is <code>"50 45"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Skew</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Skew</em>' attribute.
	 * @see #isSetExtrusionSkew()
	 * @see #unsetExtrusionSkew()
	 * @see #setExtrusionSkew(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionSkew()
	 * @model default="50 45" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.drawing.ExtrusionSkewType" many="false"
	 *        extendedMetaData="kind='attribute' name='extrusion-skew' namespace='##targetNamespace'"
	 * @generated
	 */
	List getExtrusionSkew();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSkew <em>Extrusion Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Skew</em>' attribute.
	 * @see #isSetExtrusionSkew()
	 * @see #unsetExtrusionSkew()
	 * @see #getExtrusionSkew()
	 * @generated
	 */
	void setExtrusionSkew(List value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSkew <em>Extrusion Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionSkew()
	 * @see #getExtrusionSkew()
	 * @see #setExtrusionSkew(List)
	 * @generated
	 */
	void unsetExtrusionSkew();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSkew <em>Extrusion Skew</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Skew</em>' attribute is set.
	 * @see #unsetExtrusionSkew()
	 * @see #getExtrusionSkew()
	 * @see #setExtrusionSkew(List)
	 * @generated
	 */
	boolean isSetExtrusionSkew();

	/**
	 * Returns the value of the '<em><b>Extrusion Specularity</b></em>' attribute.
	 * The default value is <code>"0%"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Specularity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Specularity</em>' attribute.
	 * @see #isSetExtrusionSpecularity()
	 * @see #unsetExtrusionSpecularity()
	 * @see #setExtrusionSpecularity(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionSpecularity()
	 * @model default="0%" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='extrusion-specularity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionSpecularity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSpecularity <em>Extrusion Specularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Specularity</em>' attribute.
	 * @see #isSetExtrusionSpecularity()
	 * @see #unsetExtrusionSpecularity()
	 * @see #getExtrusionSpecularity()
	 * @generated
	 */
	void setExtrusionSpecularity(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSpecularity <em>Extrusion Specularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionSpecularity()
	 * @see #getExtrusionSpecularity()
	 * @see #setExtrusionSpecularity(String)
	 * @generated
	 */
	void unsetExtrusionSpecularity();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionSpecularity <em>Extrusion Specularity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Specularity</em>' attribute is set.
	 * @see #unsetExtrusionSpecularity()
	 * @see #getExtrusionSpecularity()
	 * @see #setExtrusionSpecularity(String)
	 * @generated
	 */
	boolean isSetExtrusionSpecularity();

	/**
	 * Returns the value of the '<em><b>Extrusion Viewpoint</b></em>' attribute.
	 * The default value is <code>"3.5cm -3.5cm 25cm"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrusion Viewpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusion Viewpoint</em>' attribute.
	 * @see #isSetExtrusionViewpoint()
	 * @see #unsetExtrusionViewpoint()
	 * @see #setExtrusionViewpoint(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ExtrusionViewpoint()
	 * @model default="3.5cm -3.5cm 25cm" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Point3D"
	 *        extendedMetaData="kind='attribute' name='extrusion-viewpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtrusionViewpoint();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusion Viewpoint</em>' attribute.
	 * @see #isSetExtrusionViewpoint()
	 * @see #unsetExtrusionViewpoint()
	 * @see #getExtrusionViewpoint()
	 * @generated
	 */
	void setExtrusionViewpoint(String value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrusionViewpoint()
	 * @see #getExtrusionViewpoint()
	 * @see #setExtrusionViewpoint(String)
	 * @generated
	 */
	void unsetExtrusionViewpoint();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getExtrusionViewpoint <em>Extrusion Viewpoint</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrusion Viewpoint</em>' attribute is set.
	 * @see #unsetExtrusionViewpoint()
	 * @see #getExtrusionViewpoint()
	 * @see #setExtrusionViewpoint(String)
	 * @generated
	 */
	boolean isSetExtrusionViewpoint();

	/**
	 * Returns the value of the '<em><b>Glue Point Leaving Directions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Point Leaving Directions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Point Leaving Directions</em>' attribute.
	 * @see #setGluePointLeavingDirections(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_GluePointLeavingDirections()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='glue-point-leaving-directions' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getGluePointLeavingDirections();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointLeavingDirections <em>Glue Point Leaving Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue Point Leaving Directions</em>' attribute.
	 * @see #getGluePointLeavingDirections()
	 * @generated
	 */
	void setGluePointLeavingDirections(Object value);

	/**
	 * Returns the value of the '<em><b>Glue Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Points</em>' attribute.
	 * @see #setGluePoints(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_GluePoints()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='glue-points' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGluePoints();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePoints <em>Glue Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue Points</em>' attribute.
	 * @see #getGluePoints()
	 * @generated
	 */
	void setGluePoints(String value);

	/**
	 * Returns the value of the '<em><b>Glue Point Type</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue Point Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue Point Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType
	 * @see #isSetGluePointType()
	 * @see #unsetGluePointType()
	 * @see #setGluePointType(GluePointTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_GluePointType()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='glue-point-type' namespace='##targetNamespace'"
	 * @generated
	 */
	GluePointTypeType getGluePointType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointType <em>Glue Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue Point Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.GluePointTypeType
	 * @see #isSetGluePointType()
	 * @see #unsetGluePointType()
	 * @see #getGluePointType()
	 * @generated
	 */
	void setGluePointType(GluePointTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointType <em>Glue Point Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGluePointType()
	 * @see #getGluePointType()
	 * @see #setGluePointType(GluePointTypeType)
	 * @generated
	 */
	void unsetGluePointType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getGluePointType <em>Glue Point Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Glue Point Type</em>' attribute is set.
	 * @see #unsetGluePointType()
	 * @see #getGluePointType()
	 * @see #setGluePointType(GluePointTypeType)
	 * @generated
	 */
	boolean isSetGluePointType();

	/**
	 * Returns the value of the '<em><b>Mirror Horizontal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mirror Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mirror Horizontal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMirrorHorizontal()
	 * @see #unsetMirrorHorizontal()
	 * @see #setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_MirrorHorizontal()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mirror-horizontal' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMirrorHorizontal();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorHorizontal <em>Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirror Horizontal</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMirrorHorizontal()
	 * @see #unsetMirrorHorizontal()
	 * @see #getMirrorHorizontal()
	 * @generated
	 */
	void setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorHorizontal <em>Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMirrorHorizontal()
	 * @see #getMirrorHorizontal()
	 * @see #setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMirrorHorizontal();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorHorizontal <em>Mirror Horizontal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mirror Horizontal</em>' attribute is set.
	 * @see #unsetMirrorHorizontal()
	 * @see #getMirrorHorizontal()
	 * @see #setMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMirrorHorizontal();

	/**
	 * Returns the value of the '<em><b>Mirror Vertical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mirror Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mirror Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMirrorVertical()
	 * @see #unsetMirrorVertical()
	 * @see #setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_MirrorVertical()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mirror-vertical' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMirrorVertical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorVertical <em>Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirror Vertical</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMirrorVertical()
	 * @see #unsetMirrorVertical()
	 * @see #getMirrorVertical()
	 * @generated
	 */
	void setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorVertical <em>Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMirrorVertical()
	 * @see #getMirrorVertical()
	 * @see #setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMirrorVertical();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getMirrorVertical <em>Mirror Vertical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mirror Vertical</em>' attribute is set.
	 * @see #unsetMirrorVertical()
	 * @see #getMirrorVertical()
	 * @see #setMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMirrorVertical();

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute.
	 * @see #setModifiers(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_Modifiers()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='modifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModifiers();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getModifiers <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifiers</em>' attribute.
	 * @see #getModifiers()
	 * @generated
	 */
	void setModifiers(String value);

	/**
	 * Returns the value of the '<em><b>Path Stretchpoint X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Stretchpoint X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Stretchpoint X</em>' attribute.
	 * @see #isSetPathStretchpointX()
	 * @see #unsetPathStretchpointX()
	 * @see #setPathStretchpointX(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_PathStretchpointX()
	 * @model default="0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='path-stretchpoint-x' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPathStretchpointX();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointX <em>Path Stretchpoint X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Stretchpoint X</em>' attribute.
	 * @see #isSetPathStretchpointX()
	 * @see #unsetPathStretchpointX()
	 * @see #getPathStretchpointX()
	 * @generated
	 */
	void setPathStretchpointX(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointX <em>Path Stretchpoint X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPathStretchpointX()
	 * @see #getPathStretchpointX()
	 * @see #setPathStretchpointX(double)
	 * @generated
	 */
	void unsetPathStretchpointX();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointX <em>Path Stretchpoint X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path Stretchpoint X</em>' attribute is set.
	 * @see #unsetPathStretchpointX()
	 * @see #getPathStretchpointX()
	 * @see #setPathStretchpointX(double)
	 * @generated
	 */
	boolean isSetPathStretchpointX();

	/**
	 * Returns the value of the '<em><b>Path Stretchpoint Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Stretchpoint Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Stretchpoint Y</em>' attribute.
	 * @see #isSetPathStretchpointY()
	 * @see #unsetPathStretchpointY()
	 * @see #setPathStretchpointY(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_PathStretchpointY()
	 * @model default="0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='path-stretchpoint-y' namespace='##targetNamespace'"
	 * @generated
	 */
	double getPathStretchpointY();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointY <em>Path Stretchpoint Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Stretchpoint Y</em>' attribute.
	 * @see #isSetPathStretchpointY()
	 * @see #unsetPathStretchpointY()
	 * @see #getPathStretchpointY()
	 * @generated
	 */
	void setPathStretchpointY(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointY <em>Path Stretchpoint Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPathStretchpointY()
	 * @see #getPathStretchpointY()
	 * @see #setPathStretchpointY(double)
	 * @generated
	 */
	void unsetPathStretchpointY();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getPathStretchpointY <em>Path Stretchpoint Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path Stretchpoint Y</em>' attribute is set.
	 * @see #unsetPathStretchpointY()
	 * @see #getPathStretchpointY()
	 * @see #setPathStretchpointY(double)
	 * @generated
	 */
	boolean isSetPathStretchpointY();

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' attribute.
	 * The default value is <code>"parallel"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_Projection()
	 * @model default="parallel" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='projection' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	ProjectionType getProjection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getProjection <em>Projection</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getProjection <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjection()
	 * @see #getProjection()
	 * @see #setProjection(ProjectionType)
	 * @generated
	 */
	void unsetProjection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getProjection <em>Projection</em>}' attribute is set.
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
	 * The default value is <code>"flat"</code>.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ShadeMode()
	 * @model default="flat" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shade-mode' namespace='urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0'"
	 * @generated
	 */
	ShadeModeType getShadeMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getShadeMode <em>Shade Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getShadeMode <em>Shade Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShadeMode()
	 * @see #getShadeMode()
	 * @see #setShadeMode(ShadeModeType)
	 * @generated
	 */
	void unsetShadeMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getShadeMode <em>Shade Mode</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Text Areas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Areas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Areas</em>' attribute.
	 * @see #setTextAreas(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_TextAreas()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='text-areas' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextAreas();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextAreas <em>Text Areas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Areas</em>' attribute.
	 * @see #getTextAreas()
	 * @generated
	 */
	void setTextAreas(String value);

	/**
	 * Returns the value of the '<em><b>Text Path</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPath()
	 * @see #unsetTextPath()
	 * @see #setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_TextPath()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPath();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPath <em>Text Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPath()
	 * @see #unsetTextPath()
	 * @see #getTextPath()
	 * @generated
	 */
	void setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPath <em>Text Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPath()
	 * @see #getTextPath()
	 * @see #setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTextPath();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPath <em>Text Path</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path</em>' attribute is set.
	 * @see #unsetTextPath()
	 * @see #getTextPath()
	 * @see #setTextPath(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTextPath();

	/**
	 * Returns the value of the '<em><b>Text Path Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPathAllowed()
	 * @see #unsetTextPathAllowed()
	 * @see #setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_TextPathAllowed()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path-allowed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPathAllowed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathAllowed <em>Text Path Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path Allowed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPathAllowed()
	 * @see #unsetTextPathAllowed()
	 * @see #getTextPathAllowed()
	 * @generated
	 */
	void setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathAllowed <em>Text Path Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPathAllowed()
	 * @see #getTextPathAllowed()
	 * @see #setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTextPathAllowed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathAllowed <em>Text Path Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path Allowed</em>' attribute is set.
	 * @see #unsetTextPathAllowed()
	 * @see #getTextPathAllowed()
	 * @see #setTextPathAllowed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTextPathAllowed();

	/**
	 * Returns the value of the '<em><b>Text Path Mode</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType
	 * @see #isSetTextPathMode()
	 * @see #unsetTextPathMode()
	 * @see #setTextPathMode(TextPathModeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_TextPathMode()
	 * @model default="normal" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	TextPathModeType getTextPathMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathMode <em>Text Path Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathModeType
	 * @see #isSetTextPathMode()
	 * @see #unsetTextPathMode()
	 * @see #getTextPathMode()
	 * @generated
	 */
	void setTextPathMode(TextPathModeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathMode <em>Text Path Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPathMode()
	 * @see #getTextPathMode()
	 * @see #setTextPathMode(TextPathModeType)
	 * @generated
	 */
	void unsetTextPathMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathMode <em>Text Path Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path Mode</em>' attribute is set.
	 * @see #unsetTextPathMode()
	 * @see #getTextPathMode()
	 * @see #setTextPathMode(TextPathModeType)
	 * @generated
	 */
	boolean isSetTextPathMode();

	/**
	 * Returns the value of the '<em><b>Text Path Same Letter Heights</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path Same Letter Heights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path Same Letter Heights</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPathSameLetterHeights()
	 * @see #unsetTextPathSameLetterHeights()
	 * @see #setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_TextPathSameLetterHeights()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path-same-letter-heights' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getTextPathSameLetterHeights();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path Same Letter Heights</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetTextPathSameLetterHeights()
	 * @see #unsetTextPathSameLetterHeights()
	 * @see #getTextPathSameLetterHeights()
	 * @generated
	 */
	void setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPathSameLetterHeights()
	 * @see #getTextPathSameLetterHeights()
	 * @see #setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetTextPathSameLetterHeights();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathSameLetterHeights <em>Text Path Same Letter Heights</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path Same Letter Heights</em>' attribute is set.
	 * @see #unsetTextPathSameLetterHeights()
	 * @see #getTextPathSameLetterHeights()
	 * @see #setTextPathSameLetterHeights(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetTextPathSameLetterHeights();

	/**
	 * Returns the value of the '<em><b>Text Path Scale</b></em>' attribute.
	 * The default value is <code>"path"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Path Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Path Scale</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType
	 * @see #isSetTextPathScale()
	 * @see #unsetTextPathScale()
	 * @see #setTextPathScale(TextPathScaleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_TextPathScale()
	 * @model default="path" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-path-scale' namespace='##targetNamespace'"
	 * @generated
	 */
	TextPathScaleType getTextPathScale();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathScale <em>Text Path Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Path Scale</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.TextPathScaleType
	 * @see #isSetTextPathScale()
	 * @see #unsetTextPathScale()
	 * @see #getTextPathScale()
	 * @generated
	 */
	void setTextPathScale(TextPathScaleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathScale <em>Text Path Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextPathScale()
	 * @see #getTextPathScale()
	 * @see #setTextPathScale(TextPathScaleType)
	 * @generated
	 */
	void unsetTextPathScale();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextPathScale <em>Text Path Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Path Scale</em>' attribute is set.
	 * @see #unsetTextPathScale()
	 * @see #getTextPathScale()
	 * @see #setTextPathScale(TextPathScaleType)
	 * @generated
	 */
	boolean isSetTextPathScale();

	/**
	 * Returns the value of the '<em><b>Text Rotate Angle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Rotate Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Rotate Angle</em>' attribute.
	 * @see #isSetTextRotateAngle()
	 * @see #unsetTextRotateAngle()
	 * @see #setTextRotateAngle(double)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_TextRotateAngle()
	 * @model default="0" unsettable="true" dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Double"
	 *        extendedMetaData="kind='attribute' name='text-rotate-angle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTextRotateAngle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextRotateAngle <em>Text Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Rotate Angle</em>' attribute.
	 * @see #isSetTextRotateAngle()
	 * @see #unsetTextRotateAngle()
	 * @see #getTextRotateAngle()
	 * @generated
	 */
	void setTextRotateAngle(double value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextRotateAngle <em>Text Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextRotateAngle()
	 * @see #getTextRotateAngle()
	 * @see #setTextRotateAngle(double)
	 * @generated
	 */
	void unsetTextRotateAngle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getTextRotateAngle <em>Text Rotate Angle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Rotate Angle</em>' attribute is set.
	 * @see #unsetTextRotateAngle()
	 * @see #getTextRotateAngle()
	 * @see #setTextRotateAngle(double)
	 * @generated
	 */
	boolean isSetTextRotateAngle();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_Type()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CustomShapeType" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>View Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Box</em>' attribute.
	 * @see #setViewBox(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage#getEnhancedGeometryType_ViewBox()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.ViewBoxType" many="false"
	 *        extendedMetaData="kind='attribute' name='viewBox' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	List getViewBox();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.EnhancedGeometryType#getViewBox <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Box</em>' attribute.
	 * @see #getViewBox()
	 * @generated
	 */
	void setViewBox(List value);

} // EnhancedGeometryType
