/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Illustration Index Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getIllustrationIndexEntryTemplate <em>Illustration Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getCaptionSequenceFormat <em>Caption Sequence Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getCaptionSequenceName <em>Caption Sequence Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getUseCaption <em>Use Caption</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIllustrationIndexSourceType()
 * @model extendedMetaData="name='illustration-index-source_._type' kind='elementOnly'"
 * @generated
 */
public interface IllustrationIndexSourceType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIllustrationIndexSourceType_IndexTitleTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index-title-template' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexTitleTemplateType getIndexTitleTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getIndexTitleTemplate <em>Index Title Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Title Template</em>' containment reference.
	 * @see #getIndexTitleTemplate()
	 * @generated
	 */
	void setIndexTitleTemplate(IndexTitleTemplateType value);

	/**
	 * Returns the value of the '<em><b>Illustration Index Entry Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Illustration Index Entry Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illustration Index Entry Template</em>' containment reference.
	 * @see #setIllustrationIndexEntryTemplate(TextIllustrationIndexEntryContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIllustrationIndexSourceType_IllustrationIndexEntryTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='illustration-index-entry-template' namespace='##targetNamespace'"
	 * @generated
	 */
	TextIllustrationIndexEntryContent getIllustrationIndexEntryTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getIllustrationIndexEntryTemplate <em>Illustration Index Entry Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Illustration Index Entry Template</em>' containment reference.
	 * @see #getIllustrationIndexEntryTemplate()
	 * @generated
	 */
	void setIllustrationIndexEntryTemplate(TextIllustrationIndexEntryContent value);

	/**
	 * Returns the value of the '<em><b>Caption Sequence Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.CaptionSequenceFormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Sequence Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Sequence Format</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.CaptionSequenceFormatType
	 * @see #isSetCaptionSequenceFormat()
	 * @see #unsetCaptionSequenceFormat()
	 * @see #setCaptionSequenceFormat(CaptionSequenceFormatType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIllustrationIndexSourceType_CaptionSequenceFormat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='caption-sequence-format' namespace='##targetNamespace'"
	 * @generated
	 */
	CaptionSequenceFormatType getCaptionSequenceFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getCaptionSequenceFormat <em>Caption Sequence Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Sequence Format</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.CaptionSequenceFormatType
	 * @see #isSetCaptionSequenceFormat()
	 * @see #unsetCaptionSequenceFormat()
	 * @see #getCaptionSequenceFormat()
	 * @generated
	 */
	void setCaptionSequenceFormat(CaptionSequenceFormatType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getCaptionSequenceFormat <em>Caption Sequence Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaptionSequenceFormat()
	 * @see #getCaptionSequenceFormat()
	 * @see #setCaptionSequenceFormat(CaptionSequenceFormatType)
	 * @generated
	 */
	void unsetCaptionSequenceFormat();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getCaptionSequenceFormat <em>Caption Sequence Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caption Sequence Format</em>' attribute is set.
	 * @see #unsetCaptionSequenceFormat()
	 * @see #getCaptionSequenceFormat()
	 * @see #setCaptionSequenceFormat(CaptionSequenceFormatType)
	 * @generated
	 */
	boolean isSetCaptionSequenceFormat();

	/**
	 * Returns the value of the '<em><b>Caption Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption Sequence Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Sequence Name</em>' attribute.
	 * @see #setCaptionSequenceName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIllustrationIndexSourceType_CaptionSequenceName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='caption-sequence-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCaptionSequenceName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getCaptionSequenceName <em>Caption Sequence Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Sequence Name</em>' attribute.
	 * @see #getCaptionSequenceName()
	 * @generated
	 */
	void setCaptionSequenceName(String value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIllustrationIndexSourceType_IndexScope()
	 * @model default="document" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='index-scope' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexScopeType getIndexScope();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexScope()
	 * @see #getIndexScope()
	 * @see #setIndexScope(IndexScopeType)
	 * @generated
	 */
	void unsetIndexScope();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIllustrationIndexSourceType_RelativeTabStopPosition()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='relative-tab-stop-position' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRelativeTabStopPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeTabStopPosition()
	 * @see #getRelativeTabStopPosition()
	 * @see #setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRelativeTabStopPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Use Caption</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Caption</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseCaption()
	 * @see #unsetUseCaption()
	 * @see #setUseCaption(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getIllustrationIndexSourceType_UseCaption()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-caption' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseCaption();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getUseCaption <em>Use Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Caption</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseCaption()
	 * @see #unsetUseCaption()
	 * @see #getUseCaption()
	 * @generated
	 */
	void setUseCaption(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getUseCaption <em>Use Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseCaption()
	 * @see #getUseCaption()
	 * @see #setUseCaption(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseCaption();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.IllustrationIndexSourceType#getUseCaption <em>Use Caption</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Caption</em>' attribute is set.
	 * @see #unsetUseCaption()
	 * @see #getUseCaption()
	 * @see #setUseCaption(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseCaption();

} // IllustrationIndexSourceType
