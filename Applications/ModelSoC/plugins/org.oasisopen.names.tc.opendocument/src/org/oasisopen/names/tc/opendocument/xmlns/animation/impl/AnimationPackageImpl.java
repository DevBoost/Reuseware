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
package org.oasisopen.names.tc.opendocument.xmlns.animation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateColorType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateMotionType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateTransformType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimateType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationFactory;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.animation.AudioType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationDirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ColorInterpolationType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.CommandType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.animation.IterateType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ParType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.ParamType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.SeqType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.SetType;
import org.oasisopen.names.tc.opendocument.xmlns.animation.TransitionFilterType;
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
public class AnimationPackageImpl extends EPackageImpl implements AnimationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animateColorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animateMotionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animateTransformTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandTypeEClass = null;

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
	private EClass iterateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorInterpolationDirectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorInterpolationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorInterpolationDirectionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorInterpolationTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.animation.AnimationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnimationPackageImpl() {
		super(eNS_URI, AnimationFactory.eINSTANCE);
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
	public static AnimationPackage init() {
		if (isInited) return (AnimationPackage)EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI);

		// Obtain or create and register package
		AnimationPackageImpl theAnimationPackage = (AnimationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AnimationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AnimationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DrawingPackageImpl theDrawingPackage = (DrawingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) instanceof DrawingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DrawingPackage.eNS_URI) : DrawingPackage.eINSTANCE);
		TextPackageImpl theTextPackage = (TextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) instanceof TextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI) : TextPackage.eINSTANCE);
		OfficePackageImpl theOfficePackage = (OfficePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI) instanceof OfficePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OfficePackage.eNS_URI) : OfficePackage.eINSTANCE);
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
		theAnimationPackage.createPackageContents();
		theOfficePackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theXLinkPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
		theSvgPackage.createPackageContents();
		theDr3dPackage.createPackageContents();
		theFoPackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theDatastylePackage.createPackageContents();
		theCompatiblePackage.createPackageContents();
		theMetaPackage.createPackageContents();
		theChartPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theMathMLPackage.createPackageContents();
		theXFormsPackage.createPackageContents();

		// Initialize created meta-data
		theAnimationPackage.initializePackageContents();
		theOfficePackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theXLinkPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
		theSvgPackage.initializePackageContents();
		theDr3dPackage.initializePackageContents();
		theFoPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theDatastylePackage.initializePackageContents();
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
		theAnimationPackage.freeze();

		return theAnimationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimateColorType() {
		return animateColorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Accelerate() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Accumulate() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Additive() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_AttributeName() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_AutoReverse() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Begin() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_By() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_CalcMode() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_ColorInterpolation() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_ColorInterpolationDirection() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Decelerate() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Dur() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_End() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Fill() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_FillDefault() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Formula() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_From() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_KeySplines() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_KeyTimes() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_RepeatCount() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_RepeatDur() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Restart() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_RestartDefault() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_SubItem() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_TargetElement() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_To() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateColorType_Values() {
		return (EAttribute)animateColorTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimateMotionType() {
		return animateMotionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Accelerate() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Accumulate() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Additive() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_AttributeName() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_AutoReverse() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Begin() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_By() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_CalcMode() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Decelerate() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Dur() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_End() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Fill() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_FillDefault() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Formula() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_From() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_KeySplines() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_KeyTimes() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Origin() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Path() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_RepeatCount() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_RepeatDur() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Restart() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_RestartDefault() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_SubItem() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_TargetElement() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_To() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateMotionType_Values() {
		return (EAttribute)animateMotionTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimateTransformType() {
		return animateTransformTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Accelerate() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Accumulate() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Additive() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_AttributeName() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_AutoReverse() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Begin() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_By() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Decelerate() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Dur() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_End() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Fill() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_FillDefault() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Formula() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_From() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_RepeatCount() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_RepeatDur() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Restart() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_RestartDefault() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_SubItem() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_TargetElement() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_To() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Type() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateTransformType_Values() {
		return (EAttribute)animateTransformTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimateType() {
		return animateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Accelerate() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Accumulate() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Additive() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_AttributeName() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_AutoReverse() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Begin() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_By() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_CalcMode() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Decelerate() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Dur() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_End() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Fill() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_FillDefault() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Formula() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_From() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_KeySplines() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_KeyTimes() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_RepeatCount() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_RepeatDur() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Restart() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_RestartDefault() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_SubItem() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_TargetElement() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_To() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimateType_Values() {
		return (EAttribute)animateTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioType() {
		return audioTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_AudioLevel() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_Begin() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_Dur() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_End() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_GroupId() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_Href() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_Id() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_MasterElement() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_NodeType() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_PresetClass() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_PresetId() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_PresetSubType() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_RepeatCount() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioType_RepeatDur() {
		return (EAttribute)audioTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandType() {
		return commandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandType_Param() {
		return (EReference)commandTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_Begin() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_Command() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_End() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_GroupId() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_Id() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_MasterElement() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_NodeType() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_PresetClass() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_PresetId() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_PresetSubType() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_SubItem() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_TargetElement() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(12);
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
	public EReference getDocumentRoot_Animate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnimateColor() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnimateMotion() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AnimateTransform() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Audio() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Command() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Iterate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Par() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Param() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Seq() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Set() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransitionFilter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AudioLevel() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ColorInterpolation() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ColorInterpolationDirection() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Command1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Formula() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Id() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IterateInterval() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IterateType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SubItem() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterateType() {
		return iterateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_AnimationElementGroup() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterateType_AnimationElement() {
		return (EReference)iterateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_Accelerate() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_AutoReverse() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_Begin() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_Decelerate() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_Dur() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_End() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_Endsync() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_Fill() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_FillDefault() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_GroupId() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_Id() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_IterateInterval() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_IterateType() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_MasterElement() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_NodeType() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_PresetClass() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_PresetId() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_PresetSubType() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_RepeatCount() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_RepeatDur() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_Restart() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_RestartDefault() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_SubItem() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterateType_TargetElement() {
		return (EAttribute)iterateTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType() {
		return paramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Name() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Value() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParType() {
		return parTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_AnimationElementGroup() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParType_AnimationElement() {
		return (EReference)parTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_Accelerate() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_AutoReverse() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_Begin() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_Decelerate() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_Dur() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_End() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_Endsync() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_Fill() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_FillDefault() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_GroupId() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_Id() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_MasterElement() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_NodeType() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_PresetClass() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_PresetId() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_PresetSubType() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_RepeatCount() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_RepeatDur() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_Restart() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParType_RestartDefault() {
		return (EAttribute)parTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeqType() {
		return seqTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_AnimationElementGroup() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeqType_AnimationElement() {
		return (EReference)seqTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_Accelerate() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_AutoReverse() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_Begin() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_Decelerate() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_Dur() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_End() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_Endsync() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_Fill() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_FillDefault() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_GroupId() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_Id() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_MasterElement() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_NodeType() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_PresetClass() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_PresetId() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_PresetSubType() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_RepeatCount() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_RepeatDur() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_Restart() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeqType_RestartDefault() {
		return (EAttribute)seqTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetType() {
		return setTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Accelerate() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Accumulate() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Additive() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_AttributeName() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_AutoReverse() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Begin() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Decelerate() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Dur() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_End() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Fill() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_FillDefault() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_RepeatCount() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_RepeatDur() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Restart() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_RestartDefault() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_SubItem() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_TargetElement() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_To() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionFilterType() {
		return transitionFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Accelerate() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Accumulate() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Additive() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_AutoReverse() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Begin() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_By() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_CalcMode() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Decelerate() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Direction() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Dur() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_End() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_FadeColor() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Fill() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_FillDefault() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Formula() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_From() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Mode() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_RepeatCount() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_RepeatDur() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Restart() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_RestartDefault() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_SubItem() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Subtype() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_TargetElement() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_To() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Type() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFilterType_Values() {
		return (EAttribute)transitionFilterTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorInterpolationDirectionType() {
		return colorInterpolationDirectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorInterpolationType() {
		return colorInterpolationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorInterpolationDirectionTypeObject() {
		return colorInterpolationDirectionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorInterpolationTypeObject() {
		return colorInterpolationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationFactory getAnimationFactory() {
		return (AnimationFactory)getEFactoryInstance();
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
		animateColorTypeEClass = createEClass(ANIMATE_COLOR_TYPE);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__ACCELERATE);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__ACCUMULATE);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__ADDITIVE);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__ATTRIBUTE_NAME);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__AUTO_REVERSE);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__BEGIN);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__BY);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__CALC_MODE);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__COLOR_INTERPOLATION);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__COLOR_INTERPOLATION_DIRECTION);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__DECELERATE);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__DUR);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__END);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__FILL);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__FILL_DEFAULT);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__FORMULA);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__FROM);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__KEY_SPLINES);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__KEY_TIMES);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__REPEAT_COUNT);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__REPEAT_DUR);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__RESTART);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__RESTART_DEFAULT);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__SUB_ITEM);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__TARGET_ELEMENT);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__TO);
		createEAttribute(animateColorTypeEClass, ANIMATE_COLOR_TYPE__VALUES);

		animateMotionTypeEClass = createEClass(ANIMATE_MOTION_TYPE);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__ACCELERATE);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__ACCUMULATE);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__ADDITIVE);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__ATTRIBUTE_NAME);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__AUTO_REVERSE);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__BEGIN);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__BY);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__CALC_MODE);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__DECELERATE);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__DUR);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__END);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__FILL);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__FILL_DEFAULT);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__FORMULA);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__FROM);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__KEY_SPLINES);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__KEY_TIMES);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__ORIGIN);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__PATH);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__REPEAT_COUNT);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__REPEAT_DUR);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__RESTART);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__RESTART_DEFAULT);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__SUB_ITEM);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__TARGET_ELEMENT);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__TO);
		createEAttribute(animateMotionTypeEClass, ANIMATE_MOTION_TYPE__VALUES);

		animateTransformTypeEClass = createEClass(ANIMATE_TRANSFORM_TYPE);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__ACCELERATE);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__ACCUMULATE);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__ADDITIVE);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__ATTRIBUTE_NAME);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__AUTO_REVERSE);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__BEGIN);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__BY);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__DECELERATE);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__DUR);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__END);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__FILL);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__FILL_DEFAULT);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__FORMULA);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__FROM);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__REPEAT_COUNT);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__REPEAT_DUR);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__RESTART);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__RESTART_DEFAULT);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__SUB_ITEM);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__TARGET_ELEMENT);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__TO);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__TYPE);
		createEAttribute(animateTransformTypeEClass, ANIMATE_TRANSFORM_TYPE__VALUES);

		animateTypeEClass = createEClass(ANIMATE_TYPE);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__ACCELERATE);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__ACCUMULATE);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__ADDITIVE);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__ATTRIBUTE_NAME);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__AUTO_REVERSE);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__BEGIN);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__BY);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__CALC_MODE);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__DECELERATE);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__DUR);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__END);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__FILL);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__FILL_DEFAULT);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__FORMULA);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__FROM);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__KEY_SPLINES);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__KEY_TIMES);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__REPEAT_COUNT);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__REPEAT_DUR);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__RESTART);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__RESTART_DEFAULT);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__SUB_ITEM);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__TARGET_ELEMENT);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__TO);
		createEAttribute(animateTypeEClass, ANIMATE_TYPE__VALUES);

		audioTypeEClass = createEClass(AUDIO_TYPE);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__AUDIO_LEVEL);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__BEGIN);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__DUR);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__END);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__GROUP_ID);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__HREF);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__ID);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__MASTER_ELEMENT);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__NODE_TYPE);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__PRESET_CLASS);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__PRESET_ID);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__PRESET_SUB_TYPE);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__REPEAT_COUNT);
		createEAttribute(audioTypeEClass, AUDIO_TYPE__REPEAT_DUR);

		commandTypeEClass = createEClass(COMMAND_TYPE);
		createEReference(commandTypeEClass, COMMAND_TYPE__PARAM);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__BEGIN);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__COMMAND);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__END);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__GROUP_ID);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__ID);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__MASTER_ELEMENT);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__NODE_TYPE);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__PRESET_CLASS);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__PRESET_ID);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__PRESET_SUB_TYPE);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__SUB_ITEM);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__TARGET_ELEMENT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANIMATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANIMATE_COLOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANIMATE_MOTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANIMATE_TRANSFORM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUDIO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMMAND);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ITERATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PAR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARAM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SEQ);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSITION_FILTER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUDIO_LEVEL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COLOR_INTERPOLATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COLOR_INTERPOLATION_DIRECTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COMMAND1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FORMULA);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ITERATE_INTERVAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ITERATE_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SUB_ITEM);

		iterateTypeEClass = createEClass(ITERATE_TYPE);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__ANIMATION_ELEMENT_GROUP);
		createEReference(iterateTypeEClass, ITERATE_TYPE__ANIMATION_ELEMENT);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__ACCELERATE);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__AUTO_REVERSE);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__BEGIN);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__DECELERATE);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__DUR);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__END);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__ENDSYNC);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__FILL);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__FILL_DEFAULT);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__GROUP_ID);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__ID);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__ITERATE_INTERVAL);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__ITERATE_TYPE);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__MASTER_ELEMENT);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__NODE_TYPE);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__PRESET_CLASS);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__PRESET_ID);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__PRESET_SUB_TYPE);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__REPEAT_COUNT);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__REPEAT_DUR);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__RESTART);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__RESTART_DEFAULT);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__SUB_ITEM);
		createEAttribute(iterateTypeEClass, ITERATE_TYPE__TARGET_ELEMENT);

		paramTypeEClass = createEClass(PARAM_TYPE);
		createEAttribute(paramTypeEClass, PARAM_TYPE__NAME);
		createEAttribute(paramTypeEClass, PARAM_TYPE__VALUE);

		parTypeEClass = createEClass(PAR_TYPE);
		createEAttribute(parTypeEClass, PAR_TYPE__ANIMATION_ELEMENT_GROUP);
		createEReference(parTypeEClass, PAR_TYPE__ANIMATION_ELEMENT);
		createEAttribute(parTypeEClass, PAR_TYPE__ACCELERATE);
		createEAttribute(parTypeEClass, PAR_TYPE__AUTO_REVERSE);
		createEAttribute(parTypeEClass, PAR_TYPE__BEGIN);
		createEAttribute(parTypeEClass, PAR_TYPE__DECELERATE);
		createEAttribute(parTypeEClass, PAR_TYPE__DUR);
		createEAttribute(parTypeEClass, PAR_TYPE__END);
		createEAttribute(parTypeEClass, PAR_TYPE__ENDSYNC);
		createEAttribute(parTypeEClass, PAR_TYPE__FILL);
		createEAttribute(parTypeEClass, PAR_TYPE__FILL_DEFAULT);
		createEAttribute(parTypeEClass, PAR_TYPE__GROUP_ID);
		createEAttribute(parTypeEClass, PAR_TYPE__ID);
		createEAttribute(parTypeEClass, PAR_TYPE__MASTER_ELEMENT);
		createEAttribute(parTypeEClass, PAR_TYPE__NODE_TYPE);
		createEAttribute(parTypeEClass, PAR_TYPE__PRESET_CLASS);
		createEAttribute(parTypeEClass, PAR_TYPE__PRESET_ID);
		createEAttribute(parTypeEClass, PAR_TYPE__PRESET_SUB_TYPE);
		createEAttribute(parTypeEClass, PAR_TYPE__REPEAT_COUNT);
		createEAttribute(parTypeEClass, PAR_TYPE__REPEAT_DUR);
		createEAttribute(parTypeEClass, PAR_TYPE__RESTART);
		createEAttribute(parTypeEClass, PAR_TYPE__RESTART_DEFAULT);

		seqTypeEClass = createEClass(SEQ_TYPE);
		createEAttribute(seqTypeEClass, SEQ_TYPE__ANIMATION_ELEMENT_GROUP);
		createEReference(seqTypeEClass, SEQ_TYPE__ANIMATION_ELEMENT);
		createEAttribute(seqTypeEClass, SEQ_TYPE__ACCELERATE);
		createEAttribute(seqTypeEClass, SEQ_TYPE__AUTO_REVERSE);
		createEAttribute(seqTypeEClass, SEQ_TYPE__BEGIN);
		createEAttribute(seqTypeEClass, SEQ_TYPE__DECELERATE);
		createEAttribute(seqTypeEClass, SEQ_TYPE__DUR);
		createEAttribute(seqTypeEClass, SEQ_TYPE__END);
		createEAttribute(seqTypeEClass, SEQ_TYPE__ENDSYNC);
		createEAttribute(seqTypeEClass, SEQ_TYPE__FILL);
		createEAttribute(seqTypeEClass, SEQ_TYPE__FILL_DEFAULT);
		createEAttribute(seqTypeEClass, SEQ_TYPE__GROUP_ID);
		createEAttribute(seqTypeEClass, SEQ_TYPE__ID);
		createEAttribute(seqTypeEClass, SEQ_TYPE__MASTER_ELEMENT);
		createEAttribute(seqTypeEClass, SEQ_TYPE__NODE_TYPE);
		createEAttribute(seqTypeEClass, SEQ_TYPE__PRESET_CLASS);
		createEAttribute(seqTypeEClass, SEQ_TYPE__PRESET_ID);
		createEAttribute(seqTypeEClass, SEQ_TYPE__PRESET_SUB_TYPE);
		createEAttribute(seqTypeEClass, SEQ_TYPE__REPEAT_COUNT);
		createEAttribute(seqTypeEClass, SEQ_TYPE__REPEAT_DUR);
		createEAttribute(seqTypeEClass, SEQ_TYPE__RESTART);
		createEAttribute(seqTypeEClass, SEQ_TYPE__RESTART_DEFAULT);

		setTypeEClass = createEClass(SET_TYPE);
		createEAttribute(setTypeEClass, SET_TYPE__ACCELERATE);
		createEAttribute(setTypeEClass, SET_TYPE__ACCUMULATE);
		createEAttribute(setTypeEClass, SET_TYPE__ADDITIVE);
		createEAttribute(setTypeEClass, SET_TYPE__ATTRIBUTE_NAME);
		createEAttribute(setTypeEClass, SET_TYPE__AUTO_REVERSE);
		createEAttribute(setTypeEClass, SET_TYPE__BEGIN);
		createEAttribute(setTypeEClass, SET_TYPE__DECELERATE);
		createEAttribute(setTypeEClass, SET_TYPE__DUR);
		createEAttribute(setTypeEClass, SET_TYPE__END);
		createEAttribute(setTypeEClass, SET_TYPE__FILL);
		createEAttribute(setTypeEClass, SET_TYPE__FILL_DEFAULT);
		createEAttribute(setTypeEClass, SET_TYPE__REPEAT_COUNT);
		createEAttribute(setTypeEClass, SET_TYPE__REPEAT_DUR);
		createEAttribute(setTypeEClass, SET_TYPE__RESTART);
		createEAttribute(setTypeEClass, SET_TYPE__RESTART_DEFAULT);
		createEAttribute(setTypeEClass, SET_TYPE__SUB_ITEM);
		createEAttribute(setTypeEClass, SET_TYPE__TARGET_ELEMENT);
		createEAttribute(setTypeEClass, SET_TYPE__TO);

		transitionFilterTypeEClass = createEClass(TRANSITION_FILTER_TYPE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__ACCELERATE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__ACCUMULATE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__ADDITIVE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__AUTO_REVERSE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__BEGIN);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__BY);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__CALC_MODE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__DECELERATE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__DIRECTION);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__DUR);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__END);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__FADE_COLOR);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__FILL);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__FILL_DEFAULT);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__FORMULA);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__FROM);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__MODE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__REPEAT_COUNT);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__REPEAT_DUR);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__RESTART);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__RESTART_DEFAULT);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__SUB_ITEM);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__SUBTYPE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__TARGET_ELEMENT);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__TO);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__TYPE);
		createEAttribute(transitionFilterTypeEClass, TRANSITION_FILTER_TYPE__VALUES);

		// Create enums
		colorInterpolationDirectionTypeEEnum = createEEnum(COLOR_INTERPOLATION_DIRECTION_TYPE);
		colorInterpolationTypeEEnum = createEEnum(COLOR_INTERPOLATION_TYPE);

		// Create data types
		colorInterpolationDirectionTypeObjectEDataType = createEDataType(COLOR_INTERPOLATION_DIRECTION_TYPE_OBJECT);
		colorInterpolationTypeObjectEDataType = createEDataType(COLOR_INTERPOLATION_TYPE_OBJECT);
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
		CompatiblePackage theCompatiblePackage = (CompatiblePackage)EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI);
		SvgPackage theSvgPackage = (SvgPackage)EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI);
		PresentationPackage thePresentationPackage = (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(animateColorTypeEClass, AnimateColorType.class, "AnimateColorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimateColorType_Accelerate(), theTextPackage.getDouble(), "accelerate", "0.0", 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_Accumulate(), theCompatiblePackage.getAccumulateType(), "accumulate", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_Additive(), theCompatiblePackage.getAdditiveType(), "additive", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_AttributeName(), theTextPackage.getString(), "attributeName", null, 1, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", "false", 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_By(), theTextPackage.getString(), "by", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_CalcMode(), theCompatiblePackage.getCalcModeType(), "calcMode", "discrete", 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_ColorInterpolation(), this.getColorInterpolationType(), "colorInterpolation", "rgb", 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_ColorInterpolationDirection(), this.getColorInterpolationDirectionType(), "colorInterpolationDirection", "clockwise", 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_Decelerate(), theTextPackage.getDouble(), "decelerate", "0.0", 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_End(), theTextPackage.getString(), "end", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_Fill(), theCompatiblePackage.getFillType(), "fill", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_FillDefault(), theCompatiblePackage.getFillDefaultType(), "fillDefault", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_Formula(), theTextPackage.getString(), "formula", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_From(), theTextPackage.getString(), "from", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_KeySplines(), theTextPackage.getString(), "keySplines", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_KeyTimes(), theTextPackage.getString(), "keyTimes", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_Restart(), theCompatiblePackage.getRestartType(), "restart", "default", 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_RestartDefault(), theCompatiblePackage.getRestartDefaultType(), "restartDefault", "inherit", 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_SubItem(), theTextPackage.getString(), "subItem", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_TargetElement(), theTextPackage.getIDREF(), "targetElement", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_To(), theTextPackage.getString(), "to", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateColorType_Values(), theTextPackage.getString(), "values", null, 0, 1, AnimateColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animateMotionTypeEClass, AnimateMotionType.class, "AnimateMotionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimateMotionType_Accelerate(), theTextPackage.getDouble(), "accelerate", "0.0", 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Accumulate(), theCompatiblePackage.getAccumulateType(), "accumulate", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Additive(), theCompatiblePackage.getAdditiveType(), "additive", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_AttributeName(), theTextPackage.getString(), "attributeName", null, 1, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", "false", 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_By(), theTextPackage.getString(), "by", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_CalcMode(), theCompatiblePackage.getCalcModeType(), "calcMode", "paced", 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Decelerate(), theTextPackage.getDouble(), "decelerate", "0.0", 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_End(), theTextPackage.getString(), "end", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Fill(), theCompatiblePackage.getFillType(), "fill", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_FillDefault(), theCompatiblePackage.getFillDefaultType(), "fillDefault", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Formula(), theTextPackage.getString(), "formula", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_From(), theTextPackage.getString(), "from", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_KeySplines(), theTextPackage.getString(), "keySplines", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_KeyTimes(), theTextPackage.getString(), "keyTimes", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Origin(), theTextPackage.getString(), "origin", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Path(), theTextPackage.getPathData(), "path", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Restart(), theCompatiblePackage.getRestartType(), "restart", "default", 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_RestartDefault(), theCompatiblePackage.getRestartDefaultType(), "restartDefault", "inherit", 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_SubItem(), theTextPackage.getString(), "subItem", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_TargetElement(), theTextPackage.getIDREF(), "targetElement", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_To(), theTextPackage.getString(), "to", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateMotionType_Values(), theTextPackage.getString(), "values", null, 0, 1, AnimateMotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animateTransformTypeEClass, AnimateTransformType.class, "AnimateTransformType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimateTransformType_Accelerate(), theTextPackage.getDouble(), "accelerate", "0.0", 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Accumulate(), theCompatiblePackage.getAccumulateType(), "accumulate", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Additive(), theCompatiblePackage.getAdditiveType(), "additive", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_AttributeName(), theTextPackage.getString(), "attributeName", null, 1, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", "false", 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_By(), theTextPackage.getString(), "by", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Decelerate(), theTextPackage.getDouble(), "decelerate", "0.0", 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_End(), theTextPackage.getString(), "end", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Fill(), theCompatiblePackage.getFillType(), "fill", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_FillDefault(), theCompatiblePackage.getFillDefaultType(), "fillDefault", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Formula(), theTextPackage.getString(), "formula", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_From(), theTextPackage.getString(), "from", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Restart(), theCompatiblePackage.getRestartType(), "restart", "default", 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_RestartDefault(), theCompatiblePackage.getRestartDefaultType(), "restartDefault", "inherit", 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_SubItem(), theTextPackage.getString(), "subItem", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_TargetElement(), theTextPackage.getIDREF(), "targetElement", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_To(), theTextPackage.getString(), "to", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Type(), theSvgPackage.getTypeType(), "type", null, 1, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateTransformType_Values(), theTextPackage.getString(), "values", null, 0, 1, AnimateTransformType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(animateTypeEClass, AnimateType.class, "AnimateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimateType_Accelerate(), theTextPackage.getDouble(), "accelerate", "0.0", 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_Accumulate(), theCompatiblePackage.getAccumulateType(), "accumulate", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_Additive(), theCompatiblePackage.getAdditiveType(), "additive", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_AttributeName(), theTextPackage.getString(), "attributeName", null, 1, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", "false", 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_By(), theTextPackage.getString(), "by", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_CalcMode(), theCompatiblePackage.getCalcModeType(), "calcMode", "discrete", 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_Decelerate(), theTextPackage.getDouble(), "decelerate", "0.0", 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_End(), theTextPackage.getString(), "end", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_Fill(), theCompatiblePackage.getFillType(), "fill", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_FillDefault(), theCompatiblePackage.getFillDefaultType(), "fillDefault", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_Formula(), theTextPackage.getString(), "formula", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_From(), theTextPackage.getString(), "from", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_KeySplines(), theTextPackage.getString(), "keySplines", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_KeyTimes(), theTextPackage.getString(), "keyTimes", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_Restart(), theCompatiblePackage.getRestartType(), "restart", "default", 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_RestartDefault(), theCompatiblePackage.getRestartDefaultType(), "restartDefault", "inherit", 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_SubItem(), theTextPackage.getString(), "subItem", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_TargetElement(), theTextPackage.getIDREF(), "targetElement", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_To(), theTextPackage.getString(), "to", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimateType_Values(), theTextPackage.getString(), "values", null, 0, 1, AnimateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioTypeEClass, AudioType.class, "AudioType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioType_AudioLevel(), theTextPackage.getDouble(), "audioLevel", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_End(), theTextPackage.getString(), "end", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_GroupId(), theTextPackage.getString(), "groupId", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_Href(), theTextPackage.getAnyURI(), "href", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_Id(), theTextPackage.getID(), "id", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_MasterElement(), theTextPackage.getIDREF(), "masterElement", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_NodeType(), thePresentationPackage.getNodeTypeType(), "nodeType", "default", 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_PresetClass(), thePresentationPackage.getPresetClassType(), "presetClass", "custom", 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_PresetId(), theTextPackage.getString(), "presetId", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_PresetSubType(), theTextPackage.getString(), "presetSubType", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, AudioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandTypeEClass, CommandType.class, "CommandType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandType_Param(), this.getParamType(), null, "param", null, 0, -1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_Command(), theTextPackage.getString(), "command", null, 1, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_End(), theTextPackage.getString(), "end", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_GroupId(), theTextPackage.getString(), "groupId", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_Id(), theTextPackage.getID(), "id", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_MasterElement(), theTextPackage.getIDREF(), "masterElement", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_NodeType(), thePresentationPackage.getNodeTypeType(), "nodeType", "default", 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_PresetClass(), thePresentationPackage.getPresetClassType(), "presetClass", "custom", 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_PresetId(), theTextPackage.getString(), "presetId", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_PresetSubType(), theTextPackage.getString(), "presetSubType", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_SubItem(), theTextPackage.getString(), "subItem", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandType_TargetElement(), theTextPackage.getIDREF(), "targetElement", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Animate(), this.getAnimateType(), null, "animate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AnimateColor(), this.getAnimateColorType(), null, "animateColor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AnimateMotion(), this.getAnimateMotionType(), null, "animateMotion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AnimateTransform(), this.getAnimateTransformType(), null, "animateTransform", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Audio(), this.getAudioType(), null, "audio", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Command(), this.getCommandType(), null, "command", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Iterate(), this.getIterateType(), null, "iterate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Par(), this.getParType(), null, "par", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Param(), this.getParamType(), null, "param", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Seq(), this.getSeqType(), null, "seq", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Set(), this.getSetType(), null, "set", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TransitionFilter(), this.getTransitionFilterType(), null, "transitionFilter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AudioLevel(), theTextPackage.getDouble(), "audioLevel", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ColorInterpolation(), this.getColorInterpolationType(), "colorInterpolation", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ColorInterpolationDirection(), this.getColorInterpolationDirectionType(), "colorInterpolationDirection", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Command1(), theTextPackage.getString(), "command1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Formula(), theTextPackage.getString(), "formula", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Id(), theTextPackage.getID(), "id", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IterateInterval(), theTextPackage.getDuration(), "iterateInterval", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IterateType(), theTextPackage.getString(), "iterateType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SubItem(), theTextPackage.getString(), "subItem", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iterateTypeEClass, IterateType.class, "IterateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIterateType_AnimationElementGroup(), ecorePackage.getEFeatureMapEntry(), "animationElementGroup", null, 0, -1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIterateType_AnimationElement(), ecorePackage.getEObject(), null, "animationElement", null, 0, -1, IterateType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_Accelerate(), theTextPackage.getDouble(), "accelerate", "0.0", 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", "false", 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_Decelerate(), theTextPackage.getDouble(), "decelerate", "0.0", 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_End(), theTextPackage.getString(), "end", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_Endsync(), theCompatiblePackage.getEndsyncType(), "endsync", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_Fill(), theCompatiblePackage.getFillType(), "fill", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_FillDefault(), theCompatiblePackage.getFillDefaultType(), "fillDefault", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_GroupId(), theTextPackage.getString(), "groupId", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_Id(), theTextPackage.getID(), "id", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_IterateInterval(), theTextPackage.getDuration(), "iterateInterval", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_IterateType(), theTextPackage.getString(), "iterateType", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_MasterElement(), theTextPackage.getIDREF(), "masterElement", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_NodeType(), thePresentationPackage.getNodeTypeType(), "nodeType", "default", 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_PresetClass(), thePresentationPackage.getPresetClassType(), "presetClass", "custom", 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_PresetId(), theTextPackage.getString(), "presetId", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_PresetSubType(), theTextPackage.getString(), "presetSubType", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_Restart(), theCompatiblePackage.getRestartType(), "restart", "default", 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_RestartDefault(), theCompatiblePackage.getRestartDefaultType(), "restartDefault", "inherit", 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_SubItem(), theTextPackage.getString(), "subItem", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIterateType_TargetElement(), theTextPackage.getIDREF(), "targetElement", null, 0, 1, IterateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramTypeEClass, ParamType.class, "ParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParamType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 1, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parTypeEClass, ParType.class, "ParType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParType_AnimationElementGroup(), ecorePackage.getEFeatureMapEntry(), "animationElementGroup", null, 0, -1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParType_AnimationElement(), ecorePackage.getEObject(), null, "animationElement", null, 0, -1, ParType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_Accelerate(), theTextPackage.getDouble(), "accelerate", "0.0", 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", "false", 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_Decelerate(), theTextPackage.getDouble(), "decelerate", "0.0", 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_End(), theTextPackage.getString(), "end", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_Endsync(), theCompatiblePackage.getEndsyncType(), "endsync", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_Fill(), theCompatiblePackage.getFillType(), "fill", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_FillDefault(), theCompatiblePackage.getFillDefaultType(), "fillDefault", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_GroupId(), theTextPackage.getString(), "groupId", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_Id(), theTextPackage.getID(), "id", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_MasterElement(), theTextPackage.getIDREF(), "masterElement", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_NodeType(), thePresentationPackage.getNodeTypeType(), "nodeType", "default", 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_PresetClass(), thePresentationPackage.getPresetClassType(), "presetClass", "custom", 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_PresetId(), theTextPackage.getString(), "presetId", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_PresetSubType(), theTextPackage.getString(), "presetSubType", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_Restart(), theCompatiblePackage.getRestartType(), "restart", "default", 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParType_RestartDefault(), theCompatiblePackage.getRestartDefaultType(), "restartDefault", "inherit", 0, 1, ParType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seqTypeEClass, SeqType.class, "SeqType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeqType_AnimationElementGroup(), ecorePackage.getEFeatureMapEntry(), "animationElementGroup", null, 0, -1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeqType_AnimationElement(), ecorePackage.getEObject(), null, "animationElement", null, 0, -1, SeqType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_Accelerate(), theTextPackage.getDouble(), "accelerate", "0.0", 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", "false", 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_Decelerate(), theTextPackage.getDouble(), "decelerate", "0.0", 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_End(), theTextPackage.getString(), "end", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_Endsync(), theCompatiblePackage.getEndsyncType(), "endsync", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_Fill(), theCompatiblePackage.getFillType(), "fill", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_FillDefault(), theCompatiblePackage.getFillDefaultType(), "fillDefault", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_GroupId(), theTextPackage.getString(), "groupId", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_Id(), theTextPackage.getID(), "id", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_MasterElement(), theTextPackage.getIDREF(), "masterElement", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_NodeType(), thePresentationPackage.getNodeTypeType(), "nodeType", "default", 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_PresetClass(), thePresentationPackage.getPresetClassType(), "presetClass", "custom", 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_PresetId(), theTextPackage.getString(), "presetId", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_PresetSubType(), theTextPackage.getString(), "presetSubType", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_Restart(), theCompatiblePackage.getRestartType(), "restart", "default", 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeqType_RestartDefault(), theCompatiblePackage.getRestartDefaultType(), "restartDefault", "inherit", 0, 1, SeqType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetType_Accelerate(), theTextPackage.getDouble(), "accelerate", "0.0", 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_Accumulate(), theCompatiblePackage.getAccumulateType(), "accumulate", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_Additive(), theCompatiblePackage.getAdditiveType(), "additive", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_AttributeName(), theTextPackage.getString(), "attributeName", null, 1, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", "false", 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_Decelerate(), theTextPackage.getDouble(), "decelerate", "0.0", 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_End(), theTextPackage.getString(), "end", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_Fill(), theCompatiblePackage.getFillType(), "fill", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_FillDefault(), theCompatiblePackage.getFillDefaultType(), "fillDefault", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_Restart(), theCompatiblePackage.getRestartType(), "restart", "default", 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_RestartDefault(), theCompatiblePackage.getRestartDefaultType(), "restartDefault", "inherit", 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_SubItem(), theTextPackage.getString(), "subItem", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_TargetElement(), theTextPackage.getIDREF(), "targetElement", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetType_To(), theTextPackage.getString(), "to", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionFilterTypeEClass, TransitionFilterType.class, "TransitionFilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionFilterType_Accelerate(), theTextPackage.getDouble(), "accelerate", "0.0", 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Accumulate(), theCompatiblePackage.getAccumulateType(), "accumulate", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Additive(), theCompatiblePackage.getAdditiveType(), "additive", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", "false", 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Begin(), theTextPackage.getString(), "begin", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_By(), theTextPackage.getString(), "by", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_CalcMode(), theCompatiblePackage.getCalcModeType(), "calcMode", "discrete", 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Decelerate(), theTextPackage.getDouble(), "decelerate", "0.0", 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Direction(), theCompatiblePackage.getDirectionType(), "direction", "forward", 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Dur(), theTextPackage.getString(), "dur", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_End(), theTextPackage.getString(), "end", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_FadeColor(), theCompatiblePackage.getFadeColorType(), "fadeColor", null, 1, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Fill(), theCompatiblePackage.getFillType(), "fill", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_FillDefault(), theCompatiblePackage.getFillDefaultType(), "fillDefault", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Formula(), theTextPackage.getString(), "formula", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_From(), theTextPackage.getString(), "from", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Mode(), theCompatiblePackage.getModeType(), "mode", "in", 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_RepeatCount(), theCompatiblePackage.getRepeatCountType(), "repeatCount", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Restart(), theCompatiblePackage.getRestartType(), "restart", "default", 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_RestartDefault(), theCompatiblePackage.getRestartDefaultType(), "restartDefault", "inherit", 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_SubItem(), theTextPackage.getString(), "subItem", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Subtype(), theTextPackage.getString(), "subtype", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_TargetElement(), theTextPackage.getIDREF(), "targetElement", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_To(), theTextPackage.getString(), "to", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Type(), theTextPackage.getString(), "type", null, 1, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransitionFilterType_Values(), theTextPackage.getString(), "values", null, 0, 1, TransitionFilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorInterpolationDirectionTypeEEnum, ColorInterpolationDirectionType.class, "ColorInterpolationDirectionType");
		addEEnumLiteral(colorInterpolationDirectionTypeEEnum, ColorInterpolationDirectionType.CLOCKWISE);
		addEEnumLiteral(colorInterpolationDirectionTypeEEnum, ColorInterpolationDirectionType.COUNTER_CLOCKWISE);

		initEEnum(colorInterpolationTypeEEnum, ColorInterpolationType.class, "ColorInterpolationType");
		addEEnumLiteral(colorInterpolationTypeEEnum, ColorInterpolationType.RGB);
		addEEnumLiteral(colorInterpolationTypeEEnum, ColorInterpolationType.HSL);

		// Initialize data types
		initEDataType(colorInterpolationDirectionTypeObjectEDataType, ColorInterpolationDirectionType.class, "ColorInterpolationDirectionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorInterpolationTypeObjectEDataType, ColorInterpolationType.class, "ColorInterpolationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (animateColorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "animateColor_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAnimateColorType_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_Accumulate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accumulate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_Additive(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "additive",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_AttributeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attributeName",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_By(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "by",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_CalcMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calcMode",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_ColorInterpolation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color-interpolation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateColorType_ColorInterpolationDirection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color-interpolation-direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateColorType_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_Formula(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "formula",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateColorType_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_KeySplines(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keySplines",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_KeyTimes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keyTimes",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_SubItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sub-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateColorType_TargetElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetElement",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateColorType_Values(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "values",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (animateMotionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "animateMotion_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAnimateMotionType_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Accumulate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accumulate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Additive(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "additive",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_AttributeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attributeName",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_By(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "by",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_CalcMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calcMode",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Formula(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "formula",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateMotionType_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_KeySplines(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keySplines",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_KeyTimes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keyTimes",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Origin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "origin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_SubItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sub-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateMotionType_TargetElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetElement",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateMotionType_Values(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "values",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (animateTransformTypeEClass, 
		   source, 
		   new String[] {
			 "name", "animateTransform_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAnimateTransformType_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Accumulate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accumulate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Additive(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "additive",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_AttributeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attributeName",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_By(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "by",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Formula(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "formula",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateTransformType_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_SubItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sub-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateTransformType_TargetElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetElement",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateTransformType_Values(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "values",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (animateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "animate_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAnimateType_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_Accumulate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accumulate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_Additive(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "additive",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_AttributeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attributeName",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_By(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "by",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_CalcMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calcMode",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_Formula(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "formula",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateType_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_KeySplines(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keySplines",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_KeyTimes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keyTimes",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_SubItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sub-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnimateType_TargetElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetElement",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAnimateType_Values(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "values",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (audioTypeEClass, 
		   source, 
		   new String[] {
			 "name", "audio_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAudioType_AudioLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "audio-level",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAudioType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAudioType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAudioType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAudioType_GroupId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getAudioType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getAudioType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAudioType_MasterElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "master-element",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getAudioType_NodeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "node-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getAudioType_PresetClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-class",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getAudioType_PresetId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getAudioType_PresetSubType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-sub-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getAudioType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getAudioType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (colorInterpolationDirectionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "color-interpolation-direction_._type"
		   });		
		addAnnotation
		  (colorInterpolationDirectionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "color-interpolation-direction_._type:Object",
			 "baseType", "color-interpolation-direction_._type"
		   });		
		addAnnotation
		  (colorInterpolationTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "color-interpolation_._type"
		   });		
		addAnnotation
		  (colorInterpolationTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "color-interpolation_._type:Object",
			 "baseType", "color-interpolation_._type"
		   });		
		addAnnotation
		  (commandTypeEClass, 
		   source, 
		   new String[] {
			 "name", "command_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCommandType_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommandType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getCommandType_Command(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "command",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommandType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getCommandType_GroupId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getCommandType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommandType_MasterElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "master-element",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getCommandType_NodeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "node-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getCommandType_PresetClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-class",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getCommandType_PresetId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getCommandType_PresetSubType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-sub-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getCommandType_SubItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sub-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCommandType_TargetElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetElement",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
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
		  (getDocumentRoot_Animate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animate",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_AnimateColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animateColor",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_AnimateMotion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animateMotion",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_AnimateTransform(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animateTransform",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_Audio(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "audio",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_Command(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "command",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_Iterate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "iterate",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_Par(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "par",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Seq(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "seq",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_Set(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "set",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_TransitionFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transitionFilter",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element"
		   });		
		addAnnotation
		  (getDocumentRoot_AudioLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "audio-level",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ColorInterpolation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color-interpolation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ColorInterpolationDirection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color-interpolation-direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Command1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "command",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Formula(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "formula",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IterateInterval(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "iterate-interval",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IterateType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "iterate-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SubItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sub-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (iterateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "iterate_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIterateType_AnimationElementGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "animation-element:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getIterateType_AnimationElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animation-element",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element:group"
		   });		
		addAnnotation
		  (getIterateType_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_Endsync(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endsync",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_GroupId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getIterateType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIterateType_IterateInterval(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "iterate-interval",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIterateType_IterateType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "iterate-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIterateType_MasterElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "master-element",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getIterateType_NodeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "node-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getIterateType_PresetClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-class",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getIterateType_PresetId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getIterateType_PresetSubType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-sub-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getIterateType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getIterateType_SubItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sub-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIterateType_TargetElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetElement",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (paramTypeEClass, 
		   source, 
		   new String[] {
			 "name", "param_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getParamType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParamType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (parTypeEClass, 
		   source, 
		   new String[] {
			 "name", "par_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getParType_AnimationElementGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "animation-element:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getParType_AnimationElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animation-element",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element:group"
		   });		
		addAnnotation
		  (getParType_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_Endsync(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endsync",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_GroupId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getParType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParType_MasterElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "master-element",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getParType_NodeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "node-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getParType_PresetClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-class",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getParType_PresetId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getParType_PresetSubType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-sub-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getParType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getParType_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (seqTypeEClass, 
		   source, 
		   new String[] {
			 "name", "seq_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSeqType_AnimationElementGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "animation-element:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSeqType_AnimationElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "animation-element",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#animation-element:group"
		   });		
		addAnnotation
		  (getSeqType_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_Endsync(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endsync",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_GroupId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSeqType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeqType_MasterElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "master-element",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSeqType_NodeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "node-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSeqType_PresetClass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-class",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSeqType_PresetId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSeqType_PresetSubType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "preset-sub-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSeqType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSeqType_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (setTypeEClass, 
		   source, 
		   new String[] {
			 "name", "set_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSetType_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_Accumulate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accumulate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_Additive(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "additive",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_AttributeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attributeName",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_SubItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sub-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSetType_TargetElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetElement",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getSetType_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (transitionFilterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "transitionFilter_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getTransitionFilterType_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Accumulate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accumulate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Additive(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "additive",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_By(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "by",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_CalcMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calcMode",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_FadeColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fadeColor",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Formula(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "formula",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransitionFilterType_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_SubItem(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sub-item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransitionFilterType_Subtype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subtype",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_TargetElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetElement",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });		
		addAnnotation
		  (getTransitionFilterType_Values(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "values",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0"
		   });
	}

} //AnimationPackageImpl
