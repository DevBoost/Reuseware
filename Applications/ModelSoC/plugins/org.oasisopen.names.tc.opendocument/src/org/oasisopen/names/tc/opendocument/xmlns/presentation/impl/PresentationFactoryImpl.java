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
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationFactory;
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
import org.oasisopen.names.tc.opendocument.xmlns.text.TextFactory;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationFactoryImpl extends EFactoryImpl implements PresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresentationFactory init() {
		try {
			PresentationFactory thePresentationFactory = (PresentationFactory)EPackage.Registry.INSTANCE.getEFactory("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"); 
			if (thePresentationFactory != null) {
				return thePresentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationFactoryImpl() {
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
			case PresentationPackage.ANIMATION_GROUP_TYPE: return createAnimationGroupType();
			case PresentationPackage.ANIMATIONS_TYPE1: return createAnimationsType1();
			case PresentationPackage.DATE_TIME_DECL_TYPE: return createDateTimeDeclType();
			case PresentationPackage.DATE_TIME_TYPE: return createDateTimeType();
			case PresentationPackage.DIM_TYPE: return createDimType();
			case PresentationPackage.EVENT_LISTENER_TYPE: return createEventListenerType();
			case PresentationPackage.FOOTER_DECL_TYPE: return createFooterDeclType();
			case PresentationPackage.FOOTER_TYPE: return createFooterType();
			case PresentationPackage.HEADER_DECL_TYPE: return createHeaderDeclType();
			case PresentationPackage.HEADER_TYPE: return createHeaderType();
			case PresentationPackage.HIDE_SHAPE_TYPE: return createHideShapeType();
			case PresentationPackage.HIDE_TEXT_TYPE: return createHideTextType();
			case PresentationPackage.NOTES_TYPE: return createNotesType();
			case PresentationPackage.PLACEHOLDER_TYPE: return createPlaceholderType();
			case PresentationPackage.PLAY_TYPE: return createPlayType();
			case PresentationPackage.SETTINGS_TYPE: return createSettingsType();
			case PresentationPackage.SHOW_SHAPE_TYPE: return createShowShapeType();
			case PresentationPackage.SHOW_TEXT_TYPE: return createShowTextType();
			case PresentationPackage.SHOW_TYPE: return createShowType();
			case PresentationPackage.SOUND_TYPE: return createSoundType();
			case PresentationPackage.DOCUMENT_ROOT: return createDocumentRoot();
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
			case PresentationPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case PresentationPackage.ANIMATIONS_TYPE:
				return createAnimationsTypeFromString(eDataType, initialValue);
			case PresentationPackage.NODE_TYPE_TYPE:
				return createNodeTypeTypeFromString(eDataType, initialValue);
			case PresentationPackage.PRESET_CLASS_TYPE:
				return createPresetClassTypeFromString(eDataType, initialValue);
			case PresentationPackage.SOURCE_TYPE:
				return createSourceTypeFromString(eDataType, initialValue);
			case PresentationPackage.TRANSITION_ON_CLICK_TYPE:
				return createTransitionOnClickTypeFromString(eDataType, initialValue);
			case PresentationPackage.TRANSITION_STYLE_TYPE:
				return createTransitionStyleTypeFromString(eDataType, initialValue);
			case PresentationPackage.TRANSITION_TYPE_TYPE:
				return createTransitionTypeTypeFromString(eDataType, initialValue);
			case PresentationPackage.VISIBILITY_TYPE:
				return createVisibilityTypeFromString(eDataType, initialValue);
			case PresentationPackage.ACTION_TYPE_OBJECT:
				return createActionTypeObjectFromString(eDataType, initialValue);
			case PresentationPackage.ANIMATIONS_TYPE_OBJECT:
				return createAnimationsTypeObjectFromString(eDataType, initialValue);
			case PresentationPackage.NODE_TYPE_TYPE_OBJECT:
				return createNodeTypeTypeObjectFromString(eDataType, initialValue);
			case PresentationPackage.PRESENTATION_PAGE_LAYOUT_NAME_TYPE:
				return createPresentationPageLayoutNameTypeFromString(eDataType, initialValue);
			case PresentationPackage.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1:
				return createPresentationPageLayoutNameTypeMember1FromString(eDataType, initialValue);
			case PresentationPackage.PRESET_CLASS_TYPE_OBJECT:
				return createPresetClassTypeObjectFromString(eDataType, initialValue);
			case PresentationPackage.SOURCE_TYPE_OBJECT:
				return createSourceTypeObjectFromString(eDataType, initialValue);
			case PresentationPackage.STYLE_NAME_TYPE:
				return createStyleNameTypeFromString(eDataType, initialValue);
			case PresentationPackage.STYLE_NAME_TYPE_MEMBER1:
				return createStyleNameTypeMember1FromString(eDataType, initialValue);
			case PresentationPackage.TRANSITION_ON_CLICK_TYPE_OBJECT:
				return createTransitionOnClickTypeObjectFromString(eDataType, initialValue);
			case PresentationPackage.TRANSITION_STYLE_TYPE_OBJECT:
				return createTransitionStyleTypeObjectFromString(eDataType, initialValue);
			case PresentationPackage.TRANSITION_TYPE_TYPE_OBJECT:
				return createTransitionTypeTypeObjectFromString(eDataType, initialValue);
			case PresentationPackage.VISIBILITY_TYPE_OBJECT:
				return createVisibilityTypeObjectFromString(eDataType, initialValue);
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
			case PresentationPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case PresentationPackage.ANIMATIONS_TYPE:
				return convertAnimationsTypeToString(eDataType, instanceValue);
			case PresentationPackage.NODE_TYPE_TYPE:
				return convertNodeTypeTypeToString(eDataType, instanceValue);
			case PresentationPackage.PRESET_CLASS_TYPE:
				return convertPresetClassTypeToString(eDataType, instanceValue);
			case PresentationPackage.SOURCE_TYPE:
				return convertSourceTypeToString(eDataType, instanceValue);
			case PresentationPackage.TRANSITION_ON_CLICK_TYPE:
				return convertTransitionOnClickTypeToString(eDataType, instanceValue);
			case PresentationPackage.TRANSITION_STYLE_TYPE:
				return convertTransitionStyleTypeToString(eDataType, instanceValue);
			case PresentationPackage.TRANSITION_TYPE_TYPE:
				return convertTransitionTypeTypeToString(eDataType, instanceValue);
			case PresentationPackage.VISIBILITY_TYPE:
				return convertVisibilityTypeToString(eDataType, instanceValue);
			case PresentationPackage.ACTION_TYPE_OBJECT:
				return convertActionTypeObjectToString(eDataType, instanceValue);
			case PresentationPackage.ANIMATIONS_TYPE_OBJECT:
				return convertAnimationsTypeObjectToString(eDataType, instanceValue);
			case PresentationPackage.NODE_TYPE_TYPE_OBJECT:
				return convertNodeTypeTypeObjectToString(eDataType, instanceValue);
			case PresentationPackage.PRESENTATION_PAGE_LAYOUT_NAME_TYPE:
				return convertPresentationPageLayoutNameTypeToString(eDataType, instanceValue);
			case PresentationPackage.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1:
				return convertPresentationPageLayoutNameTypeMember1ToString(eDataType, instanceValue);
			case PresentationPackage.PRESET_CLASS_TYPE_OBJECT:
				return convertPresetClassTypeObjectToString(eDataType, instanceValue);
			case PresentationPackage.SOURCE_TYPE_OBJECT:
				return convertSourceTypeObjectToString(eDataType, instanceValue);
			case PresentationPackage.STYLE_NAME_TYPE:
				return convertStyleNameTypeToString(eDataType, instanceValue);
			case PresentationPackage.STYLE_NAME_TYPE_MEMBER1:
				return convertStyleNameTypeMember1ToString(eDataType, instanceValue);
			case PresentationPackage.TRANSITION_ON_CLICK_TYPE_OBJECT:
				return convertTransitionOnClickTypeObjectToString(eDataType, instanceValue);
			case PresentationPackage.TRANSITION_STYLE_TYPE_OBJECT:
				return convertTransitionStyleTypeObjectToString(eDataType, instanceValue);
			case PresentationPackage.TRANSITION_TYPE_TYPE_OBJECT:
				return convertTransitionTypeTypeObjectToString(eDataType, instanceValue);
			case PresentationPackage.VISIBILITY_TYPE_OBJECT:
				return convertVisibilityTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationGroupType createAnimationGroupType() {
		AnimationGroupTypeImpl animationGroupType = new AnimationGroupTypeImpl();
		return animationGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationsType1 createAnimationsType1() {
		AnimationsType1Impl animationsType1 = new AnimationsType1Impl();
		return animationsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeDeclType createDateTimeDeclType() {
		DateTimeDeclTypeImpl dateTimeDeclType = new DateTimeDeclTypeImpl();
		return dateTimeDeclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType createDateTimeType() {
		DateTimeTypeImpl dateTimeType = new DateTimeTypeImpl();
		return dateTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimType createDimType() {
		DimTypeImpl dimType = new DimTypeImpl();
		return dimType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListenerType createEventListenerType() {
		EventListenerTypeImpl eventListenerType = new EventListenerTypeImpl();
		return eventListenerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterDeclType createFooterDeclType() {
		FooterDeclTypeImpl footerDeclType = new FooterDeclTypeImpl();
		return footerDeclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FooterType createFooterType() {
		FooterTypeImpl footerType = new FooterTypeImpl();
		return footerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderDeclType createHeaderDeclType() {
		HeaderDeclTypeImpl headerDeclType = new HeaderDeclTypeImpl();
		return headerDeclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderType createHeaderType() {
		HeaderTypeImpl headerType = new HeaderTypeImpl();
		return headerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HideShapeType createHideShapeType() {
		HideShapeTypeImpl hideShapeType = new HideShapeTypeImpl();
		return hideShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HideTextType createHideTextType() {
		HideTextTypeImpl hideTextType = new HideTextTypeImpl();
		return hideTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotesType createNotesType() {
		NotesTypeImpl notesType = new NotesTypeImpl();
		return notesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderType createPlaceholderType() {
		PlaceholderTypeImpl placeholderType = new PlaceholderTypeImpl();
		return placeholderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayType createPlayType() {
		PlayTypeImpl playType = new PlayTypeImpl();
		return playType;
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
	public ShowShapeType createShowShapeType() {
		ShowShapeTypeImpl showShapeType = new ShowShapeTypeImpl();
		return showShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowTextType createShowTextType() {
		ShowTextTypeImpl showTextType = new ShowTextTypeImpl();
		return showTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType createShowType() {
		ShowTypeImpl showType = new ShowTypeImpl();
		return showType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundType createSoundType() {
		SoundTypeImpl soundType = new SoundTypeImpl();
		return soundType;
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
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationsType createAnimationsTypeFromString(EDataType eDataType, String initialValue) {
		AnimationsType result = AnimationsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnimationsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType createNodeTypeTypeFromString(EDataType eDataType, String initialValue) {
		NodeTypeType result = NodeTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresetClassType createPresetClassTypeFromString(EDataType eDataType, String initialValue) {
		PresetClassType result = PresetClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresetClassTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceTypeFromString(EDataType eDataType, String initialValue) {
		SourceType result = SourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionOnClickType createTransitionOnClickTypeFromString(EDataType eDataType, String initialValue) {
		TransitionOnClickType result = TransitionOnClickType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionOnClickTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionStyleType createTransitionStyleTypeFromString(EDataType eDataType, String initialValue) {
		TransitionStyleType result = TransitionStyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionTypeType createTransitionTypeTypeFromString(EDataType eDataType, String initialValue) {
		TransitionTypeType result = TransitionTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityType createVisibilityTypeFromString(EDataType eDataType, String initialValue) {
		VisibilityType result = VisibilityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActionTypeFromString(PresentationPackage.Literals.ACTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionTypeToString(PresentationPackage.Literals.ACTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationsType createAnimationsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAnimationsTypeFromString(PresentationPackage.Literals.ANIMATIONS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnimationsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnimationsTypeToString(PresentationPackage.Literals.ANIMATIONS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeType createNodeTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNodeTypeTypeFromString(PresentationPackage.Literals.NODE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNodeTypeTypeToString(PresentationPackage.Literals.NODE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPresentationPageLayoutNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPresentationPageLayoutNameTypeMember1FromString(PresentationPackage.Literals.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1, initialValue);
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
	public String convertPresentationPageLayoutNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (PresentationPackage.Literals.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertPresentationPageLayoutNameTypeMember1ToString(PresentationPackage.Literals.PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1, instanceValue);
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
	public String createPresentationPageLayoutNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationPageLayoutNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresetClassType createPresetClassTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPresetClassTypeFromString(PresentationPackage.Literals.PRESET_CLASS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresetClassTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresetClassTypeToString(PresentationPackage.Literals.PRESET_CLASS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSourceTypeFromString(PresentationPackage.Literals.SOURCE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSourceTypeToString(PresentationPackage.Literals.SOURCE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleNameTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)TextFactory.eINSTANCE.createFromString(TextPackage.eINSTANCE.getStyleNameRef(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createStyleNameTypeMember1FromString(PresentationPackage.Literals.STYLE_NAME_TYPE_MEMBER1, initialValue);
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
	public String convertStyleNameTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TextPackage.eINSTANCE.getStyleNameRef().isInstance(instanceValue)) {
			try {
				String value = TextFactory.eINSTANCE.convertToString(TextPackage.eINSTANCE.getStyleNameRef(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (PresentationPackage.Literals.STYLE_NAME_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertStyleNameTypeMember1ToString(PresentationPackage.Literals.STYLE_NAME_TYPE_MEMBER1, instanceValue);
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
	public String createStyleNameTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleNameTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionOnClickType createTransitionOnClickTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransitionOnClickTypeFromString(PresentationPackage.Literals.TRANSITION_ON_CLICK_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionOnClickTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransitionOnClickTypeToString(PresentationPackage.Literals.TRANSITION_ON_CLICK_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionStyleType createTransitionStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransitionStyleTypeFromString(PresentationPackage.Literals.TRANSITION_STYLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransitionStyleTypeToString(PresentationPackage.Literals.TRANSITION_STYLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionTypeType createTransitionTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransitionTypeTypeFromString(PresentationPackage.Literals.TRANSITION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransitionTypeTypeToString(PresentationPackage.Literals.TRANSITION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityType createVisibilityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVisibilityTypeFromString(PresentationPackage.Literals.VISIBILITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVisibilityTypeToString(PresentationPackage.Literals.VISIBILITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationPackage getPresentationPackage() {
		return (PresentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PresentationPackage getPackage() {
		return PresentationPackage.eINSTANCE;
	}

} //PresentationFactoryImpl
