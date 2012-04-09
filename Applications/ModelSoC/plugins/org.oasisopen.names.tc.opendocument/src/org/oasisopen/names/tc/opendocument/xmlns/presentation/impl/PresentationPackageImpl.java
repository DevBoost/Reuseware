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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
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
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.impl.OfficePackageImpl;
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
import org.oasisopen.names.tc.opendocument.xmlns.presentation.util.PresentationValidator;
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
public class PresentationPackageImpl extends EPackageImpl implements PresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animationsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeDeclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventListenerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footerDeclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerDeclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hideShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hideTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeholderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playTypeEClass = null;

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
	private EClass showShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soundTypeEClass = null;

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
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum animationsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presetClassTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionOnClickTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionStyleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType actionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType animationsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType presentationPageLayoutNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType presentationPageLayoutNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType presetClassTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transitionOnClickTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transitionStyleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transitionTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visibilityTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PresentationPackageImpl() {
		super(eNS_URI, PresentationFactory.eINSTANCE);
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
	public static PresentationPackage init() {
		if (isInited) return (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);

		// Obtain or create and register package
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new PresentationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DrawingPackageImpl theDrawingPackage = (DrawingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) instanceof DrawingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) : DrawingPackage.eINSTANCE);
		TextPackageImpl theTextPackage = (TextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) instanceof TextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) : TextPackage.eINSTANCE);
		OfficePackageImpl theOfficePackage = (OfficePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI) instanceof OfficePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI) : OfficePackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		XLinkPackageImpl theXLinkPackage = (XLinkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) instanceof XLinkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI) : XLinkPackage.eINSTANCE);
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
		thePresentationPackage.createPackageContents();
		theOfficePackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theXLinkPackage.createPackageContents();
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
		thePresentationPackage.initializePackageContents();
		theOfficePackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theXLinkPackage.initializePackageContents();
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePresentationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PresentationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePresentationPackage.freeze();

		return thePresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationGroupType() {
		return animationGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationGroupType_PresentationAnimationElementsGroup() {
		return (EAttribute)animationGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationGroupType_PresentationAnimationElements() {
		return (EReference)animationGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimationsType1() {
		return animationsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationsType1_Group() {
		return (EAttribute)animationsType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimationsType1_PresentationAnimationElementsGroup() {
		return (EAttribute)animationsType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationsType1_PresentationAnimationElements() {
		return (EReference)animationsType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnimationsType1_AnimationGroup() {
		return (EReference)animationsType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeDeclType() {
		return dateTimeDeclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDeclType_Mixed() {
		return (EAttribute)dateTimeDeclTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDeclType_DataStyleName() {
		return (EAttribute)dateTimeDeclTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDeclType_Name() {
		return (EAttribute)dateTimeDeclTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeDeclType_Source() {
		return (EAttribute)dateTimeDeclTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeType() {
		return dateTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimType() {
		return dimTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimType_Sound() {
		return (EReference)dimTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimType_Color() {
		return (EAttribute)dimTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimType_ShapeId() {
		return (EAttribute)dimTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventListenerType() {
		return eventListenerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventListenerType_Sound() {
		return (EReference)eventListenerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_Action() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_Actuate() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_Direction() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_Effect() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_EventName() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_Href() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_Show() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_Speed() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_StartScale() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_Type() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListenerType_Verb() {
		return (EAttribute)eventListenerTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFooterDeclType() {
		return footerDeclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFooterDeclType_Mixed() {
		return (EAttribute)footerDeclTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFooterDeclType_Name() {
		return (EAttribute)footerDeclTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFooterType() {
		return footerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderDeclType() {
		return headerDeclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderDeclType_Mixed() {
		return (EAttribute)headerDeclTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeaderDeclType_Name() {
		return (EAttribute)headerDeclTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderType() {
		return headerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHideShapeType() {
		return hideShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHideShapeType_Sound() {
		return (EReference)hideShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideShapeType_Delay() {
		return (EAttribute)hideShapeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideShapeType_Direction() {
		return (EAttribute)hideShapeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideShapeType_Effect() {
		return (EAttribute)hideShapeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideShapeType_PathId() {
		return (EAttribute)hideShapeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideShapeType_ShapeId() {
		return (EAttribute)hideShapeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideShapeType_Speed() {
		return (EAttribute)hideShapeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideShapeType_StartScale() {
		return (EAttribute)hideShapeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHideTextType() {
		return hideTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHideTextType_Sound() {
		return (EReference)hideTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideTextType_Delay() {
		return (EAttribute)hideTextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideTextType_Direction() {
		return (EAttribute)hideTextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideTextType_Effect() {
		return (EAttribute)hideTextTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideTextType_PathId() {
		return (EAttribute)hideTextTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideTextType_ShapeId() {
		return (EAttribute)hideTextTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideTextType_Speed() {
		return (EAttribute)hideTextTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHideTextType_StartScale() {
		return (EAttribute)hideTextTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotesType() {
		return notesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Forms() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_Shape() {
		return (EAttribute)notesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Rect() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Line() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Polyline() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Polygon() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_RegularPolygon() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Path() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Circle() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Ellipse() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_G() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_PageThumbnail() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Frame() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Measure() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Caption() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Connector() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Control() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Scene() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_CustomShape() {
		return (EReference)notesTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_PageLayoutName() {
		return (EAttribute)notesTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_StyleName() {
		return (EAttribute)notesTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_UseDateTimeName() {
		return (EAttribute)notesTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_UseFooterName() {
		return (EAttribute)notesTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_UseHeaderName() {
		return (EAttribute)notesTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceholderType() {
		return placeholderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderType_Height() {
		return (EAttribute)placeholderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderType_Object() {
		return (EAttribute)placeholderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderType_Width() {
		return (EAttribute)placeholderTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderType_X() {
		return (EAttribute)placeholderTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderType_Y() {
		return (EAttribute)placeholderTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayType() {
		return playTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayType_ShapeId() {
		return (EAttribute)playTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayType_Speed() {
		return (EAttribute)playTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getSettingsType_Show() {
		return (EReference)settingsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_Animations() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_Endless() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_ForceManual() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_FullScreen() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_MouseAsPen() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_MouseVisible() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_Pause() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_Show1() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_ShowEndOfPresentationSlide() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_ShowLogo() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_StartPage() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_StartWithNavigator() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_StayOnTop() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingsType_TransitionOnClick() {
		return (EAttribute)settingsTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShowShapeType() {
		return showShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShowShapeType_Sound() {
		return (EReference)showShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowShapeType_Delay() {
		return (EAttribute)showShapeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowShapeType_Direction() {
		return (EAttribute)showShapeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowShapeType_Effect() {
		return (EAttribute)showShapeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowShapeType_PathId() {
		return (EAttribute)showShapeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowShapeType_ShapeId() {
		return (EAttribute)showShapeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowShapeType_Speed() {
		return (EAttribute)showShapeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowShapeType_StartScale() {
		return (EAttribute)showShapeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShowTextType() {
		return showTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShowTextType_Sound() {
		return (EReference)showTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowTextType_Delay() {
		return (EAttribute)showTextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowTextType_Direction() {
		return (EAttribute)showTextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowTextType_Effect() {
		return (EAttribute)showTextTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowTextType_PathId() {
		return (EAttribute)showTextTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowTextType_ShapeId() {
		return (EAttribute)showTextTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowTextType_Speed() {
		return (EAttribute)showTextTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowTextType_StartScale() {
		return (EAttribute)showTextTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShowType() {
		return showTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowType_Name() {
		return (EAttribute)showTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShowType_Pages() {
		return (EAttribute)showTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoundType() {
		return soundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoundType_Actuate() {
		return (EAttribute)soundTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoundType_Href() {
		return (EAttribute)soundTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoundType_PlayFull() {
		return (EAttribute)soundTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoundType_Show() {
		return (EAttribute)soundTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoundType_Type() {
		return (EAttribute)soundTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getDocumentRoot_AnimationGroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Animations() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateTime() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateTimeDecl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Dim() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EventListener() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Footer() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FooterDecl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Header() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HeaderDecl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HideShape() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HideText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Notes() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Placeholder() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Play() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Settings() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Show() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShowShape() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ShowText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sound() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Action() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Animations1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BackgroundObjectsVisible() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BackgroundVisible() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Class() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ClassNames() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Delay() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Direction() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DisplayDateTime() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DisplayFooter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DisplayHeader() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DisplayPageNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Duration() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Effect() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Endless() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ForceManual() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FullScreen() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GroupId() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MasterElement() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MouseAsPen() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MouseVisible() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NodeType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Pages() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PathId() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Pause() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Placeholder1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PlayFull() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PresentationPageLayoutName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PresetClass() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PresetId() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PresetSubType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Show1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShowEndOfPresentationSlide() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShowLogo() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Source() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Speed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartPage() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartScale() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartWithNavigator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StayOnTop() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StyleName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransitionOnClick() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransitionSpeed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransitionStyle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransitionType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UseDateTimeName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UseFooterName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UseHeaderName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UserTransformed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Verb() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Visibility() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnimationsType() {
		return animationsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeTypeType() {
		return nodeTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPresetClassType() {
		return presetClassTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceType() {
		return sourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionOnClickType() {
		return transitionOnClickTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionStyleType() {
		return transitionStyleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionTypeType() {
		return transitionTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityType() {
		return visibilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActionTypeObject() {
		return actionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnimationsTypeObject() {
		return animationsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNodeTypeTypeObject() {
		return nodeTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPresentationPageLayoutNameType() {
		return presentationPageLayoutNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPresentationPageLayoutNameTypeMember1() {
		return presentationPageLayoutNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPresetClassTypeObject() {
		return presetClassTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSourceTypeObject() {
		return sourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameType() {
		return styleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleNameTypeMember1() {
		return styleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransitionOnClickTypeObject() {
		return transitionOnClickTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransitionStyleTypeObject() {
		return transitionStyleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransitionTypeTypeObject() {
		return transitionTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisibilityTypeObject() {
		return visibilityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationFactory getPresentationFactory() {
		return (PresentationFactory)getEFactoryInstance();
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
		animationGroupTypeEClass = createEClass(ANIMATION_GROUP_TYPE);
		createEAttribute(animationGroupTypeEClass, ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS_GROUP);
		createEReference(animationGroupTypeEClass, ANIMATION_GROUP_TYPE__PRESENTATION_ANIMATION_ELEMENTS);

		animationsType1EClass = createEClass(ANIMATIONS_TYPE1);
		createEAttribute(animationsType1EClass, ANIMATIONS_TYPE1__GROUP);
		createEAttribute(animationsType1EClass, ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS_GROUP);
		createEReference(animationsType1EClass, ANIMATIONS_TYPE1__PRESENTATION_ANIMATION_ELEMENTS);
		createEReference(animationsType1EClass, ANIMATIONS_TYPE1__ANIMATION_GROUP);

		dateTimeDeclTypeEClass = createEClass(DATE_TIME_DECL_TYPE);
		createEAttribute(dateTimeDeclTypeEClass, DATE_TIME_DECL_TYPE__MIXED);
		createEAttribute(dateTimeDeclTypeEClass, DATE_TIME_DECL_TYPE__DATA_STYLE_NAME);
		createEAttribute(dateTimeDeclTypeEClass, DATE_TIME_DECL_TYPE__NAME);
		createEAttribute(dateTimeDeclTypeEClass, DATE_TIME_DECL_TYPE__SOURCE);

		dateTimeTypeEClass = createEClass(DATE_TIME_TYPE);

		dimTypeEClass = createEClass(DIM_TYPE);
		createEReference(dimTypeEClass, DIM_TYPE__SOUND);
		createEAttribute(dimTypeEClass, DIM_TYPE__COLOR);
		createEAttribute(dimTypeEClass, DIM_TYPE__SHAPE_ID);

		eventListenerTypeEClass = createEClass(EVENT_LISTENER_TYPE);
		createEReference(eventListenerTypeEClass, EVENT_LISTENER_TYPE__SOUND);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__ACTION);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__ACTUATE);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__DIRECTION);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__EFFECT);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__EVENT_NAME);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__HREF);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__SHOW);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__SPEED);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__START_SCALE);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__TYPE);
		createEAttribute(eventListenerTypeEClass, EVENT_LISTENER_TYPE__VERB);

		footerDeclTypeEClass = createEClass(FOOTER_DECL_TYPE);
		createEAttribute(footerDeclTypeEClass, FOOTER_DECL_TYPE__MIXED);
		createEAttribute(footerDeclTypeEClass, FOOTER_DECL_TYPE__NAME);

		footerTypeEClass = createEClass(FOOTER_TYPE);

		headerDeclTypeEClass = createEClass(HEADER_DECL_TYPE);
		createEAttribute(headerDeclTypeEClass, HEADER_DECL_TYPE__MIXED);
		createEAttribute(headerDeclTypeEClass, HEADER_DECL_TYPE__NAME);

		headerTypeEClass = createEClass(HEADER_TYPE);

		hideShapeTypeEClass = createEClass(HIDE_SHAPE_TYPE);
		createEReference(hideShapeTypeEClass, HIDE_SHAPE_TYPE__SOUND);
		createEAttribute(hideShapeTypeEClass, HIDE_SHAPE_TYPE__DELAY);
		createEAttribute(hideShapeTypeEClass, HIDE_SHAPE_TYPE__DIRECTION);
		createEAttribute(hideShapeTypeEClass, HIDE_SHAPE_TYPE__EFFECT);
		createEAttribute(hideShapeTypeEClass, HIDE_SHAPE_TYPE__PATH_ID);
		createEAttribute(hideShapeTypeEClass, HIDE_SHAPE_TYPE__SHAPE_ID);
		createEAttribute(hideShapeTypeEClass, HIDE_SHAPE_TYPE__SPEED);
		createEAttribute(hideShapeTypeEClass, HIDE_SHAPE_TYPE__START_SCALE);

		hideTextTypeEClass = createEClass(HIDE_TEXT_TYPE);
		createEReference(hideTextTypeEClass, HIDE_TEXT_TYPE__SOUND);
		createEAttribute(hideTextTypeEClass, HIDE_TEXT_TYPE__DELAY);
		createEAttribute(hideTextTypeEClass, HIDE_TEXT_TYPE__DIRECTION);
		createEAttribute(hideTextTypeEClass, HIDE_TEXT_TYPE__EFFECT);
		createEAttribute(hideTextTypeEClass, HIDE_TEXT_TYPE__PATH_ID);
		createEAttribute(hideTextTypeEClass, HIDE_TEXT_TYPE__SHAPE_ID);
		createEAttribute(hideTextTypeEClass, HIDE_TEXT_TYPE__SPEED);
		createEAttribute(hideTextTypeEClass, HIDE_TEXT_TYPE__START_SCALE);

		notesTypeEClass = createEClass(NOTES_TYPE);
		createEReference(notesTypeEClass, NOTES_TYPE__FORMS);
		createEAttribute(notesTypeEClass, NOTES_TYPE__SHAPE);
		createEReference(notesTypeEClass, NOTES_TYPE__RECT);
		createEReference(notesTypeEClass, NOTES_TYPE__LINE);
		createEReference(notesTypeEClass, NOTES_TYPE__POLYLINE);
		createEReference(notesTypeEClass, NOTES_TYPE__POLYGON);
		createEReference(notesTypeEClass, NOTES_TYPE__REGULAR_POLYGON);
		createEReference(notesTypeEClass, NOTES_TYPE__PATH);
		createEReference(notesTypeEClass, NOTES_TYPE__CIRCLE);
		createEReference(notesTypeEClass, NOTES_TYPE__ELLIPSE);
		createEReference(notesTypeEClass, NOTES_TYPE__G);
		createEReference(notesTypeEClass, NOTES_TYPE__PAGE_THUMBNAIL);
		createEReference(notesTypeEClass, NOTES_TYPE__FRAME);
		createEReference(notesTypeEClass, NOTES_TYPE__MEASURE);
		createEReference(notesTypeEClass, NOTES_TYPE__CAPTION);
		createEReference(notesTypeEClass, NOTES_TYPE__CONNECTOR);
		createEReference(notesTypeEClass, NOTES_TYPE__CONTROL);
		createEReference(notesTypeEClass, NOTES_TYPE__SCENE);
		createEReference(notesTypeEClass, NOTES_TYPE__CUSTOM_SHAPE);
		createEAttribute(notesTypeEClass, NOTES_TYPE__PAGE_LAYOUT_NAME);
		createEAttribute(notesTypeEClass, NOTES_TYPE__STYLE_NAME);
		createEAttribute(notesTypeEClass, NOTES_TYPE__USE_DATE_TIME_NAME);
		createEAttribute(notesTypeEClass, NOTES_TYPE__USE_FOOTER_NAME);
		createEAttribute(notesTypeEClass, NOTES_TYPE__USE_HEADER_NAME);

		placeholderTypeEClass = createEClass(PLACEHOLDER_TYPE);
		createEAttribute(placeholderTypeEClass, PLACEHOLDER_TYPE__HEIGHT);
		createEAttribute(placeholderTypeEClass, PLACEHOLDER_TYPE__OBJECT);
		createEAttribute(placeholderTypeEClass, PLACEHOLDER_TYPE__WIDTH);
		createEAttribute(placeholderTypeEClass, PLACEHOLDER_TYPE__X);
		createEAttribute(placeholderTypeEClass, PLACEHOLDER_TYPE__Y);

		playTypeEClass = createEClass(PLAY_TYPE);
		createEAttribute(playTypeEClass, PLAY_TYPE__SHAPE_ID);
		createEAttribute(playTypeEClass, PLAY_TYPE__SPEED);

		settingsTypeEClass = createEClass(SETTINGS_TYPE);
		createEReference(settingsTypeEClass, SETTINGS_TYPE__SHOW);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__ANIMATIONS);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__ENDLESS);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__FORCE_MANUAL);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__FULL_SCREEN);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__MOUSE_AS_PEN);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__MOUSE_VISIBLE);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__PAUSE);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__SHOW1);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__SHOW_END_OF_PRESENTATION_SLIDE);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__SHOW_LOGO);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__START_PAGE);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__START_WITH_NAVIGATOR);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__STAY_ON_TOP);
		createEAttribute(settingsTypeEClass, SETTINGS_TYPE__TRANSITION_ON_CLICK);

		showShapeTypeEClass = createEClass(SHOW_SHAPE_TYPE);
		createEReference(showShapeTypeEClass, SHOW_SHAPE_TYPE__SOUND);
		createEAttribute(showShapeTypeEClass, SHOW_SHAPE_TYPE__DELAY);
		createEAttribute(showShapeTypeEClass, SHOW_SHAPE_TYPE__DIRECTION);
		createEAttribute(showShapeTypeEClass, SHOW_SHAPE_TYPE__EFFECT);
		createEAttribute(showShapeTypeEClass, SHOW_SHAPE_TYPE__PATH_ID);
		createEAttribute(showShapeTypeEClass, SHOW_SHAPE_TYPE__SHAPE_ID);
		createEAttribute(showShapeTypeEClass, SHOW_SHAPE_TYPE__SPEED);
		createEAttribute(showShapeTypeEClass, SHOW_SHAPE_TYPE__START_SCALE);

		showTextTypeEClass = createEClass(SHOW_TEXT_TYPE);
		createEReference(showTextTypeEClass, SHOW_TEXT_TYPE__SOUND);
		createEAttribute(showTextTypeEClass, SHOW_TEXT_TYPE__DELAY);
		createEAttribute(showTextTypeEClass, SHOW_TEXT_TYPE__DIRECTION);
		createEAttribute(showTextTypeEClass, SHOW_TEXT_TYPE__EFFECT);
		createEAttribute(showTextTypeEClass, SHOW_TEXT_TYPE__PATH_ID);
		createEAttribute(showTextTypeEClass, SHOW_TEXT_TYPE__SHAPE_ID);
		createEAttribute(showTextTypeEClass, SHOW_TEXT_TYPE__SPEED);
		createEAttribute(showTextTypeEClass, SHOW_TEXT_TYPE__START_SCALE);

		showTypeEClass = createEClass(SHOW_TYPE);
		createEAttribute(showTypeEClass, SHOW_TYPE__NAME);
		createEAttribute(showTypeEClass, SHOW_TYPE__PAGES);

		soundTypeEClass = createEClass(SOUND_TYPE);
		createEAttribute(soundTypeEClass, SOUND_TYPE__ACTUATE);
		createEAttribute(soundTypeEClass, SOUND_TYPE__HREF);
		createEAttribute(soundTypeEClass, SOUND_TYPE__PLAY_FULL);
		createEAttribute(soundTypeEClass, SOUND_TYPE__SHOW);
		createEAttribute(soundTypeEClass, SOUND_TYPE__TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANIMATION_GROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANIMATIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_TIME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_TIME_DECL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_LISTENER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOOTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOOTER_DECL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HEADER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HEADER_DECL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HIDE_SHAPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HIDE_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NOTES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PLACEHOLDER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PLAY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SETTINGS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHOW);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHOW_SHAPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHOW_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SOUND);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ANIMATIONS1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BACKGROUND_OBJECTS_VISIBLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BACKGROUND_VISIBLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CLASS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CLASS_NAMES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DELAY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIRECTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DISPLAY_DATE_TIME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DISPLAY_FOOTER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DISPLAY_HEADER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DISPLAY_PAGE_NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DURATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EFFECT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ENDLESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FORCE_MANUAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FULL_SCREEN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GROUP_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MASTER_ELEMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MOUSE_AS_PEN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MOUSE_VISIBLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NODE_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PAGES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PATH_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PAUSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PLACEHOLDER1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PLAY_FULL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRESENTATION_PAGE_LAYOUT_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRESET_CLASS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRESET_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRESET_SUB_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SHOW1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SHOW_END_OF_PRESENTATION_SLIDE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SHOW_LOGO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SOURCE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPEED);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__START_PAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__START_SCALE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__START_WITH_NAVIGATOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STAY_ON_TOP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STYLE_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSITION_ON_CLICK);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSITION_SPEED);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSITION_STYLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSITION_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__USE_DATE_TIME_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__USE_FOOTER_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__USE_HEADER_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__USER_TRANSFORMED);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VERB);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VISIBILITY);

		// Create enums
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		animationsTypeEEnum = createEEnum(ANIMATIONS_TYPE);
		nodeTypeTypeEEnum = createEEnum(NODE_TYPE_TYPE);
		presetClassTypeEEnum = createEEnum(PRESET_CLASS_TYPE);
		sourceTypeEEnum = createEEnum(SOURCE_TYPE);
		transitionOnClickTypeEEnum = createEEnum(TRANSITION_ON_CLICK_TYPE);
		transitionStyleTypeEEnum = createEEnum(TRANSITION_STYLE_TYPE);
		transitionTypeTypeEEnum = createEEnum(TRANSITION_TYPE_TYPE);
		visibilityTypeEEnum = createEEnum(VISIBILITY_TYPE);

		// Create data types
		actionTypeObjectEDataType = createEDataType(ACTION_TYPE_OBJECT);
		animationsTypeObjectEDataType = createEDataType(ANIMATIONS_TYPE_OBJECT);
		nodeTypeTypeObjectEDataType = createEDataType(NODE_TYPE_TYPE_OBJECT);
		presentationPageLayoutNameTypeEDataType = createEDataType(PRESENTATION_PAGE_LAYOUT_NAME_TYPE);
		presentationPageLayoutNameTypeMember1EDataType = createEDataType(PRESENTATION_PAGE_LAYOUT_NAME_TYPE_MEMBER1);
		presetClassTypeObjectEDataType = createEDataType(PRESET_CLASS_TYPE_OBJECT);
		sourceTypeObjectEDataType = createEDataType(SOURCE_TYPE_OBJECT);
		styleNameTypeEDataType = createEDataType(STYLE_NAME_TYPE);
		styleNameTypeMember1EDataType = createEDataType(STYLE_NAME_TYPE_MEMBER1);
		transitionOnClickTypeObjectEDataType = createEDataType(TRANSITION_ON_CLICK_TYPE_OBJECT);
		transitionStyleTypeObjectEDataType = createEDataType(TRANSITION_STYLE_TYPE_OBJECT);
		transitionTypeTypeObjectEDataType = createEDataType(TRANSITION_TYPE_TYPE_OBJECT);
		visibilityTypeObjectEDataType = createEDataType(VISIBILITY_TYPE_OBJECT);
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
		StylePackage theStylePackage = (StylePackage)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);
		TextPackage theTextPackage = (TextPackage)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI);
		XLinkPackage theXLinkPackage = (XLinkPackage)EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		OfficePackage theOfficePackage = (OfficePackage)EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI);
		DrawingPackage theDrawingPackage = (DrawingPackage)EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI);
		Dr3dPackage theDr3dPackage = (Dr3dPackage)EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI);
		SvgPackage theSvgPackage = (SvgPackage)EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(animationGroupTypeEClass, AnimationGroupType.class, "AnimationGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimationGroupType_PresentationAnimationElementsGroup(), ecorePackage.getEFeatureMapEntry(), "presentationAnimationElementsGroup", null, 0, -1, AnimationGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnimationGroupType_PresentationAnimationElements(), ecorePackage.getEObject(), null, "presentationAnimationElements", null, 0, -1, AnimationGroupType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(animationsType1EClass, AnimationsType1.class, "AnimationsType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimationsType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AnimationsType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimationsType1_PresentationAnimationElementsGroup(), ecorePackage.getEFeatureMapEntry(), "presentationAnimationElementsGroup", null, 0, -1, AnimationsType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnimationsType1_PresentationAnimationElements(), ecorePackage.getEObject(), null, "presentationAnimationElements", null, 0, -1, AnimationsType1.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnimationsType1_AnimationGroup(), this.getAnimationGroupType(), null, "animationGroup", null, 0, -1, AnimationsType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeDeclTypeEClass, DateTimeDeclType.class, "DateTimeDeclType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeDeclType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DateTimeDeclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDeclType_DataStyleName(), theStylePackage.getDataStyleNameType(), "dataStyleName", null, 0, 1, DateTimeDeclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDeclType_Name(), theTextPackage.getString(), "name", null, 1, 1, DateTimeDeclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeDeclType_Source(), this.getSourceType(), "source", null, 1, 1, DateTimeDeclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeTypeEClass, DateTimeType.class, "DateTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dimTypeEClass, DimType.class, "DimType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimType_Sound(), this.getSoundType(), null, "sound", null, 0, 1, DimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimType_Color(), theTextPackage.getColor(), "color", null, 1, 1, DimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimType_ShapeId(), theTextPackage.getIDREF(), "shapeId", null, 1, 1, DimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventListenerTypeEClass, EventListenerType.class, "EventListenerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventListenerType_Sound(), this.getSoundType(), null, "sound", null, 0, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_Action(), this.getActionType(), "action", null, 1, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_Actuate(), theXLinkPackage.getActuateType1(), "actuate", null, 1, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_Direction(), theTextPackage.getPresentationEffectDirections(), "direction", "none", 0, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_Effect(), theTextPackage.getPresentationEffects(), "effect", "none", 0, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_EventName(), theTextPackage.getString(), "eventName", null, 1, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_Href(), theTextPackage.getAnyURI(), "href", null, 0, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_Show(), theXLinkPackage.getShowType1(), "show", null, 1, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_Speed(), theTextPackage.getPresentationSpeeds(), "speed", "medium", 0, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_StartScale(), theTextPackage.getPercent(), "startScale", "100%", 0, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_Type(), theXLinkPackage.getTypeType(), "type", "simple", 0, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventListenerType_Verb(), theTextPackage.getNonNegativeInteger(), "verb", null, 0, 1, EventListenerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(footerDeclTypeEClass, FooterDeclType.class, "FooterDeclType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFooterDeclType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, FooterDeclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFooterDeclType_Name(), theTextPackage.getString(), "name", null, 1, 1, FooterDeclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(footerTypeEClass, FooterType.class, "FooterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerDeclTypeEClass, HeaderDeclType.class, "HeaderDeclType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderDeclType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, HeaderDeclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeaderDeclType_Name(), theTextPackage.getString(), "name", null, 1, 1, HeaderDeclType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerTypeEClass, HeaderType.class, "HeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hideShapeTypeEClass, HideShapeType.class, "HideShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHideShapeType_Sound(), this.getSoundType(), null, "sound", null, 0, 1, HideShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideShapeType_Delay(), theTextPackage.getDuration(), "delay", null, 0, 1, HideShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideShapeType_Direction(), theTextPackage.getPresentationEffectDirections(), "direction", "none", 0, 1, HideShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideShapeType_Effect(), theTextPackage.getPresentationEffects(), "effect", "none", 0, 1, HideShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideShapeType_PathId(), theXMLTypePackage.getAnySimpleType(), "pathId", null, 0, 1, HideShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideShapeType_ShapeId(), theTextPackage.getIDREF(), "shapeId", null, 1, 1, HideShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideShapeType_Speed(), theTextPackage.getPresentationSpeeds(), "speed", "medium", 0, 1, HideShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideShapeType_StartScale(), theTextPackage.getPercent(), "startScale", "100%", 0, 1, HideShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hideTextTypeEClass, HideTextType.class, "HideTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHideTextType_Sound(), this.getSoundType(), null, "sound", null, 0, 1, HideTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideTextType_Delay(), theTextPackage.getDuration(), "delay", null, 0, 1, HideTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideTextType_Direction(), theTextPackage.getPresentationEffectDirections(), "direction", "none", 0, 1, HideTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideTextType_Effect(), theTextPackage.getPresentationEffects(), "effect", "none", 0, 1, HideTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideTextType_PathId(), theXMLTypePackage.getAnySimpleType(), "pathId", null, 0, 1, HideTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideTextType_ShapeId(), theTextPackage.getIDREF(), "shapeId", null, 1, 1, HideTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideTextType_Speed(), theTextPackage.getPresentationSpeeds(), "speed", "medium", 0, 1, HideTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHideTextType_StartScale(), theTextPackage.getPercent(), "startScale", "100%", 0, 1, HideTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notesTypeEClass, NotesType.class, "NotesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotesType_Forms(), theOfficePackage.getFormsType(), null, "forms", null, 0, 1, NotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotesType_Shape(), ecorePackage.getEFeatureMapEntry(), "shape", null, 0, -1, NotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Rect(), theDrawingPackage.getRectType(), null, "rect", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Line(), theDrawingPackage.getLineType(), null, "line", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Polyline(), theDrawingPackage.getPolylineType(), null, "polyline", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Polygon(), theDrawingPackage.getPolygonType(), null, "polygon", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_RegularPolygon(), theDrawingPackage.getRegularPolygonType(), null, "regularPolygon", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Path(), theDrawingPackage.getPathType(), null, "path", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Circle(), theDrawingPackage.getCircleType(), null, "circle", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Ellipse(), theDrawingPackage.getEllipseType(), null, "ellipse", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_G(), theDrawingPackage.getGType(), null, "g", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_PageThumbnail(), theDrawingPackage.getPageThumbnailType(), null, "pageThumbnail", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Frame(), theDrawingPackage.getFrameType(), null, "frame", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Measure(), theDrawingPackage.getMeasureType(), null, "measure", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Caption(), theDrawingPackage.getCaptionType(), null, "caption", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Connector(), theDrawingPackage.getConnectorType(), null, "connector", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Control(), theDrawingPackage.getControlType(), null, "control", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_Scene(), theDr3dPackage.getSceneType(), null, "scene", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNotesType_CustomShape(), theDrawingPackage.getCustomShapeType(), null, "customShape", null, 0, -1, NotesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotesType_PageLayoutName(), theStylePackage.getPageLayoutNameType(), "pageLayoutName", null, 0, 1, NotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotesType_StyleName(), theDrawingPackage.getStyleNameType(), "styleName", null, 0, 1, NotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotesType_UseDateTimeName(), theTextPackage.getString(), "useDateTimeName", null, 0, 1, NotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotesType_UseFooterName(), theTextPackage.getString(), "useFooterName", null, 0, 1, NotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotesType_UseHeaderName(), theTextPackage.getString(), "useHeaderName", null, 0, 1, NotesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeholderTypeEClass, PlaceholderType.class, "PlaceholderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceholderType_Height(), theSvgPackage.getHeightType(), "height", null, 1, 1, PlaceholderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceholderType_Object(), theTextPackage.getPresentationClasses(), "object", null, 1, 1, PlaceholderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceholderType_Width(), theSvgPackage.getWidthType(), "width", null, 1, 1, PlaceholderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceholderType_X(), theSvgPackage.getXType(), "x", null, 1, 1, PlaceholderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaceholderType_Y(), theSvgPackage.getYType(), "y", null, 1, 1, PlaceholderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playTypeEClass, PlayType.class, "PlayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayType_ShapeId(), theTextPackage.getIDREF(), "shapeId", null, 1, 1, PlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayType_Speed(), theTextPackage.getPresentationSpeeds(), "speed", "medium", 0, 1, PlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingsTypeEClass, SettingsType.class, "SettingsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSettingsType_Show(), this.getShowType(), null, "show", null, 0, -1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_Animations(), this.getAnimationsType(), "animations", "enabled", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_Endless(), theTextPackage.getBoolean(), "endless", "false", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_ForceManual(), theTextPackage.getBoolean(), "forceManual", "false", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_FullScreen(), theTextPackage.getBoolean(), "fullScreen", "true", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_MouseAsPen(), theTextPackage.getBoolean(), "mouseAsPen", "false", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_MouseVisible(), theTextPackage.getBoolean(), "mouseVisible", "true", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_Pause(), theTextPackage.getDuration(), "pause", null, 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_Show1(), theTextPackage.getString(), "show1", null, 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_ShowEndOfPresentationSlide(), theTextPackage.getBoolean(), "showEndOfPresentationSlide", "true", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_ShowLogo(), theTextPackage.getBoolean(), "showLogo", "false", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_StartPage(), theTextPackage.getString(), "startPage", null, 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_StartWithNavigator(), theTextPackage.getBoolean(), "startWithNavigator", "false", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_StayOnTop(), theTextPackage.getBoolean(), "stayOnTop", "false", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingsType_TransitionOnClick(), this.getTransitionOnClickType(), "transitionOnClick", "enabled", 0, 1, SettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(showShapeTypeEClass, ShowShapeType.class, "ShowShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShowShapeType_Sound(), this.getSoundType(), null, "sound", null, 0, 1, ShowShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowShapeType_Delay(), theTextPackage.getDuration(), "delay", null, 0, 1, ShowShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowShapeType_Direction(), theTextPackage.getPresentationEffectDirections(), "direction", "none", 0, 1, ShowShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowShapeType_Effect(), theTextPackage.getPresentationEffects(), "effect", "none", 0, 1, ShowShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowShapeType_PathId(), theXMLTypePackage.getAnySimpleType(), "pathId", null, 0, 1, ShowShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowShapeType_ShapeId(), theTextPackage.getIDREF(), "shapeId", null, 1, 1, ShowShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowShapeType_Speed(), theTextPackage.getPresentationSpeeds(), "speed", "medium", 0, 1, ShowShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowShapeType_StartScale(), theTextPackage.getPercent(), "startScale", "100%", 0, 1, ShowShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(showTextTypeEClass, ShowTextType.class, "ShowTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShowTextType_Sound(), this.getSoundType(), null, "sound", null, 0, 1, ShowTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowTextType_Delay(), theTextPackage.getDuration(), "delay", null, 0, 1, ShowTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowTextType_Direction(), theTextPackage.getPresentationEffectDirections(), "direction", "none", 0, 1, ShowTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowTextType_Effect(), theTextPackage.getPresentationEffects(), "effect", "none", 0, 1, ShowTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowTextType_PathId(), theXMLTypePackage.getAnySimpleType(), "pathId", null, 0, 1, ShowTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowTextType_ShapeId(), theTextPackage.getIDREF(), "shapeId", null, 1, 1, ShowTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowTextType_Speed(), theTextPackage.getPresentationSpeeds(), "speed", "medium", 0, 1, ShowTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowTextType_StartScale(), theTextPackage.getPercent(), "startScale", "100%", 0, 1, ShowTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(showTypeEClass, ShowType.class, "ShowType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShowType_Name(), theTextPackage.getString(), "name", null, 1, 1, ShowType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShowType_Pages(), theXMLTypePackage.getAnySimpleType(), "pages", null, 1, 1, ShowType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soundTypeEClass, SoundType.class, "SoundType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoundType_Actuate(), theXLinkPackage.getActuateType1(), "actuate", null, 1, 1, SoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoundType_Href(), theTextPackage.getAnyURI(), "href", null, 1, 1, SoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoundType_PlayFull(), theTextPackage.getBoolean(), "playFull", null, 0, 1, SoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoundType_Show(), theXLinkPackage.getShowType2(), "show", null, 1, 1, SoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoundType_Type(), theXLinkPackage.getTypeType(), "type", "simple", 0, 1, SoundType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AnimationGroup(), this.getAnimationGroupType(), null, "animationGroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Animations(), this.getAnimationsType1(), null, "animations", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateTime(), this.getDateTimeType(), null, "dateTime", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateTimeDecl(), this.getDateTimeDeclType(), null, "dateTimeDecl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dim(), this.getDimType(), null, "dim", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EventListener(), this.getEventListenerType(), null, "eventListener", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Footer(), this.getFooterType(), null, "footer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FooterDecl(), this.getFooterDeclType(), null, "footerDecl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Header(), this.getHeaderType(), null, "header", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HeaderDecl(), this.getHeaderDeclType(), null, "headerDecl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HideShape(), this.getHideShapeType(), null, "hideShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HideText(), this.getHideTextType(), null, "hideText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Notes(), this.getNotesType(), null, "notes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Placeholder(), this.getPlaceholderType(), null, "placeholder", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Play(), this.getPlayType(), null, "play", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Settings(), this.getSettingsType(), null, "settings", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Show(), this.getShowType(), null, "show", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ShowShape(), this.getShowShapeType(), null, "showShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ShowText(), this.getShowTextType(), null, "showText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sound(), this.getSoundType(), null, "sound", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Action(), this.getActionType(), "action", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Animations1(), this.getAnimationsType(), "animations1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BackgroundObjectsVisible(), theTextPackage.getBoolean(), "backgroundObjectsVisible", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BackgroundVisible(), theTextPackage.getBoolean(), "backgroundVisible", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Class(), theTextPackage.getPresentationClasses(), "class", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ClassNames(), theTextPackage.getStyleNameRefs(), "classNames", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Delay(), theTextPackage.getDuration(), "delay", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Direction(), theTextPackage.getPresentationEffectDirections(), "direction", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DisplayDateTime(), theTextPackage.getBoolean(), "displayDateTime", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DisplayFooter(), theTextPackage.getBoolean(), "displayFooter", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DisplayHeader(), theTextPackage.getBoolean(), "displayHeader", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DisplayPageNumber(), theTextPackage.getBoolean(), "displayPageNumber", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Duration(), theTextPackage.getDuration(), "duration", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Effect(), theTextPackage.getPresentationEffects(), "effect", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Endless(), theTextPackage.getBoolean(), "endless", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ForceManual(), theTextPackage.getBoolean(), "forceManual", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FullScreen(), theTextPackage.getBoolean(), "fullScreen", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_GroupId(), theTextPackage.getString(), "groupId", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MasterElement(), theTextPackage.getIDREF(), "masterElement", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MouseAsPen(), theTextPackage.getBoolean(), "mouseAsPen", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MouseVisible(), theTextPackage.getBoolean(), "mouseVisible", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name(), theTextPackage.getString(), "name", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_NodeType(), this.getNodeTypeType(), "nodeType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Pages(), theXMLTypePackage.getAnySimpleType(), "pages", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PathId(), theXMLTypePackage.getAnySimpleType(), "pathId", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Pause(), theTextPackage.getDuration(), "pause", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Placeholder1(), theTextPackage.getBoolean(), "placeholder1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PlayFull(), theTextPackage.getBoolean(), "playFull", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PresentationPageLayoutName(), this.getPresentationPageLayoutNameType(), "presentationPageLayoutName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PresetClass(), this.getPresetClassType(), "presetClass", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PresetId(), theTextPackage.getString(), "presetId", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PresetSubType(), theTextPackage.getString(), "presetSubType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Show1(), theTextPackage.getString(), "show1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ShowEndOfPresentationSlide(), theTextPackage.getBoolean(), "showEndOfPresentationSlide", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ShowLogo(), theTextPackage.getBoolean(), "showLogo", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Source(), this.getSourceType(), "source", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Speed(), theTextPackage.getPresentationSpeeds(), "speed", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StartPage(), theTextPackage.getString(), "startPage", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StartScale(), theTextPackage.getPercent(), "startScale", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StartWithNavigator(), theTextPackage.getBoolean(), "startWithNavigator", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StayOnTop(), theTextPackage.getBoolean(), "stayOnTop", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransitionOnClick(), this.getTransitionOnClickType(), "transitionOnClick", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransitionSpeed(), theTextPackage.getPresentationSpeeds(), "transitionSpeed", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransitionStyle(), this.getTransitionStyleType(), "transitionStyle", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransitionType(), this.getTransitionTypeType(), "transitionType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UseDateTimeName(), theTextPackage.getString(), "useDateTimeName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UseFooterName(), theTextPackage.getString(), "useFooterName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UseHeaderName(), theTextPackage.getString(), "useHeaderName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UserTransformed(), theTextPackage.getBoolean(), "userTransformed", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Verb(), theTextPackage.getNonNegativeInteger(), "verb", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Visibility(), this.getVisibilityType(), "visibility", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.NONE);
		addEEnumLiteral(actionTypeEEnum, ActionType.PREVIOUS_PAGE);
		addEEnumLiteral(actionTypeEEnum, ActionType.NEXT_PAGE);
		addEEnumLiteral(actionTypeEEnum, ActionType.FIRST_PAGE);
		addEEnumLiteral(actionTypeEEnum, ActionType.LAST_PAGE);
		addEEnumLiteral(actionTypeEEnum, ActionType.HIDE);
		addEEnumLiteral(actionTypeEEnum, ActionType.STOP);
		addEEnumLiteral(actionTypeEEnum, ActionType.EXECUTE);
		addEEnumLiteral(actionTypeEEnum, ActionType.SHOW);
		addEEnumLiteral(actionTypeEEnum, ActionType.VERB);
		addEEnumLiteral(actionTypeEEnum, ActionType.FADE_OUT);
		addEEnumLiteral(actionTypeEEnum, ActionType.SOUND);

		initEEnum(animationsTypeEEnum, AnimationsType.class, "AnimationsType");
		addEEnumLiteral(animationsTypeEEnum, AnimationsType.ENABLED);
		addEEnumLiteral(animationsTypeEEnum, AnimationsType.DISABLED);

		initEEnum(nodeTypeTypeEEnum, NodeTypeType.class, "NodeTypeType");
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.DEFAULT);
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.ON_CLICK);
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.WITH_PREVIOUS);
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.AFTER_PREVIOUS);
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.TIMING_ROOT);
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.MAIN_SEQUENCE);
		addEEnumLiteral(nodeTypeTypeEEnum, NodeTypeType.INTERACTIVE_SEQUENCE);

		initEEnum(presetClassTypeEEnum, PresetClassType.class, "PresetClassType");
		addEEnumLiteral(presetClassTypeEEnum, PresetClassType.CUSTOM);
		addEEnumLiteral(presetClassTypeEEnum, PresetClassType.ENTRANCE);
		addEEnumLiteral(presetClassTypeEEnum, PresetClassType.EXIT);
		addEEnumLiteral(presetClassTypeEEnum, PresetClassType.EMPHASIS);
		addEEnumLiteral(presetClassTypeEEnum, PresetClassType.MOTION_PATH);
		addEEnumLiteral(presetClassTypeEEnum, PresetClassType.OLE_ACTION);
		addEEnumLiteral(presetClassTypeEEnum, PresetClassType.MEDIA_CALL);

		initEEnum(sourceTypeEEnum, SourceType.class, "SourceType");
		addEEnumLiteral(sourceTypeEEnum, SourceType.FIXED);
		addEEnumLiteral(sourceTypeEEnum, SourceType.CURRENT_DATE);

		initEEnum(transitionOnClickTypeEEnum, TransitionOnClickType.class, "TransitionOnClickType");
		addEEnumLiteral(transitionOnClickTypeEEnum, TransitionOnClickType.ENABLED);
		addEEnumLiteral(transitionOnClickTypeEEnum, TransitionOnClickType.DISABLED);

		initEEnum(transitionStyleTypeEEnum, TransitionStyleType.class, "TransitionStyleType");
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.NONE);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_FROM_LEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_FROM_TOP);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_FROM_RIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_FROM_BOTTOM);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_FROM_UPPERLEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_FROM_UPPERRIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_FROM_LOWERLEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_FROM_LOWERRIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.MOVE_FROM_LEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.MOVE_FROM_TOP);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.MOVE_FROM_RIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.MOVE_FROM_BOTTOM);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.MOVE_FROM_UPPERLEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.MOVE_FROM_UPPERRIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.MOVE_FROM_LOWERLEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.MOVE_FROM_LOWERRIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.UNCOVER_TO_LEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.UNCOVER_TO_TOP);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.UNCOVER_TO_RIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.UNCOVER_TO_BOTTOM);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.UNCOVER_TO_UPPERLEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.UNCOVER_TO_UPPERRIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.UNCOVER_TO_LOWERLEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.UNCOVER_TO_LOWERRIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_TO_CENTER);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FADE_FROM_CENTER);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.VERTICAL_STRIPES);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.HORIZONTAL_STRIPES);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.CLOCKWISE);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.COUNTERCLOCKWISE);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.OPEN_VERTICAL);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.OPEN_HORIZONTAL);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.CLOSE_VERTICAL);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.CLOSE_HORIZONTAL);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.WAVYLINE_FROM_LEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.WAVYLINE_FROM_TOP);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.WAVYLINE_FROM_RIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.WAVYLINE_FROM_BOTTOM);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.SPIRALIN_LEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.SPIRALIN_RIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.SPIRALOUT_LEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.SPIRALOUT_RIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.ROLL_FROM_TOP);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.ROLL_FROM_LEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.ROLL_FROM_RIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.ROLL_FROM_BOTTOM);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.STRETCH_FROM_LEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.STRETCH_FROM_TOP);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.STRETCH_FROM_RIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.STRETCH_FROM_BOTTOM);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.VERTICAL_LINES);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.HORIZONTAL_LINES);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.DISSOLVE);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.RANDOM);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.VERTICAL_CHECKERBOARD);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.HORIZONTAL_CHECKERBOARD);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.INTERLOCKING_HORIZONTAL_LEFT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.INTERLOCKING_HORIZONTAL_RIGHT);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.INTERLOCKING_VERTICAL_TOP);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.INTERLOCKING_VERTICAL_BOTTOM);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.FLY_AWAY);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.OPEN);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.CLOSE);
		addEEnumLiteral(transitionStyleTypeEEnum, TransitionStyleType.MELT);

		initEEnum(transitionTypeTypeEEnum, TransitionTypeType.class, "TransitionTypeType");
		addEEnumLiteral(transitionTypeTypeEEnum, TransitionTypeType.MANUAL);
		addEEnumLiteral(transitionTypeTypeEEnum, TransitionTypeType.AUTOMATIC);
		addEEnumLiteral(transitionTypeTypeEEnum, TransitionTypeType.SEMI_AUTOMATIC);

		initEEnum(visibilityTypeEEnum, VisibilityType.class, "VisibilityType");
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.VISIBLE);
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.HIDDEN);

		// Initialize data types
		initEDataType(actionTypeObjectEDataType, ActionType.class, "ActionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(animationsTypeObjectEDataType, AnimationsType.class, "AnimationsTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nodeTypeTypeObjectEDataType, NodeTypeType.class, "NodeTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(presentationPageLayoutNameTypeEDataType, String.class, "PresentationPageLayoutNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(presentationPageLayoutNameTypeMember1EDataType, String.class, "PresentationPageLayoutNameTypeMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(presetClassTypeObjectEDataType, PresetClassType.class, "PresetClassTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sourceTypeObjectEDataType, SourceType.class, "SourceTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleNameTypeEDataType, String.class, "StyleNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleNameTypeMember1EDataType, String.class, "StyleNameTypeMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transitionOnClickTypeObjectEDataType, TransitionOnClickType.class, "TransitionOnClickTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transitionStyleTypeObjectEDataType, TransitionStyleType.class, "TransitionStyleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transitionTypeTypeObjectEDataType, TransitionTypeType.class, "TransitionTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(visibilityTypeObjectEDataType, VisibilityType.class, "VisibilityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (actionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "action_._type"
		   });		
		addAnnotation
		  (actionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "action_._type:Object",
			 "baseType", "action_._type"
		   });		
		addAnnotation
		  (animationGroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "animation-group_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAnimationGroupType_PresentationAnimationElementsGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "presentation-animation-elements:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getAnimationGroupType_PresentationAnimationElements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "presentation-animation-elements",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements:group"
		   });		
		addAnnotation
		  (animationsTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "animations_._type"
		   });		
		addAnnotation
		  (animationsType1EClass, 
		   source, 
		   new String[] {
			 "name", "animations_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAnimationsType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getAnimationsType1_PresentationAnimationElementsGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "presentation-animation-elements:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAnimationsType1_PresentationAnimationElements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "presentation-animation-elements",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements:group"
		   });		
		addAnnotation
		  (getAnimationsType1_AnimationGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animation-group",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (animationsTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "animations_._type:Object",
			 "baseType", "animations_._type"
		   });		
		addAnnotation
		  (dateTimeDeclTypeEClass, 
		   source, 
		   new String[] {
			 "name", "date-time-decl_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDateTimeDeclType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDateTimeDeclType_DataStyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data-style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getDateTimeDeclType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateTimeDeclType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dateTimeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "date-time_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (dimTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dim_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDimType_Sound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDimType_Color(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getDimType_ShapeId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shape-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (eventListenerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "event-listener_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEventListenerType_Sound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventListenerType_Action(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "action",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventListenerType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getEventListenerType_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventListenerType_Effect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "effect",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventListenerType_EventName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "event-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:script:1.0"
		   });		
		addAnnotation
		  (getEventListenerType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getEventListenerType_Show(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getEventListenerType_Speed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventListenerType_StartScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEventListenerType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getEventListenerType_Verb(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "verb",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (footerDeclTypeEClass, 
		   source, 
		   new String[] {
			 "name", "footer-decl_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getFooterDeclType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getFooterDeclType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (footerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "footer_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (headerDeclTypeEClass, 
		   source, 
		   new String[] {
			 "name", "header-decl_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getHeaderDeclType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getHeaderDeclType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (headerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "header_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (hideShapeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "hide-shape_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHideShapeType_Sound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideShapeType_Delay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "delay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideShapeType_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideShapeType_Effect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "effect",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideShapeType_PathId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path-id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideShapeType_ShapeId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shape-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getHideShapeType_Speed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideShapeType_StartScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (hideTextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "hide-text_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHideTextType_Sound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideTextType_Delay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "delay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideTextType_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideTextType_Effect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "effect",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideTextType_PathId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path-id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideTextType_ShapeId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shape-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getHideTextType_Speed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHideTextType_StartScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (nodeTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "node-type_._type"
		   });		
		addAnnotation
		  (nodeTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "node-type_._type:Object",
			 "baseType", "node-type_._type"
		   });		
		addAnnotation
		  (notesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "notes_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNotesType_Forms(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "forms",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:office:1.0"
		   });		
		addAnnotation
		  (getNotesType_Shape(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Rect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rect",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Line(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "line",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Polyline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "polyline",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Polygon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "polygon",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_RegularPolygon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "regular-polygon",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Path(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "path",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Circle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "circle",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Ellipse(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ellipse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_G(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "g",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_PageThumbnail(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page-thumbnail",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Frame(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "frame",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Measure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "measure",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Caption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "caption",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Connector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connector",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Control(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "control",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_Scene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scene",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_CustomShape(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "custom-shape",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0",
			 "group", "#Shape:1"
		   });		
		addAnnotation
		  (getNotesType_PageLayoutName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "page-layout-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getNotesType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getNotesType_UseDateTimeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-date-time-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNotesType_UseFooterName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-footer-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNotesType_UseHeaderName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-header-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (placeholderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "placeholder_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPlaceholderType_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getPlaceholderType_Object(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlaceholderType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getPlaceholderType_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getPlaceholderType_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (playTypeEClass, 
		   source, 
		   new String[] {
			 "name", "play_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPlayType_ShapeId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shape-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getPlayType_Speed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (presentationPageLayoutNameTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "presentation-page-layout-name_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef presentation-page-layout-name_._type_._member_._1"
		   });		
		addAnnotation
		  (presentationPageLayoutNameTypeMember1EDataType, 
		   source, 
		   new String[] {
			 "name", "presentation-page-layout-name_._type_._member_._1",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "length", "0"
		   });		
		addAnnotation
		  (presetClassTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "preset-class_._type"
		   });		
		addAnnotation
		  (presetClassTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "preset-class_._type:Object",
			 "baseType", "preset-class_._type"
		   });		
		addAnnotation
		  (settingsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "settings_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSettingsType_Show(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "show",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_Animations(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "animations",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_Endless(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endless",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_ForceManual(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "force-manual",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_FullScreen(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "full-screen",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_MouseAsPen(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mouse-as-pen",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_MouseVisible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mouse-visible",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_Pause(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_Show1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_ShowEndOfPresentationSlide(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show-end-of-presentation-slide",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_ShowLogo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show-logo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_StartPage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-page",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_StartWithNavigator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-with-navigator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_StayOnTop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stay-on-top",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSettingsType_TransitionOnClick(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transition-on-click",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (showShapeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "show-shape_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getShowShapeType_Sound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowShapeType_Delay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "delay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowShapeType_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowShapeType_Effect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "effect",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowShapeType_PathId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path-id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowShapeType_ShapeId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shape-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getShowShapeType_Speed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowShapeType_StartScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (showTextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "show-text_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getShowTextType_Sound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowTextType_Delay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "delay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowTextType_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowTextType_Effect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "effect",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowTextType_PathId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path-id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowTextType_ShapeId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shape-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getShowTextType_Speed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowTextType_StartScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (showTypeEClass, 
		   source, 
		   new String[] {
			 "name", "show_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getShowType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getShowType_Pages(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pages",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (soundTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sound_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSoundType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getSoundType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getSoundType_PlayFull(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "play-full",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSoundType_Show(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getSoundType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (sourceTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "source_._type"
		   });		
		addAnnotation
		  (sourceTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "source_._type:Object",
			 "baseType", "source_._type"
		   });		
		addAnnotation
		  (styleNameTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "style-name_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#styleNameRef style-name_._type_._member_._1"
		   });		
		addAnnotation
		  (styleNameTypeMember1EDataType, 
		   source, 
		   new String[] {
			 "name", "style-name_._type_._member_._1",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "length", "0"
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
		  (getDocumentRoot_AnimationGroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animation-group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Animations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animations",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DateTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date-time",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DateTimeDecl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date-time-decl",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-decl"
		   });		
		addAnnotation
		  (getDocumentRoot_Dim(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dim",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements"
		   });		
		addAnnotation
		  (getDocumentRoot_EventListener(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "event-listener",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Footer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "footer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FooterDecl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "footer-decl",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-decl"
		   });		
		addAnnotation
		  (getDocumentRoot_Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HeaderDecl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "header-decl",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-decl"
		   });		
		addAnnotation
		  (getDocumentRoot_HideShape(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hide-shape",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements"
		   });		
		addAnnotation
		  (getDocumentRoot_HideText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hide-text",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements"
		   });		
		addAnnotation
		  (getDocumentRoot_Notes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "notes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Placeholder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "placeholder",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Play(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "play",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements"
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
		  (getDocumentRoot_Show(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "show",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ShowShape(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "show-shape",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements"
		   });		
		addAnnotation
		  (getDocumentRoot_ShowText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "show-text",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements"
		   });		
		addAnnotation
		  (getDocumentRoot_Sound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Action(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "action",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Animations1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "animations",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BackgroundObjectsVisible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "background-objects-visible",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BackgroundVisible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "background-visible",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ClassNames(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Delay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "delay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DisplayDateTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display-date-time",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DisplayFooter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display-footer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DisplayHeader(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display-header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DisplayPageNumber(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display-page-number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Duration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "duration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Effect(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "effect",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Endless(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endless",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ForceManual(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "force-manual",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FullScreen(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "full-screen",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GroupId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MasterElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "master-element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MouseAsPen(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mouse-as-pen",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MouseVisible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mouse-visible",
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
		  (getDocumentRoot_NodeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "node-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Pages(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pages",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PathId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path-id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Pause(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pause",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Placeholder1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "placeholder",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PlayFull(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "play-full",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PresentationPageLayoutName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "presentation-page-layout-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PresetClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PresetId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PresetSubType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-sub-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Show1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ShowEndOfPresentationSlide(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show-end-of-presentation-slide",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ShowLogo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show-logo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Speed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StartPage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-page",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StartScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StartWithNavigator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-with-navigator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StayOnTop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stay-on-top",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransitionOnClick(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transition-on-click",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransitionSpeed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transition-speed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransitionStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transition-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransitionType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transition-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UseDateTimeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-date-time-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UseFooterName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-footer-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UseHeaderName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "use-header-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UserTransformed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "user-transformed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Verb(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "verb",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Visibility(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visibility",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (transitionOnClickTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "transition-on-click_._type"
		   });		
		addAnnotation
		  (transitionOnClickTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "transition-on-click_._type:Object",
			 "baseType", "transition-on-click_._type"
		   });		
		addAnnotation
		  (transitionStyleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "transition-style_._type"
		   });		
		addAnnotation
		  (transitionStyleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "transition-style_._type:Object",
			 "baseType", "transition-style_._type"
		   });		
		addAnnotation
		  (transitionTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "transition-type_._type"
		   });		
		addAnnotation
		  (transitionTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "transition-type_._type:Object",
			 "baseType", "transition-type_._type"
		   });		
		addAnnotation
		  (visibilityTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "visibility_._type"
		   });		
		addAnnotation
		  (visibilityTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "visibility_._type:Object",
			 "baseType", "visibility_._type"
		   });
	}

} //PresentationPackageImpl
