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
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexAutoMarkFileType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType;
import org.oasisopen.names.tc.opendocument.xmlns.text.DdeConnectionDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.HType;
import org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.PType;
import org.oasisopen.names.tc.opendocument.xmlns.text.RegionContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.SectionType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.TrackedChangesType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserFieldDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType;
import org.oasisopen.names.tc.opendocument.xmlns.text.VariableDeclsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Footer Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getTrackedChanges <em>Tracked Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getVariableDecls <em>Variable Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getSequenceDecls <em>Sequence Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getUserFieldDecls <em>User Field Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getDdeConnectionDecls <em>Dde Connection Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getIndexTitle <em>Index Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getRegionLeft <em>Region Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getRegionCenter <em>Region Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.HeaderFooterContentImpl#getRegionRight <em>Region Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeaderFooterContentImpl extends EObjectImpl implements HeaderFooterContent {
	/**
	 * The cached value of the '{@link #getTrackedChanges() <em>Tracked Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackedChanges()
	 * @generated
	 * @ordered
	 */
	protected TrackedChangesType trackedChanges;

	/**
	 * The cached value of the '{@link #getVariableDecls() <em>Variable Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDecls()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclsType variableDecls;

	/**
	 * The cached value of the '{@link #getSequenceDecls() <em>Sequence Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDecls()
	 * @generated
	 * @ordered
	 */
	protected SequenceDeclsType sequenceDecls;

	/**
	 * The cached value of the '{@link #getUserFieldDecls() <em>User Field Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFieldDecls()
	 * @generated
	 * @ordered
	 */
	protected UserFieldDeclsType userFieldDecls;

	/**
	 * The cached value of the '{@link #getDdeConnectionDecls() <em>Dde Connection Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeConnectionDecls()
	 * @generated
	 * @ordered
	 */
	protected DdeConnectionDeclsType ddeConnectionDecls;

	/**
	 * The cached value of the '{@link #getAlphabeticalIndexAutoMarkFile() <em>Alphabetical Index Auto Mark File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabeticalIndexAutoMarkFile()
	 * @generated
	 * @ordered
	 */
	protected AlphabeticalIndexAutoMarkFileType alphabeticalIndexAutoMarkFile;

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
	 * The cached value of the '{@link #getRegionLeft() <em>Region Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionLeft()
	 * @generated
	 * @ordered
	 */
	protected RegionContent regionLeft;

	/**
	 * The cached value of the '{@link #getRegionCenter() <em>Region Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionCenter()
	 * @generated
	 * @ordered
	 */
	protected RegionContent regionCenter;

	/**
	 * The cached value of the '{@link #getRegionRight() <em>Region Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionRight()
	 * @generated
	 * @ordered
	 */
	protected RegionContent regionRight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderFooterContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getHeaderFooterContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackedChangesType getTrackedChanges() {
		return trackedChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackedChanges(TrackedChangesType newTrackedChanges, NotificationChain msgs) {
		TrackedChangesType oldTrackedChanges = trackedChanges;
		trackedChanges = newTrackedChanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES, oldTrackedChanges, newTrackedChanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackedChanges(TrackedChangesType newTrackedChanges) {
		if (newTrackedChanges != trackedChanges) {
			NotificationChain msgs = null;
			if (trackedChanges != null)
				msgs = ((InternalEObject)trackedChanges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES, null, msgs);
			if (newTrackedChanges != null)
				msgs = ((InternalEObject)newTrackedChanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES, null, msgs);
			msgs = basicSetTrackedChanges(newTrackedChanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES, newTrackedChanges, newTrackedChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclsType getVariableDecls() {
		return variableDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableDecls(VariableDeclsType newVariableDecls, NotificationChain msgs) {
		VariableDeclsType oldVariableDecls = variableDecls;
		variableDecls = newVariableDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS, oldVariableDecls, newVariableDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDecls(VariableDeclsType newVariableDecls) {
		if (newVariableDecls != variableDecls) {
			NotificationChain msgs = null;
			if (variableDecls != null)
				msgs = ((InternalEObject)variableDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS, null, msgs);
			if (newVariableDecls != null)
				msgs = ((InternalEObject)newVariableDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS, null, msgs);
			msgs = basicSetVariableDecls(newVariableDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS, newVariableDecls, newVariableDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDeclsType getSequenceDecls() {
		return sequenceDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceDecls(SequenceDeclsType newSequenceDecls, NotificationChain msgs) {
		SequenceDeclsType oldSequenceDecls = sequenceDecls;
		sequenceDecls = newSequenceDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS, oldSequenceDecls, newSequenceDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceDecls(SequenceDeclsType newSequenceDecls) {
		if (newSequenceDecls != sequenceDecls) {
			NotificationChain msgs = null;
			if (sequenceDecls != null)
				msgs = ((InternalEObject)sequenceDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS, null, msgs);
			if (newSequenceDecls != null)
				msgs = ((InternalEObject)newSequenceDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS, null, msgs);
			msgs = basicSetSequenceDecls(newSequenceDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS, newSequenceDecls, newSequenceDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFieldDeclsType getUserFieldDecls() {
		return userFieldDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserFieldDecls(UserFieldDeclsType newUserFieldDecls, NotificationChain msgs) {
		UserFieldDeclsType oldUserFieldDecls = userFieldDecls;
		userFieldDecls = newUserFieldDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS, oldUserFieldDecls, newUserFieldDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFieldDecls(UserFieldDeclsType newUserFieldDecls) {
		if (newUserFieldDecls != userFieldDecls) {
			NotificationChain msgs = null;
			if (userFieldDecls != null)
				msgs = ((InternalEObject)userFieldDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS, null, msgs);
			if (newUserFieldDecls != null)
				msgs = ((InternalEObject)newUserFieldDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS, null, msgs);
			msgs = basicSetUserFieldDecls(newUserFieldDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS, newUserFieldDecls, newUserFieldDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdeConnectionDeclsType getDdeConnectionDecls() {
		return ddeConnectionDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeConnectionDecls(DdeConnectionDeclsType newDdeConnectionDecls, NotificationChain msgs) {
		DdeConnectionDeclsType oldDdeConnectionDecls = ddeConnectionDecls;
		ddeConnectionDecls = newDdeConnectionDecls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS, oldDdeConnectionDecls, newDdeConnectionDecls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeConnectionDecls(DdeConnectionDeclsType newDdeConnectionDecls) {
		if (newDdeConnectionDecls != ddeConnectionDecls) {
			NotificationChain msgs = null;
			if (ddeConnectionDecls != null)
				msgs = ((InternalEObject)ddeConnectionDecls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS, null, msgs);
			if (newDdeConnectionDecls != null)
				msgs = ((InternalEObject)newDdeConnectionDecls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS, null, msgs);
			msgs = basicSetDdeConnectionDecls(newDdeConnectionDecls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS, newDdeConnectionDecls, newDdeConnectionDecls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabeticalIndexAutoMarkFileType getAlphabeticalIndexAutoMarkFile() {
		return alphabeticalIndexAutoMarkFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType newAlphabeticalIndexAutoMarkFile, NotificationChain msgs) {
		AlphabeticalIndexAutoMarkFileType oldAlphabeticalIndexAutoMarkFile = alphabeticalIndexAutoMarkFile;
		alphabeticalIndexAutoMarkFile = newAlphabeticalIndexAutoMarkFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE, oldAlphabeticalIndexAutoMarkFile, newAlphabeticalIndexAutoMarkFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType newAlphabeticalIndexAutoMarkFile) {
		if (newAlphabeticalIndexAutoMarkFile != alphabeticalIndexAutoMarkFile) {
			NotificationChain msgs = null;
			if (alphabeticalIndexAutoMarkFile != null)
				msgs = ((InternalEObject)alphabeticalIndexAutoMarkFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE, null, msgs);
			if (newAlphabeticalIndexAutoMarkFile != null)
				msgs = ((InternalEObject)newAlphabeticalIndexAutoMarkFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE, null, msgs);
			msgs = basicSetAlphabeticalIndexAutoMarkFile(newAlphabeticalIndexAutoMarkFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE, newAlphabeticalIndexAutoMarkFile, newAlphabeticalIndexAutoMarkFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TextPackage.HEADER_FOOTER_CONTENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HType> getH() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_H());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListType> getList() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionType> getSection() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_Section());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableOfContentType> getTableOfContent() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_TableOfContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IllustrationIndexType> getIllustrationIndex() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_IllustrationIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableIndexType> getTableIndex() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_TableIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIndexType> getObjectIndex() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_ObjectIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIndexType> getUserIndex() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_UserIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlphabeticalIndexType> getAlphabeticalIndex() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_AlphabeticalIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyType> getBibliography() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_Bibliography());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexTitleType> getIndexTitle() {
		return getGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_IndexTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getChangeMarksGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(TextPackage.eINSTANCE.getHeaderFooterContent_ChangeMarksGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeMarksType> getChangeMarks() {
		return getChangeMarksGroup().list(TextPackage.eINSTANCE.getHeaderFooterContent_ChangeMarks());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionContent getRegionLeft() {
		return regionLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionLeft(RegionContent newRegionLeft, NotificationChain msgs) {
		RegionContent oldRegionLeft = regionLeft;
		regionLeft = newRegionLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT, oldRegionLeft, newRegionLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionLeft(RegionContent newRegionLeft) {
		if (newRegionLeft != regionLeft) {
			NotificationChain msgs = null;
			if (regionLeft != null)
				msgs = ((InternalEObject)regionLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT, null, msgs);
			if (newRegionLeft != null)
				msgs = ((InternalEObject)newRegionLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT, null, msgs);
			msgs = basicSetRegionLeft(newRegionLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT, newRegionLeft, newRegionLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionContent getRegionCenter() {
		return regionCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionCenter(RegionContent newRegionCenter, NotificationChain msgs) {
		RegionContent oldRegionCenter = regionCenter;
		regionCenter = newRegionCenter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER, oldRegionCenter, newRegionCenter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionCenter(RegionContent newRegionCenter) {
		if (newRegionCenter != regionCenter) {
			NotificationChain msgs = null;
			if (regionCenter != null)
				msgs = ((InternalEObject)regionCenter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER, null, msgs);
			if (newRegionCenter != null)
				msgs = ((InternalEObject)newRegionCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER, null, msgs);
			msgs = basicSetRegionCenter(newRegionCenter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER, newRegionCenter, newRegionCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionContent getRegionRight() {
		return regionRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegionRight(RegionContent newRegionRight, NotificationChain msgs) {
		RegionContent oldRegionRight = regionRight;
		regionRight = newRegionRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT, oldRegionRight, newRegionRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionRight(RegionContent newRegionRight) {
		if (newRegionRight != regionRight) {
			NotificationChain msgs = null;
			if (regionRight != null)
				msgs = ((InternalEObject)regionRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT, null, msgs);
			if (newRegionRight != null)
				msgs = ((InternalEObject)newRegionRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT, null, msgs);
			msgs = basicSetRegionRight(newRegionRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT, newRegionRight, newRegionRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES:
				return basicSetTrackedChanges(null, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS:
				return basicSetVariableDecls(null, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS:
				return basicSetSequenceDecls(null, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS:
				return basicSetUserFieldDecls(null, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS:
				return basicSetDdeConnectionDecls(null, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return basicSetAlphabeticalIndexAutoMarkFile(null, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__H:
				return ((InternalEList<?>)getH()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_OF_CONTENT:
				return ((InternalEList<?>)getTableOfContent()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__ILLUSTRATION_INDEX:
				return ((InternalEList<?>)getIllustrationIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_INDEX:
				return ((InternalEList<?>)getTableIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__OBJECT_INDEX:
				return ((InternalEList<?>)getObjectIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__USER_INDEX:
				return ((InternalEList<?>)getUserIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX:
				return ((InternalEList<?>)getAlphabeticalIndex()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__BIBLIOGRAPHY:
				return ((InternalEList<?>)getBibliography()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__INDEX_TITLE:
				return ((InternalEList<?>)getIndexTitle()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS_GROUP:
				return ((InternalEList<?>)getChangeMarksGroup()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS:
				return ((InternalEList<?>)getChangeMarks()).basicRemove(otherEnd, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT:
				return basicSetRegionLeft(null, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER:
				return basicSetRegionCenter(null, msgs);
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT:
				return basicSetRegionRight(null, msgs);
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
			case TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES:
				return getTrackedChanges();
			case TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS:
				return getVariableDecls();
			case TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS:
				return getSequenceDecls();
			case TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS:
				return getUserFieldDecls();
			case TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS:
				return getDdeConnectionDecls();
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return getAlphabeticalIndexAutoMarkFile();
			case TextPackage.HEADER_FOOTER_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TextPackage.HEADER_FOOTER_CONTENT__H:
				return getH();
			case TextPackage.HEADER_FOOTER_CONTENT__P:
				return getP();
			case TextPackage.HEADER_FOOTER_CONTENT__LIST:
				return getList();
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE:
				return getTable();
			case TextPackage.HEADER_FOOTER_CONTENT__SECTION:
				return getSection();
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_OF_CONTENT:
				return getTableOfContent();
			case TextPackage.HEADER_FOOTER_CONTENT__ILLUSTRATION_INDEX:
				return getIllustrationIndex();
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_INDEX:
				return getTableIndex();
			case TextPackage.HEADER_FOOTER_CONTENT__OBJECT_INDEX:
				return getObjectIndex();
			case TextPackage.HEADER_FOOTER_CONTENT__USER_INDEX:
				return getUserIndex();
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX:
				return getAlphabeticalIndex();
			case TextPackage.HEADER_FOOTER_CONTENT__BIBLIOGRAPHY:
				return getBibliography();
			case TextPackage.HEADER_FOOTER_CONTENT__INDEX_TITLE:
				return getIndexTitle();
			case TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS_GROUP:
				if (coreType) return getChangeMarksGroup();
				return ((FeatureMap.Internal)getChangeMarksGroup()).getWrapper();
			case TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS:
				return getChangeMarks();
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT:
				return getRegionLeft();
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER:
				return getRegionCenter();
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT:
				return getRegionRight();
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
			case TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS:
				setVariableDecls((VariableDeclsType)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS:
				setSequenceDecls((SequenceDeclsType)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS:
				setUserFieldDecls((UserFieldDeclsType)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS:
				setDdeConnectionDecls((DdeConnectionDeclsType)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				setAlphabeticalIndexAutoMarkFile((AlphabeticalIndexAutoMarkFileType)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__H:
				getH().clear();
				getH().addAll((Collection<? extends HType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__LIST:
				getList().clear();
				getList().addAll((Collection<? extends ListType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends SectionType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				getTableOfContent().addAll((Collection<? extends TableOfContentType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				getIllustrationIndex().addAll((Collection<? extends IllustrationIndexType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_INDEX:
				getTableIndex().clear();
				getTableIndex().addAll((Collection<? extends TableIndexType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__OBJECT_INDEX:
				getObjectIndex().clear();
				getObjectIndex().addAll((Collection<? extends ObjectIndexType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__USER_INDEX:
				getUserIndex().clear();
				getUserIndex().addAll((Collection<? extends UserIndexType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				getAlphabeticalIndex().addAll((Collection<? extends AlphabeticalIndexType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__BIBLIOGRAPHY:
				getBibliography().clear();
				getBibliography().addAll((Collection<? extends BibliographyType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__INDEX_TITLE:
				getIndexTitle().clear();
				getIndexTitle().addAll((Collection<? extends IndexTitleType>)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS_GROUP:
				((FeatureMap.Internal)getChangeMarksGroup()).set(newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT:
				setRegionLeft((RegionContent)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER:
				setRegionCenter((RegionContent)newValue);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT:
				setRegionRight((RegionContent)newValue);
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
			case TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES:
				setTrackedChanges((TrackedChangesType)null);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS:
				setVariableDecls((VariableDeclsType)null);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS:
				setSequenceDecls((SequenceDeclsType)null);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS:
				setUserFieldDecls((UserFieldDeclsType)null);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS:
				setDdeConnectionDecls((DdeConnectionDeclsType)null);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				setAlphabeticalIndexAutoMarkFile((AlphabeticalIndexAutoMarkFileType)null);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__GROUP:
				getGroup().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__H:
				getH().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__P:
				getP().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__LIST:
				getList().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE:
				getTable().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__SECTION:
				getSection().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_OF_CONTENT:
				getTableOfContent().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__ILLUSTRATION_INDEX:
				getIllustrationIndex().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_INDEX:
				getTableIndex().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__OBJECT_INDEX:
				getObjectIndex().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__USER_INDEX:
				getUserIndex().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX:
				getAlphabeticalIndex().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__BIBLIOGRAPHY:
				getBibliography().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__INDEX_TITLE:
				getIndexTitle().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS_GROUP:
				getChangeMarksGroup().clear();
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT:
				setRegionLeft((RegionContent)null);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER:
				setRegionCenter((RegionContent)null);
				return;
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT:
				setRegionRight((RegionContent)null);
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
			case TextPackage.HEADER_FOOTER_CONTENT__TRACKED_CHANGES:
				return trackedChanges != null;
			case TextPackage.HEADER_FOOTER_CONTENT__VARIABLE_DECLS:
				return variableDecls != null;
			case TextPackage.HEADER_FOOTER_CONTENT__SEQUENCE_DECLS:
				return sequenceDecls != null;
			case TextPackage.HEADER_FOOTER_CONTENT__USER_FIELD_DECLS:
				return userFieldDecls != null;
			case TextPackage.HEADER_FOOTER_CONTENT__DDE_CONNECTION_DECLS:
				return ddeConnectionDecls != null;
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX_AUTO_MARK_FILE:
				return alphabeticalIndexAutoMarkFile != null;
			case TextPackage.HEADER_FOOTER_CONTENT__GROUP:
				return group != null && !group.isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__H:
				return !getH().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__P:
				return !getP().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__LIST:
				return !getList().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE:
				return !getTable().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__SECTION:
				return !getSection().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_OF_CONTENT:
				return !getTableOfContent().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__ILLUSTRATION_INDEX:
				return !getIllustrationIndex().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__TABLE_INDEX:
				return !getTableIndex().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__OBJECT_INDEX:
				return !getObjectIndex().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__USER_INDEX:
				return !getUserIndex().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__ALPHABETICAL_INDEX:
				return !getAlphabeticalIndex().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__BIBLIOGRAPHY:
				return !getBibliography().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__INDEX_TITLE:
				return !getIndexTitle().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS_GROUP:
				return !getChangeMarksGroup().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__CHANGE_MARKS:
				return !getChangeMarks().isEmpty();
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_LEFT:
				return regionLeft != null;
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_CENTER:
				return regionCenter != null;
			case TextPackage.HEADER_FOOTER_CONTENT__REGION_RIGHT:
				return regionRight != null;
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
		result.append(')');
		return result.toString();
	}

} //HeaderFooterContentImpl
