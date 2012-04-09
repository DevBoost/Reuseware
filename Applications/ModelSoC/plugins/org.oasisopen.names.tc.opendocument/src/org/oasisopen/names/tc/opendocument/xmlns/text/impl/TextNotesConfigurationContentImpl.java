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
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.FootnotesPositionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NoteClassType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StartNumberingAtType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notes Configuration Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getNoteContinuationNoticeForward <em>Note Continuation Notice Forward</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getNoteContinuationNoticeBackward <em>Note Continuation Notice Backward</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getCitationBodyStyleName <em>Citation Body Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getCitationStyleName <em>Citation Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getDefaultStyleName <em>Default Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getFootnotesPosition <em>Footnotes Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getMasterPageName <em>Master Page Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getNoteClass <em>Note Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getNumPrefix <em>Num Prefix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getNumSuffix <em>Num Suffix</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getStartNumberingAt <em>Start Numbering At</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextNotesConfigurationContentImpl#getStartValue <em>Start Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextNotesConfigurationContentImpl extends EObjectImpl implements TextNotesConfigurationContent {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getCitationBodyStyleName() <em>Citation Body Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitationBodyStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String CITATION_BODY_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCitationBodyStyleName() <em>Citation Body Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitationBodyStyleName()
	 * @generated
	 * @ordered
	 */
	protected String citationBodyStyleName = CITATION_BODY_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCitationStyleName() <em>Citation Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitationStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String CITATION_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCitationStyleName() <em>Citation Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitationStyleName()
	 * @generated
	 * @ordered
	 */
	protected String citationStyleName = CITATION_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultStyleName() <em>Default Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultStyleName() <em>Default Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStyleName()
	 * @generated
	 * @ordered
	 */
	protected String defaultStyleName = DEFAULT_STYLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFootnotesPosition() <em>Footnotes Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootnotesPosition()
	 * @generated
	 * @ordered
	 */
	protected static final FootnotesPositionType FOOTNOTES_POSITION_EDEFAULT = FootnotesPositionType.TEXT;

	/**
	 * The cached value of the '{@link #getFootnotesPosition() <em>Footnotes Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootnotesPosition()
	 * @generated
	 * @ordered
	 */
	protected FootnotesPositionType footnotesPosition = FOOTNOTES_POSITION_EDEFAULT;

	/**
	 * This is true if the Footnotes Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean footnotesPositionESet;

	/**
	 * The default value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_PAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterPageName() <em>Master Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterPageName()
	 * @generated
	 * @ordered
	 */
	protected String masterPageName = MASTER_PAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoteClass() <em>Note Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteClass()
	 * @generated
	 * @ordered
	 */
	protected static final NoteClassType NOTE_CLASS_EDEFAULT = NoteClassType.FOOTNOTE;

	/**
	 * The cached value of the '{@link #getNoteClass() <em>Note Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteClass()
	 * @generated
	 * @ordered
	 */
	protected NoteClassType noteClass = NOTE_CLASS_EDEFAULT;

	/**
	 * This is true if the Note Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noteClassESet;

	/**
	 * The default value of the '{@link #getNumFormat() <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Object NUM_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumFormat() <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFormat()
	 * @generated
	 * @ordered
	 */
	protected Object numFormat = NUM_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumLetterSync() <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLetterSync()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean NUM_LETTER_SYNC_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getNumLetterSync() <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLetterSync()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean numLetterSync = NUM_LETTER_SYNC_EDEFAULT;

	/**
	 * This is true if the Num Letter Sync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numLetterSyncESet;

	/**
	 * The default value of the '{@link #getNumPrefix() <em>Num Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumPrefix() <em>Num Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPrefix()
	 * @generated
	 * @ordered
	 */
	protected String numPrefix = NUM_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumSuffix() <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumSuffix() <em>Num Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSuffix()
	 * @generated
	 * @ordered
	 */
	protected String numSuffix = NUM_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartNumberingAt() <em>Start Numbering At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartNumberingAt()
	 * @generated
	 * @ordered
	 */
	protected static final StartNumberingAtType START_NUMBERING_AT_EDEFAULT = StartNumberingAtType.DOCUMENT;

	/**
	 * The cached value of the '{@link #getStartNumberingAt() <em>Start Numbering At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartNumberingAt()
	 * @generated
	 * @ordered
	 */
	protected StartNumberingAtType startNumberingAt = START_NUMBERING_AT_EDEFAULT;

	/**
	 * This is true if the Start Numbering At attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startNumberingAtESet;

	/**
	 * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startValue = START_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextNotesConfigurationContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getTextNotesConfigurationContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNoteContinuationNoticeForward() {
		return getGroup().list(TextPackage.eINSTANCE.getTextNotesConfigurationContent_NoteContinuationNoticeForward());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNoteContinuationNoticeBackward() {
		return getGroup().list(TextPackage.eINSTANCE.getTextNotesConfigurationContent_NoteContinuationNoticeBackward());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCitationBodyStyleName() {
		return citationBodyStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitationBodyStyleName(String newCitationBodyStyleName) {
		String oldCitationBodyStyleName = citationBodyStyleName;
		citationBodyStyleName = newCitationBodyStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_BODY_STYLE_NAME, oldCitationBodyStyleName, citationBodyStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCitationStyleName() {
		return citationStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitationStyleName(String newCitationStyleName) {
		String oldCitationStyleName = citationStyleName;
		citationStyleName = newCitationStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_STYLE_NAME, oldCitationStyleName, citationStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultStyleName() {
		return defaultStyleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultStyleName(String newDefaultStyleName) {
		String oldDefaultStyleName = defaultStyleName;
		defaultStyleName = newDefaultStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__DEFAULT_STYLE_NAME, oldDefaultStyleName, defaultStyleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootnotesPositionType getFootnotesPosition() {
		return footnotesPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFootnotesPosition(FootnotesPositionType newFootnotesPosition) {
		FootnotesPositionType oldFootnotesPosition = footnotesPosition;
		footnotesPosition = newFootnotesPosition == null ? FOOTNOTES_POSITION_EDEFAULT : newFootnotesPosition;
		boolean oldFootnotesPositionESet = footnotesPositionESet;
		footnotesPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__FOOTNOTES_POSITION, oldFootnotesPosition, footnotesPosition, !oldFootnotesPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFootnotesPosition() {
		FootnotesPositionType oldFootnotesPosition = footnotesPosition;
		boolean oldFootnotesPositionESet = footnotesPositionESet;
		footnotesPosition = FOOTNOTES_POSITION_EDEFAULT;
		footnotesPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__FOOTNOTES_POSITION, oldFootnotesPosition, FOOTNOTES_POSITION_EDEFAULT, oldFootnotesPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFootnotesPosition() {
		return footnotesPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterPageName() {
		return masterPageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterPageName(String newMasterPageName) {
		String oldMasterPageName = masterPageName;
		masterPageName = newMasterPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__MASTER_PAGE_NAME, oldMasterPageName, masterPageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteClassType getNoteClass() {
		return noteClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteClass(NoteClassType newNoteClass) {
		NoteClassType oldNoteClass = noteClass;
		noteClass = newNoteClass == null ? NOTE_CLASS_EDEFAULT : newNoteClass;
		boolean oldNoteClassESet = noteClassESet;
		noteClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CLASS, oldNoteClass, noteClass, !oldNoteClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNoteClass() {
		NoteClassType oldNoteClass = noteClass;
		boolean oldNoteClassESet = noteClassESet;
		noteClass = NOTE_CLASS_EDEFAULT;
		noteClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CLASS, oldNoteClass, NOTE_CLASS_EDEFAULT, oldNoteClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNoteClass() {
		return noteClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNumFormat() {
		return numFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumFormat(Object newNumFormat) {
		Object oldNumFormat = numFormat;
		numFormat = newNumFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_FORMAT, oldNumFormat, numFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumLetterSync() {
		return numLetterSync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newNumLetterSync) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumLetterSync = numLetterSync;
		numLetterSync = newNumLetterSync == null ? NUM_LETTER_SYNC_EDEFAULT : newNumLetterSync;
		boolean oldNumLetterSyncESet = numLetterSyncESet;
		numLetterSyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_LETTER_SYNC, oldNumLetterSync, numLetterSync, !oldNumLetterSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumLetterSync() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumLetterSync = numLetterSync;
		boolean oldNumLetterSyncESet = numLetterSyncESet;
		numLetterSync = NUM_LETTER_SYNC_EDEFAULT;
		numLetterSyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_LETTER_SYNC, oldNumLetterSync, NUM_LETTER_SYNC_EDEFAULT, oldNumLetterSyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumLetterSync() {
		return numLetterSyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumPrefix() {
		return numPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumPrefix(String newNumPrefix) {
		String oldNumPrefix = numPrefix;
		numPrefix = newNumPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_PREFIX, oldNumPrefix, numPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumSuffix() {
		return numSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumSuffix(String newNumSuffix) {
		String oldNumSuffix = numSuffix;
		numSuffix = newNumSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_SUFFIX, oldNumSuffix, numSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNumberingAtType getStartNumberingAt() {
		return startNumberingAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartNumberingAt(StartNumberingAtType newStartNumberingAt) {
		StartNumberingAtType oldStartNumberingAt = startNumberingAt;
		startNumberingAt = newStartNumberingAt == null ? START_NUMBERING_AT_EDEFAULT : newStartNumberingAt;
		boolean oldStartNumberingAtESet = startNumberingAtESet;
		startNumberingAtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_NUMBERING_AT, oldStartNumberingAt, startNumberingAt, !oldStartNumberingAtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartNumberingAt() {
		StartNumberingAtType oldStartNumberingAt = startNumberingAt;
		boolean oldStartNumberingAtESet = startNumberingAtESet;
		startNumberingAt = START_NUMBERING_AT_EDEFAULT;
		startNumberingAtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_NUMBERING_AT, oldStartNumberingAt, START_NUMBERING_AT_EDEFAULT, oldStartNumberingAtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartNumberingAt() {
		return startNumberingAtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStartValue() {
		return startValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartValue(BigInteger newStartValue) {
		BigInteger oldStartValue = startValue;
		startValue = newStartValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_VALUE, oldStartValue, startValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CONTINUATION_NOTICE_FORWARD:
				return getNoteContinuationNoticeForward();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CONTINUATION_NOTICE_BACKWARD:
				return getNoteContinuationNoticeBackward();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_BODY_STYLE_NAME:
				return getCitationBodyStyleName();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_STYLE_NAME:
				return getCitationStyleName();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__DEFAULT_STYLE_NAME:
				return getDefaultStyleName();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__FOOTNOTES_POSITION:
				return getFootnotesPosition();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__MASTER_PAGE_NAME:
				return getMasterPageName();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CLASS:
				return getNoteClass();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_FORMAT:
				return getNumFormat();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_LETTER_SYNC:
				return getNumLetterSync();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_PREFIX:
				return getNumPrefix();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_SUFFIX:
				return getNumSuffix();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_NUMBERING_AT:
				return getStartNumberingAt();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_VALUE:
				return getStartValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CONTINUATION_NOTICE_FORWARD:
				getNoteContinuationNoticeForward().clear();
				getNoteContinuationNoticeForward().addAll((Collection<? extends String>)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CONTINUATION_NOTICE_BACKWARD:
				getNoteContinuationNoticeBackward().clear();
				getNoteContinuationNoticeBackward().addAll((Collection<? extends String>)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_BODY_STYLE_NAME:
				setCitationBodyStyleName((String)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_STYLE_NAME:
				setCitationStyleName((String)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__DEFAULT_STYLE_NAME:
				setDefaultStyleName((String)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__FOOTNOTES_POSITION:
				setFootnotesPosition((FootnotesPositionType)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__MASTER_PAGE_NAME:
				setMasterPageName((String)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CLASS:
				setNoteClass((NoteClassType)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_FORMAT:
				setNumFormat(newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_LETTER_SYNC:
				setNumLetterSync((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_PREFIX:
				setNumPrefix((String)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_SUFFIX:
				setNumSuffix((String)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_NUMBERING_AT:
				setStartNumberingAt((StartNumberingAtType)newValue);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_VALUE:
				setStartValue((BigInteger)newValue);
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
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__GROUP:
				getGroup().clear();
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CONTINUATION_NOTICE_FORWARD:
				getNoteContinuationNoticeForward().clear();
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CONTINUATION_NOTICE_BACKWARD:
				getNoteContinuationNoticeBackward().clear();
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_BODY_STYLE_NAME:
				setCitationBodyStyleName(CITATION_BODY_STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_STYLE_NAME:
				setCitationStyleName(CITATION_STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__DEFAULT_STYLE_NAME:
				setDefaultStyleName(DEFAULT_STYLE_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__FOOTNOTES_POSITION:
				unsetFootnotesPosition();
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__MASTER_PAGE_NAME:
				setMasterPageName(MASTER_PAGE_NAME_EDEFAULT);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CLASS:
				unsetNoteClass();
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_FORMAT:
				setNumFormat(NUM_FORMAT_EDEFAULT);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_LETTER_SYNC:
				unsetNumLetterSync();
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_PREFIX:
				setNumPrefix(NUM_PREFIX_EDEFAULT);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_SUFFIX:
				setNumSuffix(NUM_SUFFIX_EDEFAULT);
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_NUMBERING_AT:
				unsetStartNumberingAt();
				return;
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_VALUE:
				setStartValue(START_VALUE_EDEFAULT);
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
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__GROUP:
				return group != null && !group.isEmpty();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CONTINUATION_NOTICE_FORWARD:
				return !getNoteContinuationNoticeForward().isEmpty();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CONTINUATION_NOTICE_BACKWARD:
				return !getNoteContinuationNoticeBackward().isEmpty();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_BODY_STYLE_NAME:
				return CITATION_BODY_STYLE_NAME_EDEFAULT == null ? citationBodyStyleName != null : !CITATION_BODY_STYLE_NAME_EDEFAULT.equals(citationBodyStyleName);
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__CITATION_STYLE_NAME:
				return CITATION_STYLE_NAME_EDEFAULT == null ? citationStyleName != null : !CITATION_STYLE_NAME_EDEFAULT.equals(citationStyleName);
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__DEFAULT_STYLE_NAME:
				return DEFAULT_STYLE_NAME_EDEFAULT == null ? defaultStyleName != null : !DEFAULT_STYLE_NAME_EDEFAULT.equals(defaultStyleName);
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__FOOTNOTES_POSITION:
				return isSetFootnotesPosition();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__MASTER_PAGE_NAME:
				return MASTER_PAGE_NAME_EDEFAULT == null ? masterPageName != null : !MASTER_PAGE_NAME_EDEFAULT.equals(masterPageName);
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NOTE_CLASS:
				return isSetNoteClass();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_FORMAT:
				return NUM_FORMAT_EDEFAULT == null ? numFormat != null : !NUM_FORMAT_EDEFAULT.equals(numFormat);
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_LETTER_SYNC:
				return isSetNumLetterSync();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_PREFIX:
				return NUM_PREFIX_EDEFAULT == null ? numPrefix != null : !NUM_PREFIX_EDEFAULT.equals(numPrefix);
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__NUM_SUFFIX:
				return NUM_SUFFIX_EDEFAULT == null ? numSuffix != null : !NUM_SUFFIX_EDEFAULT.equals(numSuffix);
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_NUMBERING_AT:
				return isSetStartNumberingAt();
			case TextPackage.TEXT_NOTES_CONFIGURATION_CONTENT__START_VALUE:
				return START_VALUE_EDEFAULT == null ? startValue != null : !START_VALUE_EDEFAULT.equals(startValue);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", citationBodyStyleName: ");
		result.append(citationBodyStyleName);
		result.append(", citationStyleName: ");
		result.append(citationStyleName);
		result.append(", defaultStyleName: ");
		result.append(defaultStyleName);
		result.append(", footnotesPosition: ");
		if (footnotesPositionESet) result.append(footnotesPosition); else result.append("<unset>");
		result.append(", masterPageName: ");
		result.append(masterPageName);
		result.append(", noteClass: ");
		if (noteClassESet) result.append(noteClass); else result.append("<unset>");
		result.append(", numFormat: ");
		result.append(numFormat);
		result.append(", numLetterSync: ");
		if (numLetterSyncESet) result.append(numLetterSync); else result.append("<unset>");
		result.append(", numPrefix: ");
		result.append(numPrefix);
		result.append(", numSuffix: ");
		result.append(numSuffix);
		result.append(", startNumberingAt: ");
		if (startNumberingAtESet) result.append(startNumberingAt); else result.append("<unset>");
		result.append(", startValue: ");
		result.append(startValue);
		result.append(')');
		return result.toString();
	}

} //TextNotesConfigurationContentImpl
