/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.fo;

import java.math.BigInteger;

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
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorder <em>Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderBottom <em>Border Bottom</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderLeft <em>Border Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderRight <em>Border Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderTop <em>Border Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakAfter <em>Break After</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakBefore <em>Break Before</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getClip <em>Clip</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColor <em>Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColumnCount <em>Column Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColumnGap <em>Column Gap</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getEndIndent <em>End Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenate <em>Hyphenate</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationKeep <em>Hyphenation Keep</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationLadderCount <em>Hyphenation Ladder Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationPushCharCount <em>Hyphenation Push Char Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationRemainCharCount <em>Hyphenation Remain Char Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepTogether <em>Keep Together</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepWithNext <em>Keep With Next</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLetterSpacing <em>Letter Spacing</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getOrphans <em>Orphans</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingBottom <em>Padding Bottom</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingLeft <em>Padding Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingRight <em>Padding Right</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingTop <em>Padding Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPageHeight <em>Page Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getSpaceAfter <em>Space After</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getSpaceBefore <em>Space Before</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getStartIndent <em>Start Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlignLast <em>Text Align Last</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextShadow <em>Text Shadow</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextTransform <em>Text Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWidows <em>Widows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWrapOption <em>Wrap Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Mixed()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #setBackgroundColor(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_BackgroundColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorType"
	 *        extendedMetaData="kind='attribute' name='background-color' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Object value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Border()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='border' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBorder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(String value);

	/**
	 * Returns the value of the '<em><b>Border Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Bottom</em>' attribute.
	 * @see #setBorderBottom(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_BorderBottom()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='border-bottom' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBorderBottom();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderBottom <em>Border Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Bottom</em>' attribute.
	 * @see #getBorderBottom()
	 * @generated
	 */
	void setBorderBottom(String value);

	/**
	 * Returns the value of the '<em><b>Border Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Left</em>' attribute.
	 * @see #setBorderLeft(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_BorderLeft()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='border-left' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBorderLeft();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderLeft <em>Border Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Left</em>' attribute.
	 * @see #getBorderLeft()
	 * @generated
	 */
	void setBorderLeft(String value);

	/**
	 * Returns the value of the '<em><b>Border Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Right</em>' attribute.
	 * @see #setBorderRight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_BorderRight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='border-right' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBorderRight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderRight <em>Border Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Right</em>' attribute.
	 * @see #getBorderRight()
	 * @generated
	 */
	void setBorderRight(String value);

	/**
	 * Returns the value of the '<em><b>Border Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Top</em>' attribute.
	 * @see #setBorderTop(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_BorderTop()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='border-top' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBorderTop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBorderTop <em>Border Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Top</em>' attribute.
	 * @see #getBorderTop()
	 * @generated
	 */
	void setBorderTop(String value);

	/**
	 * Returns the value of the '<em><b>Break After</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break After</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType
	 * @see #isSetBreakAfter()
	 * @see #unsetBreakAfter()
	 * @see #setBreakAfter(BreakAfterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_BreakAfter()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='break-after' namespace='##targetNamespace'"
	 * @generated
	 */
	BreakAfterType getBreakAfter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakAfter <em>Break After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break After</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType
	 * @see #isSetBreakAfter()
	 * @see #unsetBreakAfter()
	 * @see #getBreakAfter()
	 * @generated
	 */
	void setBreakAfter(BreakAfterType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakAfter <em>Break After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBreakAfter()
	 * @see #getBreakAfter()
	 * @see #setBreakAfter(BreakAfterType)
	 * @generated
	 */
	void unsetBreakAfter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakAfter <em>Break After</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Break After</em>' attribute is set.
	 * @see #unsetBreakAfter()
	 * @see #getBreakAfter()
	 * @see #setBreakAfter(BreakAfterType)
	 * @generated
	 */
	boolean isSetBreakAfter();

	/**
	 * Returns the value of the '<em><b>Break Before</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Before</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType
	 * @see #isSetBreakBefore()
	 * @see #unsetBreakBefore()
	 * @see #setBreakBefore(BreakBeforeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_BreakBefore()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='break-before' namespace='##targetNamespace'"
	 * @generated
	 */
	BreakBeforeType getBreakBefore();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakBefore <em>Break Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Before</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType
	 * @see #isSetBreakBefore()
	 * @see #unsetBreakBefore()
	 * @see #getBreakBefore()
	 * @generated
	 */
	void setBreakBefore(BreakBeforeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakBefore <em>Break Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBreakBefore()
	 * @see #getBreakBefore()
	 * @see #setBreakBefore(BreakBeforeType)
	 * @generated
	 */
	void unsetBreakBefore();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getBreakBefore <em>Break Before</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Break Before</em>' attribute is set.
	 * @see #unsetBreakBefore()
	 * @see #getBreakBefore()
	 * @see #setBreakBefore(BreakBeforeType)
	 * @generated
	 */
	boolean isSetBreakBefore();

	/**
	 * Returns the value of the '<em><b>Clip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip</em>' attribute.
	 * @see #setClip(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Clip()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='clip' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClip();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getClip <em>Clip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip</em>' attribute.
	 * @see #getClip()
	 * @generated
	 */
	void setClip(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Color()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Count</em>' attribute.
	 * @see #setColumnCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_ColumnCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='column-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getColumnCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColumnCount <em>Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Count</em>' attribute.
	 * @see #getColumnCount()
	 * @generated
	 */
	void setColumnCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Column Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Gap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Gap</em>' attribute.
	 * @see #setColumnGap(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_ColumnGap()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='column-gap' namespace='##targetNamespace'"
	 * @generated
	 */
	String getColumnGap();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getColumnGap <em>Column Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Gap</em>' attribute.
	 * @see #getColumnGap()
	 * @generated
	 */
	void setColumnGap(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Country()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CountryCode"
	 *        extendedMetaData="kind='attribute' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>End Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Indent</em>' attribute.
	 * @see #setEndIndent(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_EndIndent()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='end-indent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEndIndent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getEndIndent <em>End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Indent</em>' attribute.
	 * @see #getEndIndent()
	 * @generated
	 */
	void setEndIndent(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_FontFamily()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-family' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontFamily <em>Font Family</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_FontSize()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.FontSizeType"
	 *        extendedMetaData="kind='attribute' name='font-size' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_FontStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-style' namespace='##targetNamespace'"
	 * @generated
	 */
	FontStyle getFontStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontStyle <em>Font Style</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(FontStyle)
	 * @generated
	 */
	void unsetFontStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontStyle <em>Font Style</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_FontVariant()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-variant' namespace='##targetNamespace'"
	 * @generated
	 */
	FontVariant getFontVariant();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontVariant <em>Font Variant</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontVariant <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontVariant()
	 * @see #getFontVariant()
	 * @see #setFontVariant(FontVariant)
	 * @generated
	 */
	void unsetFontVariant();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontVariant <em>Font Variant</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_FontWeight()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-weight' namespace='##targetNamespace'"
	 * @generated
	 */
	FontWeight getFontWeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontWeight <em>Font Weight</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontWeight()
	 * @see #getFontWeight()
	 * @see #setFontWeight(FontWeight)
	 * @generated
	 */
	void unsetFontWeight();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getFontWeight <em>Font Weight</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Height()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveLength"
	 *        extendedMetaData="kind='attribute' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Hyphenate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyphenate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyphenate</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHyphenate()
	 * @see #unsetHyphenate()
	 * @see #setHyphenate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Hyphenate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='hyphenate' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHyphenate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenate <em>Hyphenate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyphenate</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetHyphenate()
	 * @see #unsetHyphenate()
	 * @see #getHyphenate()
	 * @generated
	 */
	void setHyphenate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenate <em>Hyphenate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHyphenate()
	 * @see #getHyphenate()
	 * @see #setHyphenate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetHyphenate();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenate <em>Hyphenate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hyphenate</em>' attribute is set.
	 * @see #unsetHyphenate()
	 * @see #getHyphenate()
	 * @see #setHyphenate(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetHyphenate();

	/**
	 * Returns the value of the '<em><b>Hyphenation Keep</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyphenation Keep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyphenation Keep</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType
	 * @see #isSetHyphenationKeep()
	 * @see #unsetHyphenationKeep()
	 * @see #setHyphenationKeep(HyphenationKeepType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_HyphenationKeep()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='hyphenation-keep' namespace='##targetNamespace'"
	 * @generated
	 */
	HyphenationKeepType getHyphenationKeep();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationKeep <em>Hyphenation Keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyphenation Keep</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType
	 * @see #isSetHyphenationKeep()
	 * @see #unsetHyphenationKeep()
	 * @see #getHyphenationKeep()
	 * @generated
	 */
	void setHyphenationKeep(HyphenationKeepType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationKeep <em>Hyphenation Keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHyphenationKeep()
	 * @see #getHyphenationKeep()
	 * @see #setHyphenationKeep(HyphenationKeepType)
	 * @generated
	 */
	void unsetHyphenationKeep();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationKeep <em>Hyphenation Keep</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hyphenation Keep</em>' attribute is set.
	 * @see #unsetHyphenationKeep()
	 * @see #getHyphenationKeep()
	 * @see #setHyphenationKeep(HyphenationKeepType)
	 * @generated
	 */
	boolean isSetHyphenationKeep();

	/**
	 * Returns the value of the '<em><b>Hyphenation Ladder Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyphenation Ladder Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyphenation Ladder Count</em>' attribute.
	 * @see #setHyphenationLadderCount(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_HyphenationLadderCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountType"
	 *        extendedMetaData="kind='attribute' name='hyphenation-ladder-count' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getHyphenationLadderCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationLadderCount <em>Hyphenation Ladder Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyphenation Ladder Count</em>' attribute.
	 * @see #getHyphenationLadderCount()
	 * @generated
	 */
	void setHyphenationLadderCount(Object value);

	/**
	 * Returns the value of the '<em><b>Hyphenation Push Char Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyphenation Push Char Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyphenation Push Char Count</em>' attribute.
	 * @see #setHyphenationPushCharCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_HyphenationPushCharCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='hyphenation-push-char-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getHyphenationPushCharCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationPushCharCount <em>Hyphenation Push Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyphenation Push Char Count</em>' attribute.
	 * @see #getHyphenationPushCharCount()
	 * @generated
	 */
	void setHyphenationPushCharCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Hyphenation Remain Char Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyphenation Remain Char Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyphenation Remain Char Count</em>' attribute.
	 * @see #setHyphenationRemainCharCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_HyphenationRemainCharCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='hyphenation-remain-char-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getHyphenationRemainCharCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getHyphenationRemainCharCount <em>Hyphenation Remain Char Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyphenation Remain Char Count</em>' attribute.
	 * @see #getHyphenationRemainCharCount()
	 * @generated
	 */
	void setHyphenationRemainCharCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Keep Together</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Together</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Together</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType
	 * @see #isSetKeepTogether()
	 * @see #unsetKeepTogether()
	 * @see #setKeepTogether(KeepTogetherType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_KeepTogether()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='keep-together' namespace='##targetNamespace'"
	 * @generated
	 */
	KeepTogetherType getKeepTogether();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepTogether <em>Keep Together</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Together</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType
	 * @see #isSetKeepTogether()
	 * @see #unsetKeepTogether()
	 * @see #getKeepTogether()
	 * @generated
	 */
	void setKeepTogether(KeepTogetherType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepTogether <em>Keep Together</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeepTogether()
	 * @see #getKeepTogether()
	 * @see #setKeepTogether(KeepTogetherType)
	 * @generated
	 */
	void unsetKeepTogether();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepTogether <em>Keep Together</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keep Together</em>' attribute is set.
	 * @see #unsetKeepTogether()
	 * @see #getKeepTogether()
	 * @see #setKeepTogether(KeepTogetherType)
	 * @generated
	 */
	boolean isSetKeepTogether();

	/**
	 * Returns the value of the '<em><b>Keep With Next</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep With Next</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep With Next</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType
	 * @see #isSetKeepWithNext()
	 * @see #unsetKeepWithNext()
	 * @see #setKeepWithNext(KeepWithNextType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_KeepWithNext()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='keep-with-next' namespace='##targetNamespace'"
	 * @generated
	 */
	KeepWithNextType getKeepWithNext();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepWithNext <em>Keep With Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep With Next</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType
	 * @see #isSetKeepWithNext()
	 * @see #unsetKeepWithNext()
	 * @see #getKeepWithNext()
	 * @generated
	 */
	void setKeepWithNext(KeepWithNextType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepWithNext <em>Keep With Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeepWithNext()
	 * @see #getKeepWithNext()
	 * @see #setKeepWithNext(KeepWithNextType)
	 * @generated
	 */
	void unsetKeepWithNext();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getKeepWithNext <em>Keep With Next</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Keep With Next</em>' attribute is set.
	 * @see #unsetKeepWithNext()
	 * @see #getKeepWithNext()
	 * @see #setKeepWithNext(KeepWithNextType)
	 * @generated
	 */
	boolean isSetKeepWithNext();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Language()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Letter Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Letter Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter Spacing</em>' attribute.
	 * @see #setLetterSpacing(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_LetterSpacing()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingType"
	 *        extendedMetaData="kind='attribute' name='letter-spacing' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLetterSpacing();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLetterSpacing <em>Letter Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter Spacing</em>' attribute.
	 * @see #getLetterSpacing()
	 * @generated
	 */
	void setLetterSpacing(Object value);

	/**
	 * Returns the value of the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Height</em>' attribute.
	 * @see #setLineHeight(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_LineHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightType"
	 *        extendedMetaData="kind='attribute' name='line-height' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getLineHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getLineHeight <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Height</em>' attribute.
	 * @see #getLineHeight()
	 * @generated
	 */
	void setLineHeight(Object value);

	/**
	 * Returns the value of the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' attribute.
	 * @see #setMargin(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Margin()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.MarginType"
	 *        extendedMetaData="kind='attribute' name='margin' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMargin();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMargin <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' attribute.
	 * @see #getMargin()
	 * @generated
	 */
	void setMargin(String value);

	/**
	 * Returns the value of the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Bottom</em>' attribute.
	 * @see #setMarginBottom(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_MarginBottom()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.MarginBottomType"
	 *        extendedMetaData="kind='attribute' name='margin-bottom' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMarginBottom();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginBottom <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Bottom</em>' attribute.
	 * @see #getMarginBottom()
	 * @generated
	 */
	void setMarginBottom(String value);

	/**
	 * Returns the value of the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Left</em>' attribute.
	 * @see #setMarginLeft(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_MarginLeft()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.MarginLeftType"
	 *        extendedMetaData="kind='attribute' name='margin-left' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMarginLeft();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginLeft <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Left</em>' attribute.
	 * @see #getMarginLeft()
	 * @generated
	 */
	void setMarginLeft(String value);

	/**
	 * Returns the value of the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Right</em>' attribute.
	 * @see #setMarginRight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_MarginRight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.MarginRightType"
	 *        extendedMetaData="kind='attribute' name='margin-right' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMarginRight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginRight <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Right</em>' attribute.
	 * @see #getMarginRight()
	 * @generated
	 */
	void setMarginRight(String value);

	/**
	 * Returns the value of the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Top</em>' attribute.
	 * @see #setMarginTop(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_MarginTop()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.MarginTopType"
	 *        extendedMetaData="kind='attribute' name='margin-top' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMarginTop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMarginTop <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Top</em>' attribute.
	 * @see #getMarginTop()
	 * @generated
	 */
	void setMarginTop(String value);

	/**
	 * Returns the value of the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Height</em>' attribute.
	 * @see #setMaxHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_MaxHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.MaxHeightType"
	 *        extendedMetaData="kind='attribute' name='max-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Height</em>' attribute.
	 * @see #getMaxHeight()
	 * @generated
	 */
	void setMaxHeight(String value);

	/**
	 * Returns the value of the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Width</em>' attribute.
	 * @see #setMaxWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_MaxWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.MaxWidthType"
	 *        extendedMetaData="kind='attribute' name='max-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMaxWidth <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Width</em>' attribute.
	 * @see #getMaxWidth()
	 * @generated
	 */
	void setMaxWidth(String value);

	/**
	 * Returns the value of the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Width</em>' attribute.
	 * @see #setMinWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_MinWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.MinWidthType"
	 *        extendedMetaData="kind='attribute' name='min-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getMinWidth <em>Min Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Width</em>' attribute.
	 * @see #getMinWidth()
	 * @generated
	 */
	void setMinWidth(String value);

	/**
	 * Returns the value of the '<em><b>Orphans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orphans</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphans</em>' attribute.
	 * @see #setOrphans(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Orphans()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='orphans' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOrphans();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getOrphans <em>Orphans</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orphans</em>' attribute.
	 * @see #getOrphans()
	 * @generated
	 */
	void setOrphans(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' attribute.
	 * @see #setPadding(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Padding()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='padding' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPadding();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' attribute.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(String value);

	/**
	 * Returns the value of the '<em><b>Padding Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Bottom</em>' attribute.
	 * @see #setPaddingBottom(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_PaddingBottom()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='padding-bottom' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPaddingBottom();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingBottom <em>Padding Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Bottom</em>' attribute.
	 * @see #getPaddingBottom()
	 * @generated
	 */
	void setPaddingBottom(String value);

	/**
	 * Returns the value of the '<em><b>Padding Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Left</em>' attribute.
	 * @see #setPaddingLeft(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_PaddingLeft()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='padding-left' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPaddingLeft();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingLeft <em>Padding Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Left</em>' attribute.
	 * @see #getPaddingLeft()
	 * @generated
	 */
	void setPaddingLeft(String value);

	/**
	 * Returns the value of the '<em><b>Padding Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Right</em>' attribute.
	 * @see #setPaddingRight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_PaddingRight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='padding-right' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPaddingRight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingRight <em>Padding Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Right</em>' attribute.
	 * @see #getPaddingRight()
	 * @generated
	 */
	void setPaddingRight(String value);

	/**
	 * Returns the value of the '<em><b>Padding Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Top</em>' attribute.
	 * @see #setPaddingTop(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_PaddingTop()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='padding-top' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPaddingTop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPaddingTop <em>Padding Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Top</em>' attribute.
	 * @see #getPaddingTop()
	 * @generated
	 */
	void setPaddingTop(String value);

	/**
	 * Returns the value of the '<em><b>Page Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Height</em>' attribute.
	 * @see #setPageHeight(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_PageHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='page-height' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPageHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPageHeight <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Height</em>' attribute.
	 * @see #getPageHeight()
	 * @generated
	 */
	void setPageHeight(String value);

	/**
	 * Returns the value of the '<em><b>Page Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Width</em>' attribute.
	 * @see #setPageWidth(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_PageWidth()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='page-width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPageWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getPageWidth <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Width</em>' attribute.
	 * @see #getPageWidth()
	 * @generated
	 */
	void setPageWidth(String value);

	/**
	 * Returns the value of the '<em><b>Space After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space After</em>' attribute.
	 * @see #setSpaceAfter(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_SpaceAfter()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='space-after' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpaceAfter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getSpaceAfter <em>Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space After</em>' attribute.
	 * @see #getSpaceAfter()
	 * @generated
	 */
	void setSpaceAfter(String value);

	/**
	 * Returns the value of the '<em><b>Space Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Before</em>' attribute.
	 * @see #setSpaceBefore(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_SpaceBefore()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='space-before' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpaceBefore();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getSpaceBefore <em>Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Before</em>' attribute.
	 * @see #getSpaceBefore()
	 * @generated
	 */
	void setSpaceBefore(String value);

	/**
	 * Returns the value of the '<em><b>Start Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Indent</em>' attribute.
	 * @see #setStartIndent(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_StartIndent()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Length"
	 *        extendedMetaData="kind='attribute' name='start-indent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartIndent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getStartIndent <em>Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Indent</em>' attribute.
	 * @see #getStartIndent()
	 * @generated
	 */
	void setStartIndent(String value);

	/**
	 * Returns the value of the '<em><b>Text Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType
	 * @see #isSetTextAlign()
	 * @see #unsetTextAlign()
	 * @see #setTextAlign(TextAlignType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_TextAlign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-align' namespace='##targetNamespace'"
	 * @generated
	 */
	TextAlignType getTextAlign();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlign <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType
	 * @see #isSetTextAlign()
	 * @see #unsetTextAlign()
	 * @see #getTextAlign()
	 * @generated
	 */
	void setTextAlign(TextAlignType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlign <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextAlign()
	 * @see #getTextAlign()
	 * @see #setTextAlign(TextAlignType)
	 * @generated
	 */
	void unsetTextAlign();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlign <em>Text Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Align</em>' attribute is set.
	 * @see #unsetTextAlign()
	 * @see #getTextAlign()
	 * @see #setTextAlign(TextAlignType)
	 * @generated
	 */
	boolean isSetTextAlign();

	/**
	 * Returns the value of the '<em><b>Text Align Last</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align Last</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType
	 * @see #isSetTextAlignLast()
	 * @see #unsetTextAlignLast()
	 * @see #setTextAlignLast(TextAlignLastType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_TextAlignLast()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-align-last' namespace='##targetNamespace'"
	 * @generated
	 */
	TextAlignLastType getTextAlignLast();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlignLast <em>Text Align Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align Last</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType
	 * @see #isSetTextAlignLast()
	 * @see #unsetTextAlignLast()
	 * @see #getTextAlignLast()
	 * @generated
	 */
	void setTextAlignLast(TextAlignLastType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlignLast <em>Text Align Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextAlignLast()
	 * @see #getTextAlignLast()
	 * @see #setTextAlignLast(TextAlignLastType)
	 * @generated
	 */
	void unsetTextAlignLast();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextAlignLast <em>Text Align Last</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Align Last</em>' attribute is set.
	 * @see #unsetTextAlignLast()
	 * @see #getTextAlignLast()
	 * @see #setTextAlignLast(TextAlignLastType)
	 * @generated
	 */
	boolean isSetTextAlignLast();

	/**
	 * Returns the value of the '<em><b>Text Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Indent</em>' attribute.
	 * @see #setTextIndent(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_TextIndent()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.fo.TextIndentType"
	 *        extendedMetaData="kind='attribute' name='text-indent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextIndent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextIndent <em>Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Indent</em>' attribute.
	 * @see #getTextIndent()
	 * @generated
	 */
	void setTextIndent(String value);

	/**
	 * Returns the value of the '<em><b>Text Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Shadow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Shadow</em>' attribute.
	 * @see #setTextShadow(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_TextShadow()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.ShadowType"
	 *        extendedMetaData="kind='attribute' name='text-shadow' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getTextShadow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextShadow <em>Text Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Shadow</em>' attribute.
	 * @see #getTextShadow()
	 * @generated
	 */
	void setTextShadow(Object value);

	/**
	 * Returns the value of the '<em><b>Text Transform</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Transform</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType
	 * @see #isSetTextTransform()
	 * @see #unsetTextTransform()
	 * @see #setTextTransform(TextTransformType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_TextTransform()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='text-transform' namespace='##targetNamespace'"
	 * @generated
	 */
	TextTransformType getTextTransform();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextTransform <em>Text Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Transform</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType
	 * @see #isSetTextTransform()
	 * @see #unsetTextTransform()
	 * @see #getTextTransform()
	 * @generated
	 */
	void setTextTransform(TextTransformType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextTransform <em>Text Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextTransform()
	 * @see #getTextTransform()
	 * @see #setTextTransform(TextTransformType)
	 * @generated
	 */
	void unsetTextTransform();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getTextTransform <em>Text Transform</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Transform</em>' attribute is set.
	 * @see #unsetTextTransform()
	 * @see #getTextTransform()
	 * @see #setTextTransform(TextTransformType)
	 * @generated
	 */
	boolean isSetTextTransform();

	/**
	 * Returns the value of the '<em><b>Widows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widows</em>' attribute.
	 * @see #setWidows(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Widows()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='widows' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWidows();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWidows <em>Widows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widows</em>' attribute.
	 * @see #getWidows()
	 * @generated
	 */
	void setWidows(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_Width()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveLength"
	 *        extendedMetaData="kind='attribute' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Wrap Option</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrap Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap Option</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType
	 * @see #isSetWrapOption()
	 * @see #unsetWrapOption()
	 * @see #setWrapOption(WrapOptionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#getDocumentRoot_WrapOption()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='wrap-option' namespace='##targetNamespace'"
	 * @generated
	 */
	WrapOptionType getWrapOption();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWrapOption <em>Wrap Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap Option</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType
	 * @see #isSetWrapOption()
	 * @see #unsetWrapOption()
	 * @see #getWrapOption()
	 * @generated
	 */
	void setWrapOption(WrapOptionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWrapOption <em>Wrap Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrapOption()
	 * @see #getWrapOption()
	 * @see #setWrapOption(WrapOptionType)
	 * @generated
	 */
	void unsetWrapOption();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot#getWrapOption <em>Wrap Option</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrap Option</em>' attribute is set.
	 * @see #unsetWrapOption()
	 * @see #getWrapOption()
	 * @see #setWrapOption(WrapOptionType)
	 * @generated
	 */
	boolean isSetWrapOption();

} // DocumentRoot
