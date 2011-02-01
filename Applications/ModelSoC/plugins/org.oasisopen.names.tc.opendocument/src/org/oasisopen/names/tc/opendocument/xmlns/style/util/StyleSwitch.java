/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1;
import org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType;
import org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType;
import org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent;

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
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage
 * @generated
 */
public class StyleSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StylePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSwitch() {
		if (modelPackage == null) {
			modelPackage = StylePackage.eINSTANCE;
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
			case StylePackage.BACKGROUND_IMAGE_TYPE: {
				BackgroundImageType backgroundImageType = (BackgroundImageType)theEObject;
				T result = caseBackgroundImageType(backgroundImageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.COLUMN_SEP_TYPE: {
				ColumnSepType columnSepType = (ColumnSepType)theEObject;
				T result = caseColumnSepType(columnSepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.COLUMNS_TYPE: {
				ColumnsType columnsType = (ColumnsType)theEObject;
				T result = caseColumnsType(columnsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.COLUMN_TYPE: {
				ColumnType columnType = (ColumnType)theEObject;
				T result = caseColumnType(columnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.DROP_CAP_TYPE: {
				DropCapType dropCapType = (DropCapType)theEObject;
				T result = caseDropCapType(dropCapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.FONT_FACE_TYPE: {
				FontFaceType fontFaceType = (FontFaceType)theEObject;
				T result = caseFontFaceType(fontFaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.FOOTER_LEFT_TYPE: {
				FooterLeftType footerLeftType = (FooterLeftType)theEObject;
				T result = caseFooterLeftType(footerLeftType);
				if (result == null) result = caseHeaderFooterContent(footerLeftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.FOOTER_STYLE_TYPE: {
				FooterStyleType footerStyleType = (FooterStyleType)theEObject;
				T result = caseFooterStyleType(footerStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.FOOTER_TYPE: {
				FooterType footerType = (FooterType)theEObject;
				T result = caseFooterType(footerType);
				if (result == null) result = caseHeaderFooterContent(footerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.FOOTNOTE_SEP_TYPE: {
				FootnoteSepType footnoteSepType = (FootnoteSepType)theEObject;
				T result = caseFootnoteSepType(footnoteSepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.HANDOUT_MASTER_TYPE: {
				HandoutMasterType handoutMasterType = (HandoutMasterType)theEObject;
				T result = caseHandoutMasterType(handoutMasterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.HEADER_LEFT_TYPE: {
				HeaderLeftType headerLeftType = (HeaderLeftType)theEObject;
				T result = caseHeaderLeftType(headerLeftType);
				if (result == null) result = caseHeaderFooterContent(headerLeftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.HEADER_STYLE_TYPE: {
				HeaderStyleType headerStyleType = (HeaderStyleType)theEObject;
				T result = caseHeaderStyleType(headerStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.HEADER_TYPE: {
				HeaderType headerType = (HeaderType)theEObject;
				T result = caseHeaderType(headerType);
				if (result == null) result = caseHeaderFooterContent(headerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.MAP_TYPE: {
				MapType mapType = (MapType)theEObject;
				T result = caseMapType(mapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.MASTER_PAGE_TYPE: {
				MasterPageType masterPageType = (MasterPageType)theEObject;
				T result = caseMasterPageType(masterPageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.PAGE_LAYOUT_TYPE: {
				PageLayoutType pageLayoutType = (PageLayoutType)theEObject;
				T result = casePageLayoutType(pageLayoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.PRESENTATION_PAGE_LAYOUT_TYPE: {
				PresentationPageLayoutType presentationPageLayoutType = (PresentationPageLayoutType)theEObject;
				T result = casePresentationPageLayoutType(presentationPageLayoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.STYLE_TYPE1: {
				StyleType1 styleType1 = (StyleType1)theEObject;
				T result = caseStyleType1(styleType1);
				if (result == null) result = caseStyleStyleContent(styleType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.TAB_STOPS_TYPE: {
				TabStopsType tabStopsType = (TabStopsType)theEObject;
				T result = caseTabStopsType(tabStopsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StylePackage.TAB_STOP_TYPE: {
				TabStopType tabStopType = (TabStopType)theEObject;
				T result = caseTabStopType(tabStopType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackgroundImageType(BackgroundImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Sep Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Sep Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnSepType(ColumnSepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Columns Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnsType(ColumnsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnType(ColumnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Cap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Cap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropCapType(DropCapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Face Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Face Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontFaceType(FontFaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footer Left Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footer Left Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFooterLeftType(FooterLeftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footer Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footer Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFooterStyleType(FooterStyleType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Footnote Sep Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footnote Sep Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFootnoteSepType(FootnoteSepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handout Master Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handout Master Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandoutMasterType(HandoutMasterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Left Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Left Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderLeftType(HeaderLeftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderStyleType(HeaderStyleType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapType(MapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Page Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterPageType(MasterPageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Layout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Layout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageLayoutType(PageLayoutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Page Layout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Page Layout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationPageLayoutType(PresentationPageLayoutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleType1(StyleType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Stops Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Stops Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabStopsType(TabStopsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Tab Stop Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Stop Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabStopType(TabStopType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Footer Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Footer Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderFooterContent(HeaderFooterContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Style Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Style Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleStyleContent(StyleStyleContent object) {
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

} //StyleSwitch
