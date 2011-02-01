/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.StopType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgFactory;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;
import org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextFactory;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SvgFactoryImpl extends EFactoryImpl implements SvgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SvgFactory init() {
		try {
			SvgFactory theSvgFactory = (SvgFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"); 
			if (theSvgFactory != null) {
				return theSvgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SvgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgFactoryImpl() {
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
			case SvgPackage.DEFINITION_SRC_TYPE: return createDefinitionSrcType();
			case SvgPackage.FONT_FACE_FORMAT_TYPE: return createFontFaceFormatType();
			case SvgPackage.FONT_FACE_NAME_TYPE: return createFontFaceNameType();
			case SvgPackage.FONT_FACE_SRC_TYPE: return createFontFaceSrcType();
			case SvgPackage.FONT_FACE_URI_TYPE: return createFontFaceUriType();
			case SvgPackage.LINEAR_GRADIENT_TYPE: return createLinearGradientType();
			case SvgPackage.RADIAL_GRADIENT_TYPE: return createRadialGradientType();
			case SvgPackage.STOP_TYPE: return createStopType();
			case SvgPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case SvgPackage.FILL_RULE_TYPE:
				return createFillRuleTypeFromString(eDataType, initialValue);
			case SvgPackage.FONT_STRETCH_TYPE:
				return createFontStretchTypeFromString(eDataType, initialValue);
			case SvgPackage.GRADIENT_UNITS_TYPE:
				return createGradientUnitsTypeFromString(eDataType, initialValue);
			case SvgPackage.SPREAD_METHOD_TYPE:
				return createSpreadMethodTypeFromString(eDataType, initialValue);
			case SvgPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case SvgPackage.CX_TYPE:
				return createCxTypeFromString(eDataType, initialValue);
			case SvgPackage.CY_TYPE:
				return createCyTypeFromString(eDataType, initialValue);
			case SvgPackage.FILL_RULE_TYPE_OBJECT:
				return createFillRuleTypeObjectFromString(eDataType, initialValue);
			case SvgPackage.FONT_STRETCH_TYPE_OBJECT:
				return createFontStretchTypeObjectFromString(eDataType, initialValue);
			case SvgPackage.FX_TYPE:
				return createFxTypeFromString(eDataType, initialValue);
			case SvgPackage.FY_TYPE:
				return createFyTypeFromString(eDataType, initialValue);
			case SvgPackage.GRADIENT_UNITS_TYPE_OBJECT:
				return createGradientUnitsTypeObjectFromString(eDataType, initialValue);
			case SvgPackage.HEIGHT_TYPE:
				return createHeightTypeFromString(eDataType, initialValue);
			case SvgPackage.OFFSET_TYPE:
				return createOffsetTypeFromString(eDataType, initialValue);
			case SvgPackage.RTYPE:
				return createRTypeFromString(eDataType, initialValue);
			case SvgPackage.SPREAD_METHOD_TYPE_OBJECT:
				return createSpreadMethodTypeObjectFromString(eDataType, initialValue);
			case SvgPackage.STROKE_OPACITY_TYPE:
				return createStrokeOpacityTypeFromString(eDataType, initialValue);
			case SvgPackage.STROKE_OPACITY_TYPE_MEMBER1:
				return createStrokeOpacityTypeMember1FromString(eDataType, initialValue);
			case SvgPackage.STROKE_OPACITY_TYPE_MEMBER1_OBJECT:
				return createStrokeOpacityTypeMember1ObjectFromString(eDataType, initialValue);
			case SvgPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case SvgPackage.VIEW_BOX_TYPE:
				return createViewBoxTypeFromString(eDataType, initialValue);
			case SvgPackage.VIEW_BOX_TYPE_BASE:
				return createViewBoxTypeBaseFromString(eDataType, initialValue);
			case SvgPackage.VIEW_BOX_TYPE_BASE_ITEM:
				return createViewBoxTypeBaseItemFromString(eDataType, initialValue);
			case SvgPackage.WIDTH_TYPE:
				return createWidthTypeFromString(eDataType, initialValue);
			case SvgPackage.X1_TYPE:
				return createX1TypeFromString(eDataType, initialValue);
			case SvgPackage.X2_TYPE:
				return createX2TypeFromString(eDataType, initialValue);
			case SvgPackage.XTYPE:
				return createXTypeFromString(eDataType, initialValue);
			case SvgPackage.XTYPE1:
				return createXType1FromString(eDataType, initialValue);
			case SvgPackage.Y1_TYPE:
				return createY1TypeFromString(eDataType, initialValue);
			case SvgPackage.Y2_TYPE:
				return createY2TypeFromString(eDataType, initialValue);
			case SvgPackage.YTYPE:
				return createYTypeFromString(eDataType, initialValue);
			case SvgPackage.YTYPE1:
				return createYType1FromString(eDataType, initialValue);
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
			case SvgPackage.FILL_RULE_TYPE:
				return convertFillRuleTypeToString(eDataType, instanceValue);
			case SvgPackage.FONT_STRETCH_TYPE:
				return convertFontStretchTypeToString(eDataType, instanceValue);
			case SvgPackage.GRADIENT_UNITS_TYPE:
				return convertGradientUnitsTypeToString(eDataType, instanceValue);
			case SvgPackage.SPREAD_METHOD_TYPE:
				return convertSpreadMethodTypeToString(eDataType, instanceValue);
			case SvgPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case SvgPackage.CX_TYPE:
				return convertCxTypeToString(eDataType, instanceValue);
			case SvgPackage.CY_TYPE:
				return convertCyTypeToString(eDataType, instanceValue);
			case SvgPackage.FILL_RULE_TYPE_OBJECT:
				return convertFillRuleTypeObjectToString(eDataType, instanceValue);
			case SvgPackage.FONT_STRETCH_TYPE_OBJECT:
				return convertFontStretchTypeObjectToString(eDataType, instanceValue);
			case SvgPackage.FX_TYPE:
				return convertFxTypeToString(eDataType, instanceValue);
			case SvgPackage.FY_TYPE:
				return convertFyTypeToString(eDataType, instanceValue);
			case SvgPackage.GRADIENT_UNITS_TYPE_OBJECT:
				return convertGradientUnitsTypeObjectToString(eDataType, instanceValue);
			case SvgPackage.HEIGHT_TYPE:
				return convertHeightTypeToString(eDataType, instanceValue);
			case SvgPackage.OFFSET_TYPE:
				return convertOffsetTypeToString(eDataType, instanceValue);
			case SvgPackage.RTYPE:
				return convertRTypeToString(eDataType, instanceValue);
			case SvgPackage.SPREAD_METHOD_TYPE_OBJECT:
				return convertSpreadMethodTypeObjectToString(eDataType, instanceValue);
			case SvgPackage.STROKE_OPACITY_TYPE:
				return convertStrokeOpacityTypeToString(eDataType, instanceValue);
			case SvgPackage.STROKE_OPACITY_TYPE_MEMBER1:
				return convertStrokeOpacityTypeMember1ToString(eDataType, instanceValue);
			case SvgPackage.STROKE_OPACITY_TYPE_MEMBER1_OBJECT:
				return convertStrokeOpacityTypeMember1ObjectToString(eDataType, instanceValue);
			case SvgPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case SvgPackage.VIEW_BOX_TYPE:
				return convertViewBoxTypeToString(eDataType, instanceValue);
			case SvgPackage.VIEW_BOX_TYPE_BASE:
				return convertViewBoxTypeBaseToString(eDataType, instanceValue);
			case SvgPackage.VIEW_BOX_TYPE_BASE_ITEM:
				return convertViewBoxTypeBaseItemToString(eDataType, instanceValue);
			case SvgPackage.WIDTH_TYPE:
				return convertWidthTypeToString(eDataType, instanceValue);
			case SvgPackage.X1_TYPE:
				return convertX1TypeToString(eDataType, instanceValue);
			case SvgPackage.X2_TYPE:
				return convertX2TypeToString(eDataType, instanceValue);
			case SvgPackage.XTYPE:
				return convertXTypeToString(eDataType, instanceValue);
			case SvgPackage.XTYPE1:
				return convertXType1ToString(eDataType, instanceValue);
			case SvgPackage.Y1_TYPE:
				return convertY1TypeToString(eDataType, instanceValue);
			case SvgPackage.Y2_TYPE:
				return convertY2TypeToString(eDataType, instanceValue);
			case SvgPackage.YTYPE:
				return convertYTypeToString(eDataType, instanceValue);
			case SvgPackage.YTYPE1:
				return convertYType1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionSrcType createDefinitionSrcType() {
		DefinitionSrcTypeImpl definitionSrcType = new DefinitionSrcTypeImpl();
		return definitionSrcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceFormatType createFontFaceFormatType() {
		FontFaceFormatTypeImpl fontFaceFormatType = new FontFaceFormatTypeImpl();
		return fontFaceFormatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceNameType createFontFaceNameType() {
		FontFaceNameTypeImpl fontFaceNameType = new FontFaceNameTypeImpl();
		return fontFaceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceSrcType createFontFaceSrcType() {
		FontFaceSrcTypeImpl fontFaceSrcType = new FontFaceSrcTypeImpl();
		return fontFaceSrcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFaceUriType createFontFaceUriType() {
		FontFaceUriTypeImpl fontFaceUriType = new FontFaceUriTypeImpl();
		return fontFaceUriType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearGradientType createLinearGradientType() {
		LinearGradientTypeImpl linearGradientType = new LinearGradientTypeImpl();
		return linearGradientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadialGradientType createRadialGradientType() {
		RadialGradientTypeImpl radialGradientType = new RadialGradientTypeImpl();
		return radialGradientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopType createStopType() {
		StopTypeImpl stopType = new StopTypeImpl();
		return stopType;
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
	public FillRuleType createFillRuleTypeFromString(EDataType eDataType, String initialValue) {
		FillRuleType result = FillRuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStretchType createFontStretchTypeFromString(EDataType eDataType, String initialValue) {
		FontStretchType result = FontStretchType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStretchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientUnitsType createGradientUnitsTypeFromString(EDataType eDataType, String initialValue) {
		GradientUnitsType result = GradientUnitsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGradientUnitsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadMethodType createSpreadMethodTypeFromString(EDataType eDataType, String initialValue) {
		SpreadMethodType result = SpreadMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpreadMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCxTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCxTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCyTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCyTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleType createFillRuleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFillRuleTypeFromString(SvgPackage.Literals.FILL_RULE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFillRuleTypeToString(SvgPackage.Literals.FILL_RULE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStretchType createFontStretchTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFontStretchTypeFromString(SvgPackage.Literals.FONT_STRETCH_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStretchTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontStretchTypeToString(SvgPackage.Literals.FONT_STRETCH_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFxTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getCoordinate(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertFxTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getCoordinate().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getCoordinate(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public String createFyTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getCoordinate(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertFyTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getCoordinate().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getCoordinate(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public GradientUnitsType createGradientUnitsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGradientUnitsTypeFromString(SvgPackage.Literals.GRADIENT_UNITS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGradientUnitsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGradientUnitsTypeToString(SvgPackage.Literals.GRADIENT_UNITS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHeightTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertHeightTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public Object createOffsetTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getDouble(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertOffsetTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getDouble().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getDouble(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public String createRTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadMethodType createSpreadMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpreadMethodTypeFromString(SvgPackage.Literals.SPREAD_METHOD_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpreadMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpreadMethodTypeToString(SvgPackage.Literals.SPREAD_METHOD_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createStrokeOpacityTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStrokeOpacityTypeMember1FromString(SvgPackage.Literals.STROKE_OPACITY_TYPE_MEMBER1, initialValue);
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
	public String convertStrokeOpacityTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (SvgPackage.Literals.STROKE_OPACITY_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertStrokeOpacityTypeMember1ToString(SvgPackage.Literals.STROKE_OPACITY_TYPE_MEMBER1, instanceValue);
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
	public Double createStrokeOpacityTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeOpacityTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createStrokeOpacityTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createStrokeOpacityTypeMember1FromString(SvgPackage.Literals.STROKE_OPACITY_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrokeOpacityTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrokeOpacityTypeMember1ToString(SvgPackage.Literals.STROKE_OPACITY_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(SvgPackage.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(SvgPackage.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createViewBoxTypeFromString(EDataType eDataType, String initialValue) {
		return (List)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewBoxTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createViewBoxTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (StringTokenizer stringTokenizer = new StringTokenizer(initialValue); stringTokenizer.hasMoreTokens(); ) {
			String item = stringTokenizer.nextToken();
			result.add(createViewBoxTypeBaseItemFromString(SvgPackage.Literals.VIEW_BOX_TYPE_BASE_ITEM, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewBoxTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertViewBoxTypeBaseItemToString(SvgPackage.Literals.VIEW_BOX_TYPE_BASE_ITEM, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createViewBoxTypeBaseItemFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		BigInteger result = null;
		RuntimeException exception = null;
		try {
			result = (BigInteger)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getInteger(), initialValue);
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
	public String convertViewBoxTypeBaseItemToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getInteger().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getInteger(), instanceValue);
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
	public String createWidthTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getLength(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertWidthTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getLength().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getLength(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public String createX1TypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertX1TypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createX2TypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertX2TypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createXTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getCoordinate(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertXTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getCoordinate().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getCoordinate(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public String createXType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getDistance(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertXType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getDistance().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getDistance(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public String createY1TypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertY1TypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createY2TypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertY2TypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createYTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getCoordinate(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertYTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getCoordinate().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getCoordinate(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public String createYType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getDistance(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getPercent(), initialValue);
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
	public String convertYType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getDistance().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getDistance(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TextPackage.eINSTANCE.getPercent().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getPercent(), instanceValue);
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
	public SvgPackage getSvgPackage() {
		return (SvgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SvgPackage getPackage() {
		return SvgPackage.eINSTANCE;
	}

} //SvgFactoryImpl
