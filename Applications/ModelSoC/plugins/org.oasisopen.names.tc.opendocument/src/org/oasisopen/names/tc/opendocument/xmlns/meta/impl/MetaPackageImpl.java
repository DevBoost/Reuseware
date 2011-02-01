/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.meta.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
import org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.MetaFactory;
import org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage;
import org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.ValueTypeType;
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
public class MetaPackageImpl extends EPackageImpl implements MetaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoReloadTypeEClass = null;

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
	private EClass documentStatisticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperlinkBehaviourTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedTypeEClass = null;

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
	private EDataType valueTypeTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaPackageImpl() {
		super(eNS_URI, MetaFactory.eINSTANCE);
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
	public static MetaPackage init() {
		if (isInited) return (MetaPackage)EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI);

		// Obtain or create and register package
		MetaPackageImpl theMetaPackage = (MetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof MetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new MetaPackageImpl());

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
		CompatiblePackageImpl theCompatiblePackage = (CompatiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI) instanceof CompatiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI) : CompatiblePackage.eINSTANCE);
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
		theMetaPackage.createPackageContents();
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
		theChartPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theMathMLPackage.createPackageContents();
		theXFormsPackage.createPackageContents();

		// Initialize created meta-data
		theMetaPackage.initializePackageContents();
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
		theMetaPackage.freeze();

		return theMetaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoReloadType() {
		return autoReloadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoReloadType_Actuate() {
		return (EAttribute)autoReloadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoReloadType_Delay() {
		return (EAttribute)autoReloadTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoReloadType_Href() {
		return (EAttribute)autoReloadTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoReloadType_Show() {
		return (EAttribute)autoReloadTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoReloadType_Type() {
		return (EAttribute)autoReloadTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getDocumentRoot_AutoReload() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CreationDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DateString() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentStatistic() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EditingCycles() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EditingDuration() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Generator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HyperlinkBehaviour() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_InitialCreator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Keyword() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PrintDate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PrintedBy() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Template() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserDefined() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentStatisticType() {
		return documentStatisticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_CellCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_CharacterCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_DrawCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_FrameCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_ImageCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_NonWhitespaceCharacterCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_ObjectCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_OleObjectCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_PageCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_ParagraphCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_RowCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_SentenceCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_SyllableCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_TableCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentStatisticType_WordCount() {
		return (EAttribute)documentStatisticTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHyperlinkBehaviourType() {
		return hyperlinkBehaviourTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHyperlinkBehaviourType_Show() {
		return (EAttribute)hyperlinkBehaviourTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHyperlinkBehaviourType_TargetFrameName() {
		return (EAttribute)hyperlinkBehaviourTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateType() {
		return templateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Actuate() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Date() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Href() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Title() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Type() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedType() {
		return userDefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_Mixed() {
		return (EAttribute)userDefinedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_Name() {
		return (EAttribute)userDefinedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedType_ValueType() {
		return (EAttribute)userDefinedTypeEClass.getEStructuralFeatures().get(2);
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
	public EDataType getValueTypeTypeObject() {
		return valueTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaFactory getMetaFactory() {
		return (MetaFactory)getEFactoryInstance();
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
		autoReloadTypeEClass = createEClass(AUTO_RELOAD_TYPE);
		createEAttribute(autoReloadTypeEClass, AUTO_RELOAD_TYPE__ACTUATE);
		createEAttribute(autoReloadTypeEClass, AUTO_RELOAD_TYPE__DELAY);
		createEAttribute(autoReloadTypeEClass, AUTO_RELOAD_TYPE__HREF);
		createEAttribute(autoReloadTypeEClass, AUTO_RELOAD_TYPE__SHOW);
		createEAttribute(autoReloadTypeEClass, AUTO_RELOAD_TYPE__TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTO_RELOAD);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CREATION_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATE_STRING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT_STATISTIC);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EDITING_CYCLES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EDITING_DURATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GENERATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INITIAL_CREATOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEYWORD);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRINT_DATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PRINTED_BY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEMPLATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USER_DEFINED);

		documentStatisticTypeEClass = createEClass(DOCUMENT_STATISTIC_TYPE);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__CELL_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__CHARACTER_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__DRAW_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__FRAME_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__IMAGE_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__NON_WHITESPACE_CHARACTER_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__OBJECT_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__OLE_OBJECT_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__PAGE_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__PARAGRAPH_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__ROW_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__SENTENCE_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__SYLLABLE_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__TABLE_COUNT);
		createEAttribute(documentStatisticTypeEClass, DOCUMENT_STATISTIC_TYPE__WORD_COUNT);

		hyperlinkBehaviourTypeEClass = createEClass(HYPERLINK_BEHAVIOUR_TYPE);
		createEAttribute(hyperlinkBehaviourTypeEClass, HYPERLINK_BEHAVIOUR_TYPE__SHOW);
		createEAttribute(hyperlinkBehaviourTypeEClass, HYPERLINK_BEHAVIOUR_TYPE__TARGET_FRAME_NAME);

		templateTypeEClass = createEClass(TEMPLATE_TYPE);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__ACTUATE);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__DATE);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__HREF);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__TITLE);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__TYPE);

		userDefinedTypeEClass = createEClass(USER_DEFINED_TYPE);
		createEAttribute(userDefinedTypeEClass, USER_DEFINED_TYPE__MIXED);
		createEAttribute(userDefinedTypeEClass, USER_DEFINED_TYPE__NAME);
		createEAttribute(userDefinedTypeEClass, USER_DEFINED_TYPE__VALUE_TYPE);

		// Create enums
		valueTypeTypeEEnum = createEEnum(VALUE_TYPE_TYPE);

		// Create data types
		valueTypeTypeObjectEDataType = createEDataType(VALUE_TYPE_TYPE_OBJECT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(autoReloadTypeEClass, AutoReloadType.class, "AutoReloadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutoReloadType_Actuate(), theXLinkPackage.getActuateType(), "actuate", null, 1, 1, AutoReloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoReloadType_Delay(), theTextPackage.getDuration(), "delay", null, 0, 1, AutoReloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoReloadType_Href(), theTextPackage.getAnyURI(), "href", null, 0, 1, AutoReloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoReloadType_Show(), theXLinkPackage.getShowType(), "show", null, 1, 1, AutoReloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoReloadType_Type(), theXLinkPackage.getTypeType(), "type", "simple", 0, 1, AutoReloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AutoReload(), this.getAutoReloadType(), null, "autoReload", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CreationDate(), theTextPackage.getDateTime(), "creationDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DateString(), theTextPackage.getString(), "dateString", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DocumentStatistic(), this.getDocumentStatisticType(), null, "documentStatistic", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EditingCycles(), theTextPackage.getNonNegativeInteger(), "editingCycles", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EditingDuration(), theTextPackage.getDuration(), "editingDuration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Generator(), theTextPackage.getString(), "generator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HyperlinkBehaviour(), this.getHyperlinkBehaviourType(), null, "hyperlinkBehaviour", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_InitialCreator(), theTextPackage.getString(), "initialCreator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Keyword(), theTextPackage.getString(), "keyword", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PrintDate(), theTextPackage.getDateTime(), "printDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PrintedBy(), theTextPackage.getString(), "printedBy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Template(), this.getTemplateType(), null, "template", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UserDefined(), this.getUserDefinedType(), null, "userDefined", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentStatisticTypeEClass, DocumentStatisticType.class, "DocumentStatisticType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentStatisticType_CellCount(), theTextPackage.getNonNegativeInteger(), "cellCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_CharacterCount(), theTextPackage.getNonNegativeInteger(), "characterCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_DrawCount(), theTextPackage.getNonNegativeInteger(), "drawCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_FrameCount(), theTextPackage.getNonNegativeInteger(), "frameCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_ImageCount(), theTextPackage.getNonNegativeInteger(), "imageCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_NonWhitespaceCharacterCount(), theTextPackage.getNonNegativeInteger(), "nonWhitespaceCharacterCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_ObjectCount(), theTextPackage.getNonNegativeInteger(), "objectCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_OleObjectCount(), theTextPackage.getNonNegativeInteger(), "oleObjectCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_PageCount(), theTextPackage.getNonNegativeInteger(), "pageCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_ParagraphCount(), theTextPackage.getNonNegativeInteger(), "paragraphCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_RowCount(), theTextPackage.getNonNegativeInteger(), "rowCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_SentenceCount(), theTextPackage.getNonNegativeInteger(), "sentenceCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_SyllableCount(), theTextPackage.getNonNegativeInteger(), "syllableCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_TableCount(), theTextPackage.getNonNegativeInteger(), "tableCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentStatisticType_WordCount(), theTextPackage.getNonNegativeInteger(), "wordCount", null, 0, 1, DocumentStatisticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hyperlinkBehaviourTypeEClass, HyperlinkBehaviourType.class, "HyperlinkBehaviourType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHyperlinkBehaviourType_Show(), theXLinkPackage.getShowType2(), "show", null, 1, 1, HyperlinkBehaviourType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHyperlinkBehaviourType_TargetFrameName(), theTextPackage.getTargetFrameName(), "targetFrameName", null, 0, 1, HyperlinkBehaviourType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateTypeEClass, TemplateType.class, "TemplateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateType_Actuate(), theXLinkPackage.getActuateType1(), "actuate", null, 1, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Date(), theTextPackage.getDateTime(), "date", null, 0, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Href(), theTextPackage.getAnyURI(), "href", null, 1, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Title(), theTextPackage.getString(), "title", null, 0, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateType_Type(), theXLinkPackage.getTypeType(), "type", "simple", 0, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedTypeEClass, UserDefinedType.class, "UserDefinedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserDefinedType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, UserDefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDefinedType_Name(), theTextPackage.getString(), "name", null, 1, 1, UserDefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDefinedType_ValueType(), this.getValueTypeType(), "valueType", null, 0, 1, UserDefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(valueTypeTypeEEnum, ValueTypeType.class, "ValueTypeType");
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.FLOAT);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.DATE);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.TIME);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.BOOLEAN);
		addEEnumLiteral(valueTypeTypeEEnum, ValueTypeType.STRING);

		// Initialize data types
		initEDataType(valueTypeTypeObjectEDataType, ValueTypeType.class, "ValueTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (autoReloadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "auto-reload_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAutoReloadType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getAutoReloadType_Delay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "delay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAutoReloadType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getAutoReloadType_Show(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getAutoReloadType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
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
		  (getDocumentRoot_AutoReload(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "auto-reload",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creation-date",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_DateString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date-string",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DocumentStatistic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "document-statistic",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_EditingCycles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "editing-cycles",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_EditingDuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "editing-duration",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_Generator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "generator",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_HyperlinkBehaviour(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hyperlink-behaviour",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_InitialCreator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "initial-creator",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_Keyword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keyword",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_PrintDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "print-date",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_PrintedBy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "printed-by",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_Template(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "template",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (getDocumentRoot_UserDefined(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "user-defined",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-meta-data"
		   });		
		addAnnotation
		  (documentStatisticTypeEClass, 
		   source, 
		   new String[] {
			 "name", "document-statistic_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDocumentStatisticType_CellCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cell-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_CharacterCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "character-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_DrawCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "draw-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_FrameCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "frame-count"
		   });		
		addAnnotation
		  (getDocumentStatisticType_ImageCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "image-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_NonWhitespaceCharacterCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "non-whitespace-character-count"
		   });		
		addAnnotation
		  (getDocumentStatisticType_ObjectCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "object-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_OleObjectCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ole-object-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_PageCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "page-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_ParagraphCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "paragraph-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_RowCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "row-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_SentenceCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sentence-count"
		   });		
		addAnnotation
		  (getDocumentStatisticType_SyllableCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "syllable-count"
		   });		
		addAnnotation
		  (getDocumentStatisticType_TableCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "table-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentStatisticType_WordCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "word-count",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (hyperlinkBehaviourTypeEClass, 
		   source, 
		   new String[] {
			 "name", "hyperlink-behaviour_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getHyperlinkBehaviourType_Show(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "show",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getHyperlinkBehaviourType_TargetFrameName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target-frame-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:office:1.0"
		   });		
		addAnnotation
		  (templateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "template_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getTemplateType_Actuate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actuate",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getTemplateType_Date(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "date",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTemplateType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getTemplateType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (getTemplateType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (userDefinedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "user-defined_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getUserDefinedType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getUserDefinedType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserDefinedType_ValueType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (valueTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "value-type_._type"
		   });		
		addAnnotation
		  (valueTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "value-type_._type:Object",
			 "baseType", "value-type_._type"
		   });
	}

} //MetaPackageImpl
