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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType1;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexSourceStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Of Content Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentSourceTypeImpl#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentSourceTypeImpl#getTableOfContentEntryTemplate <em>Table Of Content Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentSourceTypeImpl#getIndexSourceStyles <em>Index Source Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentSourceTypeImpl#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentSourceTypeImpl#getOutlineLevel <em>Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentSourceTypeImpl#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentSourceTypeImpl#getUseIndexMarks <em>Use Index Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentSourceTypeImpl#getUseIndexSourceStyles <em>Use Index Source Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.TableOfContentSourceTypeImpl#getUseOutlineLevel <em>Use Outline Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableOfContentSourceTypeImpl extends EObjectImpl implements TableOfContentSourceType {
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
	 * The cached value of the '{@link #getTableOfContentEntryTemplate() <em>Table Of Content Entry Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableOfContentEntryTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TableOfContentEntryTemplateType> tableOfContentEntryTemplate;

	/**
	 * The cached value of the '{@link #getIndexSourceStyles() <em>Index Source Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexSourceStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexSourceStylesType> indexSourceStyles;

	/**
	 * The default value of the '{@link #getIndexScope() <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexScope()
	 * @generated
	 * @ordered
	 */
	protected static final IndexScopeType1 INDEX_SCOPE_EDEFAULT = IndexScopeType1.DOCUMENT;

	/**
	 * The cached value of the '{@link #getIndexScope() <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexScope()
	 * @generated
	 * @ordered
	 */
	protected IndexScopeType1 indexScope = INDEX_SCOPE_EDEFAULT;

	/**
	 * This is true if the Index Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indexScopeESet;

	/**
	 * The default value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OUTLINE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutlineLevel() <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger outlineLevel = OUTLINE_LEVEL_EDEFAULT;

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
	 * The default value of the '{@link #getUseIndexMarks() <em>Use Index Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseIndexMarks()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_INDEX_MARKS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseIndexMarks() <em>Use Index Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseIndexMarks()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useIndexMarks = USE_INDEX_MARKS_EDEFAULT;

	/**
	 * This is true if the Use Index Marks attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useIndexMarksESet;

	/**
	 * The default value of the '{@link #getUseIndexSourceStyles() <em>Use Index Source Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseIndexSourceStyles()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_INDEX_SOURCE_STYLES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseIndexSourceStyles() <em>Use Index Source Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseIndexSourceStyles()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useIndexSourceStyles = USE_INDEX_SOURCE_STYLES_EDEFAULT;

	/**
	 * This is true if the Use Index Source Styles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useIndexSourceStylesESet;

	/**
	 * The default value of the '{@link #getUseOutlineLevel() <em>Use Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_OUTLINE_LEVEL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseOutlineLevel() <em>Use Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useOutlineLevel = USE_OUTLINE_LEVEL_EDEFAULT;

	/**
	 * This is true if the Use Outline Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useOutlineLevelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableOfContentSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getTableOfContentSourceType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, oldIndexTitleTemplate, newIndexTitleTemplate);
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
				msgs = ((InternalEObject)indexTitleTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			if (newIndexTitleTemplate != null)
				msgs = ((InternalEObject)newIndexTitleTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			msgs = basicSetIndexTitleTemplate(newIndexTitleTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, newIndexTitleTemplate, newIndexTitleTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfContentEntryTemplateType> getTableOfContentEntryTemplate() {
		if (tableOfContentEntryTemplate == null) {
			tableOfContentEntryTemplate = new EObjectContainmentEList<TableOfContentEntryTemplateType>(TableOfContentEntryTemplateType.class, this, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__TABLE_OF_CONTENT_ENTRY_TEMPLATE);
		}
		return tableOfContentEntryTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexSourceStylesType> getIndexSourceStyles() {
		if (indexSourceStyles == null) {
			indexSourceStyles = new EObjectContainmentEList<IndexSourceStylesType>(IndexSourceStylesType.class, this, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SOURCE_STYLES);
		}
		return indexSourceStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexScopeType1 getIndexScope() {
		return indexScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexScope(IndexScopeType1 newIndexScope) {
		IndexScopeType1 oldIndexScope = indexScope;
		indexScope = newIndexScope == null ? INDEX_SCOPE_EDEFAULT : newIndexScope;
		boolean oldIndexScopeESet = indexScopeESet;
		indexScopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, indexScope, !oldIndexScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndexScope() {
		IndexScopeType1 oldIndexScope = indexScope;
		boolean oldIndexScopeESet = indexScopeESet;
		indexScope = INDEX_SCOPE_EDEFAULT;
		indexScopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, INDEX_SCOPE_EDEFAULT, oldIndexScopeESet));
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
	public BigInteger getOutlineLevel() {
		return outlineLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineLevel(BigInteger newOutlineLevel) {
		BigInteger oldOutlineLevel = outlineLevel;
		outlineLevel = newOutlineLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__OUTLINE_LEVEL, oldOutlineLevel, outlineLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, relativeTabStopPosition, !oldRelativeTabStopPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, RELATIVE_TAB_STOP_POSITION_EDEFAULT, oldRelativeTabStopPositionESet));
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
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseIndexMarks() {
		return useIndexMarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseIndexMarks(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseIndexMarks) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseIndexMarks = useIndexMarks;
		useIndexMarks = newUseIndexMarks == null ? USE_INDEX_MARKS_EDEFAULT : newUseIndexMarks;
		boolean oldUseIndexMarksESet = useIndexMarksESet;
		useIndexMarksESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_MARKS, oldUseIndexMarks, useIndexMarks, !oldUseIndexMarksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseIndexMarks() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseIndexMarks = useIndexMarks;
		boolean oldUseIndexMarksESet = useIndexMarksESet;
		useIndexMarks = USE_INDEX_MARKS_EDEFAULT;
		useIndexMarksESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_MARKS, oldUseIndexMarks, USE_INDEX_MARKS_EDEFAULT, oldUseIndexMarksESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseIndexMarks() {
		return useIndexMarksESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseIndexSourceStyles() {
		return useIndexSourceStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseIndexSourceStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseIndexSourceStyles) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseIndexSourceStyles = useIndexSourceStyles;
		useIndexSourceStyles = newUseIndexSourceStyles == null ? USE_INDEX_SOURCE_STYLES_EDEFAULT : newUseIndexSourceStyles;
		boolean oldUseIndexSourceStylesESet = useIndexSourceStylesESet;
		useIndexSourceStylesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_SOURCE_STYLES, oldUseIndexSourceStyles, useIndexSourceStyles, !oldUseIndexSourceStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseIndexSourceStyles() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseIndexSourceStyles = useIndexSourceStyles;
		boolean oldUseIndexSourceStylesESet = useIndexSourceStylesESet;
		useIndexSourceStyles = USE_INDEX_SOURCE_STYLES_EDEFAULT;
		useIndexSourceStylesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_SOURCE_STYLES, oldUseIndexSourceStyles, USE_INDEX_SOURCE_STYLES_EDEFAULT, oldUseIndexSourceStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseIndexSourceStyles() {
		return useIndexSourceStylesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseOutlineLevel() {
		return useOutlineLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseOutlineLevel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseOutlineLevel) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseOutlineLevel = useOutlineLevel;
		useOutlineLevel = newUseOutlineLevel == null ? USE_OUTLINE_LEVEL_EDEFAULT : newUseOutlineLevel;
		boolean oldUseOutlineLevelESet = useOutlineLevelESet;
		useOutlineLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_OUTLINE_LEVEL, oldUseOutlineLevel, useOutlineLevel, !oldUseOutlineLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseOutlineLevel() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseOutlineLevel = useOutlineLevel;
		boolean oldUseOutlineLevelESet = useOutlineLevelESet;
		useOutlineLevel = USE_OUTLINE_LEVEL_EDEFAULT;
		useOutlineLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_OUTLINE_LEVEL, oldUseOutlineLevel, USE_OUTLINE_LEVEL_EDEFAULT, oldUseOutlineLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseOutlineLevel() {
		return useOutlineLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return basicSetIndexTitleTemplate(null, msgs);
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				return ((InternalEList<?>)getTableOfContentEntryTemplate()).basicRemove(otherEnd, msgs);
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SOURCE_STYLES:
				return ((InternalEList<?>)getIndexSourceStyles()).basicRemove(otherEnd, msgs);
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
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return getIndexTitleTemplate();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				return getTableOfContentEntryTemplate();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SOURCE_STYLES:
				return getIndexSourceStyles();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SCOPE:
				return getIndexScope();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__OUTLINE_LEVEL:
				return getOutlineLevel();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return getRelativeTabStopPosition();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_MARKS:
				return getUseIndexMarks();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_SOURCE_STYLES:
				return getUseIndexSourceStyles();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_OUTLINE_LEVEL:
				return getUseOutlineLevel();
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
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				getTableOfContentEntryTemplate().clear();
				getTableOfContentEntryTemplate().addAll((Collection<? extends TableOfContentEntryTemplateType>)newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SOURCE_STYLES:
				getIndexSourceStyles().clear();
				getIndexSourceStyles().addAll((Collection<? extends IndexSourceStylesType>)newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SCOPE:
				setIndexScope((IndexScopeType1)newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__OUTLINE_LEVEL:
				setOutlineLevel((BigInteger)newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				setRelativeTabStopPosition((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_MARKS:
				setUseIndexMarks((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_SOURCE_STYLES:
				setUseIndexSourceStyles((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_OUTLINE_LEVEL:
				setUseOutlineLevel((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)null);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				getTableOfContentEntryTemplate().clear();
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SOURCE_STYLES:
				getIndexSourceStyles().clear();
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SCOPE:
				unsetIndexScope();
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__OUTLINE_LEVEL:
				setOutlineLevel(OUTLINE_LEVEL_EDEFAULT);
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				unsetRelativeTabStopPosition();
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_MARKS:
				unsetUseIndexMarks();
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_SOURCE_STYLES:
				unsetUseIndexSourceStyles();
				return;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_OUTLINE_LEVEL:
				unsetUseOutlineLevel();
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
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return indexTitleTemplate != null;
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__TABLE_OF_CONTENT_ENTRY_TEMPLATE:
				return tableOfContentEntryTemplate != null && !tableOfContentEntryTemplate.isEmpty();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SOURCE_STYLES:
				return indexSourceStyles != null && !indexSourceStyles.isEmpty();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__INDEX_SCOPE:
				return isSetIndexScope();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__OUTLINE_LEVEL:
				return OUTLINE_LEVEL_EDEFAULT == null ? outlineLevel != null : !OUTLINE_LEVEL_EDEFAULT.equals(outlineLevel);
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return isSetRelativeTabStopPosition();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_MARKS:
				return isSetUseIndexMarks();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_INDEX_SOURCE_STYLES:
				return isSetUseIndexSourceStyles();
			case TextPackage.TABLE_OF_CONTENT_SOURCE_TYPE__USE_OUTLINE_LEVEL:
				return isSetUseOutlineLevel();
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
		result.append(" (indexScope: ");
		if (indexScopeESet) result.append(indexScope); else result.append("<unset>");
		result.append(", outlineLevel: ");
		result.append(outlineLevel);
		result.append(", relativeTabStopPosition: ");
		if (relativeTabStopPositionESet) result.append(relativeTabStopPosition); else result.append("<unset>");
		result.append(", useIndexMarks: ");
		if (useIndexMarksESet) result.append(useIndexMarks); else result.append("<unset>");
		result.append(", useIndexSourceStyles: ");
		if (useIndexSourceStylesESet) result.append(useIndexSourceStyles); else result.append("<unset>");
		result.append(", useOutlineLevel: ");
		if (useOutlineLevelESet) result.append(useOutlineLevel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TableOfContentSourceTypeImpl
