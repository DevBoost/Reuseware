/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.animation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationFactory;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ParType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.SetType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnimationFactoryImpl extends EFactoryImpl implements AnimationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnimationFactory init() {
		try {
			AnimationFactory theAnimationFactory = (AnimationFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:animation:1.0"); 
			if (theAnimationFactory != null) {
				return theAnimationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnimationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationFactoryImpl() {
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
			case AnimationPackage.ANIMATE_COLOR_TYPE: return createAnimateColorType();
			case AnimationPackage.ANIMATE_MOTION_TYPE: return createAnimateMotionType();
			case AnimationPackage.ANIMATE_TRANSFORM_TYPE: return createAnimateTransformType();
			case AnimationPackage.ANIMATE_TYPE: return createAnimateType();
			case AnimationPackage.AUDIO_TYPE: return createAudioType();
			case AnimationPackage.COMMAND_TYPE: return createCommandType();
			case AnimationPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AnimationPackage.ITERATE_TYPE: return createIterateType();
			case AnimationPackage.PARAM_TYPE: return createParamType();
			case AnimationPackage.PAR_TYPE: return createParType();
			case AnimationPackage.SEQ_TYPE: return createSeqType();
			case AnimationPackage.SET_TYPE: return createSetType();
			case AnimationPackage.TRANSITION_FILTER_TYPE: return createTransitionFilterType();
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
			case AnimationPackage.COLOR_INTERPOLATION_DIRECTION_TYPE:
				return createColorInterpolationDirectionTypeFromString(eDataType, initialValue);
			case AnimationPackage.COLOR_INTERPOLATION_TYPE:
				return createColorInterpolationTypeFromString(eDataType, initialValue);
			case AnimationPackage.COLOR_INTERPOLATION_DIRECTION_TYPE_OBJECT:
				return createColorInterpolationDirectionTypeObjectFromString(eDataType, initialValue);
			case AnimationPackage.COLOR_INTERPOLATION_TYPE_OBJECT:
				return createColorInterpolationTypeObjectFromString(eDataType, initialValue);
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
			case AnimationPackage.COLOR_INTERPOLATION_DIRECTION_TYPE:
				return convertColorInterpolationDirectionTypeToString(eDataType, instanceValue);
			case AnimationPackage.COLOR_INTERPOLATION_TYPE:
				return convertColorInterpolationTypeToString(eDataType, instanceValue);
			case AnimationPackage.COLOR_INTERPOLATION_DIRECTION_TYPE_OBJECT:
				return convertColorInterpolationDirectionTypeObjectToString(eDataType, instanceValue);
			case AnimationPackage.COLOR_INTERPOLATION_TYPE_OBJECT:
				return convertColorInterpolationTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateColorType createAnimateColorType() {
		AnimateColorTypeImpl animateColorType = new AnimateColorTypeImpl();
		return animateColorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateMotionType createAnimateMotionType() {
		AnimateMotionTypeImpl animateMotionType = new AnimateMotionTypeImpl();
		return animateMotionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateTransformType createAnimateTransformType() {
		AnimateTransformTypeImpl animateTransformType = new AnimateTransformTypeImpl();
		return animateTransformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateType createAnimateType() {
		AnimateTypeImpl animateType = new AnimateTypeImpl();
		return animateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioType createAudioType() {
		AudioTypeImpl audioType = new AudioTypeImpl();
		return audioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType createCommandType() {
		CommandTypeImpl commandType = new CommandTypeImpl();
		return commandType;
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
	public IterateType createIterateType() {
		IterateTypeImpl iterateType = new IterateTypeImpl();
		return iterateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType createParamType() {
		ParamTypeImpl paramType = new ParamTypeImpl();
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParType createParType() {
		ParTypeImpl parType = new ParTypeImpl();
		return parType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqType createSeqType() {
		SeqTypeImpl seqType = new SeqTypeImpl();
		return seqType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionFilterType createTransitionFilterType() {
		TransitionFilterTypeImpl transitionFilterType = new TransitionFilterTypeImpl();
		return transitionFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorInterpolationDirectionType createColorInterpolationDirectionTypeFromString(EDataType eDataType, String initialValue) {
		ColorInterpolationDirectionType result = ColorInterpolationDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorInterpolationDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorInterpolationType createColorInterpolationTypeFromString(EDataType eDataType, String initialValue) {
		ColorInterpolationType result = ColorInterpolationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorInterpolationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorInterpolationDirectionType createColorInterpolationDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createColorInterpolationDirectionTypeFromString(AnimationPackage.Literals.COLOR_INTERPOLATION_DIRECTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorInterpolationDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColorInterpolationDirectionTypeToString(AnimationPackage.Literals.COLOR_INTERPOLATION_DIRECTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorInterpolationType createColorInterpolationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createColorInterpolationTypeFromString(AnimationPackage.Literals.COLOR_INTERPOLATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorInterpolationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColorInterpolationTypeToString(AnimationPackage.Literals.COLOR_INTERPOLATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationPackage getAnimationPackage() {
		return (AnimationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnimationPackage getPackage() {
		return AnimationPackage.eINSTANCE;
	}

} //AnimationFactoryImpl
