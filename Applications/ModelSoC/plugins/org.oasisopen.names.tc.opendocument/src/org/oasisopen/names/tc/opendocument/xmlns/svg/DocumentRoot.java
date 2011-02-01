/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontVariant;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDefinitionSrc <em>Definition Src</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceFormat <em>Font Face Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceName <em>Font Face Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceSrc <em>Font Face Src</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceUri <em>Font Face Uri</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getLinearGradient <em>Linear Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRadialGradient <em>Radial Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStop <em>Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAccentHeight <em>Accent Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAlphabetic <em>Alphabetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAscent <em>Ascent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getBbox <em>Bbox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCapHeight <em>Cap Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCx <em>Cx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCy <em>Cy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getD <em>D</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDescent <em>Descent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFillRule <em>Fill Rule</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStretch <em>Font Stretch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientTransform <em>Gradient Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientUnits <em>Gradient Units</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getHanging <em>Hanging</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getIdeographic <em>Ideographic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getMathematical <em>Mathematical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOverlinePosition <em>Overline Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOverlineThickness <em>Overline Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getPanose1 <em>Panose1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getR <em>R</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRx <em>Rx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRy <em>Ry</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSlope <em>Slope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSpreadMethod <em>Spread Method</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStemh <em>Stemh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStemv <em>Stemv</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrikethroughPosition <em>Strikethrough Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrikethroughThickness <em>Strikethrough Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnderlinePosition <em>Underline Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnderlineThickness <em>Underline Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnicodeRange <em>Unicode Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnitsPerEm <em>Units Per Em</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVAlphabetic <em>VAlphabetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVHanging <em>VHanging</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVIdeographic <em>VIdeographic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getViewBox <em>View Box</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVMathematical <em>VMathematical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getWidths <em>Widths</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getX1 <em>X1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getX2 <em>X2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXHeight <em>XHeight</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getY2 <em>Y2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Mixed()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Definition Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Src</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Src</em>' containment reference.
	 * @see #setDefinitionSrc(DefinitionSrcType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_DefinitionSrc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='definition-src' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionSrcType getDefinitionSrc();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDefinitionSrc <em>Definition Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Src</em>' containment reference.
	 * @see #getDefinitionSrc()
	 * @generated
	 */
	void setDefinitionSrc(DefinitionSrcType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Desc()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='desc' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Font Face Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face Format</em>' containment reference.
	 * @see #setFontFaceFormat(FontFaceFormatType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontFaceFormat()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font-face-format' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFaceFormatType getFontFaceFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceFormat <em>Font Face Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Face Format</em>' containment reference.
	 * @see #getFontFaceFormat()
	 * @generated
	 */
	void setFontFaceFormat(FontFaceFormatType value);

	/**
	 * Returns the value of the '<em><b>Font Face Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face Name</em>' containment reference.
	 * @see #setFontFaceName(FontFaceNameType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontFaceName()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font-face-name' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFaceNameType getFontFaceName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceName <em>Font Face Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Face Name</em>' containment reference.
	 * @see #getFontFaceName()
	 * @generated
	 */
	void setFontFaceName(FontFaceNameType value);

	/**
	 * Returns the value of the '<em><b>Font Face Src</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face Src</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face Src</em>' containment reference.
	 * @see #setFontFaceSrc(FontFaceSrcType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontFaceSrc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font-face-src' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFaceSrcType getFontFaceSrc();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceSrc <em>Font Face Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Face Src</em>' containment reference.
	 * @see #getFontFaceSrc()
	 * @generated
	 */
	void setFontFaceSrc(FontFaceSrcType value);

	/**
	 * Returns the value of the '<em><b>Font Face Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Face Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Face Uri</em>' containment reference.
	 * @see #setFontFaceUri(FontFaceUriType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontFaceUri()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='font-face-uri' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFaceUriType getFontFaceUri();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFaceUri <em>Font Face Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Face Uri</em>' containment reference.
	 * @see #getFontFaceUri()
	 * @generated
	 */
	void setFontFaceUri(FontFaceUriType value);

	/**
	 * Returns the value of the '<em><b>Linear Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Gradient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Gradient</em>' containment reference.
	 * @see #setLinearGradient(LinearGradientType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_LinearGradient()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='linearGradient' namespace='##targetNamespace'"
	 * @generated
	 */
	LinearGradientType getLinearGradient();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getLinearGradient <em>Linear Gradient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Gradient</em>' containment reference.
	 * @see #getLinearGradient()
	 * @generated
	 */
	void setLinearGradient(LinearGradientType value);

	/**
	 * Returns the value of the '<em><b>Radial Gradient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radial Gradient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radial Gradient</em>' containment reference.
	 * @see #setRadialGradient(RadialGradientType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_RadialGradient()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='radialGradient' namespace='##targetNamespace'"
	 * @generated
	 */
	RadialGradientType getRadialGradient();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRadialGradient <em>Radial Gradient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radial Gradient</em>' containment reference.
	 * @see #getRadialGradient()
	 * @generated
	 */
	void setRadialGradient(RadialGradientType value);

	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference.
	 * @see #setStop(StopType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Stop()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stop' namespace='##targetNamespace'"
	 * @generated
	 */
	StopType getStop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStop <em>Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' containment reference.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(StopType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Accent Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accent Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accent Height</em>' attribute.
	 * @see #setAccentHeight(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_AccentHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='accent-height' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAccentHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAccentHeight <em>Accent Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accent Height</em>' attribute.
	 * @see #getAccentHeight()
	 * @generated
	 */
	void setAccentHeight(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Alphabetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetic</em>' attribute.
	 * @see #setAlphabetic(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Alphabetic()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='alphabetic' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAlphabetic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAlphabetic <em>Alphabetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabetic</em>' attribute.
	 * @see #getAlphabetic()
	 * @generated
	 */
	void setAlphabetic(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ascent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ascent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ascent</em>' attribute.
	 * @see #setAscent(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Ascent()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='ascent' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAscent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getAscent <em>Ascent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascent</em>' attribute.
	 * @see #getAscent()
	 * @generated
	 */
	void setAscent(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bbox</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bbox</em>' attribute.
	 * @see #setBbox(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Bbox()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='bbox' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getBbox();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getBbox <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bbox</em>' attribute.
	 * @see #getBbox()
	 * @generated
	 */
	void setBbox(Object value);

	/**
	 * Returns the value of the '<em><b>Cap Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap Height</em>' attribute.
	 * @see #setCapHeight(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_CapHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='cap-height' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCapHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCapHeight <em>Cap Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap Height</em>' attribute.
	 * @see #getCapHeight()
	 * @generated
	 */
	void setCapHeight(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cx</em>' attribute.
	 * @see #setCx(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Cx()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='cx' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCx();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCx <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cx</em>' attribute.
	 * @see #getCx()
	 * @generated
	 */
	void setCx(String value);

	/**
	 * Returns the value of the '<em><b>Cy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cy</em>' attribute.
	 * @see #setCy(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Cy()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='cy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getCy <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cy</em>' attribute.
	 * @see #getCy()
	 * @generated
	 */
	void setCy(String value);

	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_D()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PathData"
	 *        extendedMetaData="kind='attribute' name='d' namespace='##targetNamespace'"
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(String value);

	/**
	 * Returns the value of the '<em><b>Descent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descent</em>' attribute.
	 * @see #setDescent(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Descent()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='descent' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDescent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getDescent <em>Descent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descent</em>' attribute.
	 * @see #getDescent()
	 * @generated
	 */
	void setDescent(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fill Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Rule</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType
	 * @see #isSetFillRule()
	 * @see #unsetFillRule()
	 * @see #setFillRule(FillRuleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FillRule()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fill-rule' namespace='##targetNamespace'"
	 * @generated
	 */
	FillRuleType getFillRule();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFillRule <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Rule</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType
	 * @see #isSetFillRule()
	 * @see #unsetFillRule()
	 * @see #getFillRule()
	 * @generated
	 */
	void setFillRule(FillRuleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFillRule <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFillRule()
	 * @see #getFillRule()
	 * @see #setFillRule(FillRuleType)
	 * @generated
	 */
	void unsetFillRule();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFillRule <em>Fill Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill Rule</em>' attribute is set.
	 * @see #unsetFillRule()
	 * @see #getFillRule()
	 * @see #setFillRule(FillRuleType)
	 * @generated
	 */
	boolean isSetFillRule();

	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see #setFontFamily(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontFamily()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-family' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontSize()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveLength"
	 *        extendedMetaData="kind='attribute' name='font-size' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(String value);

	/**
	 * Returns the value of the '<em><b>Font Stretch</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Stretch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Stretch</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType
	 * @see #isSetFontStretch()
	 * @see #unsetFontStretch()
	 * @see #setFontStretch(FontStretchType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontStretch()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-stretch' namespace='##targetNamespace'"
	 * @generated
	 */
	FontStretchType getFontStretch();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStretch <em>Font Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Stretch</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType
	 * @see #isSetFontStretch()
	 * @see #unsetFontStretch()
	 * @see #getFontStretch()
	 * @generated
	 */
	void setFontStretch(FontStretchType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStretch <em>Font Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStretch()
	 * @see #getFontStretch()
	 * @see #setFontStretch(FontStretchType)
	 * @generated
	 */
	void unsetFontStretch();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStretch <em>Font Stretch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Stretch</em>' attribute is set.
	 * @see #unsetFontStretch()
	 * @see #getFontStretch()
	 * @see #setFontStretch(FontStretchType)
	 * @generated
	 */
	boolean isSetFontStretch();

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle
	 * @see #isSetFontStyle()
	 * @see #unsetFontStyle()
	 * @see #setFontStyle(FontStyle)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-style' namespace='##targetNamespace'"
	 * @generated
	 */
	FontStyle getFontStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle
	 * @see #isSetFontStyle()
	 * @see #unsetFontStyle()
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(FontStyle value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(FontStyle)
	 * @generated
	 */
	void unsetFontStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontStyle <em>Font Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Style</em>' attribute is set.
	 * @see #unsetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(FontStyle)
	 * @generated
	 */
	boolean isSetFontStyle();

	/**
	 * Returns the value of the '<em><b>Font Variant</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontVariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Variant</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontVariant
	 * @see #isSetFontVariant()
	 * @see #unsetFontVariant()
	 * @see #setFontVariant(FontVariant)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontVariant()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-variant' namespace='##targetNamespace'"
	 * @generated
	 */
	FontVariant getFontVariant();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontVariant <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Variant</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontVariant
	 * @see #isSetFontVariant()
	 * @see #unsetFontVariant()
	 * @see #getFontVariant()
	 * @generated
	 */
	void setFontVariant(FontVariant value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontVariant <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontVariant()
	 * @see #getFontVariant()
	 * @see #setFontVariant(FontVariant)
	 * @generated
	 */
	void unsetFontVariant();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontVariant <em>Font Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Variant</em>' attribute is set.
	 * @see #unsetFontVariant()
	 * @see #getFontVariant()
	 * @see #setFontVariant(FontVariant)
	 * @generated
	 */
	boolean isSetFontVariant();

	/**
	 * Returns the value of the '<em><b>Font Weight</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Weight</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight
	 * @see #isSetFontWeight()
	 * @see #unsetFontWeight()
	 * @see #setFontWeight(FontWeight)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_FontWeight()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-weight' namespace='##targetNamespace'"
	 * @generated
	 */
	FontWeight getFontWeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight
	 * @see #isSetFontWeight()
	 * @see #unsetFontWeight()
	 * @see #getFontWeight()
	 * @generated
	 */
	void setFontWeight(FontWeight value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontWeight()
	 * @see #getFontWeight()
	 * @see #setFontWeight(FontWeight)
	 * @generated
	 */
	void unsetFontWeight();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getFontWeight <em>Font Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Weight</em>' attribute is set.
	 * @see #unsetFontWeight()
	 * @see #getFontWeight()
	 * @see #setFontWeight(FontWeight)
	 * @generated
	 */
	boolean isSetFontWeight();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_GradientTransform()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='gradientTransform' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGradientTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientTransform <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Transform</em>' attribute.
	 * @see #getGradientTransform()
	 * @generated
	 */
	void setGradientTransform(String value);

	/**
	 * Returns the value of the '<em><b>Gradient Units</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_GradientUnits()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='gradientUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	GradientUnitsType getGradientUnits();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientUnits <em>Gradient Units</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientUnits <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGradientUnits()
	 * @see #getGradientUnits()
	 * @see #setGradientUnits(GradientUnitsType)
	 * @generated
	 */
	void unsetGradientUnits();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getGradientUnits <em>Gradient Units</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Hanging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hanging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hanging</em>' attribute.
	 * @see #setHanging(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Hanging()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='hanging' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getHanging();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getHanging <em>Hanging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hanging</em>' attribute.
	 * @see #getHanging()
	 * @generated
	 */
	void setHanging(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ideographic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ideographic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ideographic</em>' attribute.
	 * @see #setIdeographic(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Ideographic()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='ideographic' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIdeographic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getIdeographic <em>Ideographic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ideographic</em>' attribute.
	 * @see #getIdeographic()
	 * @generated
	 */
	void setIdeographic(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mathematical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mathematical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathematical</em>' attribute.
	 * @see #setMathematical(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Mathematical()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='mathematical' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMathematical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getMathematical <em>Mathematical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathematical</em>' attribute.
	 * @see #getMathematical()
	 * @generated
	 */
	void setMathematical(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Origin()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrigin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Overline Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overline Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overline Position</em>' attribute.
	 * @see #setOverlinePosition(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_OverlinePosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='overline-position' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOverlinePosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOverlinePosition <em>Overline Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overline Position</em>' attribute.
	 * @see #getOverlinePosition()
	 * @generated
	 */
	void setOverlinePosition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Overline Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overline Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overline Thickness</em>' attribute.
	 * @see #setOverlineThickness(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_OverlineThickness()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='overline-thickness' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOverlineThickness();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getOverlineThickness <em>Overline Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overline Thickness</em>' attribute.
	 * @see #getOverlineThickness()
	 * @generated
	 */
	void setOverlineThickness(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Panose1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panose1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panose1</em>' attribute.
	 * @see #setPanose1(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Panose1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='panose-1' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPanose1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getPanose1 <em>Panose1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panose1</em>' attribute.
	 * @see #getPanose1()
	 * @generated
	 */
	void setPanose1(Object value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Path()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PathData"
	 *        extendedMetaData="kind='attribute' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_R()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='r' namespace='##targetNamespace'"
	 * @generated
	 */
	String getR();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(String value);

	/**
	 * Returns the value of the '<em><b>Rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx</em>' attribute.
	 * @see #setRx(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Rx()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='rx' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRx();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRx <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx</em>' attribute.
	 * @see #getRx()
	 * @generated
	 */
	void setRx(String value);

	/**
	 * Returns the value of the '<em><b>Ry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ry</em>' attribute.
	 * @see #setRy(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Ry()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='ry' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRy();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getRy <em>Ry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ry</em>' attribute.
	 * @see #getRy()
	 * @generated
	 */
	void setRy(String value);

	/**
	 * Returns the value of the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope</em>' attribute.
	 * @see #setSlope(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Slope()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='slope' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getSlope();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope</em>' attribute.
	 * @see #getSlope()
	 * @generated
	 */
	void setSlope(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Spread Method</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_SpreadMethod()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='spreadMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SpreadMethodType getSpreadMethod();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSpreadMethod <em>Spread Method</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSpreadMethod <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpreadMethod()
	 * @see #getSpreadMethod()
	 * @see #setSpreadMethod(SpreadMethodType)
	 * @generated
	 */
	void unsetSpreadMethod();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getSpreadMethod <em>Spread Method</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Stemh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stemh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stemh</em>' attribute.
	 * @see #setStemh(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Stemh()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='stemh' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStemh();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStemh <em>Stemh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stemh</em>' attribute.
	 * @see #getStemh()
	 * @generated
	 */
	void setStemh(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Stemv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stemv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stemv</em>' attribute.
	 * @see #setStemv(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Stemv()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='stemv' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStemv();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStemv <em>Stemv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stemv</em>' attribute.
	 * @see #getStemv()
	 * @generated
	 */
	void setStemv(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Strikethrough Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strikethrough Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strikethrough Position</em>' attribute.
	 * @see #setStrikethroughPosition(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_StrikethroughPosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='strikethrough-position' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStrikethroughPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrikethroughPosition <em>Strikethrough Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strikethrough Position</em>' attribute.
	 * @see #getStrikethroughPosition()
	 * @generated
	 */
	void setStrikethroughPosition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Strikethrough Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strikethrough Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strikethrough Thickness</em>' attribute.
	 * @see #setStrikethroughThickness(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_StrikethroughThickness()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='strikethrough-thickness' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStrikethroughThickness();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrikethroughThickness <em>Strikethrough Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strikethrough Thickness</em>' attribute.
	 * @see #getStrikethroughThickness()
	 * @generated
	 */
	void setStrikethroughThickness(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Stroke Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Color</em>' attribute.
	 * @see #setStrokeColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_StrokeColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='stroke-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStrokeColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeColor <em>Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Color</em>' attribute.
	 * @see #getStrokeColor()
	 * @generated
	 */
	void setStrokeColor(String value);

	/**
	 * Returns the value of the '<em><b>Stroke Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #setStrokeOpacity(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_StrokeOpacity()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.StrokeOpacityType"
	 *        extendedMetaData="kind='attribute' name='stroke-opacity' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getStrokeOpacity();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeOpacity <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Opacity</em>' attribute.
	 * @see #getStrokeOpacity()
	 * @generated
	 */
	void setStrokeOpacity(Object value);

	/**
	 * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Width</em>' attribute.
	 * @see #setStrokeWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_StrokeWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='stroke-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStrokeWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Underline Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underline Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline Position</em>' attribute.
	 * @see #setUnderlinePosition(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_UnderlinePosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='underline-position' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUnderlinePosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnderlinePosition <em>Underline Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline Position</em>' attribute.
	 * @see #getUnderlinePosition()
	 * @generated
	 */
	void setUnderlinePosition(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Underline Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underline Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline Thickness</em>' attribute.
	 * @see #setUnderlineThickness(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_UnderlineThickness()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='underline-thickness' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUnderlineThickness();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnderlineThickness <em>Underline Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline Thickness</em>' attribute.
	 * @see #getUnderlineThickness()
	 * @generated
	 */
	void setUnderlineThickness(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Unicode Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unicode Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unicode Range</em>' attribute.
	 * @see #setUnicodeRange(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_UnicodeRange()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='unicode-range' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getUnicodeRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnicodeRange <em>Unicode Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unicode Range</em>' attribute.
	 * @see #getUnicodeRange()
	 * @generated
	 */
	void setUnicodeRange(Object value);

	/**
	 * Returns the value of the '<em><b>Units Per Em</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units Per Em</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units Per Em</em>' attribute.
	 * @see #setUnitsPerEm(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_UnitsPerEm()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='units-per-em' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getUnitsPerEm();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getUnitsPerEm <em>Units Per Em</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Per Em</em>' attribute.
	 * @see #getUnitsPerEm()
	 * @generated
	 */
	void setUnitsPerEm(BigInteger value);

	/**
	 * Returns the value of the '<em><b>VAlphabetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAlphabetic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAlphabetic</em>' attribute.
	 * @see #setVAlphabetic(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_VAlphabetic()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='v-alphabetic' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVAlphabetic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVAlphabetic <em>VAlphabetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAlphabetic</em>' attribute.
	 * @see #getVAlphabetic()
	 * @generated
	 */
	void setVAlphabetic(BigInteger value);

	/**
	 * Returns the value of the '<em><b>VHanging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VHanging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VHanging</em>' attribute.
	 * @see #setVHanging(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_VHanging()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='v-hanging' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVHanging();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVHanging <em>VHanging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VHanging</em>' attribute.
	 * @see #getVHanging()
	 * @generated
	 */
	void setVHanging(BigInteger value);

	/**
	 * Returns the value of the '<em><b>VIdeographic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VIdeographic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VIdeographic</em>' attribute.
	 * @see #setVIdeographic(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_VIdeographic()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='v-ideographic' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVIdeographic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVIdeographic <em>VIdeographic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VIdeographic</em>' attribute.
	 * @see #getVIdeographic()
	 * @generated
	 */
	void setVIdeographic(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_ViewBox()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.svg.ViewBoxType" many="false"
	 *        extendedMetaData="kind='attribute' name='viewBox' namespace='##targetNamespace'"
	 * @generated
	 */
	List getViewBox();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getViewBox <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Box</em>' attribute.
	 * @see #getViewBox()
	 * @generated
	 */
	void setViewBox(List value);

	/**
	 * Returns the value of the '<em><b>VMathematical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VMathematical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VMathematical</em>' attribute.
	 * @see #setVMathematical(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_VMathematical()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='v-mathematical' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVMathematical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getVMathematical <em>VMathematical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMathematical</em>' attribute.
	 * @see #getVMathematical()
	 * @generated
	 */
	void setVMathematical(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Widths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widths</em>' attribute.
	 * @see #setWidths(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Widths()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='widths' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getWidths();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getWidths <em>Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widths</em>' attribute.
	 * @see #getWidths()
	 * @generated
	 */
	void setWidths(Object value);

	/**
	 * Returns the value of the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X1</em>' attribute.
	 * @see #setX1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_X1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='x1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getX1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getX1 <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X1</em>' attribute.
	 * @see #getX1()
	 * @generated
	 */
	void setX1(String value);

	/**
	 * Returns the value of the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X2</em>' attribute.
	 * @see #setX2(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_X2()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='x2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getX2();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getX2 <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X2</em>' attribute.
	 * @see #getX2()
	 * @generated
	 */
	void setX2(String value);

	/**
	 * Returns the value of the '<em><b>XHeight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XHeight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XHeight</em>' attribute.
	 * @see #setXHeight(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_XHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='x-height' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getXHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getXHeight <em>XHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XHeight</em>' attribute.
	 * @see #getXHeight()
	 * @generated
	 */
	void setXHeight(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y1</em>' attribute.
	 * @see #setY1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Y1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='y1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getY1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getY1 <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y1</em>' attribute.
	 * @see #getY1()
	 * @generated
	 */
	void setY1(String value);

	/**
	 * Returns the value of the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y2</em>' attribute.
	 * @see #setY2(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#getDocumentRoot_Y2()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Coordinate"
	 *        extendedMetaData="kind='attribute' name='y2' namespace='##targetNamespace'"
	 * @generated
	 */
	String getY2();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot#getY2 <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y2</em>' attribute.
	 * @see #getY2()
	 * @generated
	 */
	void setY2(String value);

} // DocumentRoot
