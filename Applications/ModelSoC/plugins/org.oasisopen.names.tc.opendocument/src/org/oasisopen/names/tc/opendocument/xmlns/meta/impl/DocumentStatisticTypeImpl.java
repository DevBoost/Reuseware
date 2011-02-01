/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.meta.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Statistic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getCellCount <em>Cell Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getCharacterCount <em>Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getDrawCount <em>Draw Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getFrameCount <em>Frame Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getNonWhitespaceCharacterCount <em>Non Whitespace Character Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getObjectCount <em>Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getOleObjectCount <em>Ole Object Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getPageCount <em>Page Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getParagraphCount <em>Paragraph Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getRowCount <em>Row Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getSentenceCount <em>Sentence Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getSyllableCount <em>Syllable Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getTableCount <em>Table Count</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentStatisticTypeImpl#getWordCount <em>Word Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentStatisticTypeImpl extends EObjectImpl implements DocumentStatisticType {
	/**
	 * The default value of the '{@link #getCellCount() <em>Cell Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CELL_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellCount() <em>Cell Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cellCount = CELL_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacterCount() <em>Character Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CHARACTER_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacterCount() <em>Character Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger characterCount = CHARACTER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrawCount() <em>Draw Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DRAW_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDrawCount() <em>Draw Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger drawCount = DRAW_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameCount() <em>Frame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FRAME_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameCount() <em>Frame Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger frameCount = FRAME_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageCount() <em>Image Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IMAGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageCount() <em>Image Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger imageCount = IMAGE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonWhitespaceCharacterCount() <em>Non Whitespace Character Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonWhitespaceCharacterCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NON_WHITESPACE_CHARACTER_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonWhitespaceCharacterCount() <em>Non Whitespace Character Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonWhitespaceCharacterCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger nonWhitespaceCharacterCount = NON_WHITESPACE_CHARACTER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectCount() <em>Object Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OBJECT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectCount() <em>Object Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger objectCount = OBJECT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOleObjectCount() <em>Ole Object Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOleObjectCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OLE_OBJECT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOleObjectCount() <em>Ole Object Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOleObjectCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger oleObjectCount = OLE_OBJECT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageCount() <em>Page Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PAGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageCount() <em>Page Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger pageCount = PAGE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getParagraphCount() <em>Paragraph Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PARAGRAPH_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParagraphCount() <em>Paragraph Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger paragraphCount = PARAGRAPH_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowCount() <em>Row Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROW_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowCount() <em>Row Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rowCount = ROW_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSentenceCount() <em>Sentence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentenceCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SENTENCE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSentenceCount() <em>Sentence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentenceCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sentenceCount = SENTENCE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyllableCount() <em>Syllable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyllableCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SYLLABLE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyllableCount() <em>Syllable Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyllableCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger syllableCount = SYLLABLE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableCount() <em>Table Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TABLE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableCount() <em>Table Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger tableCount = TABLE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordCount() <em>Word Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WORD_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWordCount() <em>Word Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger wordCount = WORD_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentStatisticTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.DOCUMENT_STATISTIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCellCount() {
		return cellCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellCount(BigInteger newCellCount) {
		BigInteger oldCellCount = cellCount;
		cellCount = newCellCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__CELL_COUNT, oldCellCount, cellCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCharacterCount() {
		return characterCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterCount(BigInteger newCharacterCount) {
		BigInteger oldCharacterCount = characterCount;
		characterCount = newCharacterCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__CHARACTER_COUNT, oldCharacterCount, characterCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDrawCount() {
		return drawCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawCount(BigInteger newDrawCount) {
		BigInteger oldDrawCount = drawCount;
		drawCount = newDrawCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__DRAW_COUNT, oldDrawCount, drawCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFrameCount() {
		return frameCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameCount(BigInteger newFrameCount) {
		BigInteger oldFrameCount = frameCount;
		frameCount = newFrameCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__FRAME_COUNT, oldFrameCount, frameCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getImageCount() {
		return imageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageCount(BigInteger newImageCount) {
		BigInteger oldImageCount = imageCount;
		imageCount = newImageCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__IMAGE_COUNT, oldImageCount, imageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNonWhitespaceCharacterCount() {
		return nonWhitespaceCharacterCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonWhitespaceCharacterCount(BigInteger newNonWhitespaceCharacterCount) {
		BigInteger oldNonWhitespaceCharacterCount = nonWhitespaceCharacterCount;
		nonWhitespaceCharacterCount = newNonWhitespaceCharacterCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__NON_WHITESPACE_CHARACTER_COUNT, oldNonWhitespaceCharacterCount, nonWhitespaceCharacterCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getObjectCount() {
		return objectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectCount(BigInteger newObjectCount) {
		BigInteger oldObjectCount = objectCount;
		objectCount = newObjectCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__OBJECT_COUNT, oldObjectCount, objectCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOleObjectCount() {
		return oleObjectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOleObjectCount(BigInteger newOleObjectCount) {
		BigInteger oldOleObjectCount = oleObjectCount;
		oleObjectCount = newOleObjectCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__OLE_OBJECT_COUNT, oldOleObjectCount, oleObjectCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPageCount() {
		return pageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageCount(BigInteger newPageCount) {
		BigInteger oldPageCount = pageCount;
		pageCount = newPageCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__PAGE_COUNT, oldPageCount, pageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getParagraphCount() {
		return paragraphCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphCount(BigInteger newParagraphCount) {
		BigInteger oldParagraphCount = paragraphCount;
		paragraphCount = newParagraphCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__PARAGRAPH_COUNT, oldParagraphCount, paragraphCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRowCount() {
		return rowCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowCount(BigInteger newRowCount) {
		BigInteger oldRowCount = rowCount;
		rowCount = newRowCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__ROW_COUNT, oldRowCount, rowCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSentenceCount() {
		return sentenceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentenceCount(BigInteger newSentenceCount) {
		BigInteger oldSentenceCount = sentenceCount;
		sentenceCount = newSentenceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__SENTENCE_COUNT, oldSentenceCount, sentenceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSyllableCount() {
		return syllableCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyllableCount(BigInteger newSyllableCount) {
		BigInteger oldSyllableCount = syllableCount;
		syllableCount = newSyllableCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__SYLLABLE_COUNT, oldSyllableCount, syllableCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTableCount() {
		return tableCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableCount(BigInteger newTableCount) {
		BigInteger oldTableCount = tableCount;
		tableCount = newTableCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__TABLE_COUNT, oldTableCount, tableCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWordCount() {
		return wordCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordCount(BigInteger newWordCount) {
		BigInteger oldWordCount = wordCount;
		wordCount = newWordCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.DOCUMENT_STATISTIC_TYPE__WORD_COUNT, oldWordCount, wordCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__CELL_COUNT:
				return getCellCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__CHARACTER_COUNT:
				return getCharacterCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__DRAW_COUNT:
				return getDrawCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__FRAME_COUNT:
				return getFrameCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__IMAGE_COUNT:
				return getImageCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__NON_WHITESPACE_CHARACTER_COUNT:
				return getNonWhitespaceCharacterCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__OBJECT_COUNT:
				return getObjectCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__OLE_OBJECT_COUNT:
				return getOleObjectCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__PAGE_COUNT:
				return getPageCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__PARAGRAPH_COUNT:
				return getParagraphCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__ROW_COUNT:
				return getRowCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__SENTENCE_COUNT:
				return getSentenceCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__SYLLABLE_COUNT:
				return getSyllableCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__TABLE_COUNT:
				return getTableCount();
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__WORD_COUNT:
				return getWordCount();
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
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__CELL_COUNT:
				setCellCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__CHARACTER_COUNT:
				setCharacterCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__DRAW_COUNT:
				setDrawCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__FRAME_COUNT:
				setFrameCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__IMAGE_COUNT:
				setImageCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__NON_WHITESPACE_CHARACTER_COUNT:
				setNonWhitespaceCharacterCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__OBJECT_COUNT:
				setObjectCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__OLE_OBJECT_COUNT:
				setOleObjectCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__PAGE_COUNT:
				setPageCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__PARAGRAPH_COUNT:
				setParagraphCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__ROW_COUNT:
				setRowCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__SENTENCE_COUNT:
				setSentenceCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__SYLLABLE_COUNT:
				setSyllableCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__TABLE_COUNT:
				setTableCount((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__WORD_COUNT:
				setWordCount((BigInteger)newValue);
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
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__CELL_COUNT:
				setCellCount(CELL_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__CHARACTER_COUNT:
				setCharacterCount(CHARACTER_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__DRAW_COUNT:
				setDrawCount(DRAW_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__FRAME_COUNT:
				setFrameCount(FRAME_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__IMAGE_COUNT:
				setImageCount(IMAGE_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__NON_WHITESPACE_CHARACTER_COUNT:
				setNonWhitespaceCharacterCount(NON_WHITESPACE_CHARACTER_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__OBJECT_COUNT:
				setObjectCount(OBJECT_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__OLE_OBJECT_COUNT:
				setOleObjectCount(OLE_OBJECT_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__PAGE_COUNT:
				setPageCount(PAGE_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__PARAGRAPH_COUNT:
				setParagraphCount(PARAGRAPH_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__ROW_COUNT:
				setRowCount(ROW_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__SENTENCE_COUNT:
				setSentenceCount(SENTENCE_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__SYLLABLE_COUNT:
				setSyllableCount(SYLLABLE_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__TABLE_COUNT:
				setTableCount(TABLE_COUNT_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__WORD_COUNT:
				setWordCount(WORD_COUNT_EDEFAULT);
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
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__CELL_COUNT:
				return CELL_COUNT_EDEFAULT == null ? cellCount != null : !CELL_COUNT_EDEFAULT.equals(cellCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__CHARACTER_COUNT:
				return CHARACTER_COUNT_EDEFAULT == null ? characterCount != null : !CHARACTER_COUNT_EDEFAULT.equals(characterCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__DRAW_COUNT:
				return DRAW_COUNT_EDEFAULT == null ? drawCount != null : !DRAW_COUNT_EDEFAULT.equals(drawCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__FRAME_COUNT:
				return FRAME_COUNT_EDEFAULT == null ? frameCount != null : !FRAME_COUNT_EDEFAULT.equals(frameCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__IMAGE_COUNT:
				return IMAGE_COUNT_EDEFAULT == null ? imageCount != null : !IMAGE_COUNT_EDEFAULT.equals(imageCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__NON_WHITESPACE_CHARACTER_COUNT:
				return NON_WHITESPACE_CHARACTER_COUNT_EDEFAULT == null ? nonWhitespaceCharacterCount != null : !NON_WHITESPACE_CHARACTER_COUNT_EDEFAULT.equals(nonWhitespaceCharacterCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__OBJECT_COUNT:
				return OBJECT_COUNT_EDEFAULT == null ? objectCount != null : !OBJECT_COUNT_EDEFAULT.equals(objectCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__OLE_OBJECT_COUNT:
				return OLE_OBJECT_COUNT_EDEFAULT == null ? oleObjectCount != null : !OLE_OBJECT_COUNT_EDEFAULT.equals(oleObjectCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__PAGE_COUNT:
				return PAGE_COUNT_EDEFAULT == null ? pageCount != null : !PAGE_COUNT_EDEFAULT.equals(pageCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__PARAGRAPH_COUNT:
				return PARAGRAPH_COUNT_EDEFAULT == null ? paragraphCount != null : !PARAGRAPH_COUNT_EDEFAULT.equals(paragraphCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__ROW_COUNT:
				return ROW_COUNT_EDEFAULT == null ? rowCount != null : !ROW_COUNT_EDEFAULT.equals(rowCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__SENTENCE_COUNT:
				return SENTENCE_COUNT_EDEFAULT == null ? sentenceCount != null : !SENTENCE_COUNT_EDEFAULT.equals(sentenceCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__SYLLABLE_COUNT:
				return SYLLABLE_COUNT_EDEFAULT == null ? syllableCount != null : !SYLLABLE_COUNT_EDEFAULT.equals(syllableCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__TABLE_COUNT:
				return TABLE_COUNT_EDEFAULT == null ? tableCount != null : !TABLE_COUNT_EDEFAULT.equals(tableCount);
			case MetaPackage.DOCUMENT_STATISTIC_TYPE__WORD_COUNT:
				return WORD_COUNT_EDEFAULT == null ? wordCount != null : !WORD_COUNT_EDEFAULT.equals(wordCount);
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
		result.append(" (cellCount: ");
		result.append(cellCount);
		result.append(", characterCount: ");
		result.append(characterCount);
		result.append(", drawCount: ");
		result.append(drawCount);
		result.append(", frameCount: ");
		result.append(frameCount);
		result.append(", imageCount: ");
		result.append(imageCount);
		result.append(", nonWhitespaceCharacterCount: ");
		result.append(nonWhitespaceCharacterCount);
		result.append(", objectCount: ");
		result.append(objectCount);
		result.append(", oleObjectCount: ");
		result.append(oleObjectCount);
		result.append(", pageCount: ");
		result.append(pageCount);
		result.append(", paragraphCount: ");
		result.append(paragraphCount);
		result.append(", rowCount: ");
		result.append(rowCount);
		result.append(", sentenceCount: ");
		result.append(sentenceCount);
		result.append(", syllableCount: ");
		result.append(syllableCount);
		result.append(", tableCount: ");
		result.append(tableCount);
		result.append(", wordCount: ");
		result.append(wordCount);
		result.append(')');
		return result.toString();
	}

} //DocumentStatisticTypeImpl
