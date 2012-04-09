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
package org.oasisopen.names.tc.opendocument.xmlns.svg.impl;

import java.math.BigInteger;
import java.util.List;

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
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PresentationPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.script.ScriptPackage;
import org.oasisopen.names.tc.opendocument.xmlns.script.impl.ScriptPackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.smil.CompatiblePackage;
import org.oasisopen.names.tc.opendocument.xmlns.smil.impl.CompatiblePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.style.StylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.impl.StylePackageImpl;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DefinitionSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FillRuleType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceFormatType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceNameType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceSrcType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontFaceUriType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.FontStretchType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.StopType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgFactory;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;
import org.oasisopen.names.tc.opendocument.xmlns.svg.TypeType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.util.SvgValidator;
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
public class SvgPackageImpl extends EPackageImpl implements SvgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionSrcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontFaceFormatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontFaceNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontFaceSrcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontFaceUriTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearGradientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radialGradientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopTypeEClass = null;

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
	private EEnum fillRuleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStretchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gradientUnitsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spreadMethodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cxTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillRuleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontStretchTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fxTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gradientUnitsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType heightTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType offsetTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spreadMethodTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeOpacityTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeOpacityTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strokeOpacityTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType viewBoxTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType viewBoxTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType viewBoxTypeBaseItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType widthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType x1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType x2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType y1TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType y2TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yType1EDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SvgPackageImpl() {
		super(eNS_URI, SvgFactory.eINSTANCE);
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
	public static SvgPackage init() {
		if (isInited) return (SvgPackage)EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI);

		// Obtain or create and register package
		SvgPackageImpl theSvgPackage = (SvgPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SvgPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SvgPackageImpl());

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
		theSvgPackage.createPackageContents();
		theOfficePackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theXLinkPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
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
		theSvgPackage.initializePackageContents();
		theOfficePackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theXLinkPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
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
			(theSvgPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SvgValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSvgPackage.freeze();

		return theSvgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionSrcType() {
		return definitionSrcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionSrcType_Actuate() {
		return (EAttribute)definitionSrcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionSrcType_Href() {
		return (EAttribute)definitionSrcTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionSrcType_Type() {
		return (EAttribute)definitionSrcTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontFaceFormatType() {
		return fontFaceFormatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceFormatType_String() {
		return (EAttribute)fontFaceFormatTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontFaceNameType() {
		return fontFaceNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceNameType_Name() {
		return (EAttribute)fontFaceNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontFaceSrcType() {
		return fontFaceSrcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceSrcType_Group() {
		return (EAttribute)fontFaceSrcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFontFaceSrcType_FontFaceUri() {
		return (EReference)fontFaceSrcTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFontFaceSrcType_FontFaceName() {
		return (EReference)fontFaceSrcTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontFaceUriType() {
		return fontFaceUriTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFontFaceUriType_FontFaceFormat() {
		return (EReference)fontFaceUriTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceUriType_Actuate() {
		return (EAttribute)fontFaceUriTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceUriType_Href() {
		return (EAttribute)fontFaceUriTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontFaceUriType_Type() {
		return (EAttribute)fontFaceUriTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearGradientType() {
		return linearGradientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearGradientType_Stop() {
		return (EReference)linearGradientTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientType_DisplayName() {
		return (EAttribute)linearGradientTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientType_GradientTransform() {
		return (EAttribute)linearGradientTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientType_GradientUnits() {
		return (EAttribute)linearGradientTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientType_Name() {
		return (EAttribute)linearGradientTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientType_SpreadMethod() {
		return (EAttribute)linearGradientTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientType_X1() {
		return (EAttribute)linearGradientTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientType_X2() {
		return (EAttribute)linearGradientTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientType_Y1() {
		return (EAttribute)linearGradientTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientType_Y2() {
		return (EAttribute)linearGradientTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadialGradientType() {
		return radialGradientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRadialGradientType_Stop() {
		return (EReference)radialGradientTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_Cx() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_Cy() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_DisplayName() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_Fx() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_Fy() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_GradientTransform() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_GradientUnits() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_Name() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_R() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientType_SpreadMethod() {
		return (EAttribute)radialGradientTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopType() {
		return stopTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopType_Offset() {
		return (EAttribute)stopTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopType_StopColor() {
		return (EAttribute)stopTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopType_StopOpacity() {
		return (EAttribute)stopTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getDocumentRoot_DefinitionSrc() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Desc() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FontFaceFormat() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FontFaceName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FontFaceSrc() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FontFaceUri() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LinearGradient() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RadialGradient() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Stop() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Title() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AccentHeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Alphabetic() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Ascent() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Bbox() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CapHeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Cx() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Cy() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_D() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Descent() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FillRule() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontFamily() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontSize() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontStretch() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontStyle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontVariant() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontWeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GradientTransform() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GradientUnits() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Hanging() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Ideographic() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mathematical() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Origin() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OverlinePosition() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_OverlineThickness() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Panose1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Path() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_R() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Rx() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Ry() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Slope() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SpreadMethod() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Stemh() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Stemv() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StrikethroughPosition() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StrikethroughThickness() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StrokeColor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StrokeOpacity() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StrokeWidth() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Type() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UnderlinePosition() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UnderlineThickness() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UnicodeRange() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_UnitsPerEm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VAlphabetic() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VHanging() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VIdeographic() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ViewBox() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VMathematical() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Widths() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_X1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_X2() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_XHeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Y1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Y2() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillRuleType() {
		return fillRuleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontStretchType() {
		return fontStretchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGradientUnitsType() {
		return gradientUnitsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpreadMethodType() {
		return spreadMethodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCxType() {
		return cxTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCyType() {
		return cyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFillRuleTypeObject() {
		return fillRuleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontStretchTypeObject() {
		return fontStretchTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFxType() {
		return fxTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFyType() {
		return fyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGradientUnitsTypeObject() {
		return gradientUnitsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHeightType() {
		return heightTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOffsetType() {
		return offsetTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRType() {
		return rTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpreadMethodTypeObject() {
		return spreadMethodTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrokeOpacityType() {
		return strokeOpacityTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrokeOpacityTypeMember1() {
		return strokeOpacityTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrokeOpacityTypeMember1Object() {
		return strokeOpacityTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getViewBoxType() {
		return viewBoxTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getViewBoxTypeBase() {
		return viewBoxTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getViewBoxTypeBaseItem() {
		return viewBoxTypeBaseItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWidthType() {
		return widthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getX1Type() {
		return x1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getX2Type() {
		return x2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getXType() {
		return xTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getXType1() {
		return xType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getY1Type() {
		return y1TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getY2Type() {
		return y2TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYType() {
		return yTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYType1() {
		return yType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgFactory getSvgFactory() {
		return (SvgFactory)getEFactoryInstance();
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
		definitionSrcTypeEClass = createEClass(DEFINITION_SRC_TYPE);
		createEAttribute(definitionSrcTypeEClass, DEFINITION_SRC_TYPE__ACTUATE);
		createEAttribute(definitionSrcTypeEClass, DEFINITION_SRC_TYPE__HREF);
		createEAttribute(definitionSrcTypeEClass, DEFINITION_SRC_TYPE__TYPE);

		fontFaceFormatTypeEClass = createEClass(FONT_FACE_FORMAT_TYPE);
		createEAttribute(fontFaceFormatTypeEClass, FONT_FACE_FORMAT_TYPE__STRING);

		fontFaceNameTypeEClass = createEClass(FONT_FACE_NAME_TYPE);
		createEAttribute(fontFaceNameTypeEClass, FONT_FACE_NAME_TYPE__NAME);

		fontFaceSrcTypeEClass = createEClass(FONT_FACE_SRC_TYPE);
		createEAttribute(fontFaceSrcTypeEClass, FONT_FACE_SRC_TYPE__GROUP);
		createEReference(fontFaceSrcTypeEClass, FONT_FACE_SRC_TYPE__FONT_FACE_URI);
		createEReference(fontFaceSrcTypeEClass, FONT_FACE_SRC_TYPE__FONT_FACE_NAME);

		fontFaceUriTypeEClass = createEClass(FONT_FACE_URI_TYPE);
		createEReference(fontFaceUriTypeEClass, FONT_FACE_URI_TYPE__FONT_FACE_FORMAT);
		createEAttribute(fontFaceUriTypeEClass, FONT_FACE_URI_TYPE__ACTUATE);
		createEAttribute(fontFaceUriTypeEClass, FONT_FACE_URI_TYPE__HREF);
		createEAttribute(fontFaceUriTypeEClass, FONT_FACE_URI_TYPE__TYPE);

		linearGradientTypeEClass = createEClass(LINEAR_GRADIENT_TYPE);
		createEReference(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__STOP);
		createEAttribute(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__DISPLAY_NAME);
		createEAttribute(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__GRADIENT_TRANSFORM);
		createEAttribute(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__GRADIENT_UNITS);
		createEAttribute(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__NAME);
		createEAttribute(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__SPREAD_METHOD);
		createEAttribute(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__X1);
		createEAttribute(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__X2);
		createEAttribute(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__Y1);
		createEAttribute(linearGradientTypeEClass, LINEAR_GRADIENT_TYPE__Y2);

		radialGradientTypeEClass = createEClass(RADIAL_GRADIENT_TYPE);
		createEReference(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__STOP);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__CX);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__CY);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__DISPLAY_NAME);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__FX);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__FY);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__GRADIENT_TRANSFORM);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__GRADIENT_UNITS);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__NAME);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__R);
		createEAttribute(radialGradientTypeEClass, RADIAL_GRADIENT_TYPE__SPREAD_METHOD);

		stopTypeEClass = createEClass(STOP_TYPE);
		createEAttribute(stopTypeEClass, STOP_TYPE__OFFSET);
		createEAttribute(stopTypeEClass, STOP_TYPE__STOP_COLOR);
		createEAttribute(stopTypeEClass, STOP_TYPE__STOP_OPACITY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEFINITION_SRC);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DESC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FONT_FACE_FORMAT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FONT_FACE_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FONT_FACE_SRC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FONT_FACE_URI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINEAR_GRADIENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RADIAL_GRADIENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STOP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACCENT_HEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ALPHABETIC);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ASCENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BBOX);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CAP_HEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CX);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__D);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DESCENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FILL_RULE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_FAMILY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_SIZE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_STRETCH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_STYLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_VARIANT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_WEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GRADIENT_TRANSFORM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GRADIENT_UNITS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HANGING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__IDEOGRAPHIC);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MATHEMATICAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORIGIN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__OVERLINE_POSITION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__OVERLINE_THICKNESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PANOSE1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PATH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__R);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RX);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SLOPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPREAD_METHOD);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STEMH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STEMV);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STRIKETHROUGH_POSITION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STRIKETHROUGH_THICKNESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STROKE_COLOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STROKE_OPACITY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STROKE_WIDTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__UNDERLINE_POSITION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__UNDERLINE_THICKNESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__UNICODE_RANGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__UNITS_PER_EM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALPHABETIC);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VHANGING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VIDEOGRAPHIC);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VIEW_BOX);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VMATHEMATICAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WIDTHS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__X1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__X2);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__XHEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__Y1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__Y2);

		// Create enums
		fillRuleTypeEEnum = createEEnum(FILL_RULE_TYPE);
		fontStretchTypeEEnum = createEEnum(FONT_STRETCH_TYPE);
		gradientUnitsTypeEEnum = createEEnum(GRADIENT_UNITS_TYPE);
		spreadMethodTypeEEnum = createEEnum(SPREAD_METHOD_TYPE);
		typeTypeEEnum = createEEnum(TYPE_TYPE);

		// Create data types
		cxTypeEDataType = createEDataType(CX_TYPE);
		cyTypeEDataType = createEDataType(CY_TYPE);
		fillRuleTypeObjectEDataType = createEDataType(FILL_RULE_TYPE_OBJECT);
		fontStretchTypeObjectEDataType = createEDataType(FONT_STRETCH_TYPE_OBJECT);
		fxTypeEDataType = createEDataType(FX_TYPE);
		fyTypeEDataType = createEDataType(FY_TYPE);
		gradientUnitsTypeObjectEDataType = createEDataType(GRADIENT_UNITS_TYPE_OBJECT);
		heightTypeEDataType = createEDataType(HEIGHT_TYPE);
		offsetTypeEDataType = createEDataType(OFFSET_TYPE);
		rTypeEDataType = createEDataType(RTYPE);
		spreadMethodTypeObjectEDataType = createEDataType(SPREAD_METHOD_TYPE_OBJECT);
		strokeOpacityTypeEDataType = createEDataType(STROKE_OPACITY_TYPE);
		strokeOpacityTypeMember1EDataType = createEDataType(STROKE_OPACITY_TYPE_MEMBER1);
		strokeOpacityTypeMember1ObjectEDataType = createEDataType(STROKE_OPACITY_TYPE_MEMBER1_OBJECT);
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
		viewBoxTypeEDataType = createEDataType(VIEW_BOX_TYPE);
		viewBoxTypeBaseEDataType = createEDataType(VIEW_BOX_TYPE_BASE);
		viewBoxTypeBaseItemEDataType = createEDataType(VIEW_BOX_TYPE_BASE_ITEM);
		widthTypeEDataType = createEDataType(WIDTH_TYPE);
		x1TypeEDataType = createEDataType(X1_TYPE);
		x2TypeEDataType = createEDataType(X2_TYPE);
		xTypeEDataType = createEDataType(XTYPE);
		xType1EDataType = createEDataType(XTYPE1);
		y1TypeEDataType = createEDataType(Y1_TYPE);
		y2TypeEDataType = createEDataType(Y2_TYPE);
		yTypeEDataType = createEDataType(YTYPE);
		yType1EDataType = createEDataType(YTYPE1);
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
		XLinkPackage theXLinkPackage = (XLinkPackage)EPackage.Registry.INSTANCE.getEPackage(XLinkPackage.eNS_URI);
		TextPackage theTextPackage = (TextPackage)EPackage.Registry.INSTANCE.getEPackage(TextPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(definitionSrcTypeEClass, DefinitionSrcType.class, "DefinitionSrcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinitionSrcType_Actuate(), theXLinkPackage.getActuateType1(), "actuate", null, 1, 1, DefinitionSrcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionSrcType_Href(), theTextPackage.getAnyURI(), "href", null, 1, 1, DefinitionSrcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitionSrcType_Type(), theXLinkPackage.getTypeType(), "type", "simple", 0, 1, DefinitionSrcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontFaceFormatTypeEClass, FontFaceFormatType.class, "FontFaceFormatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFontFaceFormatType_String(), theXMLTypePackage.getAnySimpleType(), "string", null, 0, 1, FontFaceFormatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontFaceNameTypeEClass, FontFaceNameType.class, "FontFaceNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFontFaceNameType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, FontFaceNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fontFaceSrcTypeEClass, FontFaceSrcType.class, "FontFaceSrcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFontFaceSrcType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FontFaceSrcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFontFaceSrcType_FontFaceUri(), this.getFontFaceUriType(), null, "fontFaceUri", null, 0, -1, FontFaceSrcType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFontFaceSrcType_FontFaceName(), this.getFontFaceNameType(), null, "fontFaceName", null, 0, -1, FontFaceSrcType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fontFaceUriTypeEClass, FontFaceUriType.class, "FontFaceUriType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFontFaceUriType_FontFaceFormat(), this.getFontFaceFormatType(), null, "fontFaceFormat", null, 0, -1, FontFaceUriType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontFaceUriType_Actuate(), theXLinkPackage.getActuateType1(), "actuate", null, 1, 1, FontFaceUriType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontFaceUriType_Href(), theTextPackage.getAnyURI(), "href", null, 1, 1, FontFaceUriType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontFaceUriType_Type(), theXLinkPackage.getTypeType(), "type", "simple", 0, 1, FontFaceUriType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearGradientTypeEClass, LinearGradientType.class, "LinearGradientType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinearGradientType_Stop(), this.getStopType(), null, "stop", null, 0, -1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientType_DisplayName(), theTextPackage.getString(), "displayName", null, 0, 1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientType_GradientTransform(), theTextPackage.getString(), "gradientTransform", null, 0, 1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientType_GradientUnits(), this.getGradientUnitsType(), "gradientUnits", "objectBoundingBox", 0, 1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientType_Name(), theTextPackage.getStyleName(), "name", null, 1, 1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientType_SpreadMethod(), this.getSpreadMethodType(), "spreadMethod", "pad", 0, 1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientType_X1(), this.getX1Type(), "x1", "0%", 0, 1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientType_X2(), this.getX2Type(), "x2", "100%", 0, 1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientType_Y1(), this.getY1Type(), "y1", "0%", 0, 1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientType_Y2(), this.getY2Type(), "y2", "100%", 0, 1, LinearGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radialGradientTypeEClass, RadialGradientType.class, "RadialGradientType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRadialGradientType_Stop(), this.getStopType(), null, "stop", null, 0, -1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_Cx(), this.getCxType(), "cx", "50%", 0, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_Cy(), this.getCyType(), "cy", "50%", 0, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_DisplayName(), theTextPackage.getString(), "displayName", null, 0, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_Fx(), this.getFxType(), "fx", null, 0, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_Fy(), this.getFyType(), "fy", null, 0, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_GradientTransform(), theTextPackage.getString(), "gradientTransform", null, 0, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_GradientUnits(), this.getGradientUnitsType(), "gradientUnits", "objectBoundingBox", 0, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_Name(), theTextPackage.getStyleName(), "name", null, 1, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_R(), this.getRType(), "r", "50%", 0, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientType_SpreadMethod(), this.getSpreadMethodType(), "spreadMethod", "pad", 0, 1, RadialGradientType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopTypeEClass, StopType.class, "StopType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStopType_Offset(), this.getOffsetType(), "offset", null, 1, 1, StopType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopType_StopColor(), theTextPackage.getColor(), "stopColor", null, 0, 1, StopType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStopType_StopOpacity(), theTextPackage.getDouble(), "stopOpacity", null, 0, 1, StopType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DefinitionSrc(), this.getDefinitionSrcType(), null, "definitionSrc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Desc(), theXMLTypePackage.getString(), "desc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FontFaceFormat(), this.getFontFaceFormatType(), null, "fontFaceFormat", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FontFaceName(), this.getFontFaceNameType(), null, "fontFaceName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FontFaceSrc(), this.getFontFaceSrcType(), null, "fontFaceSrc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FontFaceUri(), this.getFontFaceUriType(), null, "fontFaceUri", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LinearGradient(), this.getLinearGradientType(), null, "linearGradient", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RadialGradient(), this.getRadialGradientType(), null, "radialGradient", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Stop(), this.getStopType(), null, "stop", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Title(), theXMLTypePackage.getString(), "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AccentHeight(), theTextPackage.getInteger(), "accentHeight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Alphabetic(), theTextPackage.getInteger(), "alphabetic", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Ascent(), theTextPackage.getInteger(), "ascent", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Bbox(), theXMLTypePackage.getAnySimpleType(), "bbox", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CapHeight(), theTextPackage.getInteger(), "capHeight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Cx(), theTextPackage.getCoordinate(), "cx", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Cy(), theTextPackage.getCoordinate(), "cy", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_D(), theTextPackage.getPathData(), "d", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Descent(), theTextPackage.getInteger(), "descent", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FillRule(), this.getFillRuleType(), "fillRule", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontFamily(), theTextPackage.getString(), "fontFamily", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontSize(), theTextPackage.getPositiveLength(), "fontSize", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontStretch(), this.getFontStretchType(), "fontStretch", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontStyle(), theTextPackage.getFontStyle(), "fontStyle", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontVariant(), theTextPackage.getFontVariant(), "fontVariant", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontWeight(), theTextPackage.getFontWeight(), "fontWeight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_GradientTransform(), theTextPackage.getString(), "gradientTransform", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_GradientUnits(), this.getGradientUnitsType(), "gradientUnits", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Hanging(), theTextPackage.getInteger(), "hanging", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Ideographic(), theTextPackage.getInteger(), "ideographic", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Mathematical(), theTextPackage.getInteger(), "mathematical", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Origin(), theTextPackage.getString(), "origin", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OverlinePosition(), theTextPackage.getInteger(), "overlinePosition", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_OverlineThickness(), theTextPackage.getInteger(), "overlineThickness", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Panose1(), theXMLTypePackage.getAnySimpleType(), "panose1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Path(), theTextPackage.getPathData(), "path", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_R(), theTextPackage.getLength(), "r", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Rx(), theTextPackage.getLength(), "rx", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Ry(), theTextPackage.getLength(), "ry", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Slope(), theTextPackage.getInteger(), "slope", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SpreadMethod(), this.getSpreadMethodType(), "spreadMethod", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Stemh(), theTextPackage.getInteger(), "stemh", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Stemv(), theTextPackage.getInteger(), "stemv", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StrikethroughPosition(), theTextPackage.getInteger(), "strikethroughPosition", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StrikethroughThickness(), theTextPackage.getInteger(), "strikethroughThickness", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StrokeColor(), theTextPackage.getColor(), "strokeColor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StrokeOpacity(), this.getStrokeOpacityType(), "strokeOpacity", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StrokeWidth(), theTextPackage.getLength(), "strokeWidth", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Type(), this.getTypeType(), "type", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UnderlinePosition(), theTextPackage.getInteger(), "underlinePosition", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UnderlineThickness(), theTextPackage.getInteger(), "underlineThickness", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UnicodeRange(), theXMLTypePackage.getAnySimpleType(), "unicodeRange", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_UnitsPerEm(), theTextPackage.getInteger(), "unitsPerEm", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_VAlphabetic(), theTextPackage.getInteger(), "vAlphabetic", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_VHanging(), theTextPackage.getInteger(), "vHanging", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_VIdeographic(), theTextPackage.getInteger(), "vIdeographic", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ViewBox(), this.getViewBoxType(), "viewBox", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_VMathematical(), theTextPackage.getInteger(), "vMathematical", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Widths(), theXMLTypePackage.getAnySimpleType(), "widths", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_X1(), theTextPackage.getCoordinate(), "x1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_X2(), theTextPackage.getCoordinate(), "x2", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_XHeight(), theTextPackage.getInteger(), "xHeight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Y1(), theTextPackage.getCoordinate(), "y1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Y2(), theTextPackage.getCoordinate(), "y2", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fillRuleTypeEEnum, FillRuleType.class, "FillRuleType");
		addEEnumLiteral(fillRuleTypeEEnum, FillRuleType.NONZERO);
		addEEnumLiteral(fillRuleTypeEEnum, FillRuleType.EVENODD);

		initEEnum(fontStretchTypeEEnum, FontStretchType.class, "FontStretchType");
		addEEnumLiteral(fontStretchTypeEEnum, FontStretchType.NORMAL);
		addEEnumLiteral(fontStretchTypeEEnum, FontStretchType.ULTRA_CONDENSED);
		addEEnumLiteral(fontStretchTypeEEnum, FontStretchType.EXTRA_CONDENSED);
		addEEnumLiteral(fontStretchTypeEEnum, FontStretchType.CONDENSED);
		addEEnumLiteral(fontStretchTypeEEnum, FontStretchType.SEMI_CONDENSED);
		addEEnumLiteral(fontStretchTypeEEnum, FontStretchType.SEMI_EXPANDED);
		addEEnumLiteral(fontStretchTypeEEnum, FontStretchType.EXPANDED);
		addEEnumLiteral(fontStretchTypeEEnum, FontStretchType.EXTRA_EXPANDED);
		addEEnumLiteral(fontStretchTypeEEnum, FontStretchType.ULTRA_EXPANDED);

		initEEnum(gradientUnitsTypeEEnum, GradientUnitsType.class, "GradientUnitsType");
		addEEnumLiteral(gradientUnitsTypeEEnum, GradientUnitsType.OBJECT_BOUNDING_BOX);

		initEEnum(spreadMethodTypeEEnum, SpreadMethodType.class, "SpreadMethodType");
		addEEnumLiteral(spreadMethodTypeEEnum, SpreadMethodType.PAD);
		addEEnumLiteral(spreadMethodTypeEEnum, SpreadMethodType.REFLECT);
		addEEnumLiteral(spreadMethodTypeEEnum, SpreadMethodType.REPEAT);

		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.TRANSLATE);
		addEEnumLiteral(typeTypeEEnum, TypeType.SCALE);
		addEEnumLiteral(typeTypeEEnum, TypeType.ROTATE);
		addEEnumLiteral(typeTypeEEnum, TypeType.SKEW_X);
		addEEnumLiteral(typeTypeEEnum, TypeType.SKEW_Y);

		// Initialize data types
		initEDataType(cxTypeEDataType, String.class, "CxType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cyTypeEDataType, String.class, "CyType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fillRuleTypeObjectEDataType, FillRuleType.class, "FillRuleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fontStretchTypeObjectEDataType, FontStretchType.class, "FontStretchTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fxTypeEDataType, String.class, "FxType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fyTypeEDataType, String.class, "FyType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gradientUnitsTypeObjectEDataType, GradientUnitsType.class, "GradientUnitsTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(heightTypeEDataType, String.class, "HeightType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(offsetTypeEDataType, Object.class, "OffsetType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rTypeEDataType, String.class, "RType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(spreadMethodTypeObjectEDataType, SpreadMethodType.class, "SpreadMethodTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(strokeOpacityTypeEDataType, Object.class, "StrokeOpacityType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(strokeOpacityTypeMember1EDataType, double.class, "StrokeOpacityTypeMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(strokeOpacityTypeMember1ObjectEDataType, Double.class, "StrokeOpacityTypeMember1Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(viewBoxTypeEDataType, List.class, "ViewBoxType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(viewBoxTypeBaseEDataType, List.class, "ViewBoxTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(viewBoxTypeBaseItemEDataType, BigInteger.class, "ViewBoxTypeBaseItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(widthTypeEDataType, String.class, "WidthType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(x1TypeEDataType, String.class, "X1Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(x2TypeEDataType, String.class, "X2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xTypeEDataType, String.class, "XType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xType1EDataType, String.class, "XType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(y1TypeEDataType, String.class, "Y1Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(y2TypeEDataType, String.class, "Y2Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(yTypeEDataType, String.class, "YType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(yType1EDataType, String.class, "YType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (cxTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "cx_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (cyTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "cy_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (definitionSrcTypeEClass, 
		   source, 
		   new String[] {
			 "name", "definition-src_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDefinitionSrcType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getDefinitionSrcType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getDefinitionSrcType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (fillRuleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "fill-rule_._type"
		   });		
		addAnnotation
		  (fillRuleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "fill-rule_._type:Object",
			 "baseType", "fill-rule_._type"
		   });		
		addAnnotation
		  (fontFaceFormatTypeEClass, 
		   source, 
		   new String[] {
			 "name", "font-face-format_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFontFaceFormatType_String(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "string",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (fontFaceNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "font-face-name_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFontFaceNameType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (fontFaceSrcTypeEClass, 
		   source, 
		   new String[] {
			 "name", "font-face-src_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFontFaceSrcType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getFontFaceSrcType_FontFaceUri(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-uri",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFontFaceSrcType_FontFaceName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-name",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (fontFaceUriTypeEClass, 
		   source, 
		   new String[] {
			 "name", "font-face-uri_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFontFaceUriType_FontFaceFormat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFontFaceUriType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getFontFaceUriType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getFontFaceUriType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (fontStretchTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "font-stretch_._type"
		   });		
		addAnnotation
		  (fontStretchTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "font-stretch_._type:Object",
			 "baseType", "font-stretch_._type"
		   });		
		addAnnotation
		  (fxTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "fx_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (fyTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "fy_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (gradientUnitsTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "gradientUnits_._type"
		   });		
		addAnnotation
		  (gradientUnitsTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "gradientUnits_._type:Object",
			 "baseType", "gradientUnits_._type"
		   });		
		addAnnotation
		  (heightTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "height_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (linearGradientTypeEClass, 
		   source, 
		   new String[] {
			 "name", "linearGradient_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLinearGradientType_Stop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearGradientType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getLinearGradientType_GradientTransform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gradientTransform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearGradientType_GradientUnits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gradientUnits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearGradientType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getLinearGradientType_SpreadMethod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "spreadMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearGradientType_X1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x1",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearGradientType_X2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x2",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearGradientType_Y1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y1",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearGradientType_Y2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y2",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (offsetTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "offset_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#double urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (radialGradientTypeEClass, 
		   source, 
		   new String[] {
			 "name", "radialGradient_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRadialGradientType_Stop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRadialGradientType_Cx(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cx",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRadialGradientType_Cy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRadialGradientType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getRadialGradientType_Fx(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fx",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRadialGradientType_Fy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRadialGradientType_GradientTransform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gradientTransform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRadialGradientType_GradientUnits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gradientUnits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRadialGradientType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getRadialGradientType_R(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "r",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRadialGradientType_SpreadMethod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "spreadMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (rTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "r_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (spreadMethodTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "spreadMethod_._type"
		   });		
		addAnnotation
		  (spreadMethodTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "spreadMethod_._type:Object",
			 "baseType", "spreadMethod_._type"
		   });		
		addAnnotation
		  (stopTypeEClass, 
		   source, 
		   new String[] {
			 "name", "stop_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStopType_Offset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "offset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStopType_StopColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stop-color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStopType_StopOpacity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stop-opacity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (strokeOpacityTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "stroke-opacity_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent stroke-opacity_._type_._member_._1"
		   });		
		addAnnotation
		  (strokeOpacityTypeMember1EDataType, 
		   source, 
		   new String[] {
			 "name", "stroke-opacity_._type_._member_._1",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "0",
			 "maxInclusive", "1"
		   });		
		addAnnotation
		  (strokeOpacityTypeMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "stroke-opacity_._type_._member_._1:Object",
			 "baseType", "stroke-opacity_._type_._member_._1"
		   });		
		addAnnotation
		  (typeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "type_._type"
		   });		
		addAnnotation
		  (typeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "type_._type:Object",
			 "baseType", "type_._type"
		   });		
		addAnnotation
		  (viewBoxTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "viewBox_._type",
			 "length", "4"
		   });		
		addAnnotation
		  (viewBoxTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "viewBox_._type_._base",
			 "itemType", "viewBox_._type_._base_._item"
		   });		
		addAnnotation
		  (viewBoxTypeBaseItemEDataType, 
		   source, 
		   new String[] {
			 "name", "viewBox_._type_._base_._item",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#integer"
		   });		
		addAnnotation
		  (widthTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "width_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (x1TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "x1_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (x2TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "x2_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (xTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "x_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (xType1EDataType, 
		   source, 
		   new String[] {
			 "name", "x_._1_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#distance urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (y1TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "y1_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (y2TypeEDataType, 
		   source, 
		   new String[] {
			 "name", "y2_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (yTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "y_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#coordinate urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (yType1EDataType, 
		   source, 
		   new String[] {
			 "name", "y_._1_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#distance urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
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
		  (getDocumentRoot_DefinitionSrc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "definition-src",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontFaceFormat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontFaceName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontFaceSrc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-src",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontFaceUri(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font-face-uri",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LinearGradient(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "linearGradient",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RadialGradient(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "radialGradient",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Stop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AccentHeight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "accent-height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Alphabetic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alphabetic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Ascent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ascent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Bbox(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bbox",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CapHeight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cap-height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Cx(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cx",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Cy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_D(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "d",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Descent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "descent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FillRule(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fill-rule",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "font-family",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "font-size",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontStretch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "font-stretch",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "font-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontVariant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "font-variant",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FontWeight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "font-weight",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GradientTransform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gradientTransform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GradientUnits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gradientUnits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Hanging(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hanging",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Ideographic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ideographic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Mathematical(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mathematical",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Origin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "origin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OverlinePosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "overline-position",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OverlineThickness(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "overline-thickness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Panose1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "panose-1",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_R(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "r",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Rx(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rx",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Ry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Slope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "slope",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpreadMethod(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "spreadMethod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Stemh(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stemh",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Stemv(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stemv",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StrikethroughPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "strikethrough-position",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StrikethroughThickness(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "strikethrough-thickness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StrokeColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stroke-color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StrokeOpacity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stroke-opacity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StrokeWidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stroke-width",
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
		  (getDocumentRoot_UnderlinePosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "underline-position",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UnderlineThickness(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "underline-thickness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UnicodeRange(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unicode-range",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UnitsPerEm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "units-per-em",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_VAlphabetic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "v-alphabetic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_VHanging(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "v-hanging",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_VIdeographic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "v-ideographic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ViewBox(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "viewBox",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_VMathematical(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "v-mathematical",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Widths(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "widths",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_X1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x1",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_X2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x2",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_XHeight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x-height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Y1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y1",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Y2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y2",
			 "namespace", "##targetNamespace"
		   });
	}

} //SvgPackageImpl
