/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.oasisopen.names.tc.opendocument.xmlns.form.ButtonType;
import org.oasisopen.names.tc.opendocument.xmlns.form.CheckboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ComboboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.CommandTypeType;
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
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageFrameType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImagePositionType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ImageType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ItemType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListPropertyType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListSourceTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType1;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType2;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType3;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType4;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListValueType5;
import org.oasisopen.names.tc.opendocument.xmlns.form.ListboxType;
import org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.form.MethodTypeMember2;
import org.oasisopen.names.tc.opendocument.xmlns.form.NumberType;
import org.oasisopen.names.tc.opendocument.xmlns.form.OptionType;
import org.oasisopen.names.tc.opendocument.xmlns.form.OrientationType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PasswordType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PropertiesType;
import org.oasisopen.names.tc.opendocument.xmlns.form.PropertyType;
import org.oasisopen.names.tc.opendocument.xmlns.form.RadioType;
import org.oasisopen.names.tc.opendocument.xmlns.form.TextType;
import org.oasisopen.names.tc.opendocument.xmlns.form.TextareaType;
import org.oasisopen.names.tc.opendocument.xmlns.form.TimeType;
import org.oasisopen.names.tc.opendocument.xmlns.form.ValueRangeType;
import org.oasisopen.names.tc.opendocument.xmlns.form.VisualEffectType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage
 * @generated
 */
public class FormValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FormValidator INSTANCE = new FormValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.form";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FormPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FormPackage.BUTTON_TYPE:
				return validateButtonType((ButtonType)value, diagnostics, context);
			case FormPackage.CHECKBOX_TYPE:
				return validateCheckboxType((CheckboxType)value, diagnostics, context);
			case FormPackage.COLUMN_TYPE:
				return validateColumnType((ColumnType)value, diagnostics, context);
			case FormPackage.COMBOBOX_TYPE:
				return validateComboboxType((ComboboxType)value, diagnostics, context);
			case FormPackage.CONNECTION_RESOURCE_TYPE:
				return validateConnectionResourceType((ConnectionResourceType)value, diagnostics, context);
			case FormPackage.DATE_TYPE:
				return validateDateType((DateType)value, diagnostics, context);
			case FormPackage.FILE_TYPE:
				return validateFileType((FileType)value, diagnostics, context);
			case FormPackage.FIXED_TEXT_TYPE:
				return validateFixedTextType((FixedTextType)value, diagnostics, context);
			case FormPackage.FORMATTED_TEXT_TYPE:
				return validateFormattedTextType((FormattedTextType)value, diagnostics, context);
			case FormPackage.FORM_TYPE:
				return validateFormType((FormType)value, diagnostics, context);
			case FormPackage.FRAME_TYPE:
				return validateFrameType((FrameType)value, diagnostics, context);
			case FormPackage.GENERIC_CONTROL_TYPE:
				return validateGenericControlType((GenericControlType)value, diagnostics, context);
			case FormPackage.GRID_TYPE:
				return validateGridType((GridType)value, diagnostics, context);
			case FormPackage.HIDDEN_TYPE:
				return validateHiddenType((HiddenType)value, diagnostics, context);
			case FormPackage.IMAGE_FRAME_TYPE:
				return validateImageFrameType((ImageFrameType)value, diagnostics, context);
			case FormPackage.IMAGE_TYPE:
				return validateImageType((ImageType)value, diagnostics, context);
			case FormPackage.ITEM_TYPE:
				return validateItemType((ItemType)value, diagnostics, context);
			case FormPackage.LISTBOX_TYPE:
				return validateListboxType((ListboxType)value, diagnostics, context);
			case FormPackage.LIST_PROPERTY_TYPE:
				return validateListPropertyType((ListPropertyType)value, diagnostics, context);
			case FormPackage.LIST_VALUE_TYPE:
				return validateListValueType((ListValueType)value, diagnostics, context);
			case FormPackage.LIST_VALUE_TYPE1:
				return validateListValueType1((ListValueType1)value, diagnostics, context);
			case FormPackage.LIST_VALUE_TYPE2:
				return validateListValueType2((ListValueType2)value, diagnostics, context);
			case FormPackage.LIST_VALUE_TYPE3:
				return validateListValueType3((ListValueType3)value, diagnostics, context);
			case FormPackage.LIST_VALUE_TYPE4:
				return validateListValueType4((ListValueType4)value, diagnostics, context);
			case FormPackage.LIST_VALUE_TYPE5:
				return validateListValueType5((ListValueType5)value, diagnostics, context);
			case FormPackage.PROPERTIES_TYPE:
				return validatePropertiesType((PropertiesType)value, diagnostics, context);
			case FormPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case FormPackage.NUMBER_TYPE:
				return validateNumberType((NumberType)value, diagnostics, context);
			case FormPackage.OPTION_TYPE:
				return validateOptionType((OptionType)value, diagnostics, context);
			case FormPackage.PASSWORD_TYPE:
				return validatePasswordType((PasswordType)value, diagnostics, context);
			case FormPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case FormPackage.RADIO_TYPE:
				return validateRadioType((RadioType)value, diagnostics, context);
			case FormPackage.TEXTAREA_TYPE:
				return validateTextareaType((TextareaType)value, diagnostics, context);
			case FormPackage.TEXT_TYPE:
				return validateTextType((TextType)value, diagnostics, context);
			case FormPackage.TIME_TYPE:
				return validateTimeType((TimeType)value, diagnostics, context);
			case FormPackage.VALUE_RANGE_TYPE:
				return validateValueRangeType((ValueRangeType)value, diagnostics, context);
			case FormPackage.COMMAND_TYPE_TYPE:
				return validateCommandTypeType((CommandTypeType)value, diagnostics, context);
			case FormPackage.IMAGE_ALIGN_TYPE:
				return validateImageAlignType((ImageAlignType)value, diagnostics, context);
			case FormPackage.IMAGE_POSITION_TYPE:
				return validateImagePositionType((ImagePositionType)value, diagnostics, context);
			case FormPackage.LIST_SOURCE_TYPE_TYPE:
				return validateListSourceTypeType((ListSourceTypeType)value, diagnostics, context);
			case FormPackage.METHOD_TYPE_MEMBER1:
				return validateMethodTypeMember1((MethodTypeMember1)value, diagnostics, context);
			case FormPackage.METHOD_TYPE_MEMBER2:
				return validateMethodTypeMember2((MethodTypeMember2)value, diagnostics, context);
			case FormPackage.ORIENTATION_TYPE:
				return validateOrientationType((OrientationType)value, diagnostics, context);
			case FormPackage.VISUAL_EFFECT_TYPE:
				return validateVisualEffectType((VisualEffectType)value, diagnostics, context);
			case FormPackage.COMMAND_TYPE_TYPE_OBJECT:
				return validateCommandTypeTypeObject((CommandTypeType)value, diagnostics, context);
			case FormPackage.DATASOURCE_TYPE:
				return validateDatasourceType((String)value, diagnostics, context);
			case FormPackage.IMAGE_ALIGN_TYPE_OBJECT:
				return validateImageAlignTypeObject((ImageAlignType)value, diagnostics, context);
			case FormPackage.IMAGE_POSITION_TYPE_OBJECT:
				return validateImagePositionTypeObject((ImagePositionType)value, diagnostics, context);
			case FormPackage.LIST_SOURCE_TYPE_TYPE_OBJECT:
				return validateListSourceTypeTypeObject((ListSourceTypeType)value, diagnostics, context);
			case FormPackage.METHOD_TYPE:
				return validateMethodType(value, diagnostics, context);
			case FormPackage.METHOD_TYPE_MEMBER1_OBJECT:
				return validateMethodTypeMember1Object((MethodTypeMember1)value, diagnostics, context);
			case FormPackage.METHOD_TYPE_MEMBER2_OBJECT:
				return validateMethodTypeMember2Object((MethodTypeMember2)value, diagnostics, context);
			case FormPackage.ORIENTATION_TYPE_OBJECT:
				return validateOrientationTypeObject((OrientationType)value, diagnostics, context);
			case FormPackage.TEXT_STYLE_NAME_TYPE:
				return validateTextStyleNameType((String)value, diagnostics, context);
			case FormPackage.TEXT_STYLE_NAME_TYPE_MEMBER1:
				return validateTextStyleNameTypeMember1((String)value, diagnostics, context);
			case FormPackage.VISUAL_EFFECT_TYPE_OBJECT:
				return validateVisualEffectTypeObject((VisualEffectType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonType(ButtonType buttonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buttonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckboxType(CheckboxType checkboxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkboxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnType(ColumnType columnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComboboxType(ComboboxType comboboxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comboboxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionResourceType(ConnectionResourceType connectionResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType(DateType dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileType(FileType fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedTextType(FixedTextType fixedTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormattedTextType(FormattedTextType formattedTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formattedTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormType(FormType formType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameType(FrameType frameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericControlType(GenericControlType genericControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridType(GridType gridType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHiddenType(HiddenType hiddenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hiddenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageFrameType(ImageFrameType imageFrameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageFrameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageType(ImageType imageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType(ItemType itemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListboxType(ListboxType listboxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listboxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListPropertyType(ListPropertyType listPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListValueType(ListValueType listValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListValueType1(ListValueType1 listValueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listValueType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListValueType2(ListValueType2 listValueType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listValueType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListValueType3(ListValueType3 listValueType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listValueType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListValueType4(ListValueType4 listValueType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listValueType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListValueType5(ListValueType5 listValueType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listValueType5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertiesType(PropertiesType propertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberType(NumberType numberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionType(OptionType optionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePasswordType(PasswordType passwordType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passwordType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRadioType(RadioType radioType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(radioType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextareaType(TextareaType textareaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textareaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextType(TextType textType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType(TimeType timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueRangeType(ValueRangeType valueRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandTypeType(CommandTypeType commandTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageAlignType(ImageAlignType imageAlignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagePositionType(ImagePositionType imagePositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListSourceTypeType(ListSourceTypeType listSourceTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodTypeMember1(MethodTypeMember1 methodTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodTypeMember2(MethodTypeMember2 methodTypeMember2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType(OrientationType orientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisualEffectType(VisualEffectType visualEffectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandTypeTypeObject(CommandTypeType commandTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasourceType(String datasourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageAlignTypeObject(ImageAlignType imageAlignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagePositionTypeObject(ImagePositionType imagePositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListSourceTypeTypeObject(ListSourceTypeType listSourceTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodType(Object methodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMethodType_MemberTypes(methodType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodType_MemberTypes(Object methodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (FormPackage.eINSTANCE.getMethodTypeMember1().isInstance(methodType)) {
				if (validateMethodTypeMember1((MethodTypeMember1)methodType, tempDiagnostics, context)) return true;
			}
			if (FormPackage.eINSTANCE.getMethodTypeMember2().isInstance(methodType)) {
				if (validateMethodTypeMember2((MethodTypeMember2)methodType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (FormPackage.eINSTANCE.getMethodTypeMember1().isInstance(methodType)) {
				if (validateMethodTypeMember1((MethodTypeMember1)methodType, null, context)) return true;
			}
			if (FormPackage.eINSTANCE.getMethodTypeMember2().isInstance(methodType)) {
				if (validateMethodTypeMember2((MethodTypeMember2)methodType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodTypeMember1Object(MethodTypeMember1 methodTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodTypeMember2Object(MethodTypeMember2 methodTypeMember2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationTypeObject(OrientationType orientationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameType(String textStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextStyleNameType_MemberTypes(textStyleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Text Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameType_MemberTypes(String textStyleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (FormPackage.eINSTANCE.getTextStyleNameTypeMember1().isInstance(textStyleNameType)) {
				if (validateTextStyleNameTypeMember1(textStyleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (FormPackage.eINSTANCE.getTextStyleNameTypeMember1().isInstance(textStyleNameType)) {
				if (validateTextStyleNameTypeMember1(textStyleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameTypeMember1(String textStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTextStyleNameTypeMember1_MinLength(textStyleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextStyleNameTypeMember1_MaxLength(textStyleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Text Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameTypeMember1_MinLength(String textStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textStyleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FormPackage.eINSTANCE.getTextStyleNameTypeMember1(), textStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Text Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleNameTypeMember1_MaxLength(String textStyleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = textStyleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(FormPackage.eINSTANCE.getTextStyleNameTypeMember1(), textStyleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisualEffectTypeObject(VisualEffectType visualEffectTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FormValidator
