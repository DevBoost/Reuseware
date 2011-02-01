/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType;
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
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.NotesType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PlayType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowShapeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowTextType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SoundType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.util.TextValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage
 * @generated
 */
public class PresentationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PresentationValidator INSTANCE = new PresentationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oasisopen.names.tc.opendocument.xmlns.presentation";

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
	protected TextValidator textValidator;

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
	public PresentationValidator() {
		super();
		textValidator = TextValidator.INSTANCE;
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
	  return PresentationPackage.eINSTANCE;
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
			case PresentationPackage.ANIMATION_GROUP_TYPE:
				return validateAnimationGroupType((AnimationGroupType)value, diagnostics, context);
			case PresentationPackage.ANIMATIONS_TYPE1:
				return validateAnimationsType1((AnimationsType1)value, diagnostics, context);
			case PresentationPackage.DATE_TIME_DECL_TYPE:
				return validateDateTimeDeclType((DateTimeDeclType)value, diagnostics, context);
			case PresentationPackage.DATE_TIME_TYPE:
				return validateDateTimeType((DateTimeType)value, diagnostics, context);
			case PresentationPackage.DIM_TYPE:
				return validateDimType((DimType)value, diagnostics, context);
			case PresentationPackage.EVENT_LISTENER_TYPE:
				return validateEventListenerType((EventListenerType)value, diagnostics, context);
			case PresentationPackage.FOOTER_DECL_TYPE:
				return validateFooterDeclType((FooterDeclType)value, diagnostics, context);
			case PresentationPackage.FOOTER_TYPE:
				return validateFooterType((FooterType)value, diagnostics, context);
			case PresentationPackage.HEADER_DECL_TYPE:
				return validateHeaderDeclType((HeaderDeclType)value, diagnostics, context);
			case PresentationPackage.HEADER_TYPE:
				return validateHeaderType((HeaderType)value, diagnostics, context);
			case PresentationPackage.HIDE_SHAPE_TYPE:
				return validateHideShapeType((HideShapeType)value, diagnostics, context);
			case PresentationPackage.HIDE_TEXT_TYPE:
				return validateHideTextType((HideTextType)value, diagnostics, context);
			case PresentationPackage.NOTES_TYPE:
				return validateNotesType((NotesType)value, diagnostics, context);
			case PresentationPackage.PLACEHOLDER_TYPE:
				return validatePlaceholderType((PlaceholderType)value, diagnostics, context);
			case PresentationPackage.PLAY_TYPE:
				return validatePlayType((PlayType)value, diagnostics, context);
			case PresentationPackage.SETTINGS_TYPE:
				return validateSettingsType((SettingsType)value, diagnostics, context);
			case PresentationPackage.SHOW_SHAPE_TYPE:
				return validateShowShapeType((ShowShapeType)value, diagnostics, context);
			case PresentationPackage.SHOW_TEXT_TYPE:
				return validateShowTextType((ShowTextType)value, diagnostics, context);
			case PresentationPackage.SHOW_TYPE:
				return validateShowType((ShowType)value, diagnostics, context);
			case PresentationPackage.SOUND_TYPE:
				return validateSoundType((SoundType)value, diagnostics, context);
			case PresentationPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case PresentationPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case PresentationPackage.ANIMATIONS_TYPE:
				return validateAnimationsType((AnimationsType)value, diagnostics, context);
			case PresentationPackage.NODE_TYPE_TYPE:
				return validateNodeTypeType((NodeTypeType)value, diagnostics, context);
			case PresentationPackage.PRESET_CLASS_TYPE:
				return validatePresetClassType((PresetClassType)value, diagnostics, context);
			case PresentationPackage.SOURCE_TYPE:
				return validateSourceType((SourceType)value, diagnostics, context);
			case PresentationPackage.TRANSITION_ON_CLICK_TYPE:
				return validateTransitionOnClickType((TransitionOnClickType)value, diagnostics, context);
			case PresentationPackage.TRANSITION_STYLE_TYPE:
				return validateTransitionStyleType((TransitionStyleType)value, diagnostics, context);
			case PresentationPackage.TRANSITION_TYPE_TYPE:
				return validateTransitionTypeType((TransitionTypeType)value, diagnostics, context);
			case PresentationPackage.VISIBILITY_TYPE:
				return validateVisibilityType((VisibilityType)value, diagnostics, context);
			case PresentationPackage.ACTION_TYPE_OBJECT:
				return validateActionTypeObject((ActionType)value, diagnostics, context);
			case PresentationPackage.ANIMATIONS_TYPE_OBJECT:
				return validateAnimationsTypeObject((AnimationsType)value, diagnostics, context);
			case PresentationPackage.NODE_TYPE_TYPE_OBJECT:
				return validateNodeTypeTypeObject((NodeTypeType)value, diagnostics, context);
			case PresentationPackage.PRESENTATION_PAGE_LAYOUT_NAME_TYPE:
				return validatePresentationPageLayoutNameType((String)value, diagnostics, context);
			case PresentationPackage.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1:
				return validatePresentationPageLayoutNameTypeMember1((String)value, diagnostics, context);
			case PresentationPackage.PRESET_CLASS_TYPE_OBJECT:
				return validatePresetClassTypeObject((PresetClassType)value, diagnostics, context);
			case PresentationPackage.SOURCE_TYPE_OBJECT:
				return validateSourceTypeObject((SourceType)value, diagnostics, context);
			case PresentationPackage.STYLE_NAME_TYPE:
				return validateStyleNameType((String)value, diagnostics, context);
			case PresentationPackage.STYLE_NAME_TYPE_MEMBER1:
				return validateStyleNameTypeMember1((String)value, diagnostics, context);
			case PresentationPackage.TRANSITION_ON_CLICK_TYPE_OBJECT:
				return validateTransitionOnClickTypeObject((TransitionOnClickType)value, diagnostics, context);
			case PresentationPackage.TRANSITION_STYLE_TYPE_OBJECT:
				return validateTransitionStyleTypeObject((TransitionStyleType)value, diagnostics, context);
			case PresentationPackage.TRANSITION_TYPE_TYPE_OBJECT:
				return validateTransitionTypeTypeObject((TransitionTypeType)value, diagnostics, context);
			case PresentationPackage.VISIBILITY_TYPE_OBJECT:
				return validateVisibilityTypeObject((VisibilityType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnimationGroupType(AnimationGroupType animationGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(animationGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnimationsType1(AnimationsType1 animationsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(animationsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeDeclType(DateTimeDeclType dateTimeDeclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTimeDeclType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeType(DateTimeType dateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimType(DimType dimType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventListenerType(EventListenerType eventListenerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventListenerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFooterDeclType(FooterDeclType footerDeclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(footerDeclType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFooterType(FooterType footerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(footerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderDeclType(HeaderDeclType headerDeclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerDeclType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeaderType(HeaderType headerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHideShapeType(HideShapeType hideShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hideShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHideTextType(HideTextType hideTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hideTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotesType(NotesType notesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaceholderType(PlaceholderType placeholderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placeholderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayType(PlayType playType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingsType(SettingsType settingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(settingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShowShapeType(ShowShapeType showShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(showShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShowTextType(ShowTextType showTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(showTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShowType(ShowType showType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(showType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoundType(SoundType soundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(soundType, diagnostics, context);
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
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnimationsType(AnimationsType animationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeTypeType(NodeTypeType nodeTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresetClassType(PresetClassType presetClassType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceType(SourceType sourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOnClickType(TransitionOnClickType transitionOnClickType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionStyleType(TransitionStyleType transitionStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionTypeType(TransitionTypeType transitionTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityType(VisibilityType visibilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionTypeObject(ActionType actionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnimationsTypeObject(AnimationsType animationsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeTypeTypeObject(NodeTypeType nodeTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationPageLayoutNameType(String presentationPageLayoutNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePresentationPageLayoutNameType_MemberTypes(presentationPageLayoutNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Page Layout Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationPageLayoutNameType_MemberTypes(String presentationPageLayoutNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(presentationPageLayoutNameType)) {
				if (textValidator.validateStyleNameRef(presentationPageLayoutNameType, tempDiagnostics, context)) return true;
			}
			if (PresentationPackage.Literals.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1.isInstance(presentationPageLayoutNameType)) {
				if (validatePresentationPageLayoutNameTypeMember1(presentationPageLayoutNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(presentationPageLayoutNameType)) {
				if (textValidator.validateStyleNameRef(presentationPageLayoutNameType, null, context)) return true;
			}
			if (PresentationPackage.Literals.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1.isInstance(presentationPageLayoutNameType)) {
				if (validatePresentationPageLayoutNameTypeMember1(presentationPageLayoutNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationPageLayoutNameTypeMember1(String presentationPageLayoutNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePresentationPageLayoutNameTypeMember1_MinLength(presentationPageLayoutNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validatePresentationPageLayoutNameTypeMember1_MaxLength(presentationPageLayoutNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Page Layout Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationPageLayoutNameTypeMember1_MinLength(String presentationPageLayoutNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = presentationPageLayoutNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(PresentationPackage.Literals.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1, presentationPageLayoutNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Page Layout Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresentationPageLayoutNameTypeMember1_MaxLength(String presentationPageLayoutNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = presentationPageLayoutNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(PresentationPackage.Literals.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1, presentationPageLayoutNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePresetClassTypeObject(PresetClassType presetClassTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceTypeObject(SourceType sourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType(String styleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameType_MemberTypes(styleNameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Style Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameType_MemberTypes(String styleNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType)) {
				if (textValidator.validateStyleNameRef(styleNameType, tempDiagnostics, context)) return true;
			}
			if (PresentationPackage.Literals.STYLE_NAME_TYPE_MEMBER1.isInstance(styleNameType)) {
				if (validateStyleNameTypeMember1(styleNameType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(styleNameType)) {
				if (textValidator.validateStyleNameRef(styleNameType, null, context)) return true;
			}
			if (PresentationPackage.Literals.STYLE_NAME_TYPE_MEMBER1.isInstance(styleNameType)) {
				if (validateStyleNameTypeMember1(styleNameType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStyleNameTypeMember1_MinLength(styleNameTypeMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateStyleNameTypeMember1_MaxLength(styleNameTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1_MinLength(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember1.length();
		boolean result = length >= 0;
		if (!result && diagnostics != null)
			reportMinLengthViolation(PresentationPackage.Literals.STYLE_NAME_TYPE_MEMBER1, styleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Style Name Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleNameTypeMember1_MaxLength(String styleNameTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = styleNameTypeMember1.length();
		boolean result = length <= 0;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(PresentationPackage.Literals.STYLE_NAME_TYPE_MEMBER1, styleNameTypeMember1, length, 0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionOnClickTypeObject(TransitionOnClickType transitionOnClickTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionStyleTypeObject(TransitionStyleType transitionStyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionTypeTypeObject(TransitionTypeType transitionTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityTypeObject(VisibilityType visibilityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //PresentationValidator
