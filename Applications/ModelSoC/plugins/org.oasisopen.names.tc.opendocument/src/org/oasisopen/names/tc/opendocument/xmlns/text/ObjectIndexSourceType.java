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
 * A representation of the model object '<em><b>Object Index Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getObjectIndexEntryTemplate <em>Object Index Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseChartObjects <em>Use Chart Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseDrawObjects <em>Use Draw Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseMathObjects <em>Use Math Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseOtherObjects <em>Use Other Objects</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseSpreadsheetObjects <em>Use Spreadsheet Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType()
 * @model extendedMetaData="name='object-index-source_._type' kind='elementOnly'"
 * @generated
 */
public interface ObjectIndexSourceType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType_IndexTitleTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index-title-template' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexTitleTemplateType getIndexTitleTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getIndexTitleTemplate <em>Index Title Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Title Template</em>' containment reference.
	 * @see #getIndexTitleTemplate()
	 * @generated
	 */
	void setIndexTitleTemplate(IndexTitleTemplateType value);

	/**
	 * Returns the value of the '<em><b>Object Index Entry Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Index Entry Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Index Entry Template</em>' containment reference.
	 * @see #setObjectIndexEntryTemplate(TextIllustrationIndexEntryContent)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType_ObjectIndexEntryTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='object-index-entry-template' namespace='##targetNamespace'"
	 * @generated
	 */
	TextIllustrationIndexEntryContent getObjectIndexEntryTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getObjectIndexEntryTemplate <em>Object Index Entry Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Index Entry Template</em>' containment reference.
	 * @see #getObjectIndexEntryTemplate()
	 * @generated
	 */
	void setObjectIndexEntryTemplate(TextIllustrationIndexEntryContent value);

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType_IndexScope()
	 * @model default="document" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='index-scope' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexScopeType getIndexScope();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexScope()
	 * @see #getIndexScope()
	 * @see #setIndexScope(IndexScopeType)
	 * @generated
	 */
	void unsetIndexScope();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getIndexScope <em>Index Scope</em>}' attribute is set.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType_RelativeTabStopPosition()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='relative-tab-stop-position' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRelativeTabStopPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeTabStopPosition()
	 * @see #getRelativeTabStopPosition()
	 * @see #setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRelativeTabStopPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Use Chart Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Chart Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Chart Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseChartObjects()
	 * @see #unsetUseChartObjects()
	 * @see #setUseChartObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType_UseChartObjects()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-chart-objects' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseChartObjects();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseChartObjects <em>Use Chart Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Chart Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseChartObjects()
	 * @see #unsetUseChartObjects()
	 * @see #getUseChartObjects()
	 * @generated
	 */
	void setUseChartObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseChartObjects <em>Use Chart Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseChartObjects()
	 * @see #getUseChartObjects()
	 * @see #setUseChartObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseChartObjects();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseChartObjects <em>Use Chart Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Chart Objects</em>' attribute is set.
	 * @see #unsetUseChartObjects()
	 * @see #getUseChartObjects()
	 * @see #setUseChartObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseChartObjects();

	/**
	 * Returns the value of the '<em><b>Use Draw Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Draw Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Draw Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseDrawObjects()
	 * @see #unsetUseDrawObjects()
	 * @see #setUseDrawObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType_UseDrawObjects()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-draw-objects' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseDrawObjects();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseDrawObjects <em>Use Draw Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Draw Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseDrawObjects()
	 * @see #unsetUseDrawObjects()
	 * @see #getUseDrawObjects()
	 * @generated
	 */
	void setUseDrawObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseDrawObjects <em>Use Draw Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseDrawObjects()
	 * @see #getUseDrawObjects()
	 * @see #setUseDrawObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseDrawObjects();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseDrawObjects <em>Use Draw Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Draw Objects</em>' attribute is set.
	 * @see #unsetUseDrawObjects()
	 * @see #getUseDrawObjects()
	 * @see #setUseDrawObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseDrawObjects();

	/**
	 * Returns the value of the '<em><b>Use Math Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Math Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Math Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseMathObjects()
	 * @see #unsetUseMathObjects()
	 * @see #setUseMathObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType_UseMathObjects()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-math-objects' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseMathObjects();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseMathObjects <em>Use Math Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Math Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseMathObjects()
	 * @see #unsetUseMathObjects()
	 * @see #getUseMathObjects()
	 * @generated
	 */
	void setUseMathObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseMathObjects <em>Use Math Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseMathObjects()
	 * @see #getUseMathObjects()
	 * @see #setUseMathObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseMathObjects();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseMathObjects <em>Use Math Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Math Objects</em>' attribute is set.
	 * @see #unsetUseMathObjects()
	 * @see #getUseMathObjects()
	 * @see #setUseMathObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseMathObjects();

	/**
	 * Returns the value of the '<em><b>Use Other Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Other Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Other Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseOtherObjects()
	 * @see #unsetUseOtherObjects()
	 * @see #setUseOtherObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType_UseOtherObjects()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-other-objects' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseOtherObjects();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseOtherObjects <em>Use Other Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Other Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseOtherObjects()
	 * @see #unsetUseOtherObjects()
	 * @see #getUseOtherObjects()
	 * @generated
	 */
	void setUseOtherObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseOtherObjects <em>Use Other Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseOtherObjects()
	 * @see #getUseOtherObjects()
	 * @see #setUseOtherObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseOtherObjects();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseOtherObjects <em>Use Other Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Other Objects</em>' attribute is set.
	 * @see #unsetUseOtherObjects()
	 * @see #getUseOtherObjects()
	 * @see #setUseOtherObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseOtherObjects();

	/**
	 * Returns the value of the '<em><b>Use Spreadsheet Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Spreadsheet Objects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Spreadsheet Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseSpreadsheetObjects()
	 * @see #unsetUseSpreadsheetObjects()
	 * @see #setUseSpreadsheetObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getObjectIndexSourceType_UseSpreadsheetObjects()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-spreadsheet-objects' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseSpreadsheetObjects();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseSpreadsheetObjects <em>Use Spreadsheet Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Spreadsheet Objects</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseSpreadsheetObjects()
	 * @see #unsetUseSpreadsheetObjects()
	 * @see #getUseSpreadsheetObjects()
	 * @generated
	 */
	void setUseSpreadsheetObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseSpreadsheetObjects <em>Use Spreadsheet Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseSpreadsheetObjects()
	 * @see #getUseSpreadsheetObjects()
	 * @see #setUseSpreadsheetObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseSpreadsheetObjects();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.ObjectIndexSourceType#getUseSpreadsheetObjects <em>Use Spreadsheet Objects</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Spreadsheet Objects</em>' attribute is set.
	 * @see #unsetUseSpreadsheetObjects()
	 * @see #getUseSpreadsheetObjects()
	 * @see #setUseSpreadsheetObjects(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseSpreadsheetObjects();

} // ObjectIndexSourceType
