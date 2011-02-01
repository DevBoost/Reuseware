/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getComment <em>Comment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyBack <em>Copy Back</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyFormulas <em>Copy Formulas</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyStyles <em>Copy Styles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getDisplayBorder <em>Display Border</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getScenarioRanges <em>Scenario Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType()
 * @model extendedMetaData="name='scenario_._type' kind='empty'"
 * @generated
 */
public interface ScenarioType extends EObject {
	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see #setBorderColor(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType_BorderColor()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Color"
	 *        extendedMetaData="kind='attribute' name='border-color' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBorderColor();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType_Comment()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Copy Back</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Back</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Back</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyBack()
	 * @see #unsetCopyBack()
	 * @see #setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType_CopyBack()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='copy-back' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyBack();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyBack <em>Copy Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Back</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyBack()
	 * @see #unsetCopyBack()
	 * @see #getCopyBack()
	 * @generated
	 */
	void setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyBack <em>Copy Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCopyBack()
	 * @see #getCopyBack()
	 * @see #setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCopyBack();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyBack <em>Copy Back</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Copy Back</em>' attribute is set.
	 * @see #unsetCopyBack()
	 * @see #getCopyBack()
	 * @see #setCopyBack(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCopyBack();

	/**
	 * Returns the value of the '<em><b>Copy Formulas</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Formulas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Formulas</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyFormulas()
	 * @see #unsetCopyFormulas()
	 * @see #setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType_CopyFormulas()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='copy-formulas' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyFormulas();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyFormulas <em>Copy Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Formulas</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyFormulas()
	 * @see #unsetCopyFormulas()
	 * @see #getCopyFormulas()
	 * @generated
	 */
	void setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyFormulas <em>Copy Formulas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCopyFormulas()
	 * @see #getCopyFormulas()
	 * @see #setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCopyFormulas();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyFormulas <em>Copy Formulas</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Copy Formulas</em>' attribute is set.
	 * @see #unsetCopyFormulas()
	 * @see #getCopyFormulas()
	 * @see #setCopyFormulas(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCopyFormulas();

	/**
	 * Returns the value of the '<em><b>Copy Styles</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy Styles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Styles</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyStyles()
	 * @see #unsetCopyStyles()
	 * @see #setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType_CopyStyles()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='copy-styles' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCopyStyles();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyStyles <em>Copy Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Styles</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCopyStyles()
	 * @see #unsetCopyStyles()
	 * @see #getCopyStyles()
	 * @generated
	 */
	void setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyStyles <em>Copy Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCopyStyles()
	 * @see #getCopyStyles()
	 * @see #setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCopyStyles();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getCopyStyles <em>Copy Styles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Copy Styles</em>' attribute is set.
	 * @see #unsetCopyStyles()
	 * @see #getCopyStyles()
	 * @see #setCopyStyles(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCopyStyles();

	/**
	 * Returns the value of the '<em><b>Display Border</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Border</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayBorder()
	 * @see #unsetDisplayBorder()
	 * @see #setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType_DisplayBorder()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-border' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayBorder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getDisplayBorder <em>Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Border</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayBorder()
	 * @see #unsetDisplayBorder()
	 * @see #getDisplayBorder()
	 * @generated
	 */
	void setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getDisplayBorder <em>Display Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayBorder()
	 * @see #getDisplayBorder()
	 * @see #setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayBorder();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getDisplayBorder <em>Display Border</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Border</em>' attribute is set.
	 * @see #unsetDisplayBorder()
	 * @see #getDisplayBorder()
	 * @see #setDisplayBorder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayBorder();

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsActive()
	 * @see #unsetIsActive()
	 * @see #setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType_IsActive()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='is-active' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsActive();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetIsActive()
	 * @see #unsetIsActive()
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsActive()
	 * @see #getIsActive()
	 * @see #setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetIsActive();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getIsActive <em>Is Active</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Active</em>' attribute is set.
	 * @see #unsetIsActive()
	 * @see #getIsActive()
	 * @see #setIsActive(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetIsActive();

	/**
	 * Returns the value of the '<em><b>Protected</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtected()
	 * @see #unsetProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType_Protected()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='protected' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetProtected()
	 * @see #unsetProtected()
	 * @see #getProtected()
	 * @generated
	 */
	void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtected()
	 * @see #getProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetProtected();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getProtected <em>Protected</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protected</em>' attribute is set.
	 * @see #unsetProtected()
	 * @see #getProtected()
	 * @see #setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetProtected();

	/**
	 * Returns the value of the '<em><b>Scenario Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Ranges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Ranges</em>' attribute.
	 * @see #setScenarioRanges(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage#getScenarioType_ScenarioRanges()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.CellRangeAddressList" required="true"
	 *        extendedMetaData="kind='attribute' name='scenario-ranges' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScenarioRanges();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType#getScenarioRanges <em>Scenario Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Ranges</em>' attribute.
	 * @see #getScenarioRanges()
	 * @generated
	 */
	void setScenarioRanges(String value);

} // ScenarioType
