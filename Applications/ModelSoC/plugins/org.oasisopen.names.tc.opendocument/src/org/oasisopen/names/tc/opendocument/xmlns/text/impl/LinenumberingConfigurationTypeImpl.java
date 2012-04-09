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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType;
import org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingSeparatorType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NumberPositionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linenumbering Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getLinenumberingSeparator <em>Linenumbering Separator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getCountEmptyLines <em>Count Empty Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getCountInTextBoxes <em>Count In Text Boxes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getNumberLines <em>Number Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getNumberPosition <em>Number Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getRestartOnPage <em>Restart On Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.LinenumberingConfigurationTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinenumberingConfigurationTypeImpl extends EObjectImpl implements LinenumberingConfigurationType {
	/**
	 * The cached value of the '{@link #getLinenumberingSeparator() <em>Linenumbering Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinenumberingSeparator()
	 * @generated
	 * @ordered
	 */
	protected LinenumberingSeparatorType linenumberingSeparator;

	/**
	 * The default value of the '{@link #getCountEmptyLines() <em>Count Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COUNT_EMPTY_LINES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCountEmptyLines() <em>Count Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountEmptyLines()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean countEmptyLines = COUNT_EMPTY_LINES_EDEFAULT;

	/**
	 * This is true if the Count Empty Lines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countEmptyLinesESet;

	/**
	 * The default value of the '{@link #getCountInTextBoxes() <em>Count In Text Boxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountInTextBoxes()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COUNT_IN_TEXT_BOXES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCountInTextBoxes() <em>Count In Text Boxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountInTextBoxes()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean countInTextBoxes = COUNT_IN_TEXT_BOXES_EDEFAULT;

	/**
	 * This is true if the Count In Text Boxes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countInTextBoxesESet;

	/**
	 * The default value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger INCREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected BigInteger increment = INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberLines() <em>Number Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberLines()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean NUMBER_LINES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getNumberLines() <em>Number Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberLines()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean numberLines = NUMBER_LINES_EDEFAULT;

	/**
	 * This is true if the Number Lines attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberLinesESet;

	/**
	 * The default value of the '{@link #getNumberPosition() <em>Number Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberPosition()
	 * @generated
	 * @ordered
	 */
	protected static final NumberPositionType NUMBER_POSITION_EDEFAULT = NumberPositionType.LEFT;

	/**
	 * The cached value of the '{@link #getNumberPosition() <em>Number Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberPosition()
	 * @generated
	 * @ordered
	 */
	protected NumberPositionType numberPosition = NUMBER_POSITION_EDEFAULT;

	/**
	 * This is true if the Number Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberPositionESet;

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
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestartOnPage() <em>Restart On Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartOnPage()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean RESTART_ON_PAGE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRestartOnPage() <em>Restart On Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartOnPage()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean restartOnPage = RESTART_ON_PAGE_EDEFAULT;

	/**
	 * This is true if the Restart On Page attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean restartOnPageESet;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinenumberingConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getLinenumberingConfigurationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinenumberingSeparatorType getLinenumberingSeparator() {
		return linenumberingSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinenumberingSeparator(LinenumberingSeparatorType newLinenumberingSeparator, NotificationChain msgs) {
		LinenumberingSeparatorType oldLinenumberingSeparator = linenumberingSeparator;
		linenumberingSeparator = newLinenumberingSeparator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__LINENUMBERING_SEPARATOR, oldLinenumberingSeparator, newLinenumberingSeparator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinenumberingSeparator(LinenumberingSeparatorType newLinenumberingSeparator) {
		if (newLinenumberingSeparator != linenumberingSeparator) {
			NotificationChain msgs = null;
			if (linenumberingSeparator != null)
				msgs = ((InternalEObject)linenumberingSeparator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.LINENUMBERING_CONFIGURATION_TYPE__LINENUMBERING_SEPARATOR, null, msgs);
			if (newLinenumberingSeparator != null)
				msgs = ((InternalEObject)newLinenumberingSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.LINENUMBERING_CONFIGURATION_TYPE__LINENUMBERING_SEPARATOR, null, msgs);
			msgs = basicSetLinenumberingSeparator(newLinenumberingSeparator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__LINENUMBERING_SEPARATOR, newLinenumberingSeparator, newLinenumberingSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCountEmptyLines() {
		return countEmptyLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCountEmptyLines) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCountEmptyLines = countEmptyLines;
		countEmptyLines = newCountEmptyLines == null ? COUNT_EMPTY_LINES_EDEFAULT : newCountEmptyLines;
		boolean oldCountEmptyLinesESet = countEmptyLinesESet;
		countEmptyLinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_EMPTY_LINES, oldCountEmptyLines, countEmptyLines, !oldCountEmptyLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCountEmptyLines() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCountEmptyLines = countEmptyLines;
		boolean oldCountEmptyLinesESet = countEmptyLinesESet;
		countEmptyLines = COUNT_EMPTY_LINES_EDEFAULT;
		countEmptyLinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_EMPTY_LINES, oldCountEmptyLines, COUNT_EMPTY_LINES_EDEFAULT, oldCountEmptyLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCountEmptyLines() {
		return countEmptyLinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCountInTextBoxes() {
		return countInTextBoxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountInTextBoxes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCountInTextBoxes) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCountInTextBoxes = countInTextBoxes;
		countInTextBoxes = newCountInTextBoxes == null ? COUNT_IN_TEXT_BOXES_EDEFAULT : newCountInTextBoxes;
		boolean oldCountInTextBoxesESet = countInTextBoxesESet;
		countInTextBoxesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_IN_TEXT_BOXES, oldCountInTextBoxes, countInTextBoxes, !oldCountInTextBoxesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCountInTextBoxes() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCountInTextBoxes = countInTextBoxes;
		boolean oldCountInTextBoxesESet = countInTextBoxesESet;
		countInTextBoxes = COUNT_IN_TEXT_BOXES_EDEFAULT;
		countInTextBoxesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_IN_TEXT_BOXES, oldCountInTextBoxes, COUNT_IN_TEXT_BOXES_EDEFAULT, oldCountInTextBoxesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCountInTextBoxes() {
		return countInTextBoxesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(BigInteger newIncrement) {
		BigInteger oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__INCREMENT, oldIncrement, increment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumberLines() {
		return numberLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newNumberLines) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumberLines = numberLines;
		numberLines = newNumberLines == null ? NUMBER_LINES_EDEFAULT : newNumberLines;
		boolean oldNumberLinesESet = numberLinesESet;
		numberLinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_LINES, oldNumberLines, numberLines, !oldNumberLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberLines() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldNumberLines = numberLines;
		boolean oldNumberLinesESet = numberLinesESet;
		numberLines = NUMBER_LINES_EDEFAULT;
		numberLinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_LINES, oldNumberLines, NUMBER_LINES_EDEFAULT, oldNumberLinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberLines() {
		return numberLinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberPositionType getNumberPosition() {
		return numberPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberPosition(NumberPositionType newNumberPosition) {
		NumberPositionType oldNumberPosition = numberPosition;
		numberPosition = newNumberPosition == null ? NUMBER_POSITION_EDEFAULT : newNumberPosition;
		boolean oldNumberPositionESet = numberPositionESet;
		numberPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_POSITION, oldNumberPosition, numberPosition, !oldNumberPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberPosition() {
		NumberPositionType oldNumberPosition = numberPosition;
		boolean oldNumberPositionESet = numberPositionESet;
		numberPosition = NUMBER_POSITION_EDEFAULT;
		numberPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_POSITION, oldNumberPosition, NUMBER_POSITION_EDEFAULT, oldNumberPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberPosition() {
		return numberPositionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_FORMAT, oldNumFormat, numFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, numLetterSync, !oldNumLetterSyncESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_LETTER_SYNC, oldNumLetterSync, NUM_LETTER_SYNC_EDEFAULT, oldNumLetterSyncESet));
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
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRestartOnPage() {
		return restartOnPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartOnPage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newRestartOnPage) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRestartOnPage = restartOnPage;
		restartOnPage = newRestartOnPage == null ? RESTART_ON_PAGE_EDEFAULT : newRestartOnPage;
		boolean oldRestartOnPageESet = restartOnPageESet;
		restartOnPageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__RESTART_ON_PAGE, oldRestartOnPage, restartOnPage, !oldRestartOnPageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRestartOnPage() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldRestartOnPage = restartOnPage;
		boolean oldRestartOnPageESet = restartOnPageESet;
		restartOnPage = RESTART_ON_PAGE_EDEFAULT;
		restartOnPageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__RESTART_ON_PAGE, oldRestartOnPage, RESTART_ON_PAGE_EDEFAULT, oldRestartOnPageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRestartOnPage() {
		return restartOnPageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.LINENUMBERING_CONFIGURATION_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__LINENUMBERING_SEPARATOR:
				return basicSetLinenumberingSeparator(null, msgs);
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
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__LINENUMBERING_SEPARATOR:
				return getLinenumberingSeparator();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_EMPTY_LINES:
				return getCountEmptyLines();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_IN_TEXT_BOXES:
				return getCountInTextBoxes();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__INCREMENT:
				return getIncrement();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_LINES:
				return getNumberLines();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_POSITION:
				return getNumberPosition();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_FORMAT:
				return getNumFormat();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_LETTER_SYNC:
				return getNumLetterSync();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__OFFSET:
				return getOffset();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__RESTART_ON_PAGE:
				return getRestartOnPage();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__STYLE_NAME:
				return getStyleName();
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
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__LINENUMBERING_SEPARATOR:
				setLinenumberingSeparator((LinenumberingSeparatorType)newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_EMPTY_LINES:
				setCountEmptyLines((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_IN_TEXT_BOXES:
				setCountInTextBoxes((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__INCREMENT:
				setIncrement((BigInteger)newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_LINES:
				setNumberLines((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_POSITION:
				setNumberPosition((NumberPositionType)newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_FORMAT:
				setNumFormat(newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_LETTER_SYNC:
				setNumLetterSync((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__OFFSET:
				setOffset((String)newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__RESTART_ON_PAGE:
				setRestartOnPage((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
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
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__LINENUMBERING_SEPARATOR:
				setLinenumberingSeparator((LinenumberingSeparatorType)null);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_EMPTY_LINES:
				unsetCountEmptyLines();
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_IN_TEXT_BOXES:
				unsetCountInTextBoxes();
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__INCREMENT:
				setIncrement(INCREMENT_EDEFAULT);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_LINES:
				unsetNumberLines();
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_POSITION:
				unsetNumberPosition();
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_FORMAT:
				setNumFormat(NUM_FORMAT_EDEFAULT);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_LETTER_SYNC:
				unsetNumLetterSync();
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__RESTART_ON_PAGE:
				unsetRestartOnPage();
				return;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
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
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__LINENUMBERING_SEPARATOR:
				return linenumberingSeparator != null;
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_EMPTY_LINES:
				return isSetCountEmptyLines();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__COUNT_IN_TEXT_BOXES:
				return isSetCountInTextBoxes();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__INCREMENT:
				return INCREMENT_EDEFAULT == null ? increment != null : !INCREMENT_EDEFAULT.equals(increment);
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_LINES:
				return isSetNumberLines();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUMBER_POSITION:
				return isSetNumberPosition();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_FORMAT:
				return NUM_FORMAT_EDEFAULT == null ? numFormat != null : !NUM_FORMAT_EDEFAULT.equals(numFormat);
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__NUM_LETTER_SYNC:
				return isSetNumLetterSync();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__RESTART_ON_PAGE:
				return isSetRestartOnPage();
			case TextPackage.LINENUMBERING_CONFIGURATION_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
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
		result.append(" (countEmptyLines: ");
		if (countEmptyLinesESet) result.append(countEmptyLines); else result.append("<unset>");
		result.append(", countInTextBoxes: ");
		if (countInTextBoxesESet) result.append(countInTextBoxes); else result.append("<unset>");
		result.append(", increment: ");
		result.append(increment);
		result.append(", numberLines: ");
		if (numberLinesESet) result.append(numberLines); else result.append("<unset>");
		result.append(", numberPosition: ");
		if (numberPositionESet) result.append(numberPosition); else result.append("<unset>");
		result.append(", numFormat: ");
		result.append(numFormat);
		result.append(", numLetterSync: ");
		if (numLetterSyncESet) result.append(numLetterSync); else result.append("<unset>");
		result.append(", offset: ");
		result.append(offset);
		result.append(", restartOnPage: ");
		if (restartOnPageESet) result.append(restartOnPage); else result.append("<unset>");
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //LinenumberingConfigurationTypeImpl
