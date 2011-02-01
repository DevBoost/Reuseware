/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType;
import org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ConnectionResourceType;
import org.oasisopen.names.tc.opendocument.xmlns.form.DateType;
import org.oasisopen.names.tc.opendocument.xmlns.form.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.form.FileType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormattedTextType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FrameType;
import org.oasisopen.names.tc.opendocument.xmlns.form.GenericControlType;
import org.oasisopen.names.tc.opendocument.xmlns.form.GridType;
import org.oasisopen.names.tc.opendocument.xmlns.form.HiddenType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ItemType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListPropertyType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType2;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.NumberType;
import org.oasisopen.names.tc.opendocument.xmlns.form.OptionType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType;
import org.oasisopen.names.tc.opendocument.xmlns.form.RadioType;
import org.oasisopen.names.tc.opendocument.xmlns.form.TextType;
import org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType;
import org.oasisopen.names.tc.opendocument.xmlns.form.TimeType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.CommonFormControlContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.FormPropertyTypeAndValueList;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage
 * @generated
 */
public class FormSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormSwitch() {
		if (modelPackage == null) {
			modelPackage = FormPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FormPackage.BUTTON_TYPE: {
				ButtonType buttonType = (ButtonType)theEObject;
				T result = caseButtonType(buttonType);
				if (result == null) result = caseCommonFormControlContent(buttonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CHECKBOX_TYPE: {
				CheckboxType checkboxType = (CheckboxType)theEObject;
				T result = caseCheckboxType(checkboxType);
				if (result == null) result = caseCommonFormControlContent(checkboxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.COLUMN_TYPE: {
				ColumnType columnType = (ColumnType)theEObject;
				T result = caseColumnType(columnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.COMBOBOX_TYPE: {
				ComboboxType comboboxType = (ComboboxType)theEObject;
				T result = caseComboboxType(comboboxType);
				if (result == null) result = caseCommonFormControlContent(comboboxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.CONNECTION_RESOURCE_TYPE: {
				ConnectionResourceType connectionResourceType = (ConnectionResourceType)theEObject;
				T result = caseConnectionResourceType(connectionResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = caseCommonFormControlContent(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FILE_TYPE: {
				FileType fileType = (FileType)theEObject;
				T result = caseFileType(fileType);
				if (result == null) result = caseCommonFormControlContent(fileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FIXED_TEXT_TYPE: {
				FixedTextType fixedTextType = (FixedTextType)theEObject;
				T result = caseFixedTextType(fixedTextType);
				if (result == null) result = caseCommonFormControlContent(fixedTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FORMATTED_TEXT_TYPE: {
				FormattedTextType formattedTextType = (FormattedTextType)theEObject;
				T result = caseFormattedTextType(formattedTextType);
				if (result == null) result = caseCommonFormControlContent(formattedTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FORM_TYPE: {
				FormType formType = (FormType)theEObject;
				T result = caseFormType(formType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.FRAME_TYPE: {
				FrameType frameType = (FrameType)theEObject;
				T result = caseFrameType(frameType);
				if (result == null) result = caseCommonFormControlContent(frameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.GENERIC_CONTROL_TYPE: {
				GenericControlType genericControlType = (GenericControlType)theEObject;
				T result = caseGenericControlType(genericControlType);
				if (result == null) result = caseCommonFormControlContent(genericControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.GRID_TYPE: {
				GridType gridType = (GridType)theEObject;
				T result = caseGridType(gridType);
				if (result == null) result = caseCommonFormControlContent(gridType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.HIDDEN_TYPE: {
				HiddenType hiddenType = (HiddenType)theEObject;
				T result = caseHiddenType(hiddenType);
				if (result == null) result = caseCommonFormControlContent(hiddenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.IMAGE_FRAME_TYPE: {
				ImageFrameType imageFrameType = (ImageFrameType)theEObject;
				T result = caseImageFrameType(imageFrameType);
				if (result == null) result = caseCommonFormControlContent(imageFrameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.IMAGE_TYPE: {
				ImageType imageType = (ImageType)theEObject;
				T result = caseImageType(imageType);
				if (result == null) result = caseCommonFormControlContent(imageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.ITEM_TYPE: {
				ItemType itemType = (ItemType)theEObject;
				T result = caseItemType(itemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LISTBOX_TYPE: {
				ListboxType listboxType = (ListboxType)theEObject;
				T result = caseListboxType(listboxType);
				if (result == null) result = caseCommonFormControlContent(listboxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LIST_PROPERTY_TYPE: {
				ListPropertyType listPropertyType = (ListPropertyType)theEObject;
				T result = caseListPropertyType(listPropertyType);
				if (result == null) result = caseFormPropertyTypeAndValueList(listPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LIST_VALUE_TYPE: {
				ListValueType listValueType = (ListValueType)theEObject;
				T result = caseListValueType(listValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LIST_VALUE_TYPE1: {
				ListValueType1 listValueType1 = (ListValueType1)theEObject;
				T result = caseListValueType1(listValueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LIST_VALUE_TYPE2: {
				ListValueType2 listValueType2 = (ListValueType2)theEObject;
				T result = caseListValueType2(listValueType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LIST_VALUE_TYPE3: {
				ListValueType3 listValueType3 = (ListValueType3)theEObject;
				T result = caseListValueType3(listValueType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LIST_VALUE_TYPE4: {
				ListValueType4 listValueType4 = (ListValueType4)theEObject;
				T result = caseListValueType4(listValueType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.LIST_VALUE_TYPE5: {
				ListValueType5 listValueType5 = (ListValueType5)theEObject;
				T result = caseListValueType5(listValueType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PROPERTIES_TYPE: {
				PropertiesType propertiesType = (PropertiesType)theEObject;
				T result = casePropertiesType(propertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.NUMBER_TYPE: {
				NumberType numberType = (NumberType)theEObject;
				T result = caseNumberType(numberType);
				if (result == null) result = caseCommonFormControlContent(numberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.OPTION_TYPE: {
				OptionType optionType = (OptionType)theEObject;
				T result = caseOptionType(optionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PASSWORD_TYPE: {
				PasswordType passwordType = (PasswordType)theEObject;
				T result = casePasswordType(passwordType);
				if (result == null) result = caseCommonFormControlContent(passwordType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.RADIO_TYPE: {
				RadioType radioType = (RadioType)theEObject;
				T result = caseRadioType(radioType);
				if (result == null) result = caseCommonFormControlContent(radioType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.TEXTAREA_TYPE: {
				TextareaType textareaType = (TextareaType)theEObject;
				T result = caseTextareaType(textareaType);
				if (result == null) result = caseCommonFormControlContent(textareaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.TEXT_TYPE: {
				TextType textType = (TextType)theEObject;
				T result = caseTextType(textType);
				if (result == null) result = caseCommonFormControlContent(textType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				T result = caseTimeType(timeType);
				if (result == null) result = caseCommonFormControlContent(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormPackage.VALUE_RANGE_TYPE: {
				ValueRangeType valueRangeType = (ValueRangeType)theEObject;
				T result = caseValueRangeType(valueRangeType);
				if (result == null) result = caseCommonFormControlContent(valueRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonType(ButtonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkbox Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkbox Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckboxType(CheckboxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType(ColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combobox Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combobox Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComboboxType(ComboboxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionResourceType(ConnectionResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileType(FileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedTextType(FixedTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formatted Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formatted Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormattedTextType(FormattedTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormType(FormType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameType(FrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericControlType(GenericControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridType(GridType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hidden Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hidden Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHiddenType(HiddenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageFrameType(ImageFrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageType(ImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemType(ItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listbox Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listbox Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListboxType(ListboxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListPropertyType(ListPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListValueType(ListValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Value Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Value Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListValueType1(ListValueType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Value Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Value Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListValueType2(ListValueType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Value Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Value Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListValueType3(ListValueType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Value Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Value Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListValueType4(ListValueType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Value Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Value Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListValueType5(ListValueType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesType(PropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberType(NumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionType(OptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordType(PasswordType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radio Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radio Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadioType(RadioType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textarea Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textarea Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextareaType(TextareaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextType(TextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeType(TimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRangeType(ValueRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Form Control Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Form Control Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonFormControlContent(CommonFormControlContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Property Type And Value List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Property Type And Value List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormPropertyTypeAndValueList(FormPropertyTypeAndValueList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //FormSwitch
