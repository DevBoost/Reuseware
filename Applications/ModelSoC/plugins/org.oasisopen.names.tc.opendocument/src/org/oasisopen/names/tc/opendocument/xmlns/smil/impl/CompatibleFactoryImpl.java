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
package org.oasisopen.names.tc.opendocument.xmlns.smil.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CompatibleFactory;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage;
import org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextFactory;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompatibleFactoryImpl extends EFactoryImpl implements CompatibleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompatibleFactory init() {
		try {
			CompatibleFactory theCompatibleFactory = (CompatibleFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"); 
			if (theCompatibleFactory != null) {
				return theCompatibleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompatibleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleFactoryImpl() {
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
			case CompatiblePackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case CompatiblePackage.ACCUMULATE_TYPE:
				return createAccumulateTypeFromString(eDataType, initialValue);
			case CompatiblePackage.ADDITIVE_TYPE:
				return createAdditiveTypeFromString(eDataType, initialValue);
			case CompatiblePackage.CALC_MODE_TYPE:
				return createCalcModeTypeFromString(eDataType, initialValue);
			case CompatiblePackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case CompatiblePackage.ENDSYNC_TYPE:
				return createEndsyncTypeFromString(eDataType, initialValue);
			case CompatiblePackage.FADE_COLOR_TYPE:
				return createFadeColorTypeFromString(eDataType, initialValue);
			case CompatiblePackage.FILL_DEFAULT_TYPE:
				return createFillDefaultTypeFromString(eDataType, initialValue);
			case CompatiblePackage.FILL_TYPE:
				return createFillTypeFromString(eDataType, initialValue);
			case CompatiblePackage.MODE_TYPE:
				return createModeTypeFromString(eDataType, initialValue);
			case CompatiblePackage.REPEAT_COUNT_TYPE_MEMBER1:
				return createRepeatCountTypeMember1FromString(eDataType, initialValue);
			case CompatiblePackage.RESTART_DEFAULT_TYPE:
				return createRestartDefaultTypeFromString(eDataType, initialValue);
			case CompatiblePackage.RESTART_TYPE:
				return createRestartTypeFromString(eDataType, initialValue);
			case CompatiblePackage.ACCUMULATE_TYPE_OBJECT:
				return createAccumulateTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.ADDITIVE_TYPE_OBJECT:
				return createAdditiveTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.CALC_MODE_TYPE_OBJECT:
				return createCalcModeTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.DIRECTION_TYPE_OBJECT:
				return createDirectionTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.ENDSYNC_TYPE_OBJECT:
				return createEndsyncTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.FADE_COLOR_TYPE_OBJECT:
				return createFadeColorTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.FILL_DEFAULT_TYPE_OBJECT:
				return createFillDefaultTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.FILL_TYPE_OBJECT:
				return createFillTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.MODE_TYPE_OBJECT:
				return createModeTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.REPEAT_COUNT_TYPE:
				return createRepeatCountTypeFromString(eDataType, initialValue);
			case CompatiblePackage.REPEAT_COUNT_TYPE_MEMBER1_OBJECT:
				return createRepeatCountTypeMember1ObjectFromString(eDataType, initialValue);
			case CompatiblePackage.RESTART_DEFAULT_TYPE_OBJECT:
				return createRestartDefaultTypeObjectFromString(eDataType, initialValue);
			case CompatiblePackage.RESTART_TYPE_OBJECT:
				return createRestartTypeObjectFromString(eDataType, initialValue);
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
			case CompatiblePackage.ACCUMULATE_TYPE:
				return convertAccumulateTypeToString(eDataType, instanceValue);
			case CompatiblePackage.ADDITIVE_TYPE:
				return convertAdditiveTypeToString(eDataType, instanceValue);
			case CompatiblePackage.CALC_MODE_TYPE:
				return convertCalcModeTypeToString(eDataType, instanceValue);
			case CompatiblePackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case CompatiblePackage.ENDSYNC_TYPE:
				return convertEndsyncTypeToString(eDataType, instanceValue);
			case CompatiblePackage.FADE_COLOR_TYPE:
				return convertFadeColorTypeToString(eDataType, instanceValue);
			case CompatiblePackage.FILL_DEFAULT_TYPE:
				return convertFillDefaultTypeToString(eDataType, instanceValue);
			case CompatiblePackage.FILL_TYPE:
				return convertFillTypeToString(eDataType, instanceValue);
			case CompatiblePackage.MODE_TYPE:
				return convertModeTypeToString(eDataType, instanceValue);
			case CompatiblePackage.REPEAT_COUNT_TYPE_MEMBER1:
				return convertRepeatCountTypeMember1ToString(eDataType, instanceValue);
			case CompatiblePackage.RESTART_DEFAULT_TYPE:
				return convertRestartDefaultTypeToString(eDataType, instanceValue);
			case CompatiblePackage.RESTART_TYPE:
				return convertRestartTypeToString(eDataType, instanceValue);
			case CompatiblePackage.ACCUMULATE_TYPE_OBJECT:
				return convertAccumulateTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.ADDITIVE_TYPE_OBJECT:
				return convertAdditiveTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.CALC_MODE_TYPE_OBJECT:
				return convertCalcModeTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.DIRECTION_TYPE_OBJECT:
				return convertDirectionTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.ENDSYNC_TYPE_OBJECT:
				return convertEndsyncTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.FADE_COLOR_TYPE_OBJECT:
				return convertFadeColorTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.FILL_DEFAULT_TYPE_OBJECT:
				return convertFillDefaultTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.FILL_TYPE_OBJECT:
				return convertFillTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.MODE_TYPE_OBJECT:
				return convertModeTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.REPEAT_COUNT_TYPE:
				return convertRepeatCountTypeToString(eDataType, instanceValue);
			case CompatiblePackage.REPEAT_COUNT_TYPE_MEMBER1_OBJECT:
				return convertRepeatCountTypeMember1ObjectToString(eDataType, instanceValue);
			case CompatiblePackage.RESTART_DEFAULT_TYPE_OBJECT:
				return convertRestartDefaultTypeObjectToString(eDataType, instanceValue);
			case CompatiblePackage.RESTART_TYPE_OBJECT:
				return convertRestartTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public AccumulateType createAccumulateTypeFromString(EDataType eDataType, String initialValue) {
		AccumulateType result = AccumulateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccumulateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveType createAdditiveTypeFromString(EDataType eDataType, String initialValue) {
		AdditiveType result = AdditiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcModeType createCalcModeTypeFromString(EDataType eDataType, String initialValue) {
		CalcModeType result = CalcModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalcModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndsyncType createEndsyncTypeFromString(EDataType eDataType, String initialValue) {
		EndsyncType result = EndsyncType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndsyncTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadeColorType createFadeColorTypeFromString(EDataType eDataType, String initialValue) {
		FadeColorType result = FadeColorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFadeColorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillDefaultType createFillDefaultTypeFromString(EDataType eDataType, String initialValue) {
		FillDefaultType result = FillDefaultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillDefaultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillType createFillTypeFromString(EDataType eDataType, String initialValue) {
		FillType result = FillType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeFromString(EDataType eDataType, String initialValue) {
		ModeType result = ModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatCountTypeMember1 createRepeatCountTypeMember1FromString(EDataType eDataType, String initialValue) {
		RepeatCountTypeMember1 result = RepeatCountTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepeatCountTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartDefaultType createRestartDefaultTypeFromString(EDataType eDataType, String initialValue) {
		RestartDefaultType result = RestartDefaultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestartDefaultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartType createRestartTypeFromString(EDataType eDataType, String initialValue) {
		RestartType result = RestartType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestartTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulateType createAccumulateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccumulateTypeFromString(CompatiblePackage.Literals.ACCUMULATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccumulateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccumulateTypeToString(CompatiblePackage.Literals.ACCUMULATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveType createAdditiveTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAdditiveTypeFromString(CompatiblePackage.Literals.ADDITIVE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditiveTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAdditiveTypeToString(CompatiblePackage.Literals.ADDITIVE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalcModeType createCalcModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCalcModeTypeFromString(CompatiblePackage.Literals.CALC_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalcModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCalcModeTypeToString(CompatiblePackage.Literals.CALC_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionTypeFromString(CompatiblePackage.Literals.DIRECTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionTypeToString(CompatiblePackage.Literals.DIRECTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndsyncType createEndsyncTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEndsyncTypeFromString(CompatiblePackage.Literals.ENDSYNC_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndsyncTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndsyncTypeToString(CompatiblePackage.Literals.ENDSYNC_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadeColorType createFadeColorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFadeColorTypeFromString(CompatiblePackage.Literals.FADE_COLOR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFadeColorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFadeColorTypeToString(CompatiblePackage.Literals.FADE_COLOR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillDefaultType createFillDefaultTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFillDefaultTypeFromString(CompatiblePackage.Literals.FILL_DEFAULT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillDefaultTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFillDefaultTypeToString(CompatiblePackage.Literals.FILL_DEFAULT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillType createFillTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFillTypeFromString(CompatiblePackage.Literals.FILL_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFillTypeToString(CompatiblePackage.Literals.FILL_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModeTypeFromString(CompatiblePackage.Literals.MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModeTypeToString(CompatiblePackage.Literals.MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRepeatCountTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getNonNegativeInteger(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createRepeatCountTypeMember1FromString(CompatiblePackage.Literals.REPEAT_COUNT_TYPE_MEMBER1, initialValue);
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
	public String convertRepeatCountTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getNonNegativeInteger().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getNonNegativeInteger(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (CompatiblePackage.Literals.REPEAT_COUNT_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertRepeatCountTypeMember1ToString(CompatiblePackage.Literals.REPEAT_COUNT_TYPE_MEMBER1, instanceValue);
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
	public RepeatCountTypeMember1 createRepeatCountTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createRepeatCountTypeMember1FromString(CompatiblePackage.Literals.REPEAT_COUNT_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepeatCountTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRepeatCountTypeMember1ToString(CompatiblePackage.Literals.REPEAT_COUNT_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartDefaultType createRestartDefaultTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRestartDefaultTypeFromString(CompatiblePackage.Literals.RESTART_DEFAULT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestartDefaultTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestartDefaultTypeToString(CompatiblePackage.Literals.RESTART_DEFAULT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestartType createRestartTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRestartTypeFromString(CompatiblePackage.Literals.RESTART_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestartTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRestartTypeToString(CompatiblePackage.Literals.RESTART_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatiblePackage getCompatiblePackage() {
		return (CompatiblePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompatiblePackage getPackage() {
		return CompatiblePackage.eINSTANCE;
	}

} //CompatibleFactoryImpl
