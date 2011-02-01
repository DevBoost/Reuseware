/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontStyle;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontVariant;
import org.oasisopen.names.tc.opendocument.xmlns.text.FontWeight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Face Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontFaceSrc <em>Font Face Src</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getDefinitionSrc <em>Definition Src</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getAccentHeight <em>Accent Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getAlphabetic <em>Alphabetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getAscent <em>Ascent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getBbox <em>Bbox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getCapHeight <em>Cap Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getDescent <em>Descent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontAdornments <em>Font Adornments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontCharset <em>Font Charset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontFamilyGeneric <em>Font Family Generic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontPitch <em>Font Pitch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontStretch <em>Font Stretch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getHanging <em>Hanging</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getIdeographic <em>Ideographic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getMathematical <em>Mathematical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getOverlinePosition <em>Overline Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getOverlineThickness <em>Overline Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getPanose1 <em>Panose1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getSlope <em>Slope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getStemh <em>Stemh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getStemv <em>Stemv</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getStrikethroughPosition <em>Strikethrough Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getStrikethroughThickness <em>Strikethrough Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getUnderlinePosition <em>Underline Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getUnderlineThickness <em>Underline Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getUnicodeRange <em>Unicode Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getUnitsPerEm <em>Units Per Em</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getVAlphabetic <em>VAlphabetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getVHanging <em>VHanging</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getVIdeographic <em>VIdeographic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getVMathematical <em>VMathematical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getWidths <em>Widths</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.impl.FontFaceTypeImpl#getXHeight <em>XHeight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontFaceTypeImpl extends EObjectImpl implements FontFaceType {
	/**
	 * The cached value of the '{@link #getFontFaceSrc() <em>Font Face Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFaceSrc()
	 * @generated
	 * @ordered
	 */
	protected FontFaceSrcType fontFaceSrc;

	/**
	 * The cached value of the '{@link #getDefinitionSrc() <em>Definition Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionSrc()
	 * @generated
	 * @ordered
	 */
	protected DefinitionSrcType definitionSrc;

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
	 * The default value of the '{@link #getFontAdornments() <em>Font Adornments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontAdornments()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_ADORNMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontAdornments() <em>Font Adornments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontAdornments()
	 * @generated
	 * @ordered
	 */
	protected String fontAdornments = FONT_ADORNMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontCharset() <em>Font Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_CHARSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontCharset() <em>Font Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontCharset()
	 * @generated
	 * @ordered
	 */
	protected String fontCharset = FONT_CHARSET_EDEFAULT;

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
	 * The default value of the '{@link #getFontFamilyGeneric() <em>Font Family Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyGeneric()
	 * @generated
	 * @ordered
	 */
	protected static final FontFamilyGeneric FONT_FAMILY_GENERIC_EDEFAULT = FontFamilyGeneric.ROMAN;

	/**
	 * The cached value of the '{@link #getFontFamilyGeneric() <em>Font Family Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamilyGeneric()
	 * @generated
	 * @ordered
	 */
	protected FontFamilyGeneric fontFamilyGeneric = FONT_FAMILY_GENERIC_EDEFAULT;

	/**
	 * This is true if the Font Family Generic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontFamilyGenericESet;

	/**
	 * The default value of the '{@link #getFontPitch() <em>Font Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontPitch()
	 * @generated
	 * @ordered
	 */
	protected static final FontPitch FONT_PITCH_EDEFAULT = FontPitch.FIXED;

	/**
	 * The cached value of the '{@link #getFontPitch() <em>Font Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontPitch()
	 * @generated
	 * @ordered
	 */
	protected FontPitch fontPitch = FONT_PITCH_EDEFAULT;

	/**
	 * This is true if the Font Pitch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fontPitchESet;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontFaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.eINSTANCE.getFontFaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceSrcType getFontFaceSrc() {
		return fontFaceSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFontFaceSrc(FontFaceSrcType newFontFaceSrc, NotificationChain msgs) {
		FontFaceSrcType oldFontFaceSrc = fontFaceSrc;
		fontFaceSrc = newFontFaceSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_FACE_SRC, oldFontFaceSrc, newFontFaceSrc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFaceSrc(FontFaceSrcType newFontFaceSrc) {
		if (newFontFaceSrc != fontFaceSrc) {
			NotificationChain msgs = null;
			if (fontFaceSrc != null)
				msgs = ((InternalEObject)fontFaceSrc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.FONT_FACE_TYPE__FONT_FACE_SRC, null, msgs);
			if (newFontFaceSrc != null)
				msgs = ((InternalEObject)newFontFaceSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.FONT_FACE_TYPE__FONT_FACE_SRC, null, msgs);
			msgs = basicSetFontFaceSrc(newFontFaceSrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_FACE_SRC, newFontFaceSrc, newFontFaceSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionSrcType getDefinitionSrc() {
		return definitionSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionSrc(DefinitionSrcType newDefinitionSrc, NotificationChain msgs) {
		DefinitionSrcType oldDefinitionSrc = definitionSrc;
		definitionSrc = newDefinitionSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__DEFINITION_SRC, oldDefinitionSrc, newDefinitionSrc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionSrc(DefinitionSrcType newDefinitionSrc) {
		if (newDefinitionSrc != definitionSrc) {
			NotificationChain msgs = null;
			if (definitionSrc != null)
				msgs = ((InternalEObject)definitionSrc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylePackage.FONT_FACE_TYPE__DEFINITION_SRC, null, msgs);
			if (newDefinitionSrc != null)
				msgs = ((InternalEObject)newDefinitionSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylePackage.FONT_FACE_TYPE__DEFINITION_SRC, null, msgs);
			msgs = basicSetDefinitionSrc(newDefinitionSrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__DEFINITION_SRC, newDefinitionSrc, newDefinitionSrc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__ACCENT_HEIGHT, oldAccentHeight, accentHeight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__ALPHABETIC, oldAlphabetic, alphabetic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__ASCENT, oldAscent, ascent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__BBOX, oldBbox, bbox));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__CAP_HEIGHT, oldCapHeight, capHeight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__DESCENT, oldDescent, descent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontAdornments() {
		return fontAdornments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontAdornments(String newFontAdornments) {
		String oldFontAdornments = fontAdornments;
		fontAdornments = newFontAdornments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_ADORNMENTS, oldFontAdornments, fontAdornments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontCharset() {
		return fontCharset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontCharset(String newFontCharset) {
		String oldFontCharset = fontCharset;
		fontCharset = newFontCharset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_CHARSET, oldFontCharset, fontCharset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_FAMILY, oldFontFamily, fontFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyGeneric getFontFamilyGeneric() {
		return fontFamilyGeneric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamilyGeneric(FontFamilyGeneric newFontFamilyGeneric) {
		FontFamilyGeneric oldFontFamilyGeneric = fontFamilyGeneric;
		fontFamilyGeneric = newFontFamilyGeneric == null ? FONT_FAMILY_GENERIC_EDEFAULT : newFontFamilyGeneric;
		boolean oldFontFamilyGenericESet = fontFamilyGenericESet;
		fontFamilyGenericESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_FAMILY_GENERIC, oldFontFamilyGeneric, fontFamilyGeneric, !oldFontFamilyGenericESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontFamilyGeneric() {
		FontFamilyGeneric oldFontFamilyGeneric = fontFamilyGeneric;
		boolean oldFontFamilyGenericESet = fontFamilyGenericESet;
		fontFamilyGeneric = FONT_FAMILY_GENERIC_EDEFAULT;
		fontFamilyGenericESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.FONT_FACE_TYPE__FONT_FAMILY_GENERIC, oldFontFamilyGeneric, FONT_FAMILY_GENERIC_EDEFAULT, oldFontFamilyGenericESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontFamilyGeneric() {
		return fontFamilyGenericESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontPitch getFontPitch() {
		return fontPitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontPitch(FontPitch newFontPitch) {
		FontPitch oldFontPitch = fontPitch;
		fontPitch = newFontPitch == null ? FONT_PITCH_EDEFAULT : newFontPitch;
		boolean oldFontPitchESet = fontPitchESet;
		fontPitchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_PITCH, oldFontPitch, fontPitch, !oldFontPitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontPitch() {
		FontPitch oldFontPitch = fontPitch;
		boolean oldFontPitchESet = fontPitchESet;
		fontPitch = FONT_PITCH_EDEFAULT;
		fontPitchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.FONT_FACE_TYPE__FONT_PITCH, oldFontPitch, FONT_PITCH_EDEFAULT, oldFontPitchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontPitch() {
		return fontPitchESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_SIZE, oldFontSize, fontSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_STRETCH, oldFontStretch, fontStretch, !oldFontStretchESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.FONT_FACE_TYPE__FONT_STRETCH, oldFontStretch, FONT_STRETCH_EDEFAULT, oldFontStretchESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_STYLE, oldFontStyle, fontStyle, !oldFontStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.FONT_FACE_TYPE__FONT_STYLE, oldFontStyle, FONT_STYLE_EDEFAULT, oldFontStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_VARIANT, oldFontVariant, fontVariant, !oldFontVariantESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.FONT_FACE_TYPE__FONT_VARIANT, oldFontVariant, FONT_VARIANT_EDEFAULT, oldFontVariantESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__FONT_WEIGHT, oldFontWeight, fontWeight, !oldFontWeightESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, StylePackage.FONT_FACE_TYPE__FONT_WEIGHT, oldFontWeight, FONT_WEIGHT_EDEFAULT, oldFontWeightESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__HANGING, oldHanging, hanging));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__IDEOGRAPHIC, oldIdeographic, ideographic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__MATHEMATICAL, oldMathematical, mathematical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__OVERLINE_POSITION, oldOverlinePosition, overlinePosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__OVERLINE_THICKNESS, oldOverlineThickness, overlineThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__PANOSE1, oldPanose1, panose1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__SLOPE, oldSlope, slope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__STEMH, oldStemh, stemh));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__STEMV, oldStemv, stemv));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_POSITION, oldStrikethroughPosition, strikethroughPosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_THICKNESS, oldStrikethroughThickness, strikethroughThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__UNDERLINE_POSITION, oldUnderlinePosition, underlinePosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__UNDERLINE_THICKNESS, oldUnderlineThickness, underlineThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__UNICODE_RANGE, oldUnicodeRange, unicodeRange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__UNITS_PER_EM, oldUnitsPerEm, unitsPerEm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__VALPHABETIC, oldVAlphabetic, vAlphabetic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__VHANGING, oldVHanging, vHanging));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__VIDEOGRAPHIC, oldVIdeographic, vIdeographic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__VMATHEMATICAL, oldVMathematical, vMathematical));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__WIDTHS, oldWidths, widths));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.FONT_FACE_TYPE__XHEIGHT, oldXHeight, xHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StylePackage.FONT_FACE_TYPE__FONT_FACE_SRC:
				return basicSetFontFaceSrc(null, msgs);
			case StylePackage.FONT_FACE_TYPE__DEFINITION_SRC:
				return basicSetDefinitionSrc(null, msgs);
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
			case StylePackage.FONT_FACE_TYPE__FONT_FACE_SRC:
				return getFontFaceSrc();
			case StylePackage.FONT_FACE_TYPE__DEFINITION_SRC:
				return getDefinitionSrc();
			case StylePackage.FONT_FACE_TYPE__ACCENT_HEIGHT:
				return getAccentHeight();
			case StylePackage.FONT_FACE_TYPE__ALPHABETIC:
				return getAlphabetic();
			case StylePackage.FONT_FACE_TYPE__ASCENT:
				return getAscent();
			case StylePackage.FONT_FACE_TYPE__BBOX:
				return getBbox();
			case StylePackage.FONT_FACE_TYPE__CAP_HEIGHT:
				return getCapHeight();
			case StylePackage.FONT_FACE_TYPE__DESCENT:
				return getDescent();
			case StylePackage.FONT_FACE_TYPE__FONT_ADORNMENTS:
				return getFontAdornments();
			case StylePackage.FONT_FACE_TYPE__FONT_CHARSET:
				return getFontCharset();
			case StylePackage.FONT_FACE_TYPE__FONT_FAMILY:
				return getFontFamily();
			case StylePackage.FONT_FACE_TYPE__FONT_FAMILY_GENERIC:
				return getFontFamilyGeneric();
			case StylePackage.FONT_FACE_TYPE__FONT_PITCH:
				return getFontPitch();
			case StylePackage.FONT_FACE_TYPE__FONT_SIZE:
				return getFontSize();
			case StylePackage.FONT_FACE_TYPE__FONT_STRETCH:
				return getFontStretch();
			case StylePackage.FONT_FACE_TYPE__FONT_STYLE:
				return getFontStyle();
			case StylePackage.FONT_FACE_TYPE__FONT_VARIANT:
				return getFontVariant();
			case StylePackage.FONT_FACE_TYPE__FONT_WEIGHT:
				return getFontWeight();
			case StylePackage.FONT_FACE_TYPE__HANGING:
				return getHanging();
			case StylePackage.FONT_FACE_TYPE__IDEOGRAPHIC:
				return getIdeographic();
			case StylePackage.FONT_FACE_TYPE__MATHEMATICAL:
				return getMathematical();
			case StylePackage.FONT_FACE_TYPE__NAME:
				return getName();
			case StylePackage.FONT_FACE_TYPE__OVERLINE_POSITION:
				return getOverlinePosition();
			case StylePackage.FONT_FACE_TYPE__OVERLINE_THICKNESS:
				return getOverlineThickness();
			case StylePackage.FONT_FACE_TYPE__PANOSE1:
				return getPanose1();
			case StylePackage.FONT_FACE_TYPE__SLOPE:
				return getSlope();
			case StylePackage.FONT_FACE_TYPE__STEMH:
				return getStemh();
			case StylePackage.FONT_FACE_TYPE__STEMV:
				return getStemv();
			case StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_POSITION:
				return getStrikethroughPosition();
			case StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_THICKNESS:
				return getStrikethroughThickness();
			case StylePackage.FONT_FACE_TYPE__UNDERLINE_POSITION:
				return getUnderlinePosition();
			case StylePackage.FONT_FACE_TYPE__UNDERLINE_THICKNESS:
				return getUnderlineThickness();
			case StylePackage.FONT_FACE_TYPE__UNICODE_RANGE:
				return getUnicodeRange();
			case StylePackage.FONT_FACE_TYPE__UNITS_PER_EM:
				return getUnitsPerEm();
			case StylePackage.FONT_FACE_TYPE__VALPHABETIC:
				return getVAlphabetic();
			case StylePackage.FONT_FACE_TYPE__VHANGING:
				return getVHanging();
			case StylePackage.FONT_FACE_TYPE__VIDEOGRAPHIC:
				return getVIdeographic();
			case StylePackage.FONT_FACE_TYPE__VMATHEMATICAL:
				return getVMathematical();
			case StylePackage.FONT_FACE_TYPE__WIDTHS:
				return getWidths();
			case StylePackage.FONT_FACE_TYPE__XHEIGHT:
				return getXHeight();
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
			case StylePackage.FONT_FACE_TYPE__FONT_FACE_SRC:
				setFontFaceSrc((FontFaceSrcType)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__DEFINITION_SRC:
				setDefinitionSrc((DefinitionSrcType)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__ACCENT_HEIGHT:
				setAccentHeight((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__ALPHABETIC:
				setAlphabetic((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__ASCENT:
				setAscent((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__BBOX:
				setBbox(newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__CAP_HEIGHT:
				setCapHeight((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__DESCENT:
				setDescent((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_ADORNMENTS:
				setFontAdornments((String)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_CHARSET:
				setFontCharset((String)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_FAMILY_GENERIC:
				setFontFamilyGeneric((FontFamilyGeneric)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_PITCH:
				setFontPitch((FontPitch)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_STRETCH:
				setFontStretch((FontStretchType)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_VARIANT:
				setFontVariant((FontVariant)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_WEIGHT:
				setFontWeight((FontWeight)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__HANGING:
				setHanging((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__IDEOGRAPHIC:
				setIdeographic((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__MATHEMATICAL:
				setMathematical((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__NAME:
				setName((String)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__OVERLINE_POSITION:
				setOverlinePosition((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__OVERLINE_THICKNESS:
				setOverlineThickness((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__PANOSE1:
				setPanose1(newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__SLOPE:
				setSlope((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__STEMH:
				setStemh((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__STEMV:
				setStemv((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_POSITION:
				setStrikethroughPosition((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_THICKNESS:
				setStrikethroughThickness((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__UNDERLINE_POSITION:
				setUnderlinePosition((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__UNDERLINE_THICKNESS:
				setUnderlineThickness((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__UNICODE_RANGE:
				setUnicodeRange(newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__UNITS_PER_EM:
				setUnitsPerEm((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__VALPHABETIC:
				setVAlphabetic((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__VHANGING:
				setVHanging((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__VIDEOGRAPHIC:
				setVIdeographic((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__VMATHEMATICAL:
				setVMathematical((BigInteger)newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__WIDTHS:
				setWidths(newValue);
				return;
			case StylePackage.FONT_FACE_TYPE__XHEIGHT:
				setXHeight((BigInteger)newValue);
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
			case StylePackage.FONT_FACE_TYPE__FONT_FACE_SRC:
				setFontFaceSrc((FontFaceSrcType)null);
				return;
			case StylePackage.FONT_FACE_TYPE__DEFINITION_SRC:
				setDefinitionSrc((DefinitionSrcType)null);
				return;
			case StylePackage.FONT_FACE_TYPE__ACCENT_HEIGHT:
				setAccentHeight(ACCENT_HEIGHT_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__ALPHABETIC:
				setAlphabetic(ALPHABETIC_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__ASCENT:
				setAscent(ASCENT_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__BBOX:
				setBbox(BBOX_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__CAP_HEIGHT:
				setCapHeight(CAP_HEIGHT_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__DESCENT:
				setDescent(DESCENT_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_ADORNMENTS:
				setFontAdornments(FONT_ADORNMENTS_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_CHARSET:
				setFontCharset(FONT_CHARSET_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_FAMILY_GENERIC:
				unsetFontFamilyGeneric();
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_PITCH:
				unsetFontPitch();
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_STRETCH:
				unsetFontStretch();
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_STYLE:
				unsetFontStyle();
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_VARIANT:
				unsetFontVariant();
				return;
			case StylePackage.FONT_FACE_TYPE__FONT_WEIGHT:
				unsetFontWeight();
				return;
			case StylePackage.FONT_FACE_TYPE__HANGING:
				setHanging(HANGING_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__IDEOGRAPHIC:
				setIdeographic(IDEOGRAPHIC_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__MATHEMATICAL:
				setMathematical(MATHEMATICAL_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__OVERLINE_POSITION:
				setOverlinePosition(OVERLINE_POSITION_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__OVERLINE_THICKNESS:
				setOverlineThickness(OVERLINE_THICKNESS_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__PANOSE1:
				setPanose1(PANOSE1_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__SLOPE:
				setSlope(SLOPE_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__STEMH:
				setStemh(STEMH_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__STEMV:
				setStemv(STEMV_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_POSITION:
				setStrikethroughPosition(STRIKETHROUGH_POSITION_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_THICKNESS:
				setStrikethroughThickness(STRIKETHROUGH_THICKNESS_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__UNDERLINE_POSITION:
				setUnderlinePosition(UNDERLINE_POSITION_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__UNDERLINE_THICKNESS:
				setUnderlineThickness(UNDERLINE_THICKNESS_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__UNICODE_RANGE:
				setUnicodeRange(UNICODE_RANGE_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__UNITS_PER_EM:
				setUnitsPerEm(UNITS_PER_EM_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__VALPHABETIC:
				setVAlphabetic(VALPHABETIC_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__VHANGING:
				setVHanging(VHANGING_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__VIDEOGRAPHIC:
				setVIdeographic(VIDEOGRAPHIC_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__VMATHEMATICAL:
				setVMathematical(VMATHEMATICAL_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__WIDTHS:
				setWidths(WIDTHS_EDEFAULT);
				return;
			case StylePackage.FONT_FACE_TYPE__XHEIGHT:
				setXHeight(XHEIGHT_EDEFAULT);
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
			case StylePackage.FONT_FACE_TYPE__FONT_FACE_SRC:
				return fontFaceSrc != null;
			case StylePackage.FONT_FACE_TYPE__DEFINITION_SRC:
				return definitionSrc != null;
			case StylePackage.FONT_FACE_TYPE__ACCENT_HEIGHT:
				return ACCENT_HEIGHT_EDEFAULT == null ? accentHeight != null : !ACCENT_HEIGHT_EDEFAULT.equals(accentHeight);
			case StylePackage.FONT_FACE_TYPE__ALPHABETIC:
				return ALPHABETIC_EDEFAULT == null ? alphabetic != null : !ALPHABETIC_EDEFAULT.equals(alphabetic);
			case StylePackage.FONT_FACE_TYPE__ASCENT:
				return ASCENT_EDEFAULT == null ? ascent != null : !ASCENT_EDEFAULT.equals(ascent);
			case StylePackage.FONT_FACE_TYPE__BBOX:
				return BBOX_EDEFAULT == null ? bbox != null : !BBOX_EDEFAULT.equals(bbox);
			case StylePackage.FONT_FACE_TYPE__CAP_HEIGHT:
				return CAP_HEIGHT_EDEFAULT == null ? capHeight != null : !CAP_HEIGHT_EDEFAULT.equals(capHeight);
			case StylePackage.FONT_FACE_TYPE__DESCENT:
				return DESCENT_EDEFAULT == null ? descent != null : !DESCENT_EDEFAULT.equals(descent);
			case StylePackage.FONT_FACE_TYPE__FONT_ADORNMENTS:
				return FONT_ADORNMENTS_EDEFAULT == null ? fontAdornments != null : !FONT_ADORNMENTS_EDEFAULT.equals(fontAdornments);
			case StylePackage.FONT_FACE_TYPE__FONT_CHARSET:
				return FONT_CHARSET_EDEFAULT == null ? fontCharset != null : !FONT_CHARSET_EDEFAULT.equals(fontCharset);
			case StylePackage.FONT_FACE_TYPE__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? fontFamily != null : !FONT_FAMILY_EDEFAULT.equals(fontFamily);
			case StylePackage.FONT_FACE_TYPE__FONT_FAMILY_GENERIC:
				return isSetFontFamilyGeneric();
			case StylePackage.FONT_FACE_TYPE__FONT_PITCH:
				return isSetFontPitch();
			case StylePackage.FONT_FACE_TYPE__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
			case StylePackage.FONT_FACE_TYPE__FONT_STRETCH:
				return isSetFontStretch();
			case StylePackage.FONT_FACE_TYPE__FONT_STYLE:
				return isSetFontStyle();
			case StylePackage.FONT_FACE_TYPE__FONT_VARIANT:
				return isSetFontVariant();
			case StylePackage.FONT_FACE_TYPE__FONT_WEIGHT:
				return isSetFontWeight();
			case StylePackage.FONT_FACE_TYPE__HANGING:
				return HANGING_EDEFAULT == null ? hanging != null : !HANGING_EDEFAULT.equals(hanging);
			case StylePackage.FONT_FACE_TYPE__IDEOGRAPHIC:
				return IDEOGRAPHIC_EDEFAULT == null ? ideographic != null : !IDEOGRAPHIC_EDEFAULT.equals(ideographic);
			case StylePackage.FONT_FACE_TYPE__MATHEMATICAL:
				return MATHEMATICAL_EDEFAULT == null ? mathematical != null : !MATHEMATICAL_EDEFAULT.equals(mathematical);
			case StylePackage.FONT_FACE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StylePackage.FONT_FACE_TYPE__OVERLINE_POSITION:
				return OVERLINE_POSITION_EDEFAULT == null ? overlinePosition != null : !OVERLINE_POSITION_EDEFAULT.equals(overlinePosition);
			case StylePackage.FONT_FACE_TYPE__OVERLINE_THICKNESS:
				return OVERLINE_THICKNESS_EDEFAULT == null ? overlineThickness != null : !OVERLINE_THICKNESS_EDEFAULT.equals(overlineThickness);
			case StylePackage.FONT_FACE_TYPE__PANOSE1:
				return PANOSE1_EDEFAULT == null ? panose1 != null : !PANOSE1_EDEFAULT.equals(panose1);
			case StylePackage.FONT_FACE_TYPE__SLOPE:
				return SLOPE_EDEFAULT == null ? slope != null : !SLOPE_EDEFAULT.equals(slope);
			case StylePackage.FONT_FACE_TYPE__STEMH:
				return STEMH_EDEFAULT == null ? stemh != null : !STEMH_EDEFAULT.equals(stemh);
			case StylePackage.FONT_FACE_TYPE__STEMV:
				return STEMV_EDEFAULT == null ? stemv != null : !STEMV_EDEFAULT.equals(stemv);
			case StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_POSITION:
				return STRIKETHROUGH_POSITION_EDEFAULT == null ? strikethroughPosition != null : !STRIKETHROUGH_POSITION_EDEFAULT.equals(strikethroughPosition);
			case StylePackage.FONT_FACE_TYPE__STRIKETHROUGH_THICKNESS:
				return STRIKETHROUGH_THICKNESS_EDEFAULT == null ? strikethroughThickness != null : !STRIKETHROUGH_THICKNESS_EDEFAULT.equals(strikethroughThickness);
			case StylePackage.FONT_FACE_TYPE__UNDERLINE_POSITION:
				return UNDERLINE_POSITION_EDEFAULT == null ? underlinePosition != null : !UNDERLINE_POSITION_EDEFAULT.equals(underlinePosition);
			case StylePackage.FONT_FACE_TYPE__UNDERLINE_THICKNESS:
				return UNDERLINE_THICKNESS_EDEFAULT == null ? underlineThickness != null : !UNDERLINE_THICKNESS_EDEFAULT.equals(underlineThickness);
			case StylePackage.FONT_FACE_TYPE__UNICODE_RANGE:
				return UNICODE_RANGE_EDEFAULT == null ? unicodeRange != null : !UNICODE_RANGE_EDEFAULT.equals(unicodeRange);
			case StylePackage.FONT_FACE_TYPE__UNITS_PER_EM:
				return UNITS_PER_EM_EDEFAULT == null ? unitsPerEm != null : !UNITS_PER_EM_EDEFAULT.equals(unitsPerEm);
			case StylePackage.FONT_FACE_TYPE__VALPHABETIC:
				return VALPHABETIC_EDEFAULT == null ? vAlphabetic != null : !VALPHABETIC_EDEFAULT.equals(vAlphabetic);
			case StylePackage.FONT_FACE_TYPE__VHANGING:
				return VHANGING_EDEFAULT == null ? vHanging != null : !VHANGING_EDEFAULT.equals(vHanging);
			case StylePackage.FONT_FACE_TYPE__VIDEOGRAPHIC:
				return VIDEOGRAPHIC_EDEFAULT == null ? vIdeographic != null : !VIDEOGRAPHIC_EDEFAULT.equals(vIdeographic);
			case StylePackage.FONT_FACE_TYPE__VMATHEMATICAL:
				return VMATHEMATICAL_EDEFAULT == null ? vMathematical != null : !VMATHEMATICAL_EDEFAULT.equals(vMathematical);
			case StylePackage.FONT_FACE_TYPE__WIDTHS:
				return WIDTHS_EDEFAULT == null ? widths != null : !WIDTHS_EDEFAULT.equals(widths);
			case StylePackage.FONT_FACE_TYPE__XHEIGHT:
				return XHEIGHT_EDEFAULT == null ? xHeight != null : !XHEIGHT_EDEFAULT.equals(xHeight);
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
		result.append(" (accentHeight: ");
		result.append(accentHeight);
		result.append(", alphabetic: ");
		result.append(alphabetic);
		result.append(", ascent: ");
		result.append(ascent);
		result.append(", bbox: ");
		result.append(bbox);
		result.append(", capHeight: ");
		result.append(capHeight);
		result.append(", descent: ");
		result.append(descent);
		result.append(", fontAdornments: ");
		result.append(fontAdornments);
		result.append(", fontCharset: ");
		result.append(fontCharset);
		result.append(", fontFamily: ");
		result.append(fontFamily);
		result.append(", fontFamilyGeneric: ");
		if (fontFamilyGenericESet) result.append(fontFamilyGeneric); else result.append("<unset>");
		result.append(", fontPitch: ");
		if (fontPitchESet) result.append(fontPitch); else result.append("<unset>");
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
		result.append(", hanging: ");
		result.append(hanging);
		result.append(", ideographic: ");
		result.append(ideographic);
		result.append(", mathematical: ");
		result.append(mathematical);
		result.append(", name: ");
		result.append(name);
		result.append(", overlinePosition: ");
		result.append(overlinePosition);
		result.append(", overlineThickness: ");
		result.append(overlineThickness);
		result.append(", panose1: ");
		result.append(panose1);
		result.append(", slope: ");
		result.append(slope);
		result.append(", stemh: ");
		result.append(stemh);
		result.append(", stemv: ");
		result.append(stemv);
		result.append(", strikethroughPosition: ");
		result.append(strikethroughPosition);
		result.append(", strikethroughThickness: ");
		result.append(strikethroughThickness);
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
		result.append(", vMathematical: ");
		result.append(vMathematical);
		result.append(", widths: ");
		result.append(widths);
		result.append(", xHeight: ");
		result.append(xHeight);
		result.append(')');
		return result.toString();
	}

} //FontFaceTypeImpl
