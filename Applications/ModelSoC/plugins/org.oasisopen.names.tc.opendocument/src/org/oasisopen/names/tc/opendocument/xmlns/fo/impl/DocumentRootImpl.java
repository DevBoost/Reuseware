/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.fo.impl;

import java.math.BigInteger;

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
import org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage;
import org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType;
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
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getBorderBottom <em>Border Bottom</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getBorderLeft <em>Border Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getBorderRight <em>Border Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getBorderTop <em>Border Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getBreakAfter <em>Break After</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getBreakBefore <em>Break Before</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getClip <em>Clip</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getColumnCount <em>Column Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getColumnGap <em>Column Gap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getEndIndent <em>End Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getHyphenate <em>Hyphenate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getHyphenationKeep <em>Hyphenation Keep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getHyphenationLadderCount <em>Hyphenation Ladder Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getHyphenationPushCharCount <em>Hyphenation Push Char Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getHyphenationRemainCharCount <em>Hyphenation Remain Char Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getKeepTogether <em>Keep Together</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getKeepWithNext <em>Keep With Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getLetterSpacing <em>Letter Spacing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getOrphans <em>Orphans</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getPaddingBottom <em>Padding Bottom</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getPaddingLeft <em>Padding Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getPaddingRight <em>Padding Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getPaddingTop <em>Padding Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getPageHeight <em>Page Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getSpaceAfter <em>Space After</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getSpaceBefore <em>Space Before</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getStartIndent <em>Start Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getTextAlignLast <em>Text Align Last</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getTextShadow <em>Text Shadow</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getTextTransform <em>Text Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getWidows <em>Widows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.impl.DocumentRootImpl#getWrapOption <em>Wrap Option</em>}</li>
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
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final Object BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Object backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected String border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderBottom() <em>Border Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderBottom()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderBottom() <em>Border Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderBottom()
	 * @generated
	 * @ordered
	 */
	protected String borderBottom = BORDER_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderLeft() <em>Border Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLeft()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderLeft() <em>Border Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderLeft()
	 * @generated
	 * @ordered
	 */
	protected String borderLeft = BORDER_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderRight() <em>Border Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderRight()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderRight() <em>Border Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderRight()
	 * @generated
	 * @ordered
	 */
	protected String borderRight = BORDER_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderTop() <em>Border Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderTop()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderTop() <em>Border Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderTop()
	 * @generated
	 * @ordered
	 */
	protected String borderTop = BORDER_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBreakAfter() <em>Break After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakAfter()
	 * @generated
	 * @ordered
	 */
	protected static final BreakAfterType BREAK_AFTER_EDEFAULT = BreakAfterType.AUTO;

	/**
	 * The cached value of the '{@link #getBreakAfter() <em>Break After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakAfter()
	 * @generated
	 * @ordered
	 */
	protected BreakAfterType breakAfter = BREAK_AFTER_EDEFAULT;

	/**
	 * This is true if the Break After attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean breakAfterESet;

	/**
	 * The default value of the '{@link #getBreakBefore() <em>Break Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakBefore()
	 * @generated
	 * @ordered
	 */
	protected static final BreakBeforeType BREAK_BEFORE_EDEFAULT = BreakBeforeType.AUTO;

	/**
	 * The cached value of the '{@link #getBreakBefore() <em>Break Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakBefore()
	 * @generated
	 * @ordered
	 */
	protected BreakBeforeType breakBefore = BREAK_BEFORE_EDEFAULT;

	/**
	 * This is true if the Break Before attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean breakBeforeESet;

	/**
	 * The default value of the '{@link #getClip() <em>Clip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClip()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClip() <em>Clip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClip()
	 * @generated
	 * @ordered
	 */
	protected String clip = CLIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnCount() <em>Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnCount() <em>Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger columnCount = COLUMN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnGap() <em>Column Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnGap()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_GAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnGap() <em>Column Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnGap()
	 * @generated
	 * @ordered
	 */
	protected String columnGap = COLUMN_GAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndIndent() <em>End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIndent()
	 * @generated
	 * @ordered
	 */
	protected static final String END_INDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndIndent() <em>End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIndent()
	 * @generated
	 * @ordered
	 */
	protected String endIndent = END_INDENT_EDEFAULT;

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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyphenate() <em>Hyphenate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenate()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean HYPHENATE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getHyphenate() <em>Hyphenate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenate()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean hyphenate = HYPHENATE_EDEFAULT;

	/**
	 * This is true if the Hyphenate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hyphenateESet;

	/**
	 * The default value of the '{@link #getHyphenationKeep() <em>Hyphenation Keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenationKeep()
	 * @generated
	 * @ordered
	 */
	protected static final HyphenationKeepType HYPHENATION_KEEP_EDEFAULT = HyphenationKeepType.AUTO;

	/**
	 * The cached value of the '{@link #getHyphenationKeep() <em>Hyphenation Keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenationKeep()
	 * @generated
	 * @ordered
	 */
	protected HyphenationKeepType hyphenationKeep = HYPHENATION_KEEP_EDEFAULT;

	/**
	 * This is true if the Hyphenation Keep attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hyphenationKeepESet;

	/**
	 * The default value of the '{@link #getHyphenationLadderCount() <em>Hyphenation Ladder Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenationLadderCount()
	 * @generated
	 * @ordered
	 */
	protected static final Object HYPHENATION_LADDER_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyphenationLadderCount() <em>Hyphenation Ladder Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenationLadderCount()
	 * @generated
	 * @ordered
	 */
	protected Object hyphenationLadderCount = HYPHENATION_LADDER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyphenationPushCharCount() <em>Hyphenation Push Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenationPushCharCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HYPHENATION_PUSH_CHAR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyphenationPushCharCount() <em>Hyphenation Push Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenationPushCharCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger hyphenationPushCharCount = HYPHENATION_PUSH_CHAR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHyphenationRemainCharCount() <em>Hyphenation Remain Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenationRemainCharCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger HYPHENATION_REMAIN_CHAR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHyphenationRemainCharCount() <em>Hyphenation Remain Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyphenationRemainCharCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger hyphenationRemainCharCount = HYPHENATION_REMAIN_CHAR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepTogether() <em>Keep Together</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepTogether()
	 * @generated
	 * @ordered
	 */
	protected static final KeepTogetherType KEEP_TOGETHER_EDEFAULT = KeepTogetherType.AUTO;

	/**
	 * The cached value of the '{@link #getKeepTogether() <em>Keep Together</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepTogether()
	 * @generated
	 * @ordered
	 */
	protected KeepTogetherType keepTogether = KEEP_TOGETHER_EDEFAULT;

	/**
	 * This is true if the Keep Together attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keepTogetherESet;

	/**
	 * The default value of the '{@link #getKeepWithNext() <em>Keep With Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepWithNext()
	 * @generated
	 * @ordered
	 */
	protected static final KeepWithNextType KEEP_WITH_NEXT_EDEFAULT = KeepWithNextType.AUTO;

	/**
	 * The cached value of the '{@link #getKeepWithNext() <em>Keep With Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepWithNext()
	 * @generated
	 * @ordered
	 */
	protected KeepWithNextType keepWithNext = KEEP_WITH_NEXT_EDEFAULT;

	/**
	 * This is true if the Keep With Next attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keepWithNextESet;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLetterSpacing() <em>Letter Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final Object LETTER_SPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLetterSpacing() <em>Letter Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetterSpacing()
	 * @generated
	 * @ordered
	 */
	protected Object letterSpacing = LETTER_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineHeight() <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Object LINE_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineHeight() <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeight()
	 * @generated
	 * @ordered
	 */
	protected Object lineHeight = LINE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected String margin = MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected String marginBottom = MARGIN_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
	protected String marginLeft = MARGIN_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
	protected String marginRight = MARGIN_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected String marginTop = MARGIN_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected String maxHeight = MAX_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected String maxWidth = MAX_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinWidth() <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected String minWidth = MIN_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrphans() <em>Orphans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrphans()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ORPHANS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrphans() <em>Orphans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrphans()
	 * @generated
	 * @ordered
	 */
	protected BigInteger orphans = ORPHANS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected String padding = PADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingBottom() <em>Padding Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingBottom()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingBottom() <em>Padding Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingBottom()
	 * @generated
	 * @ordered
	 */
	protected String paddingBottom = PADDING_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingLeft() <em>Padding Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingLeft()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingLeft() <em>Padding Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingLeft()
	 * @generated
	 * @ordered
	 */
	protected String paddingLeft = PADDING_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingRight() <em>Padding Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingRight()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingRight() <em>Padding Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingRight()
	 * @generated
	 * @ordered
	 */
	protected String paddingRight = PADDING_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingTop() <em>Padding Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingTop()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingTop() <em>Padding Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingTop()
	 * @generated
	 * @ordered
	 */
	protected String paddingTop = PADDING_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageHeight() <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageHeight() <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageHeight()
	 * @generated
	 * @ordered
	 */
	protected String pageHeight = PAGE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageWidth() <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageWidth() <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageWidth()
	 * @generated
	 * @ordered
	 */
	protected String pageWidth = PAGE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceAfter() <em>Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceAfter()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACE_AFTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceAfter() <em>Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceAfter()
	 * @generated
	 * @ordered
	 */
	protected String spaceAfter = SPACE_AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceBefore() <em>Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceBefore()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACE_BEFORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceBefore() <em>Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceBefore()
	 * @generated
	 * @ordered
	 */
	protected String spaceBefore = SPACE_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartIndent() <em>Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndent()
	 * @generated
	 * @ordered
	 */
	protected static final String START_INDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartIndent() <em>Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndent()
	 * @generated
	 * @ordered
	 */
	protected String startIndent = START_INDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected static final TextAlignType TEXT_ALIGN_EDEFAULT = TextAlignType.START;

	/**
	 * The cached value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected TextAlignType textAlign = TEXT_ALIGN_EDEFAULT;

	/**
	 * This is true if the Text Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textAlignESet;

	/**
	 * The default value of the '{@link #getTextAlignLast() <em>Text Align Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignLast()
	 * @generated
	 * @ordered
	 */
	protected static final TextAlignLastType TEXT_ALIGN_LAST_EDEFAULT = TextAlignLastType.START;

	/**
	 * The cached value of the '{@link #getTextAlignLast() <em>Text Align Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignLast()
	 * @generated
	 * @ordered
	 */
	protected TextAlignLastType textAlignLast = TEXT_ALIGN_LAST_EDEFAULT;

	/**
	 * This is true if the Text Align Last attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textAlignLastESet;

	/**
	 * The default value of the '{@link #getTextIndent() <em>Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIndent()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_INDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextIndent() <em>Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIndent()
	 * @generated
	 * @ordered
	 */
	protected String textIndent = TEXT_INDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextShadow() <em>Text Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextShadow()
	 * @generated
	 * @ordered
	 */
	protected static final Object TEXT_SHADOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextShadow() <em>Text Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextShadow()
	 * @generated
	 * @ordered
	 */
	protected Object textShadow = TEXT_SHADOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextTransform() <em>Text Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextTransform()
	 * @generated
	 * @ordered
	 */
	protected static final TextTransformType TEXT_TRANSFORM_EDEFAULT = TextTransformType.NONE;

	/**
	 * The cached value of the '{@link #getTextTransform() <em>Text Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextTransform()
	 * @generated
	 * @ordered
	 */
	protected TextTransformType textTransform = TEXT_TRANSFORM_EDEFAULT;

	/**
	 * This is true if the Text Transform attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textTransformESet;

	/**
	 * The default value of the '{@link #getWidows() <em>Widows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidows()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WIDOWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidows() <em>Widows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidows()
	 * @generated
	 * @ordered
	 */
	protected BigInteger widows = WIDOWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrapOption() <em>Wrap Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapOption()
	 * @generated
	 * @ordered
	 */
	protected static final WrapOptionType WRAP_OPTION_EDEFAULT = WrapOptionType.NO_WRAP;

	/**
	 * The cached value of the '{@link #getWrapOption() <em>Wrap Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapOption()
	 * @generated
	 * @ordered
	 */
	protected WrapOptionType wrapOption = WRAP_OPTION_EDEFAULT;

	/**
	 * This is true if the Wrap Option attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrapOptionESet;

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
		return FoPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, FoPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FoPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FoPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Object newBackgroundColor) {
		Object oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(String newBorder) {
		String oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderBottom() {
		return borderBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderBottom(String newBorderBottom) {
		String oldBorderBottom = borderBottom;
		borderBottom = newBorderBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__BORDER_BOTTOM, oldBorderBottom, borderBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderLeft() {
		return borderLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderLeft(String newBorderLeft) {
		String oldBorderLeft = borderLeft;
		borderLeft = newBorderLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__BORDER_LEFT, oldBorderLeft, borderLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderRight() {
		return borderRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderRight(String newBorderRight) {
		String oldBorderRight = borderRight;
		borderRight = newBorderRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__BORDER_RIGHT, oldBorderRight, borderRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderTop() {
		return borderTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderTop(String newBorderTop) {
		String oldBorderTop = borderTop;
		borderTop = newBorderTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__BORDER_TOP, oldBorderTop, borderTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakAfterType getBreakAfter() {
		return breakAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakAfter(BreakAfterType newBreakAfter) {
		BreakAfterType oldBreakAfter = breakAfter;
		breakAfter = newBreakAfter == null ? BREAK_AFTER_EDEFAULT : newBreakAfter;
		boolean oldBreakAfterESet = breakAfterESet;
		breakAfterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__BREAK_AFTER, oldBreakAfter, breakAfter, !oldBreakAfterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBreakAfter() {
		BreakAfterType oldBreakAfter = breakAfter;
		boolean oldBreakAfterESet = breakAfterESet;
		breakAfter = BREAK_AFTER_EDEFAULT;
		breakAfterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__BREAK_AFTER, oldBreakAfter, BREAK_AFTER_EDEFAULT, oldBreakAfterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBreakAfter() {
		return breakAfterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakBeforeType getBreakBefore() {
		return breakBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakBefore(BreakBeforeType newBreakBefore) {
		BreakBeforeType oldBreakBefore = breakBefore;
		breakBefore = newBreakBefore == null ? BREAK_BEFORE_EDEFAULT : newBreakBefore;
		boolean oldBreakBeforeESet = breakBeforeESet;
		breakBeforeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__BREAK_BEFORE, oldBreakBefore, breakBefore, !oldBreakBeforeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBreakBefore() {
		BreakBeforeType oldBreakBefore = breakBefore;
		boolean oldBreakBeforeESet = breakBeforeESet;
		breakBefore = BREAK_BEFORE_EDEFAULT;
		breakBeforeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__BREAK_BEFORE, oldBreakBefore, BREAK_BEFORE_EDEFAULT, oldBreakBeforeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBreakBefore() {
		return breakBeforeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClip() {
		return clip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClip(String newClip) {
		String oldClip = clip;
		clip = newClip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__CLIP, oldClip, clip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColumnCount() {
		return columnCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnCount(BigInteger newColumnCount) {
		BigInteger oldColumnCount = columnCount;
		columnCount = newColumnCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__COLUMN_COUNT, oldColumnCount, columnCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnGap() {
		return columnGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnGap(String newColumnGap) {
		String oldColumnGap = columnGap;
		columnGap = newColumnGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__COLUMN_GAP, oldColumnGap, columnGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndIndent() {
		return endIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndIndent(String newEndIndent) {
		String oldEndIndent = endIndent;
		endIndent = newEndIndent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__END_INDENT, oldEndIndent, endIndent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__FONT_FAMILY, oldFontFamily, fontFamily));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__FONT_SIZE, oldFontSize, fontSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__FONT_STYLE, oldFontStyle, fontStyle, !oldFontStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__FONT_STYLE, oldFontStyle, FONT_STYLE_EDEFAULT, oldFontStyleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__FONT_VARIANT, oldFontVariant, fontVariant, !oldFontVariantESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__FONT_VARIANT, oldFontVariant, FONT_VARIANT_EDEFAULT, oldFontVariantESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__FONT_WEIGHT, oldFontWeight, fontWeight, !oldFontWeightESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__FONT_WEIGHT, oldFontWeight, FONT_WEIGHT_EDEFAULT, oldFontWeightESet));
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
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHyphenate() {
		return hyphenate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyphenate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newHyphenate) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHyphenate = hyphenate;
		hyphenate = newHyphenate == null ? HYPHENATE_EDEFAULT : newHyphenate;
		boolean oldHyphenateESet = hyphenateESet;
		hyphenateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__HYPHENATE, oldHyphenate, hyphenate, !oldHyphenateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHyphenate() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHyphenate = hyphenate;
		boolean oldHyphenateESet = hyphenateESet;
		hyphenate = HYPHENATE_EDEFAULT;
		hyphenateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__HYPHENATE, oldHyphenate, HYPHENATE_EDEFAULT, oldHyphenateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHyphenate() {
		return hyphenateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyphenationKeepType getHyphenationKeep() {
		return hyphenationKeep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyphenationKeep(HyphenationKeepType newHyphenationKeep) {
		HyphenationKeepType oldHyphenationKeep = hyphenationKeep;
		hyphenationKeep = newHyphenationKeep == null ? HYPHENATION_KEEP_EDEFAULT : newHyphenationKeep;
		boolean oldHyphenationKeepESet = hyphenationKeepESet;
		hyphenationKeepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__HYPHENATION_KEEP, oldHyphenationKeep, hyphenationKeep, !oldHyphenationKeepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHyphenationKeep() {
		HyphenationKeepType oldHyphenationKeep = hyphenationKeep;
		boolean oldHyphenationKeepESet = hyphenationKeepESet;
		hyphenationKeep = HYPHENATION_KEEP_EDEFAULT;
		hyphenationKeepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__HYPHENATION_KEEP, oldHyphenationKeep, HYPHENATION_KEEP_EDEFAULT, oldHyphenationKeepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHyphenationKeep() {
		return hyphenationKeepESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHyphenationLadderCount() {
		return hyphenationLadderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyphenationLadderCount(Object newHyphenationLadderCount) {
		Object oldHyphenationLadderCount = hyphenationLadderCount;
		hyphenationLadderCount = newHyphenationLadderCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__HYPHENATION_LADDER_COUNT, oldHyphenationLadderCount, hyphenationLadderCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHyphenationPushCharCount() {
		return hyphenationPushCharCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyphenationPushCharCount(BigInteger newHyphenationPushCharCount) {
		BigInteger oldHyphenationPushCharCount = hyphenationPushCharCount;
		hyphenationPushCharCount = newHyphenationPushCharCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__HYPHENATION_PUSH_CHAR_COUNT, oldHyphenationPushCharCount, hyphenationPushCharCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getHyphenationRemainCharCount() {
		return hyphenationRemainCharCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyphenationRemainCharCount(BigInteger newHyphenationRemainCharCount) {
		BigInteger oldHyphenationRemainCharCount = hyphenationRemainCharCount;
		hyphenationRemainCharCount = newHyphenationRemainCharCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__HYPHENATION_REMAIN_CHAR_COUNT, oldHyphenationRemainCharCount, hyphenationRemainCharCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepTogetherType getKeepTogether() {
		return keepTogether;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepTogether(KeepTogetherType newKeepTogether) {
		KeepTogetherType oldKeepTogether = keepTogether;
		keepTogether = newKeepTogether == null ? KEEP_TOGETHER_EDEFAULT : newKeepTogether;
		boolean oldKeepTogetherESet = keepTogetherESet;
		keepTogetherESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__KEEP_TOGETHER, oldKeepTogether, keepTogether, !oldKeepTogetherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeepTogether() {
		KeepTogetherType oldKeepTogether = keepTogether;
		boolean oldKeepTogetherESet = keepTogetherESet;
		keepTogether = KEEP_TOGETHER_EDEFAULT;
		keepTogetherESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__KEEP_TOGETHER, oldKeepTogether, KEEP_TOGETHER_EDEFAULT, oldKeepTogetherESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeepTogether() {
		return keepTogetherESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepWithNextType getKeepWithNext() {
		return keepWithNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepWithNext(KeepWithNextType newKeepWithNext) {
		KeepWithNextType oldKeepWithNext = keepWithNext;
		keepWithNext = newKeepWithNext == null ? KEEP_WITH_NEXT_EDEFAULT : newKeepWithNext;
		boolean oldKeepWithNextESet = keepWithNextESet;
		keepWithNextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__KEEP_WITH_NEXT, oldKeepWithNext, keepWithNext, !oldKeepWithNextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeepWithNext() {
		KeepWithNextType oldKeepWithNext = keepWithNext;
		boolean oldKeepWithNextESet = keepWithNextESet;
		keepWithNext = KEEP_WITH_NEXT_EDEFAULT;
		keepWithNextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__KEEP_WITH_NEXT, oldKeepWithNext, KEEP_WITH_NEXT_EDEFAULT, oldKeepWithNextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeepWithNext() {
		return keepWithNextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLetterSpacing() {
		return letterSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetterSpacing(Object newLetterSpacing) {
		Object oldLetterSpacing = letterSpacing;
		letterSpacing = newLetterSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__LETTER_SPACING, oldLetterSpacing, letterSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLineHeight() {
		return lineHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineHeight(Object newLineHeight) {
		Object oldLineHeight = lineHeight;
		lineHeight = newLineHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__LINE_HEIGHT, oldLineHeight, lineHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(String newMargin) {
		String oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginBottom() {
		return marginBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginBottom(String newMarginBottom) {
		String oldMarginBottom = marginBottom;
		marginBottom = newMarginBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__MARGIN_BOTTOM, oldMarginBottom, marginBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginLeft() {
		return marginLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginLeft(String newMarginLeft) {
		String oldMarginLeft = marginLeft;
		marginLeft = newMarginLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__MARGIN_LEFT, oldMarginLeft, marginLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginRight() {
		return marginRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginRight(String newMarginRight) {
		String oldMarginRight = marginRight;
		marginRight = newMarginRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__MARGIN_RIGHT, oldMarginRight, marginRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarginTop() {
		return marginTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginTop(String newMarginTop) {
		String oldMarginTop = marginTop;
		marginTop = newMarginTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__MARGIN_TOP, oldMarginTop, marginTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxHeight() {
		return maxHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHeight(String newMaxHeight) {
		String oldMaxHeight = maxHeight;
		maxHeight = newMaxHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__MAX_HEIGHT, oldMaxHeight, maxHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxWidth() {
		return maxWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWidth(String newMaxWidth) {
		String oldMaxWidth = maxWidth;
		maxWidth = newMaxWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__MAX_WIDTH, oldMaxWidth, maxWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinWidth() {
		return minWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinWidth(String newMinWidth) {
		String oldMinWidth = minWidth;
		minWidth = newMinWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__MIN_WIDTH, oldMinWidth, minWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOrphans() {
		return orphans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrphans(BigInteger newOrphans) {
		BigInteger oldOrphans = orphans;
		orphans = newOrphans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__ORPHANS, oldOrphans, orphans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding(String newPadding) {
		String oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__PADDING, oldPadding, padding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingBottom() {
		return paddingBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingBottom(String newPaddingBottom) {
		String oldPaddingBottom = paddingBottom;
		paddingBottom = newPaddingBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__PADDING_BOTTOM, oldPaddingBottom, paddingBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingLeft() {
		return paddingLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingLeft(String newPaddingLeft) {
		String oldPaddingLeft = paddingLeft;
		paddingLeft = newPaddingLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__PADDING_LEFT, oldPaddingLeft, paddingLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingRight() {
		return paddingRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingRight(String newPaddingRight) {
		String oldPaddingRight = paddingRight;
		paddingRight = newPaddingRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__PADDING_RIGHT, oldPaddingRight, paddingRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaddingTop() {
		return paddingTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingTop(String newPaddingTop) {
		String oldPaddingTop = paddingTop;
		paddingTop = newPaddingTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__PADDING_TOP, oldPaddingTop, paddingTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageHeight() {
		return pageHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageHeight(String newPageHeight) {
		String oldPageHeight = pageHeight;
		pageHeight = newPageHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__PAGE_HEIGHT, oldPageHeight, pageHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageWidth() {
		return pageWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageWidth(String newPageWidth) {
		String oldPageWidth = pageWidth;
		pageWidth = newPageWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__PAGE_WIDTH, oldPageWidth, pageWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpaceAfter() {
		return spaceAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceAfter(String newSpaceAfter) {
		String oldSpaceAfter = spaceAfter;
		spaceAfter = newSpaceAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__SPACE_AFTER, oldSpaceAfter, spaceAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpaceBefore() {
		return spaceBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceBefore(String newSpaceBefore) {
		String oldSpaceBefore = spaceBefore;
		spaceBefore = newSpaceBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__SPACE_BEFORE, oldSpaceBefore, spaceBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartIndent() {
		return startIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartIndent(String newStartIndent) {
		String oldStartIndent = startIndent;
		startIndent = newStartIndent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__START_INDENT, oldStartIndent, startIndent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignType getTextAlign() {
		return textAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlign(TextAlignType newTextAlign) {
		TextAlignType oldTextAlign = textAlign;
		textAlign = newTextAlign == null ? TEXT_ALIGN_EDEFAULT : newTextAlign;
		boolean oldTextAlignESet = textAlignESet;
		textAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__TEXT_ALIGN, oldTextAlign, textAlign, !oldTextAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextAlign() {
		TextAlignType oldTextAlign = textAlign;
		boolean oldTextAlignESet = textAlignESet;
		textAlign = TEXT_ALIGN_EDEFAULT;
		textAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__TEXT_ALIGN, oldTextAlign, TEXT_ALIGN_EDEFAULT, oldTextAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextAlign() {
		return textAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlignLastType getTextAlignLast() {
		return textAlignLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlignLast(TextAlignLastType newTextAlignLast) {
		TextAlignLastType oldTextAlignLast = textAlignLast;
		textAlignLast = newTextAlignLast == null ? TEXT_ALIGN_LAST_EDEFAULT : newTextAlignLast;
		boolean oldTextAlignLastESet = textAlignLastESet;
		textAlignLastESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__TEXT_ALIGN_LAST, oldTextAlignLast, textAlignLast, !oldTextAlignLastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextAlignLast() {
		TextAlignLastType oldTextAlignLast = textAlignLast;
		boolean oldTextAlignLastESet = textAlignLastESet;
		textAlignLast = TEXT_ALIGN_LAST_EDEFAULT;
		textAlignLastESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__TEXT_ALIGN_LAST, oldTextAlignLast, TEXT_ALIGN_LAST_EDEFAULT, oldTextAlignLastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextAlignLast() {
		return textAlignLastESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextIndent() {
		return textIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextIndent(String newTextIndent) {
		String oldTextIndent = textIndent;
		textIndent = newTextIndent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__TEXT_INDENT, oldTextIndent, textIndent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTextShadow() {
		return textShadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextShadow(Object newTextShadow) {
		Object oldTextShadow = textShadow;
		textShadow = newTextShadow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__TEXT_SHADOW, oldTextShadow, textShadow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextTransformType getTextTransform() {
		return textTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextTransform(TextTransformType newTextTransform) {
		TextTransformType oldTextTransform = textTransform;
		textTransform = newTextTransform == null ? TEXT_TRANSFORM_EDEFAULT : newTextTransform;
		boolean oldTextTransformESet = textTransformESet;
		textTransformESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__TEXT_TRANSFORM, oldTextTransform, textTransform, !oldTextTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextTransform() {
		TextTransformType oldTextTransform = textTransform;
		boolean oldTextTransformESet = textTransformESet;
		textTransform = TEXT_TRANSFORM_EDEFAULT;
		textTransformESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__TEXT_TRANSFORM, oldTextTransform, TEXT_TRANSFORM_EDEFAULT, oldTextTransformESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextTransform() {
		return textTransformESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWidows() {
		return widows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidows(BigInteger newWidows) {
		BigInteger oldWidows = widows;
		widows = newWidows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__WIDOWS, oldWidows, widows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrapOptionType getWrapOption() {
		return wrapOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapOption(WrapOptionType newWrapOption) {
		WrapOptionType oldWrapOption = wrapOption;
		wrapOption = newWrapOption == null ? WRAP_OPTION_EDEFAULT : newWrapOption;
		boolean oldWrapOptionESet = wrapOptionESet;
		wrapOptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FoPackage.DOCUMENT_ROOT__WRAP_OPTION, oldWrapOption, wrapOption, !oldWrapOptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrapOption() {
		WrapOptionType oldWrapOption = wrapOption;
		boolean oldWrapOptionESet = wrapOptionESet;
		wrapOption = WRAP_OPTION_EDEFAULT;
		wrapOptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FoPackage.DOCUMENT_ROOT__WRAP_OPTION, oldWrapOption, WRAP_OPTION_EDEFAULT, oldWrapOptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrapOption() {
		return wrapOptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FoPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case FoPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case FoPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
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
			case FoPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case FoPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case FoPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case FoPackage.DOCUMENT_ROOT__BACKGROUND_COLOR:
				return getBackgroundColor();
			case FoPackage.DOCUMENT_ROOT__BORDER:
				return getBorder();
			case FoPackage.DOCUMENT_ROOT__BORDER_BOTTOM:
				return getBorderBottom();
			case FoPackage.DOCUMENT_ROOT__BORDER_LEFT:
				return getBorderLeft();
			case FoPackage.DOCUMENT_ROOT__BORDER_RIGHT:
				return getBorderRight();
			case FoPackage.DOCUMENT_ROOT__BORDER_TOP:
				return getBorderTop();
			case FoPackage.DOCUMENT_ROOT__BREAK_AFTER:
				return getBreakAfter();
			case FoPackage.DOCUMENT_ROOT__BREAK_BEFORE:
				return getBreakBefore();
			case FoPackage.DOCUMENT_ROOT__CLIP:
				return getClip();
			case FoPackage.DOCUMENT_ROOT__COLOR:
				return getColor();
			case FoPackage.DOCUMENT_ROOT__COLUMN_COUNT:
				return getColumnCount();
			case FoPackage.DOCUMENT_ROOT__COLUMN_GAP:
				return getColumnGap();
			case FoPackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case FoPackage.DOCUMENT_ROOT__END_INDENT:
				return getEndIndent();
			case FoPackage.DOCUMENT_ROOT__FONT_FAMILY:
				return getFontFamily();
			case FoPackage.DOCUMENT_ROOT__FONT_SIZE:
				return getFontSize();
			case FoPackage.DOCUMENT_ROOT__FONT_STYLE:
				return getFontStyle();
			case FoPackage.DOCUMENT_ROOT__FONT_VARIANT:
				return getFontVariant();
			case FoPackage.DOCUMENT_ROOT__FONT_WEIGHT:
				return getFontWeight();
			case FoPackage.DOCUMENT_ROOT__HEIGHT:
				return getHeight();
			case FoPackage.DOCUMENT_ROOT__HYPHENATE:
				return getHyphenate();
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_KEEP:
				return getHyphenationKeep();
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_LADDER_COUNT:
				return getHyphenationLadderCount();
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_PUSH_CHAR_COUNT:
				return getHyphenationPushCharCount();
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_REMAIN_CHAR_COUNT:
				return getHyphenationRemainCharCount();
			case FoPackage.DOCUMENT_ROOT__KEEP_TOGETHER:
				return getKeepTogether();
			case FoPackage.DOCUMENT_ROOT__KEEP_WITH_NEXT:
				return getKeepWithNext();
			case FoPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case FoPackage.DOCUMENT_ROOT__LETTER_SPACING:
				return getLetterSpacing();
			case FoPackage.DOCUMENT_ROOT__LINE_HEIGHT:
				return getLineHeight();
			case FoPackage.DOCUMENT_ROOT__MARGIN:
				return getMargin();
			case FoPackage.DOCUMENT_ROOT__MARGIN_BOTTOM:
				return getMarginBottom();
			case FoPackage.DOCUMENT_ROOT__MARGIN_LEFT:
				return getMarginLeft();
			case FoPackage.DOCUMENT_ROOT__MARGIN_RIGHT:
				return getMarginRight();
			case FoPackage.DOCUMENT_ROOT__MARGIN_TOP:
				return getMarginTop();
			case FoPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				return getMaxHeight();
			case FoPackage.DOCUMENT_ROOT__MAX_WIDTH:
				return getMaxWidth();
			case FoPackage.DOCUMENT_ROOT__MIN_WIDTH:
				return getMinWidth();
			case FoPackage.DOCUMENT_ROOT__ORPHANS:
				return getOrphans();
			case FoPackage.DOCUMENT_ROOT__PADDING:
				return getPadding();
			case FoPackage.DOCUMENT_ROOT__PADDING_BOTTOM:
				return getPaddingBottom();
			case FoPackage.DOCUMENT_ROOT__PADDING_LEFT:
				return getPaddingLeft();
			case FoPackage.DOCUMENT_ROOT__PADDING_RIGHT:
				return getPaddingRight();
			case FoPackage.DOCUMENT_ROOT__PADDING_TOP:
				return getPaddingTop();
			case FoPackage.DOCUMENT_ROOT__PAGE_HEIGHT:
				return getPageHeight();
			case FoPackage.DOCUMENT_ROOT__PAGE_WIDTH:
				return getPageWidth();
			case FoPackage.DOCUMENT_ROOT__SPACE_AFTER:
				return getSpaceAfter();
			case FoPackage.DOCUMENT_ROOT__SPACE_BEFORE:
				return getSpaceBefore();
			case FoPackage.DOCUMENT_ROOT__START_INDENT:
				return getStartIndent();
			case FoPackage.DOCUMENT_ROOT__TEXT_ALIGN:
				return getTextAlign();
			case FoPackage.DOCUMENT_ROOT__TEXT_ALIGN_LAST:
				return getTextAlignLast();
			case FoPackage.DOCUMENT_ROOT__TEXT_INDENT:
				return getTextIndent();
			case FoPackage.DOCUMENT_ROOT__TEXT_SHADOW:
				return getTextShadow();
			case FoPackage.DOCUMENT_ROOT__TEXT_TRANSFORM:
				return getTextTransform();
			case FoPackage.DOCUMENT_ROOT__WIDOWS:
				return getWidows();
			case FoPackage.DOCUMENT_ROOT__WIDTH:
				return getWidth();
			case FoPackage.DOCUMENT_ROOT__WRAP_OPTION:
				return getWrapOption();
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
			case FoPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__BACKGROUND_COLOR:
				setBackgroundColor(newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER:
				setBorder((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER_BOTTOM:
				setBorderBottom((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER_LEFT:
				setBorderLeft((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER_RIGHT:
				setBorderRight((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER_TOP:
				setBorderTop((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__BREAK_AFTER:
				setBreakAfter((BreakAfterType)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__BREAK_BEFORE:
				setBreakBefore((BreakBeforeType)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__CLIP:
				setClip((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__COLOR:
				setColor((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__COLUMN_COUNT:
				setColumnCount((BigInteger)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__COLUMN_GAP:
				setColumnGap((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__END_INDENT:
				setEndIndent((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_VARIANT:
				setFontVariant((FontVariant)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_WEIGHT:
				setFontWeight((FontWeight)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__HEIGHT:
				setHeight((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATE:
				setHyphenate((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_KEEP:
				setHyphenationKeep((HyphenationKeepType)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_LADDER_COUNT:
				setHyphenationLadderCount(newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_PUSH_CHAR_COUNT:
				setHyphenationPushCharCount((BigInteger)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_REMAIN_CHAR_COUNT:
				setHyphenationRemainCharCount((BigInteger)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__KEEP_TOGETHER:
				setKeepTogether((KeepTogetherType)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__KEEP_WITH_NEXT:
				setKeepWithNext((KeepWithNextType)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__LETTER_SPACING:
				setLetterSpacing(newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__LINE_HEIGHT:
				setLineHeight(newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN:
				setMargin((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN_BOTTOM:
				setMarginBottom((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN_LEFT:
				setMarginLeft((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN_RIGHT:
				setMarginRight((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN_TOP:
				setMarginTop((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				setMaxHeight((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__MAX_WIDTH:
				setMaxWidth((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__MIN_WIDTH:
				setMinWidth((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__ORPHANS:
				setOrphans((BigInteger)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING:
				setPadding((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING_BOTTOM:
				setPaddingBottom((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING_LEFT:
				setPaddingLeft((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING_RIGHT:
				setPaddingRight((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING_TOP:
				setPaddingTop((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__PAGE_HEIGHT:
				setPageHeight((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__PAGE_WIDTH:
				setPageWidth((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__SPACE_AFTER:
				setSpaceAfter((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__SPACE_BEFORE:
				setSpaceBefore((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__START_INDENT:
				setStartIndent((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_ALIGN:
				setTextAlign((TextAlignType)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_ALIGN_LAST:
				setTextAlignLast((TextAlignLastType)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_INDENT:
				setTextIndent((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_SHADOW:
				setTextShadow(newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_TRANSFORM:
				setTextTransform((TextTransformType)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__WIDOWS:
				setWidows((BigInteger)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__WIDTH:
				setWidth((String)newValue);
				return;
			case FoPackage.DOCUMENT_ROOT__WRAP_OPTION:
				setWrapOption((WrapOptionType)newValue);
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
			case FoPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case FoPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case FoPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case FoPackage.DOCUMENT_ROOT__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER_BOTTOM:
				setBorderBottom(BORDER_BOTTOM_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER_LEFT:
				setBorderLeft(BORDER_LEFT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER_RIGHT:
				setBorderRight(BORDER_RIGHT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__BORDER_TOP:
				setBorderTop(BORDER_TOP_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__BREAK_AFTER:
				unsetBreakAfter();
				return;
			case FoPackage.DOCUMENT_ROOT__BREAK_BEFORE:
				unsetBreakBefore();
				return;
			case FoPackage.DOCUMENT_ROOT__CLIP:
				setClip(CLIP_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__COLUMN_COUNT:
				setColumnCount(COLUMN_COUNT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__COLUMN_GAP:
				setColumnGap(COLUMN_GAP_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__END_INDENT:
				setEndIndent(END_INDENT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_STYLE:
				unsetFontStyle();
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_VARIANT:
				unsetFontVariant();
				return;
			case FoPackage.DOCUMENT_ROOT__FONT_WEIGHT:
				unsetFontWeight();
				return;
			case FoPackage.DOCUMENT_ROOT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATE:
				unsetHyphenate();
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_KEEP:
				unsetHyphenationKeep();
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_LADDER_COUNT:
				setHyphenationLadderCount(HYPHENATION_LADDER_COUNT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_PUSH_CHAR_COUNT:
				setHyphenationPushCharCount(HYPHENATION_PUSH_CHAR_COUNT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_REMAIN_CHAR_COUNT:
				setHyphenationRemainCharCount(HYPHENATION_REMAIN_CHAR_COUNT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__KEEP_TOGETHER:
				unsetKeepTogether();
				return;
			case FoPackage.DOCUMENT_ROOT__KEEP_WITH_NEXT:
				unsetKeepWithNext();
				return;
			case FoPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__LETTER_SPACING:
				setLetterSpacing(LETTER_SPACING_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__LINE_HEIGHT:
				setLineHeight(LINE_HEIGHT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN_BOTTOM:
				setMarginBottom(MARGIN_BOTTOM_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN_LEFT:
				setMarginLeft(MARGIN_LEFT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN_RIGHT:
				setMarginRight(MARGIN_RIGHT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__MARGIN_TOP:
				setMarginTop(MARGIN_TOP_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				setMaxHeight(MAX_HEIGHT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__MAX_WIDTH:
				setMaxWidth(MAX_WIDTH_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__MIN_WIDTH:
				setMinWidth(MIN_WIDTH_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__ORPHANS:
				setOrphans(ORPHANS_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING:
				setPadding(PADDING_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING_BOTTOM:
				setPaddingBottom(PADDING_BOTTOM_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING_LEFT:
				setPaddingLeft(PADDING_LEFT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING_RIGHT:
				setPaddingRight(PADDING_RIGHT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__PADDING_TOP:
				setPaddingTop(PADDING_TOP_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__PAGE_HEIGHT:
				setPageHeight(PAGE_HEIGHT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__PAGE_WIDTH:
				setPageWidth(PAGE_WIDTH_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__SPACE_AFTER:
				setSpaceAfter(SPACE_AFTER_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__SPACE_BEFORE:
				setSpaceBefore(SPACE_BEFORE_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__START_INDENT:
				setStartIndent(START_INDENT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_ALIGN:
				unsetTextAlign();
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_ALIGN_LAST:
				unsetTextAlignLast();
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_INDENT:
				setTextIndent(TEXT_INDENT_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_SHADOW:
				setTextShadow(TEXT_SHADOW_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__TEXT_TRANSFORM:
				unsetTextTransform();
				return;
			case FoPackage.DOCUMENT_ROOT__WIDOWS:
				setWidows(WIDOWS_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case FoPackage.DOCUMENT_ROOT__WRAP_OPTION:
				unsetWrapOption();
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
			case FoPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case FoPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case FoPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case FoPackage.DOCUMENT_ROOT__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case FoPackage.DOCUMENT_ROOT__BORDER:
				return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
			case FoPackage.DOCUMENT_ROOT__BORDER_BOTTOM:
				return BORDER_BOTTOM_EDEFAULT == null ? borderBottom != null : !BORDER_BOTTOM_EDEFAULT.equals(borderBottom);
			case FoPackage.DOCUMENT_ROOT__BORDER_LEFT:
				return BORDER_LEFT_EDEFAULT == null ? borderLeft != null : !BORDER_LEFT_EDEFAULT.equals(borderLeft);
			case FoPackage.DOCUMENT_ROOT__BORDER_RIGHT:
				return BORDER_RIGHT_EDEFAULT == null ? borderRight != null : !BORDER_RIGHT_EDEFAULT.equals(borderRight);
			case FoPackage.DOCUMENT_ROOT__BORDER_TOP:
				return BORDER_TOP_EDEFAULT == null ? borderTop != null : !BORDER_TOP_EDEFAULT.equals(borderTop);
			case FoPackage.DOCUMENT_ROOT__BREAK_AFTER:
				return isSetBreakAfter();
			case FoPackage.DOCUMENT_ROOT__BREAK_BEFORE:
				return isSetBreakBefore();
			case FoPackage.DOCUMENT_ROOT__CLIP:
				return CLIP_EDEFAULT == null ? clip != null : !CLIP_EDEFAULT.equals(clip);
			case FoPackage.DOCUMENT_ROOT__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case FoPackage.DOCUMENT_ROOT__COLUMN_COUNT:
				return COLUMN_COUNT_EDEFAULT == null ? columnCount != null : !COLUMN_COUNT_EDEFAULT.equals(columnCount);
			case FoPackage.DOCUMENT_ROOT__COLUMN_GAP:
				return COLUMN_GAP_EDEFAULT == null ? columnGap != null : !COLUMN_GAP_EDEFAULT.equals(columnGap);
			case FoPackage.DOCUMENT_ROOT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case FoPackage.DOCUMENT_ROOT__END_INDENT:
				return END_INDENT_EDEFAULT == null ? endIndent != null : !END_INDENT_EDEFAULT.equals(endIndent);
			case FoPackage.DOCUMENT_ROOT__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? fontFamily != null : !FONT_FAMILY_EDEFAULT.equals(fontFamily);
			case FoPackage.DOCUMENT_ROOT__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
			case FoPackage.DOCUMENT_ROOT__FONT_STYLE:
				return isSetFontStyle();
			case FoPackage.DOCUMENT_ROOT__FONT_VARIANT:
				return isSetFontVariant();
			case FoPackage.DOCUMENT_ROOT__FONT_WEIGHT:
				return isSetFontWeight();
			case FoPackage.DOCUMENT_ROOT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case FoPackage.DOCUMENT_ROOT__HYPHENATE:
				return isSetHyphenate();
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_KEEP:
				return isSetHyphenationKeep();
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_LADDER_COUNT:
				return HYPHENATION_LADDER_COUNT_EDEFAULT == null ? hyphenationLadderCount != null : !HYPHENATION_LADDER_COUNT_EDEFAULT.equals(hyphenationLadderCount);
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_PUSH_CHAR_COUNT:
				return HYPHENATION_PUSH_CHAR_COUNT_EDEFAULT == null ? hyphenationPushCharCount != null : !HYPHENATION_PUSH_CHAR_COUNT_EDEFAULT.equals(hyphenationPushCharCount);
			case FoPackage.DOCUMENT_ROOT__HYPHENATION_REMAIN_CHAR_COUNT:
				return HYPHENATION_REMAIN_CHAR_COUNT_EDEFAULT == null ? hyphenationRemainCharCount != null : !HYPHENATION_REMAIN_CHAR_COUNT_EDEFAULT.equals(hyphenationRemainCharCount);
			case FoPackage.DOCUMENT_ROOT__KEEP_TOGETHER:
				return isSetKeepTogether();
			case FoPackage.DOCUMENT_ROOT__KEEP_WITH_NEXT:
				return isSetKeepWithNext();
			case FoPackage.DOCUMENT_ROOT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case FoPackage.DOCUMENT_ROOT__LETTER_SPACING:
				return LETTER_SPACING_EDEFAULT == null ? letterSpacing != null : !LETTER_SPACING_EDEFAULT.equals(letterSpacing);
			case FoPackage.DOCUMENT_ROOT__LINE_HEIGHT:
				return LINE_HEIGHT_EDEFAULT == null ? lineHeight != null : !LINE_HEIGHT_EDEFAULT.equals(lineHeight);
			case FoPackage.DOCUMENT_ROOT__MARGIN:
				return MARGIN_EDEFAULT == null ? margin != null : !MARGIN_EDEFAULT.equals(margin);
			case FoPackage.DOCUMENT_ROOT__MARGIN_BOTTOM:
				return MARGIN_BOTTOM_EDEFAULT == null ? marginBottom != null : !MARGIN_BOTTOM_EDEFAULT.equals(marginBottom);
			case FoPackage.DOCUMENT_ROOT__MARGIN_LEFT:
				return MARGIN_LEFT_EDEFAULT == null ? marginLeft != null : !MARGIN_LEFT_EDEFAULT.equals(marginLeft);
			case FoPackage.DOCUMENT_ROOT__MARGIN_RIGHT:
				return MARGIN_RIGHT_EDEFAULT == null ? marginRight != null : !MARGIN_RIGHT_EDEFAULT.equals(marginRight);
			case FoPackage.DOCUMENT_ROOT__MARGIN_TOP:
				return MARGIN_TOP_EDEFAULT == null ? marginTop != null : !MARGIN_TOP_EDEFAULT.equals(marginTop);
			case FoPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				return MAX_HEIGHT_EDEFAULT == null ? maxHeight != null : !MAX_HEIGHT_EDEFAULT.equals(maxHeight);
			case FoPackage.DOCUMENT_ROOT__MAX_WIDTH:
				return MAX_WIDTH_EDEFAULT == null ? maxWidth != null : !MAX_WIDTH_EDEFAULT.equals(maxWidth);
			case FoPackage.DOCUMENT_ROOT__MIN_WIDTH:
				return MIN_WIDTH_EDEFAULT == null ? minWidth != null : !MIN_WIDTH_EDEFAULT.equals(minWidth);
			case FoPackage.DOCUMENT_ROOT__ORPHANS:
				return ORPHANS_EDEFAULT == null ? orphans != null : !ORPHANS_EDEFAULT.equals(orphans);
			case FoPackage.DOCUMENT_ROOT__PADDING:
				return PADDING_EDEFAULT == null ? padding != null : !PADDING_EDEFAULT.equals(padding);
			case FoPackage.DOCUMENT_ROOT__PADDING_BOTTOM:
				return PADDING_BOTTOM_EDEFAULT == null ? paddingBottom != null : !PADDING_BOTTOM_EDEFAULT.equals(paddingBottom);
			case FoPackage.DOCUMENT_ROOT__PADDING_LEFT:
				return PADDING_LEFT_EDEFAULT == null ? paddingLeft != null : !PADDING_LEFT_EDEFAULT.equals(paddingLeft);
			case FoPackage.DOCUMENT_ROOT__PADDING_RIGHT:
				return PADDING_RIGHT_EDEFAULT == null ? paddingRight != null : !PADDING_RIGHT_EDEFAULT.equals(paddingRight);
			case FoPackage.DOCUMENT_ROOT__PADDING_TOP:
				return PADDING_TOP_EDEFAULT == null ? paddingTop != null : !PADDING_TOP_EDEFAULT.equals(paddingTop);
			case FoPackage.DOCUMENT_ROOT__PAGE_HEIGHT:
				return PAGE_HEIGHT_EDEFAULT == null ? pageHeight != null : !PAGE_HEIGHT_EDEFAULT.equals(pageHeight);
			case FoPackage.DOCUMENT_ROOT__PAGE_WIDTH:
				return PAGE_WIDTH_EDEFAULT == null ? pageWidth != null : !PAGE_WIDTH_EDEFAULT.equals(pageWidth);
			case FoPackage.DOCUMENT_ROOT__SPACE_AFTER:
				return SPACE_AFTER_EDEFAULT == null ? spaceAfter != null : !SPACE_AFTER_EDEFAULT.equals(spaceAfter);
			case FoPackage.DOCUMENT_ROOT__SPACE_BEFORE:
				return SPACE_BEFORE_EDEFAULT == null ? spaceBefore != null : !SPACE_BEFORE_EDEFAULT.equals(spaceBefore);
			case FoPackage.DOCUMENT_ROOT__START_INDENT:
				return START_INDENT_EDEFAULT == null ? startIndent != null : !START_INDENT_EDEFAULT.equals(startIndent);
			case FoPackage.DOCUMENT_ROOT__TEXT_ALIGN:
				return isSetTextAlign();
			case FoPackage.DOCUMENT_ROOT__TEXT_ALIGN_LAST:
				return isSetTextAlignLast();
			case FoPackage.DOCUMENT_ROOT__TEXT_INDENT:
				return TEXT_INDENT_EDEFAULT == null ? textIndent != null : !TEXT_INDENT_EDEFAULT.equals(textIndent);
			case FoPackage.DOCUMENT_ROOT__TEXT_SHADOW:
				return TEXT_SHADOW_EDEFAULT == null ? textShadow != null : !TEXT_SHADOW_EDEFAULT.equals(textShadow);
			case FoPackage.DOCUMENT_ROOT__TEXT_TRANSFORM:
				return isSetTextTransform();
			case FoPackage.DOCUMENT_ROOT__WIDOWS:
				return WIDOWS_EDEFAULT == null ? widows != null : !WIDOWS_EDEFAULT.equals(widows);
			case FoPackage.DOCUMENT_ROOT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case FoPackage.DOCUMENT_ROOT__WRAP_OPTION:
				return isSetWrapOption();
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
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", border: ");
		result.append(border);
		result.append(", borderBottom: ");
		result.append(borderBottom);
		result.append(", borderLeft: ");
		result.append(borderLeft);
		result.append(", borderRight: ");
		result.append(borderRight);
		result.append(", borderTop: ");
		result.append(borderTop);
		result.append(", breakAfter: ");
		if (breakAfterESet) result.append(breakAfter); else result.append("<unset>");
		result.append(", breakBefore: ");
		if (breakBeforeESet) result.append(breakBefore); else result.append("<unset>");
		result.append(", clip: ");
		result.append(clip);
		result.append(", color: ");
		result.append(color);
		result.append(", columnCount: ");
		result.append(columnCount);
		result.append(", columnGap: ");
		result.append(columnGap);
		result.append(", country: ");
		result.append(country);
		result.append(", endIndent: ");
		result.append(endIndent);
		result.append(", fontFamily: ");
		result.append(fontFamily);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", fontStyle: ");
		if (fontStyleESet) result.append(fontStyle); else result.append("<unset>");
		result.append(", fontVariant: ");
		if (fontVariantESet) result.append(fontVariant); else result.append("<unset>");
		result.append(", fontWeight: ");
		if (fontWeightESet) result.append(fontWeight); else result.append("<unset>");
		result.append(", height: ");
		result.append(height);
		result.append(", hyphenate: ");
		if (hyphenateESet) result.append(hyphenate); else result.append("<unset>");
		result.append(", hyphenationKeep: ");
		if (hyphenationKeepESet) result.append(hyphenationKeep); else result.append("<unset>");
		result.append(", hyphenationLadderCount: ");
		result.append(hyphenationLadderCount);
		result.append(", hyphenationPushCharCount: ");
		result.append(hyphenationPushCharCount);
		result.append(", hyphenationRemainCharCount: ");
		result.append(hyphenationRemainCharCount);
		result.append(", keepTogether: ");
		if (keepTogetherESet) result.append(keepTogether); else result.append("<unset>");
		result.append(", keepWithNext: ");
		if (keepWithNextESet) result.append(keepWithNext); else result.append("<unset>");
		result.append(", language: ");
		result.append(language);
		result.append(", letterSpacing: ");
		result.append(letterSpacing);
		result.append(", lineHeight: ");
		result.append(lineHeight);
		result.append(", margin: ");
		result.append(margin);
		result.append(", marginBottom: ");
		result.append(marginBottom);
		result.append(", marginLeft: ");
		result.append(marginLeft);
		result.append(", marginRight: ");
		result.append(marginRight);
		result.append(", marginTop: ");
		result.append(marginTop);
		result.append(", maxHeight: ");
		result.append(maxHeight);
		result.append(", maxWidth: ");
		result.append(maxWidth);
		result.append(", minWidth: ");
		result.append(minWidth);
		result.append(", orphans: ");
		result.append(orphans);
		result.append(", padding: ");
		result.append(padding);
		result.append(", paddingBottom: ");
		result.append(paddingBottom);
		result.append(", paddingLeft: ");
		result.append(paddingLeft);
		result.append(", paddingRight: ");
		result.append(paddingRight);
		result.append(", paddingTop: ");
		result.append(paddingTop);
		result.append(", pageHeight: ");
		result.append(pageHeight);
		result.append(", pageWidth: ");
		result.append(pageWidth);
		result.append(", spaceAfter: ");
		result.append(spaceAfter);
		result.append(", spaceBefore: ");
		result.append(spaceBefore);
		result.append(", startIndent: ");
		result.append(startIndent);
		result.append(", textAlign: ");
		if (textAlignESet) result.append(textAlign); else result.append("<unset>");
		result.append(", textAlignLast: ");
		if (textAlignLastESet) result.append(textAlignLast); else result.append("<unset>");
		result.append(", textIndent: ");
		result.append(textIndent);
		result.append(", textShadow: ");
		result.append(textShadow);
		result.append(", textTransform: ");
		if (textTransformESet) result.append(textTransform); else result.append("<unset>");
		result.append(", widows: ");
		result.append(widows);
		result.append(", width: ");
		result.append(width);
		result.append(", wrapOption: ");
		if (wrapOptionESet) result.append(wrapOption); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
