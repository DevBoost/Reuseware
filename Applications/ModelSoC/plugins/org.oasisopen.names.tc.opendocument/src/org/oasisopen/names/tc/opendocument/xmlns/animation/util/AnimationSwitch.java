/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.animation.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage
 * @generated
 */
public class AnimationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnimationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationSwitch() {
		if (modelPackage == null) {
			modelPackage = AnimationPackage.eINSTANCE;
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
			case AnimationPackage.ANIMATE_COLOR_TYPE: {
				AnimateColorType animateColorType = (AnimateColorType)theEObject;
				T result = caseAnimateColorType(animateColorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.ANIMATE_MOTION_TYPE: {
				AnimateMotionType animateMotionType = (AnimateMotionType)theEObject;
				T result = caseAnimateMotionType(animateMotionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.ANIMATE_TRANSFORM_TYPE: {
				AnimateTransformType animateTransformType = (AnimateTransformType)theEObject;
				T result = caseAnimateTransformType(animateTransformType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.ANIMATE_TYPE: {
				AnimateType animateType = (AnimateType)theEObject;
				T result = caseAnimateType(animateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.AUDIO_TYPE: {
				AudioType audioType = (AudioType)theEObject;
				T result = caseAudioType(audioType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.COMMAND_TYPE: {
				CommandType commandType = (CommandType)theEObject;
				T result = caseCommandType(commandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.ITERATE_TYPE: {
				IterateType iterateType = (IterateType)theEObject;
				T result = caseIterateType(iterateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.PARAM_TYPE: {
				ParamType paramType = (ParamType)theEObject;
				T result = caseParamType(paramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.PAR_TYPE: {
				ParType parType = (ParType)theEObject;
				T result = caseParType(parType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.SEQ_TYPE: {
				SeqType seqType = (SeqType)theEObject;
				T result = caseSeqType(seqType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.SET_TYPE: {
				SetType setType = (SetType)theEObject;
				T result = caseSetType(setType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnimationPackage.TRANSITION_FILTER_TYPE: {
				TransitionFilterType transitionFilterType = (TransitionFilterType)theEObject;
				T result = caseTransitionFilterType(transitionFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animate Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animate Color Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimateColorType(AnimateColorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animate Motion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animate Motion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimateMotionType(AnimateMotionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animate Transform Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animate Transform Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimateTransformType(AnimateTransformType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimateType(AnimateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioType(AudioType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandType(CommandType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Iterate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterateType(IterateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType(ParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Par Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Par Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParType(ParType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seq Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seq Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeqType(SeqType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetType(SetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionFilterType(TransitionFilterType object) {
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

} //AnimationSwitch
