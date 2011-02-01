/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Of Content Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getIndexTitleTemplate <em>Index Title Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getTableOfContentEntryTemplate <em>Table Of Content Entry Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getIndexSourceStyles <em>Index Source Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getIndexScope <em>Index Scope</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getOutlineLevel <em>Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseIndexMarks <em>Use Index Marks</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseIndexSourceStyles <em>Use Index Source Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseOutlineLevel <em>Use Outline Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType()
 * @model extendedMetaData="name='table-of-content-source_._type' kind='elementOnly'"
 * @generated
 */
public interface TableOfContentSourceType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType_IndexTitleTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index-title-template' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexTitleTemplateType getIndexTitleTemplate();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getIndexTitleTemplate <em>Index Title Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Title Template</em>' containment reference.
	 * @see #getIndexTitleTemplate()
	 * @generated
	 */
	void setIndexTitleTemplate(IndexTitleTemplateType value);

	/**
	 * Returns the value of the '<em><b>Table Of Content Entry Template</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentEntryTemplateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Of Content Entry Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Of Content Entry Template</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType_TableOfContentEntryTemplate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='table-of-content-entry-template' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TableOfContentEntryTemplateType> getTableOfContentEntryTemplate();

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType_IndexSourceStyles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index-source-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IndexSourceStylesType> getIndexSourceStyles();

	/**
	 * Returns the value of the '<em><b>Index Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Scope</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType1
	 * @see #isSetIndexScope()
	 * @see #unsetIndexScope()
	 * @see #setIndexScope(IndexScopeType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType_IndexScope()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='index-scope' namespace='##targetNamespace'"
	 * @generated
	 */
	IndexScopeType1 getIndexScope();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getIndexScope <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Scope</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.IndexScopeType1
	 * @see #isSetIndexScope()
	 * @see #unsetIndexScope()
	 * @see #getIndexScope()
	 * @generated
	 */
	void setIndexScope(IndexScopeType1 value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getIndexScope <em>Index Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexScope()
	 * @see #getIndexScope()
	 * @see #setIndexScope(IndexScopeType1)
	 * @generated
	 */
	void unsetIndexScope();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getIndexScope <em>Index Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index Scope</em>' attribute is set.
	 * @see #unsetIndexScope()
	 * @see #getIndexScope()
	 * @see #setIndexScope(IndexScopeType1)
	 * @generated
	 */
	boolean isSetIndexScope();

	/**
	 * Returns the value of the '<em><b>Outline Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline Level</em>' attribute.
	 * @see #setOutlineLevel(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType_OutlineLevel()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='outline-level' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOutlineLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getOutlineLevel <em>Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline Level</em>' attribute.
	 * @see #getOutlineLevel()
	 * @generated
	 */
	void setOutlineLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Relative Tab Stop Position</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType_RelativeTabStopPosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='relative-tab-stop-position' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRelativeTabStopPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativeTabStopPosition()
	 * @see #getRelativeTabStopPosition()
	 * @see #setRelativeTabStopPosition(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRelativeTabStopPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getRelativeTabStopPosition <em>Relative Tab Stop Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Use Index Marks</b></em>' attribute.
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType_UseIndexMarks()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-index-marks' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseIndexMarks();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseIndexMarks <em>Use Index Marks</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseIndexMarks <em>Use Index Marks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseIndexMarks()
	 * @see #getUseIndexMarks()
	 * @see #setUseIndexMarks(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseIndexMarks();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseIndexMarks <em>Use Index Marks</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Use Index Source Styles</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Index Source Styles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Index Source Styles</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseIndexSourceStyles()
	 * @see #unsetUseIndexSourceStyles()
	 * @see #setUseIndexSourceStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType_UseIndexSourceStyles()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-index-source-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseIndexSourceStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseIndexSourceStyles <em>Use Index Source Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Index Source Styles</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseIndexSourceStyles()
	 * @see #unsetUseIndexSourceStyles()
	 * @see #getUseIndexSourceStyles()
	 * @generated
	 */
	void setUseIndexSourceStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseIndexSourceStyles <em>Use Index Source Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseIndexSourceStyles()
	 * @see #getUseIndexSourceStyles()
	 * @see #setUseIndexSourceStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseIndexSourceStyles();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseIndexSourceStyles <em>Use Index Source Styles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Index Source Styles</em>' attribute is set.
	 * @see #unsetUseIndexSourceStyles()
	 * @see #getUseIndexSourceStyles()
	 * @see #setUseIndexSourceStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseIndexSourceStyles();

	/**
	 * Returns the value of the '<em><b>Use Outline Level</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Outline Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Outline Level</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseOutlineLevel()
	 * @see #unsetUseOutlineLevel()
	 * @see #setUseOutlineLevel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getTableOfContentSourceType_UseOutlineLevel()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='use-outline-level' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUseOutlineLevel();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseOutlineLevel <em>Use Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Outline Level</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUseOutlineLevel()
	 * @see #unsetUseOutlineLevel()
	 * @see #getUseOutlineLevel()
	 * @generated
	 */
	void setUseOutlineLevel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseOutlineLevel <em>Use Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseOutlineLevel()
	 * @see #getUseOutlineLevel()
	 * @see #setUseOutlineLevel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUseOutlineLevel();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.TableOfContentSourceType#getUseOutlineLevel <em>Use Outline Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Outline Level</em>' attribute is set.
	 * @see #unsetUseOutlineLevel()
	 * @see #getUseOutlineLevel()
	 * @see #setUseOutlineLevel(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUseOutlineLevel();

} // TableOfContentSourceType
