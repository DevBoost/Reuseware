/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linenumbering Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getLinenumberingSeparator <em>Linenumbering Separator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getCountEmptyLines <em>Count Empty Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getCountInTextBoxes <em>Count In Text Boxes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumberLines <em>Number Lines</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumberPosition <em>Number Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumFormat <em>Num Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumLetterSync <em>Num Letter Sync</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getRestartOnPage <em>Restart On Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType()
 * @model extendedMetaData="name='linenumbering-configuration_._type' kind='elementOnly'"
 * @generated
 */
public interface LinenumberingConfigurationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Linenumbering Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linenumbering Separator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linenumbering Separator</em>' containment reference.
	 * @see #setLinenumberingSeparator(LinenumberingSeparatorType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_LinenumberingSeparator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linenumbering-separator' namespace='##targetNamespace'"
	 * @generated
	 */
	LinenumberingSeparatorType getLinenumberingSeparator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getLinenumberingSeparator <em>Linenumbering Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linenumbering Separator</em>' containment reference.
	 * @see #getLinenumberingSeparator()
	 * @generated
	 */
	void setLinenumberingSeparator(LinenumberingSeparatorType value);

	/**
	 * Returns the value of the '<em><b>Count Empty Lines</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Empty Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Empty Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCountEmptyLines()
	 * @see #unsetCountEmptyLines()
	 * @see #setCountEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_CountEmptyLines()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='count-empty-lines' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCountEmptyLines();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getCountEmptyLines <em>Count Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Empty Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCountEmptyLines()
	 * @see #unsetCountEmptyLines()
	 * @see #getCountEmptyLines()
	 * @generated
	 */
	void setCountEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getCountEmptyLines <em>Count Empty Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountEmptyLines()
	 * @see #getCountEmptyLines()
	 * @see #setCountEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCountEmptyLines();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getCountEmptyLines <em>Count Empty Lines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count Empty Lines</em>' attribute is set.
	 * @see #unsetCountEmptyLines()
	 * @see #getCountEmptyLines()
	 * @see #setCountEmptyLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCountEmptyLines();

	/**
	 * Returns the value of the '<em><b>Count In Text Boxes</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count In Text Boxes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count In Text Boxes</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCountInTextBoxes()
	 * @see #unsetCountInTextBoxes()
	 * @see #setCountInTextBoxes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_CountInTextBoxes()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='count-in-text-boxes' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getCountInTextBoxes();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getCountInTextBoxes <em>Count In Text Boxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count In Text Boxes</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetCountInTextBoxes()
	 * @see #unsetCountInTextBoxes()
	 * @see #getCountInTextBoxes()
	 * @generated
	 */
	void setCountInTextBoxes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getCountInTextBoxes <em>Count In Text Boxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountInTextBoxes()
	 * @see #getCountInTextBoxes()
	 * @see #setCountInTextBoxes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetCountInTextBoxes();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getCountInTextBoxes <em>Count In Text Boxes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count In Text Boxes</em>' attribute is set.
	 * @see #unsetCountInTextBoxes()
	 * @see #getCountInTextBoxes()
	 * @see #setCountInTextBoxes(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetCountInTextBoxes();

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' attribute.
	 * @see #setIncrement(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_Increment()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='increment' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIncrement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getIncrement <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' attribute.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Number Lines</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumberLines()
	 * @see #unsetNumberLines()
	 * @see #setNumberLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_NumberLines()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='number-lines' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumberLines();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumberLines <em>Number Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Lines</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumberLines()
	 * @see #unsetNumberLines()
	 * @see #getNumberLines()
	 * @generated
	 */
	void setNumberLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumberLines <em>Number Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberLines()
	 * @see #getNumberLines()
	 * @see #setNumberLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetNumberLines();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumberLines <em>Number Lines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Lines</em>' attribute is set.
	 * @see #unsetNumberLines()
	 * @see #getNumberLines()
	 * @see #setNumberLines(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetNumberLines();

	/**
	 * Returns the value of the '<em><b>Number Position</b></em>' attribute.
	 * The default value is <code>"left"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.NumberPositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.NumberPositionType
	 * @see #isSetNumberPosition()
	 * @see #unsetNumberPosition()
	 * @see #setNumberPosition(NumberPositionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_NumberPosition()
	 * @model default="left" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='number-position' namespace='##targetNamespace'"
	 * @generated
	 */
	NumberPositionType getNumberPosition();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumberPosition <em>Number Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Position</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.NumberPositionType
	 * @see #isSetNumberPosition()
	 * @see #unsetNumberPosition()
	 * @see #getNumberPosition()
	 * @generated
	 */
	void setNumberPosition(NumberPositionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumberPosition <em>Number Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberPosition()
	 * @see #getNumberPosition()
	 * @see #setNumberPosition(NumberPositionType)
	 * @generated
	 */
	void unsetNumberPosition();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumberPosition <em>Number Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Position</em>' attribute is set.
	 * @see #unsetNumberPosition()
	 * @see #getNumberPosition()
	 * @see #setNumberPosition(NumberPositionType)
	 * @generated
	 */
	boolean isSetNumberPosition();

	/**
	 * Returns the value of the '<em><b>Num Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Format</em>' attribute.
	 * @see #setNumFormat(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_NumFormat()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.style.NumFormatType"
	 *        extendedMetaData="kind='attribute' name='num-format' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	Object getNumFormat();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumFormat <em>Num Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Format</em>' attribute.
	 * @see #getNumFormat()
	 * @generated
	 */
	void setNumFormat(Object value);

	/**
	 * Returns the value of the '<em><b>Num Letter Sync</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Letter Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Letter Sync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumLetterSync()
	 * @see #unsetNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_NumLetterSync()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='num-letter-sync' namespace='urn:oasis:names:tc:opendocument:xmlns:style:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getNumLetterSync();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Letter Sync</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetNumLetterSync()
	 * @see #unsetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @generated
	 */
	void setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumLetterSync <em>Num Letter Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetNumLetterSync();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getNumLetterSync <em>Num Letter Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Num Letter Sync</em>' attribute is set.
	 * @see #unsetNumLetterSync()
	 * @see #getNumLetterSync()
	 * @see #setNumLetterSync(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetNumLetterSync();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_Offset()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeLength"
	 *        extendedMetaData="kind='attribute' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

	/**
	 * Returns the value of the '<em><b>Restart On Page</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restart On Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart On Page</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRestartOnPage()
	 * @see #unsetRestartOnPage()
	 * @see #setRestartOnPage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_RestartOnPage()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='restart-on-page' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getRestartOnPage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getRestartOnPage <em>Restart On Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart On Page</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetRestartOnPage()
	 * @see #unsetRestartOnPage()
	 * @see #getRestartOnPage()
	 * @generated
	 */
	void setRestartOnPage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getRestartOnPage <em>Restart On Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRestartOnPage()
	 * @see #getRestartOnPage()
	 * @see #setRestartOnPage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetRestartOnPage();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getRestartOnPage <em>Restart On Page</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Restart On Page</em>' attribute is set.
	 * @see #unsetRestartOnPage()
	 * @see #getRestartOnPage()
	 * @see #setRestartOnPage(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetRestartOnPage();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage#getLinenumberingConfigurationType_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameType1"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

} // LinenumberingConfigurationType
