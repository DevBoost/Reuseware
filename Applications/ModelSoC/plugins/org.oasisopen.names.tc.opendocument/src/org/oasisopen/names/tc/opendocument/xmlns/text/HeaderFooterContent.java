/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Footer Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getTrackedChanges <em>Tracked Changes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getVariableDecls <em>Variable Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getSequenceDecls <em>Sequence Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getUserFieldDecls <em>User Field Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getDdeConnectionDecls <em>Dde Connection Decls</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getH <em>H</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getP <em>P</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getList <em>List</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getTable <em>Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getSection <em>Section</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getTableOfContent <em>Table Of Content</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getIllustrationIndex <em>Illustration Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getTableIndex <em>Table Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getObjectIndex <em>Object Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getUserIndex <em>User Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getAlphabeticalIndex <em>Alphabetical Index</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getBibliography <em>Bibliography</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getIndexTitle <em>Index Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getChangeMarksGroup <em>Change Marks Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getChangeMarks <em>Change Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getRegionLeft <em>Region Left</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getRegionCenter <em>Region Center</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getRegionRight <em>Region Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent()
 * @model extendedMetaData="name='header-footer-content' kind='elementOnly'"
 * @generated
 */
public interface HeaderFooterContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Tracked Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracked Changes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracked Changes</em>' containment reference.
	 * @see #setTrackedChanges(TrackedChangesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_TrackedChanges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tracked-changes' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackedChangesType getTrackedChanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getTrackedChanges <em>Tracked Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracked Changes</em>' containment reference.
	 * @see #getTrackedChanges()
	 * @generated
	 */
	void setTrackedChanges(TrackedChangesType value);

	/**
	 * Returns the value of the '<em><b>Variable Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Decls</em>' containment reference.
	 * @see #setVariableDecls(VariableDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_VariableDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable-decls' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableDeclsType getVariableDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getVariableDecls <em>Variable Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Decls</em>' containment reference.
	 * @see #getVariableDecls()
	 * @generated
	 */
	void setVariableDecls(VariableDeclsType value);

	/**
	 * Returns the value of the '<em><b>Sequence Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Decls</em>' containment reference.
	 * @see #setSequenceDecls(SequenceDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_SequenceDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence-decls' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceDeclsType getSequenceDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getSequenceDecls <em>Sequence Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Decls</em>' containment reference.
	 * @see #getSequenceDecls()
	 * @generated
	 */
	void setSequenceDecls(SequenceDeclsType value);

	/**
	 * Returns the value of the '<em><b>User Field Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Field Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Field Decls</em>' containment reference.
	 * @see #setUserFieldDecls(UserFieldDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_UserFieldDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user-field-decls' namespace='##targetNamespace'"
	 * @generated
	 */
	UserFieldDeclsType getUserFieldDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getUserFieldDecls <em>User Field Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Field Decls</em>' containment reference.
	 * @see #getUserFieldDecls()
	 * @generated
	 */
	void setUserFieldDecls(UserFieldDeclsType value);

	/**
	 * Returns the value of the '<em><b>Dde Connection Decls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dde Connection Decls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dde Connection Decls</em>' containment reference.
	 * @see #setDdeConnectionDecls(DdeConnectionDeclsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_DdeConnectionDecls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dde-connection-decls' namespace='##targetNamespace'"
	 * @generated
	 */
	DdeConnectionDeclsType getDdeConnectionDecls();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getDdeConnectionDecls <em>Dde Connection Decls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dde Connection Decls</em>' containment reference.
	 * @see #getDdeConnectionDecls()
	 * @generated
	 */
	void setDdeConnectionDecls(DdeConnectionDeclsType value);

	/**
	 * Returns the value of the '<em><b>Alphabetical Index Auto Mark File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index Auto Mark File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index Auto Mark File</em>' containment reference.
	 * @see #setAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_AlphabeticalIndexAutoMarkFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index-auto-mark-file' namespace='##targetNamespace'"
	 * @generated
	 */
	AlphabeticalIndexAutoMarkFileType getAlphabeticalIndexAutoMarkFile();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getAlphabeticalIndexAutoMarkFile <em>Alphabetical Index Auto Mark File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabetical Index Auto Mark File</em>' containment reference.
	 * @see #getAlphabeticalIndexAutoMarkFile()
	 * @generated
	 */
	void setAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFileType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:6'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>H</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.HType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_H()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<HType> getH();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<PType> getP();

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_List()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<ListType> getList();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.table.TableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='urn:oasis:names:tc:opendocument:xmlns:table:1.0' group='#group:6'"
	 * @generated
	 */
	EList<TableType> getTable();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.SectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_Section()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<SectionType> getSection();

	/**
	 * Returns the value of the '<em><b>Table Of Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Of Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Of Content</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_TableOfContent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-of-content' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TableOfContentType> getTableOfContent();

	/**
	 * Returns the value of the '<em><b>Illustration Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Illustration Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illustration Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_IllustrationIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='illustration-index' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<IllustrationIndexType> getIllustrationIndex();

	/**
	 * Returns the value of the '<em><b>Table Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_TableIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table-index' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<TableIndexType> getTableIndex();

	/**
	 * Returns the value of the '<em><b>Object Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_ObjectIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-index' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<ObjectIndexType> getObjectIndex();

	/**
	 * Returns the value of the '<em><b>User Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_UserIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='user-index' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<UserIndexType> getUserIndex();

	/**
	 * Returns the value of the '<em><b>Alphabetical Index</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AlphabeticalIndexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alphabetical Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabetical Index</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_AlphabeticalIndex()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alphabetical-index' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<AlphabeticalIndexType> getAlphabeticalIndex();

	/**
	 * Returns the value of the '<em><b>Bibliography</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliography</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliography</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_Bibliography()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliography' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<BibliographyType> getBibliography();

	/**
	 * Returns the value of the '<em><b>Index Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexTitleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Title</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Title</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_IndexTitle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='index-title' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	EList<IndexTitleType> getIndexTitle();

	/**
	 * Returns the value of the '<em><b>Change Marks Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Marks Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Marks Group</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_ChangeMarksGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='change-marks:group' namespace='##targetNamespace' group='#group:6'"
	 * @generated
	 */
	FeatureMap getChangeMarksGroup();

	/**
	 * Returns the value of the '<em><b>Change Marks</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.ChangeMarksType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Marks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Marks</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_ChangeMarks()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='change-marks' namespace='##targetNamespace' group='change-marks:group'"
	 * @generated
	 */
	EList<ChangeMarksType> getChangeMarks();

	/**
	 * Returns the value of the '<em><b>Region Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Left</em>' containment reference.
	 * @see #setRegionLeft(RegionContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_RegionLeft()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='region-left' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	RegionContent getRegionLeft();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getRegionLeft <em>Region Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Left</em>' containment reference.
	 * @see #getRegionLeft()
	 * @generated
	 */
	void setRegionLeft(RegionContent value);

	/**
	 * Returns the value of the '<em><b>Region Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Center</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Center</em>' containment reference.
	 * @see #setRegionCenter(RegionContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_RegionCenter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='region-center' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	RegionContent getRegionCenter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getRegionCenter <em>Region Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Center</em>' containment reference.
	 * @see #getRegionCenter()
	 * @generated
	 */
	void setRegionCenter(RegionContent value);

	/**
	 * Returns the value of the '<em><b>Region Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Right</em>' containment reference.
	 * @see #setRegionRight(RegionContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getHeaderFooterContent_RegionRight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='region-right' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	RegionContent getRegionRight();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent#getRegionRight <em>Region Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Right</em>' containment reference.
	 * @see #getRegionRight()
	 * @generated
	 */
	void setRegionRight(RegionContent value);

} // HeaderFooterContent
