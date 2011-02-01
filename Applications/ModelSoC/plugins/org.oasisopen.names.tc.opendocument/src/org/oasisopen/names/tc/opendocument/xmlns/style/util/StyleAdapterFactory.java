/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.style.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage
 * @generated
 */
public class StyleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StylePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StylePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleSwitch<Adapter> modelSwitch =
		new StyleSwitch<Adapter>() {
			@Override
			public Adapter caseBackgroundImageType(BackgroundImageType object) {
				return createBackgroundImageTypeAdapter();
			}
			@Override
			public Adapter caseColumnSepType(ColumnSepType object) {
				return createColumnSepTypeAdapter();
			}
			@Override
			public Adapter caseColumnsType(ColumnsType object) {
				return createColumnsTypeAdapter();
			}
			@Override
			public Adapter caseColumnType(ColumnType object) {
				return createColumnTypeAdapter();
			}
			@Override
			public Adapter caseDropCapType(DropCapType object) {
				return createDropCapTypeAdapter();
			}
			@Override
			public Adapter caseFontFaceType(FontFaceType object) {
				return createFontFaceTypeAdapter();
			}
			@Override
			public Adapter caseFooterLeftType(FooterLeftType object) {
				return createFooterLeftTypeAdapter();
			}
			@Override
			public Adapter caseFooterStyleType(FooterStyleType object) {
				return createFooterStyleTypeAdapter();
			}
			@Override
			public Adapter caseFooterType(FooterType object) {
				return createFooterTypeAdapter();
			}
			@Override
			public Adapter caseFootnoteSepType(FootnoteSepType object) {
				return createFootnoteSepTypeAdapter();
			}
			@Override
			public Adapter caseHandoutMasterType(HandoutMasterType object) {
				return createHandoutMasterTypeAdapter();
			}
			@Override
			public Adapter caseHeaderLeftType(HeaderLeftType object) {
				return createHeaderLeftTypeAdapter();
			}
			@Override
			public Adapter caseHeaderStyleType(HeaderStyleType object) {
				return createHeaderStyleTypeAdapter();
			}
			@Override
			public Adapter caseHeaderType(HeaderType object) {
				return createHeaderTypeAdapter();
			}
			@Override
			public Adapter caseMapType(MapType object) {
				return createMapTypeAdapter();
			}
			@Override
			public Adapter caseMasterPageType(MasterPageType object) {
				return createMasterPageTypeAdapter();
			}
			@Override
			public Adapter casePageLayoutType(PageLayoutType object) {
				return createPageLayoutTypeAdapter();
			}
			@Override
			public Adapter casePresentationPageLayoutType(PresentationPageLayoutType object) {
				return createPresentationPageLayoutTypeAdapter();
			}
			@Override
			public Adapter caseStyleType1(StyleType1 object) {
				return createStyleType1Adapter();
			}
			@Override
			public Adapter caseTabStopsType(TabStopsType object) {
				return createTabStopsTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseTabStopType(TabStopType object) {
				return createTabStopTypeAdapter();
			}
			@Override
			public Adapter caseHeaderFooterContent(HeaderFooterContent object) {
				return createHeaderFooterContentAdapter();
			}
			@Override
			public Adapter caseStyleStyleContent(StyleStyleContent object) {
				return createStyleStyleContentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType <em>Background Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.BackgroundImageType
	 * @generated
	 */
	public Adapter createBackgroundImageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType <em>Column Sep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnSepType
	 * @generated
	 */
	public Adapter createColumnSepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType <em>Columns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnsType
	 * @generated
	 */
	public Adapter createColumnsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.ColumnType
	 * @generated
	 */
	public Adapter createColumnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType <em>Drop Cap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DropCapType
	 * @generated
	 */
	public Adapter createDropCapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType <em>Font Face Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType
	 * @generated
	 */
	public Adapter createFontFaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType <em>Footer Left Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FooterLeftType
	 * @generated
	 */
	public Adapter createFooterLeftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType <em>Footer Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FooterStyleType
	 * @generated
	 */
	public Adapter createFooterStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FooterType <em>Footer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FooterType
	 * @generated
	 */
	public Adapter createFooterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType <em>Footnote Sep Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.FootnoteSepType
	 * @generated
	 */
	public Adapter createFootnoteSepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType <em>Handout Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HandoutMasterType
	 * @generated
	 */
	public Adapter createHandoutMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType <em>Header Left Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HeaderLeftType
	 * @generated
	 */
	public Adapter createHeaderLeftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType <em>Header Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HeaderStyleType
	 * @generated
	 */
	public Adapter createHeaderStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.HeaderType
	 * @generated
	 */
	public Adapter createHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType <em>Master Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.MasterPageType
	 * @generated
	 */
	public Adapter createMasterPageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType <em>Page Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PageLayoutType
	 * @generated
	 */
	public Adapter createPageLayoutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType <em>Presentation Page Layout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType
	 * @generated
	 */
	public Adapter createPresentationPageLayoutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1 <em>Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1
	 * @generated
	 */
	public Adapter createStyleType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType <em>Tab Stops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopsType
	 * @generated
	 */
	public Adapter createTabStopsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType <em>Tab Stop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.style.TabStopType
	 * @generated
	 */
	public Adapter createTabStopTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent <em>Header Footer Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.HeaderFooterContent
	 * @generated
	 */
	public Adapter createHeaderFooterContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent <em>Style Style Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent
	 * @generated
	 */
	public Adapter createStyleStyleContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StyleAdapterFactory
