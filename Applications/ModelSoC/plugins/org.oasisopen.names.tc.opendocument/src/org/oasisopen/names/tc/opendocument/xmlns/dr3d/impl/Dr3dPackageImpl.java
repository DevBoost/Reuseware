/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.BackfaceCullingType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.CubeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dFactory;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.EdgeRoundingModeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ExtrudeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.LightType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsDirectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.NormalsKindType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ProjectionType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.RotateType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SceneType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadeModeType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.ShadowType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.SphereType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureFilterType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeXType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureGenerationModeYType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureKindType;
import org.oasisopen.names.tc.opendocument.xmlns.dr3d.TextureModeType;
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
public class Dr3dPackageImpl extends EPackageImpl implements Dr3dPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extrudeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneTypeEClass = null;

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
	private EClass sphereTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum backfaceCullingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edgeRoundingModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum normalsDirectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum normalsKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum projectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shadeModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shadowTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureFilterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureGenerationModeXTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureGenerationModeYTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textureModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType backfaceCullingTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType edgeRoundingModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType normalsDirectionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType normalsKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType projectionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shadeModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shadowTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textureFilterTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textureGenerationModeXTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textureGenerationModeYTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textureKindTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textureModeTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Dr3dPackageImpl() {
		super(eNS_URI, Dr3dFactory.eINSTANCE);
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
	public static Dr3dPackage init() {
		if (isInited) return (Dr3dPackage)EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI);

		// Obtain or create and register package
		Dr3dPackageImpl theDr3dPackage = (Dr3dPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Dr3dPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Dr3dPackageImpl());

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
		theDr3dPackage.createPackageContents();
		theOfficePackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theXLinkPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
		theSvgPackage.createPackageContents();
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
		theDr3dPackage.initializePackageContents();
		theOfficePackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theXLinkPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
		theSvgPackage.initializePackageContents();
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
		theDr3dPackage.freeze();

		return theDr3dPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCubeType() {
		return cubeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_ClassNames() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_ClassNames1() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_Id() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_Layer() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_MaxEdge() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_MinEdge() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_StyleName() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_StyleName1() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_Transform() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeType_ZIndex() {
		return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtrudeType() {
		return extrudeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_ClassNames() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_ClassNames1() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_D() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_Id() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_Layer() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_StyleName() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_StyleName1() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_Transform() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_ViewBox() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtrudeType_ZIndex() {
		return (EAttribute)extrudeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightType() {
		return lightTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightType_DiffuseColor() {
		return (EAttribute)lightTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightType_Direction() {
		return (EAttribute)lightTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightType_Enabled() {
		return (EAttribute)lightTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightType_Specular() {
		return (EAttribute)lightTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotateType() {
		return rotateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_ClassNames() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_ClassNames1() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_D() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_Id() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_Layer() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_StyleName() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_StyleName1() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_Transform() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_ViewBox() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotateType_ZIndex() {
		return (EAttribute)rotateTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneType() {
		return sceneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Title() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Desc() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSceneType_Light() {
		return (EReference)sceneTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Shapes3dGroup() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSceneType_Shapes3d() {
		return (EReference)sceneTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_AmbientColor() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_AnchorPageNumber() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_AnchorType() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_CaptionId() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_ClassNames() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_ClassNames1() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Distance() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_EndCellAddress() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_EndX() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_EndY() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_FocalLength() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Height() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Id() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Layer() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_LightingMode() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Projection() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_ShadeMode() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_ShadowSlant() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_StyleName() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_StyleName1() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_TableBackground() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Transform() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Vpn() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Vrp() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Vup() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Width() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_X() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_Y() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneType_ZIndex() {
		return (EAttribute)sceneTypeEClass.getEStructuralFeatures().get(33);
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
	public EReference getDocumentRoot_Cube() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Extrude() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Light() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rotate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Scene() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sphere() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AmbientColor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BackfaceCulling() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BackScale() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Center() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CloseBack() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CloseFront() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Depth() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DiffuseColor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Direction() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Distance() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EdgeRounding() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EdgeRoundingMode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EmissiveColor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Enabled() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EndAngle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FocalLength() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_HorizontalSegments() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MaxEdge() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinEdge() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NormalsDirection() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NormalsKind() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Projection() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShadeMode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Shadow() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ShadowSlant() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Shininess() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Size() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Specular() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SpecularColor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextureFilter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextureGenerationModeX() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextureGenerationModeY() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextureKind() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextureMode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Transform() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VerticalSegments() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Vpn() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Vrp() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Vup() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphereType() {
		return sphereTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_Center() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_ClassNames() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_ClassNames1() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_Id() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_Layer() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_Size() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_StyleName() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_StyleName1() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_Transform() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereType_ZIndex() {
		return (EAttribute)sphereTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBackfaceCullingType() {
		return backfaceCullingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEdgeRoundingModeType() {
		return edgeRoundingModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNormalsDirectionType() {
		return normalsDirectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNormalsKindType() {
		return normalsKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProjectionType() {
		return projectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShadeModeType() {
		return shadeModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShadowType() {
		return shadowTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureFilterType() {
		return textureFilterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureGenerationModeXType() {
		return textureGenerationModeXTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureGenerationModeYType() {
		return textureGenerationModeYTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureKindType() {
		return textureKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextureModeType() {
		return textureModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBackfaceCullingTypeObject() {
		return backfaceCullingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEdgeRoundingModeTypeObject() {
		return edgeRoundingModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNormalsDirectionTypeObject() {
		return normalsDirectionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNormalsKindTypeObject() {
		return normalsKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProjectionTypeObject() {
		return projectionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShadeModeTypeObject() {
		return shadeModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShadowTypeObject() {
		return shadowTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextureFilterTypeObject() {
		return textureFilterTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextureGenerationModeXTypeObject() {
		return textureGenerationModeXTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextureGenerationModeYTypeObject() {
		return textureGenerationModeYTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextureKindTypeObject() {
		return textureKindTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextureModeTypeObject() {
		return textureModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dr3dFactory getDr3dFactory() {
		return (Dr3dFactory)getEFactoryInstance();
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
		cubeTypeEClass = createEClass(CUBE_TYPE);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__CLASS_NAMES);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__CLASS_NAMES1);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__ID);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__LAYER);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__MAX_EDGE);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__MIN_EDGE);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__STYLE_NAME);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__STYLE_NAME1);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__TRANSFORM);
		createEAttribute(cubeTypeEClass, CUBE_TYPE__ZINDEX);

		extrudeTypeEClass = createEClass(EXTRUDE_TYPE);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__CLASS_NAMES);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__CLASS_NAMES1);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__D);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__ID);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__LAYER);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__STYLE_NAME);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__STYLE_NAME1);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__TRANSFORM);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__VIEW_BOX);
		createEAttribute(extrudeTypeEClass, EXTRUDE_TYPE__ZINDEX);

		lightTypeEClass = createEClass(LIGHT_TYPE);
		createEAttribute(lightTypeEClass, LIGHT_TYPE__DIFFUSE_COLOR);
		createEAttribute(lightTypeEClass, LIGHT_TYPE__DIRECTION);
		createEAttribute(lightTypeEClass, LIGHT_TYPE__ENABLED);
		createEAttribute(lightTypeEClass, LIGHT_TYPE__SPECULAR);

		rotateTypeEClass = createEClass(ROTATE_TYPE);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__CLASS_NAMES);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__CLASS_NAMES1);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__D);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__ID);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__LAYER);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__STYLE_NAME);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__STYLE_NAME1);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__TRANSFORM);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__VIEW_BOX);
		createEAttribute(rotateTypeEClass, ROTATE_TYPE__ZINDEX);

		sceneTypeEClass = createEClass(SCENE_TYPE);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__TITLE);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__DESC);
		createEReference(sceneTypeEClass, SCENE_TYPE__LIGHT);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__SHAPES3D_GROUP);
		createEReference(sceneTypeEClass, SCENE_TYPE__SHAPES3D);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__AMBIENT_COLOR);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__ANCHOR_PAGE_NUMBER);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__ANCHOR_TYPE);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__CAPTION_ID);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__CLASS_NAMES);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__CLASS_NAMES1);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__DISTANCE);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__END_CELL_ADDRESS);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__END_X);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__END_Y);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__FOCAL_LENGTH);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__HEIGHT);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__ID);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__LAYER);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__LIGHTING_MODE);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__PROJECTION);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__SHADE_MODE);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__SHADOW_SLANT);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__STYLE_NAME);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__STYLE_NAME1);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__TABLE_BACKGROUND);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__TRANSFORM);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__VPN);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__VRP);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__VUP);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__WIDTH);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__X);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__Y);
		createEAttribute(sceneTypeEClass, SCENE_TYPE__ZINDEX);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CUBE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTRUDE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIGHT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROTATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCENE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPHERE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AMBIENT_COLOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BACKFACE_CULLING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BACK_SCALE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CENTER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CLOSE_BACK);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CLOSE_FRONT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DEPTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIFFUSE_COLOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIRECTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DISTANCE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EDGE_ROUNDING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EDGE_ROUNDING_MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EMISSIVE_COLOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ENABLED);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__END_ANGLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FOCAL_LENGTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__HORIZONTAL_SEGMENTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MAX_EDGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIN_EDGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NORMALS_DIRECTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NORMALS_KIND);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROJECTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SHADE_MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SHADOW);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SHADOW_SLANT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SHININESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SIZE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPECULAR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPECULAR_COLOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXTURE_FILTER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_X);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXTURE_GENERATION_MODE_Y);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXTURE_KIND);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXTURE_MODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSFORM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VERTICAL_SEGMENTS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VPN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VRP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VUP);

		sphereTypeEClass = createEClass(SPHERE_TYPE);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__CENTER);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__CLASS_NAMES);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__CLASS_NAMES1);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__ID);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__LAYER);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__SIZE);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__STYLE_NAME);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__STYLE_NAME1);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__TRANSFORM);
		createEAttribute(sphereTypeEClass, SPHERE_TYPE__ZINDEX);

		// Create enums
		backfaceCullingTypeEEnum = createEEnum(BACKFACE_CULLING_TYPE);
		edgeRoundingModeTypeEEnum = createEEnum(EDGE_ROUNDING_MODE_TYPE);
		normalsDirectionTypeEEnum = createEEnum(NORMALS_DIRECTION_TYPE);
		normalsKindTypeEEnum = createEEnum(NORMALS_KIND_TYPE);
		projectionTypeEEnum = createEEnum(PROJECTION_TYPE);
		shadeModeTypeEEnum = createEEnum(SHADE_MODE_TYPE);
		shadowTypeEEnum = createEEnum(SHADOW_TYPE);
		textureFilterTypeEEnum = createEEnum(TEXTURE_FILTER_TYPE);
		textureGenerationModeXTypeEEnum = createEEnum(TEXTURE_GENERATION_MODE_XTYPE);
		textureGenerationModeYTypeEEnum = createEEnum(TEXTURE_GENERATION_MODE_YTYPE);
		textureKindTypeEEnum = createEEnum(TEXTURE_KIND_TYPE);
		textureModeTypeEEnum = createEEnum(TEXTURE_MODE_TYPE);

		// Create data types
		backfaceCullingTypeObjectEDataType = createEDataType(BACKFACE_CULLING_TYPE_OBJECT);
		edgeRoundingModeTypeObjectEDataType = createEDataType(EDGE_ROUNDING_MODE_TYPE_OBJECT);
		normalsDirectionTypeObjectEDataType = createEDataType(NORMALS_DIRECTION_TYPE_OBJECT);
		normalsKindTypeObjectEDataType = createEDataType(NORMALS_KIND_TYPE_OBJECT);
		projectionTypeObjectEDataType = createEDataType(PROJECTION_TYPE_OBJECT);
		shadeModeTypeObjectEDataType = createEDataType(SHADE_MODE_TYPE_OBJECT);
		shadowTypeObjectEDataType = createEDataType(SHADOW_TYPE_OBJECT);
		textureFilterTypeObjectEDataType = createEDataType(TEXTURE_FILTER_TYPE_OBJECT);
		textureGenerationModeXTypeObjectEDataType = createEDataType(TEXTURE_GENERATION_MODE_XTYPE_OBJECT);
		textureGenerationModeYTypeObjectEDataType = createEDataType(TEXTURE_GENERATION_MODE_YTYPE_OBJECT);
		textureKindTypeObjectEDataType = createEDataType(TEXTURE_KIND_TYPE_OBJECT);
		textureModeTypeObjectEDataType = createEDataType(TEXTURE_MODE_TYPE_OBJECT);
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
		SvgPackage theSvgPackage = (SvgPackage)EPackage.Registry.INSTANCE.getEPackage(SvgPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cubeTypeEClass, CubeType.class, "CubeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCubeType_ClassNames(), theTextPackage.getStyleNameRefs(), "classNames", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeType_ClassNames1(), theTextPackage.getStyleNameRefs(), "classNames1", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeType_Id(), theTextPackage.getID(), "id", null, 1, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeType_Layer(), theXMLTypePackage.getString(), "layer", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeType_MaxEdge(), theTextPackage.getVector3D(), "maxEdge", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeType_MinEdge(), theTextPackage.getVector3D(), "minEdge", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeType_StyleName(), theDrawingPackage.getStyleNameType(), "styleName", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeType_StyleName1(), thePresentationPackage.getStyleNameType(), "styleName1", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeType_Transform(), theXMLTypePackage.getAnySimpleType(), "transform", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeType_ZIndex(), theTextPackage.getNonNegativeInteger(), "zIndex", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extrudeTypeEClass, ExtrudeType.class, "ExtrudeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtrudeType_ClassNames(), theTextPackage.getStyleNameRefs(), "classNames", null, 0, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrudeType_ClassNames1(), theTextPackage.getStyleNameRefs(), "classNames1", null, 0, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrudeType_D(), theTextPackage.getPathData(), "d", null, 1, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrudeType_Id(), theTextPackage.getID(), "id", null, 1, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrudeType_Layer(), theXMLTypePackage.getString(), "layer", null, 0, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrudeType_StyleName(), theDrawingPackage.getStyleNameType(), "styleName", null, 0, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrudeType_StyleName1(), thePresentationPackage.getStyleNameType(), "styleName1", null, 0, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrudeType_Transform(), theXMLTypePackage.getAnySimpleType(), "transform", null, 0, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrudeType_ViewBox(), theSvgPackage.getViewBoxType(), "viewBox", null, 1, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtrudeType_ZIndex(), theTextPackage.getNonNegativeInteger(), "zIndex", null, 0, 1, ExtrudeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightTypeEClass, LightType.class, "LightType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLightType_DiffuseColor(), theTextPackage.getColor(), "diffuseColor", null, 0, 1, LightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightType_Direction(), theTextPackage.getVector3D(), "direction", null, 1, 1, LightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightType_Enabled(), theTextPackage.getBoolean(), "enabled", null, 0, 1, LightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightType_Specular(), theTextPackage.getBoolean(), "specular", null, 0, 1, LightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotateTypeEClass, RotateType.class, "RotateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotateType_ClassNames(), theTextPackage.getStyleNameRefs(), "classNames", null, 0, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotateType_ClassNames1(), theTextPackage.getStyleNameRefs(), "classNames1", null, 0, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotateType_D(), theTextPackage.getPathData(), "d", null, 1, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotateType_Id(), theTextPackage.getID(), "id", null, 1, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotateType_Layer(), theXMLTypePackage.getString(), "layer", null, 0, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotateType_StyleName(), theDrawingPackage.getStyleNameType(), "styleName", null, 0, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotateType_StyleName1(), thePresentationPackage.getStyleNameType(), "styleName1", null, 0, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotateType_Transform(), theXMLTypePackage.getAnySimpleType(), "transform", null, 0, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotateType_ViewBox(), theSvgPackage.getViewBoxType(), "viewBox", null, 1, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotateType_ZIndex(), theTextPackage.getNonNegativeInteger(), "zIndex", null, 0, 1, RotateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sceneTypeEClass, SceneType.class, "SceneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSceneType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Desc(), theXMLTypePackage.getString(), "desc", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSceneType_Light(), this.getLightType(), null, "light", null, 0, -1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Shapes3dGroup(), ecorePackage.getEFeatureMapEntry(), "shapes3dGroup", null, 0, -1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSceneType_Shapes3d(), ecorePackage.getEObject(), null, "shapes3d", null, 0, -1, SceneType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_AmbientColor(), theTextPackage.getColor(), "ambientColor", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_AnchorPageNumber(), theTextPackage.getPositiveInteger(), "anchorPageNumber", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_AnchorType(), theTextPackage.getAnchorTypeType(), "anchorType", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_CaptionId(), theTextPackage.getIDREF(), "captionId", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_ClassNames(), theTextPackage.getStyleNameRefs(), "classNames", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_ClassNames1(), theTextPackage.getStyleNameRefs(), "classNames1", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Distance(), theTextPackage.getLength(), "distance", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_EndCellAddress(), theTextPackage.getCellAddress(), "endCellAddress", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_EndX(), theTextPackage.getCoordinate(), "endX", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_EndY(), theTextPackage.getCoordinate(), "endY", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_FocalLength(), theTextPackage.getLength(), "focalLength", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Height(), theTextPackage.getLength(), "height", null, 1, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Id(), theTextPackage.getID(), "id", null, 1, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Layer(), theXMLTypePackage.getString(), "layer", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_LightingMode(), theTextPackage.getBoolean(), "lightingMode", null, 1, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Projection(), this.getProjectionType(), "projection", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_ShadeMode(), this.getShadeModeType(), "shadeMode", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_ShadowSlant(), theTextPackage.getNonNegativeInteger(), "shadowSlant", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_StyleName(), theDrawingPackage.getStyleNameType(), "styleName", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_StyleName1(), thePresentationPackage.getStyleNameType(), "styleName1", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_TableBackground(), theTextPackage.getBoolean(), "tableBackground", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Transform(), theXMLTypePackage.getAnySimpleType(), "transform", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Vpn(), theTextPackage.getVector3D(), "vpn", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Vrp(), theTextPackage.getVector3D(), "vrp", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Vup(), theTextPackage.getVector3D(), "vup", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Width(), theTextPackage.getLength(), "width", null, 1, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_X(), theTextPackage.getCoordinate(), "x", null, 1, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_Y(), theTextPackage.getCoordinate(), "y", null, 1, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSceneType_ZIndex(), theTextPackage.getNonNegativeInteger(), "zIndex", null, 0, 1, SceneType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cube(), this.getCubeType(), null, "cube", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Extrude(), this.getExtrudeType(), null, "extrude", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Light(), this.getLightType(), null, "light", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rotate(), this.getRotateType(), null, "rotate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Scene(), this.getSceneType(), null, "scene", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sphere(), this.getSphereType(), null, "sphere", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AmbientColor(), theTextPackage.getColor(), "ambientColor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BackfaceCulling(), this.getBackfaceCullingType(), "backfaceCulling", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_BackScale(), theTextPackage.getPercent(), "backScale", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Center(), theTextPackage.getVector3D(), "center", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CloseBack(), theTextPackage.getBoolean(), "closeBack", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CloseFront(), theTextPackage.getBoolean(), "closeFront", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Depth(), theTextPackage.getLength(), "depth", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DiffuseColor(), theTextPackage.getColor(), "diffuseColor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Direction(), theTextPackage.getVector3D(), "direction", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Distance(), theTextPackage.getLength(), "distance", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EdgeRounding(), theTextPackage.getPercent(), "edgeRounding", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EdgeRoundingMode(), this.getEdgeRoundingModeType(), "edgeRoundingMode", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EmissiveColor(), theTextPackage.getColor(), "emissiveColor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Enabled(), theTextPackage.getBoolean(), "enabled", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_EndAngle(), theTextPackage.getNonNegativeInteger(), "endAngle", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FocalLength(), theTextPackage.getLength(), "focalLength", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_HorizontalSegments(), theTextPackage.getNonNegativeInteger(), "horizontalSegments", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MaxEdge(), theTextPackage.getVector3D(), "maxEdge", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MinEdge(), theTextPackage.getVector3D(), "minEdge", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_NormalsDirection(), this.getNormalsDirectionType(), "normalsDirection", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_NormalsKind(), this.getNormalsKindType(), "normalsKind", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Projection(), this.getProjectionType(), "projection", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ShadeMode(), this.getShadeModeType(), "shadeMode", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Shadow(), this.getShadowType(), "shadow", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ShadowSlant(), theTextPackage.getNonNegativeInteger(), "shadowSlant", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Shininess(), theTextPackage.getPercent(), "shininess", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Size(), theTextPackage.getVector3D(), "size", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Specular(), theTextPackage.getBoolean(), "specular", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SpecularColor(), theTextPackage.getColor(), "specularColor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextureFilter(), this.getTextureFilterType(), "textureFilter", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextureGenerationModeX(), this.getTextureGenerationModeXType(), "textureGenerationModeX", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextureGenerationModeY(), this.getTextureGenerationModeYType(), "textureGenerationModeY", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextureKind(), this.getTextureKindType(), "textureKind", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextureMode(), this.getTextureModeType(), "textureMode", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Transform(), theXMLTypePackage.getAnySimpleType(), "transform", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_VerticalSegments(), theTextPackage.getNonNegativeInteger(), "verticalSegments", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Vpn(), theTextPackage.getVector3D(), "vpn", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Vrp(), theTextPackage.getVector3D(), "vrp", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Vup(), theTextPackage.getVector3D(), "vup", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sphereTypeEClass, SphereType.class, "SphereType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphereType_Center(), theTextPackage.getVector3D(), "center", null, 0, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereType_ClassNames(), theTextPackage.getStyleNameRefs(), "classNames", null, 0, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereType_ClassNames1(), theTextPackage.getStyleNameRefs(), "classNames1", null, 0, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereType_Id(), theTextPackage.getID(), "id", null, 1, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereType_Layer(), theXMLTypePackage.getString(), "layer", null, 0, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereType_Size(), theTextPackage.getVector3D(), "size", null, 0, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereType_StyleName(), theDrawingPackage.getStyleNameType(), "styleName", null, 0, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereType_StyleName1(), thePresentationPackage.getStyleNameType(), "styleName1", null, 0, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereType_Transform(), theXMLTypePackage.getAnySimpleType(), "transform", null, 0, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereType_ZIndex(), theTextPackage.getNonNegativeInteger(), "zIndex", null, 0, 1, SphereType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(backfaceCullingTypeEEnum, BackfaceCullingType.class, "BackfaceCullingType");
		addEEnumLiteral(backfaceCullingTypeEEnum, BackfaceCullingType.ENABLED);
		addEEnumLiteral(backfaceCullingTypeEEnum, BackfaceCullingType.DISABLED);

		initEEnum(edgeRoundingModeTypeEEnum, EdgeRoundingModeType.class, "EdgeRoundingModeType");
		addEEnumLiteral(edgeRoundingModeTypeEEnum, EdgeRoundingModeType.CORRECT);
		addEEnumLiteral(edgeRoundingModeTypeEEnum, EdgeRoundingModeType.ATTRACTIVE);

		initEEnum(normalsDirectionTypeEEnum, NormalsDirectionType.class, "NormalsDirectionType");
		addEEnumLiteral(normalsDirectionTypeEEnum, NormalsDirectionType.NORMAL);
		addEEnumLiteral(normalsDirectionTypeEEnum, NormalsDirectionType.INVERSE);

		initEEnum(normalsKindTypeEEnum, NormalsKindType.class, "NormalsKindType");
		addEEnumLiteral(normalsKindTypeEEnum, NormalsKindType.OBJECT);
		addEEnumLiteral(normalsKindTypeEEnum, NormalsKindType.FLAT);
		addEEnumLiteral(normalsKindTypeEEnum, NormalsKindType.SPHERE);

		initEEnum(projectionTypeEEnum, ProjectionType.class, "ProjectionType");
		addEEnumLiteral(projectionTypeEEnum, ProjectionType.PARALLEL);
		addEEnumLiteral(projectionTypeEEnum, ProjectionType.PERSPECTIVE);

		initEEnum(shadeModeTypeEEnum, ShadeModeType.class, "ShadeModeType");
		addEEnumLiteral(shadeModeTypeEEnum, ShadeModeType.FLAT);
		addEEnumLiteral(shadeModeTypeEEnum, ShadeModeType.PHONG);
		addEEnumLiteral(shadeModeTypeEEnum, ShadeModeType.GOURAUD);
		addEEnumLiteral(shadeModeTypeEEnum, ShadeModeType.DRAFT);

		initEEnum(shadowTypeEEnum, ShadowType.class, "ShadowType");
		addEEnumLiteral(shadowTypeEEnum, ShadowType.VISIBLE);
		addEEnumLiteral(shadowTypeEEnum, ShadowType.HIDDEN);

		initEEnum(textureFilterTypeEEnum, TextureFilterType.class, "TextureFilterType");
		addEEnumLiteral(textureFilterTypeEEnum, TextureFilterType.ENABLED);
		addEEnumLiteral(textureFilterTypeEEnum, TextureFilterType.DISABLED);

		initEEnum(textureGenerationModeXTypeEEnum, TextureGenerationModeXType.class, "TextureGenerationModeXType");
		addEEnumLiteral(textureGenerationModeXTypeEEnum, TextureGenerationModeXType.OBJECT);
		addEEnumLiteral(textureGenerationModeXTypeEEnum, TextureGenerationModeXType.PARALLEL);
		addEEnumLiteral(textureGenerationModeXTypeEEnum, TextureGenerationModeXType.SPHERE);

		initEEnum(textureGenerationModeYTypeEEnum, TextureGenerationModeYType.class, "TextureGenerationModeYType");
		addEEnumLiteral(textureGenerationModeYTypeEEnum, TextureGenerationModeYType.OBJECT);
		addEEnumLiteral(textureGenerationModeYTypeEEnum, TextureGenerationModeYType.PARALLEL);
		addEEnumLiteral(textureGenerationModeYTypeEEnum, TextureGenerationModeYType.SPHERE);

		initEEnum(textureKindTypeEEnum, TextureKindType.class, "TextureKindType");
		addEEnumLiteral(textureKindTypeEEnum, TextureKindType.LUMINANCE);
		addEEnumLiteral(textureKindTypeEEnum, TextureKindType.INTENSITY);
		addEEnumLiteral(textureKindTypeEEnum, TextureKindType.COLOR);

		initEEnum(textureModeTypeEEnum, TextureModeType.class, "TextureModeType");
		addEEnumLiteral(textureModeTypeEEnum, TextureModeType.REPLACE);
		addEEnumLiteral(textureModeTypeEEnum, TextureModeType.MODULATE);
		addEEnumLiteral(textureModeTypeEEnum, TextureModeType.BLEND);

		// Initialize data types
		initEDataType(backfaceCullingTypeObjectEDataType, BackfaceCullingType.class, "BackfaceCullingTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(edgeRoundingModeTypeObjectEDataType, EdgeRoundingModeType.class, "EdgeRoundingModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(normalsDirectionTypeObjectEDataType, NormalsDirectionType.class, "NormalsDirectionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(normalsKindTypeObjectEDataType, NormalsKindType.class, "NormalsKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(projectionTypeObjectEDataType, ProjectionType.class, "ProjectionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shadeModeTypeObjectEDataType, ShadeModeType.class, "ShadeModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shadowTypeObjectEDataType, ShadowType.class, "ShadowTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textureFilterTypeObjectEDataType, TextureFilterType.class, "TextureFilterTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textureGenerationModeXTypeObjectEDataType, TextureGenerationModeXType.class, "TextureGenerationModeXTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textureGenerationModeYTypeObjectEDataType, TextureGenerationModeYType.class, "TextureGenerationModeYTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textureKindTypeObjectEDataType, TextureKindType.class, "TextureKindTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textureModeTypeObjectEDataType, TextureModeType.class, "TextureModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (backfaceCullingTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "backface-culling_._type"
		   });		
		addAnnotation
		  (backfaceCullingTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "backface-culling_._type:Object",
			 "baseType", "backface-culling_._type"
		   });		
		addAnnotation
		  (cubeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cube_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCubeType_ClassNames(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getCubeType_ClassNames1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getCubeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getCubeType_Layer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "layer",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getCubeType_MaxEdge(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max-edge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCubeType_MinEdge(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-edge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCubeType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getCubeType_StyleName1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getCubeType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCubeType_ZIndex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "z-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (edgeRoundingModeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "edge-rounding-mode_._type"
		   });		
		addAnnotation
		  (edgeRoundingModeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "edge-rounding-mode_._type:Object",
			 "baseType", "edge-rounding-mode_._type"
		   });		
		addAnnotation
		  (extrudeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "extrude_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getExtrudeType_ClassNames(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getExtrudeType_ClassNames1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getExtrudeType_D(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "d",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getExtrudeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getExtrudeType_Layer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "layer",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getExtrudeType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getExtrudeType_StyleName1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getExtrudeType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExtrudeType_ViewBox(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "viewBox",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getExtrudeType_ZIndex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "z-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (lightTypeEClass, 
		   source, 
		   new String[] {
			 "name", "light_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLightType_DiffuseColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "diffuse-color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLightType_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLightType_Enabled(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "enabled",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLightType_Specular(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specular",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (normalsDirectionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "normals-direction_._type"
		   });		
		addAnnotation
		  (normalsDirectionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "normals-direction_._type:Object",
			 "baseType", "normals-direction_._type"
		   });		
		addAnnotation
		  (normalsKindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "normals-kind_._type"
		   });		
		addAnnotation
		  (normalsKindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "normals-kind_._type:Object",
			 "baseType", "normals-kind_._type"
		   });		
		addAnnotation
		  (projectionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "projection_._type"
		   });		
		addAnnotation
		  (projectionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "projection_._type:Object",
			 "baseType", "projection_._type"
		   });		
		addAnnotation
		  (rotateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rotate_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRotateType_ClassNames(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getRotateType_ClassNames1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getRotateType_D(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "d",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getRotateType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getRotateType_Layer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "layer",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getRotateType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getRotateType_StyleName1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getRotateType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRotateType_ViewBox(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "viewBox",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getRotateType_ZIndex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "z-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (sceneTypeEClass, 
		   source, 
		   new String[] {
			 "name", "scene_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSceneType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getSceneType_Desc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "desc",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getSceneType_Light(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "light",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_Shapes3dGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "shapes3d:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSceneType_Shapes3d(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shapes3d",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d:group"
		   });		
		addAnnotation
		  (getSceneType_AmbientColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ambient-color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_AnchorPageNumber(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "anchor-page-number",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSceneType_AnchorType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "anchor-type",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSceneType_CaptionId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "caption-id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getSceneType_ClassNames(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getSceneType_ClassNames1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSceneType_Distance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "distance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_EndCellAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end-cell-address",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSceneType_EndX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end-x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSceneType_EndY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end-y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSceneType_FocalLength(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "focal-length",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getSceneType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getSceneType_Layer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "layer",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getSceneType_LightingMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lighting-mode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_Projection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "projection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_ShadeMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shade-mode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_ShadowSlant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shadow-slant",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getSceneType_StyleName1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSceneType_TableBackground(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "table-background",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSceneType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_Vpn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vpn",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_Vrp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vrp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_Vup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSceneType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getSceneType_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getSceneType_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getSceneType_ZIndex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "z-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (shadeModeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "shade-mode_._type"
		   });		
		addAnnotation
		  (shadeModeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "shade-mode_._type:Object",
			 "baseType", "shade-mode_._type"
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
		  (getDocumentRoot_Cube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cube",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d"
		   });		
		addAnnotation
		  (getDocumentRoot_Extrude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extrude",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d"
		   });		
		addAnnotation
		  (getDocumentRoot_Light(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "light",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Rotate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rotate",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d"
		   });		
		addAnnotation
		  (getDocumentRoot_Scene(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scene",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d"
		   });		
		addAnnotation
		  (getDocumentRoot_Sphere(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sphere",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#shapes3d"
		   });		
		addAnnotation
		  (getDocumentRoot_AmbientColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ambient-color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BackfaceCulling(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "backface-culling",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BackScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "back-scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Center(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "center",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CloseBack(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "close-back",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CloseFront(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "close-front",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Depth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "depth",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DiffuseColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "diffuse-color",
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
		  (getDocumentRoot_Distance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "distance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EdgeRounding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "edge-rounding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EdgeRoundingMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "edge-rounding-mode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EmissiveColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "emissive-color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Enabled(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "enabled",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EndAngle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end-angle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FocalLength(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "focal-length",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HorizontalSegments(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "horizontal-segments",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MaxEdge(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max-edge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MinEdge(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-edge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NormalsDirection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "normals-direction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NormalsKind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "normals-kind",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Projection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "projection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ShadeMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shade-mode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Shadow(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shadow",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ShadowSlant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shadow-slant",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Shininess(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shininess",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Size(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "size",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Specular(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specular",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpecularColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "specular-color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextureFilter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "texture-filter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextureGenerationModeX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "texture-generation-mode-x",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextureGenerationModeY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "texture-generation-mode-y",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextureKind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "texture-kind",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextureMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "texture-mode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Transform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_VerticalSegments(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vertical-segments",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Vpn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vpn",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Vrp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vrp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Vup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (shadowTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "shadow_._type"
		   });		
		addAnnotation
		  (shadowTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "shadow_._type:Object",
			 "baseType", "shadow_._type"
		   });		
		addAnnotation
		  (sphereTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sphere_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSphereType_Center(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "center",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSphereType_ClassNames(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getSphereType_ClassNames1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class-names",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSphereType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getSphereType_Layer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "layer",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getSphereType_Size(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "size",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSphereType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (getSphereType_StyleName1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0"
		   });		
		addAnnotation
		  (getSphereType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transform",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSphereType_ZIndex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "z-index",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0"
		   });		
		addAnnotation
		  (textureFilterTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "texture-filter_._type"
		   });		
		addAnnotation
		  (textureFilterTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "texture-filter_._type:Object",
			 "baseType", "texture-filter_._type"
		   });		
		addAnnotation
		  (textureGenerationModeXTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "texture-generation-mode-x_._type"
		   });		
		addAnnotation
		  (textureGenerationModeXTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "texture-generation-mode-x_._type:Object",
			 "baseType", "texture-generation-mode-x_._type"
		   });		
		addAnnotation
		  (textureGenerationModeYTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "texture-generation-mode-y_._type"
		   });		
		addAnnotation
		  (textureGenerationModeYTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "texture-generation-mode-y_._type:Object",
			 "baseType", "texture-generation-mode-y_._type"
		   });		
		addAnnotation
		  (textureKindTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "texture-kind_._type"
		   });		
		addAnnotation
		  (textureKindTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "texture-kind_._type:Object",
			 "baseType", "texture-kind_._type"
		   });		
		addAnnotation
		  (textureModeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "texture-mode_._type"
		   });		
		addAnnotation
		  (textureModeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "texture-mode_._type:Object",
			 "baseType", "texture-mode_._type"
		   });
	}

} //Dr3dPackageImpl
