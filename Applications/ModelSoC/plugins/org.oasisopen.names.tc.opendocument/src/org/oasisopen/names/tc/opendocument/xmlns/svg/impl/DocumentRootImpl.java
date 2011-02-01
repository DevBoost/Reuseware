/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg.impl;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.StopType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;
import org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontVariant;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getDefinitionSrc <em>Definition Src</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontFaceFormat <em>Font Face Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontFaceName <em>Font Face Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontFaceSrc <em>Font Face Src</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontFaceUri <em>Font Face Uri</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getLinearGradient <em>Linear Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getRadialGradient <em>Radial Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getAccentHeight <em>Accent Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getAlphabetic <em>Alphabetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getAscent <em>Ascent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getBbox <em>Bbox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getCapHeight <em>Cap Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getD <em>D</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getDescent <em>Descent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFillRule <em>Fill Rule</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontStretch <em>Font Stretch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getGradientTransform <em>Gradient Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getGradientUnits <em>Gradient Units</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getHanging <em>Hanging</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getIdeographic <em>Ideographic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getMathematical <em>Mathematical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getOverlinePosition <em>Overline Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getOverlineThickness <em>Overline Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getPanose1 <em>Panose1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getR <em>R</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getRy <em>Ry</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getSlope <em>Slope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getSpreadMethod <em>Spread Method</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getStemh <em>Stemh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getStemv <em>Stemv</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getStrikethroughPosition <em>Strikethrough Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getStrikethroughThickness <em>Strikethrough Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getStrokeOpacity <em>Stroke Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getUnderlinePosition <em>Underline Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getUnderlineThickness <em>Underline Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getUnicodeRange <em>Unicode Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getUnitsPerEm <em>Units Per Em</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getVAlphabetic <em>VAlphabetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getVHanging <em>VHanging</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getVIdeographic <em>VIdeographic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getViewBox <em>View Box</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getVMathematical <em>VMathematical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getWidths <em>Widths</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getXHeight <em>XHeight</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.DocumentRootImpl#getY2 <em>Y2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAccentHeight() <em>Accent Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccentHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ACCENT_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccentHeight() <em>Accent Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccentHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger accentHeight = ACCENT_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlphabetic() <em>Alphabetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabetic()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ALPHABETIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlphabetic() <em>Alphabetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabetic()
	 * @generated
	 * @ordered
	 */
	protected BigInteger alphabetic = ALPHABETIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAscent() <em>Ascent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscent()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ASCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAscent() <em>Ascent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscent()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ascent = ASCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBbox() <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbox()
	 * @generated
	 * @ordered
	 */
	protected static final Object BBOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBbox() <em>Bbox</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBbox()
	 * @generated
	 * @ordered
	 */
	protected Object bbox = BBOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapHeight() <em>Cap Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CAP_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapHeight() <em>Cap Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger capHeight = CAP_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected static final String CX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCx()
	 * @generated
	 * @ordered
	 */
	protected String cx = CX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected static final String CY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCy()
	 * @generated
	 * @ordered
	 */
	protected String cy = CY_EDEFAULT;

	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final String D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected String d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescent() <em>Descent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescent()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DESCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescent() <em>Descent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescent()
	 * @generated
	 * @ordered
	 */
	protected BigInteger descent = DESCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFillRule() <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillRule()
	 * @generated
	 * @ordered
	 */
	protected static final FillRuleType FILL_RULE_EDEFAULT = FillRuleType.NONZERO;

	/**
	 * The cached value of the '{@link #getFillRule() <em>Fill Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillRule()
	 * @generated
	 * @ordered
	 */
	protected FillRuleType fillRule = FILL_RULE_EDEFAULT;

	/**
	 * This is true if the Fill Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillRuleESet;

	/**
	 * The default value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected String fontFamily = FONT_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected String fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontStretch() <em>Font Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStretch()
	 * @generated
	 * @ordered
	 */
	protected static final FontStretchType FONT_STRETCH_EDEFAULT = FontStretchType.NORMAL;

	/**
	 * The cached value of the '{@link #getFontStretch() <em>Font Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStretch()
	 * @generated
	 * @ordered
	 */
	protected FontStretchType fontStretch = FONT_STRETCH_EDEFAULT;

	/**
	 * This is true if the Font Stretch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontStretchESet;

	/**
	 * The default value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final FontStyle FONT_STYLE_EDEFAULT = FontStyle.NORMAL;

	/**
	 * The cached value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected FontStyle fontStyle = FONT_STYLE_EDEFAULT;

	/**
	 * This is true if the Font Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontStyleESet;

	/**
	 * The default value of the '{@link #getFontVariant() <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontVariant()
	 * @generated
	 * @ordered
	 */
	protected static final FontVariant FONT_VARIANT_EDEFAULT = FontVariant.NORMAL;

	/**
	 * The cached value of the '{@link #getFontVariant() <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontVariant()
	 * @generated
	 * @ordered
	 */
	protected FontVariant fontVariant = FONT_VARIANT_EDEFAULT;

	/**
	 * This is true if the Font Variant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontVariantESet;

	/**
	 * The default value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected static final FontWeight FONT_WEIGHT_EDEFAULT = FontWeight.NORMAL;

	/**
	 * The cached value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected FontWeight fontWeight = FONT_WEIGHT_EDEFAULT;

	/**
	 * This is true if the Font Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontWeightESet;

	/**
	 * The default value of the '{@link #getGradientTransform() <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADIENT_TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradientTransform() <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTransform()
	 * @generated
	 * @ordered
	 */
	protected String gradientTransform = GRADIENT_TRANSFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientUnits() <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnits()
	 * @generated
	 * @ordered
	 */
	protected static final GradientUnitsType GRADIENT_UNITS_EDEFAULT = GradientUnitsType.OBJECT_BOUNDING_BOX;

	/**
	 * The cached value of the '{@link #getGradientUnits() <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnits()
	 * @generated
	 * @ordered
	 */
	protected GradientUnitsType gradientUnits = GRADIENT_UNITS_EDEFAULT;

	/**
	 * This is true if the Gradient Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gradientUnitsESet;

	/**
	 * The default value of the '{@link #getHanging() <em>Hanging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHanging()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HANGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHanging() <em>Hanging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHanging()
	 * @generated
	 * @ordered
	 */
	protected BigInteger hanging = HANGING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdeographic() <em>Ideographic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdeographic()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IDEOGRAPHIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdeographic() <em>Ideographic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdeographic()
	 * @generated
	 * @ordered
	 */
	protected BigInteger ideographic = IDEOGRAPHIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMathematical() <em>Mathematical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathematical()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MATHEMATICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMathematical() <em>Mathematical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathematical()
	 * @generated
	 * @ordered
	 */
	protected BigInteger mathematical = MATHEMATICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected String origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverlinePosition() <em>Overline Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlinePosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OVERLINE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverlinePosition() <em>Overline Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlinePosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger overlinePosition = OVERLINE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverlineThickness() <em>Overline Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlineThickness()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OVERLINE_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverlineThickness() <em>Overline Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlineThickness()
	 * @generated
	 * @ordered
	 */
	protected BigInteger overlineThickness = OVERLINE_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanose1() <em>Panose1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanose1()
	 * @generated
	 * @ordered
	 */
	protected static final Object PANOSE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanose1() <em>Panose1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanose1()
	 * @generated
	 * @ordered
	 */
	protected Object panose1 = PANOSE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final String R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected String r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx() <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx()
	 * @generated
	 * @ordered
	 */
	protected static final String RX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRx() <em>Rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx()
	 * @generated
	 * @ordered
	 */
	protected String rx = RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRy() <em>Ry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRy()
	 * @generated
	 * @ordered
	 */
	protected static final String RY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRy() <em>Ry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRy()
	 * @generated
	 * @ordered
	 */
	protected String ry = RY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SLOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected BigInteger slope = SLOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected static final SpreadMethodType SPREAD_METHOD_EDEFAULT = SpreadMethodType.PAD;

	/**
	 * The cached value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected SpreadMethodType spreadMethod = SPREAD_METHOD_EDEFAULT;

	/**
	 * This is true if the Spread Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spreadMethodESet;

	/**
	 * The default value of the '{@link #getStemh() <em>Stemh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStemh()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STEMH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStemh() <em>Stemh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStemh()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stemh = STEMH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStemv() <em>Stemv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStemv()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STEMV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStemv() <em>Stemv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStemv()
	 * @generated
	 * @ordered
	 */
	protected BigInteger stemv = STEMV_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrikethroughPosition() <em>Strikethrough Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrikethroughPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STRIKETHROUGH_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrikethroughPosition() <em>Strikethrough Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrikethroughPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger strikethroughPosition = STRIKETHROUGH_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrikethroughThickness() <em>Strikethrough Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrikethroughThickness()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STRIKETHROUGH_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrikethroughThickness() <em>Strikethrough Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrikethroughThickness()
	 * @generated
	 * @ordered
	 */
	protected BigInteger strikethroughThickness = STRIKETHROUGH_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeColor() <em>Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrokeColor() <em>Stroke Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeColor()
	 * @generated
	 * @ordered
	 */
	protected String strokeColor = STROKE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final Object STROKE_OPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrokeOpacity() <em>Stroke Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeOpacity()
	 * @generated
	 * @ordered
	 */
	protected Object strokeOpacity = STROKE_OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected String strokeWidth = STROKE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.TRANSLATE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getUnderlinePosition() <em>Underline Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlinePosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UNDERLINE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnderlinePosition() <em>Underline Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlinePosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger underlinePosition = UNDERLINE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnderlineThickness() <em>Underline Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlineThickness()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UNDERLINE_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnderlineThickness() <em>Underline Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlineThickness()
	 * @generated
	 * @ordered
	 */
	protected BigInteger underlineThickness = UNDERLINE_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnicodeRange() <em>Unicode Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnicodeRange()
	 * @generated
	 * @ordered
	 */
	protected static final Object UNICODE_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnicodeRange() <em>Unicode Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnicodeRange()
	 * @generated
	 * @ordered
	 */
	protected Object unicodeRange = UNICODE_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsPerEm() <em>Units Per Em</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsPerEm()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger UNITS_PER_EM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsPerEm() <em>Units Per Em</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsPerEm()
	 * @generated
	 * @ordered
	 */
	protected BigInteger unitsPerEm = UNITS_PER_EM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVAlphabetic() <em>VAlphabetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAlphabetic()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALPHABETIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVAlphabetic() <em>VAlphabetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAlphabetic()
	 * @generated
	 * @ordered
	 */
	protected BigInteger vAlphabetic = VALPHABETIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getVHanging() <em>VHanging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVHanging()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VHANGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVHanging() <em>VHanging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVHanging()
	 * @generated
	 * @ordered
	 */
	protected BigInteger vHanging = VHANGING_EDEFAULT;

	/**
	 * The default value of the '{@link #getVIdeographic() <em>VIdeographic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVIdeographic()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VIDEOGRAPHIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVIdeographic() <em>VIdeographic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVIdeographic()
	 * @generated
	 * @ordered
	 */
	protected BigInteger vIdeographic = VIDEOGRAPHIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewBox() <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBox()
	 * @generated
	 * @ordered
	 */
	protected static final List VIEW_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewBox() <em>View Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBox()
	 * @generated
	 * @ordered
	 */
	protected List viewBox = VIEW_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getVMathematical() <em>VMathematical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMathematical()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VMATHEMATICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVMathematical() <em>VMathematical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMathematical()
	 * @generated
	 * @ordered
	 */
	protected BigInteger vMathematical = VMATHEMATICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidths() <em>Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidths()
	 * @generated
	 * @ordered
	 */
	protected static final Object WIDTHS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidths() <em>Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidths()
	 * @generated
	 * @ordered
	 */
	protected Object widths = WIDTHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final String X1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected String x1 = X1_EDEFAULT;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final String X2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected String x2 = X2_EDEFAULT;

	/**
	 * The default value of the '{@link #getXHeight() <em>XHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger XHEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXHeight() <em>XHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXHeight()
	 * @generated
	 * @ordered
	 */
	protected BigInteger xHeight = XHEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final String Y1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected String y1 = Y1_EDEFAULT;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final String Y2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected String y2 = Y2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SvgPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionSrcType getDefinitionSrc() {
		return (DefinitionSrcType)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__DEFINITION_SRC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionSrc(DefinitionSrcType newDefinitionSrc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SvgPackage.Literals.DOCUMENT_ROOT__DEFINITION_SRC, newDefinitionSrc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionSrc(DefinitionSrcType newDefinitionSrc) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__DEFINITION_SRC, newDefinitionSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesc() {
		return (String)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__DESC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(String newDesc) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__DESC, newDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceFormatType getFontFaceFormat() {
		return (FontFaceFormatType)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontFaceFormat(FontFaceFormatType newFontFaceFormat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_FORMAT, newFontFaceFormat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFaceFormat(FontFaceFormatType newFontFaceFormat) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_FORMAT, newFontFaceFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceNameType getFontFaceName() {
		return (FontFaceNameType)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontFaceName(FontFaceNameType newFontFaceName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_NAME, newFontFaceName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFaceName(FontFaceNameType newFontFaceName) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_NAME, newFontFaceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceSrcType getFontFaceSrc() {
		return (FontFaceSrcType)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_SRC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontFaceSrc(FontFaceSrcType newFontFaceSrc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_SRC, newFontFaceSrc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFaceSrc(FontFaceSrcType newFontFaceSrc) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_SRC, newFontFaceSrc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceUriType getFontFaceUri() {
		return (FontFaceUriType)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontFaceUri(FontFaceUriType newFontFaceUri, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_URI, newFontFaceUri, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFaceUri(FontFaceUriType newFontFaceUri) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__FONT_FACE_URI, newFontFaceUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearGradientType getLinearGradient() {
		return (LinearGradientType)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__LINEAR_GRADIENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearGradient(LinearGradientType newLinearGradient, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SvgPackage.Literals.DOCUMENT_ROOT__LINEAR_GRADIENT, newLinearGradient, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearGradient(LinearGradientType newLinearGradient) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__LINEAR_GRADIENT, newLinearGradient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadialGradientType getRadialGradient() {
		return (RadialGradientType)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__RADIAL_GRADIENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadialGradient(RadialGradientType newRadialGradient, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SvgPackage.Literals.DOCUMENT_ROOT__RADIAL_GRADIENT, newRadialGradient, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadialGradient(RadialGradientType newRadialGradient) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__RADIAL_GRADIENT, newRadialGradient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopType getStop() {
		return (StopType)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__STOP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStop(StopType newStop, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SvgPackage.Literals.DOCUMENT_ROOT__STOP, newStop, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(StopType newStop) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__STOP, newStop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)getMixed().get(SvgPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		((FeatureMap.Internal)getMixed()).set(SvgPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAccentHeight() {
		return accentHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccentHeight(BigInteger newAccentHeight) {
		BigInteger oldAccentHeight = accentHeight;
		accentHeight = newAccentHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__ACCENT_HEIGHT, oldAccentHeight, accentHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAlphabetic() {
		return alphabetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabetic(BigInteger newAlphabetic) {
		BigInteger oldAlphabetic = alphabetic;
		alphabetic = newAlphabetic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__ALPHABETIC, oldAlphabetic, alphabetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAscent() {
		return ascent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAscent(BigInteger newAscent) {
		BigInteger oldAscent = ascent;
		ascent = newAscent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__ASCENT, oldAscent, ascent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBbox() {
		return bbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBbox(Object newBbox) {
		Object oldBbox = bbox;
		bbox = newBbox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__BBOX, oldBbox, bbox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCapHeight() {
		return capHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapHeight(BigInteger newCapHeight) {
		BigInteger oldCapHeight = capHeight;
		capHeight = newCapHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__CAP_HEIGHT, oldCapHeight, capHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCx() {
		return cx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCx(String newCx) {
		String oldCx = cx;
		cx = newCx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__CX, oldCx, cx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCy() {
		return cy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCy(String newCy) {
		String oldCy = cy;
		cy = newCy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__CY, oldCy, cy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(String newD) {
		String oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDescent() {
		return descent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescent(BigInteger newDescent) {
		BigInteger oldDescent = descent;
		descent = newDescent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__DESCENT, oldDescent, descent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleType getFillRule() {
		return fillRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillRule(FillRuleType newFillRule) {
		FillRuleType oldFillRule = fillRule;
		fillRule = newFillRule == null ? FILL_RULE_EDEFAULT : newFillRule;
		boolean oldFillRuleESet = fillRuleESet;
		fillRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__FILL_RULE, oldFillRule, fillRule, !oldFillRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillRule() {
		FillRuleType oldFillRule = fillRule;
		boolean oldFillRuleESet = fillRuleESet;
		fillRule = FILL_RULE_EDEFAULT;
		fillRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.DOCUMENT_ROOT__FILL_RULE, oldFillRule, FILL_RULE_EDEFAULT, oldFillRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillRule() {
		return fillRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFamily() {
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamily(String newFontFamily) {
		String oldFontFamily = fontFamily;
		fontFamily = newFontFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__FONT_FAMILY, oldFontFamily, fontFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(String newFontSize) {
		String oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStretchType getFontStretch() {
		return fontStretch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStretch(FontStretchType newFontStretch) {
		FontStretchType oldFontStretch = fontStretch;
		fontStretch = newFontStretch == null ? FONT_STRETCH_EDEFAULT : newFontStretch;
		boolean oldFontStretchESet = fontStretchESet;
		fontStretchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__FONT_STRETCH, oldFontStretch, fontStretch, !oldFontStretchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStretch() {
		FontStretchType oldFontStretch = fontStretch;
		boolean oldFontStretchESet = fontStretchESet;
		fontStretch = FONT_STRETCH_EDEFAULT;
		fontStretchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.DOCUMENT_ROOT__FONT_STRETCH, oldFontStretch, FONT_STRETCH_EDEFAULT, oldFontStretchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStretch() {
		return fontStretchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle getFontStyle() {
		return fontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(FontStyle newFontStyle) {
		FontStyle oldFontStyle = fontStyle;
		fontStyle = newFontStyle == null ? FONT_STYLE_EDEFAULT : newFontStyle;
		boolean oldFontStyleESet = fontStyleESet;
		fontStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__FONT_STYLE, oldFontStyle, fontStyle, !oldFontStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStyle() {
		FontStyle oldFontStyle = fontStyle;
		boolean oldFontStyleESet = fontStyleESet;
		fontStyle = FONT_STYLE_EDEFAULT;
		fontStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.DOCUMENT_ROOT__FONT_STYLE, oldFontStyle, FONT_STYLE_EDEFAULT, oldFontStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStyle() {
		return fontStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontVariant getFontVariant() {
		return fontVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontVariant(FontVariant newFontVariant) {
		FontVariant oldFontVariant = fontVariant;
		fontVariant = newFontVariant == null ? FONT_VARIANT_EDEFAULT : newFontVariant;
		boolean oldFontVariantESet = fontVariantESet;
		fontVariantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__FONT_VARIANT, oldFontVariant, fontVariant, !oldFontVariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontVariant() {
		FontVariant oldFontVariant = fontVariant;
		boolean oldFontVariantESet = fontVariantESet;
		fontVariant = FONT_VARIANT_EDEFAULT;
		fontVariantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.DOCUMENT_ROOT__FONT_VARIANT, oldFontVariant, FONT_VARIANT_EDEFAULT, oldFontVariantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontVariant() {
		return fontVariantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeight getFontWeight() {
		return fontWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(FontWeight newFontWeight) {
		FontWeight oldFontWeight = fontWeight;
		fontWeight = newFontWeight == null ? FONT_WEIGHT_EDEFAULT : newFontWeight;
		boolean oldFontWeightESet = fontWeightESet;
		fontWeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__FONT_WEIGHT, oldFontWeight, fontWeight, !oldFontWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontWeight() {
		FontWeight oldFontWeight = fontWeight;
		boolean oldFontWeightESet = fontWeightESet;
		fontWeight = FONT_WEIGHT_EDEFAULT;
		fontWeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.DOCUMENT_ROOT__FONT_WEIGHT, oldFontWeight, FONT_WEIGHT_EDEFAULT, oldFontWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontWeight() {
		return fontWeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGradientTransform() {
		return gradientTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientTransform(String newGradientTransform) {
		String oldGradientTransform = gradientTransform;
		gradientTransform = newGradientTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__GRADIENT_TRANSFORM, oldGradientTransform, gradientTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientUnitsType getGradientUnits() {
		return gradientUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientUnits(GradientUnitsType newGradientUnits) {
		GradientUnitsType oldGradientUnits = gradientUnits;
		gradientUnits = newGradientUnits == null ? GRADIENT_UNITS_EDEFAULT : newGradientUnits;
		boolean oldGradientUnitsESet = gradientUnitsESet;
		gradientUnitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__GRADIENT_UNITS, oldGradientUnits, gradientUnits, !oldGradientUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGradientUnits() {
		GradientUnitsType oldGradientUnits = gradientUnits;
		boolean oldGradientUnitsESet = gradientUnitsESet;
		gradientUnits = GRADIENT_UNITS_EDEFAULT;
		gradientUnitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.DOCUMENT_ROOT__GRADIENT_UNITS, oldGradientUnits, GRADIENT_UNITS_EDEFAULT, oldGradientUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGradientUnits() {
		return gradientUnitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHanging() {
		return hanging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHanging(BigInteger newHanging) {
		BigInteger oldHanging = hanging;
		hanging = newHanging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__HANGING, oldHanging, hanging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIdeographic() {
		return ideographic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdeographic(BigInteger newIdeographic) {
		BigInteger oldIdeographic = ideographic;
		ideographic = newIdeographic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__IDEOGRAPHIC, oldIdeographic, ideographic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMathematical() {
		return mathematical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMathematical(BigInteger newMathematical) {
		BigInteger oldMathematical = mathematical;
		mathematical = newMathematical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__MATHEMATICAL, oldMathematical, mathematical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(String newOrigin) {
		String oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOverlinePosition() {
		return overlinePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlinePosition(BigInteger newOverlinePosition) {
		BigInteger oldOverlinePosition = overlinePosition;
		overlinePosition = newOverlinePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__OVERLINE_POSITION, oldOverlinePosition, overlinePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOverlineThickness() {
		return overlineThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlineThickness(BigInteger newOverlineThickness) {
		BigInteger oldOverlineThickness = overlineThickness;
		overlineThickness = newOverlineThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__OVERLINE_THICKNESS, oldOverlineThickness, overlineThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPanose1() {
		return panose1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanose1(Object newPanose1) {
		Object oldPanose1 = panose1;
		panose1 = newPanose1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__PANOSE1, oldPanose1, panose1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(String newR) {
		String oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRx() {
		return rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx(String newRx) {
		String oldRx = rx;
		rx = newRx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__RX, oldRx, rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRy() {
		return ry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRy(String newRy) {
		String oldRy = ry;
		ry = newRy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__RY, oldRy, ry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSlope() {
		return slope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlope(BigInteger newSlope) {
		BigInteger oldSlope = slope;
		slope = newSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__SLOPE, oldSlope, slope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadMethodType getSpreadMethod() {
		return spreadMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadMethod(SpreadMethodType newSpreadMethod) {
		SpreadMethodType oldSpreadMethod = spreadMethod;
		spreadMethod = newSpreadMethod == null ? SPREAD_METHOD_EDEFAULT : newSpreadMethod;
		boolean oldSpreadMethodESet = spreadMethodESet;
		spreadMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__SPREAD_METHOD, oldSpreadMethod, spreadMethod, !oldSpreadMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpreadMethod() {
		SpreadMethodType oldSpreadMethod = spreadMethod;
		boolean oldSpreadMethodESet = spreadMethodESet;
		spreadMethod = SPREAD_METHOD_EDEFAULT;
		spreadMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.DOCUMENT_ROOT__SPREAD_METHOD, oldSpreadMethod, SPREAD_METHOD_EDEFAULT, oldSpreadMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpreadMethod() {
		return spreadMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStemh() {
		return stemh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStemh(BigInteger newStemh) {
		BigInteger oldStemh = stemh;
		stemh = newStemh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__STEMH, oldStemh, stemh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStemv() {
		return stemv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStemv(BigInteger newStemv) {
		BigInteger oldStemv = stemv;
		stemv = newStemv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__STEMV, oldStemv, stemv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStrikethroughPosition() {
		return strikethroughPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrikethroughPosition(BigInteger newStrikethroughPosition) {
		BigInteger oldStrikethroughPosition = strikethroughPosition;
		strikethroughPosition = newStrikethroughPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_POSITION, oldStrikethroughPosition, strikethroughPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStrikethroughThickness() {
		return strikethroughThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrikethroughThickness(BigInteger newStrikethroughThickness) {
		BigInteger oldStrikethroughThickness = strikethroughThickness;
		strikethroughThickness = newStrikethroughThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_THICKNESS, oldStrikethroughThickness, strikethroughThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeColor() {
		return strokeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeColor(String newStrokeColor) {
		String oldStrokeColor = strokeColor;
		strokeColor = newStrokeColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__STROKE_COLOR, oldStrokeColor, strokeColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStrokeOpacity() {
		return strokeOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeOpacity(Object newStrokeOpacity) {
		Object oldStrokeOpacity = strokeOpacity;
		strokeOpacity = newStrokeOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__STROKE_OPACITY, oldStrokeOpacity, strokeOpacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeWidth(String newStrokeWidth) {
		String oldStrokeWidth = strokeWidth;
		strokeWidth = newStrokeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__STROKE_WIDTH, oldStrokeWidth, strokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.DOCUMENT_ROOT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUnderlinePosition() {
		return underlinePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderlinePosition(BigInteger newUnderlinePosition) {
		BigInteger oldUnderlinePosition = underlinePosition;
		underlinePosition = newUnderlinePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__UNDERLINE_POSITION, oldUnderlinePosition, underlinePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUnderlineThickness() {
		return underlineThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderlineThickness(BigInteger newUnderlineThickness) {
		BigInteger oldUnderlineThickness = underlineThickness;
		underlineThickness = newUnderlineThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__UNDERLINE_THICKNESS, oldUnderlineThickness, underlineThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUnicodeRange() {
		return unicodeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnicodeRange(Object newUnicodeRange) {
		Object oldUnicodeRange = unicodeRange;
		unicodeRange = newUnicodeRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__UNICODE_RANGE, oldUnicodeRange, unicodeRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUnitsPerEm() {
		return unitsPerEm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitsPerEm(BigInteger newUnitsPerEm) {
		BigInteger oldUnitsPerEm = unitsPerEm;
		unitsPerEm = newUnitsPerEm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__UNITS_PER_EM, oldUnitsPerEm, unitsPerEm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVAlphabetic() {
		return vAlphabetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAlphabetic(BigInteger newVAlphabetic) {
		BigInteger oldVAlphabetic = vAlphabetic;
		vAlphabetic = newVAlphabetic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__VALPHABETIC, oldVAlphabetic, vAlphabetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVHanging() {
		return vHanging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVHanging(BigInteger newVHanging) {
		BigInteger oldVHanging = vHanging;
		vHanging = newVHanging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__VHANGING, oldVHanging, vHanging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVIdeographic() {
		return vIdeographic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVIdeographic(BigInteger newVIdeographic) {
		BigInteger oldVIdeographic = vIdeographic;
		vIdeographic = newVIdeographic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__VIDEOGRAPHIC, oldVIdeographic, vIdeographic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getViewBox() {
		return viewBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewBox(List newViewBox) {
		List oldViewBox = viewBox;
		viewBox = newViewBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__VIEW_BOX, oldViewBox, viewBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getVMathematical() {
		return vMathematical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVMathematical(BigInteger newVMathematical) {
		BigInteger oldVMathematical = vMathematical;
		vMathematical = newVMathematical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__VMATHEMATICAL, oldVMathematical, vMathematical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWidths() {
		return widths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidths(Object newWidths) {
		Object oldWidths = widths;
		widths = newWidths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__WIDTHS, oldWidths, widths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(String newX1) {
		String oldX1 = x1;
		x1 = newX1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__X1, oldX1, x1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(String newX2) {
		String oldX2 = x2;
		x2 = newX2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__X2, oldX2, x2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getXHeight() {
		return xHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXHeight(BigInteger newXHeight) {
		BigInteger oldXHeight = xHeight;
		xHeight = newXHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__XHEIGHT, oldXHeight, xHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(String newY1) {
		String oldY1 = y1;
		y1 = newY1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__Y1, oldY1, y1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY2() {
		return y2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2(String newY2) {
		String oldY2 = y2;
		y2 = newY2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.DOCUMENT_ROOT__Y2, oldY2, y2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SvgPackage.DOCUMENT_ROOT__DEFINITION_SRC:
				return basicSetDefinitionSrc(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_FORMAT:
				return basicSetFontFaceFormat(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_NAME:
				return basicSetFontFaceName(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_SRC:
				return basicSetFontFaceSrc(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_URI:
				return basicSetFontFaceUri(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				return basicSetLinearGradient(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__RADIAL_GRADIENT:
				return basicSetRadialGradient(null, msgs);
			case SvgPackage.DOCUMENT_ROOT__STOP:
				return basicSetStop(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SvgPackage.DOCUMENT_ROOT__DEFINITION_SRC:
				return getDefinitionSrc();
			case SvgPackage.DOCUMENT_ROOT__DESC:
				return getDesc();
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_FORMAT:
				return getFontFaceFormat();
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_NAME:
				return getFontFaceName();
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_SRC:
				return getFontFaceSrc();
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_URI:
				return getFontFaceUri();
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				return getLinearGradient();
			case SvgPackage.DOCUMENT_ROOT__RADIAL_GRADIENT:
				return getRadialGradient();
			case SvgPackage.DOCUMENT_ROOT__STOP:
				return getStop();
			case SvgPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case SvgPackage.DOCUMENT_ROOT__ACCENT_HEIGHT:
				return getAccentHeight();
			case SvgPackage.DOCUMENT_ROOT__ALPHABETIC:
				return getAlphabetic();
			case SvgPackage.DOCUMENT_ROOT__ASCENT:
				return getAscent();
			case SvgPackage.DOCUMENT_ROOT__BBOX:
				return getBbox();
			case SvgPackage.DOCUMENT_ROOT__CAP_HEIGHT:
				return getCapHeight();
			case SvgPackage.DOCUMENT_ROOT__CX:
				return getCx();
			case SvgPackage.DOCUMENT_ROOT__CY:
				return getCy();
			case SvgPackage.DOCUMENT_ROOT__D:
				return getD();
			case SvgPackage.DOCUMENT_ROOT__DESCENT:
				return getDescent();
			case SvgPackage.DOCUMENT_ROOT__FILL_RULE:
				return getFillRule();
			case SvgPackage.DOCUMENT_ROOT__FONT_FAMILY:
				return getFontFamily();
			case SvgPackage.DOCUMENT_ROOT__FONT_SIZE:
				return getFontSize();
			case SvgPackage.DOCUMENT_ROOT__FONT_STRETCH:
				return getFontStretch();
			case SvgPackage.DOCUMENT_ROOT__FONT_STYLE:
				return getFontStyle();
			case SvgPackage.DOCUMENT_ROOT__FONT_VARIANT:
				return getFontVariant();
			case SvgPackage.DOCUMENT_ROOT__FONT_WEIGHT:
				return getFontWeight();
			case SvgPackage.DOCUMENT_ROOT__GRADIENT_TRANSFORM:
				return getGradientTransform();
			case SvgPackage.DOCUMENT_ROOT__GRADIENT_UNITS:
				return getGradientUnits();
			case SvgPackage.DOCUMENT_ROOT__HANGING:
				return getHanging();
			case SvgPackage.DOCUMENT_ROOT__IDEOGRAPHIC:
				return getIdeographic();
			case SvgPackage.DOCUMENT_ROOT__MATHEMATICAL:
				return getMathematical();
			case SvgPackage.DOCUMENT_ROOT__ORIGIN:
				return getOrigin();
			case SvgPackage.DOCUMENT_ROOT__OVERLINE_POSITION:
				return getOverlinePosition();
			case SvgPackage.DOCUMENT_ROOT__OVERLINE_THICKNESS:
				return getOverlineThickness();
			case SvgPackage.DOCUMENT_ROOT__PANOSE1:
				return getPanose1();
			case SvgPackage.DOCUMENT_ROOT__PATH:
				return getPath();
			case SvgPackage.DOCUMENT_ROOT__R:
				return getR();
			case SvgPackage.DOCUMENT_ROOT__RX:
				return getRx();
			case SvgPackage.DOCUMENT_ROOT__RY:
				return getRy();
			case SvgPackage.DOCUMENT_ROOT__SLOPE:
				return getSlope();
			case SvgPackage.DOCUMENT_ROOT__SPREAD_METHOD:
				return getSpreadMethod();
			case SvgPackage.DOCUMENT_ROOT__STEMH:
				return getStemh();
			case SvgPackage.DOCUMENT_ROOT__STEMV:
				return getStemv();
			case SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_POSITION:
				return getStrikethroughPosition();
			case SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_THICKNESS:
				return getStrikethroughThickness();
			case SvgPackage.DOCUMENT_ROOT__STROKE_COLOR:
				return getStrokeColor();
			case SvgPackage.DOCUMENT_ROOT__STROKE_OPACITY:
				return getStrokeOpacity();
			case SvgPackage.DOCUMENT_ROOT__STROKE_WIDTH:
				return getStrokeWidth();
			case SvgPackage.DOCUMENT_ROOT__TYPE:
				return getType();
			case SvgPackage.DOCUMENT_ROOT__UNDERLINE_POSITION:
				return getUnderlinePosition();
			case SvgPackage.DOCUMENT_ROOT__UNDERLINE_THICKNESS:
				return getUnderlineThickness();
			case SvgPackage.DOCUMENT_ROOT__UNICODE_RANGE:
				return getUnicodeRange();
			case SvgPackage.DOCUMENT_ROOT__UNITS_PER_EM:
				return getUnitsPerEm();
			case SvgPackage.DOCUMENT_ROOT__VALPHABETIC:
				return getVAlphabetic();
			case SvgPackage.DOCUMENT_ROOT__VHANGING:
				return getVHanging();
			case SvgPackage.DOCUMENT_ROOT__VIDEOGRAPHIC:
				return getVIdeographic();
			case SvgPackage.DOCUMENT_ROOT__VIEW_BOX:
				return getViewBox();
			case SvgPackage.DOCUMENT_ROOT__VMATHEMATICAL:
				return getVMathematical();
			case SvgPackage.DOCUMENT_ROOT__WIDTHS:
				return getWidths();
			case SvgPackage.DOCUMENT_ROOT__X1:
				return getX1();
			case SvgPackage.DOCUMENT_ROOT__X2:
				return getX2();
			case SvgPackage.DOCUMENT_ROOT__XHEIGHT:
				return getXHeight();
			case SvgPackage.DOCUMENT_ROOT__Y1:
				return getY1();
			case SvgPackage.DOCUMENT_ROOT__Y2:
				return getY2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__DEFINITION_SRC:
				setDefinitionSrc((DefinitionSrcType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__DESC:
				setDesc((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_FORMAT:
				setFontFaceFormat((FontFaceFormatType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_NAME:
				setFontFaceName((FontFaceNameType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_SRC:
				setFontFaceSrc((FontFaceSrcType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_URI:
				setFontFaceUri((FontFaceUriType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				setLinearGradient((LinearGradientType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__RADIAL_GRADIENT:
				setRadialGradient((RadialGradientType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STOP:
				setStop((StopType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__TITLE:
				setTitle((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__ACCENT_HEIGHT:
				setAccentHeight((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__ALPHABETIC:
				setAlphabetic((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__ASCENT:
				setAscent((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__BBOX:
				setBbox(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__CAP_HEIGHT:
				setCapHeight((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__CX:
				setCx((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__CY:
				setCy((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__D:
				setD((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__DESCENT:
				setDescent((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FILL_RULE:
				setFillRule((FillRuleType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_STRETCH:
				setFontStretch((FontStretchType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_VARIANT:
				setFontVariant((FontVariant)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_WEIGHT:
				setFontWeight((FontWeight)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__GRADIENT_TRANSFORM:
				setGradientTransform((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__GRADIENT_UNITS:
				setGradientUnits((GradientUnitsType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__HANGING:
				setHanging((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__IDEOGRAPHIC:
				setIdeographic((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__MATHEMATICAL:
				setMathematical((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__ORIGIN:
				setOrigin((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__OVERLINE_POSITION:
				setOverlinePosition((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__OVERLINE_THICKNESS:
				setOverlineThickness((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__PANOSE1:
				setPanose1(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__PATH:
				setPath((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__R:
				setR((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__RX:
				setRx((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__RY:
				setRy((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__SLOPE:
				setSlope((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__SPREAD_METHOD:
				setSpreadMethod((SpreadMethodType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STEMH:
				setStemh((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STEMV:
				setStemv((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_POSITION:
				setStrikethroughPosition((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_THICKNESS:
				setStrikethroughThickness((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STROKE_COLOR:
				setStrokeColor((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STROKE_OPACITY:
				setStrokeOpacity(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__STROKE_WIDTH:
				setStrokeWidth((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__TYPE:
				setType((TypeType)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__UNDERLINE_POSITION:
				setUnderlinePosition((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__UNDERLINE_THICKNESS:
				setUnderlineThickness((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__UNICODE_RANGE:
				setUnicodeRange(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__UNITS_PER_EM:
				setUnitsPerEm((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__VALPHABETIC:
				setVAlphabetic((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__VHANGING:
				setVHanging((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__VIDEOGRAPHIC:
				setVIdeographic((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__VIEW_BOX:
				setViewBox((List)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__VMATHEMATICAL:
				setVMathematical((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__WIDTHS:
				setWidths(newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__X1:
				setX1((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__X2:
				setX2((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__XHEIGHT:
				setXHeight((BigInteger)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__Y1:
				setY1((String)newValue);
				return;
			case SvgPackage.DOCUMENT_ROOT__Y2:
				setY2((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SvgPackage.DOCUMENT_ROOT__DEFINITION_SRC:
				setDefinitionSrc((DefinitionSrcType)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_FORMAT:
				setFontFaceFormat((FontFaceFormatType)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_NAME:
				setFontFaceName((FontFaceNameType)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_SRC:
				setFontFaceSrc((FontFaceSrcType)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_URI:
				setFontFaceUri((FontFaceUriType)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				setLinearGradient((LinearGradientType)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__RADIAL_GRADIENT:
				setRadialGradient((RadialGradientType)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__STOP:
				setStop((StopType)null);
				return;
			case SvgPackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__ACCENT_HEIGHT:
				setAccentHeight(ACCENT_HEIGHT_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__ALPHABETIC:
				setAlphabetic(ALPHABETIC_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__ASCENT:
				setAscent(ASCENT_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__BBOX:
				setBbox(BBOX_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__CAP_HEIGHT:
				setCapHeight(CAP_HEIGHT_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__CX:
				setCx(CX_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__CY:
				setCy(CY_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__D:
				setD(D_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__DESCENT:
				setDescent(DESCENT_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__FILL_RULE:
				unsetFillRule();
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_STRETCH:
				unsetFontStretch();
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_STYLE:
				unsetFontStyle();
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_VARIANT:
				unsetFontVariant();
				return;
			case SvgPackage.DOCUMENT_ROOT__FONT_WEIGHT:
				unsetFontWeight();
				return;
			case SvgPackage.DOCUMENT_ROOT__GRADIENT_TRANSFORM:
				setGradientTransform(GRADIENT_TRANSFORM_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__GRADIENT_UNITS:
				unsetGradientUnits();
				return;
			case SvgPackage.DOCUMENT_ROOT__HANGING:
				setHanging(HANGING_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__IDEOGRAPHIC:
				setIdeographic(IDEOGRAPHIC_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__MATHEMATICAL:
				setMathematical(MATHEMATICAL_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__OVERLINE_POSITION:
				setOverlinePosition(OVERLINE_POSITION_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__OVERLINE_THICKNESS:
				setOverlineThickness(OVERLINE_THICKNESS_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__PANOSE1:
				setPanose1(PANOSE1_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__R:
				setR(R_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__RX:
				setRx(RX_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__RY:
				setRy(RY_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__SLOPE:
				setSlope(SLOPE_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__SPREAD_METHOD:
				unsetSpreadMethod();
				return;
			case SvgPackage.DOCUMENT_ROOT__STEMH:
				setStemh(STEMH_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__STEMV:
				setStemv(STEMV_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_POSITION:
				setStrikethroughPosition(STRIKETHROUGH_POSITION_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_THICKNESS:
				setStrikethroughThickness(STRIKETHROUGH_THICKNESS_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__STROKE_COLOR:
				setStrokeColor(STROKE_COLOR_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__STROKE_OPACITY:
				setStrokeOpacity(STROKE_OPACITY_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__STROKE_WIDTH:
				setStrokeWidth(STROKE_WIDTH_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__TYPE:
				unsetType();
				return;
			case SvgPackage.DOCUMENT_ROOT__UNDERLINE_POSITION:
				setUnderlinePosition(UNDERLINE_POSITION_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__UNDERLINE_THICKNESS:
				setUnderlineThickness(UNDERLINE_THICKNESS_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__UNICODE_RANGE:
				setUnicodeRange(UNICODE_RANGE_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__UNITS_PER_EM:
				setUnitsPerEm(UNITS_PER_EM_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__VALPHABETIC:
				setVAlphabetic(VALPHABETIC_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__VHANGING:
				setVHanging(VHANGING_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__VIDEOGRAPHIC:
				setVIdeographic(VIDEOGRAPHIC_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__VIEW_BOX:
				setViewBox(VIEW_BOX_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__VMATHEMATICAL:
				setVMathematical(VMATHEMATICAL_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__WIDTHS:
				setWidths(WIDTHS_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__X1:
				setX1(X1_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__X2:
				setX2(X2_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__XHEIGHT:
				setXHeight(XHEIGHT_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__Y1:
				setY1(Y1_EDEFAULT);
				return;
			case SvgPackage.DOCUMENT_ROOT__Y2:
				setY2(Y2_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SvgPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SvgPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SvgPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SvgPackage.DOCUMENT_ROOT__DEFINITION_SRC:
				return getDefinitionSrc() != null;
			case SvgPackage.DOCUMENT_ROOT__DESC:
				return DESC_EDEFAULT == null ? getDesc() != null : !DESC_EDEFAULT.equals(getDesc());
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_FORMAT:
				return getFontFaceFormat() != null;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_NAME:
				return getFontFaceName() != null;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_SRC:
				return getFontFaceSrc() != null;
			case SvgPackage.DOCUMENT_ROOT__FONT_FACE_URI:
				return getFontFaceUri() != null;
			case SvgPackage.DOCUMENT_ROOT__LINEAR_GRADIENT:
				return getLinearGradient() != null;
			case SvgPackage.DOCUMENT_ROOT__RADIAL_GRADIENT:
				return getRadialGradient() != null;
			case SvgPackage.DOCUMENT_ROOT__STOP:
				return getStop() != null;
			case SvgPackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case SvgPackage.DOCUMENT_ROOT__ACCENT_HEIGHT:
				return ACCENT_HEIGHT_EDEFAULT == null ? accentHeight != null : !ACCENT_HEIGHT_EDEFAULT.equals(accentHeight);
			case SvgPackage.DOCUMENT_ROOT__ALPHABETIC:
				return ALPHABETIC_EDEFAULT == null ? alphabetic != null : !ALPHABETIC_EDEFAULT.equals(alphabetic);
			case SvgPackage.DOCUMENT_ROOT__ASCENT:
				return ASCENT_EDEFAULT == null ? ascent != null : !ASCENT_EDEFAULT.equals(ascent);
			case SvgPackage.DOCUMENT_ROOT__BBOX:
				return BBOX_EDEFAULT == null ? bbox != null : !BBOX_EDEFAULT.equals(bbox);
			case SvgPackage.DOCUMENT_ROOT__CAP_HEIGHT:
				return CAP_HEIGHT_EDEFAULT == null ? capHeight != null : !CAP_HEIGHT_EDEFAULT.equals(capHeight);
			case SvgPackage.DOCUMENT_ROOT__CX:
				return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
			case SvgPackage.DOCUMENT_ROOT__CY:
				return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
			case SvgPackage.DOCUMENT_ROOT__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case SvgPackage.DOCUMENT_ROOT__DESCENT:
				return DESCENT_EDEFAULT == null ? descent != null : !DESCENT_EDEFAULT.equals(descent);
			case SvgPackage.DOCUMENT_ROOT__FILL_RULE:
				return isSetFillRule();
			case SvgPackage.DOCUMENT_ROOT__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? fontFamily != null : !FONT_FAMILY_EDEFAULT.equals(fontFamily);
			case SvgPackage.DOCUMENT_ROOT__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
			case SvgPackage.DOCUMENT_ROOT__FONT_STRETCH:
				return isSetFontStretch();
			case SvgPackage.DOCUMENT_ROOT__FONT_STYLE:
				return isSetFontStyle();
			case SvgPackage.DOCUMENT_ROOT__FONT_VARIANT:
				return isSetFontVariant();
			case SvgPackage.DOCUMENT_ROOT__FONT_WEIGHT:
				return isSetFontWeight();
			case SvgPackage.DOCUMENT_ROOT__GRADIENT_TRANSFORM:
				return GRADIENT_TRANSFORM_EDEFAULT == null ? gradientTransform != null : !GRADIENT_TRANSFORM_EDEFAULT.equals(gradientTransform);
			case SvgPackage.DOCUMENT_ROOT__GRADIENT_UNITS:
				return isSetGradientUnits();
			case SvgPackage.DOCUMENT_ROOT__HANGING:
				return HANGING_EDEFAULT == null ? hanging != null : !HANGING_EDEFAULT.equals(hanging);
			case SvgPackage.DOCUMENT_ROOT__IDEOGRAPHIC:
				return IDEOGRAPHIC_EDEFAULT == null ? ideographic != null : !IDEOGRAPHIC_EDEFAULT.equals(ideographic);
			case SvgPackage.DOCUMENT_ROOT__MATHEMATICAL:
				return MATHEMATICAL_EDEFAULT == null ? mathematical != null : !MATHEMATICAL_EDEFAULT.equals(mathematical);
			case SvgPackage.DOCUMENT_ROOT__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case SvgPackage.DOCUMENT_ROOT__OVERLINE_POSITION:
				return OVERLINE_POSITION_EDEFAULT == null ? overlinePosition != null : !OVERLINE_POSITION_EDEFAULT.equals(overlinePosition);
			case SvgPackage.DOCUMENT_ROOT__OVERLINE_THICKNESS:
				return OVERLINE_THICKNESS_EDEFAULT == null ? overlineThickness != null : !OVERLINE_THICKNESS_EDEFAULT.equals(overlineThickness);
			case SvgPackage.DOCUMENT_ROOT__PANOSE1:
				return PANOSE1_EDEFAULT == null ? panose1 != null : !PANOSE1_EDEFAULT.equals(panose1);
			case SvgPackage.DOCUMENT_ROOT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case SvgPackage.DOCUMENT_ROOT__R:
				return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
			case SvgPackage.DOCUMENT_ROOT__RX:
				return RX_EDEFAULT == null ? rx != null : !RX_EDEFAULT.equals(rx);
			case SvgPackage.DOCUMENT_ROOT__RY:
				return RY_EDEFAULT == null ? ry != null : !RY_EDEFAULT.equals(ry);
			case SvgPackage.DOCUMENT_ROOT__SLOPE:
				return SLOPE_EDEFAULT == null ? slope != null : !SLOPE_EDEFAULT.equals(slope);
			case SvgPackage.DOCUMENT_ROOT__SPREAD_METHOD:
				return isSetSpreadMethod();
			case SvgPackage.DOCUMENT_ROOT__STEMH:
				return STEMH_EDEFAULT == null ? stemh != null : !STEMH_EDEFAULT.equals(stemh);
			case SvgPackage.DOCUMENT_ROOT__STEMV:
				return STEMV_EDEFAULT == null ? stemv != null : !STEMV_EDEFAULT.equals(stemv);
			case SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_POSITION:
				return STRIKETHROUGH_POSITION_EDEFAULT == null ? strikethroughPosition != null : !STRIKETHROUGH_POSITION_EDEFAULT.equals(strikethroughPosition);
			case SvgPackage.DOCUMENT_ROOT__STRIKETHROUGH_THICKNESS:
				return STRIKETHROUGH_THICKNESS_EDEFAULT == null ? strikethroughThickness != null : !STRIKETHROUGH_THICKNESS_EDEFAULT.equals(strikethroughThickness);
			case SvgPackage.DOCUMENT_ROOT__STROKE_COLOR:
				return STROKE_COLOR_EDEFAULT == null ? strokeColor != null : !STROKE_COLOR_EDEFAULT.equals(strokeColor);
			case SvgPackage.DOCUMENT_ROOT__STROKE_OPACITY:
				return STROKE_OPACITY_EDEFAULT == null ? strokeOpacity != null : !STROKE_OPACITY_EDEFAULT.equals(strokeOpacity);
			case SvgPackage.DOCUMENT_ROOT__STROKE_WIDTH:
				return STROKE_WIDTH_EDEFAULT == null ? strokeWidth != null : !STROKE_WIDTH_EDEFAULT.equals(strokeWidth);
			case SvgPackage.DOCUMENT_ROOT__TYPE:
				return isSetType();
			case SvgPackage.DOCUMENT_ROOT__UNDERLINE_POSITION:
				return UNDERLINE_POSITION_EDEFAULT == null ? underlinePosition != null : !UNDERLINE_POSITION_EDEFAULT.equals(underlinePosition);
			case SvgPackage.DOCUMENT_ROOT__UNDERLINE_THICKNESS:
				return UNDERLINE_THICKNESS_EDEFAULT == null ? underlineThickness != null : !UNDERLINE_THICKNESS_EDEFAULT.equals(underlineThickness);
			case SvgPackage.DOCUMENT_ROOT__UNICODE_RANGE:
				return UNICODE_RANGE_EDEFAULT == null ? unicodeRange != null : !UNICODE_RANGE_EDEFAULT.equals(unicodeRange);
			case SvgPackage.DOCUMENT_ROOT__UNITS_PER_EM:
				return UNITS_PER_EM_EDEFAULT == null ? unitsPerEm != null : !UNITS_PER_EM_EDEFAULT.equals(unitsPerEm);
			case SvgPackage.DOCUMENT_ROOT__VALPHABETIC:
				return VALPHABETIC_EDEFAULT == null ? vAlphabetic != null : !VALPHABETIC_EDEFAULT.equals(vAlphabetic);
			case SvgPackage.DOCUMENT_ROOT__VHANGING:
				return VHANGING_EDEFAULT == null ? vHanging != null : !VHANGING_EDEFAULT.equals(vHanging);
			case SvgPackage.DOCUMENT_ROOT__VIDEOGRAPHIC:
				return VIDEOGRAPHIC_EDEFAULT == null ? vIdeographic != null : !VIDEOGRAPHIC_EDEFAULT.equals(vIdeographic);
			case SvgPackage.DOCUMENT_ROOT__VIEW_BOX:
				return VIEW_BOX_EDEFAULT == null ? viewBox != null : !VIEW_BOX_EDEFAULT.equals(viewBox);
			case SvgPackage.DOCUMENT_ROOT__VMATHEMATICAL:
				return VMATHEMATICAL_EDEFAULT == null ? vMathematical != null : !VMATHEMATICAL_EDEFAULT.equals(vMathematical);
			case SvgPackage.DOCUMENT_ROOT__WIDTHS:
				return WIDTHS_EDEFAULT == null ? widths != null : !WIDTHS_EDEFAULT.equals(widths);
			case SvgPackage.DOCUMENT_ROOT__X1:
				return X1_EDEFAULT == null ? x1 != null : !X1_EDEFAULT.equals(x1);
			case SvgPackage.DOCUMENT_ROOT__X2:
				return X2_EDEFAULT == null ? x2 != null : !X2_EDEFAULT.equals(x2);
			case SvgPackage.DOCUMENT_ROOT__XHEIGHT:
				return XHEIGHT_EDEFAULT == null ? xHeight != null : !XHEIGHT_EDEFAULT.equals(xHeight);
			case SvgPackage.DOCUMENT_ROOT__Y1:
				return Y1_EDEFAULT == null ? y1 != null : !Y1_EDEFAULT.equals(y1);
			case SvgPackage.DOCUMENT_ROOT__Y2:
				return Y2_EDEFAULT == null ? y2 != null : !Y2_EDEFAULT.equals(y2);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", accentHeight: ");
		result.append(accentHeight);
		result.append(", alphabetic: ");
		result.append(alphabetic);
		result.append(", ascent: ");
		result.append(ascent);
		result.append(", bbox: ");
		result.append(bbox);
		result.append(", capHeight: ");
		result.append(capHeight);
		result.append(", cx: ");
		result.append(cx);
		result.append(", cy: ");
		result.append(cy);
		result.append(", d: ");
		result.append(d);
		result.append(", descent: ");
		result.append(descent);
		result.append(", fillRule: ");
		if (fillRuleESet) result.append(fillRule); else result.append("<unset>");
		result.append(", fontFamily: ");
		result.append(fontFamily);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", fontStretch: ");
		if (fontStretchESet) result.append(fontStretch); else result.append("<unset>");
		result.append(", fontStyle: ");
		if (fontStyleESet) result.append(fontStyle); else result.append("<unset>");
		result.append(", fontVariant: ");
		if (fontVariantESet) result.append(fontVariant); else result.append("<unset>");
		result.append(", fontWeight: ");
		if (fontWeightESet) result.append(fontWeight); else result.append("<unset>");
		result.append(", gradientTransform: ");
		result.append(gradientTransform);
		result.append(", gradientUnits: ");
		if (gradientUnitsESet) result.append(gradientUnits); else result.append("<unset>");
		result.append(", hanging: ");
		result.append(hanging);
		result.append(", ideographic: ");
		result.append(ideographic);
		result.append(", mathematical: ");
		result.append(mathematical);
		result.append(", origin: ");
		result.append(origin);
		result.append(", overlinePosition: ");
		result.append(overlinePosition);
		result.append(", overlineThickness: ");
		result.append(overlineThickness);
		result.append(", panose1: ");
		result.append(panose1);
		result.append(", path: ");
		result.append(path);
		result.append(", r: ");
		result.append(r);
		result.append(", rx: ");
		result.append(rx);
		result.append(", ry: ");
		result.append(ry);
		result.append(", slope: ");
		result.append(slope);
		result.append(", spreadMethod: ");
		if (spreadMethodESet) result.append(spreadMethod); else result.append("<unset>");
		result.append(", stemh: ");
		result.append(stemh);
		result.append(", stemv: ");
		result.append(stemv);
		result.append(", strikethroughPosition: ");
		result.append(strikethroughPosition);
		result.append(", strikethroughThickness: ");
		result.append(strikethroughThickness);
		result.append(", strokeColor: ");
		result.append(strokeColor);
		result.append(", strokeOpacity: ");
		result.append(strokeOpacity);
		result.append(", strokeWidth: ");
		result.append(strokeWidth);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", underlinePosition: ");
		result.append(underlinePosition);
		result.append(", underlineThickness: ");
		result.append(underlineThickness);
		result.append(", unicodeRange: ");
		result.append(unicodeRange);
		result.append(", unitsPerEm: ");
		result.append(unitsPerEm);
		result.append(", vAlphabetic: ");
		result.append(vAlphabetic);
		result.append(", vHanging: ");
		result.append(vHanging);
		result.append(", vIdeographic: ");
		result.append(vIdeographic);
		result.append(", viewBox: ");
		result.append(viewBox);
		result.append(", vMathematical: ");
		result.append(vMathematical);
		result.append(", widths: ");
		result.append(widths);
		result.append(", x1: ");
		result.append(x1);
		result.append(", x2: ");
		result.append(x2);
		result.append(", xHeight: ");
		result.append(xHeight);
		result.append(", y1: ");
		result.append(y1);
		result.append(", y2: ");
		result.append(y2);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
