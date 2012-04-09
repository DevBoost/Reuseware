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
package org.oasisopen.names.tc.opendocument.xmlns.meta;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Statistic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getCellCount <em>Cell Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getDrawCount <em>Draw Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getFrameCount <em>Frame Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getNonWhitespaceCharacterCount <em>Non Whitespace Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getOleObjectCount <em>Ole Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getSentenceCount <em>Sentence Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getSyllableCount <em>Syllable Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getWordCount <em>Word Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType()
 * @model extendedMetaData="name='document-statistic_._type' kind='empty'"
 * @generated
 */
public interface DocumentStatisticType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Count</em>' attribute.
	 * @see #setCellCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_CellCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='cell-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCellCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getCellCount <em>Cell Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Count</em>' attribute.
	 * @see #getCellCount()
	 * @generated
	 */
	void setCellCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Character Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Count</em>' attribute.
	 * @see #setCharacterCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_CharacterCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='character-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCharacterCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getCharacterCount <em>Character Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Count</em>' attribute.
	 * @see #getCharacterCount()
	 * @generated
	 */
	void setCharacterCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Draw Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Draw Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draw Count</em>' attribute.
	 * @see #setDrawCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_DrawCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='draw-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDrawCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getDrawCount <em>Draw Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draw Count</em>' attribute.
	 * @see #getDrawCount()
	 * @generated
	 */
	void setDrawCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Frame Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Count</em>' attribute.
	 * @see #setFrameCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_FrameCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='frame-count'"
	 * @generated
	 */
	BigInteger getFrameCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getFrameCount <em>Frame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Count</em>' attribute.
	 * @see #getFrameCount()
	 * @generated
	 */
	void setFrameCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Image Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Count</em>' attribute.
	 * @see #setImageCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_ImageCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='image-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getImageCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getImageCount <em>Image Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Count</em>' attribute.
	 * @see #getImageCount()
	 * @generated
	 */
	void setImageCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Non Whitespace Character Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Whitespace Character Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Whitespace Character Count</em>' attribute.
	 * @see #setNonWhitespaceCharacterCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_NonWhitespaceCharacterCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='non-whitespace-character-count'"
	 * @generated
	 */
	BigInteger getNonWhitespaceCharacterCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getNonWhitespaceCharacterCount <em>Non Whitespace Character Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Whitespace Character Count</em>' attribute.
	 * @see #getNonWhitespaceCharacterCount()
	 * @generated
	 */
	void setNonWhitespaceCharacterCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Object Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Count</em>' attribute.
	 * @see #setObjectCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_ObjectCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='object-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getObjectCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getObjectCount <em>Object Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Count</em>' attribute.
	 * @see #getObjectCount()
	 * @generated
	 */
	void setObjectCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Ole Object Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ole Object Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ole Object Count</em>' attribute.
	 * @see #setOleObjectCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_OleObjectCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='ole-object-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOleObjectCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getOleObjectCount <em>Ole Object Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ole Object Count</em>' attribute.
	 * @see #getOleObjectCount()
	 * @generated
	 */
	void setOleObjectCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Page Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Count</em>' attribute.
	 * @see #setPageCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_PageCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='page-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getPageCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getPageCount <em>Page Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Count</em>' attribute.
	 * @see #getPageCount()
	 * @generated
	 */
	void setPageCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Paragraph Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Count</em>' attribute.
	 * @see #setParagraphCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_ParagraphCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='paragraph-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getParagraphCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getParagraphCount <em>Paragraph Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Count</em>' attribute.
	 * @see #getParagraphCount()
	 * @generated
	 */
	void setParagraphCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Row Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Count</em>' attribute.
	 * @see #setRowCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_RowCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='row-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRowCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getRowCount <em>Row Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Count</em>' attribute.
	 * @see #getRowCount()
	 * @generated
	 */
	void setRowCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Sentence Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentence Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentence Count</em>' attribute.
	 * @see #setSentenceCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_SentenceCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='sentence-count'"
	 * @generated
	 */
	BigInteger getSentenceCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getSentenceCount <em>Sentence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentence Count</em>' attribute.
	 * @see #getSentenceCount()
	 * @generated
	 */
	void setSentenceCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Syllable Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syllable Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syllable Count</em>' attribute.
	 * @see #setSyllableCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_SyllableCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='syllable-count'"
	 * @generated
	 */
	BigInteger getSyllableCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getSyllableCount <em>Syllable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syllable Count</em>' attribute.
	 * @see #getSyllableCount()
	 * @generated
	 */
	void setSyllableCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Table Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Count</em>' attribute.
	 * @see #setTableCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_TableCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='table-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getTableCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getTableCount <em>Table Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Count</em>' attribute.
	 * @see #getTableCount()
	 * @generated
	 */
	void setTableCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Word Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Count</em>' attribute.
	 * @see #setWordCount(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#getDocumentStatisticType_WordCount()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='word-count' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWordCount();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType#getWordCount <em>Word Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Count</em>' attribute.
	 * @see #getWordCount()
	 * @generated
	 */
	void setWordCount(BigInteger value);

} // DocumentStatisticType
