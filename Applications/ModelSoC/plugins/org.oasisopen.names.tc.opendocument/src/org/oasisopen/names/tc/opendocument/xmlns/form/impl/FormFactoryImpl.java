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
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
import org.oasisopen.names.tc.opendocument.xmlns.form.FormFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormFactoryImpl extends EFactoryImpl implements FormFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormFactory init() {
		try {
			FormFactory theFormFactory = (FormFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:form:1.0"); 
			if (theFormFactory != null) {
				return theFormFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FormFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FormPackage.BUTTON_TYPE: return createButtonType();
			case FormPackage.CHECKBOX_TYPE: return createCheckboxType();
			case FormPackage.COLUMN_TYPE: return createColumnType();
			case FormPackage.COMBOBOX_TYPE: return createComboboxType();
			case FormPackage.CONNECTION_RESOURCE_TYPE: return createConnectionResourceType();
			case FormPackage.DATE_TYPE: return createDateType();
			case FormPackage.FILE_TYPE: return createFileType();
			case FormPackage.FIXED_TEXT_TYPE: return createFixedTextType();
			case FormPackage.FORMATTED_TEXT_TYPE: return createFormattedTextType();
			case FormPackage.FORM_TYPE: return createFormType();
			case FormPackage.FRAME_TYPE: return createFrameType();
			case FormPackage.GENERIC_CONTROL_TYPE: return createGenericControlType();
			case FormPackage.GRID_TYPE: return createGridType();
			case FormPackage.HIDDEN_TYPE: return createHiddenType();
			case FormPackage.IMAGE_FRAME_TYPE: return createImageFrameType();
			case FormPackage.IMAGE_TYPE: return createImageType();
			case FormPackage.ITEM_TYPE: return createItemType();
			case FormPackage.LISTBOX_TYPE: return createListboxType();
			case FormPackage.LIST_PROPERTY_TYPE: return createListPropertyType();
			case FormPackage.LIST_VALUE_TYPE: return createListValueType();
			case FormPackage.LIST_VALUE_TYPE1: return createListValueType1();
			case FormPackage.LIST_VALUE_TYPE2: return createListValueType2();
			case FormPackage.LIST_VALUE_TYPE3: return createListValueType3();
			case FormPackage.LIST_VALUE_TYPE4: return createListValueType4();
			case FormPackage.LIST_VALUE_TYPE5: return createListValueType5();
			case FormPackage.PROPERTIES_TYPE: return createPropertiesType();
			case FormPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FormPackage.NUMBER_TYPE: return createNumberType();
			case FormPackage.OPTION_TYPE: return createOptionType();
			case FormPackage.PASSWORD_TYPE: return createPasswordType();
			case FormPackage.PROPERTY_TYPE: return createPropertyType();
			case FormPackage.RADIO_TYPE: return createRadioType();
			case FormPackage.TEXTAREA_TYPE: return createTextareaType();
			case FormPackage.TEXT_TYPE: return createTextType();
			case FormPackage.TIME_TYPE: return createTimeType();
			case FormPackage.VALUE_RANGE_TYPE: return createValueRangeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FormPackage.COMMAND_TYPE_TYPE:
				return createCommandTypeTypeFromString(eDataType, initialValue);
			case FormPackage.IMAGE_ALIGN_TYPE:
				return createImageAlignTypeFromString(eDataType, initialValue);
			case FormPackage.IMAGE_POSITION_TYPE:
				return createImagePositionTypeFromString(eDataType, initialValue);
			case FormPackage.LIST_SOURCE_TYPE_TYPE:
				return createListSourceTypeTypeFromString(eDataType, initialValue);
			case FormPackage.METHOD_TYPE_MEMBER1:
				return createMethodTypeMember1FromString(eDataType, initialValue);
			case FormPackage.METHOD_TYPE_MEMBER2:
				return createMethodTypeMember2FromString(eDataType, initialValue);
			case FormPackage.ORIENTATION_TYPE:
				return createOrientationTypeFromString(eDataType, initialValue);
			case FormPackage.VISUAL_EFFECT_TYPE:
				return createVisualEffectTypeFromString(eDataType, initialValue);
			case FormPackage.COMMAND_TYPE_TYPE_OBJECT:
				return createCommandTypeTypeObjectFromString(eDataType, initialValue);
			case FormPackage.DATASOURCE_TYPE:
				return createDatasourceTypeFromString(eDataType, initialValue);
			case FormPackage.IMAGE_ALIGN_TYPE_OBJECT:
				return createImageAlignTypeObjectFromString(eDataType, initialValue);
			case FormPackage.IMAGE_POSITION_TYPE_OBJECT:
				return createImagePositionTypeObjectFromString(eDataType, initialValue);
			case FormPackage.LIST_SOURCE_TYPE_TYPE_OBJECT:
				return createListSourceTypeTypeObjectFromString(eDataType, initialValue);
			case FormPackage.METHOD_TYPE:
				return createMethodTypeFromString(eDataType, initialValue);
			case FormPackage.METHOD_TYPE_MEMBER1_OBJECT:
				return createMethodTypeMember1ObjectFromString(eDataType, initialValue);
			case FormPackage.METHOD_TYPE_MEMBER2_OBJECT:
				return createMethodTypeMember2ObjectFromString(eDataType, initialValue);
			case FormPackage.ORIENTATION_TYPE_OBJECT:
				return createOrientationTypeObjectFromString(eDataType, initialValue);
			case FormPackage.TEXT_STYLE_NAME_TYPE:
				return createTextStyleNameTypeFromString(eDataType, initialValue);
			case FormPackage.TEXT_STYLE_NAME_TYPE_MEMBER1:
				return createTextStyleNameTypeMember1FromString(eDataType, initialValue);
			case FormPackage.VISUAL_EFFECT_TYPE_OBJECT:
				return createVisualEffectTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FormPackage.COMMAND_TYPE_TYPE:
				return convertCommandTypeTypeToString(eDataType, instanceValue);
			case FormPackage.IMAGE_ALIGN_TYPE:
				return convertImageAlignTypeToString(eDataType, instanceValue);
			case FormPackage.IMAGE_POSITION_TYPE:
				return convertImagePositionTypeToString(eDataType, instanceValue);
			case FormPackage.LIST_SOURCE_TYPE_TYPE:
				return convertListSourceTypeTypeToString(eDataType, instanceValue);
			case FormPackage.METHOD_TYPE_MEMBER1:
				return convertMethodTypeMember1ToString(eDataType, instanceValue);
			case FormPackage.METHOD_TYPE_MEMBER2:
				return convertMethodTypeMember2ToString(eDataType, instanceValue);
			case FormPackage.ORIENTATION_TYPE:
				return convertOrientationTypeToString(eDataType, instanceValue);
			case FormPackage.VISUAL_EFFECT_TYPE:
				return convertVisualEffectTypeToString(eDataType, instanceValue);
			case FormPackage.COMMAND_TYPE_TYPE_OBJECT:
				return convertCommandTypeTypeObjectToString(eDataType, instanceValue);
			case FormPackage.DATASOURCE_TYPE:
				return convertDatasourceTypeToString(eDataType, instanceValue);
			case FormPackage.IMAGE_ALIGN_TYPE_OBJECT:
				return convertImageAlignTypeObjectToString(eDataType, instanceValue);
			case FormPackage.IMAGE_POSITION_TYPE_OBJECT:
				return convertImagePositionTypeObjectToString(eDataType, instanceValue);
			case FormPackage.LIST_SOURCE_TYPE_TYPE_OBJECT:
				return convertListSourceTypeTypeObjectToString(eDataType, instanceValue);
			case FormPackage.METHOD_TYPE:
				return convertMethodTypeToString(eDataType, instanceValue);
			case FormPackage.METHOD_TYPE_MEMBER1_OBJECT:
				return convertMethodTypeMember1ObjectToString(eDataType, instanceValue);
			case FormPackage.METHOD_TYPE_MEMBER2_OBJECT:
				return convertMethodTypeMember2ObjectToString(eDataType, instanceValue);
			case FormPackage.ORIENTATION_TYPE_OBJECT:
				return convertOrientationTypeObjectToString(eDataType, instanceValue);
			case FormPackage.TEXT_STYLE_NAME_TYPE:
				return convertTextStyleNameTypeToString(eDataType, instanceValue);
			case FormPackage.TEXT_STYLE_NAME_TYPE_MEMBER1:
				return convertTextStyleNameTypeMember1ToString(eDataType, instanceValue);
			case FormPackage.VISUAL_EFFECT_TYPE_OBJECT:
				return convertVisualEffectTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonType createButtonType() {
		ButtonTypeImpl buttonType = new ButtonTypeImpl();
		return buttonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckboxType createCheckboxType() {
		CheckboxTypeImpl checkboxType = new CheckboxTypeImpl();
		return checkboxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnType createColumnType() {
		ColumnTypeImpl columnType = new ColumnTypeImpl();
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboboxType createComboboxType() {
		ComboboxTypeImpl comboboxType = new ComboboxTypeImpl();
		return comboboxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionResourceType createConnectionResourceType() {
		ConnectionResourceTypeImpl connectionResourceType = new ConnectionResourceTypeImpl();
		return connectionResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileType() {
		FileTypeImpl fileType = new FileTypeImpl();
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedTextType createFixedTextType() {
		FixedTextTypeImpl fixedTextType = new FixedTextTypeImpl();
		return fixedTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedTextType createFormattedTextType() {
		FormattedTextTypeImpl formattedTextType = new FormattedTextTypeImpl();
		return formattedTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormType createFormType() {
		FormTypeImpl formType = new FormTypeImpl();
		return formType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType createFrameType() {
		FrameTypeImpl frameType = new FrameTypeImpl();
		return frameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericControlType createGenericControlType() {
		GenericControlTypeImpl genericControlType = new GenericControlTypeImpl();
		return genericControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridType createGridType() {
		GridTypeImpl gridType = new GridTypeImpl();
		return gridType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiddenType createHiddenType() {
		HiddenTypeImpl hiddenType = new HiddenTypeImpl();
		return hiddenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFrameType createImageFrameType() {
		ImageFrameTypeImpl imageFrameType = new ImageFrameTypeImpl();
		return imageFrameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageType createImageType() {
		ImageTypeImpl imageType = new ImageTypeImpl();
		return imageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListboxType createListboxType() {
		ListboxTypeImpl listboxType = new ListboxTypeImpl();
		return listboxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListPropertyType createListPropertyType() {
		ListPropertyTypeImpl listPropertyType = new ListPropertyTypeImpl();
		return listPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValueType createListValueType() {
		ListValueTypeImpl listValueType = new ListValueTypeImpl();
		return listValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValueType1 createListValueType1() {
		ListValueType1Impl listValueType1 = new ListValueType1Impl();
		return listValueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValueType2 createListValueType2() {
		ListValueType2Impl listValueType2 = new ListValueType2Impl();
		return listValueType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValueType3 createListValueType3() {
		ListValueType3Impl listValueType3 = new ListValueType3Impl();
		return listValueType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValueType4 createListValueType4() {
		ListValueType4Impl listValueType4 = new ListValueType4Impl();
		return listValueType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValueType5 createListValueType5() {
		ListValueType5Impl listValueType5 = new ListValueType5Impl();
		return listValueType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType createNumberType() {
		NumberTypeImpl numberType = new NumberTypeImpl();
		return numberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionType createOptionType() {
		OptionTypeImpl optionType = new OptionTypeImpl();
		return optionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordType createPasswordType() {
		PasswordTypeImpl passwordType = new PasswordTypeImpl();
		return passwordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioType createRadioType() {
		RadioTypeImpl radioType = new RadioTypeImpl();
		return radioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaType createTextareaType() {
		TextareaTypeImpl textareaType = new TextareaTypeImpl();
		return textareaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType createTextType() {
		TextTypeImpl textType = new TextTypeImpl();
		return textType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangeType createValueRangeType() {
		ValueRangeTypeImpl valueRangeType = new ValueRangeTypeImpl();
		return valueRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandTypeType createCommandTypeTypeFromString(EDataType eDataType, String initialValue) {
		CommandTypeType result = CommandTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAlignType createImageAlignTypeFromString(EDataType eDataType, String initialValue) {
		ImageAlignType result = ImageAlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePositionType createImagePositionTypeFromString(EDataType eDataType, String initialValue) {
		ImagePositionType result = ImagePositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagePositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListSourceTypeType createListSourceTypeTypeFromString(EDataType eDataType, String initialValue) {
		ListSourceTypeType result = ListSourceTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListSourceTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTypeMember1 createMethodTypeMember1FromString(EDataType eDataType, String initialValue) {
		MethodTypeMember1 result = MethodTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTypeMember2 createMethodTypeMember2FromString(EDataType eDataType, String initialValue) {
		MethodTypeMember2 result = MethodTypeMember2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodTypeMember2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationTypeFromString(EDataType eDataType, String initialValue) {
		OrientationType result = OrientationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualEffectType createVisualEffectTypeFromString(EDataType eDataType, String initialValue) {
		VisualEffectType result = VisualEffectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualEffectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandTypeType createCommandTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCommandTypeTypeFromString(FormPackage.eINSTANCE.getCommandTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommandTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCommandTypeTypeToString(FormPackage.eINSTANCE.getCommandTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDatasourceTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatasourceTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAlignType createImageAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImageAlignTypeFromString(FormPackage.eINSTANCE.getImageAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImageAlignTypeToString(FormPackage.eINSTANCE.getImageAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagePositionType createImagePositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImagePositionTypeFromString(FormPackage.eINSTANCE.getImagePositionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagePositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImagePositionTypeToString(FormPackage.eINSTANCE.getImagePositionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListSourceTypeType createListSourceTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createListSourceTypeTypeFromString(FormPackage.eINSTANCE.getListSourceTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListSourceTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListSourceTypeTypeToString(FormPackage.eINSTANCE.getListSourceTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMethodTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createMethodTypeMember1FromString(FormPackage.eINSTANCE.getMethodTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMethodTypeMember2FromString(FormPackage.eINSTANCE.getMethodTypeMember2(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (FormPackage.eINSTANCE.getMethodTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertMethodTypeMember1ToString(FormPackage.eINSTANCE.getMethodTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (FormPackage.eINSTANCE.getMethodTypeMember2().isInstance(instanceValue)) {
			try {
				String value = convertMethodTypeMember2ToString(FormPackage.eINSTANCE.getMethodTypeMember2(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTypeMember1 createMethodTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMethodTypeMember1FromString(FormPackage.eINSTANCE.getMethodTypeMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMethodTypeMember1ToString(FormPackage.eINSTANCE.getMethodTypeMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodTypeMember2 createMethodTypeMember2ObjectFromString(EDataType eDataType, String initialValue) {
		return createMethodTypeMember2FromString(FormPackage.eINSTANCE.getMethodTypeMember2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodTypeMember2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMethodTypeMember2ToString(FormPackage.eINSTANCE.getMethodTypeMember2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOrientationTypeFromString(FormPackage.eINSTANCE.getOrientationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationTypeToString(FormPackage.eINSTANCE.getOrientationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createTextStyleNameTypeMember1FromString(FormPackage.eINSTANCE.getTextStyleNameTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (FormPackage.eINSTANCE.getTextStyleNameTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertTextStyleNameTypeMember1ToString(FormPackage.eINSTANCE.getTextStyleNameTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualEffectType createVisualEffectTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVisualEffectTypeFromString(FormPackage.eINSTANCE.getVisualEffectType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisualEffectTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisualEffectTypeToString(FormPackage.eINSTANCE.getVisualEffectType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormPackage getFormPackage() {
		return (FormPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FormPackage getPackage() {
		return FormPackage.eINSTANCE;
	}

} //FormFactoryImpl
