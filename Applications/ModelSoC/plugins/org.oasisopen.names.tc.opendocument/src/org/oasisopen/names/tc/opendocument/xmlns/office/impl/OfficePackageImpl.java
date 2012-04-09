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
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.impl.AnimationPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.impl.ChartPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage;
import org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.DatastylePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.DrawingPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage;
import org.oasisopen.names.tc.opendocument.xmlns.fo.impl.FoPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.impl.FormPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage;
import org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.office.AnnotationType;
import org.oasisopen.names.tc.opendocument.xmlns.office.AutomaticStylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChangeInfoType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ChartType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ConversionModeType;
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
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficeFactory;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.PresentationType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ScriptsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.SettingsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.SpreadsheetType;
import org.oasisopen.names.tc.opendocument.xmlns.office.StylesType;
import org.oasisopen.names.tc.opendocument.xmlns.office.TextType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.office.ValueTypeType1;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.script.ScriptPackage;
import org.oasisopen.names.tc.opendocument.xmlns.script.impl.ScriptPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage;
import org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;
import org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.impl.TablePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.TextPackageImpl;
import org.purl.dc.elements.dc.DCPackage;
import org.purl.dc.elements.dc.impl.DCPackageImpl;
import org.w3.math.ml.mathml.MathMLPackage;
import org.w3.math.ml.mathml.impl.MathMLPackageImpl;
import org.w3.xforms.XFormsPackage;
import org.w3.xforms.impl.XFormsPackageImpl;
import org.w3.xlink.XLinkPackage;
import org.w3.xlink.impl.XLinkPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OfficePackageImpl extends EPackageImpl implements OfficePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automaticStylesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentMetaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentSettingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentStylesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventListenersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontFaceDeclsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterStylesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spreadsheetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conversionModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueTypeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conversionModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueTypeTypeObject1EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OfficePackageImpl() {
		super(eNS_URI, OfficeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OfficePackage init() {
		if (isInited) return (OfficePackage)EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI);

		// Obtain or create and register package
		OfficePackageImpl theOfficePackage = (OfficePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OfficePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new OfficePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DrawingPackageImpl theDrawingPackage = (DrawingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) instanceof DrawingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) : DrawingPackage.eINSTANCE);
		TextPackageImpl theTextPackage = (TextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) instanceof TextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) : TextPackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		XLinkPackageImpl theXLinkPackage = (XLinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) instanceof XLinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) : XLinkPackage.eINSTANCE);
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) : PresentationPackage.eINSTANCE);
		SvgPackageImpl theSvgPackage = (SvgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI) instanceof SvgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI) : SvgPackage.eINSTANCE);
		Dr3dPackageImpl theDr3dPackage = (Dr3dPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI) instanceof Dr3dPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI) : Dr3dPackage.eINSTANCE);
		StylePackageImpl theStylePackage = (StylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI) : StylePackage.eINSTANCE);
		FormPackageImpl theFormPackage = (FormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) instanceof FormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI) : FormPackage.eINSTANCE);
		TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) : TablePackage.eINSTANCE);
		FoPackageImpl theFoPackage = (FoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FoPackage.eNS_URI) instanceof FoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FoPackage.eNS_URI) : FoPackage.eINSTANCE);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) : ConfigPackage.eINSTANCE);
		DatastylePackageImpl theDatastylePackage = (DatastylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatastylePackage.eNS_URI) instanceof DatastylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatastylePackage.eNS_URI) : DatastylePackage.eINSTANCE);
		AnimationPackageImpl theAnimationPackage = (AnimationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI) instanceof AnimationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI) : AnimationPackage.eINSTANCE);
		CompatiblePackageImpl theCompatiblePackage = (CompatiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI) instanceof CompatiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI) : CompatiblePackage.eINSTANCE);
		MetaPackageImpl theMetaPackage = (MetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI) instanceof MetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI) : MetaPackage.eINSTANCE);
		ChartPackageImpl theChartPackage = (ChartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChartPackage.eNS_URI) instanceof ChartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChartPackage.eNS_URI) : ChartPackage.eINSTANCE);
		DCPackageImpl theDCPackage = (DCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) instanceof DCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI) : DCPackage.eINSTANCE);
		MathMLPackageImpl theMathMLPackage = (MathMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MathMLPackage.eNS_URI) instanceof MathMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MathMLPackage.eNS_URI) : MathMLPackage.eINSTANCE);
		XFormsPackageImpl theXFormsPackage = (XFormsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XFormsPackage.eNS_URI) instanceof XFormsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XFormsPackage.eNS_URI) : XFormsPackage.eINSTANCE);

		// Load packages
		theDrawingPackage.loadPackage();
		theTextPackage.loadPackage();
		theStylePackage.loadPackage();
		theFormPackage.loadPackage();
		theTablePackage.loadPackage();

		// Create package meta-data objects
		theOfficePackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theXLinkPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
		theSvgPackage.createPackageContents();
		theDr3dPackage.createPackageContents();
		theFoPackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theDatastylePackage.createPackageContents();
		theAnimationPackage.createPackageContents();
		theCompatiblePackage.createPackageContents();
		theMetaPackage.createPackageContents();
		theChartPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theMathMLPackage.createPackageContents();
		theXFormsPackage.createPackageContents();

		// Initialize created meta-data
		theOfficePackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theXLinkPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
		theSvgPackage.initializePackageContents();
		theDr3dPackage.initializePackageContents();
		theFoPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theDatastylePackage.initializePackageContents();
		theAnimationPackage.initializePackageContents();
		theCompatiblePackage.initializePackageContents();
		theMetaPackage.initializePackageContents();
		theChartPackage.initializePackageContents();
		theDCPackage.initializePackageContents();
		theMathMLPackage.initializePackageContents();
		theXFormsPackage.initializePackageContents();

		// Fix loaded packages
		theDrawingPackage.fixPackageContents();
		theTextPackage.fixPackageContents();
		theStylePackage.fixPackageContents();
		theFormPackage.fixPackageContents();
		theTablePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theOfficePackage.freeze();

		return theOfficePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationType() {
		return annotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Creator() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Date() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_DateString() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Group() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationType_P() {
		return (EReference)annotationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationType_List() {
		return (EReference)annotationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_AnchorPageNumber() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_AnchorType() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_CaptionPointX() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_CaptionPointY() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_ClassNames() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_ClassNames1() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_CornerRadius() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Display() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_EndCellAddress() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_EndX() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_EndY() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Height() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Id() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Layer() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Name() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_StyleName() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_StyleName1() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_TableBackground() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_TextStyleName() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Transform() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Width() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_X() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_Y() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationType_ZIndex() {
		return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomaticStylesType() {
		return automaticStylesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticStylesType_Group() {
		return (EAttribute)automaticStylesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_Style() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_ListStyle() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_NumberStyle() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_CurrencyStyle() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_PercentageStyle() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_DateStyle() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_TimeStyle() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_BooleanStyle() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_TextStyle() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticStylesType_PageLayout() {
		return (EReference)automaticStylesTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeInfoType() {
		return changeInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeInfoType_Creator() {
		return (EAttribute)changeInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeInfoType_Date() {
		return (EAttribute)changeInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeInfoType_P() {
		return (EReference)changeInfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChartType() {
		return chartTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_VariableDecls() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_SequenceDecls() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_UserFieldDecls() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_DdeConnectionDecls() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_AlphabeticalIndexAutoMarkFile() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_CalculationSettings() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_ContentValidations() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_LabelRanges() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChartType_OfficeChartContentMainGroup() {
		return (EAttribute)chartTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_OfficeChartContentMain() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_NamedExpressions() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_DatabaseRanges() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_DataPilotTables() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_Consolidation() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChartType_DdeLinks() {
		return (EReference)chartTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentContentType() {
		return documentContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentContentType_Scripts() {
		return (EReference)documentContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentContentType_FontFaceDecls() {
		return (EReference)documentContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentContentType_AutomaticStyles() {
		return (EReference)documentContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentContentType_Body() {
		return (EReference)documentContentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentContentType_Version() {
		return (EAttribute)documentContentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentMetaType() {
		return documentMetaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentMetaType_Version() {
		return (EAttribute)documentMetaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentSettingsType() {
		return documentSettingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentSettingsType_Settings() {
		return (EReference)documentSettingsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentSettingsType_Version() {
		return (EAttribute)documentSettingsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentStylesType() {
		return documentStylesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStylesType_FontFaceDecls() {
		return (EReference)documentStylesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStylesType_Styles() {
		return (EReference)documentStylesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStylesType_AutomaticStyles() {
		return (EReference)documentStylesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStylesType_MasterStyles() {
		return (EReference)documentStylesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStylesType_Version() {
		return (EAttribute)documentStylesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentType() {
		return documentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_Settings() {
		return (EReference)documentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_Scripts() {
		return (EReference)documentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_FontFaceDecls() {
		return (EReference)documentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_Styles() {
		return (EReference)documentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_AutomaticStyles() {
		return (EReference)documentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_MasterStyles() {
		return (EReference)documentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_Body() {
		return (EReference)documentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_Mimetype() {
		return (EAttribute)documentTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_Version() {
		return (EAttribute)documentTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawingType() {
		return drawingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_VariableDecls() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_SequenceDecls() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_UserFieldDecls() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_DdeConnectionDecls() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_AlphabeticalIndexAutoMarkFile() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_CalculationSettings() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_ContentValidations() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_LabelRanges() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_Page() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_NamedExpressions() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_DatabaseRanges() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_DataPilotTables() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_Consolidation() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDrawingType_DdeLinks() {
		return (EReference)drawingTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventListenersType() {
		return eventListenersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenersType_Group() {
		return (EAttribute)eventListenersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventListenersType_EventListener() {
		return (EReference)eventListenersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventListenersType_EventListener1() {
		return (EReference)eventListenersTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontFaceDeclsType() {
		return fontFaceDeclsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFontFaceDeclsType_FontFace() {
		return (EReference)fontFaceDeclsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormsType() {
		return formsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormsType_Group() {
		return (EAttribute)formsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormsType_Form() {
		return (EReference)formsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormsType_Model() {
		return (EReference)formsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormsType_ApplyDesignMode() {
		return (EAttribute)formsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormsType_AutomaticFocus() {
		return (EAttribute)formsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterStylesType() {
		return masterStylesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterStylesType_Group() {
		return (EAttribute)masterStylesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterStylesType_MasterPage() {
		return (EReference)masterStylesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterStylesType_HandoutMaster() {
		return (EReference)masterStylesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterStylesType_LayerSet() {
		return (EReference)masterStylesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentationType() {
		return presentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_VariableDecls() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_SequenceDecls() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_UserFieldDecls() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_DdeConnectionDecls() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_AlphabeticalIndexAutoMarkFile() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_CalculationSettings() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_ContentValidations() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_LabelRanges() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationType_PresentationDeclGroup() {
		return (EAttribute)presentationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_PresentationDecl() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_Page() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_Settings() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_NamedExpressions() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_DatabaseRanges() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_DataPilotTables() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_Consolidation() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationType_DdeLinks() {
		return (EReference)presentationTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptsType() {
		return scriptsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptsType_Script() {
		return (EReference)scriptsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptsType_EventListeners() {
		return (EReference)scriptsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptType() {
		return scriptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Mixed() {
		return (EAttribute)scriptTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Any() {
		return (EAttribute)scriptTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptType_Language() {
		return (EAttribute)scriptTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettingsType() {
		return settingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettingsType_ConfigItemSet() {
		return (EReference)settingsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpreadsheetType() {
		return spreadsheetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_TrackedChanges() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_VariableDecls() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_SequenceDecls() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_UserFieldDecls() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_DdeConnectionDecls() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_AlphabeticalIndexAutoMarkFile() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_CalculationSettings() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_ContentValidations() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_LabelRanges() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_Table() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_NamedExpressions() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_DatabaseRanges() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_DataPilotTables() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_Consolidation() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpreadsheetType_DdeLinks() {
		return (EReference)spreadsheetTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetType_ProtectionKey() {
		return (EAttribute)spreadsheetTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpreadsheetType_StructureProtected() {
		return (EAttribute)spreadsheetTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStylesType() {
		return stylesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStylesType_Group() {
		return (EAttribute)stylesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_Style() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_ListStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_NumberStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_CurrencyStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_PercentageStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_DateStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_TimeStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_BooleanStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_TextStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_DefaultStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_OutlineStyle() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_NotesConfiguration() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_BibliographyConfiguration() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_LinenumberingConfiguration() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_Gradient() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_LinearGradient() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_RadialGradient() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_Hatch() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_FillImage() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_Marker() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_StrokeDash() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_Opacity() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStylesType_PresentationPageLayout() {
		return (EReference)stylesTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextType() {
		return textTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Forms() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_TrackedChanges() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_VariableDecls() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_SequenceDecls() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_UserFieldDecls() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_DdeConnectionDecls() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_AlphabeticalIndexAutoMarkFile() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_CalculationSettings() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_ContentValidations() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_LabelRanges() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_OfficeTextContentMain() {
		return (EAttribute)textTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_H() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_P() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_List() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_NumberedParagraph() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Table() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_A() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Section() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_SoftPageBreak() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_TableOfContent() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_IllustrationIndex() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_TableIndex() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_ObjectIndex() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_UserIndex() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_AlphabeticalIndex() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Bibliography() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Rect() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Line() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Polyline() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Polygon() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_RegularPolygon() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Path() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Circle() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Ellipse() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_G() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_PageThumbnail() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Frame() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Measure() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Caption() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Connector() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Control() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Scene() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_CustomShape() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_ChangeMarksGroup() {
		return (EAttribute)textTypeEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_ChangeMarks() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_PageSequence() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_A1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Rect1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Line1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Polyline1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Polygon1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_RegularPolygon1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Path1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Circle1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Ellipse1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_G1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_PageThumbnail1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Frame1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Measure1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Caption1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Connector1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Control1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Scene1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_CustomShape1() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_NamedExpressions() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_DatabaseRanges() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_DataPilotTables() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_Consolidation() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextType_DdeLinks() {
		return (EReference)textTypeEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Global() {
		return (EAttribute)textTypeEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_UseSoftPageBreaks() {
		return (EAttribute)textTypeEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Annotation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AutomaticStyles() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BinaryData() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Body() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Chart() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DdeSource() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Document() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentContent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentMeta() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentSettings() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentStyles() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Drawing() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EventListeners() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FontFaceDecls() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Forms() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Image() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MasterStyles() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Meta() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Presentation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Script() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Scripts() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Settings() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Spreadsheet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Styles() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Text() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AutomaticUpdate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BooleanValue() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ConversionMode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Currency() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DateValue() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DdeApplication() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DdeItem() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DdeTopic() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Display() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mimetype() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ProcessContent() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ServerMap() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StringValue() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TargetFrame() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TargetFrameName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TimeValue() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Title() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Value() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Version() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConversionModeType() {
		return conversionModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueTypeType() {
		return valueTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueTypeType1() {
		return valueTypeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConversionModeTypeObject() {
		return conversionModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueTypeTypeObject() {
		return valueTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueTypeTypeObject1() {
		return valueTypeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeFactory getOfficeFactory() {
		return (OfficeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		annotationTypeEClass = createEClass(ANNOTATION_TYPE);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__CREATOR);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__DATE);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__DATE_STRING);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__GROUP);
		createEReference(annotationTypeEClass, ANNOTATION_TYPE__P);
		createEReference(annotationTypeEClass, ANNOTATION_TYPE__LIST);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__ANCHOR_PAGE_NUMBER);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__ANCHOR_TYPE);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__CAPTION_POINT_X);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__CAPTION_POINT_Y);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__CLASS_NAMES);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__CLASS_NAMES1);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__CORNER_RADIUS);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__DISPLAY);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__END_CELL_ADDRESS);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__END_X);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__END_Y);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__HEIGHT);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__ID);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__LAYER);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__NAME);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__STYLE_NAME);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__STYLE_NAME1);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__TABLE_BACKGROUND);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__TEXT_STYLE_NAME);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__TRANSFORM);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__WIDTH);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__X);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__Y);
		createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__ZINDEX);

		automaticStylesTypeEClass = createEClass(AUTOMATIC_STYLES_TYPE);
		createEAttribute(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__GROUP);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__STYLE);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__LIST_STYLE);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__NUMBER_STYLE);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__CURRENCY_STYLE);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__PERCENTAGE_STYLE);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__DATE_STYLE);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__TIME_STYLE);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__BOOLEAN_STYLE);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__TEXT_STYLE);
		createEReference(automaticStylesTypeEClass, AUTOMATIC_STYLES_TYPE__PAGE_LAYOUT);

		changeInfoTypeEClass = createEClass(CHANGE_INFO_TYPE);
		createEAttribute(changeInfoTypeEClass, CHANGE_INFO_TYPE__CREATOR);
		createEAttribute(changeInfoTypeEClass, CHANGE_INFO_TYPE__DATE);
		createEReference(changeInfoTypeEClass, CHANGE_INFO_TYPE__P);

		chartTypeEClass = createEClass(CHART_TYPE);
		createEReference(chartTypeEClass, CHART_TYPE__VARIABLE_DECLS);
		createEReference(chartTypeEClass, CHART_TYPE__SEQUENCE_DECLS);
		createEReference(chartTypeEClass, CHART_TYPE__USER_FIELD_DECLS);
		createEReference(chartTypeEClass, CHART_TYPE__DDE_CONNECTION_DECLS);
		createEReference(chartTypeEClass, CHART_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE);
		createEReference(chartTypeEClass, CHART_TYPE__CALCULATION_SETTINGS);
		createEReference(chartTypeEClass, CHART_TYPE__CONTENT_VALIDATIONS);
		createEReference(chartTypeEClass, CHART_TYPE__LABEL_RANGES);
		createEAttribute(chartTypeEClass, CHART_TYPE__OFFICE_CHART_CONTENT_MAIN_GROUP);
		createEReference(chartTypeEClass, CHART_TYPE__OFFICE_CHART_CONTENT_MAIN);
		createEReference(chartTypeEClass, CHART_TYPE__NAMED_EXPRESSIONS);
		createEReference(chartTypeEClass, CHART_TYPE__DATABASE_RANGES);
		createEReference(chartTypeEClass, CHART_TYPE__DATA_PILOT_TABLES);
		createEReference(chartTypeEClass, CHART_TYPE__CONSOLIDATION);
		createEReference(chartTypeEClass, CHART_TYPE__DDE_LINKS);

		documentContentTypeEClass = createEClass(DOCUMENT_CONTENT_TYPE);
		createEReference(documentContentTypeEClass, DOCUMENT_CONTENT_TYPE__SCRIPTS);
		createEReference(documentContentTypeEClass, DOCUMENT_CONTENT_TYPE__FONT_FACE_DECLS);
		createEReference(documentContentTypeEClass, DOCUMENT_CONTENT_TYPE__AUTOMATIC_STYLES);
		createEReference(documentContentTypeEClass, DOCUMENT_CONTENT_TYPE__BODY);
		createEAttribute(documentContentTypeEClass, DOCUMENT_CONTENT_TYPE__VERSION);

		documentMetaTypeEClass = createEClass(DOCUMENT_META_TYPE);
		createEAttribute(documentMetaTypeEClass, DOCUMENT_META_TYPE__VERSION);

		documentSettingsTypeEClass = createEClass(DOCUMENT_SETTINGS_TYPE);
		createEReference(documentSettingsTypeEClass, DOCUMENT_SETTINGS_TYPE__SETTINGS);
		createEAttribute(documentSettingsTypeEClass, DOCUMENT_SETTINGS_TYPE__VERSION);

		documentStylesTypeEClass = createEClass(DOCUMENT_STYLES_TYPE);
		createEReference(documentStylesTypeEClass, DOCUMENT_STYLES_TYPE__FONT_FACE_DECLS);
		createEReference(documentStylesTypeEClass, DOCUMENT_STYLES_TYPE__STYLES);
		createEReference(documentStylesTypeEClass, DOCUMENT_STYLES_TYPE__AUTOMATIC_STYLES);
		createEReference(documentStylesTypeEClass, DOCUMENT_STYLES_TYPE__MASTER_STYLES);
		createEAttribute(documentStylesTypeEClass, DOCUMENT_STYLES_TYPE__VERSION);

		documentTypeEClass = createEClass(DOCUMENT_TYPE);
		createEReference(documentTypeEClass, DOCUMENT_TYPE__SETTINGS);
		createEReference(documentTypeEClass, DOCUMENT_TYPE__SCRIPTS);
		createEReference(documentTypeEClass, DOCUMENT_TYPE__FONT_FACE_DECLS);
		createEReference(documentTypeEClass, DOCUMENT_TYPE__STYLES);
		createEReference(documentTypeEClass, DOCUMENT_TYPE__AUTOMATIC_STYLES);
		createEReference(documentTypeEClass, DOCUMENT_TYPE__MASTER_STYLES);
		createEReference(documentTypeEClass, DOCUMENT_TYPE__BODY);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__MIMETYPE);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__VERSION);

		drawingTypeEClass = createEClass(DRAWING_TYPE);
		createEReference(drawingTypeEClass, DRAWING_TYPE__VARIABLE_DECLS);
		createEReference(drawingTypeEClass, DRAWING_TYPE__SEQUENCE_DECLS);
		createEReference(drawingTypeEClass, DRAWING_TYPE__USER_FIELD_DECLS);
		createEReference(drawingTypeEClass, DRAWING_TYPE__DDE_CONNECTION_DECLS);
		createEReference(drawingTypeEClass, DRAWING_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE);
		createEReference(drawingTypeEClass, DRAWING_TYPE__CALCULATION_SETTINGS);
		createEReference(drawingTypeEClass, DRAWING_TYPE__CONTENT_VALIDATIONS);
		createEReference(drawingTypeEClass, DRAWING_TYPE__LABEL_RANGES);
		createEReference(drawingTypeEClass, DRAWING_TYPE__PAGE);
		createEReference(drawingTypeEClass, DRAWING_TYPE__NAMED_EXPRESSIONS);
		createEReference(drawingTypeEClass, DRAWING_TYPE__DATABASE_RANGES);
		createEReference(drawingTypeEClass, DRAWING_TYPE__DATA_PILOT_TABLES);
		createEReference(drawingTypeEClass, DRAWING_TYPE__CONSOLIDATION);
		createEReference(drawingTypeEClass, DRAWING_TYPE__DDE_LINKS);

		eventListenersTypeEClass = createEClass(EVENT_LISTENERS_TYPE);
		createEAttribute(eventListenersTypeEClass, EVENT_LISTENERS_TYPE__GROUP);
		createEReference(eventListenersTypeEClass, EVENT_LISTENERS_TYPE__EVENT_LISTENER);
		createEReference(eventListenersTypeEClass, EVENT_LISTENERS_TYPE__EVENT_LISTENER1);

		fontFaceDeclsTypeEClass = createEClass(FONT_FACE_DECLS_TYPE);
		createEReference(fontFaceDeclsTypeEClass, FONT_FACE_DECLS_TYPE__FONT_FACE);

		formsTypeEClass = createEClass(FORMS_TYPE);
		createEAttribute(formsTypeEClass, FORMS_TYPE__GROUP);
		createEReference(formsTypeEClass, FORMS_TYPE__FORM);
		createEReference(formsTypeEClass, FORMS_TYPE__MODEL);
		createEAttribute(formsTypeEClass, FORMS_TYPE__APPLY_DESIGN_MODE);
		createEAttribute(formsTypeEClass, FORMS_TYPE__AUTOMATIC_FOCUS);

		masterStylesTypeEClass = createEClass(MASTER_STYLES_TYPE);
		createEAttribute(masterStylesTypeEClass, MASTER_STYLES_TYPE__GROUP);
		createEReference(masterStylesTypeEClass, MASTER_STYLES_TYPE__MASTER_PAGE);
		createEReference(masterStylesTypeEClass, MASTER_STYLES_TYPE__HANDOUT_MASTER);
		createEReference(masterStylesTypeEClass, MASTER_STYLES_TYPE__LAYER_SET);

		presentationTypeEClass = createEClass(PRESENTATION_TYPE);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__VARIABLE_DECLS);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__SEQUENCE_DECLS);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__USER_FIELD_DECLS);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__DDE_CONNECTION_DECLS);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__CALCULATION_SETTINGS);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__CONTENT_VALIDATIONS);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__LABEL_RANGES);
		createEAttribute(presentationTypeEClass, PRESENTATION_TYPE__PRESENTATION_DECL_GROUP);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__PRESENTATION_DECL);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__PAGE);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__SETTINGS);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__NAMED_EXPRESSIONS);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__DATABASE_RANGES);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__DATA_PILOT_TABLES);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__CONSOLIDATION);
		createEReference(presentationTypeEClass, PRESENTATION_TYPE__DDE_LINKS);

		scriptsTypeEClass = createEClass(SCRIPTS_TYPE);
		createEReference(scriptsTypeEClass, SCRIPTS_TYPE__SCRIPT);
		createEReference(scriptsTypeEClass, SCRIPTS_TYPE__EVENT_LISTENERS);

		scriptTypeEClass = createEClass(SCRIPT_TYPE);
		createEAttribute(scriptTypeEClass, SCRIPT_TYPE__MIXED);
		createEAttribute(scriptTypeEClass, SCRIPT_TYPE__ANY);
		createEAttribute(scriptTypeEClass, SCRIPT_TYPE__LANGUAGE);

		settingsTypeEClass = createEClass(SETTINGS_TYPE);
		createEReference(settingsTypeEClass, SETTINGS_TYPE__CONFIG_ITEM_SET);

		spreadsheetTypeEClass = createEClass(SPREADSHEET_TYPE);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__TRACKED_CHANGES);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__VARIABLE_DECLS);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__SEQUENCE_DECLS);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__USER_FIELD_DECLS);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__DDE_CONNECTION_DECLS);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__CALCULATION_SETTINGS);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__CONTENT_VALIDATIONS);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__LABEL_RANGES);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__TABLE);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__NAMED_EXPRESSIONS);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__DATABASE_RANGES);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__DATA_PILOT_TABLES);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__CONSOLIDATION);
		createEReference(spreadsheetTypeEClass, SPREADSHEET_TYPE__DDE_LINKS);
		createEAttribute(spreadsheetTypeEClass, SPREADSHEET_TYPE__PROTECTION_KEY);
		createEAttribute(spreadsheetTypeEClass, SPREADSHEET_TYPE__STRUCTURE_PROTECTED);

		stylesTypeEClass = createEClass(STYLES_TYPE);
		createEAttribute(stylesTypeEClass, STYLES_TYPE__GROUP);
		createEReference(stylesTypeEClass, STYLES_TYPE__STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__LIST_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__NUMBER_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__CURRENCY_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__PERCENTAGE_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__DATE_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__TIME_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__BOOLEAN_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__TEXT_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__DEFAULT_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__OUTLINE_STYLE);
		createEReference(stylesTypeEClass, STYLES_TYPE__NOTES_CONFIGURATION);
		createEReference(stylesTypeEClass, STYLES_TYPE__BIBLIOGRAPHY_CONFIGURATION);
		createEReference(stylesTypeEClass, STYLES_TYPE__LINENUMBERING_CONFIGURATION);
		createEReference(stylesTypeEClass, STYLES_TYPE__GRADIENT);
		createEReference(stylesTypeEClass, STYLES_TYPE__LINEAR_GRADIENT);
		createEReference(stylesTypeEClass, STYLES_TYPE__RADIAL_GRADIENT);
		createEReference(stylesTypeEClass, STYLES_TYPE__HATCH);
		createEReference(stylesTypeEClass, STYLES_TYPE__FILL_IMAGE);
		createEReference(stylesTypeEClass, STYLES_TYPE__MARKER);
		createEReference(stylesTypeEClass, STYLES_TYPE__STROKE_DASH);
		createEReference(stylesTypeEClass, STYLES_TYPE__OPACITY);
		createEReference(stylesTypeEClass, STYLES_TYPE__PRESENTATION_PAGE_LAYOUT);

		textTypeEClass = createEClass(TEXT_TYPE);
		createEReference(textTypeEClass, TEXT_TYPE__FORMS);
		createEReference(textTypeEClass, TEXT_TYPE__TRACKED_CHANGES);
		createEReference(textTypeEClass, TEXT_TYPE__VARIABLE_DECLS);
		createEReference(textTypeEClass, TEXT_TYPE__SEQUENCE_DECLS);
		createEReference(textTypeEClass, TEXT_TYPE__USER_FIELD_DECLS);
		createEReference(textTypeEClass, TEXT_TYPE__DDE_CONNECTION_DECLS);
		createEReference(textTypeEClass, TEXT_TYPE__ALPHABETICAL_INDEX_AUTO_MARK_FILE);
		createEReference(textTypeEClass, TEXT_TYPE__CALCULATION_SETTINGS);
		createEReference(textTypeEClass, TEXT_TYPE__CONTENT_VALIDATIONS);
		createEReference(textTypeEClass, TEXT_TYPE__LABEL_RANGES);
		createEAttribute(textTypeEClass, TEXT_TYPE__OFFICE_TEXT_CONTENT_MAIN);
		createEReference(textTypeEClass, TEXT_TYPE__H);
		createEReference(textTypeEClass, TEXT_TYPE__P);
		createEReference(textTypeEClass, TEXT_TYPE__LIST);
		createEReference(textTypeEClass, TEXT_TYPE__NUMBERED_PARAGRAPH);
		createEReference(textTypeEClass, TEXT_TYPE__TABLE);
		createEReference(textTypeEClass, TEXT_TYPE__A);
		createEReference(textTypeEClass, TEXT_TYPE__SECTION);
		createEReference(textTypeEClass, TEXT_TYPE__SOFT_PAGE_BREAK);
		createEReference(textTypeEClass, TEXT_TYPE__TABLE_OF_CONTENT);
		createEReference(textTypeEClass, TEXT_TYPE__ILLUSTRATION_INDEX);
		createEReference(textTypeEClass, TEXT_TYPE__TABLE_INDEX);
		createEReference(textTypeEClass, TEXT_TYPE__OBJECT_INDEX);
		createEReference(textTypeEClass, TEXT_TYPE__USER_INDEX);
		createEReference(textTypeEClass, TEXT_TYPE__ALPHABETICAL_INDEX);
		createEReference(textTypeEClass, TEXT_TYPE__BIBLIOGRAPHY);
		createEReference(textTypeEClass, TEXT_TYPE__RECT);
		createEReference(textTypeEClass, TEXT_TYPE__LINE);
		createEReference(textTypeEClass, TEXT_TYPE__POLYLINE);
		createEReference(textTypeEClass, TEXT_TYPE__POLYGON);
		createEReference(textTypeEClass, TEXT_TYPE__REGULAR_POLYGON);
		createEReference(textTypeEClass, TEXT_TYPE__PATH);
		createEReference(textTypeEClass, TEXT_TYPE__CIRCLE);
		createEReference(textTypeEClass, TEXT_TYPE__ELLIPSE);
		createEReference(textTypeEClass, TEXT_TYPE__G);
		createEReference(textTypeEClass, TEXT_TYPE__PAGE_THUMBNAIL);
		createEReference(textTypeEClass, TEXT_TYPE__FRAME);
		createEReference(textTypeEClass, TEXT_TYPE__MEASURE);
		createEReference(textTypeEClass, TEXT_TYPE__CAPTION);
		createEReference(textTypeEClass, TEXT_TYPE__CONNECTOR);
		createEReference(textTypeEClass, TEXT_TYPE__CONTROL);
		createEReference(textTypeEClass, TEXT_TYPE__SCENE);
		createEReference(textTypeEClass, TEXT_TYPE__CUSTOM_SHAPE);
		createEAttribute(textTypeEClass, TEXT_TYPE__CHANGE_MARKS_GROUP);
		createEReference(textTypeEClass, TEXT_TYPE__CHANGE_MARKS);
		createEReference(textTypeEClass, TEXT_TYPE__PAGE_SEQUENCE);
		createEReference(textTypeEClass, TEXT_TYPE__A1);
		createEReference(textTypeEClass, TEXT_TYPE__RECT1);
		createEReference(textTypeEClass, TEXT_TYPE__LINE1);
		createEReference(textTypeEClass, TEXT_TYPE__POLYLINE1);
		createEReference(textTypeEClass, TEXT_TYPE__POLYGON1);
		createEReference(textTypeEClass, TEXT_TYPE__REGULAR_POLYGON1);
		createEReference(textTypeEClass, TEXT_TYPE__PATH1);
		createEReference(textTypeEClass, TEXT_TYPE__CIRCLE1);
		createEReference(textTypeEClass, TEXT_TYPE__ELLIPSE1);
		createEReference(textTypeEClass, TEXT_TYPE__G1);
		createEReference(textTypeEClass, TEXT_TYPE__PAGE_THUMBNAIL1);
		createEReference(textTypeEClass, TEXT_TYPE__FRAME1);
		createEReference(textTypeEClass, TEXT_TYPE__MEASURE1);
		createEReference(textTypeEClass, TEXT_TYPE__CAPTION1);
		createEReference(textTypeEClass, TEXT_TYPE__CONNECTOR1);
		createEReference(textTypeEClass, TEXT_TYPE__CONTROL1);
		createEReference(textTypeEClass, TEXT_TYPE__SCENE1);
		createEReference(textTypeEClass, TEXT_TYPE__CUSTOM_SHAPE1);
		createEReference(textTypeEClass, TEXT_TYPE__NAMED_EXPRESSIONS);
		createEReference(textTypeEClass, TEXT_TYPE__DATABASE_RANGES);
		createEReference(textTypeEClass, TEXT_TYPE__DATA_PILOT_TABLES);
		createEReference(textTypeEClass, TEXT_TYPE__CONSOLIDATION);
		createEReference(textTypeEClass, TEXT_TYPE__DDE_LINKS);
		createEAttribute(textTypeEClass, TEXT_TYPE__GLOBAL);
		createEAttribute(textTypeEClass, TEXT_TYPE__USE_SOFT_PAGE_BREAKS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANNOTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTOMATIC_STYLES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BINARY_DATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BODY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_INFO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHART);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DDE_SOURCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT_CONTENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT_META);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT_SETTINGS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT_STYLES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DRAWING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_LISTENERS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FONT_FACE_DECLS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FORMS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MASTER_STYLES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__META);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PRESENTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCRIPT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCRIPTS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SETTINGS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPREADSHEET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STYLES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUTOMATIC_UPDATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BOOLEAN_VALUE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONVERSION_MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CURRENCY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATE_VALUE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DDE_APPLICATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DDE_ITEM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DDE_TOPIC);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DISPLAY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIMETYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROCESS_CONTENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVER_MAP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STRING_VALUE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TARGET_FRAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TARGET_FRAME_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TIME_VALUE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALUE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VERSION);

		// Create enums
		conversionModeTypeEEnum = createEEnum(CONVERSION_MODE_TYPE);
		valueTypeTypeEEnum = createEEnum(VALUE_TYPE_TYPE);
		valueTypeType1EEnum = createEEnum(VALUE_TYPE_TYPE1);

		// Create data types
		conversionModeTypeObjectEDataType = createEDataType(CONVERSION_MODE_TYPE_OBJECT);
		valueTypeTypeObjectEDataType = createEDataType(VALUE_TYPE_TYPE_OBJECT);
		valueTypeTypeObject1EDataType = createEDataType(VALUE_TYPE_TYPE_OBJECT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TextPackage theTextPackage = (TextPackage)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		DrawingPackage theDrawingPackage = (DrawingPackage)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI);
		PresentationPackage thePresentationPackage = (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);
		StylePackage theStylePackage = (StylePackage)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);
		DatastylePackage theDatastylePackage = (DatastylePackage)EPackage.Registry.INSTANCE.getEPackage(DatastylePackage.eNS_URI);
		TablePackage theTablePackage = (TablePackage)EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI);
		ScriptPackage theScriptPackage = (ScriptPackage)EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI);
		FormPackage theFormPackage = (FormPackage)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);
		ConfigPackage theConfigPackage = (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);
		SvgPackage theSvgPackage = (SvgPackage)EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI);
		Dr3dPackage theDr3dPackage = (Dr3dPackage)EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentMetaTypeEClass.getESuperTypes().add(theTextPackage.getOfficeMeta());
		documentTypeEClass.getESuperTypes().add(theTextPackage.getOfficeMeta());

		// Initialize classes and features; add operations and parameters
		initEClass(annotationTypeEClass, AnnotationType.class, "AnnotationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationType_Creator(), theTextPackage.getString(), "creator", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Date(), theTextPackage.getDateTime(), "date", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_DateString(), theTextPackage.getString(), "dateString", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationType_P(), theTextPackage.getPType(), null, "p", null, 0, -1, AnnotationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationType_List(), theTextPackage.getListType(), null, "list", null, 0, -1, AnnotationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_AnchorPageNumber(), theTextPackage.getPositiveInteger(), "anchorPageNumber", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_AnchorType(), theTextPackage.getAnchorTypeType(), "anchorType", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_CaptionPointX(), theTextPackage.getCoordinate(), "captionPointX", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_CaptionPointY(), theTextPackage.getCoordinate(), "captionPointY", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_ClassNames(), theTextPackage.getStyleNameRefs(), "classNames", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_ClassNames1(), theTextPackage.getStyleNameRefs(), "classNames1", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_CornerRadius(), theTextPackage.getNonNegativeLength(), "cornerRadius", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Display(), theTextPackage.getBoolean(), "display", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_EndCellAddress(), theTextPackage.getCellAddress(), "endCellAddress", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_EndX(), theTextPackage.getCoordinate(), "endX", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_EndY(), theTextPackage.getCoordinate(), "endY", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Height(), theTextPackage.getLength(), "height", null, 1, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Id(), theTextPackage.getID(), "id", null, 1, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Layer(), theXMLTypePackage.getString(), "layer", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Name(), theTextPackage.getString(), "name", null, 1, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_StyleName(), theDrawingPackage.getStyleNameType(), "styleName", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_StyleName1(), thePresentationPackage.getStyleNameType(), "styleName1", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_TableBackground(), theTextPackage.getBoolean(), "tableBackground", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_TextStyleName(), theDrawingPackage.getTextStyleNameType(), "textStyleName", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Transform(), theTextPackage.getString(), "transform", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Width(), theTextPackage.getLength(), "width", null, 1, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_X(), theTextPackage.getCoordinate(), "x", null, 1, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_Y(), theTextPackage.getCoordinate(), "y", null, 1, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationType_ZIndex(), theTextPackage.getNonNegativeInteger(), "zIndex", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automaticStylesTypeEClass, AutomaticStylesType.class, "AutomaticStylesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomaticStylesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AutomaticStylesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_Style(), theStylePackage.getStyleType1(), null, "style", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_ListStyle(), theTextPackage.getListStyleType(), null, "listStyle", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_NumberStyle(), theDatastylePackage.getNumberStyleType(), null, "numberStyle", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_CurrencyStyle(), theDatastylePackage.getCurrencyStyleType(), null, "currencyStyle", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_PercentageStyle(), theDatastylePackage.getPercentageStyleType(), null, "percentageStyle", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_DateStyle(), theDatastylePackage.getDateStyleType(), null, "dateStyle", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_TimeStyle(), theDatastylePackage.getTimeStyleType(), null, "timeStyle", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_BooleanStyle(), theDatastylePackage.getBooleanStyleType(), null, "booleanStyle", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_TextStyle(), theDatastylePackage.getTextStyleType(), null, "textStyle", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticStylesType_PageLayout(), theStylePackage.getPageLayoutType(), null, "pageLayout", null, 0, -1, AutomaticStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(changeInfoTypeEClass, ChangeInfoType.class, "ChangeInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeInfoType_Creator(), theTextPackage.getString(), "creator", null, 1, 1, ChangeInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeInfoType_Date(), theTextPackage.getDateTime(), "date", null, 1, 1, ChangeInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeInfoType_P(), theTextPackage.getPType(), null, "p", null, 0, -1, ChangeInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chartTypeEClass, ChartType.class, "ChartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChartType_VariableDecls(), theTextPackage.getVariableDeclsType(), null, "variableDecls", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_SequenceDecls(), theTextPackage.getSequenceDeclsType(), null, "sequenceDecls", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_UserFieldDecls(), theTextPackage.getUserFieldDeclsType(), null, "userFieldDecls", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_DdeConnectionDecls(), theTextPackage.getDdeConnectionDeclsType(), null, "ddeConnectionDecls", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_AlphabeticalIndexAutoMarkFile(), theTextPackage.getAlphabeticalIndexAutoMarkFileType(), null, "alphabeticalIndexAutoMarkFile", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_CalculationSettings(), theTablePackage.getCalculationSettingsType(), null, "calculationSettings", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_ContentValidations(), theTablePackage.getContentValidationsType(), null, "contentValidations", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_LabelRanges(), theTablePackage.getLabelRangesType(), null, "labelRanges", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChartType_OfficeChartContentMainGroup(), ecorePackage.getEFeatureMapEntry(), "officeChartContentMainGroup", null, 1, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_OfficeChartContentMain(), theTextPackage.getOfficeChartContentMainType(), null, "officeChartContentMain", null, 1, 1, ChartType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_NamedExpressions(), theTablePackage.getNamedExpressionsType(), null, "namedExpressions", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_DatabaseRanges(), theTablePackage.getDatabaseRangesType(), null, "databaseRanges", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_DataPilotTables(), theTablePackage.getDataPilotTablesType(), null, "dataPilotTables", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_Consolidation(), theTablePackage.getConsolidationType(), null, "consolidation", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChartType_DdeLinks(), theTablePackage.getDdeLinksType(), null, "ddeLinks", null, 0, 1, ChartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentContentTypeEClass, DocumentContentType.class, "DocumentContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentContentType_Scripts(), this.getScriptsType(), null, "scripts", null, 0, 1, DocumentContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentContentType_FontFaceDecls(), this.getFontFaceDeclsType(), null, "fontFaceDecls", null, 0, 1, DocumentContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentContentType_AutomaticStyles(), this.getAutomaticStylesType(), null, "automaticStyles", null, 0, 1, DocumentContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentContentType_Body(), theTextPackage.getOfficeBodyContent(), null, "body", null, 1, 1, DocumentContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentContentType_Version(), theTextPackage.getString(), "version", null, 0, 1, DocumentContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentMetaTypeEClass, DocumentMetaType.class, "DocumentMetaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentMetaType_Version(), theTextPackage.getString(), "version", null, 0, 1, DocumentMetaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentSettingsTypeEClass, DocumentSettingsType.class, "DocumentSettingsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentSettingsType_Settings(), this.getSettingsType(), null, "settings", null, 0, 1, DocumentSettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentSettingsType_Version(), theTextPackage.getString(), "version", null, 0, 1, DocumentSettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentStylesTypeEClass, DocumentStylesType.class, "DocumentStylesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentStylesType_FontFaceDecls(), this.getFontFaceDeclsType(), null, "fontFaceDecls", null, 0, 1, DocumentStylesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentStylesType_Styles(), this.getStylesType(), null, "styles", null, 0, 1, DocumentStylesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentStylesType_AutomaticStyles(), this.getAutomaticStylesType(), null, "automaticStyles", null, 0, 1, DocumentStylesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentStylesType_MasterStyles(), this.getMasterStylesType(), null, "masterStyles", null, 0, 1, DocumentStylesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStylesType_Version(), theTextPackage.getString(), "version", null, 0, 1, DocumentStylesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentTypeEClass, DocumentType.class, "DocumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentType_Settings(), this.getSettingsType(), null, "settings", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentType_Scripts(), this.getScriptsType(), null, "scripts", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentType_FontFaceDecls(), this.getFontFaceDeclsType(), null, "fontFaceDecls", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentType_Styles(), this.getStylesType(), null, "styles", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentType_AutomaticStyles(), this.getAutomaticStylesType(), null, "automaticStyles", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentType_MasterStyles(), this.getMasterStylesType(), null, "masterStyles", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentType_Body(), theTextPackage.getOfficeBodyContent(), null, "body", null, 1, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentType_Mimetype(), theTextPackage.getString(), "mimetype", null, 1, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentType_Version(), theTextPackage.getString(), "version", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drawingTypeEClass, DrawingType.class, "DrawingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrawingType_VariableDecls(), theTextPackage.getVariableDeclsType(), null, "variableDecls", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_SequenceDecls(), theTextPackage.getSequenceDeclsType(), null, "sequenceDecls", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_UserFieldDecls(), theTextPackage.getUserFieldDeclsType(), null, "userFieldDecls", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_DdeConnectionDecls(), theTextPackage.getDdeConnectionDeclsType(), null, "ddeConnectionDecls", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_AlphabeticalIndexAutoMarkFile(), theTextPackage.getAlphabeticalIndexAutoMarkFileType(), null, "alphabeticalIndexAutoMarkFile", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_CalculationSettings(), theTablePackage.getCalculationSettingsType(), null, "calculationSettings", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_ContentValidations(), theTablePackage.getContentValidationsType(), null, "contentValidations", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_LabelRanges(), theTablePackage.getLabelRangesType(), null, "labelRanges", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_Page(), theDrawingPackage.getPageType(), null, "page", null, 0, -1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_NamedExpressions(), theTablePackage.getNamedExpressionsType(), null, "namedExpressions", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_DatabaseRanges(), theTablePackage.getDatabaseRangesType(), null, "databaseRanges", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_DataPilotTables(), theTablePackage.getDataPilotTablesType(), null, "dataPilotTables", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_Consolidation(), theTablePackage.getConsolidationType(), null, "consolidation", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrawingType_DdeLinks(), theTablePackage.getDdeLinksType(), null, "ddeLinks", null, 0, 1, DrawingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventListenersTypeEClass, EventListenersType.class, "EventListenersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventListenersType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EventListenersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventListenersType_EventListener(), theScriptPackage.getEventListenerType(), null, "eventListener", null, 0, -1, EventListenersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEventListenersType_EventListener1(), thePresentationPackage.getEventListenerType(), null, "eventListener1", null, 0, -1, EventListenersType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fontFaceDeclsTypeEClass, FontFaceDeclsType.class, "FontFaceDeclsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFontFaceDeclsType_FontFace(), theStylePackage.getFontFaceType(), null, "fontFace", null, 0, -1, FontFaceDeclsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formsTypeEClass, FormsType.class, "FormsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FormsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormsType_Form(), theFormPackage.getFormType(), null, "form", null, 0, -1, FormsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormsType_Model(), theTextPackage.getAnyAttListOrElements(), null, "model", null, 0, -1, FormsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormsType_ApplyDesignMode(), theTextPackage.getBoolean(), "applyDesignMode", "true", 0, 1, FormsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormsType_AutomaticFocus(), theTextPackage.getBoolean(), "automaticFocus", "false", 0, 1, FormsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterStylesTypeEClass, MasterStylesType.class, "MasterStylesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMasterStylesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, MasterStylesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterStylesType_MasterPage(), theStylePackage.getMasterPageType(), null, "masterPage", null, 0, -1, MasterStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMasterStylesType_HandoutMaster(), theStylePackage.getHandoutMasterType(), null, "handoutMaster", null, 0, -1, MasterStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMasterStylesType_LayerSet(), theDrawingPackage.getLayerSetType(), null, "layerSet", null, 0, -1, MasterStylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(presentationTypeEClass, PresentationType.class, "PresentationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationType_VariableDecls(), theTextPackage.getVariableDeclsType(), null, "variableDecls", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_SequenceDecls(), theTextPackage.getSequenceDeclsType(), null, "sequenceDecls", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_UserFieldDecls(), theTextPackage.getUserFieldDeclsType(), null, "userFieldDecls", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_DdeConnectionDecls(), theTextPackage.getDdeConnectionDeclsType(), null, "ddeConnectionDecls", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_AlphabeticalIndexAutoMarkFile(), theTextPackage.getAlphabeticalIndexAutoMarkFileType(), null, "alphabeticalIndexAutoMarkFile", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_CalculationSettings(), theTablePackage.getCalculationSettingsType(), null, "calculationSettings", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_ContentValidations(), theTablePackage.getContentValidationsType(), null, "contentValidations", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_LabelRanges(), theTablePackage.getLabelRangesType(), null, "labelRanges", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationType_PresentationDeclGroup(), ecorePackage.getEFeatureMapEntry(), "presentationDeclGroup", null, 0, -1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_PresentationDecl(), ecorePackage.getEObject(), null, "presentationDecl", null, 0, -1, PresentationType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_Page(), theDrawingPackage.getPageType(), null, "page", null, 0, -1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_Settings(), thePresentationPackage.getSettingsType(), null, "settings", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_NamedExpressions(), theTablePackage.getNamedExpressionsType(), null, "namedExpressions", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_DatabaseRanges(), theTablePackage.getDatabaseRangesType(), null, "databaseRanges", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_DataPilotTables(), theTablePackage.getDataPilotTablesType(), null, "dataPilotTables", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_Consolidation(), theTablePackage.getConsolidationType(), null, "consolidation", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationType_DdeLinks(), theTablePackage.getDdeLinksType(), null, "ddeLinks", null, 0, 1, PresentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptsTypeEClass, ScriptsType.class, "ScriptsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScriptsType_Script(), this.getScriptType(), null, "script", null, 0, -1, ScriptsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScriptsType_EventListeners(), this.getEventListenersType(), null, "eventListeners", null, 0, 1, ScriptsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptTypeEClass, ScriptType.class, "ScriptType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ScriptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ScriptType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptType_Language(), theTextPackage.getString(), "language", null, 1, 1, ScriptType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingsTypeEClass, SettingsType.class, "SettingsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSettingsType_ConfigItemSet(), theConfigPackage.getConfigItemSetType(), null, "configItemSet", null, 1, -1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spreadsheetTypeEClass, SpreadsheetType.class, "SpreadsheetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpreadsheetType_TrackedChanges(), theTablePackage.getTrackedChangesType(), null, "trackedChanges", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_VariableDecls(), theTextPackage.getVariableDeclsType(), null, "variableDecls", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_SequenceDecls(), theTextPackage.getSequenceDeclsType(), null, "sequenceDecls", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_UserFieldDecls(), theTextPackage.getUserFieldDeclsType(), null, "userFieldDecls", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_DdeConnectionDecls(), theTextPackage.getDdeConnectionDeclsType(), null, "ddeConnectionDecls", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_AlphabeticalIndexAutoMarkFile(), theTextPackage.getAlphabeticalIndexAutoMarkFileType(), null, "alphabeticalIndexAutoMarkFile", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_CalculationSettings(), theTablePackage.getCalculationSettingsType(), null, "calculationSettings", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_ContentValidations(), theTablePackage.getContentValidationsType(), null, "contentValidations", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_LabelRanges(), theTablePackage.getLabelRangesType(), null, "labelRanges", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_Table(), theTablePackage.getTableType(), null, "table", null, 0, -1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_NamedExpressions(), theTablePackage.getNamedExpressionsType(), null, "namedExpressions", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_DatabaseRanges(), theTablePackage.getDatabaseRangesType(), null, "databaseRanges", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_DataPilotTables(), theTablePackage.getDataPilotTablesType(), null, "dataPilotTables", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_Consolidation(), theTablePackage.getConsolidationType(), null, "consolidation", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpreadsheetType_DdeLinks(), theTablePackage.getDdeLinksType(), null, "ddeLinks", null, 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetType_ProtectionKey(), theTextPackage.getString(), "protectionKey", null, 1, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpreadsheetType_StructureProtected(), theTextPackage.getBoolean(), "structureProtected", "false", 0, 1, SpreadsheetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stylesTypeEClass, StylesType.class, "StylesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStylesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, StylesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_Style(), theStylePackage.getStyleType1(), null, "style", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_ListStyle(), theTextPackage.getListStyleType(), null, "listStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_NumberStyle(), theDatastylePackage.getNumberStyleType(), null, "numberStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_CurrencyStyle(), theDatastylePackage.getCurrencyStyleType(), null, "currencyStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_PercentageStyle(), theDatastylePackage.getPercentageStyleType(), null, "percentageStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_DateStyle(), theDatastylePackage.getDateStyleType(), null, "dateStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_TimeStyle(), theDatastylePackage.getTimeStyleType(), null, "timeStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_BooleanStyle(), theDatastylePackage.getBooleanStyleType(), null, "booleanStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_TextStyle(), theDatastylePackage.getTextStyleType(), null, "textStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_DefaultStyle(), theTextPackage.getStyleStyleContent(), null, "defaultStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_OutlineStyle(), theTextPackage.getOutlineStyleType(), null, "outlineStyle", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_NotesConfiguration(), theTextPackage.getTextNotesConfigurationContent(), null, "notesConfiguration", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_BibliographyConfiguration(), theTextPackage.getBibliographyConfigurationType(), null, "bibliographyConfiguration", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_LinenumberingConfiguration(), theTextPackage.getLinenumberingConfigurationType(), null, "linenumberingConfiguration", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_Gradient(), theDrawingPackage.getGradientType(), null, "gradient", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_LinearGradient(), theSvgPackage.getLinearGradientType(), null, "linearGradient", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_RadialGradient(), theSvgPackage.getRadialGradientType(), null, "radialGradient", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_Hatch(), theDrawingPackage.getHatchType(), null, "hatch", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_FillImage(), theDrawingPackage.getFillImageType(), null, "fillImage", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_Marker(), theDrawingPackage.getMarkerType(), null, "marker", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_StrokeDash(), theDrawingPackage.getStrokeDashType1(), null, "strokeDash", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_Opacity(), theDrawingPackage.getOpacityType(), null, "opacity", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStylesType_PresentationPageLayout(), theStylePackage.getPresentationPageLayoutType(), null, "presentationPageLayout", null, 0, -1, StylesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(textTypeEClass, TextType.class, "TextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextType_Forms(), this.getFormsType(), null, "forms", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_TrackedChanges(), theTextPackage.getTrackedChangesType(), null, "trackedChanges", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_VariableDecls(), theTextPackage.getVariableDeclsType(), null, "variableDecls", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_SequenceDecls(), theTextPackage.getSequenceDeclsType(), null, "sequenceDecls", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_UserFieldDecls(), theTextPackage.getUserFieldDeclsType(), null, "userFieldDecls", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_DdeConnectionDecls(), theTextPackage.getDdeConnectionDeclsType(), null, "ddeConnectionDecls", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_AlphabeticalIndexAutoMarkFile(), theTextPackage.getAlphabeticalIndexAutoMarkFileType(), null, "alphabeticalIndexAutoMarkFile", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_CalculationSettings(), theTablePackage.getCalculationSettingsType(), null, "calculationSettings", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_ContentValidations(), theTablePackage.getContentValidationsType(), null, "contentValidations", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_LabelRanges(), theTablePackage.getLabelRangesType(), null, "labelRanges", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_OfficeTextContentMain(), ecorePackage.getEFeatureMapEntry(), "officeTextContentMain", null, 0, -1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_H(), theTextPackage.getHType(), null, "h", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_P(), theTextPackage.getPType(), null, "p", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_List(), theTextPackage.getListType(), null, "list", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_NumberedParagraph(), theTextPackage.getNumberedParagraphType(), null, "numberedParagraph", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Table(), theTablePackage.getTableType(), null, "table", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_A(), theDrawingPackage.getAType(), null, "a", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Section(), theTextPackage.getSectionType(), null, "section", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_SoftPageBreak(), theTextPackage.getSoftPageBreakType(), null, "softPageBreak", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_TableOfContent(), theTextPackage.getTableOfContentType(), null, "tableOfContent", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_IllustrationIndex(), theTextPackage.getIllustrationIndexType(), null, "illustrationIndex", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_TableIndex(), theTextPackage.getTableIndexType(), null, "tableIndex", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_ObjectIndex(), theTextPackage.getObjectIndexType(), null, "objectIndex", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_UserIndex(), theTextPackage.getUserIndexType(), null, "userIndex", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_AlphabeticalIndex(), theTextPackage.getAlphabeticalIndexType(), null, "alphabeticalIndex", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Bibliography(), theTextPackage.getBibliographyType(), null, "bibliography", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Rect(), theDrawingPackage.getRectType(), null, "rect", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Line(), theDrawingPackage.getLineType(), null, "line", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Polyline(), theDrawingPackage.getPolylineType(), null, "polyline", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Polygon(), theDrawingPackage.getPolygonType(), null, "polygon", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_RegularPolygon(), theDrawingPackage.getRegularPolygonType(), null, "regularPolygon", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Path(), theDrawingPackage.getPathType(), null, "path", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Circle(), theDrawingPackage.getCircleType(), null, "circle", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Ellipse(), theDrawingPackage.getEllipseType(), null, "ellipse", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_G(), theDrawingPackage.getGType(), null, "g", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_PageThumbnail(), theDrawingPackage.getPageThumbnailType(), null, "pageThumbnail", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Frame(), theDrawingPackage.getFrameType(), null, "frame", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Measure(), theDrawingPackage.getMeasureType(), null, "measure", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Caption(), theDrawingPackage.getCaptionType(), null, "caption", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Connector(), theDrawingPackage.getConnectorType(), null, "connector", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Control(), theDrawingPackage.getControlType(), null, "control", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Scene(), theDr3dPackage.getSceneType(), null, "scene", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_CustomShape(), theDrawingPackage.getCustomShapeType(), null, "customShape", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_ChangeMarksGroup(), ecorePackage.getEFeatureMapEntry(), "changeMarksGroup", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_ChangeMarks(), theTextPackage.getChangeMarksType(), null, "changeMarks", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_PageSequence(), theTextPackage.getPageSequenceType(), null, "pageSequence", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_A1(), theDrawingPackage.getAType(), null, "a1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Rect1(), theDrawingPackage.getRectType(), null, "rect1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Line1(), theDrawingPackage.getLineType(), null, "line1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Polyline1(), theDrawingPackage.getPolylineType(), null, "polyline1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Polygon1(), theDrawingPackage.getPolygonType(), null, "polygon1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_RegularPolygon1(), theDrawingPackage.getRegularPolygonType(), null, "regularPolygon1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Path1(), theDrawingPackage.getPathType(), null, "path1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Circle1(), theDrawingPackage.getCircleType(), null, "circle1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Ellipse1(), theDrawingPackage.getEllipseType(), null, "ellipse1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_G1(), theDrawingPackage.getGType(), null, "g1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_PageThumbnail1(), theDrawingPackage.getPageThumbnailType(), null, "pageThumbnail1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Frame1(), theDrawingPackage.getFrameType(), null, "frame1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Measure1(), theDrawingPackage.getMeasureType(), null, "measure1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Caption1(), theDrawingPackage.getCaptionType(), null, "caption1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Connector1(), theDrawingPackage.getConnectorType(), null, "connector1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Control1(), theDrawingPackage.getControlType(), null, "control1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Scene1(), theDr3dPackage.getSceneType(), null, "scene1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_CustomShape1(), theDrawingPackage.getCustomShapeType(), null, "customShape1", null, 0, -1, TextType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_NamedExpressions(), theTablePackage.getNamedExpressionsType(), null, "namedExpressions", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_DatabaseRanges(), theTablePackage.getDatabaseRangesType(), null, "databaseRanges", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_DataPilotTables(), theTablePackage.getDataPilotTablesType(), null, "dataPilotTables", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_Consolidation(), theTablePackage.getConsolidationType(), null, "consolidation", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextType_DdeLinks(), theTablePackage.getDdeLinksType(), null, "ddeLinks", null, 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_Global(), theTextPackage.getBoolean(), "global", "false", 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextType_UseSoftPageBreaks(), theTextPackage.getBoolean(), "useSoftPageBreaks", "false", 0, 1, TextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Annotation(), this.getAnnotationType(), null, "annotation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AutomaticStyles(), this.getAutomaticStylesType(), null, "automaticStyles", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BinaryData(), theTextPackage.getBase64Binary(), "binaryData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Body(), theTextPackage.getOfficeBodyContent(), null, "body", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeInfo(), this.getChangeInfoType(), null, "changeInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Chart(), this.getChartType(), null, "chart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DdeSource(), theTextPackage.getTextSectionSourceDdeType(), null, "ddeSource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Document(), this.getDocumentType(), null, "document", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DocumentContent(), this.getDocumentContentType(), null, "documentContent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DocumentMeta(), this.getDocumentMetaType(), null, "documentMeta", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DocumentSettings(), this.getDocumentSettingsType(), null, "documentSettings", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DocumentStyles(), this.getDocumentStylesType(), null, "documentStyles", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Drawing(), this.getDrawingType(), null, "drawing", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EventListeners(), this.getEventListenersType(), null, "eventListeners", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FontFaceDecls(), this.getFontFaceDeclsType(), null, "fontFaceDecls", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Forms(), this.getFormsType(), null, "forms", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Image(), theTextPackage.getOfficeImageContentMain(), null, "image", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MasterStyles(), this.getMasterStylesType(), null, "masterStyles", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Meta(), theTextPackage.getOfficeMetaContent(), null, "meta", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Presentation(), this.getPresentationType(), null, "presentation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Script(), this.getScriptType(), null, "script", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Scripts(), this.getScriptsType(), null, "scripts", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Settings(), this.getSettingsType(), null, "settings", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Spreadsheet(), this.getSpreadsheetType(), null, "spreadsheet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Styles(), this.getStylesType(), null, "styles", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Text(), this.getTextType(), null, "text", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AutomaticUpdate(), theTextPackage.getBoolean(), "automaticUpdate", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BooleanValue(), theTextPackage.getBoolean(), "booleanValue", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ConversionMode(), this.getConversionModeType(), "conversionMode", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Currency(), theTextPackage.getString(), "currency", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DateValue(), theTextPackage.getDateOrDateTime(), "dateValue", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DdeApplication(), theTextPackage.getString(), "ddeApplication", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DdeItem(), theTextPackage.getString(), "ddeItem", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DdeTopic(), theTextPackage.getString(), "ddeTopic", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Display(), theTextPackage.getBoolean(), "display", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Mimetype(), theTextPackage.getString(), "mimetype", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name(), theTextPackage.getString(), "name", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ProcessContent(), theTextPackage.getBoolean(), "processContent", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ServerMap(), theTextPackage.getBoolean(), "serverMap", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StringValue(), theTextPackage.getString(), "stringValue", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TargetFrame(), theTextPackage.getTargetFrameName(), "targetFrame", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TargetFrameName(), theTextPackage.getTargetFrameName(), "targetFrameName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TimeValue(), theTextPackage.getDuration(), "timeValue", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Title(), theTextPackage.getString(), "title", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Value(), theTextPackage.getDouble(), "value", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Version(), theTextPackage.getString(), "version", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(conversionModeTypeEEnum, ConversionModeType.class, "ConversionModeType");
		addEEnumLiteral(conversionModeTypeEEnum, ConversionModeType.INTO_DEFAULT_STYLE_DATA_STYLE);
		addEEnumLiteral(conversionModeTypeEEnum, ConversionModeType.INTO_ENGLISH_NUMBER);
		addEEnumLiteral(conversionModeTypeEEnum, ConversionModeType.KEEP_TEXT);

		initEEnum(valueTypeTypeEEnum, ValueTypeType.class, "ValueTypeType");
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.FLOAT);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.PERCENTAGE);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.CURRENCY);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.DATE);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.TIME);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.BOOLEAN);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.STRING);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.VOID);

		initEEnum(valueTypeType1EEnum, ValueTypeType1.class, "ValueTypeType1");
		addEEnumLiteral(valueTypeType1EEnum, ValueTypeType1.FLOAT);
		addEEnumLiteral(valueTypeType1EEnum, ValueTypeType1.PERCENTAGE);
		addEEnumLiteral(valueTypeType1EEnum, ValueTypeType1.CURRENCY);
		addEEnumLiteral(valueTypeType1EEnum, ValueTypeType1.DATE);
		addEEnumLiteral(valueTypeType1EEnum, ValueTypeType1.TIME);
		addEEnumLiteral(valueTypeType1EEnum, ValueTypeType1.BOOLEAN);
		addEEnumLiteral(valueTypeType1EEnum, ValueTypeType1.STRING);

		// Initialize data types
		initEDataType(conversionModeTypeObjectEDataType, ConversionModeType.class, "ConversionModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valueTypeTypeObjectEDataType, ValueTypeType.class, "ValueTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valueTypeTypeObject1EDataType, ValueTypeType1.class, "ValueTypeTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (annotationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "annotation_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAnnotationType_Creator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creator",
			 "namespace", "http://purl.org/dc/elements/1.1/"
		   });		
		addAnnotation
		  (getAnnotationType_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "http://purl.org/dc/elements/1.1/"
		   });		
		addAnnotation
		  (getAnnotationType_DateString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date-string",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:meta:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });		
		addAnnotation
		  (getAnnotationType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getAnnotationType_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#group:3"
		   });		
		addAnnotation
		  (getAnnotationType_AnchorPageNumber(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "anchor-page-number",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_AnchorType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "anchor-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_CaptionPointX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "caption-point-x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_CaptionPointY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "caption-point-y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_ClassNames(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_ClassNames1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_CornerRadius(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "corner-radius",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_Display(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnnotationType_EndCellAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end-cell-address",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_EndX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end-x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_EndY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end-y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_Layer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "layer",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_StyleName1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_TableBackground(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "table-background",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_TextStyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "text-style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transform",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getAnnotationType_ZIndex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "z-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (automaticStylesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "automatic-styles_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAutomaticStylesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_Style(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_ListStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_NumberStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_CurrencyStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_PercentageStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "percentage-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_DateStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_TimeStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_BooleanStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_TextStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAutomaticStylesType_PageLayout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page-layout",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (changeInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "change-info_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChangeInfoType_Creator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creator",
			 "namespace", "http://purl.org/dc/elements/1.1/"
		   });		
		addAnnotation
		  (getChangeInfoType_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "http://purl.org/dc/elements/1.1/"
		   });		
		addAnnotation
		  (getChangeInfoType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (chartTypeEClass, 
		   source, 
		   new String[] {
			 "name", "chart_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChartType_VariableDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getChartType_SequenceDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getChartType_UserFieldDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "user-field-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getChartType_DdeConnectionDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-connection-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getChartType_AlphabeticalIndexAutoMarkFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "alphabetical-index-auto-mark-file",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getChartType_CalculationSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "calculation-settings",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getChartType_ContentValidations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content-validations",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getChartType_LabelRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getChartType_OfficeChartContentMainGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "office-chart-content-main:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getChartType_OfficeChartContentMain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "office-chart-content-main",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-chart-content-main:group"
		   });		
		addAnnotation
		  (getChartType_NamedExpressions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-expressions",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getChartType_DatabaseRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "database-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getChartType_DataPilotTables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data-pilot-tables",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getChartType_Consolidation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "consolidation",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getChartType_DdeLinks(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-links",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (conversionModeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "conversion-mode_._type"
		   });		
		addAnnotation
		  (conversionModeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "conversion-mode_._type:Object",
			 "baseType", "conversion-mode_._type"
		   });		
		addAnnotation
		  (documentContentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "document-content_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentContentType_Scripts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scripts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentContentType_FontFaceDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-decls",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentContentType_AutomaticStyles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "automatic-styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentContentType_Body(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "body",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentContentType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentMetaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "document-meta_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentMetaType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentSettingsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "document-settings_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentSettingsType_Settings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "settings",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentSettingsType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentStylesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "document-styles_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentStylesType_FontFaceDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-decls",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStylesType_Styles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStylesType_AutomaticStyles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "automatic-styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStylesType_MasterStyles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "master-styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStylesType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "document_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentType_Settings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "settings",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentType_Scripts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scripts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentType_FontFaceDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-decls",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentType_Styles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentType_AutomaticStyles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "automatic-styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentType_MasterStyles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "master-styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentType_Body(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "body",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentType_Mimetype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimetype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (drawingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "drawing_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDrawingType_VariableDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getDrawingType_SequenceDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getDrawingType_UserFieldDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "user-field-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getDrawingType_DdeConnectionDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-connection-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getDrawingType_AlphabeticalIndexAutoMarkFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "alphabetical-index-auto-mark-file",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getDrawingType_CalculationSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "calculation-settings",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getDrawingType_ContentValidations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content-validations",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getDrawingType_LabelRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getDrawingType_Page(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getDrawingType_NamedExpressions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-expressions",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getDrawingType_DatabaseRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "database-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getDrawingType_DataPilotTables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data-pilot-tables",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getDrawingType_Consolidation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "consolidation",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getDrawingType_DdeLinks(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-links",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (eventListenersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "event-listeners_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEventListenersType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getEventListenersType_EventListener(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "event-listener",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:script:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEventListenersType_EventListener1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "event-listener",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (fontFaceDeclsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "font-face-decls_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFontFaceDeclsType_FontFace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (formsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "forms_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFormsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getFormsType_Form(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "form",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:form:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormsType_Model(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "model",
			 "namespace", "http://www.w3.org/2002/xforms",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormsType_ApplyDesignMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "apply-design-mode",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:form:1.0"
		   });		
		addAnnotation
		  (getFormsType_AutomaticFocus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "automatic-focus",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:form:1.0"
		   });		
		addAnnotation
		  (masterStylesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "master-styles_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMasterStylesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getMasterStylesType_MasterPage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "master-page",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getMasterStylesType_HandoutMaster(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "handout-master",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getMasterStylesType_LayerSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "layer-set",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (presentationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "presentation_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPresentationType_VariableDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getPresentationType_SequenceDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getPresentationType_UserFieldDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "user-field-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getPresentationType_DdeConnectionDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-connection-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getPresentationType_AlphabeticalIndexAutoMarkFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "alphabetical-index-auto-mark-file",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getPresentationType_CalculationSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "calculation-settings",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getPresentationType_ContentValidations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content-validations",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getPresentationType_LabelRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getPresentationType_PresentationDeclGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "presentation-decl:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getPresentationType_PresentationDecl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "presentation-decl",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-decl:group"
		   });		
		addAnnotation
		  (getPresentationType_Page(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getPresentationType_Settings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "settings",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getPresentationType_NamedExpressions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-expressions",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getPresentationType_DatabaseRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "database-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getPresentationType_DataPilotTables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data-pilot-tables",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getPresentationType_Consolidation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "consolidation",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getPresentationType_DdeLinks(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-links",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (scriptsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "scripts_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getScriptsType_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "script",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScriptsType_EventListeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "event-listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (scriptTypeEClass, 
		   source, 
		   new String[] {
			 "name", "script_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getScriptType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getScriptType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "skip"
		   });		
		addAnnotation
		  (getScriptType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:script:1.0"
		   });		
		addAnnotation
		  (settingsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "settings_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSettingsType_ConfigItemSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "config-item-set",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:config:1.0"
		   });		
		addAnnotation
		  (spreadsheetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "spreadsheet_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpreadsheetType_TrackedChanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tracked-changes",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_VariableDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_SequenceDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_UserFieldDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "user-field-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_DdeConnectionDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-connection-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_AlphabeticalIndexAutoMarkFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "alphabetical-index-auto-mark-file",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_CalculationSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "calculation-settings",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_ContentValidations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content-validations",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_LabelRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_NamedExpressions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-expressions",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_DatabaseRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "database-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_DataPilotTables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data-pilot-tables",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_Consolidation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "consolidation",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_DdeLinks(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-links",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_ProtectionKey(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "protection-key",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSpreadsheetType_StructureProtected(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "structure-protected",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (stylesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "styles_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStylesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getStylesType_Style(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_ListStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_NumberStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_CurrencyStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_PercentageStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "percentage-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_DateStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_TimeStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_BooleanStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_TextStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_DefaultStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "default-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_OutlineStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "outline-style",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_NotesConfiguration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "notes-configuration",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_BibliographyConfiguration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bibliography-configuration",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_LinenumberingConfiguration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "linenumbering-configuration",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_Gradient(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "gradient",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_LinearGradient(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "linearGradient",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_RadialGradient(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "radialGradient",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_Hatch(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hatch",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_FillImage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fill-image",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_Marker(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "marker",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_StrokeDash(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stroke-dash",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_Opacity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "opacity",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStylesType_PresentationPageLayout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "presentation-page-layout",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (textTypeEClass, 
		   source, 
		   new String[] {
			 "name", "text_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTextType_Forms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "forms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextType_TrackedChanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tracked-changes",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getTextType_VariableDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variable-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getTextType_SequenceDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getTextType_UserFieldDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "user-field-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getTextType_DdeConnectionDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-connection-decls",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getTextType_AlphabeticalIndexAutoMarkFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "alphabetical-index-auto-mark-file",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getTextType_CalculationSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "calculation-settings",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getTextType_ContentValidations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content-validations",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getTextType_LabelRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "label-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getTextType_OfficeTextContentMain(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_H(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_List(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "list",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_NumberedParagraph(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "numbered-paragraph",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_A(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "a",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Section(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "section",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_SoftPageBreak(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "soft-page-break",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_TableOfContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table-of-content",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_IllustrationIndex(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "illustration-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_TableIndex(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_ObjectIndex(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_UserIndex(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "user-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_AlphabeticalIndex(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "alphabetical-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Bibliography(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bibliography",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Rect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rect",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Line(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "line",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Polyline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "polyline",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Polygon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "polygon",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_RegularPolygon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "regular-polygon",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Path(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "path",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Circle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "circle",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Ellipse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ellipse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_G(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "g",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_PageThumbnail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page-thumbnail",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Frame(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "frame",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Measure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Caption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "caption",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Connector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connector",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Control(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "control",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Scene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scene",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_CustomShape(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "custom-shape",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_ChangeMarksGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "change-marks:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_ChangeMarks(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "change-marks",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#change-marks:group"
		   });		
		addAnnotation
		  (getTextType_PageSequence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page-sequence",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_A1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "a",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Rect1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rect",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Line1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "line",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Polyline1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "polyline",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Polygon1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "polygon",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_RegularPolygon1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "regular-polygon",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Path1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "path",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Circle1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "circle",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Ellipse1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ellipse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_G1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "g",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_PageThumbnail1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page-thumbnail",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Frame1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "frame",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Measure1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Caption1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "caption",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Connector1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connector",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Control1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "control",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_Scene1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scene",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_CustomShape1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "custom-shape",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#OfficeTextContentMain:10"
		   });		
		addAnnotation
		  (getTextType_NamedExpressions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "named-expressions",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getTextType_DatabaseRanges(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "database-ranges",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getTextType_DataPilotTables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data-pilot-tables",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getTextType_Consolidation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "consolidation",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getTextType_DdeLinks(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-links",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getTextType_Global(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "global",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getTextType_UseSoftPageBreaks(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-soft-page-breaks",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (valueTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "value-type_._1_._type"
		   });		
		addAnnotation
		  (valueTypeType1EEnum, 
		   source, 
		   new String[] {
			 "name", "value-type_._type"
		   });		
		addAnnotation
		  (valueTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "value-type_._1_._type:Object",
			 "baseType", "value-type_._1_._type"
		   });		
		addAnnotation
		  (valueTypeTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "value-type_._type:Object",
			 "baseType", "value-type_._type"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Annotation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "annotation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AutomaticStyles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "automatic-styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BinaryData(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "binary-data",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Body(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "body",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "change-info",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Chart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "chart",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-body-content"
		   });		
		addAnnotation
		  (getDocumentRoot_DdeSource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dde-source",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#text-section-source-dde"
		   });		
		addAnnotation
		  (getDocumentRoot_Document(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "document",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DocumentContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "document-content",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DocumentMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "document-meta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DocumentSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "document-settings",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DocumentStyles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "document-styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Drawing(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "drawing",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-body-content"
		   });		
		addAnnotation
		  (getDocumentRoot_EventListeners(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "event-listeners",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontFaceDecls(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-decls",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Forms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "forms",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Image(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "image",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-body-content"
		   });		
		addAnnotation
		  (getDocumentRoot_MasterStyles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "master-styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Meta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "meta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Presentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "presentation",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-body-content"
		   });		
		addAnnotation
		  (getDocumentRoot_Script(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "script",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Scripts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scripts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Settings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "settings",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Spreadsheet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "spreadsheet",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-body-content"
		   });		
		addAnnotation
		  (getDocumentRoot_Styles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "styles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-body-content"
		   });		
		addAnnotation
		  (getDocumentRoot_AutomaticUpdate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "automatic-update",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BooleanValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "boolean-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ConversionMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conversion-mode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Currency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "currency",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DateValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "date-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DdeApplication(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dde-application",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DdeItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dde-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DdeTopic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dde-topic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Display(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Mimetype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimetype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ProcessContent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "process-content",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ServerMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "server-map",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StringValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "string-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TargetFrame(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target-frame",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TargetFrameName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target-frame-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TimeValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "time-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });
	}

} //OfficePackageImpl
