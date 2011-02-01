/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType;
import org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChartType;
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
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.SettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType;
import org.oasisopen.names.tc.opendocument.xmlns.office.StylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.TextType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OfficeMeta;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage
 * @generated
 */
public class OfficeSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OfficePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeSwitch() {
		if (modelPackage == null) {
			modelPackage = OfficePackage.eINSTANCE;
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
			case OfficePackage.ANNOTATION_TYPE: {
				AnnotationType annotationType = (AnnotationType)theEObject;
				T result = caseAnnotationType(annotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.AUTOMATIC_STYLES_TYPE: {
				AutomaticStylesType automaticStylesType = (AutomaticStylesType)theEObject;
				T result = caseAutomaticStylesType(automaticStylesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.CHANGE_INFO_TYPE: {
				ChangeInfoType changeInfoType = (ChangeInfoType)theEObject;
				T result = caseChangeInfoType(changeInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.CHART_TYPE: {
				ChartType chartType = (ChartType)theEObject;
				T result = caseChartType(chartType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.DOCUMENT_CONTENT_TYPE: {
				DocumentContentType documentContentType = (DocumentContentType)theEObject;
				T result = caseDocumentContentType(documentContentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.DOCUMENT_META_TYPE: {
				DocumentMetaType documentMetaType = (DocumentMetaType)theEObject;
				T result = caseDocumentMetaType(documentMetaType);
				if (result == null) result = caseOfficeMeta(documentMetaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.DOCUMENT_SETTINGS_TYPE: {
				DocumentSettingsType documentSettingsType = (DocumentSettingsType)theEObject;
				T result = caseDocumentSettingsType(documentSettingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.DOCUMENT_STYLES_TYPE: {
				DocumentStylesType documentStylesType = (DocumentStylesType)theEObject;
				T result = caseDocumentStylesType(documentStylesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.DOCUMENT_TYPE: {
				DocumentType documentType = (DocumentType)theEObject;
				T result = caseDocumentType(documentType);
				if (result == null) result = caseOfficeMeta(documentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.DRAWING_TYPE: {
				DrawingType drawingType = (DrawingType)theEObject;
				T result = caseDrawingType(drawingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.EVENT_LISTENERS_TYPE: {
				EventListenersType eventListenersType = (EventListenersType)theEObject;
				T result = caseEventListenersType(eventListenersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.FONT_FACE_DECLS_TYPE: {
				FontFaceDeclsType fontFaceDeclsType = (FontFaceDeclsType)theEObject;
				T result = caseFontFaceDeclsType(fontFaceDeclsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.FORMS_TYPE: {
				FormsType formsType = (FormsType)theEObject;
				T result = caseFormsType(formsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.MASTER_STYLES_TYPE: {
				MasterStylesType masterStylesType = (MasterStylesType)theEObject;
				T result = caseMasterStylesType(masterStylesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.PRESENTATION_TYPE: {
				PresentationType presentationType = (PresentationType)theEObject;
				T result = casePresentationType(presentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.SCRIPTS_TYPE: {
				ScriptsType scriptsType = (ScriptsType)theEObject;
				T result = caseScriptsType(scriptsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.SCRIPT_TYPE: {
				ScriptType scriptType = (ScriptType)theEObject;
				T result = caseScriptType(scriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.SETTINGS_TYPE: {
				SettingsType settingsType = (SettingsType)theEObject;
				T result = caseSettingsType(settingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.SPREADSHEET_TYPE: {
				SpreadsheetType spreadsheetType = (SpreadsheetType)theEObject;
				T result = caseSpreadsheetType(spreadsheetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.STYLES_TYPE: {
				StylesType stylesType = (StylesType)theEObject;
				T result = caseStylesType(stylesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.TEXT_TYPE: {
				TextType textType = (TextType)theEObject;
				T result = caseTextType(textType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OfficePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automatic Styles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automatic Styles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomaticStylesType(AutomaticStylesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeInfoType(ChangeInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chart Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chart Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChartType(ChartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Content Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentContentType(DocumentContentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Meta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Meta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentMetaType(DocumentMetaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentSettingsType(DocumentSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Styles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Styles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentStylesType(DocumentStylesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentType(DocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawingType(DrawingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Listeners Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Listeners Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventListenersType(EventListenersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Face Decls Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Face Decls Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontFaceDeclsType(FontFaceDeclsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forms Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forms Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormsType(FormsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Styles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Styles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterStylesType(MasterStylesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationType(PresentationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scripts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scripts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptsType(ScriptsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptType(ScriptType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Spreadsheet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spreadsheet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpreadsheetType(SpreadsheetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Styles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Styles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStylesType(StylesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextType(TextType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Office Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Office Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfficeMeta(OfficeMeta object) {
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

} //OfficeSwitch
