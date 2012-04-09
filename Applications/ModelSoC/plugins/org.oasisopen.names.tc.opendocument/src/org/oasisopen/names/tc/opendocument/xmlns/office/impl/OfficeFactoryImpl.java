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
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType;
import org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChartType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentContentType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentMetaType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentSettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DocumentType;
import org.oasisopen.names.tc.opendocument.xmlns.office.DrawingType;
import org.oasisopen.names.tc.opendocument.xmlns.office.EventListenersType;
import org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.FormsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.MasterStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficeFactory;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.SettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType;
import org.oasisopen.names.tc.opendocument.xmlns.office.StylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.TextType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OfficeFactoryImpl extends EFactoryImpl implements OfficeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OfficeFactory init() {
		try {
			OfficeFactory theOfficeFactory = (OfficeFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:office:1.0"); 
			if (theOfficeFactory != null) {
				return theOfficeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OfficeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeFactoryImpl() {
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
			case OfficePackage.ANNOTATION_TYPE: return createAnnotationType();
			case OfficePackage.AUTOMATIC_STYLES_TYPE: return createAutomaticStylesType();
			case OfficePackage.CHANGE_INFO_TYPE: return createChangeInfoType();
			case OfficePackage.CHART_TYPE: return createChartType();
			case OfficePackage.DOCUMENT_CONTENT_TYPE: return createDocumentContentType();
			case OfficePackage.DOCUMENT_META_TYPE: return createDocumentMetaType();
			case OfficePackage.DOCUMENT_SETTINGS_TYPE: return createDocumentSettingsType();
			case OfficePackage.DOCUMENT_STYLES_TYPE: return createDocumentStylesType();
			case OfficePackage.DOCUMENT_TYPE: return createDocumentType();
			case OfficePackage.DRAWING_TYPE: return createDrawingType();
			case OfficePackage.EVENT_LISTENERS_TYPE: return createEventListenersType();
			case OfficePackage.FONT_FACE_DECLS_TYPE: return createFontFaceDeclsType();
			case OfficePackage.FORMS_TYPE: return createFormsType();
			case OfficePackage.MASTER_STYLES_TYPE: return createMasterStylesType();
			case OfficePackage.PRESENTATION_TYPE: return createPresentationType();
			case OfficePackage.SCRIPTS_TYPE: return createScriptsType();
			case OfficePackage.SCRIPT_TYPE: return createScriptType();
			case OfficePackage.SETTINGS_TYPE: return createSettingsType();
			case OfficePackage.SPREADSHEET_TYPE: return createSpreadsheetType();
			case OfficePackage.STYLES_TYPE: return createStylesType();
			case OfficePackage.TEXT_TYPE: return createTextType();
			case OfficePackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case OfficePackage.CONVERSION_MODE_TYPE:
				return createConversionModeTypeFromString(eDataType, initialValue);
			case OfficePackage.VALUE_TYPE_TYPE:
				return createValueTypeTypeFromString(eDataType, initialValue);
			case OfficePackage.VALUE_TYPE_TYPE1:
				return createValueTypeType1FromString(eDataType, initialValue);
			case OfficePackage.CONVERSION_MODE_TYPE_OBJECT:
				return createConversionModeTypeObjectFromString(eDataType, initialValue);
			case OfficePackage.VALUE_TYPE_TYPE_OBJECT:
				return createValueTypeTypeObjectFromString(eDataType, initialValue);
			case OfficePackage.VALUE_TYPE_TYPE_OBJECT1:
				return createValueTypeTypeObject1FromString(eDataType, initialValue);
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
			case OfficePackage.CONVERSION_MODE_TYPE:
				return convertConversionModeTypeToString(eDataType, instanceValue);
			case OfficePackage.VALUE_TYPE_TYPE:
				return convertValueTypeTypeToString(eDataType, instanceValue);
			case OfficePackage.VALUE_TYPE_TYPE1:
				return convertValueTypeType1ToString(eDataType, instanceValue);
			case OfficePackage.CONVERSION_MODE_TYPE_OBJECT:
				return convertConversionModeTypeObjectToString(eDataType, instanceValue);
			case OfficePackage.VALUE_TYPE_TYPE_OBJECT:
				return convertValueTypeTypeObjectToString(eDataType, instanceValue);
			case OfficePackage.VALUE_TYPE_TYPE_OBJECT1:
				return convertValueTypeTypeObject1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomaticStylesType createAutomaticStylesType() {
		AutomaticStylesTypeImpl automaticStylesType = new AutomaticStylesTypeImpl();
		return automaticStylesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInfoType createChangeInfoType() {
		ChangeInfoTypeImpl changeInfoType = new ChangeInfoTypeImpl();
		return changeInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType createChartType() {
		ChartTypeImpl chartType = new ChartTypeImpl();
		return chartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentContentType createDocumentContentType() {
		DocumentContentTypeImpl documentContentType = new DocumentContentTypeImpl();
		return documentContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentMetaType createDocumentMetaType() {
		DocumentMetaTypeImpl documentMetaType = new DocumentMetaTypeImpl();
		return documentMetaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentSettingsType createDocumentSettingsType() {
		DocumentSettingsTypeImpl documentSettingsType = new DocumentSettingsTypeImpl();
		return documentSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStylesType createDocumentStylesType() {
		DocumentStylesTypeImpl documentStylesType = new DocumentStylesTypeImpl();
		return documentStylesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType createDocumentType() {
		DocumentTypeImpl documentType = new DocumentTypeImpl();
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingType createDrawingType() {
		DrawingTypeImpl drawingType = new DrawingTypeImpl();
		return drawingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListenersType createEventListenersType() {
		EventListenersTypeImpl eventListenersType = new EventListenersTypeImpl();
		return eventListenersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceDeclsType createFontFaceDeclsType() {
		FontFaceDeclsTypeImpl fontFaceDeclsType = new FontFaceDeclsTypeImpl();
		return fontFaceDeclsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsType createFormsType() {
		FormsTypeImpl formsType = new FormsTypeImpl();
		return formsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterStylesType createMasterStylesType() {
		MasterStylesTypeImpl masterStylesType = new MasterStylesTypeImpl();
		return masterStylesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationType createPresentationType() {
		PresentationTypeImpl presentationType = new PresentationTypeImpl();
		return presentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptsType createScriptsType() {
		ScriptsTypeImpl scriptsType = new ScriptsTypeImpl();
		return scriptsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType createScriptType() {
		ScriptTypeImpl scriptType = new ScriptTypeImpl();
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsType createSettingsType() {
		SettingsTypeImpl settingsType = new SettingsTypeImpl();
		return settingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetType createSpreadsheetType() {
		SpreadsheetTypeImpl spreadsheetType = new SpreadsheetTypeImpl();
		return spreadsheetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesType createStylesType() {
		StylesTypeImpl stylesType = new StylesTypeImpl();
		return stylesType;
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
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionModeType createConversionModeTypeFromString(EDataType eDataType, String initialValue) {
		ConversionModeType result = ConversionModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConversionModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType createValueTypeTypeFromString(EDataType eDataType, String initialValue) {
		ValueTypeType result = ValueTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType1 createValueTypeType1FromString(EDataType eDataType, String initialValue) {
		ValueTypeType1 result = ValueTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionModeType createConversionModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConversionModeTypeFromString(OfficePackage.Literals.CONVERSION_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConversionModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConversionModeTypeToString(OfficePackage.Literals.CONVERSION_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType createValueTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValueTypeTypeFromString(OfficePackage.Literals.VALUE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValueTypeTypeToString(OfficePackage.Literals.VALUE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType1 createValueTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createValueTypeType1FromString(OfficePackage.Literals.VALUE_TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertValueTypeType1ToString(OfficePackage.Literals.VALUE_TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficePackage getOfficePackage() {
		return (OfficePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OfficePackage getPackage() {
		return OfficePackage.eINSTANCE;
	}

} //OfficeFactoryImpl
