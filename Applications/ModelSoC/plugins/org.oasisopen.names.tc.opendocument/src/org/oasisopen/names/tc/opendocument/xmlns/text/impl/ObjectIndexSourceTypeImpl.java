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
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextIllustrationIndexEntryContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Index Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ObjectIndexSourceTypeImpl#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ObjectIndexSourceTypeImpl#getObjectIndexEntryTemplate <em>Object Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ObjectIndexSourceTypeImpl#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ObjectIndexSourceTypeImpl#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ObjectIndexSourceTypeImpl#getUseChartObjects <em>Use Chart Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ObjectIndexSourceTypeImpl#getUseDrawObjects <em>Use Draw Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ObjectIndexSourceTypeImpl#getUseMathObjects <em>Use Math Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ObjectIndexSourceTypeImpl#getUseOtherObjects <em>Use Other Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.ObjectIndexSourceTypeImpl#getUseSpreadsheetObjects <em>Use Spreadsheet Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectIndexSourceTypeImpl extends EObjectImpl implements ObjectIndexSourceType {
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
	 * The cached value of the '{@link #getObjectIndexEntryTemplate() <em>Object Index Entry Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectIndexEntryTemplate()
	 * @generated
	 * @ordered
	 */
	protected TextIllustrationIndexEntryContent objectIndexEntryTemplate;

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
	 * The default value of the '{@link #getUseChartObjects() <em>Use Chart Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseChartObjects()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_CHART_OBJECTS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseChartObjects() <em>Use Chart Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseChartObjects()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useChartObjects = USE_CHART_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Use Chart Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useChartObjectsESet;

	/**
	 * The default value of the '{@link #getUseDrawObjects() <em>Use Draw Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDrawObjects()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_DRAW_OBJECTS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseDrawObjects() <em>Use Draw Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDrawObjects()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useDrawObjects = USE_DRAW_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Use Draw Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useDrawObjectsESet;

	/**
	 * The default value of the '{@link #getUseMathObjects() <em>Use Math Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseMathObjects()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_MATH_OBJECTS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseMathObjects() <em>Use Math Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseMathObjects()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useMathObjects = USE_MATH_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Use Math Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useMathObjectsESet;

	/**
	 * The default value of the '{@link #getUseOtherObjects() <em>Use Other Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOtherObjects()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_OTHER_OBJECTS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseOtherObjects() <em>Use Other Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOtherObjects()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useOtherObjects = USE_OTHER_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Use Other Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useOtherObjectsESet;

	/**
	 * The default value of the '{@link #getUseSpreadsheetObjects() <em>Use Spreadsheet Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseSpreadsheetObjects()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_SPREADSHEET_OBJECTS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseSpreadsheetObjects() <em>Use Spreadsheet Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseSpreadsheetObjects()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useSpreadsheetObjects = USE_SPREADSHEET_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Use Spreadsheet Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useSpreadsheetObjectsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectIndexSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getObjectIndexSourceType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, oldIndexTitleTemplate, newIndexTitleTemplate);
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
				msgs = ((InternalEObject)indexTitleTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			if (newIndexTitleTemplate != null)
				msgs = ((InternalEObject)newIndexTitleTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			msgs = basicSetIndexTitleTemplate(newIndexTitleTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, newIndexTitleTemplate, newIndexTitleTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextIllustrationIndexEntryContent getObjectIndexEntryTemplate() {
		return objectIndexEntryTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectIndexEntryTemplate(TextIllustrationIndexEntryContent newObjectIndexEntryTemplate, NotificationChain msgs) {
		TextIllustrationIndexEntryContent oldObjectIndexEntryTemplate = objectIndexEntryTemplate;
		objectIndexEntryTemplate = newObjectIndexEntryTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__OBJECT_INDEX_ENTRY_TEMPLATE, oldObjectIndexEntryTemplate, newObjectIndexEntryTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectIndexEntryTemplate(TextIllustrationIndexEntryContent newObjectIndexEntryTemplate) {
		if (newObjectIndexEntryTemplate != objectIndexEntryTemplate) {
			NotificationChain msgs = null;
			if (objectIndexEntryTemplate != null)
				msgs = ((InternalEObject)objectIndexEntryTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.OBJECT_INDEX_SOURCE_TYPE__OBJECT_INDEX_ENTRY_TEMPLATE, null, msgs);
			if (newObjectIndexEntryTemplate != null)
				msgs = ((InternalEObject)newObjectIndexEntryTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.OBJECT_INDEX_SOURCE_TYPE__OBJECT_INDEX_ENTRY_TEMPLATE, null, msgs);
			msgs = basicSetObjectIndexEntryTemplate(newObjectIndexEntryTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__OBJECT_INDEX_ENTRY_TEMPLATE, newObjectIndexEntryTemplate, newObjectIndexEntryTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, indexScope, !oldIndexScopeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, INDEX_SCOPE_EDEFAULT, oldIndexScopeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, relativeTabStopPosition, !oldRelativeTabStopPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, RELATIVE_TAB_STOP_POSITION_EDEFAULT, oldRelativeTabStopPositionESet));
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
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseChartObjects() {
		return useChartObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseChartObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseChartObjects) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseChartObjects = useChartObjects;
		useChartObjects = newUseChartObjects == null ? USE_CHART_OBJECTS_EDEFAULT : newUseChartObjects;
		boolean oldUseChartObjectsESet = useChartObjectsESet;
		useChartObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_CHART_OBJECTS, oldUseChartObjects, useChartObjects, !oldUseChartObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseChartObjects() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseChartObjects = useChartObjects;
		boolean oldUseChartObjectsESet = useChartObjectsESet;
		useChartObjects = USE_CHART_OBJECTS_EDEFAULT;
		useChartObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_CHART_OBJECTS, oldUseChartObjects, USE_CHART_OBJECTS_EDEFAULT, oldUseChartObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseChartObjects() {
		return useChartObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseDrawObjects() {
		return useDrawObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDrawObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseDrawObjects) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseDrawObjects = useDrawObjects;
		useDrawObjects = newUseDrawObjects == null ? USE_DRAW_OBJECTS_EDEFAULT : newUseDrawObjects;
		boolean oldUseDrawObjectsESet = useDrawObjectsESet;
		useDrawObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_DRAW_OBJECTS, oldUseDrawObjects, useDrawObjects, !oldUseDrawObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseDrawObjects() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseDrawObjects = useDrawObjects;
		boolean oldUseDrawObjectsESet = useDrawObjectsESet;
		useDrawObjects = USE_DRAW_OBJECTS_EDEFAULT;
		useDrawObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_DRAW_OBJECTS, oldUseDrawObjects, USE_DRAW_OBJECTS_EDEFAULT, oldUseDrawObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseDrawObjects() {
		return useDrawObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseMathObjects() {
		return useMathObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseMathObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseMathObjects) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseMathObjects = useMathObjects;
		useMathObjects = newUseMathObjects == null ? USE_MATH_OBJECTS_EDEFAULT : newUseMathObjects;
		boolean oldUseMathObjectsESet = useMathObjectsESet;
		useMathObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_MATH_OBJECTS, oldUseMathObjects, useMathObjects, !oldUseMathObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseMathObjects() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseMathObjects = useMathObjects;
		boolean oldUseMathObjectsESet = useMathObjectsESet;
		useMathObjects = USE_MATH_OBJECTS_EDEFAULT;
		useMathObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_MATH_OBJECTS, oldUseMathObjects, USE_MATH_OBJECTS_EDEFAULT, oldUseMathObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseMathObjects() {
		return useMathObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseOtherObjects() {
		return useOtherObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseOtherObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseOtherObjects) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseOtherObjects = useOtherObjects;
		useOtherObjects = newUseOtherObjects == null ? USE_OTHER_OBJECTS_EDEFAULT : newUseOtherObjects;
		boolean oldUseOtherObjectsESet = useOtherObjectsESet;
		useOtherObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_OTHER_OBJECTS, oldUseOtherObjects, useOtherObjects, !oldUseOtherObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseOtherObjects() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseOtherObjects = useOtherObjects;
		boolean oldUseOtherObjectsESet = useOtherObjectsESet;
		useOtherObjects = USE_OTHER_OBJECTS_EDEFAULT;
		useOtherObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_OTHER_OBJECTS, oldUseOtherObjects, USE_OTHER_OBJECTS_EDEFAULT, oldUseOtherObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseOtherObjects() {
		return useOtherObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseSpreadsheetObjects() {
		return useSpreadsheetObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseSpreadsheetObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseSpreadsheetObjects) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseSpreadsheetObjects = useSpreadsheetObjects;
		useSpreadsheetObjects = newUseSpreadsheetObjects == null ? USE_SPREADSHEET_OBJECTS_EDEFAULT : newUseSpreadsheetObjects;
		boolean oldUseSpreadsheetObjectsESet = useSpreadsheetObjectsESet;
		useSpreadsheetObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_SPREADSHEET_OBJECTS, oldUseSpreadsheetObjects, useSpreadsheetObjects, !oldUseSpreadsheetObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseSpreadsheetObjects() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseSpreadsheetObjects = useSpreadsheetObjects;
		boolean oldUseSpreadsheetObjectsESet = useSpreadsheetObjectsESet;
		useSpreadsheetObjects = USE_SPREADSHEET_OBJECTS_EDEFAULT;
		useSpreadsheetObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_SPREADSHEET_OBJECTS, oldUseSpreadsheetObjects, USE_SPREADSHEET_OBJECTS_EDEFAULT, oldUseSpreadsheetObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseSpreadsheetObjects() {
		return useSpreadsheetObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return basicSetIndexTitleTemplate(null, msgs);
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__OBJECT_INDEX_ENTRY_TEMPLATE:
				return basicSetObjectIndexEntryTemplate(null, msgs);
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
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return getIndexTitleTemplate();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__OBJECT_INDEX_ENTRY_TEMPLATE:
				return getObjectIndexEntryTemplate();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				return getIndexScope();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return getRelativeTabStopPosition();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_CHART_OBJECTS:
				return getUseChartObjects();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_DRAW_OBJECTS:
				return getUseDrawObjects();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_MATH_OBJECTS:
				return getUseMathObjects();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_OTHER_OBJECTS:
				return getUseOtherObjects();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_SPREADSHEET_OBJECTS:
				return getUseSpreadsheetObjects();
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
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)newValue);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__OBJECT_INDEX_ENTRY_TEMPLATE:
				setObjectIndexEntryTemplate((TextIllustrationIndexEntryContent)newValue);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				setIndexScope((IndexScopeType)newValue);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				setRelativeTabStopPosition((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_CHART_OBJECTS:
				setUseChartObjects((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_DRAW_OBJECTS:
				setUseDrawObjects((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_MATH_OBJECTS:
				setUseMathObjects((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_OTHER_OBJECTS:
				setUseOtherObjects((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_SPREADSHEET_OBJECTS:
				setUseSpreadsheetObjects((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)null);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__OBJECT_INDEX_ENTRY_TEMPLATE:
				setObjectIndexEntryTemplate((TextIllustrationIndexEntryContent)null);
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				unsetIndexScope();
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				unsetRelativeTabStopPosition();
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_CHART_OBJECTS:
				unsetUseChartObjects();
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_DRAW_OBJECTS:
				unsetUseDrawObjects();
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_MATH_OBJECTS:
				unsetUseMathObjects();
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_OTHER_OBJECTS:
				unsetUseOtherObjects();
				return;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_SPREADSHEET_OBJECTS:
				unsetUseSpreadsheetObjects();
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
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return indexTitleTemplate != null;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__OBJECT_INDEX_ENTRY_TEMPLATE:
				return objectIndexEntryTemplate != null;
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				return isSetIndexScope();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return isSetRelativeTabStopPosition();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_CHART_OBJECTS:
				return isSetUseChartObjects();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_DRAW_OBJECTS:
				return isSetUseDrawObjects();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_MATH_OBJECTS:
				return isSetUseMathObjects();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_OTHER_OBJECTS:
				return isSetUseOtherObjects();
			case TextPackage.OBJECT_INDEX_SOURCE_TYPE__USE_SPREADSHEET_OBJECTS:
				return isSetUseSpreadsheetObjects();
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
		result.append(", relativeTabStopPosition: ");
		if (relativeTabStopPositionESet) result.append(relativeTabStopPosition); else result.append("<unset>");
		result.append(", useChartObjects: ");
		if (useChartObjectsESet) result.append(useChartObjects); else result.append("<unset>");
		result.append(", useDrawObjects: ");
		if (useDrawObjectsESet) result.append(useDrawObjects); else result.append("<unset>");
		result.append(", useMathObjects: ");
		if (useMathObjectsESet) result.append(useMathObjects); else result.append("<unset>");
		result.append(", useOtherObjects: ");
		if (useOtherObjectsESet) result.append(useOtherObjects); else result.append("<unset>");
		result.append(", useSpreadsheetObjects: ");
		if (useSpreadsheetObjectsESet) result.append(useSpreadsheetObjects); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObjectIndexSourceTypeImpl
