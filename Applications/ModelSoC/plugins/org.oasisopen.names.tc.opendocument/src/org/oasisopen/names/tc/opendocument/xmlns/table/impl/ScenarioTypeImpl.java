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
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl#getCopyBack <em>Copy Back</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl#getCopyFormulas <em>Copy Formulas</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl#getCopyStyles <em>Copy Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl#getDisplayBorder <em>Display Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.ScenarioTypeImpl#getScenarioRanges <em>Scenario Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioTypeImpl extends EObjectImpl implements ScenarioType {
	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected String borderColor = BORDER_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyBack() <em>Copy Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyBack()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COPY_BACK_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCopyBack() <em>Copy Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyBack()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean copyBack = COPY_BACK_EDEFAULT;

	/**
	 * This is true if the Copy Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean copyBackESet;

	/**
	 * The default value of the '{@link #getCopyFormulas() <em>Copy Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyFormulas()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COPY_FORMULAS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCopyFormulas() <em>Copy Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyFormulas()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean copyFormulas = COPY_FORMULAS_EDEFAULT;

	/**
	 * This is true if the Copy Formulas attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean copyFormulasESet;

	/**
	 * The default value of the '{@link #getCopyStyles() <em>Copy Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyStyles()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COPY_STYLES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCopyStyles() <em>Copy Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyStyles()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean copyStyles = COPY_STYLES_EDEFAULT;

	/**
	 * This is true if the Copy Styles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean copyStylesESet;

	/**
	 * The default value of the '{@link #getDisplayBorder() <em>Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayBorder()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISPLAY_BORDER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDisplayBorder() <em>Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayBorder()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean displayBorder = DISPLAY_BORDER_EDEFAULT;

	/**
	 * This is true if the Display Border attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayBorderESet;

	/**
	 * The default value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IS_ACTIVE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * This is true if the Is Active attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isActiveESet;

	/**
	 * The default value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PROTECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean protected_ = PROTECTED_EDEFAULT;

	/**
	 * This is true if the Protected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectedESet;

	/**
	 * The default value of the '{@link #getScenarioRanges() <em>Scenario Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioRanges()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIO_RANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioRanges() <em>Scenario Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioRanges()
	 * @generated
	 * @ordered
	 */
	protected String scenarioRanges = SCENARIO_RANGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getScenarioType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorderColor() {
		return borderColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderColor(String newBorderColor) {
		String oldBorderColor = borderColor;
		borderColor = newBorderColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SCENARIO_TYPE__BORDER_COLOR, oldBorderColor, borderColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SCENARIO_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyBack() {
		return copyBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCopyBack) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyBack = copyBack;
		copyBack = newCopyBack == null ? COPY_BACK_EDEFAULT : newCopyBack;
		boolean oldCopyBackESet = copyBackESet;
		copyBackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SCENARIO_TYPE__COPY_BACK, oldCopyBack, copyBack, !oldCopyBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCopyBack() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyBack = copyBack;
		boolean oldCopyBackESet = copyBackESet;
		copyBack = COPY_BACK_EDEFAULT;
		copyBackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SCENARIO_TYPE__COPY_BACK, oldCopyBack, COPY_BACK_EDEFAULT, oldCopyBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCopyBack() {
		return copyBackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyFormulas() {
		return copyFormulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCopyFormulas) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyFormulas = copyFormulas;
		copyFormulas = newCopyFormulas == null ? COPY_FORMULAS_EDEFAULT : newCopyFormulas;
		boolean oldCopyFormulasESet = copyFormulasESet;
		copyFormulasESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SCENARIO_TYPE__COPY_FORMULAS, oldCopyFormulas, copyFormulas, !oldCopyFormulasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCopyFormulas() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyFormulas = copyFormulas;
		boolean oldCopyFormulasESet = copyFormulasESet;
		copyFormulas = COPY_FORMULAS_EDEFAULT;
		copyFormulasESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SCENARIO_TYPE__COPY_FORMULAS, oldCopyFormulas, COPY_FORMULAS_EDEFAULT, oldCopyFormulasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCopyFormulas() {
		return copyFormulasESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyStyles() {
		return copyStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCopyStyles) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyStyles = copyStyles;
		copyStyles = newCopyStyles == null ? COPY_STYLES_EDEFAULT : newCopyStyles;
		boolean oldCopyStylesESet = copyStylesESet;
		copyStylesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SCENARIO_TYPE__COPY_STYLES, oldCopyStyles, copyStyles, !oldCopyStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCopyStyles() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyStyles = copyStyles;
		boolean oldCopyStylesESet = copyStylesESet;
		copyStyles = COPY_STYLES_EDEFAULT;
		copyStylesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SCENARIO_TYPE__COPY_STYLES, oldCopyStyles, COPY_STYLES_EDEFAULT, oldCopyStylesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCopyStyles() {
		return copyStylesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayBorder() {
		return displayBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisplayBorder) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayBorder = displayBorder;
		displayBorder = newDisplayBorder == null ? DISPLAY_BORDER_EDEFAULT : newDisplayBorder;
		boolean oldDisplayBorderESet = displayBorderESet;
		displayBorderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SCENARIO_TYPE__DISPLAY_BORDER, oldDisplayBorder, displayBorder, !oldDisplayBorderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayBorder() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisplayBorder = displayBorder;
		boolean oldDisplayBorderESet = displayBorderESet;
		displayBorder = DISPLAY_BORDER_EDEFAULT;
		displayBorderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SCENARIO_TYPE__DISPLAY_BORDER, oldDisplayBorder, DISPLAY_BORDER_EDEFAULT, oldDisplayBorderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayBorder() {
		return displayBorderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIsActive) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsActive = isActive;
		isActive = newIsActive == null ? IS_ACTIVE_EDEFAULT : newIsActive;
		boolean oldIsActiveESet = isActiveESet;
		isActiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SCENARIO_TYPE__IS_ACTIVE, oldIsActive, isActive, !oldIsActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsActive() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsActive = isActive;
		boolean oldIsActiveESet = isActiveESet;
		isActive = IS_ACTIVE_EDEFAULT;
		isActiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SCENARIO_TYPE__IS_ACTIVE, oldIsActive, IS_ACTIVE_EDEFAULT, oldIsActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsActive() {
		return isActiveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected() {
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newProtected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		protected_ = newProtected == null ? PROTECTED_EDEFAULT : newProtected;
		boolean oldProtectedESet = protectedESet;
		protectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SCENARIO_TYPE__PROTECTED, oldProtected, protected_, !oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		boolean oldProtectedESet = protectedESet;
		protected_ = PROTECTED_EDEFAULT;
		protectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.SCENARIO_TYPE__PROTECTED, oldProtected, PROTECTED_EDEFAULT, oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtected() {
		return protectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScenarioRanges() {
		return scenarioRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioRanges(String newScenarioRanges) {
		String oldScenarioRanges = scenarioRanges;
		scenarioRanges = newScenarioRanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.SCENARIO_TYPE__SCENARIO_RANGES, oldScenarioRanges, scenarioRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.SCENARIO_TYPE__BORDER_COLOR:
				return getBorderColor();
			case TablePackage.SCENARIO_TYPE__COMMENT:
				return getComment();
			case TablePackage.SCENARIO_TYPE__COPY_BACK:
				return getCopyBack();
			case TablePackage.SCENARIO_TYPE__COPY_FORMULAS:
				return getCopyFormulas();
			case TablePackage.SCENARIO_TYPE__COPY_STYLES:
				return getCopyStyles();
			case TablePackage.SCENARIO_TYPE__DISPLAY_BORDER:
				return getDisplayBorder();
			case TablePackage.SCENARIO_TYPE__IS_ACTIVE:
				return getIsActive();
			case TablePackage.SCENARIO_TYPE__PROTECTED:
				return getProtected();
			case TablePackage.SCENARIO_TYPE__SCENARIO_RANGES:
				return getScenarioRanges();
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
			case TablePackage.SCENARIO_TYPE__BORDER_COLOR:
				setBorderColor((String)newValue);
				return;
			case TablePackage.SCENARIO_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case TablePackage.SCENARIO_TYPE__COPY_BACK:
				setCopyBack((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SCENARIO_TYPE__COPY_FORMULAS:
				setCopyFormulas((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SCENARIO_TYPE__COPY_STYLES:
				setCopyStyles((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SCENARIO_TYPE__DISPLAY_BORDER:
				setDisplayBorder((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SCENARIO_TYPE__IS_ACTIVE:
				setIsActive((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SCENARIO_TYPE__PROTECTED:
				setProtected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.SCENARIO_TYPE__SCENARIO_RANGES:
				setScenarioRanges((String)newValue);
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
			case TablePackage.SCENARIO_TYPE__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case TablePackage.SCENARIO_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TablePackage.SCENARIO_TYPE__COPY_BACK:
				unsetCopyBack();
				return;
			case TablePackage.SCENARIO_TYPE__COPY_FORMULAS:
				unsetCopyFormulas();
				return;
			case TablePackage.SCENARIO_TYPE__COPY_STYLES:
				unsetCopyStyles();
				return;
			case TablePackage.SCENARIO_TYPE__DISPLAY_BORDER:
				unsetDisplayBorder();
				return;
			case TablePackage.SCENARIO_TYPE__IS_ACTIVE:
				unsetIsActive();
				return;
			case TablePackage.SCENARIO_TYPE__PROTECTED:
				unsetProtected();
				return;
			case TablePackage.SCENARIO_TYPE__SCENARIO_RANGES:
				setScenarioRanges(SCENARIO_RANGES_EDEFAULT);
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
			case TablePackage.SCENARIO_TYPE__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? borderColor != null : !BORDER_COLOR_EDEFAULT.equals(borderColor);
			case TablePackage.SCENARIO_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case TablePackage.SCENARIO_TYPE__COPY_BACK:
				return isSetCopyBack();
			case TablePackage.SCENARIO_TYPE__COPY_FORMULAS:
				return isSetCopyFormulas();
			case TablePackage.SCENARIO_TYPE__COPY_STYLES:
				return isSetCopyStyles();
			case TablePackage.SCENARIO_TYPE__DISPLAY_BORDER:
				return isSetDisplayBorder();
			case TablePackage.SCENARIO_TYPE__IS_ACTIVE:
				return isSetIsActive();
			case TablePackage.SCENARIO_TYPE__PROTECTED:
				return isSetProtected();
			case TablePackage.SCENARIO_TYPE__SCENARIO_RANGES:
				return SCENARIO_RANGES_EDEFAULT == null ? scenarioRanges != null : !SCENARIO_RANGES_EDEFAULT.equals(scenarioRanges);
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
		result.append(" (borderColor: ");
		result.append(borderColor);
		result.append(", comment: ");
		result.append(comment);
		result.append(", copyBack: ");
		if (copyBackESet) result.append(copyBack); else result.append("<unset>");
		result.append(", copyFormulas: ");
		if (copyFormulasESet) result.append(copyFormulas); else result.append("<unset>");
		result.append(", copyStyles: ");
		if (copyStylesESet) result.append(copyStyles); else result.append("<unset>");
		result.append(", displayBorder: ");
		if (displayBorderESet) result.append(displayBorder); else result.append("<unset>");
		result.append(", isActive: ");
		if (isActiveESet) result.append(isActive); else result.append("<unset>");
		result.append(", protected: ");
		if (protectedESet) result.append(protected_); else result.append("<unset>");
		result.append(", scenarioRanges: ");
		result.append(scenarioRanges);
		result.append(')');
		return result.toString();
	}

} //ScenarioTypeImpl
