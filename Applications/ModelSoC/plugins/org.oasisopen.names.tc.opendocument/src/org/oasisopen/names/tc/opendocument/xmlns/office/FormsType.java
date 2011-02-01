/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormType;
import org.oasisopen.names.tc.opendocument.xmlns.text.AnyAttListOrElements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getForm <em>Form</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getModel <em>Model</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getApplyDesignMode <em>Apply Design Mode</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getAutomaticFocus <em>Automatic Focus</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getFormsType()
 * @model extendedMetaData="name='forms_._type' kind='elementOnly'"
 * @generated
 */
public interface FormsType extends EObject {
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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getFormsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Form</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.form.FormType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getFormsType_Form()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='form' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0' group='#group:0'"
	 * @generated
	 */
	EList<FormType> getForm();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.text.AnyAttListOrElements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getFormsType_Model()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='model' namespace='http://www.w3.org/2002/xforms' group='#group:0'"
	 * @generated
	 */
	EList<AnyAttListOrElements> getModel();

	/**
	 * Returns the value of the '<em><b>Apply Design Mode</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply Design Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Design Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetApplyDesignMode()
	 * @see #unsetApplyDesignMode()
	 * @see #setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getFormsType_ApplyDesignMode()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='apply-design-mode' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getApplyDesignMode();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getApplyDesignMode <em>Apply Design Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply Design Mode</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetApplyDesignMode()
	 * @see #unsetApplyDesignMode()
	 * @see #getApplyDesignMode()
	 * @generated
	 */
	void setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getApplyDesignMode <em>Apply Design Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplyDesignMode()
	 * @see #getApplyDesignMode()
	 * @see #setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetApplyDesignMode();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getApplyDesignMode <em>Apply Design Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Apply Design Mode</em>' attribute is set.
	 * @see #unsetApplyDesignMode()
	 * @see #getApplyDesignMode()
	 * @see #setApplyDesignMode(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetApplyDesignMode();

	/**
	 * Returns the value of the '<em><b>Automatic Focus</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Focus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Focus</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticFocus()
	 * @see #unsetAutomaticFocus()
	 * @see #setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#getFormsType_AutomaticFocus()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='automatic-focus' namespace='urn:oasis:names:tc:opendocument:xmlns:form:1.0'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticFocus();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getAutomaticFocus <em>Automatic Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Focus</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetAutomaticFocus()
	 * @see #unsetAutomaticFocus()
	 * @see #getAutomaticFocus()
	 * @generated
	 */
	void setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getAutomaticFocus <em>Automatic Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutomaticFocus()
	 * @see #getAutomaticFocus()
	 * @see #setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetAutomaticFocus();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.office.FormsType#getAutomaticFocus <em>Automatic Focus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Automatic Focus</em>' attribute is set.
	 * @see #unsetAutomaticFocus()
	 * @see #getAutomaticFocus()
	 * @see #setAutomaticFocus(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetAutomaticFocus();

} // FormsType
