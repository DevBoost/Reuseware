/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType1;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DateTimeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DimType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.EventListenerType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HeaderType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HideShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.HideTextType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage
 * @generated
 */
public class PresentationSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PresentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSwitch() {
		if (modelPackage == null) {
			modelPackage = PresentationPackage.eINSTANCE;
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
			case PresentationPackage.ANIMATION_GROUP_TYPE: {
				AnimationGroupType animationGroupType = (AnimationGroupType)theEObject;
				T result = caseAnimationGroupType(animationGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.ANIMATIONS_TYPE1: {
				AnimationsType1 animationsType1 = (AnimationsType1)theEObject;
				T result = caseAnimationsType1(animationsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.DATE_TIME_DECL_TYPE: {
				DateTimeDeclType dateTimeDeclType = (DateTimeDeclType)theEObject;
				T result = caseDateTimeDeclType(dateTimeDeclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.DATE_TIME_TYPE: {
				DateTimeType dateTimeType = (DateTimeType)theEObject;
				T result = caseDateTimeType(dateTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.DIM_TYPE: {
				DimType dimType = (DimType)theEObject;
				T result = caseDimType(dimType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.EVENT_LISTENER_TYPE: {
				EventListenerType eventListenerType = (EventListenerType)theEObject;
				T result = caseEventListenerType(eventListenerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.FOOTER_DECL_TYPE: {
				FooterDeclType footerDeclType = (FooterDeclType)theEObject;
				T result = caseFooterDeclType(footerDeclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.FOOTER_TYPE: {
				FooterType footerType = (FooterType)theEObject;
				T result = caseFooterType(footerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.HEADER_DECL_TYPE: {
				HeaderDeclType headerDeclType = (HeaderDeclType)theEObject;
				T result = caseHeaderDeclType(headerDeclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.HEADER_TYPE: {
				HeaderType headerType = (HeaderType)theEObject;
				T result = caseHeaderType(headerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.HIDE_SHAPE_TYPE: {
				HideShapeType hideShapeType = (HideShapeType)theEObject;
				T result = caseHideShapeType(hideShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.HIDE_TEXT_TYPE: {
				HideTextType hideTextType = (HideTextType)theEObject;
				T result = caseHideTextType(hideTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.NOTES_TYPE: {
				NotesType notesType = (NotesType)theEObject;
				T result = caseNotesType(notesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.PLACEHOLDER_TYPE: {
				PlaceholderType placeholderType = (PlaceholderType)theEObject;
				T result = casePlaceholderType(placeholderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.PLAY_TYPE: {
				PlayType playType = (PlayType)theEObject;
				T result = casePlayType(playType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SETTINGS_TYPE: {
				SettingsType settingsType = (SettingsType)theEObject;
				T result = caseSettingsType(settingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SHOW_SHAPE_TYPE: {
				ShowShapeType showShapeType = (ShowShapeType)theEObject;
				T result = caseShowShapeType(showShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SHOW_TEXT_TYPE: {
				ShowTextType showTextType = (ShowTextType)theEObject;
				T result = caseShowTextType(showTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SHOW_TYPE: {
				ShowType showType = (ShowType)theEObject;
				T result = caseShowType(showType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.SOUND_TYPE: {
				SoundType soundType = (SoundType)theEObject;
				T result = caseSoundType(soundType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PresentationPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animation Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animation Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimationGroupType(AnimationGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Animations Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Animations Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnimationsType1(AnimationsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Decl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Decl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeDeclType(DateTimeDeclType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeType(DateTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dim Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dim Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimType(DimType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Listener Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Listener Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventListenerType(EventListenerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footer Decl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footer Decl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFooterDeclType(FooterDeclType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFooterType(FooterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Decl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Decl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderDeclType(HeaderDeclType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderType(HeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hide Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hide Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHideShapeType(HideShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hide Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hide Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHideTextType(HideTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotesType(NotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholderType(PlaceholderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Play Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Play Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayType(PlayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingsType(SettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShowShapeType(ShowShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShowTextType(ShowTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShowType(ShowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sound Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoundType(SoundType object) {
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

} //PresentationSwitch
