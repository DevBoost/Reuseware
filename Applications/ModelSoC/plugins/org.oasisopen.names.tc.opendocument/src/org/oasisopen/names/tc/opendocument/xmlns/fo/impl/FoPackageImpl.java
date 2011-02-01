/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.fo.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.fo.BackgroundColorTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.fo.BreakAfterType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.BreakBeforeType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.fo.FoFactory;
import org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage;
import org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationKeepType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.HyphenationLadderCountTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.fo.KeepTogetherType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.KeepWithNextType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.LetterSpacingTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.fo.LineHeightTypeMember2;
import org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignLastType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.TextAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.TextTransformType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.WrapOptionType;
import org.oasisopen.names.tc.opendocument.xmlns.fo.util.FoValidator;
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
public class FoPackageImpl extends EPackageImpl implements FoPackage {
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
	private EEnum backgroundColorTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum breakAfterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum breakBeforeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hyphenationKeepTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hyphenationLadderCountTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keepTogetherTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keepWithNextTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum letterSpacingTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineHeightTypeMember2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textAlignLastTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textTransformTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wrapOptionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType backgroundColorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType backgroundColorTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType breakAfterTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType breakBeforeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontSizeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyphenationKeepTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyphenationLadderCountTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hyphenationLadderCountTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keepTogetherTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keepWithNextTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType letterSpacingTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType letterSpacingTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineHeightTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineHeightTypeMember2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType marginBottomTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType marginLeftTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType marginRightTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType marginTopTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType marginTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maxHeightTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maxWidthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType minHeightTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType minWidthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textAlignLastTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textIndentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textTransformTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wrapOptionTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.fo.FoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FoPackageImpl() {
		super(eNS_URI, FoFactory.eINSTANCE);
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
	public static FoPackage init() {
		if (isInited) return (FoPackage)EPackage.Registry.INSTANCE.getEPackage(FoPackage.eNS_URI);

		// Obtain or create and register package
		FoPackageImpl theFoPackage = (FoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof FoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new FoPackageImpl());

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
		theFoPackage.createPackageContents();
		theOfficePackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theXLinkPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
		theSvgPackage.createPackageContents();
		theDr3dPackage.createPackageContents();
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
		theFoPackage.initializePackageContents();
		theOfficePackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theXLinkPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
		theSvgPackage.initializePackageContents();
		theDr3dPackage.initializePackageContents();
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
			(theFoPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FoValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFoPackage.freeze();

		return theFoPackage;
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
	public EAttribute getDocumentRoot_BackgroundColor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Border() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BorderBottom() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BorderLeft() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BorderRight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BorderTop() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BreakAfter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BreakBefore() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Clip() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Color() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ColumnCount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ColumnGap() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Country() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndIndent() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontFamily() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontSize() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontStyle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontVariant() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FontWeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Height() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Hyphenate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HyphenationKeep() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HyphenationLadderCount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HyphenationPushCharCount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HyphenationRemainCharCount() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_KeepTogether() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_KeepWithNext() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Language() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LetterSpacing() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LineHeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Margin() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarginBottom() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarginLeft() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarginRight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MarginTop() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MaxHeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MaxWidth() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinWidth() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Orphans() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Padding() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaddingBottom() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaddingLeft() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaddingRight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PaddingTop() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PageHeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PageWidth() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SpaceAfter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SpaceBefore() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StartIndent() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextAlign() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextAlignLast() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextIndent() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextShadow() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextTransform() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Widows() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Width() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_WrapOption() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBackgroundColorTypeMember1() {
		return backgroundColorTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBreakAfterType() {
		return breakAfterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBreakBeforeType() {
		return breakBeforeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHyphenationKeepType() {
		return hyphenationKeepTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHyphenationLadderCountTypeMember1() {
		return hyphenationLadderCountTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeepTogetherType() {
		return keepTogetherTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKeepWithNextType() {
		return keepWithNextTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLetterSpacingTypeMember1() {
		return letterSpacingTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineHeightTypeMember2() {
		return lineHeightTypeMember2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextAlignLastType() {
		return textAlignLastTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextAlignType() {
		return textAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextTransformType() {
		return textTransformTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWrapOptionType() {
		return wrapOptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBackgroundColorType() {
		return backgroundColorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBackgroundColorTypeMember1Object() {
		return backgroundColorTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBreakAfterTypeObject() {
		return breakAfterTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBreakBeforeTypeObject() {
		return breakBeforeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontSizeType() {
		return fontSizeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyphenationKeepTypeObject() {
		return hyphenationKeepTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyphenationLadderCountType() {
		return hyphenationLadderCountTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHyphenationLadderCountTypeMember1Object() {
		return hyphenationLadderCountTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKeepTogetherTypeObject() {
		return keepTogetherTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKeepWithNextTypeObject() {
		return keepWithNextTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLetterSpacingType() {
		return letterSpacingTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLetterSpacingTypeMember1Object() {
		return letterSpacingTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineHeightType() {
		return lineHeightTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLineHeightTypeMember2Object() {
		return lineHeightTypeMember2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarginBottomType() {
		return marginBottomTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarginLeftType() {
		return marginLeftTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarginRightType() {
		return marginRightTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarginTopType() {
		return marginTopTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMarginType() {
		return marginTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaxHeightType() {
		return maxHeightTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaxWidthType() {
		return maxWidthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMinHeightType() {
		return minHeightTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMinWidthType() {
		return minWidthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextAlignLastTypeObject() {
		return textAlignLastTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextAlignTypeObject() {
		return textAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextIndentType() {
		return textIndentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextTransformTypeObject() {
		return textTransformTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWrapOptionTypeObject() {
		return wrapOptionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoFactory getFoFactory() {
		return (FoFactory)getEFactoryInstance();
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
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BACKGROUND_COLOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BORDER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BORDER_BOTTOM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BORDER_LEFT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BORDER_RIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BORDER_TOP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BREAK_AFTER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BREAK_BEFORE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CLIP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COLOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COLUMN_COUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COLUMN_GAP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COUNTRY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__END_INDENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_FAMILY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_SIZE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_STYLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_VARIANT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FONT_WEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HYPHENATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HYPHENATION_KEEP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HYPHENATION_LADDER_COUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HYPHENATION_PUSH_CHAR_COUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HYPHENATION_REMAIN_CHAR_COUNT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEEP_TOGETHER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEEP_WITH_NEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LANGUAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LETTER_SPACING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LINE_HEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MARGIN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MARGIN_BOTTOM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MARGIN_LEFT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MARGIN_RIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MARGIN_TOP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MAX_HEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MAX_WIDTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIN_WIDTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORPHANS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PADDING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PADDING_BOTTOM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PADDING_LEFT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PADDING_RIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PADDING_TOP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PAGE_HEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PAGE_WIDTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPACE_AFTER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPACE_BEFORE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__START_INDENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXT_ALIGN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXT_ALIGN_LAST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXT_INDENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXT_SHADOW);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXT_TRANSFORM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WIDOWS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WIDTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WRAP_OPTION);

		// Create enums
		backgroundColorTypeMember1EEnum = createEEnum(BACKGROUND_COLOR_TYPE_MEMBER1);
		breakAfterTypeEEnum = createEEnum(BREAK_AFTER_TYPE);
		breakBeforeTypeEEnum = createEEnum(BREAK_BEFORE_TYPE);
		hyphenationKeepTypeEEnum = createEEnum(HYPHENATION_KEEP_TYPE);
		hyphenationLadderCountTypeMember1EEnum = createEEnum(HYPHENATION_LADDER_COUNT_TYPE_MEMBER1);
		keepTogetherTypeEEnum = createEEnum(KEEP_TOGETHER_TYPE);
		keepWithNextTypeEEnum = createEEnum(KEEP_WITH_NEXT_TYPE);
		letterSpacingTypeMember1EEnum = createEEnum(LETTER_SPACING_TYPE_MEMBER1);
		lineHeightTypeMember2EEnum = createEEnum(LINE_HEIGHT_TYPE_MEMBER2);
		textAlignLastTypeEEnum = createEEnum(TEXT_ALIGN_LAST_TYPE);
		textAlignTypeEEnum = createEEnum(TEXT_ALIGN_TYPE);
		textTransformTypeEEnum = createEEnum(TEXT_TRANSFORM_TYPE);
		wrapOptionTypeEEnum = createEEnum(WRAP_OPTION_TYPE);

		// Create data types
		backgroundColorTypeEDataType = createEDataType(BACKGROUND_COLOR_TYPE);
		backgroundColorTypeMember1ObjectEDataType = createEDataType(BACKGROUND_COLOR_TYPE_MEMBER1_OBJECT);
		breakAfterTypeObjectEDataType = createEDataType(BREAK_AFTER_TYPE_OBJECT);
		breakBeforeTypeObjectEDataType = createEDataType(BREAK_BEFORE_TYPE_OBJECT);
		fontSizeTypeEDataType = createEDataType(FONT_SIZE_TYPE);
		hyphenationKeepTypeObjectEDataType = createEDataType(HYPHENATION_KEEP_TYPE_OBJECT);
		hyphenationLadderCountTypeEDataType = createEDataType(HYPHENATION_LADDER_COUNT_TYPE);
		hyphenationLadderCountTypeMember1ObjectEDataType = createEDataType(HYPHENATION_LADDER_COUNT_TYPE_MEMBER1_OBJECT);
		keepTogetherTypeObjectEDataType = createEDataType(KEEP_TOGETHER_TYPE_OBJECT);
		keepWithNextTypeObjectEDataType = createEDataType(KEEP_WITH_NEXT_TYPE_OBJECT);
		letterSpacingTypeEDataType = createEDataType(LETTER_SPACING_TYPE);
		letterSpacingTypeMember1ObjectEDataType = createEDataType(LETTER_SPACING_TYPE_MEMBER1_OBJECT);
		lineHeightTypeEDataType = createEDataType(LINE_HEIGHT_TYPE);
		lineHeightTypeMember2ObjectEDataType = createEDataType(LINE_HEIGHT_TYPE_MEMBER2_OBJECT);
		marginBottomTypeEDataType = createEDataType(MARGIN_BOTTOM_TYPE);
		marginLeftTypeEDataType = createEDataType(MARGIN_LEFT_TYPE);
		marginRightTypeEDataType = createEDataType(MARGIN_RIGHT_TYPE);
		marginTopTypeEDataType = createEDataType(MARGIN_TOP_TYPE);
		marginTypeEDataType = createEDataType(MARGIN_TYPE);
		maxHeightTypeEDataType = createEDataType(MAX_HEIGHT_TYPE);
		maxWidthTypeEDataType = createEDataType(MAX_WIDTH_TYPE);
		minHeightTypeEDataType = createEDataType(MIN_HEIGHT_TYPE);
		minWidthTypeEDataType = createEDataType(MIN_WIDTH_TYPE);
		textAlignLastTypeObjectEDataType = createEDataType(TEXT_ALIGN_LAST_TYPE_OBJECT);
		textAlignTypeObjectEDataType = createEDataType(TEXT_ALIGN_TYPE_OBJECT);
		textIndentTypeEDataType = createEDataType(TEXT_INDENT_TYPE);
		textTransformTypeObjectEDataType = createEDataType(TEXT_TRANSFORM_TYPE_OBJECT);
		wrapOptionTypeObjectEDataType = createEDataType(WRAP_OPTION_TYPE_OBJECT);
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
		initEAttribute(getDocumentRoot_BackgroundColor(), this.getBackgroundColorType(), "backgroundColor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Border(), theTextPackage.getString(), "border", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BorderBottom(), theTextPackage.getString(), "borderBottom", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BorderLeft(), theTextPackage.getString(), "borderLeft", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BorderRight(), theTextPackage.getString(), "borderRight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BorderTop(), theTextPackage.getString(), "borderTop", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BreakAfter(), this.getBreakAfterType(), "breakAfter", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BreakBefore(), this.getBreakBeforeType(), "breakBefore", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Clip(), theTextPackage.getString(), "clip", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Color(), theTextPackage.getColor(), "color", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ColumnCount(), theTextPackage.getPositiveInteger(), "columnCount", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ColumnGap(), theTextPackage.getLength(), "columnGap", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EndIndent(), theTextPackage.getLength(), "endIndent", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontFamily(), theTextPackage.getString(), "fontFamily", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontSize(), this.getFontSizeType(), "fontSize", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontStyle(), theTextPackage.getFontStyle(), "fontStyle", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontVariant(), theTextPackage.getFontVariant(), "fontVariant", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FontWeight(), theTextPackage.getFontWeight(), "fontWeight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Height(), theTextPackage.getPositiveLength(), "height", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Hyphenate(), theTextPackage.getBoolean(), "hyphenate", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HyphenationKeep(), this.getHyphenationKeepType(), "hyphenationKeep", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HyphenationLadderCount(), this.getHyphenationLadderCountType(), "hyphenationLadderCount", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HyphenationPushCharCount(), theTextPackage.getPositiveInteger(), "hyphenationPushCharCount", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HyphenationRemainCharCount(), theTextPackage.getPositiveInteger(), "hyphenationRemainCharCount", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_KeepTogether(), this.getKeepTogetherType(), "keepTogether", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_KeepWithNext(), this.getKeepWithNextType(), "keepWithNext", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LetterSpacing(), this.getLetterSpacingType(), "letterSpacing", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LineHeight(), this.getLineHeightType(), "lineHeight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Margin(), this.getMarginType(), "margin", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MarginBottom(), this.getMarginBottomType(), "marginBottom", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MarginLeft(), this.getMarginLeftType(), "marginLeft", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MarginRight(), this.getMarginRightType(), "marginRight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MarginTop(), this.getMarginTopType(), "marginTop", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MaxHeight(), this.getMaxHeightType(), "maxHeight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MaxWidth(), this.getMaxWidthType(), "maxWidth", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MinWidth(), this.getMinWidthType(), "minWidth", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Orphans(), theTextPackage.getNonNegativeInteger(), "orphans", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Padding(), theTextPackage.getNonNegativeLength(), "padding", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PaddingBottom(), theTextPackage.getNonNegativeLength(), "paddingBottom", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PaddingLeft(), theTextPackage.getNonNegativeLength(), "paddingLeft", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PaddingRight(), theTextPackage.getNonNegativeLength(), "paddingRight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PaddingTop(), theTextPackage.getNonNegativeLength(), "paddingTop", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PageHeight(), theTextPackage.getLength(), "pageHeight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PageWidth(), theTextPackage.getLength(), "pageWidth", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SpaceAfter(), theTextPackage.getLength(), "spaceAfter", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SpaceBefore(), theTextPackage.getLength(), "spaceBefore", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StartIndent(), theTextPackage.getLength(), "startIndent", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextAlign(), this.getTextAlignType(), "textAlign", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextAlignLast(), this.getTextAlignLastType(), "textAlignLast", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextIndent(), this.getTextIndentType(), "textIndent", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextShadow(), theTextPackage.getShadowType(), "textShadow", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextTransform(), this.getTextTransformType(), "textTransform", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Widows(), theTextPackage.getNonNegativeInteger(), "widows", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Width(), theTextPackage.getPositiveLength(), "width", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_WrapOption(), this.getWrapOptionType(), "wrapOption", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(backgroundColorTypeMember1EEnum, BackgroundColorTypeMember1.class, "BackgroundColorTypeMember1");
		addEEnumLiteral(backgroundColorTypeMember1EEnum, BackgroundColorTypeMember1.TRANSPARENT);

		initEEnum(breakAfterTypeEEnum, BreakAfterType.class, "BreakAfterType");
		addEEnumLiteral(breakAfterTypeEEnum, BreakAfterType.AUTO);
		addEEnumLiteral(breakAfterTypeEEnum, BreakAfterType.COLUMN);
		addEEnumLiteral(breakAfterTypeEEnum, BreakAfterType.PAGE);

		initEEnum(breakBeforeTypeEEnum, BreakBeforeType.class, "BreakBeforeType");
		addEEnumLiteral(breakBeforeTypeEEnum, BreakBeforeType.AUTO);
		addEEnumLiteral(breakBeforeTypeEEnum, BreakBeforeType.COLUMN);
		addEEnumLiteral(breakBeforeTypeEEnum, BreakBeforeType.PAGE);

		initEEnum(hyphenationKeepTypeEEnum, HyphenationKeepType.class, "HyphenationKeepType");
		addEEnumLiteral(hyphenationKeepTypeEEnum, HyphenationKeepType.AUTO);
		addEEnumLiteral(hyphenationKeepTypeEEnum, HyphenationKeepType.PAGE);

		initEEnum(hyphenationLadderCountTypeMember1EEnum, HyphenationLadderCountTypeMember1.class, "HyphenationLadderCountTypeMember1");
		addEEnumLiteral(hyphenationLadderCountTypeMember1EEnum, HyphenationLadderCountTypeMember1.NO_LIMIT);

		initEEnum(keepTogetherTypeEEnum, KeepTogetherType.class, "KeepTogetherType");
		addEEnumLiteral(keepTogetherTypeEEnum, KeepTogetherType.AUTO);
		addEEnumLiteral(keepTogetherTypeEEnum, KeepTogetherType.ALWAYS);

		initEEnum(keepWithNextTypeEEnum, KeepWithNextType.class, "KeepWithNextType");
		addEEnumLiteral(keepWithNextTypeEEnum, KeepWithNextType.AUTO);
		addEEnumLiteral(keepWithNextTypeEEnum, KeepWithNextType.ALWAYS);

		initEEnum(letterSpacingTypeMember1EEnum, LetterSpacingTypeMember1.class, "LetterSpacingTypeMember1");
		addEEnumLiteral(letterSpacingTypeMember1EEnum, LetterSpacingTypeMember1.NORMAL);

		initEEnum(lineHeightTypeMember2EEnum, LineHeightTypeMember2.class, "LineHeightTypeMember2");
		addEEnumLiteral(lineHeightTypeMember2EEnum, LineHeightTypeMember2.NORMAL);

		initEEnum(textAlignLastTypeEEnum, TextAlignLastType.class, "TextAlignLastType");
		addEEnumLiteral(textAlignLastTypeEEnum, TextAlignLastType.START);
		addEEnumLiteral(textAlignLastTypeEEnum, TextAlignLastType.CENTER);
		addEEnumLiteral(textAlignLastTypeEEnum, TextAlignLastType.JUSTIFY);

		initEEnum(textAlignTypeEEnum, TextAlignType.class, "TextAlignType");
		addEEnumLiteral(textAlignTypeEEnum, TextAlignType.START);
		addEEnumLiteral(textAlignTypeEEnum, TextAlignType.END);
		addEEnumLiteral(textAlignTypeEEnum, TextAlignType.LEFT);
		addEEnumLiteral(textAlignTypeEEnum, TextAlignType.RIGHT);
		addEEnumLiteral(textAlignTypeEEnum, TextAlignType.CENTER);
		addEEnumLiteral(textAlignTypeEEnum, TextAlignType.JUSTIFY);

		initEEnum(textTransformTypeEEnum, TextTransformType.class, "TextTransformType");
		addEEnumLiteral(textTransformTypeEEnum, TextTransformType.NONE);
		addEEnumLiteral(textTransformTypeEEnum, TextTransformType.LOWERCASE);
		addEEnumLiteral(textTransformTypeEEnum, TextTransformType.UPPERCASE);
		addEEnumLiteral(textTransformTypeEEnum, TextTransformType.CAPITALIZE);

		initEEnum(wrapOptionTypeEEnum, WrapOptionType.class, "WrapOptionType");
		addEEnumLiteral(wrapOptionTypeEEnum, WrapOptionType.NO_WRAP);
		addEEnumLiteral(wrapOptionTypeEEnum, WrapOptionType.WRAP);

		// Initialize data types
		initEDataType(backgroundColorTypeEDataType, Object.class, "BackgroundColorType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(backgroundColorTypeMember1ObjectEDataType, BackgroundColorTypeMember1.class, "BackgroundColorTypeMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(breakAfterTypeObjectEDataType, BreakAfterType.class, "BreakAfterTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(breakBeforeTypeObjectEDataType, BreakBeforeType.class, "BreakBeforeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fontSizeTypeEDataType, String.class, "FontSizeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hyphenationKeepTypeObjectEDataType, HyphenationKeepType.class, "HyphenationKeepTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hyphenationLadderCountTypeEDataType, Object.class, "HyphenationLadderCountType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hyphenationLadderCountTypeMember1ObjectEDataType, HyphenationLadderCountTypeMember1.class, "HyphenationLadderCountTypeMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(keepTogetherTypeObjectEDataType, KeepTogetherType.class, "KeepTogetherTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(keepWithNextTypeObjectEDataType, KeepWithNextType.class, "KeepWithNextTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(letterSpacingTypeEDataType, Object.class, "LetterSpacingType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(letterSpacingTypeMember1ObjectEDataType, LetterSpacingTypeMember1.class, "LetterSpacingTypeMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lineHeightTypeEDataType, Object.class, "LineHeightType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lineHeightTypeMember2ObjectEDataType, LineHeightTypeMember2.class, "LineHeightTypeMember2Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(marginBottomTypeEDataType, String.class, "MarginBottomType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(marginLeftTypeEDataType, String.class, "MarginLeftType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(marginRightTypeEDataType, String.class, "MarginRightType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(marginTopTypeEDataType, String.class, "MarginTopType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(marginTypeEDataType, String.class, "MarginType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maxHeightTypeEDataType, String.class, "MaxHeightType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maxWidthTypeEDataType, String.class, "MaxWidthType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(minHeightTypeEDataType, String.class, "MinHeightType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(minWidthTypeEDataType, String.class, "MinWidthType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textAlignLastTypeObjectEDataType, TextAlignLastType.class, "TextAlignLastTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textAlignTypeObjectEDataType, TextAlignType.class, "TextAlignTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textIndentTypeEDataType, String.class, "TextIndentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textTransformTypeObjectEDataType, TextTransformType.class, "TextTransformTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wrapOptionTypeObjectEDataType, WrapOptionType.class, "WrapOptionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (backgroundColorTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "background-color_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#color background-color_._type_._member_._1"
		   });		
		addAnnotation
		  (backgroundColorTypeMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "background-color_._type_._member_._1"
		   });		
		addAnnotation
		  (backgroundColorTypeMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "background-color_._type_._member_._1:Object",
			 "baseType", "background-color_._type_._member_._1"
		   });		
		addAnnotation
		  (breakAfterTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "break-after_._type"
		   });		
		addAnnotation
		  (breakAfterTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "break-after_._type:Object",
			 "baseType", "break-after_._type"
		   });		
		addAnnotation
		  (breakBeforeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "break-before_._type"
		   });		
		addAnnotation
		  (breakBeforeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "break-before_._type:Object",
			 "baseType", "break-before_._type"
		   });		
		addAnnotation
		  (fontSizeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "font-size_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (hyphenationKeepTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "hyphenation-keep_._type"
		   });		
		addAnnotation
		  (hyphenationKeepTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "hyphenation-keep_._type:Object",
			 "baseType", "hyphenation-keep_._type"
		   });		
		addAnnotation
		  (hyphenationLadderCountTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "hyphenation-ladder-count_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#positiveInteger hyphenation-ladder-count_._type_._member_._1"
		   });		
		addAnnotation
		  (hyphenationLadderCountTypeMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "hyphenation-ladder-count_._type_._member_._1"
		   });		
		addAnnotation
		  (hyphenationLadderCountTypeMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "hyphenation-ladder-count_._type_._member_._1:Object",
			 "baseType", "hyphenation-ladder-count_._type_._member_._1"
		   });		
		addAnnotation
		  (keepTogetherTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "keep-together_._type"
		   });		
		addAnnotation
		  (keepTogetherTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "keep-together_._type:Object",
			 "baseType", "keep-together_._type"
		   });		
		addAnnotation
		  (keepWithNextTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "keep-with-next_._type"
		   });		
		addAnnotation
		  (keepWithNextTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "keep-with-next_._type:Object",
			 "baseType", "keep-with-next_._type"
		   });		
		addAnnotation
		  (letterSpacingTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "letter-spacing_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length letter-spacing_._type_._member_._1"
		   });		
		addAnnotation
		  (letterSpacingTypeMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "letter-spacing_._type_._member_._1"
		   });		
		addAnnotation
		  (letterSpacingTypeMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "letter-spacing_._type_._member_._1:Object",
			 "baseType", "letter-spacing_._type_._member_._1"
		   });		
		addAnnotation
		  (lineHeightTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "line-height_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent line-height_._type_._member_._2"
		   });		
		addAnnotation
		  (lineHeightTypeMember2EEnum, 
		   source, 
		   new String[] {
			 "name", "line-height_._type_._member_._2"
		   });		
		addAnnotation
		  (lineHeightTypeMember2ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "line-height_._type_._member_._2:Object",
			 "baseType", "line-height_._type_._member_._2"
		   });		
		addAnnotation
		  (marginBottomTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "margin-bottom_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (marginLeftTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "margin-left_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (marginRightTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "margin-right_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (marginTopTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "margin-top_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (marginTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "margin_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#nonNegativeLength urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (maxHeightTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "max-height_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (maxWidthTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "max-width_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (minHeightTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "min-height_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (minWidthTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "min-width_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
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
		  (getDocumentRoot_BackgroundColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "background-color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Border(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "border",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BorderBottom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "border-bottom",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BorderLeft(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "border-left",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BorderRight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "border-right",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BorderTop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "border-top",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BreakAfter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "break-after",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BreakBefore(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "break-before",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Clip(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clip",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Color(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ColumnCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ColumnGap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column-gap",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EndIndent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end-indent",
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
		  (getDocumentRoot_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Hyphenate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hyphenate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HyphenationKeep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hyphenation-keep",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HyphenationLadderCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hyphenation-ladder-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HyphenationPushCharCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hyphenation-push-char-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HyphenationRemainCharCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hyphenation-remain-char-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeepTogether(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keep-together",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_KeepWithNext(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keep-with-next",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LetterSpacing(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "letter-spacing",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LineHeight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "line-height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Margin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "margin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MarginBottom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "margin-bottom",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MarginLeft(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "margin-left",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MarginRight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "margin-right",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MarginTop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "margin-top",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MaxHeight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max-height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MaxWidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max-width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MinWidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Orphans(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "orphans",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Padding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "padding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PaddingBottom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "padding-bottom",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PaddingLeft(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "padding-left",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PaddingRight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "padding-right",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PaddingTop(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "padding-top",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PageHeight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "page-height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PageWidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "page-width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpaceAfter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space-after",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpaceBefore(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space-before",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StartIndent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start-indent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextAlign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "text-align",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextAlignLast(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "text-align-last",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextIndent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "text-indent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextShadow(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "text-shadow",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextTransform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "text-transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Widows(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "widows",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_WrapOption(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "wrap-option",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (textAlignLastTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "text-align-last_._type"
		   });		
		addAnnotation
		  (textAlignLastTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "text-align-last_._type:Object",
			 "baseType", "text-align-last_._type"
		   });		
		addAnnotation
		  (textAlignTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "text-align_._type"
		   });		
		addAnnotation
		  (textAlignTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "text-align_._type:Object",
			 "baseType", "text-align_._type"
		   });		
		addAnnotation
		  (textIndentTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "text-indent_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#length urn:oasis:names:tc:opendocument:xmlns:text:1.0#percent"
		   });		
		addAnnotation
		  (textTransformTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "text-transform_._type"
		   });		
		addAnnotation
		  (textTransformTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "text-transform_._type:Object",
			 "baseType", "text-transform_._type"
		   });		
		addAnnotation
		  (wrapOptionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "wrap-option_._type"
		   });		
		addAnnotation
		  (wrapOptionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "wrap-option_._type:Object",
			 "baseType", "wrap-option_._type"
		   });
	}

} //FoPackageImpl
