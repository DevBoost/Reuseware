/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Index Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUserIndexEntryTemplate <em>User Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getIndexSourceStyles <em>Index Source Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getCopyOutlineLevels <em>Copy Outline Levels</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseFloatingFrames <em>Use Floating Frames</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseGraphics <em>Use Graphics</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseIndexMarks <em>Use Index Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseObjects <em>Use Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseTables <em>Use Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType()
 * @model extendedMetaData="name='user-index-source_._type' kind='elementOnly'"
 * @generated
 */
public interface UserIndexSourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Index Title Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Title Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Title Template</em>' containment reference.
	 * @see #setIndexTitleTemplate(IndexTitleTemplateType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_IndexTitleTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index-title-template' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexTitleTemplateType getIndexTitleTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getIndexTitleTemplate <em>Index Title Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Title Template</em>' containment reference.
	 * @see #getIndexTitleTemplate()
	 * @generated
	 */
	void setIndexTitleTemplate(IndexTitleTemplateType value);

	/**
	 * Returns the value of the '<em><b>User Index Entry Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexEntryTemplateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Index Entry Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Index Entry Template</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_UserIndexEntryTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user-index-entry-template' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UserIndexEntryTemplateType> getUserIndexEntryTemplate();

	/**
	 * Returns the value of the '<em><b>Index Source Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexSourceStylesType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Source Styles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Source Styles</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_IndexSourceStyles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index-source-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IndexSourceStylesType> getIndexSourceStyles();

	/**
	 * Returns the value of the '<em><b>Copy Outline Levels</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Outline Levels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Outline Levels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyOutlineLevels()
	 * @see #unsetCopyOutlineLevels()
	 * @see #setCopyOutlineLevels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_CopyOutlineLevels()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='copy-outline-levels' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyOutlineLevels();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getCopyOutlineLevels <em>Copy Outline Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Outline Levels</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyOutlineLevels()
	 * @see #unsetCopyOutlineLevels()
	 * @see #getCopyOutlineLevels()
	 * @generated
	 */
	void setCopyOutlineLevels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getCopyOutlineLevels <em>Copy Outline Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCopyOutlineLevels()
	 * @see #getCopyOutlineLevels()
	 * @see #setCopyOutlineLevels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCopyOutlineLevels();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getCopyOutlineLevels <em>Copy Outline Levels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Copy Outline Levels</em>' attribute is set.
	 * @see #unsetCopyOutlineLevels()
	 * @see #getCopyOutlineLevels()
	 * @see #setCopyOutlineLevels(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCopyOutlineLevels();

	/**
	 * Returns the value of the '<em><b>Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Name</em>' attribute.
	 * @see #setIndexName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_IndexName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String" required="true"
	 *        extendedMetaData="kind='attribute' name='index-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getIndexName <em>Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Name</em>' attribute.
	 * @see #getIndexName()
	 * @generated
	 */
	void setIndexName(String value);

	/**
	 * Returns the value of the '<em><b>Index Scope</b></em>' attribute.
	 * The default value is <code>"document"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Scope</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType
	 * @see #isSetIndexScope()
	 * @see #unsetIndexScope()
	 * @see #setIndexScope(IndexScopeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_IndexScope()
	 * @model default="document" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='index-scope' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexScopeType getIndexScope();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Scope</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType
	 * @see #isSetIndexScope()
	 * @see #unsetIndexScope()
	 * @see #getIndexScope()
	 * @generated
	 */
	void setIndexScope(IndexScopeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexScope()
	 * @see #getIndexScope()
	 * @see #setIndexScope(IndexScopeType)
	 * @generated
	 */
	void unsetIndexScope();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index Scope</em>' attribute is set.
	 * @see #unsetIndexScope()
	 * @see #getIndexScope()
	 * @see #setIndexScope(IndexScopeType)
	 * @generated
	 */
	boolean isSetIndexScope();

	/**
	 * Returns the value of the '<em><b>Relative Tab Stop Position</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Tab Stop Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Tab Stop Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRelativeTabStopPosition()
	 * @see #unsetRelativeTabStopPosition()
	 * @see #setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_RelativeTabStopPosition()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='relative-tab-stop-position' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRelativeTabStopPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Tab Stop Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRelativeTabStopPosition()
	 * @see #unsetRelativeTabStopPosition()
	 * @see #getRelativeTabStopPosition()
	 * @generated
	 */
	void setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeTabStopPosition()
	 * @see #getRelativeTabStopPosition()
	 * @see #setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRelativeTabStopPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Tab Stop Position</em>' attribute is set.
	 * @see #unsetRelativeTabStopPosition()
	 * @see #getRelativeTabStopPosition()
	 * @see #setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetRelativeTabStopPosition();

	/**
	 * Returns the value of the '<em><b>Use Floating Frames</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Floating Frames</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Floating Frames</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseFloatingFrames()
	 * @see #unsetUseFloatingFrames()
	 * @see #setUseFloatingFrames(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_UseFloatingFrames()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-floating-frames' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseFloatingFrames();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseFloatingFrames <em>Use Floating Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Floating Frames</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseFloatingFrames()
	 * @see #unsetUseFloatingFrames()
	 * @see #getUseFloatingFrames()
	 * @generated
	 */
	void setUseFloatingFrames(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseFloatingFrames <em>Use Floating Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseFloatingFrames()
	 * @see #getUseFloatingFrames()
	 * @see #setUseFloatingFrames(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseFloatingFrames();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseFloatingFrames <em>Use Floating Frames</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Floating Frames</em>' attribute is set.
	 * @see #unsetUseFloatingFrames()
	 * @see #getUseFloatingFrames()
	 * @see #setUseFloatingFrames(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseFloatingFrames();

	/**
	 * Returns the value of the '<em><b>Use Graphics</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Graphics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Graphics</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseGraphics()
	 * @see #unsetUseGraphics()
	 * @see #setUseGraphics(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_UseGraphics()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-graphics' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseGraphics();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseGraphics <em>Use Graphics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Graphics</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseGraphics()
	 * @see #unsetUseGraphics()
	 * @see #getUseGraphics()
	 * @generated
	 */
	void setUseGraphics(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseGraphics <em>Use Graphics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseGraphics()
	 * @see #getUseGraphics()
	 * @see #setUseGraphics(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseGraphics();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseGraphics <em>Use Graphics</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Graphics</em>' attribute is set.
	 * @see #unsetUseGraphics()
	 * @see #getUseGraphics()
	 * @see #setUseGraphics(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseGraphics();

	/**
	 * Returns the value of the '<em><b>Use Index Marks</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Index Marks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Index Marks</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseIndexMarks()
	 * @see #unsetUseIndexMarks()
	 * @see #setUseIndexMarks(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_UseIndexMarks()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-index-marks' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseIndexMarks();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseIndexMarks <em>Use Index Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Index Marks</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseIndexMarks()
	 * @see #unsetUseIndexMarks()
	 * @see #getUseIndexMarks()
	 * @generated
	 */
	void setUseIndexMarks(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseIndexMarks <em>Use Index Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseIndexMarks()
	 * @see #getUseIndexMarks()
	 * @see #setUseIndexMarks(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseIndexMarks();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseIndexMarks <em>Use Index Marks</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Index Marks</em>' attribute is set.
	 * @see #unsetUseIndexMarks()
	 * @see #getUseIndexMarks()
	 * @see #setUseIndexMarks(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseIndexMarks();

	/**
	 * Returns the value of the '<em><b>Use Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseObjects()
	 * @see #unsetUseObjects()
	 * @see #setUseObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_UseObjects()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-objects' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseObjects();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseObjects <em>Use Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseObjects()
	 * @see #unsetUseObjects()
	 * @see #getUseObjects()
	 * @generated
	 */
	void setUseObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseObjects <em>Use Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseObjects()
	 * @see #getUseObjects()
	 * @see #setUseObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseObjects();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseObjects <em>Use Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Objects</em>' attribute is set.
	 * @see #unsetUseObjects()
	 * @see #getUseObjects()
	 * @see #setUseObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseObjects();

	/**
	 * Returns the value of the '<em><b>Use Tables</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Tables</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Tables</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseTables()
	 * @see #unsetUseTables()
	 * @see #setUseTables(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getUserIndexSourceType_UseTables()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-tables' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseTables();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseTables <em>Use Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Tables</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseTables()
	 * @see #unsetUseTables()
	 * @see #getUseTables()
	 * @generated
	 */
	void setUseTables(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseTables <em>Use Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseTables()
	 * @see #getUseTables()
	 * @see #setUseTables(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseTables();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.UserIndexSourceType#getUseTables <em>Use Tables</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Tables</em>' attribute is set.
	 * @see #unsetUseTables()
	 * @see #getUseTables()
	 * @see #setUseTables(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseTables();

} // UserIndexSourceType
