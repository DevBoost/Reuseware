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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.CaptionSequenceFormatType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextIllustrationIndexEntryContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Illustration Index Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IllustrationIndexSourceTypeImpl#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IllustrationIndexSourceTypeImpl#getIllustrationIndexEntryTemplate <em>Illustration Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IllustrationIndexSourceTypeImpl#getCaptionSequenceFormat <em>Caption Sequence Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IllustrationIndexSourceTypeImpl#getCaptionSequenceName <em>Caption Sequence Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IllustrationIndexSourceTypeImpl#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IllustrationIndexSourceTypeImpl#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.IllustrationIndexSourceTypeImpl#getUseCaption <em>Use Caption</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IllustrationIndexSourceTypeImpl extends EObjectImpl implements IllustrationIndexSourceType {
	/**
	 * The cached value of the '{@link #getIndexTitleTemplate() <em>Index Title Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexTitleTemplate()
	 * @generated
	 * @ordered
	 */
	protected IndexTitleTemplateType indexTitleTemplate;

	/**
	 * The cached value of the '{@link #getIllustrationIndexEntryTemplate() <em>Illustration Index Entry Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllustrationIndexEntryTemplate()
	 * @generated
	 * @ordered
	 */
	protected TextIllustrationIndexEntryContent illustrationIndexEntryTemplate;

	/**
	 * The default value of the '{@link #getCaptionSequenceFormat() <em>Caption Sequence Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionSequenceFormat()
	 * @generated
	 * @ordered
	 */
	protected static final CaptionSequenceFormatType CAPTION_SEQUENCE_FORMAT_EDEFAULT = CaptionSequenceFormatType.TEXT;

	/**
	 * The cached value of the '{@link #getCaptionSequenceFormat() <em>Caption Sequence Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionSequenceFormat()
	 * @generated
	 * @ordered
	 */
	protected CaptionSequenceFormatType captionSequenceFormat = CAPTION_SEQUENCE_FORMAT_EDEFAULT;

	/**
	 * This is true if the Caption Sequence Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean captionSequenceFormatESet;

	/**
	 * The default value of the '{@link #getCaptionSequenceName() <em>Caption Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionSequenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_SEQUENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaptionSequenceName() <em>Caption Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionSequenceName()
	 * @generated
	 * @ordered
	 */
	protected String captionSequenceName = CAPTION_SEQUENCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexScope() <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexScope()
	 * @generated
	 * @ordered
	 */
	protected static final IndexScopeType INDEX_SCOPE_EDEFAULT = IndexScopeType.DOCUMENT;

	/**
	 * The cached value of the '{@link #getIndexScope() <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexScope()
	 * @generated
	 * @ordered
	 */
	protected IndexScopeType indexScope = INDEX_SCOPE_EDEFAULT;

	/**
	 * This is true if the Index Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indexScopeESet;

	/**
	 * The default value of the '{@link #getRelativeTabStopPosition() <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTabStopPosition()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean RELATIVE_TAB_STOP_POSITION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getRelativeTabStopPosition() <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTabStopPosition()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean relativeTabStopPosition = RELATIVE_TAB_STOP_POSITION_EDEFAULT;

	/**
	 * This is true if the Relative Tab Stop Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relativeTabStopPositionESet;

	/**
	 * The default value of the '{@link #getUseCaption() <em>Use Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaption()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_CAPTION_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseCaption() <em>Use Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaption()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useCaption = USE_CAPTION_EDEFAULT;

	/**
	 * This is true if the Use Caption attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useCaptionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IllustrationIndexSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getIllustrationIndexSourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexTitleTemplateType getIndexTitleTemplate() {
		return indexTitleTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexTitleTemplate(IndexTitleTemplateType newIndexTitleTemplate, NotificationChain msgs) {
		IndexTitleTemplateType oldIndexTitleTemplate = indexTitleTemplate;
		indexTitleTemplate = newIndexTitleTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, oldIndexTitleTemplate, newIndexTitleTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexTitleTemplate(IndexTitleTemplateType newIndexTitleTemplate) {
		if (newIndexTitleTemplate != indexTitleTemplate) {
			NotificationChain msgs = null;
			if (indexTitleTemplate != null)
				msgs = ((InternalEObject)indexTitleTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			if (newIndexTitleTemplate != null)
				msgs = ((InternalEObject)newIndexTitleTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			msgs = basicSetIndexTitleTemplate(newIndexTitleTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, newIndexTitleTemplate, newIndexTitleTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextIllustrationIndexEntryContent getIllustrationIndexEntryTemplate() {
		return illustrationIndexEntryTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIllustrationIndexEntryTemplate(TextIllustrationIndexEntryContent newIllustrationIndexEntryTemplate, NotificationChain msgs) {
		TextIllustrationIndexEntryContent oldIllustrationIndexEntryTemplate = illustrationIndexEntryTemplate;
		illustrationIndexEntryTemplate = newIllustrationIndexEntryTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__ILLUSTRATION_INDEX_ENTRY_TEMPLATE, oldIllustrationIndexEntryTemplate, newIllustrationIndexEntryTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIllustrationIndexEntryTemplate(TextIllustrationIndexEntryContent newIllustrationIndexEntryTemplate) {
		if (newIllustrationIndexEntryTemplate != illustrationIndexEntryTemplate) {
			NotificationChain msgs = null;
			if (illustrationIndexEntryTemplate != null)
				msgs = ((InternalEObject)illustrationIndexEntryTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__ILLUSTRATION_INDEX_ENTRY_TEMPLATE, null, msgs);
			if (newIllustrationIndexEntryTemplate != null)
				msgs = ((InternalEObject)newIllustrationIndexEntryTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__ILLUSTRATION_INDEX_ENTRY_TEMPLATE, null, msgs);
			msgs = basicSetIllustrationIndexEntryTemplate(newIllustrationIndexEntryTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__ILLUSTRATION_INDEX_ENTRY_TEMPLATE, newIllustrationIndexEntryTemplate, newIllustrationIndexEntryTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionSequenceFormatType getCaptionSequenceFormat() {
		return captionSequenceFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionSequenceFormat(CaptionSequenceFormatType newCaptionSequenceFormat) {
		CaptionSequenceFormatType oldCaptionSequenceFormat = captionSequenceFormat;
		captionSequenceFormat = newCaptionSequenceFormat == null ? CAPTION_SEQUENCE_FORMAT_EDEFAULT : newCaptionSequenceFormat;
		boolean oldCaptionSequenceFormatESet = captionSequenceFormatESet;
		captionSequenceFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_FORMAT, oldCaptionSequenceFormat, captionSequenceFormat, !oldCaptionSequenceFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaptionSequenceFormat() {
		CaptionSequenceFormatType oldCaptionSequenceFormat = captionSequenceFormat;
		boolean oldCaptionSequenceFormatESet = captionSequenceFormatESet;
		captionSequenceFormat = CAPTION_SEQUENCE_FORMAT_EDEFAULT;
		captionSequenceFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_FORMAT, oldCaptionSequenceFormat, CAPTION_SEQUENCE_FORMAT_EDEFAULT, oldCaptionSequenceFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaptionSequenceFormat() {
		return captionSequenceFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionSequenceName() {
		return captionSequenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionSequenceName(String newCaptionSequenceName) {
		String oldCaptionSequenceName = captionSequenceName;
		captionSequenceName = newCaptionSequenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_NAME, oldCaptionSequenceName, captionSequenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexScopeType getIndexScope() {
		return indexScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexScope(IndexScopeType newIndexScope) {
		IndexScopeType oldIndexScope = indexScope;
		indexScope = newIndexScope == null ? INDEX_SCOPE_EDEFAULT : newIndexScope;
		boolean oldIndexScopeESet = indexScopeESet;
		indexScopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, indexScope, !oldIndexScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndexScope() {
		IndexScopeType oldIndexScope = indexScope;
		boolean oldIndexScopeESet = indexScopeESet;
		indexScope = INDEX_SCOPE_EDEFAULT;
		indexScopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, INDEX_SCOPE_EDEFAULT, oldIndexScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndexScope() {
		return indexScopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRelativeTabStopPosition() {
		return relativeTabStopPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newRelativeTabStopPosition) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRelativeTabStopPosition = relativeTabStopPosition;
		relativeTabStopPosition = newRelativeTabStopPosition == null ? RELATIVE_TAB_STOP_POSITION_EDEFAULT : newRelativeTabStopPosition;
		boolean oldRelativeTabStopPositionESet = relativeTabStopPositionESet;
		relativeTabStopPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, relativeTabStopPosition, !oldRelativeTabStopPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelativeTabStopPosition() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRelativeTabStopPosition = relativeTabStopPosition;
		boolean oldRelativeTabStopPositionESet = relativeTabStopPositionESet;
		relativeTabStopPosition = RELATIVE_TAB_STOP_POSITION_EDEFAULT;
		relativeTabStopPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, RELATIVE_TAB_STOP_POSITION_EDEFAULT, oldRelativeTabStopPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelativeTabStopPosition() {
		return relativeTabStopPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseCaption() {
		return useCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCaption(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseCaption) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseCaption = useCaption;
		useCaption = newUseCaption == null ? USE_CAPTION_EDEFAULT : newUseCaption;
		boolean oldUseCaptionESet = useCaptionESet;
		useCaptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__USE_CAPTION, oldUseCaption, useCaption, !oldUseCaptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseCaption() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseCaption = useCaption;
		boolean oldUseCaptionESet = useCaptionESet;
		useCaption = USE_CAPTION_EDEFAULT;
		useCaptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__USE_CAPTION, oldUseCaption, USE_CAPTION_EDEFAULT, oldUseCaptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseCaption() {
		return useCaptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return basicSetIndexTitleTemplate(null, msgs);
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				return basicSetIllustrationIndexEntryTemplate(null, msgs);
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
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return getIndexTitleTemplate();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				return getIllustrationIndexEntryTemplate();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_FORMAT:
				return getCaptionSequenceFormat();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_NAME:
				return getCaptionSequenceName();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				return getIndexScope();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return getRelativeTabStopPosition();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__USE_CAPTION:
				return getUseCaption();
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
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)newValue);
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				setIllustrationIndexEntryTemplate((TextIllustrationIndexEntryContent)newValue);
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_FORMAT:
				setCaptionSequenceFormat((CaptionSequenceFormatType)newValue);
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_NAME:
				setCaptionSequenceName((String)newValue);
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				setIndexScope((IndexScopeType)newValue);
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				setRelativeTabStopPosition((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__USE_CAPTION:
				setUseCaption((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)null);
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				setIllustrationIndexEntryTemplate((TextIllustrationIndexEntryContent)null);
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_FORMAT:
				unsetCaptionSequenceFormat();
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_NAME:
				setCaptionSequenceName(CAPTION_SEQUENCE_NAME_EDEFAULT);
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				unsetIndexScope();
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				unsetRelativeTabStopPosition();
				return;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__USE_CAPTION:
				unsetUseCaption();
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
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return indexTitleTemplate != null;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__ILLUSTRATION_INDEX_ENTRY_TEMPLATE:
				return illustrationIndexEntryTemplate != null;
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_FORMAT:
				return isSetCaptionSequenceFormat();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__CAPTION_SEQUENCE_NAME:
				return CAPTION_SEQUENCE_NAME_EDEFAULT == null ? captionSequenceName != null : !CAPTION_SEQUENCE_NAME_EDEFAULT.equals(captionSequenceName);
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				return isSetIndexScope();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return isSetRelativeTabStopPosition();
			case TextPackage.ILLUSTRATION_INDEX_SOURCE_TYPE__USE_CAPTION:
				return isSetUseCaption();
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
		result.append(" (captionSequenceFormat: ");
		if (captionSequenceFormatESet) result.append(captionSequenceFormat); else result.append("<unset>");
		result.append(", captionSequenceName: ");
		result.append(captionSequenceName);
		result.append(", indexScope: ");
		if (indexScopeESet) result.append(indexScope); else result.append("<unset>");
		result.append(", relativeTabStopPosition: ");
		if (relativeTabStopPositionESet) result.append(relativeTabStopPosition); else result.append("<unset>");
		result.append(", useCaption: ");
		if (useCaptionESet) result.append(useCaption); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IllustrationIndexSourceTypeImpl
