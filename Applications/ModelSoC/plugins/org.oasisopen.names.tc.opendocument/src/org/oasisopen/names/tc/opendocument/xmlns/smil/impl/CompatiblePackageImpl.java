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
package org.oasisopen.names.tc.opendocument.xmlns.smil.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.script.ScriptPackage;
import org.oasisopen.names.tc.opendocument.xmlns.script.impl.ScriptPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AccumulateType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.AdditiveType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CalcModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CompatibleFactory;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage;
import org.oasisopen.names.tc.opendocument.xmlns.smil.DirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.smil.EndsyncType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FadeColorType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.FillType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.ModeType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RepeatCountTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartDefaultType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.RestartType;
import org.oasisopen.names.tc.opendocument.xmlns.smil.util.CompatibleValidator;
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
public class CompatiblePackageImpl extends EPackageImpl implements CompatiblePackage {
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
	private EEnum accumulateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum additiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calcModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endsyncTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fadeColorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillDefaultTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repeatCountTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restartDefaultTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restartTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accumulateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType additiveTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calcModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType endsyncTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fadeColorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillDefaultTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType repeatCountTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType repeatCountTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType restartDefaultTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType restartTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompatiblePackageImpl() {
		super(eNS_URI, CompatibleFactory.eINSTANCE);
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
	public static CompatiblePackage init() {
		if (isInited) return (CompatiblePackage)EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI);

		// Obtain or create and register package
		CompatiblePackageImpl theCompatiblePackage = (CompatiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CompatiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CompatiblePackageImpl());

		isInited = true;

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
		AnimationPackageImpl theAnimationPackage = (AnimationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI) instanceof AnimationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI) : AnimationPackage.eINSTANCE);
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
		theCompatiblePackage.createPackageContents();
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
		theMetaPackage.createPackageContents();
		theChartPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theMathMLPackage.createPackageContents();
		theXFormsPackage.createPackageContents();

		// Initialize created meta-data
		theCompatiblePackage.initializePackageContents();
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
			(theCompatiblePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CompatibleValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCompatiblePackage.freeze();

		return theCompatiblePackage;
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
	public EAttribute getDocumentRoot_Accelerate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Accumulate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Additive() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AttributeName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AutoReverse() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Begin() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_By() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CalcMode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Decelerate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Direction() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Dur() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_End() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Endsync() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Fill() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillDefault() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_From() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_KeySplines() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_KeyTimes() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RepeatCount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RepeatDur() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Restart() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RestartDefault() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Subtype() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TargetElement() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_To() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Type() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Values() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccumulateType() {
		return accumulateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdditiveType() {
		return additiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalcModeType() {
		return calcModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndsyncType() {
		return endsyncTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFadeColorType() {
		return fadeColorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillDefaultType() {
		return fillDefaultTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillType() {
		return fillTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModeType() {
		return modeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepeatCountTypeMember1() {
		return repeatCountTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestartDefaultType() {
		return restartDefaultTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestartType() {
		return restartTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccumulateTypeObject() {
		return accumulateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAdditiveTypeObject() {
		return additiveTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalcModeTypeObject() {
		return calcModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectionTypeObject() {
		return directionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEndsyncTypeObject() {
		return endsyncTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFadeColorTypeObject() {
		return fadeColorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillDefaultTypeObject() {
		return fillDefaultTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillTypeObject() {
		return fillTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModeTypeObject() {
		return modeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRepeatCountType() {
		return repeatCountTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRepeatCountTypeMember1Object() {
		return repeatCountTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRestartDefaultTypeObject() {
		return restartDefaultTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRestartTypeObject() {
		return restartTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleFactory getCompatibleFactory() {
		return (CompatibleFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACCELERATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACCUMULATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ADDITIVE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTE_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUTO_REVERSE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BEGIN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CALC_MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DECELERATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIRECTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DUR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__END);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ENDSYNC);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FILL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FILL_DEFAULT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FROM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEY_SPLINES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEY_TIMES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REPEAT_COUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REPEAT_DUR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RESTART);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RESTART_DEFAULT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SUBTYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TARGET_ELEMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALUES);

		// Create enums
		accumulateTypeEEnum = createEEnum(ACCUMULATE_TYPE);
		additiveTypeEEnum = createEEnum(ADDITIVE_TYPE);
		calcModeTypeEEnum = createEEnum(CALC_MODE_TYPE);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
		endsyncTypeEEnum = createEEnum(ENDSYNC_TYPE);
		fadeColorTypeEEnum = createEEnum(FADE_COLOR_TYPE);
		fillDefaultTypeEEnum = createEEnum(FILL_DEFAULT_TYPE);
		fillTypeEEnum = createEEnum(FILL_TYPE);
		modeTypeEEnum = createEEnum(MODE_TYPE);
		repeatCountTypeMember1EEnum = createEEnum(REPEAT_COUNT_TYPE_MEMBER1);
		restartDefaultTypeEEnum = createEEnum(RESTART_DEFAULT_TYPE);
		restartTypeEEnum = createEEnum(RESTART_TYPE);

		// Create data types
		accumulateTypeObjectEDataType = createEDataType(ACCUMULATE_TYPE_OBJECT);
		additiveTypeObjectEDataType = createEDataType(ADDITIVE_TYPE_OBJECT);
		calcModeTypeObjectEDataType = createEDataType(CALC_MODE_TYPE_OBJECT);
		directionTypeObjectEDataType = createEDataType(DIRECTION_TYPE_OBJECT);
		endsyncTypeObjectEDataType = createEDataType(ENDSYNC_TYPE_OBJECT);
		fadeColorTypeObjectEDataType = createEDataType(FADE_COLOR_TYPE_OBJECT);
		fillDefaultTypeObjectEDataType = createEDataType(FILL_DEFAULT_TYPE_OBJECT);
		fillTypeObjectEDataType = createEDataType(FILL_TYPE_OBJECT);
		modeTypeObjectEDataType = createEDataType(MODE_TYPE_OBJECT);
		repeatCountTypeEDataType = createEDataType(REPEAT_COUNT_TYPE);
		repeatCountTypeMember1ObjectEDataType = createEDataType(REPEAT_COUNT_TYPE_MEMBER1_OBJECT);
		restartDefaultTypeObjectEDataType = createEDataType(RESTART_DEFAULT_TYPE_OBJECT);
		restartTypeObjectEDataType = createEDataType(RESTART_TYPE_OBJECT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Accelerate(), theTextPackage.getDouble(), "accelerate", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Accumulate(), this.getAccumulateType(), "accumulate", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Additive(), this.getAdditiveType(), "additive", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AttributeName(), theTextPackage.getString(), "attributeName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AutoReverse(), theTextPackage.getBoolean(), "autoReverse", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Begin(), theTextPackage.getString(), "begin", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_By(), theTextPackage.getString(), "by", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CalcMode(), this.getCalcModeType(), "calcMode", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Decelerate(), theTextPackage.getDouble(), "decelerate", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Direction(), this.getDirectionType(), "direction", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Dur(), theTextPackage.getString(), "dur", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_End(), theTextPackage.getString(), "end", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Endsync(), this.getEndsyncType(), "endsync", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Fill(), this.getFillType(), "fill", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FillDefault(), this.getFillDefaultType(), "fillDefault", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_From(), theTextPackage.getString(), "from", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_KeySplines(), theTextPackage.getString(), "keySplines", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_KeyTimes(), theTextPackage.getString(), "keyTimes", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Mode(), this.getModeType(), "mode", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RepeatCount(), this.getRepeatCountType(), "repeatCount", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RepeatDur(), theTextPackage.getString(), "repeatDur", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Restart(), this.getRestartType(), "restart", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RestartDefault(), this.getRestartDefaultType(), "restartDefault", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Subtype(), theTextPackage.getString(), "subtype", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TargetElement(), theTextPackage.getIDREF(), "targetElement", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_To(), theTextPackage.getString(), "to", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Type(), theTextPackage.getString(), "type", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Values(), theTextPackage.getString(), "values", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accumulateTypeEEnum, AccumulateType.class, "AccumulateType");
		addEEnumLiteral(accumulateTypeEEnum, AccumulateType.NONE);
		addEEnumLiteral(accumulateTypeEEnum, AccumulateType.SUM);

		initEEnum(additiveTypeEEnum, AdditiveType.class, "AdditiveType");
		addEEnumLiteral(additiveTypeEEnum, AdditiveType.REPLACE);
		addEEnumLiteral(additiveTypeEEnum, AdditiveType.SUM);

		initEEnum(calcModeTypeEEnum, CalcModeType.class, "CalcModeType");
		addEEnumLiteral(calcModeTypeEEnum, CalcModeType.DISCRETE);
		addEEnumLiteral(calcModeTypeEEnum, CalcModeType.LINEAR);
		addEEnumLiteral(calcModeTypeEEnum, CalcModeType.PACED);
		addEEnumLiteral(calcModeTypeEEnum, CalcModeType.SPLINE);

		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType.FORWARD);
		addEEnumLiteral(directionTypeEEnum, DirectionType.REVERSE);

		initEEnum(endsyncTypeEEnum, EndsyncType.class, "EndsyncType");
		addEEnumLiteral(endsyncTypeEEnum, EndsyncType.FIRST);
		addEEnumLiteral(endsyncTypeEEnum, EndsyncType.LAST);
		addEEnumLiteral(endsyncTypeEEnum, EndsyncType.ALL);
		addEEnumLiteral(endsyncTypeEEnum, EndsyncType.MEDIA);

		initEEnum(fadeColorTypeEEnum, FadeColorType.class, "FadeColorType");
		addEEnumLiteral(fadeColorTypeEEnum, FadeColorType.FORWARD);
		addEEnumLiteral(fadeColorTypeEEnum, FadeColorType.REVERSE);

		initEEnum(fillDefaultTypeEEnum, FillDefaultType.class, "FillDefaultType");
		addEEnumLiteral(fillDefaultTypeEEnum, FillDefaultType.REMOVE);
		addEEnumLiteral(fillDefaultTypeEEnum, FillDefaultType.FREEZE);
		addEEnumLiteral(fillDefaultTypeEEnum, FillDefaultType.HOLD);
		addEEnumLiteral(fillDefaultTypeEEnum, FillDefaultType.TRANSITION);
		addEEnumLiteral(fillDefaultTypeEEnum, FillDefaultType.AUTO);
		addEEnumLiteral(fillDefaultTypeEEnum, FillDefaultType.INHERIT);

		initEEnum(fillTypeEEnum, FillType.class, "FillType");
		addEEnumLiteral(fillTypeEEnum, FillType.REMOVE);
		addEEnumLiteral(fillTypeEEnum, FillType.FREEZE);
		addEEnumLiteral(fillTypeEEnum, FillType.HOLD);
		addEEnumLiteral(fillTypeEEnum, FillType.AUTO);
		addEEnumLiteral(fillTypeEEnum, FillType.DEFAULT);
		addEEnumLiteral(fillTypeEEnum, FillType.TRANSITION);

		initEEnum(modeTypeEEnum, ModeType.class, "ModeType");
		addEEnumLiteral(modeTypeEEnum, ModeType.IN);
		addEEnumLiteral(modeTypeEEnum, ModeType.OUT);

		initEEnum(repeatCountTypeMember1EEnum, RepeatCountTypeMember1.class, "RepeatCountTypeMember1");
		addEEnumLiteral(repeatCountTypeMember1EEnum, RepeatCountTypeMember1.INDEFINITE);

		initEEnum(restartDefaultTypeEEnum, RestartDefaultType.class, "RestartDefaultType");
		addEEnumLiteral(restartDefaultTypeEEnum, RestartDefaultType.NEVER);
		addEEnumLiteral(restartDefaultTypeEEnum, RestartDefaultType.ALWAYS);
		addEEnumLiteral(restartDefaultTypeEEnum, RestartDefaultType.WHEN_NOT_ACTIVE);
		addEEnumLiteral(restartDefaultTypeEEnum, RestartDefaultType.INHERIT);

		initEEnum(restartTypeEEnum, RestartType.class, "RestartType");
		addEEnumLiteral(restartTypeEEnum, RestartType.NEVER);
		addEEnumLiteral(restartTypeEEnum, RestartType.ALWAYS);
		addEEnumLiteral(restartTypeEEnum, RestartType.WHEN_NOT_ACTIVE);
		addEEnumLiteral(restartTypeEEnum, RestartType.DEFAULT);

		// Initialize data types
		initEDataType(accumulateTypeObjectEDataType, AccumulateType.class, "AccumulateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(additiveTypeObjectEDataType, AdditiveType.class, "AdditiveTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calcModeTypeObjectEDataType, CalcModeType.class, "CalcModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(directionTypeObjectEDataType, DirectionType.class, "DirectionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(endsyncTypeObjectEDataType, EndsyncType.class, "EndsyncTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fadeColorTypeObjectEDataType, FadeColorType.class, "FadeColorTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fillDefaultTypeObjectEDataType, FillDefaultType.class, "FillDefaultTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fillTypeObjectEDataType, FillType.class, "FillTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modeTypeObjectEDataType, ModeType.class, "ModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(repeatCountTypeEDataType, Object.class, "RepeatCountType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(repeatCountTypeMember1ObjectEDataType, RepeatCountTypeMember1.class, "RepeatCountTypeMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(restartDefaultTypeObjectEDataType, RestartDefaultType.class, "RestartDefaultTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(restartTypeObjectEDataType, RestartType.class, "RestartTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (accumulateTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "accumulate_._type"
		   });		
		addAnnotation
		  (accumulateTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "accumulate_._type:Object",
			 "baseType", "accumulate_._type"
		   });		
		addAnnotation
		  (additiveTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "additive_._type"
		   });		
		addAnnotation
		  (additiveTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "additive_._type:Object",
			 "baseType", "additive_._type"
		   });		
		addAnnotation
		  (calcModeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "calcMode_._type"
		   });		
		addAnnotation
		  (calcModeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "calcMode_._type:Object",
			 "baseType", "calcMode_._type"
		   });		
		addAnnotation
		  (directionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "direction_._type"
		   });		
		addAnnotation
		  (directionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "direction_._type:Object",
			 "baseType", "direction_._type"
		   });		
		addAnnotation
		  (endsyncTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "endsync_._type"
		   });		
		addAnnotation
		  (endsyncTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "endsync_._type:Object",
			 "baseType", "endsync_._type"
		   });		
		addAnnotation
		  (fadeColorTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "fadeColor_._type"
		   });		
		addAnnotation
		  (fadeColorTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "fadeColor_._type:Object",
			 "baseType", "fadeColor_._type"
		   });		
		addAnnotation
		  (fillDefaultTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "fillDefault_._type"
		   });		
		addAnnotation
		  (fillDefaultTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "fillDefault_._type:Object",
			 "baseType", "fillDefault_._type"
		   });		
		addAnnotation
		  (fillTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "fill_._type"
		   });		
		addAnnotation
		  (fillTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "fill_._type:Object",
			 "baseType", "fill_._type"
		   });		
		addAnnotation
		  (modeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "mode_._type"
		   });		
		addAnnotation
		  (modeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mode_._type:Object",
			 "baseType", "mode_._type"
		   });		
		addAnnotation
		  (repeatCountTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "repeatCount_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeInteger repeatCount_._type_._member_._1"
		   });		
		addAnnotation
		  (repeatCountTypeMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "repeatCount_._type_._member_._1"
		   });		
		addAnnotation
		  (repeatCountTypeMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "repeatCount_._type_._member_._1:Object",
			 "baseType", "repeatCount_._type_._member_._1"
		   });		
		addAnnotation
		  (restartDefaultTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "restartDefault_._type"
		   });		
		addAnnotation
		  (restartDefaultTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "restartDefault_._type:Object",
			 "baseType", "restartDefault_._type"
		   });		
		addAnnotation
		  (restartTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "restart_._type"
		   });		
		addAnnotation
		  (restartTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "restart_._type:Object",
			 "baseType", "restart_._type"
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
		  (getDocumentRoot_Accelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accelerate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Accumulate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accumulate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Additive(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "additive",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AttributeName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attributeName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AutoReverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "autoReverse",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Begin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "begin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_By(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "by",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CalcMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calcMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Decelerate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decelerate",
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
		  (getDocumentRoot_Dur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dur",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Endsync(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "endsync",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Fill(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FillDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fillDefault",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeySplines(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keySplines",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeyTimes(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keyTimes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RepeatCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatCount",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RepeatDur(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeatDur",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Restart(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restart",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RestartDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "restartDefault",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Subtype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subtype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TargetElement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetElement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_To(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "to",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Values(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "values",
			 "namespace", "##targetNamespace"
		   });
	}

} //CompatiblePackageImpl
