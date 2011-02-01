/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.StopType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage
 * @generated
 */
public class SvgSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SvgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgSwitch() {
		if (modelPackage == null) {
			modelPackage = SvgPackage.eINSTANCE;
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
			case SvgPackage.DEFINITION_SRC_TYPE: {
				DefinitionSrcType definitionSrcType = (DefinitionSrcType)theEObject;
				T result = caseDefinitionSrcType(definitionSrcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.FONT_FACE_FORMAT_TYPE: {
				FontFaceFormatType fontFaceFormatType = (FontFaceFormatType)theEObject;
				T result = caseFontFaceFormatType(fontFaceFormatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.FONT_FACE_NAME_TYPE: {
				FontFaceNameType fontFaceNameType = (FontFaceNameType)theEObject;
				T result = caseFontFaceNameType(fontFaceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.FONT_FACE_SRC_TYPE: {
				FontFaceSrcType fontFaceSrcType = (FontFaceSrcType)theEObject;
				T result = caseFontFaceSrcType(fontFaceSrcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.FONT_FACE_URI_TYPE: {
				FontFaceUriType fontFaceUriType = (FontFaceUriType)theEObject;
				T result = caseFontFaceUriType(fontFaceUriType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.LINEAR_GRADIENT_TYPE: {
				LinearGradientType linearGradientType = (LinearGradientType)theEObject;
				T result = caseLinearGradientType(linearGradientType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.RADIAL_GRADIENT_TYPE: {
				RadialGradientType radialGradientType = (RadialGradientType)theEObject;
				T result = caseRadialGradientType(radialGradientType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.STOP_TYPE: {
				StopType stopType = (StopType)theEObject;
				T result = caseStopType(stopType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Src Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Src Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionSrcType(DefinitionSrcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Face Format Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Face Format Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontFaceFormatType(FontFaceFormatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Face Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Face Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontFaceNameType(FontFaceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Face Src Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Face Src Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontFaceSrcType(FontFaceSrcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Face Uri Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Face Uri Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontFaceUriType(FontFaceUriType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Gradient Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Gradient Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearGradientType(LinearGradientType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radial Gradient Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radial Gradient Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadialGradientType(RadialGradientType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopType(StopType object) {
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

} //SvgSwitch
