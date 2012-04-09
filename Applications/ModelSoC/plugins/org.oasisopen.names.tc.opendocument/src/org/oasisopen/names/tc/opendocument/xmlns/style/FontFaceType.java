/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;
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
 * A representation of the model object '<em><b>Font Face Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFaceSrc <em>Font Face Src</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getDefinitionSrc <em>Definition Src</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAccentHeight <em>Accent Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAlphabetic <em>Alphabetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAscent <em>Ascent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getBbox <em>Bbox</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getCapHeight <em>Cap Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getDescent <em>Descent</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontAdornments <em>Font Adornments</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontCharset <em>Font Charset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamilyGeneric <em>Font Family Generic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontPitch <em>Font Pitch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStretch <em>Font Stretch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getHanging <em>Hanging</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getIdeographic <em>Ideographic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getMathematical <em>Mathematical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getOverlinePosition <em>Overline Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getOverlineThickness <em>Overline Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getPanose1 <em>Panose1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getSlope <em>Slope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStemh <em>Stemh</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStemv <em>Stemv</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStrikethroughPosition <em>Strikethrough Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStrikethroughThickness <em>Strikethrough Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnderlinePosition <em>Underline Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnderlineThickness <em>Underline Thickness</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnicodeRange <em>Unicode Range</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnitsPerEm <em>Units Per Em</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVAlphabetic <em>VAlphabetic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVHanging <em>VHanging</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVIdeographic <em>VIdeographic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVMathematical <em>VMathematical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getWidths <em>Widths</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getXHeight <em>XHeight</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType()
 * @model extendedMetaData="name='font-face_._type' kind='elementOnly'"
 * @generated
 */
public interface FontFaceType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontFaceSrc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='font-face-src' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	FontFaceSrcType getFontFaceSrc();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFaceSrc <em>Font Face Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Face Src</em>' containment reference.
	 * @see #getFontFaceSrc()
	 * @generated
	 */
	void setFontFaceSrc(FontFaceSrcType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_DefinitionSrc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='definition-src' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	DefinitionSrcType getDefinitionSrc();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getDefinitionSrc <em>Definition Src</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Src</em>' containment reference.
	 * @see #getDefinitionSrc()
	 * @generated
	 */
	void setDefinitionSrc(DefinitionSrcType value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_AccentHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='accent-height' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getAccentHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAccentHeight <em>Accent Height</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Alphabetic()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='alphabetic' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getAlphabetic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAlphabetic <em>Alphabetic</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Ascent()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='ascent' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getAscent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getAscent <em>Ascent</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Bbox()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='bbox' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	Object getBbox();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getBbox <em>Bbox</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_CapHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='cap-height' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getCapHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getCapHeight <em>Cap Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap Height</em>' attribute.
	 * @see #getCapHeight()
	 * @generated
	 */
	void setCapHeight(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Descent()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='descent' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getDescent();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getDescent <em>Descent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descent</em>' attribute.
	 * @see #getDescent()
	 * @generated
	 */
	void setDescent(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Font Adornments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Adornments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Adornments</em>' attribute.
	 * @see #setFontAdornments(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontAdornments()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-adornments' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontAdornments();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontAdornments <em>Font Adornments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Adornments</em>' attribute.
	 * @see #getFontAdornments()
	 * @generated
	 */
	void setFontAdornments(String value);

	/**
	 * Returns the value of the '<em><b>Font Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Charset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Charset</em>' attribute.
	 * @see #setFontCharset(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontCharset()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.TextEncoding"
	 *        extendedMetaData="kind='attribute' name='font-charset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontCharset();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontCharset <em>Font Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Charset</em>' attribute.
	 * @see #getFontCharset()
	 * @generated
	 */
	void setFontCharset(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontFamily()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='font-family' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(String value);

	/**
	 * Returns the value of the '<em><b>Font Family Generic</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family Generic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family Generic</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric
	 * @see #isSetFontFamilyGeneric()
	 * @see #unsetFontFamilyGeneric()
	 * @see #setFontFamilyGeneric(FontFamilyGeneric)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontFamilyGeneric()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-family-generic' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFamilyGeneric getFontFamilyGeneric();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamilyGeneric <em>Font Family Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family Generic</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontFamilyGeneric
	 * @see #isSetFontFamilyGeneric()
	 * @see #unsetFontFamilyGeneric()
	 * @see #getFontFamilyGeneric()
	 * @generated
	 */
	void setFontFamilyGeneric(FontFamilyGeneric value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamilyGeneric <em>Font Family Generic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontFamilyGeneric()
	 * @see #getFontFamilyGeneric()
	 * @see #setFontFamilyGeneric(FontFamilyGeneric)
	 * @generated
	 */
	void unsetFontFamilyGeneric();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontFamilyGeneric <em>Font Family Generic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Family Generic</em>' attribute is set.
	 * @see #unsetFontFamilyGeneric()
	 * @see #getFontFamilyGeneric()
	 * @see #setFontFamilyGeneric(FontFamilyGeneric)
	 * @generated
	 */
	boolean isSetFontFamilyGeneric();

	/**
	 * Returns the value of the '<em><b>Font Pitch</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Pitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Pitch</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch
	 * @see #isSetFontPitch()
	 * @see #unsetFontPitch()
	 * @see #setFontPitch(FontPitch)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontPitch()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-pitch' namespace='##targetNamespace'"
	 * @generated
	 */
	FontPitch getFontPitch();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontPitch <em>Font Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Pitch</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.FontPitch
	 * @see #isSetFontPitch()
	 * @see #unsetFontPitch()
	 * @see #getFontPitch()
	 * @generated
	 */
	void setFontPitch(FontPitch value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontPitch <em>Font Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontPitch()
	 * @see #getFontPitch()
	 * @see #setFontPitch(FontPitch)
	 * @generated
	 */
	void unsetFontPitch();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontPitch <em>Font Pitch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Pitch</em>' attribute is set.
	 * @see #unsetFontPitch()
	 * @see #getFontPitch()
	 * @see #setFontPitch(FontPitch)
	 * @generated
	 */
	boolean isSetFontPitch();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontSize()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveLength"
	 *        extendedMetaData="kind='attribute' name='font-size' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	String getFontSize();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontSize <em>Font Size</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontStretch()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-stretch' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	FontStretchType getFontStretch();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStretch <em>Font Stretch</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStretch <em>Font Stretch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStretch()
	 * @see #getFontStretch()
	 * @see #setFontStretch(FontStretchType)
	 * @generated
	 */
	void unsetFontStretch();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStretch <em>Font Stretch</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-style' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	FontStyle getFontStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStyle <em>Font Style</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(FontStyle)
	 * @generated
	 */
	void unsetFontStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontStyle <em>Font Style</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontVariant()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-variant' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	FontVariant getFontVariant();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontVariant <em>Font Variant</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontVariant <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontVariant()
	 * @see #getFontVariant()
	 * @see #setFontVariant(FontVariant)
	 * @generated
	 */
	void unsetFontVariant();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontVariant <em>Font Variant</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_FontWeight()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='font-weight' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	FontWeight getFontWeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontWeight <em>Font Weight</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontWeight()
	 * @see #getFontWeight()
	 * @see #setFontWeight(FontWeight)
	 * @generated
	 */
	void unsetFontWeight();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getFontWeight <em>Font Weight</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Hanging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hanging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hanging</em>' attribute.
	 * @see #setHanging(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Hanging()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='hanging' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getHanging();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getHanging <em>Hanging</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Ideographic()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='ideographic' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getIdeographic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getIdeographic <em>Ideographic</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Mathematical()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='mathematical' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getMathematical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getMathematical <em>Mathematical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mathematical</em>' attribute.
	 * @see #getMathematical()
	 * @generated
	 */
	void setMathematical(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_OverlinePosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='overline-position' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getOverlinePosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getOverlinePosition <em>Overline Position</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_OverlineThickness()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='overline-thickness' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getOverlineThickness();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getOverlineThickness <em>Overline Thickness</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Panose1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='panose-1' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	Object getPanose1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getPanose1 <em>Panose1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panose1</em>' attribute.
	 * @see #getPanose1()
	 * @generated
	 */
	void setPanose1(Object value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Slope()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='slope' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getSlope();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope</em>' attribute.
	 * @see #getSlope()
	 * @generated
	 */
	void setSlope(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Stemh()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='stemh' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getStemh();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStemh <em>Stemh</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Stemv()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='stemv' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getStemv();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStemv <em>Stemv</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_StrikethroughPosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='strikethrough-position' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getStrikethroughPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStrikethroughPosition <em>Strikethrough Position</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_StrikethroughThickness()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='strikethrough-thickness' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getStrikethroughThickness();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getStrikethroughThickness <em>Strikethrough Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strikethrough Thickness</em>' attribute.
	 * @see #getStrikethroughThickness()
	 * @generated
	 */
	void setStrikethroughThickness(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_UnderlinePosition()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='underline-position' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getUnderlinePosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnderlinePosition <em>Underline Position</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_UnderlineThickness()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='underline-thickness' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getUnderlineThickness();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnderlineThickness <em>Underline Thickness</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_UnicodeRange()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='unicode-range' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	Object getUnicodeRange();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnicodeRange <em>Unicode Range</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_UnitsPerEm()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='units-per-em' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getUnitsPerEm();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getUnitsPerEm <em>Units Per Em</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_VAlphabetic()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='v-alphabetic' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getVAlphabetic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVAlphabetic <em>VAlphabetic</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_VHanging()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='v-hanging' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getVHanging();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVHanging <em>VHanging</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_VIdeographic()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='v-ideographic' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getVIdeographic();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVIdeographic <em>VIdeographic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VIdeographic</em>' attribute.
	 * @see #getVIdeographic()
	 * @generated
	 */
	void setVIdeographic(BigInteger value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_VMathematical()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='v-mathematical' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getVMathematical();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getVMathematical <em>VMathematical</em>}' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_Widths()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='widths' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	Object getWidths();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getWidths <em>Widths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widths</em>' attribute.
	 * @see #getWidths()
	 * @generated
	 */
	void setWidths(Object value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage#getFontFaceType_XHeight()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Integer"
	 *        extendedMetaData="kind='attribute' name='x-height' namespace='urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0'"
	 * @generated
	 */
	BigInteger getXHeight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType#getXHeight <em>XHeight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XHeight</em>' attribute.
	 * @see #getXHeight()
	 * @generated
	 */
	void setXHeight(BigInteger value);

} // FontFaceType
