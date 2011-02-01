/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexSourceStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Index Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getUserIndexEntryTemplate <em>User Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getIndexSourceStyles <em>Index Source Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getCopyOutlineLevels <em>Copy Outline Levels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getUseFloatingFrames <em>Use Floating Frames</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getUseGraphics <em>Use Graphics</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getUseIndexMarks <em>Use Index Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getUseObjects <em>Use Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.UserIndexSourceTypeImpl#getUseTables <em>Use Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserIndexSourceTypeImpl extends EObjectImpl implements UserIndexSourceType {
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
	 * The cached value of the '{@link #getUserIndexEntryTemplate() <em>User Index Entry Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserIndexEntryTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<UserIndexEntryTemplateType> userIndexEntryTemplate;

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
	 * The default value of the '{@link #getCopyOutlineLevels() <em>Copy Outline Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyOutlineLevels()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean COPY_OUTLINE_LEVELS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCopyOutlineLevels() <em>Copy Outline Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyOutlineLevels()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean copyOutlineLevels = COPY_OUTLINE_LEVELS_EDEFAULT;

	/**
	 * This is true if the Copy Outline Levels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean copyOutlineLevelsESet;

	/**
	 * The default value of the '{@link #getIndexName() <em>Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexName() <em>Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName()
	 * @generated
	 * @ordered
	 */
	protected String indexName = INDEX_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getUseFloatingFrames() <em>Use Floating Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseFloatingFrames()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_FLOATING_FRAMES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseFloatingFrames() <em>Use Floating Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseFloatingFrames()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useFloatingFrames = USE_FLOATING_FRAMES_EDEFAULT;

	/**
	 * This is true if the Use Floating Frames attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useFloatingFramesESet;

	/**
	 * The default value of the '{@link #getUseGraphics() <em>Use Graphics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseGraphics()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_GRAPHICS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseGraphics() <em>Use Graphics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseGraphics()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useGraphics = USE_GRAPHICS_EDEFAULT;

	/**
	 * This is true if the Use Graphics attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useGraphicsESet;

	/**
	 * The default value of the '{@link #getUseIndexMarks() <em>Use Index Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseIndexMarks()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_INDEX_MARKS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

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
	 * The default value of the '{@link #getUseObjects() <em>Use Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseObjects()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_OBJECTS_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseObjects() <em>Use Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseObjects()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useObjects = USE_OBJECTS_EDEFAULT;

	/**
	 * This is true if the Use Objects attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useObjectsESet;

	/**
	 * The default value of the '{@link #getUseTables() <em>Use Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTables()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean USE_TABLES_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseTables() <em>Use Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTables()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean useTables = USE_TABLES_EDEFAULT;

	/**
	 * This is true if the Use Tables attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useTablesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserIndexSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getUserIndexSourceType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, oldIndexTitleTemplate, newIndexTitleTemplate);
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
				msgs = ((InternalEObject)indexTitleTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			if (newIndexTitleTemplate != null)
				msgs = ((InternalEObject)newIndexTitleTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, null, msgs);
			msgs = basicSetIndexTitleTemplate(newIndexTitleTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE, newIndexTitleTemplate, newIndexTitleTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexEntryTemplateType> getUserIndexEntryTemplate() {
		if (userIndexEntryTemplate == null) {
			userIndexEntryTemplate = new EObjectContainmentEList<UserIndexEntryTemplateType>(UserIndexEntryTemplateType.class, this, TextPackage.USER_INDEX_SOURCE_TYPE__USER_INDEX_ENTRY_TEMPLATE);
		}
		return userIndexEntryTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexSourceStylesType> getIndexSourceStyles() {
		if (indexSourceStyles == null) {
			indexSourceStyles = new EObjectContainmentEList<IndexSourceStylesType>(IndexSourceStylesType.class, this, TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SOURCE_STYLES);
		}
		return indexSourceStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyOutlineLevels() {
		return copyOutlineLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyOutlineLevels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newCopyOutlineLevels) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyOutlineLevels = copyOutlineLevels;
		copyOutlineLevels = newCopyOutlineLevels == null ? COPY_OUTLINE_LEVELS_EDEFAULT : newCopyOutlineLevels;
		boolean oldCopyOutlineLevelsESet = copyOutlineLevelsESet;
		copyOutlineLevelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__COPY_OUTLINE_LEVELS, oldCopyOutlineLevels, copyOutlineLevels, !oldCopyOutlineLevelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCopyOutlineLevels() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldCopyOutlineLevels = copyOutlineLevels;
		boolean oldCopyOutlineLevelsESet = copyOutlineLevelsESet;
		copyOutlineLevels = COPY_OUTLINE_LEVELS_EDEFAULT;
		copyOutlineLevelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_INDEX_SOURCE_TYPE__COPY_OUTLINE_LEVELS, oldCopyOutlineLevels, COPY_OUTLINE_LEVELS_EDEFAULT, oldCopyOutlineLevelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCopyOutlineLevels() {
		return copyOutlineLevelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexName() {
		return indexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexName(String newIndexName) {
		String oldIndexName = indexName;
		indexName = newIndexName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_NAME, oldIndexName, indexName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, indexScope, !oldIndexScopeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SCOPE, oldIndexScope, INDEX_SCOPE_EDEFAULT, oldIndexScopeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, relativeTabStopPosition, !oldRelativeTabStopPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION, oldRelativeTabStopPosition, RELATIVE_TAB_STOP_POSITION_EDEFAULT, oldRelativeTabStopPositionESet));
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
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseFloatingFrames() {
		return useFloatingFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFloatingFrames(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseFloatingFrames) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseFloatingFrames = useFloatingFrames;
		useFloatingFrames = newUseFloatingFrames == null ? USE_FLOATING_FRAMES_EDEFAULT : newUseFloatingFrames;
		boolean oldUseFloatingFramesESet = useFloatingFramesESet;
		useFloatingFramesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_FLOATING_FRAMES, oldUseFloatingFrames, useFloatingFrames, !oldUseFloatingFramesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseFloatingFrames() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseFloatingFrames = useFloatingFrames;
		boolean oldUseFloatingFramesESet = useFloatingFramesESet;
		useFloatingFrames = USE_FLOATING_FRAMES_EDEFAULT;
		useFloatingFramesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_FLOATING_FRAMES, oldUseFloatingFrames, USE_FLOATING_FRAMES_EDEFAULT, oldUseFloatingFramesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseFloatingFrames() {
		return useFloatingFramesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseGraphics() {
		return useGraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseGraphics(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseGraphics) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseGraphics = useGraphics;
		useGraphics = newUseGraphics == null ? USE_GRAPHICS_EDEFAULT : newUseGraphics;
		boolean oldUseGraphicsESet = useGraphicsESet;
		useGraphicsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_GRAPHICS, oldUseGraphics, useGraphics, !oldUseGraphicsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseGraphics() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseGraphics = useGraphics;
		boolean oldUseGraphicsESet = useGraphicsESet;
		useGraphics = USE_GRAPHICS_EDEFAULT;
		useGraphicsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_GRAPHICS, oldUseGraphics, USE_GRAPHICS_EDEFAULT, oldUseGraphicsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseGraphics() {
		return useGraphicsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_INDEX_MARKS, oldUseIndexMarks, useIndexMarks, !oldUseIndexMarksESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_INDEX_MARKS, oldUseIndexMarks, USE_INDEX_MARKS_EDEFAULT, oldUseIndexMarksESet));
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
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseObjects() {
		return useObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseObjects) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseObjects = useObjects;
		useObjects = newUseObjects == null ? USE_OBJECTS_EDEFAULT : newUseObjects;
		boolean oldUseObjectsESet = useObjectsESet;
		useObjectsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_OBJECTS, oldUseObjects, useObjects, !oldUseObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseObjects() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseObjects = useObjects;
		boolean oldUseObjectsESet = useObjectsESet;
		useObjects = USE_OBJECTS_EDEFAULT;
		useObjectsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_OBJECTS, oldUseObjects, USE_OBJECTS_EDEFAULT, oldUseObjectsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseObjects() {
		return useObjectsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseTables() {
		return useTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseTables(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newUseTables) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseTables = useTables;
		useTables = newUseTables == null ? USE_TABLES_EDEFAULT : newUseTables;
		boolean oldUseTablesESet = useTablesESet;
		useTablesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_TABLES, oldUseTables, useTables, !oldUseTablesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseTables() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldUseTables = useTables;
		boolean oldUseTablesESet = useTablesESet;
		useTables = USE_TABLES_EDEFAULT;
		useTablesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.USER_INDEX_SOURCE_TYPE__USE_TABLES, oldUseTables, USE_TABLES_EDEFAULT, oldUseTablesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseTables() {
		return useTablesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return basicSetIndexTitleTemplate(null, msgs);
			case TextPackage.USER_INDEX_SOURCE_TYPE__USER_INDEX_ENTRY_TEMPLATE:
				return ((InternalEList<?>)getUserIndexEntryTemplate()).basicRemove(otherEnd, msgs);
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SOURCE_STYLES:
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
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return getIndexTitleTemplate();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USER_INDEX_ENTRY_TEMPLATE:
				return getUserIndexEntryTemplate();
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SOURCE_STYLES:
				return getIndexSourceStyles();
			case TextPackage.USER_INDEX_SOURCE_TYPE__COPY_OUTLINE_LEVELS:
				return getCopyOutlineLevels();
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_NAME:
				return getIndexName();
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				return getIndexScope();
			case TextPackage.USER_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return getRelativeTabStopPosition();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_FLOATING_FRAMES:
				return getUseFloatingFrames();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_GRAPHICS:
				return getUseGraphics();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_INDEX_MARKS:
				return getUseIndexMarks();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_OBJECTS:
				return getUseObjects();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_TABLES:
				return getUseTables();
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
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USER_INDEX_ENTRY_TEMPLATE:
				getUserIndexEntryTemplate().clear();
				getUserIndexEntryTemplate().addAll((Collection<? extends UserIndexEntryTemplateType>)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SOURCE_STYLES:
				getIndexSourceStyles().clear();
				getIndexSourceStyles().addAll((Collection<? extends IndexSourceStylesType>)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__COPY_OUTLINE_LEVELS:
				setCopyOutlineLevels((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_NAME:
				setIndexName((String)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				setIndexScope((IndexScopeType)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				setRelativeTabStopPosition((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_FLOATING_FRAMES:
				setUseFloatingFrames((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_GRAPHICS:
				setUseGraphics((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_INDEX_MARKS:
				setUseIndexMarks((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_OBJECTS:
				setUseObjects((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_TABLES:
				setUseTables((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				setIndexTitleTemplate((IndexTitleTemplateType)null);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USER_INDEX_ENTRY_TEMPLATE:
				getUserIndexEntryTemplate().clear();
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SOURCE_STYLES:
				getIndexSourceStyles().clear();
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__COPY_OUTLINE_LEVELS:
				unsetCopyOutlineLevels();
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_NAME:
				setIndexName(INDEX_NAME_EDEFAULT);
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				unsetIndexScope();
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				unsetRelativeTabStopPosition();
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_FLOATING_FRAMES:
				unsetUseFloatingFrames();
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_GRAPHICS:
				unsetUseGraphics();
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_INDEX_MARKS:
				unsetUseIndexMarks();
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_OBJECTS:
				unsetUseObjects();
				return;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_TABLES:
				unsetUseTables();
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
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_TITLE_TEMPLATE:
				return indexTitleTemplate != null;
			case TextPackage.USER_INDEX_SOURCE_TYPE__USER_INDEX_ENTRY_TEMPLATE:
				return userIndexEntryTemplate != null && !userIndexEntryTemplate.isEmpty();
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SOURCE_STYLES:
				return indexSourceStyles != null && !indexSourceStyles.isEmpty();
			case TextPackage.USER_INDEX_SOURCE_TYPE__COPY_OUTLINE_LEVELS:
				return isSetCopyOutlineLevels();
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_NAME:
				return INDEX_NAME_EDEFAULT == null ? indexName != null : !INDEX_NAME_EDEFAULT.equals(indexName);
			case TextPackage.USER_INDEX_SOURCE_TYPE__INDEX_SCOPE:
				return isSetIndexScope();
			case TextPackage.USER_INDEX_SOURCE_TYPE__RELATIVE_TAB_STOP_POSITION:
				return isSetRelativeTabStopPosition();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_FLOATING_FRAMES:
				return isSetUseFloatingFrames();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_GRAPHICS:
				return isSetUseGraphics();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_INDEX_MARKS:
				return isSetUseIndexMarks();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_OBJECTS:
				return isSetUseObjects();
			case TextPackage.USER_INDEX_SOURCE_TYPE__USE_TABLES:
				return isSetUseTables();
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
		result.append(" (copyOutlineLevels: ");
		if (copyOutlineLevelsESet) result.append(copyOutlineLevels); else result.append("<unset>");
		result.append(", indexName: ");
		result.append(indexName);
		result.append(", indexScope: ");
		if (indexScopeESet) result.append(indexScope); else result.append("<unset>");
		result.append(", relativeTabStopPosition: ");
		if (relativeTabStopPositionESet) result.append(relativeTabStopPosition); else result.append("<unset>");
		result.append(", useFloatingFrames: ");
		if (useFloatingFramesESet) result.append(useFloatingFrames); else result.append("<unset>");
		result.append(", useGraphics: ");
		if (useGraphicsESet) result.append(useGraphics); else result.append("<unset>");
		result.append(", useIndexMarks: ");
		if (useIndexMarksESet) result.append(useIndexMarks); else result.append("<unset>");
		result.append(", useObjects: ");
		if (useObjectsESet) result.append(useObjects); else result.append("<unset>");
		result.append(", useTables: ");
		if (useTablesESet) result.append(useTables); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserIndexSourceTypeImpl
