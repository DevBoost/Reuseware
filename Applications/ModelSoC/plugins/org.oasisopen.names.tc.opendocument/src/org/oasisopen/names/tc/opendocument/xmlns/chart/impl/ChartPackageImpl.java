/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartFactory;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ClassType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DataLabelNumberType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DataPointType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DataSourceHasLabelsType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DomainType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorCategoryType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ErrorIndicatorType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.FloorType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.FooterType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.GridType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.InterpolationType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LabelArrangementType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendAlignType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendPositionType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.LegendType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.MeanValueType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.PlotAreaType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionCurveType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.RegressionTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SeriesType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SolidTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockGainMarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockLossMarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.StockRangeLineType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SubtitleType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolImageType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolNameType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.SymbolTypeType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.WallType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.util.ChartValidator;
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
public class ChartPackageImpl extends EPackageImpl implements ChartPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPointTypeEClass = null;

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
	private EClass domainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorIndicatorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floorTypeEClass = null;

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
	private EClass gridTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legendTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meanValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plotAreaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regressionCurveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockGainMarkerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockLossMarkerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockRangeLineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtitleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolImageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wallTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataLabelNumberTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSourceHasLabelsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dimensionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum errorCategoryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interpolationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelArrangementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legendAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legendPositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regressionTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seriesSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum solidTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum symbolNameTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum symbolTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataLabelNumberTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataSourceHasLabelsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dimensionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType errorCategoryTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interpolationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType labelArrangementTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType legendAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType legendPositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType regressionTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType seriesSourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType solidTypeTypeObjectEDataType = null;

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
	private EDataType symbolNameTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType symbolTypeTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChartPackageImpl() {
		super(eNS_URI, ChartFactory.eINSTANCE);
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
	public static ChartPackage init() {
		if (isInited) return (ChartPackage)EPackage.Registry.INSTANCE.getEPackage(ChartPackage.eNS_URI);

		// Obtain or create and register package
		ChartPackageImpl theChartPackage = (ChartPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ChartPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ChartPackageImpl());

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
		AnimationPackageImpl theAnimationPackage = (AnimationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI) instanceof AnimationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnimationPackage.eNS_URI) : AnimationPackage.eINSTANCE);
		CompatiblePackageImpl theCompatiblePackage = (CompatiblePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI) instanceof CompatiblePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompatiblePackage.eNS_URI) : CompatiblePackage.eINSTANCE);
		MetaPackageImpl theMetaPackage = (MetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI) instanceof MetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI) : MetaPackage.eINSTANCE);
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
		theChartPackage.createPackageContents();
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
		theDCPackage.createPackageContents();
		theMathMLPackage.createPackageContents();
		theXFormsPackage.createPackageContents();

		// Initialize created meta-data
		theChartPackage.initializePackageContents();
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
			(theChartPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ChartValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theChartPackage.freeze();

		return theChartPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxisType() {
		return axisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisType_Title() {
		return (EReference)axisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisType_Categories() {
		return (EReference)axisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxisType_Grid() {
		return (EReference)axisTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisType_Dimension() {
		return (EAttribute)axisTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisType_Name() {
		return (EAttribute)axisTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxisType_StyleName() {
		return (EAttribute)axisTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoriesType() {
		return categoriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategoriesType_CellRangeAddress() {
		return (EAttribute)categoriesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPointType() {
		return dataPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPointType_Repeated() {
		return (EAttribute)dataPointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPointType_StyleName() {
		return (EAttribute)dataPointTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_Axis() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Categories() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Chart() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataPoint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Domain() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ErrorIndicator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Floor() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Footer() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Grid() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Legend() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MeanValue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PlotArea() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegressionCurve() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Series() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StockGainMarker() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StockLossMarker() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StockRangeLine() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Subtitle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SymbolImage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Title() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Wall() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AttachedAxis() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ColumnMapping() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ConnectBars() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataLabelNumber() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataLabelSymbol() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataLabelText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataSourceHasLabels() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Deep() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Dimension() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DisplayLabel() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ErrorCategory() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ErrorLowerIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ErrorLowerLimit() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ErrorMargin() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ErrorPercentage() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ErrorUpperIndicator() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ErrorUpperLimit() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GapWidth() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Interpolation() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IntervalMajor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IntervalMinorDivisor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_JapaneseCandleStick() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LabelArrangement() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LabelCellAddress() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LegendAlign() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LegendPosition() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Lines() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_LinkDataStyleToSource() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Logarithmic() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Maximum() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MeanValue1() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Minimum() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Origin() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Overlap() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Percentage() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PieOffset() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RegressionType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Repeated() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RowMapping() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ScaleText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SeriesSource() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SolidType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SplineOrder() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SplineResolution() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Stacked() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StyleName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SymbolHeight() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SymbolName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SymbolType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SymbolWidth() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextOverlap() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ThreeDimensional() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TickMarksMajorInner() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TickMarksMajorOuter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TickMarksMinorInner() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TickMarksMinorOuter() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ValuesCellRangeAddress() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Vertical() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Visible() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainType() {
		return domainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainType_CellRangeAddress() {
		return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorIndicatorType() {
		return errorIndicatorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorIndicatorType_StyleName() {
		return (EAttribute)errorIndicatorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloorType() {
		return floorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloorType_StyleName() {
		return (EAttribute)floorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloorType_Width() {
		return (EAttribute)floorTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getFooterType_P() {
		return (EReference)footerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFooterType_CellRange() {
		return (EAttribute)footerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFooterType_StyleName() {
		return (EAttribute)footerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFooterType_X() {
		return (EAttribute)footerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFooterType_Y() {
		return (EAttribute)footerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridType() {
		return gridTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_Class() {
		return (EAttribute)gridTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_StyleName() {
		return (EAttribute)gridTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegendType() {
		return legendTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegendType_LegendAlign() {
		return (EAttribute)legendTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegendType_LegendExpansion() {
		return (EAttribute)legendTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegendType_LegendExpansionAspectRatio() {
		return (EAttribute)legendTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegendType_LegendPosition() {
		return (EAttribute)legendTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegendType_StyleName() {
		return (EAttribute)legendTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegendType_X() {
		return (EAttribute)legendTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegendType_Y() {
		return (EAttribute)legendTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeanValueType() {
		return meanValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeanValueType_StyleName() {
		return (EAttribute)meanValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlotAreaType() {
		return plotAreaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotAreaType_Light() {
		return (EReference)plotAreaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotAreaType_Axis() {
		return (EReference)plotAreaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotAreaType_Series() {
		return (EReference)plotAreaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotAreaType_StockGainMarker() {
		return (EReference)plotAreaTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotAreaType_StockLossMarker() {
		return (EReference)plotAreaTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotAreaType_StockRangeLine() {
		return (EReference)plotAreaTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotAreaType_Wall() {
		return (EReference)plotAreaTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlotAreaType_Floor() {
		return (EReference)plotAreaTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_AmbientColor() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_CellRangeAddress() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_DataSourceHasLabels() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_Distance() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_FocalLength() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_Height() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_LightingMode() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_Projection() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_ShadeMode() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_ShadowSlant() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_StyleName() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_Transform() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_Vpn() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_Vrp() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_Vup() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_Width() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_X() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlotAreaType_Y() {
		return (EAttribute)plotAreaTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegressionCurveType() {
		return regressionCurveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegressionCurveType_StyleName() {
		return (EAttribute)regressionCurveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeriesType() {
		return seriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeriesType_Domain() {
		return (EReference)seriesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeriesType_MeanValue() {
		return (EReference)seriesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeriesType_RegressionCurve() {
		return (EReference)seriesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeriesType_ErrorIndicator() {
		return (EReference)seriesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeriesType_DataPoint() {
		return (EReference)seriesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeriesType_AttachedAxis() {
		return (EAttribute)seriesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeriesType_Class() {
		return (EAttribute)seriesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeriesType_LabelCellAddress() {
		return (EAttribute)seriesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeriesType_StyleName() {
		return (EAttribute)seriesTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeriesType_ValuesCellRangeAddress() {
		return (EAttribute)seriesTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockGainMarkerType() {
		return stockGainMarkerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockGainMarkerType_StyleName() {
		return (EAttribute)stockGainMarkerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockLossMarkerType() {
		return stockLossMarkerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockLossMarkerType_StyleName() {
		return (EAttribute)stockLossMarkerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStockRangeLineType() {
		return stockRangeLineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStockRangeLineType_StyleName() {
		return (EAttribute)stockRangeLineTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtitleType() {
		return subtitleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtitleType_P() {
		return (EReference)subtitleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtitleType_CellRange() {
		return (EAttribute)subtitleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtitleType_StyleName() {
		return (EAttribute)subtitleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtitleType_X() {
		return (EAttribute)subtitleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtitleType_Y() {
		return (EAttribute)subtitleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolImageType() {
		return symbolImageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolImageType_Href() {
		return (EAttribute)symbolImageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleType() {
		return titleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitleType_P() {
		return (EReference)titleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_CellRange() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_StyleName() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_X() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Y() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWallType() {
		return wallTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallType_StyleName() {
		return (EAttribute)wallTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWallType_Width() {
		return (EAttribute)wallTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassType() {
		return classTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataLabelNumberType() {
		return dataLabelNumberTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSourceHasLabelsType() {
		return dataSourceHasLabelsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDimensionType() {
		return dimensionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getErrorCategoryType() {
		return errorCategoryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterpolationType() {
		return interpolationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelArrangementType() {
		return labelArrangementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegendAlignType() {
		return legendAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLegendPositionType() {
		return legendPositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRegressionTypeType() {
		return regressionTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeriesSourceType() {
		return seriesSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSolidTypeType() {
		return solidTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSymbolNameType() {
		return symbolNameTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSymbolTypeType() {
		return symbolTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassTypeObject() {
		return classTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataLabelNumberTypeObject() {
		return dataLabelNumberTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataSourceHasLabelsTypeObject() {
		return dataSourceHasLabelsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDimensionTypeObject() {
		return dimensionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getErrorCategoryTypeObject() {
		return errorCategoryTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterpolationTypeObject() {
		return interpolationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLabelArrangementTypeObject() {
		return labelArrangementTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLegendAlignTypeObject() {
		return legendAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLegendPositionTypeObject() {
		return legendPositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRegressionTypeTypeObject() {
		return regressionTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSeriesSourceTypeObject() {
		return seriesSourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSolidTypeTypeObject() {
		return solidTypeTypeObjectEDataType;
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
	public EDataType getSymbolNameTypeObject() {
		return symbolNameTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSymbolTypeTypeObject() {
		return symbolTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartFactory getChartFactory() {
		return (ChartFactory)getEFactoryInstance();
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
		axisTypeEClass = createEClass(AXIS_TYPE);
		createEReference(axisTypeEClass, AXIS_TYPE__TITLE);
		createEReference(axisTypeEClass, AXIS_TYPE__CATEGORIES);
		createEReference(axisTypeEClass, AXIS_TYPE__GRID);
		createEAttribute(axisTypeEClass, AXIS_TYPE__DIMENSION);
		createEAttribute(axisTypeEClass, AXIS_TYPE__NAME);
		createEAttribute(axisTypeEClass, AXIS_TYPE__STYLE_NAME);

		categoriesTypeEClass = createEClass(CATEGORIES_TYPE);
		createEAttribute(categoriesTypeEClass, CATEGORIES_TYPE__CELL_RANGE_ADDRESS);

		dataPointTypeEClass = createEClass(DATA_POINT_TYPE);
		createEAttribute(dataPointTypeEClass, DATA_POINT_TYPE__REPEATED);
		createEAttribute(dataPointTypeEClass, DATA_POINT_TYPE__STYLE_NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AXIS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CATEGORIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHART);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATA_POINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOMAIN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ERROR_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FLOOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOOTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GRID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LEGEND);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEAN_VALUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PLOT_AREA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGRESSION_CURVE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STOCK_GAIN_MARKER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STOCK_LOSS_MARKER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STOCK_RANGE_LINE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBTITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SYMBOL_IMAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WALL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ATTACHED_AXIS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COLUMN_MAPPING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONNECT_BARS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATA_LABEL_NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATA_LABEL_SYMBOL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATA_LABEL_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATA_SOURCE_HAS_LABELS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DEEP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DIMENSION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DISPLAY_LABEL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ERROR_CATEGORY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ERROR_LOWER_INDICATOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ERROR_LOWER_LIMIT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ERROR_MARGIN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ERROR_PERCENTAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ERROR_UPPER_INDICATOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ERROR_UPPER_LIMIT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GAP_WIDTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INTERPOLATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INTERVAL_MAJOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__INTERVAL_MINOR_DIVISOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__JAPANESE_CANDLE_STICK);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LABEL_ARRANGEMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LABEL_CELL_ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LEGEND_ALIGN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LEGEND_POSITION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LINES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LINK_DATA_STYLE_TO_SOURCE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LOGARITHMIC);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MAXIMUM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MEAN_VALUE1);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MINIMUM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ORIGIN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__OVERLAP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PERCENTAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PIE_OFFSET);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REGRESSION_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REPEATED);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ROW_MAPPING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SCALE_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERIES_SOURCE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SOLID_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPLINE_ORDER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SPLINE_RESOLUTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STACKED);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STYLE_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SYMBOL_HEIGHT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SYMBOL_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SYMBOL_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SYMBOL_WIDTH);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXT_OVERLAP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__THREE_DIMENSIONAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TICK_MARKS_MAJOR_INNER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TICK_MARKS_MAJOR_OUTER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TICK_MARKS_MINOR_INNER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TICK_MARKS_MINOR_OUTER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VALUES_CELL_RANGE_ADDRESS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VERTICAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__VISIBLE);

		domainTypeEClass = createEClass(DOMAIN_TYPE);
		createEAttribute(domainTypeEClass, DOMAIN_TYPE__CELL_RANGE_ADDRESS);

		errorIndicatorTypeEClass = createEClass(ERROR_INDICATOR_TYPE);
		createEAttribute(errorIndicatorTypeEClass, ERROR_INDICATOR_TYPE__STYLE_NAME);

		floorTypeEClass = createEClass(FLOOR_TYPE);
		createEAttribute(floorTypeEClass, FLOOR_TYPE__STYLE_NAME);
		createEAttribute(floorTypeEClass, FLOOR_TYPE__WIDTH);

		footerTypeEClass = createEClass(FOOTER_TYPE);
		createEReference(footerTypeEClass, FOOTER_TYPE__P);
		createEAttribute(footerTypeEClass, FOOTER_TYPE__CELL_RANGE);
		createEAttribute(footerTypeEClass, FOOTER_TYPE__STYLE_NAME);
		createEAttribute(footerTypeEClass, FOOTER_TYPE__X);
		createEAttribute(footerTypeEClass, FOOTER_TYPE__Y);

		gridTypeEClass = createEClass(GRID_TYPE);
		createEAttribute(gridTypeEClass, GRID_TYPE__CLASS);
		createEAttribute(gridTypeEClass, GRID_TYPE__STYLE_NAME);

		legendTypeEClass = createEClass(LEGEND_TYPE);
		createEAttribute(legendTypeEClass, LEGEND_TYPE__LEGEND_ALIGN);
		createEAttribute(legendTypeEClass, LEGEND_TYPE__LEGEND_EXPANSION);
		createEAttribute(legendTypeEClass, LEGEND_TYPE__LEGEND_EXPANSION_ASPECT_RATIO);
		createEAttribute(legendTypeEClass, LEGEND_TYPE__LEGEND_POSITION);
		createEAttribute(legendTypeEClass, LEGEND_TYPE__STYLE_NAME);
		createEAttribute(legendTypeEClass, LEGEND_TYPE__X);
		createEAttribute(legendTypeEClass, LEGEND_TYPE__Y);

		meanValueTypeEClass = createEClass(MEAN_VALUE_TYPE);
		createEAttribute(meanValueTypeEClass, MEAN_VALUE_TYPE__STYLE_NAME);

		plotAreaTypeEClass = createEClass(PLOT_AREA_TYPE);
		createEReference(plotAreaTypeEClass, PLOT_AREA_TYPE__LIGHT);
		createEReference(plotAreaTypeEClass, PLOT_AREA_TYPE__AXIS);
		createEReference(plotAreaTypeEClass, PLOT_AREA_TYPE__SERIES);
		createEReference(plotAreaTypeEClass, PLOT_AREA_TYPE__STOCK_GAIN_MARKER);
		createEReference(plotAreaTypeEClass, PLOT_AREA_TYPE__STOCK_LOSS_MARKER);
		createEReference(plotAreaTypeEClass, PLOT_AREA_TYPE__STOCK_RANGE_LINE);
		createEReference(plotAreaTypeEClass, PLOT_AREA_TYPE__WALL);
		createEReference(plotAreaTypeEClass, PLOT_AREA_TYPE__FLOOR);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__AMBIENT_COLOR);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__CELL_RANGE_ADDRESS);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__DATA_SOURCE_HAS_LABELS);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__DISTANCE);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__FOCAL_LENGTH);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__HEIGHT);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__LIGHTING_MODE);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__PROJECTION);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__SHADE_MODE);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__SHADOW_SLANT);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__STYLE_NAME);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__TRANSFORM);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__VPN);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__VRP);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__VUP);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__WIDTH);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__X);
		createEAttribute(plotAreaTypeEClass, PLOT_AREA_TYPE__Y);

		regressionCurveTypeEClass = createEClass(REGRESSION_CURVE_TYPE);
		createEAttribute(regressionCurveTypeEClass, REGRESSION_CURVE_TYPE__STYLE_NAME);

		seriesTypeEClass = createEClass(SERIES_TYPE);
		createEReference(seriesTypeEClass, SERIES_TYPE__DOMAIN);
		createEReference(seriesTypeEClass, SERIES_TYPE__MEAN_VALUE);
		createEReference(seriesTypeEClass, SERIES_TYPE__REGRESSION_CURVE);
		createEReference(seriesTypeEClass, SERIES_TYPE__ERROR_INDICATOR);
		createEReference(seriesTypeEClass, SERIES_TYPE__DATA_POINT);
		createEAttribute(seriesTypeEClass, SERIES_TYPE__ATTACHED_AXIS);
		createEAttribute(seriesTypeEClass, SERIES_TYPE__CLASS);
		createEAttribute(seriesTypeEClass, SERIES_TYPE__LABEL_CELL_ADDRESS);
		createEAttribute(seriesTypeEClass, SERIES_TYPE__STYLE_NAME);
		createEAttribute(seriesTypeEClass, SERIES_TYPE__VALUES_CELL_RANGE_ADDRESS);

		stockGainMarkerTypeEClass = createEClass(STOCK_GAIN_MARKER_TYPE);
		createEAttribute(stockGainMarkerTypeEClass, STOCK_GAIN_MARKER_TYPE__STYLE_NAME);

		stockLossMarkerTypeEClass = createEClass(STOCK_LOSS_MARKER_TYPE);
		createEAttribute(stockLossMarkerTypeEClass, STOCK_LOSS_MARKER_TYPE__STYLE_NAME);

		stockRangeLineTypeEClass = createEClass(STOCK_RANGE_LINE_TYPE);
		createEAttribute(stockRangeLineTypeEClass, STOCK_RANGE_LINE_TYPE__STYLE_NAME);

		subtitleTypeEClass = createEClass(SUBTITLE_TYPE);
		createEReference(subtitleTypeEClass, SUBTITLE_TYPE__P);
		createEAttribute(subtitleTypeEClass, SUBTITLE_TYPE__CELL_RANGE);
		createEAttribute(subtitleTypeEClass, SUBTITLE_TYPE__STYLE_NAME);
		createEAttribute(subtitleTypeEClass, SUBTITLE_TYPE__X);
		createEAttribute(subtitleTypeEClass, SUBTITLE_TYPE__Y);

		symbolImageTypeEClass = createEClass(SYMBOL_IMAGE_TYPE);
		createEAttribute(symbolImageTypeEClass, SYMBOL_IMAGE_TYPE__HREF);

		titleTypeEClass = createEClass(TITLE_TYPE);
		createEReference(titleTypeEClass, TITLE_TYPE__P);
		createEAttribute(titleTypeEClass, TITLE_TYPE__CELL_RANGE);
		createEAttribute(titleTypeEClass, TITLE_TYPE__STYLE_NAME);
		createEAttribute(titleTypeEClass, TITLE_TYPE__X);
		createEAttribute(titleTypeEClass, TITLE_TYPE__Y);

		wallTypeEClass = createEClass(WALL_TYPE);
		createEAttribute(wallTypeEClass, WALL_TYPE__STYLE_NAME);
		createEAttribute(wallTypeEClass, WALL_TYPE__WIDTH);

		// Create enums
		classTypeEEnum = createEEnum(CLASS_TYPE);
		dataLabelNumberTypeEEnum = createEEnum(DATA_LABEL_NUMBER_TYPE);
		dataSourceHasLabelsTypeEEnum = createEEnum(DATA_SOURCE_HAS_LABELS_TYPE);
		dimensionTypeEEnum = createEEnum(DIMENSION_TYPE);
		errorCategoryTypeEEnum = createEEnum(ERROR_CATEGORY_TYPE);
		interpolationTypeEEnum = createEEnum(INTERPOLATION_TYPE);
		labelArrangementTypeEEnum = createEEnum(LABEL_ARRANGEMENT_TYPE);
		legendAlignTypeEEnum = createEEnum(LEGEND_ALIGN_TYPE);
		legendPositionTypeEEnum = createEEnum(LEGEND_POSITION_TYPE);
		regressionTypeTypeEEnum = createEEnum(REGRESSION_TYPE_TYPE);
		seriesSourceTypeEEnum = createEEnum(SERIES_SOURCE_TYPE);
		solidTypeTypeEEnum = createEEnum(SOLID_TYPE_TYPE);
		symbolNameTypeEEnum = createEEnum(SYMBOL_NAME_TYPE);
		symbolTypeTypeEEnum = createEEnum(SYMBOL_TYPE_TYPE);

		// Create data types
		classTypeObjectEDataType = createEDataType(CLASS_TYPE_OBJECT);
		dataLabelNumberTypeObjectEDataType = createEDataType(DATA_LABEL_NUMBER_TYPE_OBJECT);
		dataSourceHasLabelsTypeObjectEDataType = createEDataType(DATA_SOURCE_HAS_LABELS_TYPE_OBJECT);
		dimensionTypeObjectEDataType = createEDataType(DIMENSION_TYPE_OBJECT);
		errorCategoryTypeObjectEDataType = createEDataType(ERROR_CATEGORY_TYPE_OBJECT);
		interpolationTypeObjectEDataType = createEDataType(INTERPOLATION_TYPE_OBJECT);
		labelArrangementTypeObjectEDataType = createEDataType(LABEL_ARRANGEMENT_TYPE_OBJECT);
		legendAlignTypeObjectEDataType = createEDataType(LEGEND_ALIGN_TYPE_OBJECT);
		legendPositionTypeObjectEDataType = createEDataType(LEGEND_POSITION_TYPE_OBJECT);
		regressionTypeTypeObjectEDataType = createEDataType(REGRESSION_TYPE_TYPE_OBJECT);
		seriesSourceTypeObjectEDataType = createEDataType(SERIES_SOURCE_TYPE_OBJECT);
		solidTypeTypeObjectEDataType = createEDataType(SOLID_TYPE_TYPE_OBJECT);
		styleNameTypeEDataType = createEDataType(STYLE_NAME_TYPE);
		styleNameTypeMember1EDataType = createEDataType(STYLE_NAME_TYPE_MEMBER1);
		symbolNameTypeObjectEDataType = createEDataType(SYMBOL_NAME_TYPE_OBJECT);
		symbolTypeTypeObjectEDataType = createEDataType(SYMBOL_TYPE_TYPE_OBJECT);
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
		StylePackage theStylePackage = (StylePackage)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);
		Dr3dPackage theDr3dPackage = (Dr3dPackage)EPackage.Registry.INSTANCE.getEPackage(Dr3dPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(axisTypeEClass, AxisType.class, "AxisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxisType_Title(), this.getTitleType(), null, "title", null, 0, 1, AxisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxisType_Categories(), this.getCategoriesType(), null, "categories", null, 0, 1, AxisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxisType_Grid(), this.getGridType(), null, "grid", null, 0, -1, AxisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisType_Dimension(), this.getDimensionType(), "dimension", null, 1, 1, AxisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisType_Name(), theTextPackage.getString(), "name", null, 0, 1, AxisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, AxisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoriesTypeEClass, CategoriesType.class, "CategoriesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoriesType_CellRangeAddress(), theTextPackage.getCellRangeAddress(), "cellRangeAddress", null, 0, 1, CategoriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPointTypeEClass, DataPointType.class, "DataPointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPointType_Repeated(), theTextPackage.getNonNegativeInteger(), "repeated", null, 0, 1, DataPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPointType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, DataPointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Axis(), this.getAxisType(), null, "axis", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Categories(), this.getCategoriesType(), null, "categories", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Chart(), theTextPackage.getOfficeChartContentMainType(), null, "chart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DataPoint(), this.getDataPointType(), null, "dataPoint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Domain(), this.getDomainType(), null, "domain", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ErrorIndicator(), this.getErrorIndicatorType(), null, "errorIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Floor(), this.getFloorType(), null, "floor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Footer(), this.getFooterType(), null, "footer", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Grid(), this.getGridType(), null, "grid", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Legend(), this.getLegendType(), null, "legend", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MeanValue(), this.getMeanValueType(), null, "meanValue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PlotArea(), this.getPlotAreaType(), null, "plotArea", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RegressionCurve(), this.getRegressionCurveType(), null, "regressionCurve", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Series(), this.getSeriesType(), null, "series", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StockGainMarker(), this.getStockGainMarkerType(), null, "stockGainMarker", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StockLossMarker(), this.getStockLossMarkerType(), null, "stockLossMarker", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StockRangeLine(), this.getStockRangeLineType(), null, "stockRangeLine", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Subtitle(), this.getSubtitleType(), null, "subtitle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SymbolImage(), this.getSymbolImageType(), null, "symbolImage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Title(), this.getTitleType(), null, "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Wall(), this.getWallType(), null, "wall", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AttachedAxis(), theTextPackage.getString(), "attachedAxis", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ColumnMapping(), theTextPackage.getString(), "columnMapping", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ConnectBars(), theTextPackage.getBoolean(), "connectBars", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DataLabelNumber(), this.getDataLabelNumberType(), "dataLabelNumber", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DataLabelSymbol(), theTextPackage.getBoolean(), "dataLabelSymbol", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DataLabelText(), theTextPackage.getBoolean(), "dataLabelText", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DataSourceHasLabels(), this.getDataSourceHasLabelsType(), "dataSourceHasLabels", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Deep(), theTextPackage.getBoolean(), "deep", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Dimension(), this.getDimensionType(), "dimension", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DisplayLabel(), theTextPackage.getBoolean(), "displayLabel", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ErrorCategory(), this.getErrorCategoryType(), "errorCategory", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ErrorLowerIndicator(), theTextPackage.getBoolean(), "errorLowerIndicator", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ErrorLowerLimit(), theTextPackage.getDouble(), "errorLowerLimit", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ErrorMargin(), theTextPackage.getDouble(), "errorMargin", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ErrorPercentage(), theTextPackage.getDouble(), "errorPercentage", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ErrorUpperIndicator(), theTextPackage.getBoolean(), "errorUpperIndicator", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ErrorUpperLimit(), theTextPackage.getDouble(), "errorUpperLimit", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_GapWidth(), theTextPackage.getInteger(), "gapWidth", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Interpolation(), this.getInterpolationType(), "interpolation", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IntervalMajor(), theTextPackage.getDouble(), "intervalMajor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_IntervalMinorDivisor(), theTextPackage.getPositiveInteger(), "intervalMinorDivisor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_JapaneseCandleStick(), theTextPackage.getBoolean(), "japaneseCandleStick", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LabelArrangement(), this.getLabelArrangementType(), "labelArrangement", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LabelCellAddress(), theTextPackage.getCellAddress(), "labelCellAddress", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LegendAlign(), this.getLegendAlignType(), "legendAlign", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LegendPosition(), this.getLegendPositionType(), "legendPosition", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Lines(), theTextPackage.getBoolean(), "lines", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_LinkDataStyleToSource(), theTextPackage.getBoolean(), "linkDataStyleToSource", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Logarithmic(), theTextPackage.getBoolean(), "logarithmic", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Maximum(), theTextPackage.getDouble(), "maximum", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MeanValue1(), theTextPackage.getBoolean(), "meanValue1", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Minimum(), theTextPackage.getDouble(), "minimum", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Name(), theTextPackage.getString(), "name", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Origin(), theTextPackage.getDouble(), "origin", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Overlap(), theTextPackage.getInteger(), "overlap", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Percentage(), theTextPackage.getBoolean(), "percentage", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PieOffset(), theTextPackage.getNonNegativeInteger(), "pieOffset", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RegressionType(), this.getRegressionTypeType(), "regressionType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Repeated(), theTextPackage.getNonNegativeInteger(), "repeated", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RowMapping(), theTextPackage.getString(), "rowMapping", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ScaleText(), theTextPackage.getBoolean(), "scaleText", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SeriesSource(), this.getSeriesSourceType(), "seriesSource", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SolidType(), this.getSolidTypeType(), "solidType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SplineOrder(), theTextPackage.getPositiveInteger(), "splineOrder", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SplineResolution(), theTextPackage.getPositiveInteger(), "splineResolution", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Stacked(), theTextPackage.getBoolean(), "stacked", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SymbolHeight(), theTextPackage.getNonNegativeLength(), "symbolHeight", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SymbolName(), this.getSymbolNameType(), "symbolName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SymbolType(), this.getSymbolTypeType(), "symbolType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SymbolWidth(), theTextPackage.getNonNegativeLength(), "symbolWidth", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TextOverlap(), theTextPackage.getBoolean(), "textOverlap", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ThreeDimensional(), theTextPackage.getBoolean(), "threeDimensional", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TickMarksMajorInner(), theTextPackage.getBoolean(), "tickMarksMajorInner", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TickMarksMajorOuter(), theTextPackage.getBoolean(), "tickMarksMajorOuter", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TickMarksMinorInner(), theTextPackage.getBoolean(), "tickMarksMinorInner", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TickMarksMinorOuter(), theTextPackage.getBoolean(), "tickMarksMinorOuter", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ValuesCellRangeAddress(), theTextPackage.getCellRangeAddress(), "valuesCellRangeAddress", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Vertical(), theTextPackage.getBoolean(), "vertical", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Visible(), theTextPackage.getBoolean(), "visible", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainTypeEClass, DomainType.class, "DomainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainType_CellRangeAddress(), theTextPackage.getCellRangeAddress(), "cellRangeAddress", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorIndicatorTypeEClass, ErrorIndicatorType.class, "ErrorIndicatorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorIndicatorType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, ErrorIndicatorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floorTypeEClass, FloorType.class, "FloorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloorType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, FloorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloorType_Width(), theTextPackage.getLength(), "width", null, 1, 1, FloorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(footerTypeEClass, FooterType.class, "FooterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFooterType_P(), theTextPackage.getPType(), null, "p", null, 0, 1, FooterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFooterType_CellRange(), theTextPackage.getCellAddress(), "cellRange", null, 0, 1, FooterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFooterType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, FooterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFooterType_X(), theTextPackage.getCoordinate(), "x", null, 1, 1, FooterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFooterType_Y(), theTextPackage.getCoordinate(), "y", null, 1, 1, FooterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridTypeEClass, GridType.class, "GridType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridType_Class(), this.getClassType(), "class", null, 1, 1, GridType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGridType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, GridType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legendTypeEClass, LegendType.class, "LegendType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegendType_LegendAlign(), this.getLegendAlignType(), "legendAlign", null, 0, 1, LegendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegendType_LegendExpansion(), theStylePackage.getLegendExpansionType(), "legendExpansion", null, 0, 1, LegendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegendType_LegendExpansionAspectRatio(), theTextPackage.getDouble(), "legendExpansionAspectRatio", null, 0, 1, LegendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegendType_LegendPosition(), this.getLegendPositionType(), "legendPosition", null, 0, 1, LegendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegendType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, LegendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegendType_X(), theTextPackage.getCoordinate(), "x", null, 1, 1, LegendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegendType_Y(), theTextPackage.getCoordinate(), "y", null, 1, 1, LegendType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meanValueTypeEClass, MeanValueType.class, "MeanValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeanValueType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, MeanValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plotAreaTypeEClass, PlotAreaType.class, "PlotAreaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlotAreaType_Light(), theDr3dPackage.getLightType(), null, "light", null, 0, -1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlotAreaType_Axis(), this.getAxisType(), null, "axis", null, 0, -1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlotAreaType_Series(), this.getSeriesType(), null, "series", null, 0, -1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlotAreaType_StockGainMarker(), this.getStockGainMarkerType(), null, "stockGainMarker", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlotAreaType_StockLossMarker(), this.getStockLossMarkerType(), null, "stockLossMarker", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlotAreaType_StockRangeLine(), this.getStockRangeLineType(), null, "stockRangeLine", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlotAreaType_Wall(), this.getWallType(), null, "wall", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlotAreaType_Floor(), this.getFloorType(), null, "floor", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_AmbientColor(), theTextPackage.getColor(), "ambientColor", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_CellRangeAddress(), theTextPackage.getCellRangeAddress(), "cellRangeAddress", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_DataSourceHasLabels(), this.getDataSourceHasLabelsType(), "dataSourceHasLabels", "none", 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_Distance(), theTextPackage.getLength(), "distance", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_FocalLength(), theTextPackage.getLength(), "focalLength", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_Height(), theTextPackage.getLength(), "height", null, 1, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_LightingMode(), theTextPackage.getBoolean(), "lightingMode", null, 1, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_Projection(), theDr3dPackage.getProjectionType(), "projection", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_ShadeMode(), theDr3dPackage.getShadeModeType(), "shadeMode", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_ShadowSlant(), theTextPackage.getNonNegativeInteger(), "shadowSlant", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_Transform(), theXMLTypePackage.getAnySimpleType(), "transform", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_Vpn(), theTextPackage.getVector3D(), "vpn", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_Vrp(), theTextPackage.getVector3D(), "vrp", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_Vup(), theTextPackage.getVector3D(), "vup", null, 0, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_Width(), theTextPackage.getLength(), "width", null, 1, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_X(), theTextPackage.getCoordinate(), "x", null, 1, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlotAreaType_Y(), theTextPackage.getCoordinate(), "y", null, 1, 1, PlotAreaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regressionCurveTypeEClass, RegressionCurveType.class, "RegressionCurveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegressionCurveType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, RegressionCurveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seriesTypeEClass, SeriesType.class, "SeriesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeriesType_Domain(), this.getDomainType(), null, "domain", null, 0, -1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeriesType_MeanValue(), this.getMeanValueType(), null, "meanValue", null, 0, 1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeriesType_RegressionCurve(), this.getRegressionCurveType(), null, "regressionCurve", null, 0, 1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeriesType_ErrorIndicator(), this.getErrorIndicatorType(), null, "errorIndicator", null, 0, 1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeriesType_DataPoint(), this.getDataPointType(), null, "dataPoint", null, 0, -1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeriesType_AttachedAxis(), theTextPackage.getString(), "attachedAxis", null, 0, 1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeriesType_Class(), theTextPackage.getNamespacedToken(), "class", null, 1, 1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeriesType_LabelCellAddress(), theTextPackage.getCellAddress(), "labelCellAddress", null, 0, 1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeriesType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeriesType_ValuesCellRangeAddress(), theTextPackage.getCellRangeAddress(), "valuesCellRangeAddress", null, 0, 1, SeriesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockGainMarkerTypeEClass, StockGainMarkerType.class, "StockGainMarkerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStockGainMarkerType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, StockGainMarkerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockLossMarkerTypeEClass, StockLossMarkerType.class, "StockLossMarkerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStockLossMarkerType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, StockLossMarkerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockRangeLineTypeEClass, StockRangeLineType.class, "StockRangeLineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStockRangeLineType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, StockRangeLineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subtitleTypeEClass, SubtitleType.class, "SubtitleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubtitleType_P(), theTextPackage.getPType(), null, "p", null, 0, 1, SubtitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtitleType_CellRange(), theTextPackage.getCellAddress(), "cellRange", null, 0, 1, SubtitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtitleType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, SubtitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtitleType_X(), theTextPackage.getCoordinate(), "x", null, 1, 1, SubtitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtitleType_Y(), theTextPackage.getCoordinate(), "y", null, 1, 1, SubtitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolImageTypeEClass, SymbolImageType.class, "SymbolImageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbolImageType_Href(), theTextPackage.getAnyURI(), "href", null, 1, 1, SymbolImageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleTypeEClass, TitleType.class, "TitleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTitleType_P(), theTextPackage.getPType(), null, "p", null, 0, 1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleType_CellRange(), theTextPackage.getCellAddress(), "cellRange", null, 0, 1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleType_X(), theTextPackage.getCoordinate(), "x", null, 1, 1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleType_Y(), theTextPackage.getCoordinate(), "y", null, 1, 1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wallTypeEClass, WallType.class, "WallType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWallType_StyleName(), this.getStyleNameType(), "styleName", null, 0, 1, WallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWallType_Width(), theTextPackage.getLength(), "width", null, 1, 1, WallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classTypeEEnum, ClassType.class, "ClassType");
		addEEnumLiteral(classTypeEEnum, ClassType.MAJOR);
		addEEnumLiteral(classTypeEEnum, ClassType.MINOR);

		initEEnum(dataLabelNumberTypeEEnum, DataLabelNumberType.class, "DataLabelNumberType");
		addEEnumLiteral(dataLabelNumberTypeEEnum, DataLabelNumberType.NONE);
		addEEnumLiteral(dataLabelNumberTypeEEnum, DataLabelNumberType.VALUE);
		addEEnumLiteral(dataLabelNumberTypeEEnum, DataLabelNumberType.PERCENTAGE);

		initEEnum(dataSourceHasLabelsTypeEEnum, DataSourceHasLabelsType.class, "DataSourceHasLabelsType");
		addEEnumLiteral(dataSourceHasLabelsTypeEEnum, DataSourceHasLabelsType.NONE);
		addEEnumLiteral(dataSourceHasLabelsTypeEEnum, DataSourceHasLabelsType.ROW);
		addEEnumLiteral(dataSourceHasLabelsTypeEEnum, DataSourceHasLabelsType.COLUMN);
		addEEnumLiteral(dataSourceHasLabelsTypeEEnum, DataSourceHasLabelsType.BOTH);

		initEEnum(dimensionTypeEEnum, DimensionType.class, "DimensionType");
		addEEnumLiteral(dimensionTypeEEnum, DimensionType.X);
		addEEnumLiteral(dimensionTypeEEnum, DimensionType.Y);
		addEEnumLiteral(dimensionTypeEEnum, DimensionType.Z);

		initEEnum(errorCategoryTypeEEnum, ErrorCategoryType.class, "ErrorCategoryType");
		addEEnumLiteral(errorCategoryTypeEEnum, ErrorCategoryType.NONE);
		addEEnumLiteral(errorCategoryTypeEEnum, ErrorCategoryType.VARIANCE);
		addEEnumLiteral(errorCategoryTypeEEnum, ErrorCategoryType.STANDARD_DEVIATION);
		addEEnumLiteral(errorCategoryTypeEEnum, ErrorCategoryType.PERCENTAGE);
		addEEnumLiteral(errorCategoryTypeEEnum, ErrorCategoryType.ERROR_MARGIN);
		addEEnumLiteral(errorCategoryTypeEEnum, ErrorCategoryType.CONSTANT);

		initEEnum(interpolationTypeEEnum, InterpolationType.class, "InterpolationType");
		addEEnumLiteral(interpolationTypeEEnum, InterpolationType.NONE);
		addEEnumLiteral(interpolationTypeEEnum, InterpolationType.CUBIC_SPLINE);
		addEEnumLiteral(interpolationTypeEEnum, InterpolationType.BSPLINE);

		initEEnum(labelArrangementTypeEEnum, LabelArrangementType.class, "LabelArrangementType");
		addEEnumLiteral(labelArrangementTypeEEnum, LabelArrangementType.SIDE_BY_SIDE);
		addEEnumLiteral(labelArrangementTypeEEnum, LabelArrangementType.STAGGER_EVEN);
		addEEnumLiteral(labelArrangementTypeEEnum, LabelArrangementType.STAGGER_ODD);

		initEEnum(legendAlignTypeEEnum, LegendAlignType.class, "LegendAlignType");
		addEEnumLiteral(legendAlignTypeEEnum, LegendAlignType.START);
		addEEnumLiteral(legendAlignTypeEEnum, LegendAlignType.CENTER);
		addEEnumLiteral(legendAlignTypeEEnum, LegendAlignType.END);

		initEEnum(legendPositionTypeEEnum, LegendPositionType.class, "LegendPositionType");
		addEEnumLiteral(legendPositionTypeEEnum, LegendPositionType.START);
		addEEnumLiteral(legendPositionTypeEEnum, LegendPositionType.END);
		addEEnumLiteral(legendPositionTypeEEnum, LegendPositionType.TOP);
		addEEnumLiteral(legendPositionTypeEEnum, LegendPositionType.BOTTOM);
		addEEnumLiteral(legendPositionTypeEEnum, LegendPositionType.TOP_START);
		addEEnumLiteral(legendPositionTypeEEnum, LegendPositionType.BOTTOM_START);
		addEEnumLiteral(legendPositionTypeEEnum, LegendPositionType.TOP_END);
		addEEnumLiteral(legendPositionTypeEEnum, LegendPositionType.BOTTOM_END);

		initEEnum(regressionTypeTypeEEnum, RegressionTypeType.class, "RegressionTypeType");
		addEEnumLiteral(regressionTypeTypeEEnum, RegressionTypeType.NONE);
		addEEnumLiteral(regressionTypeTypeEEnum, RegressionTypeType.LINEAR);
		addEEnumLiteral(regressionTypeTypeEEnum, RegressionTypeType.LOGARITHMIC);
		addEEnumLiteral(regressionTypeTypeEEnum, RegressionTypeType.EXPONENTIAL);
		addEEnumLiteral(regressionTypeTypeEEnum, RegressionTypeType.POWER);

		initEEnum(seriesSourceTypeEEnum, SeriesSourceType.class, "SeriesSourceType");
		addEEnumLiteral(seriesSourceTypeEEnum, SeriesSourceType.COLUMNS);
		addEEnumLiteral(seriesSourceTypeEEnum, SeriesSourceType.ROWS);

		initEEnum(solidTypeTypeEEnum, SolidTypeType.class, "SolidTypeType");
		addEEnumLiteral(solidTypeTypeEEnum, SolidTypeType.CUBOID);
		addEEnumLiteral(solidTypeTypeEEnum, SolidTypeType.CYLINDER);
		addEEnumLiteral(solidTypeTypeEEnum, SolidTypeType.CONE);
		addEEnumLiteral(solidTypeTypeEEnum, SolidTypeType.PYRAMID);

		initEEnum(symbolNameTypeEEnum, SymbolNameType.class, "SymbolNameType");
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.SQUARE);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.DIAMOND);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.ARROW_DOWN);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.ARROW_UP);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.ARROW_RIGHT);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.ARROW_LEFT);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.BOW_TIE);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.HOURGLASS);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.CIRCLE);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.STAR);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.X);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.PLUS);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.ASTERISK);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.HORIZONTAL_BAR);
		addEEnumLiteral(symbolNameTypeEEnum, SymbolNameType.VERTICAL_BAR);

		initEEnum(symbolTypeTypeEEnum, SymbolTypeType.class, "SymbolTypeType");
		addEEnumLiteral(symbolTypeTypeEEnum, SymbolTypeType.NONE);
		addEEnumLiteral(symbolTypeTypeEEnum, SymbolTypeType.AUTOMATIC);
		addEEnumLiteral(symbolTypeTypeEEnum, SymbolTypeType.NAMED_SYMBOL);
		addEEnumLiteral(symbolTypeTypeEEnum, SymbolTypeType.IMAGE);

		// Initialize data types
		initEDataType(classTypeObjectEDataType, ClassType.class, "ClassTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataLabelNumberTypeObjectEDataType, DataLabelNumberType.class, "DataLabelNumberTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataSourceHasLabelsTypeObjectEDataType, DataSourceHasLabelsType.class, "DataSourceHasLabelsTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dimensionTypeObjectEDataType, DimensionType.class, "DimensionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(errorCategoryTypeObjectEDataType, ErrorCategoryType.class, "ErrorCategoryTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(interpolationTypeObjectEDataType, InterpolationType.class, "InterpolationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(labelArrangementTypeObjectEDataType, LabelArrangementType.class, "LabelArrangementTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(legendAlignTypeObjectEDataType, LegendAlignType.class, "LegendAlignTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(legendPositionTypeObjectEDataType, LegendPositionType.class, "LegendPositionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(regressionTypeTypeObjectEDataType, RegressionTypeType.class, "RegressionTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(seriesSourceTypeObjectEDataType, SeriesSourceType.class, "SeriesSourceTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(solidTypeTypeObjectEDataType, SolidTypeType.class, "SolidTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleNameTypeEDataType, String.class, "StyleNameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleNameTypeMember1EDataType, String.class, "StyleNameTypeMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(symbolNameTypeObjectEDataType, SymbolNameType.class, "SymbolNameTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(symbolTypeTypeObjectEDataType, SymbolTypeType.class, "SymbolTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (axisTypeEClass, 
		   source, 
		   new String[] {
			 "name", "axis_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAxisType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAxisType_Categories(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "categories",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAxisType_Grid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "grid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAxisType_Dimension(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dimension",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAxisType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAxisType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (categoriesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "categories_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCategoriesType_CellRangeAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cell-range-address",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (classTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "class_._type"
		   });		
		addAnnotation
		  (classTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "class_._type:Object",
			 "baseType", "class_._type"
		   });		
		addAnnotation
		  (dataLabelNumberTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "data-label-number_._type"
		   });		
		addAnnotation
		  (dataLabelNumberTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "data-label-number_._type:Object",
			 "baseType", "data-label-number_._type"
		   });		
		addAnnotation
		  (dataPointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "data-point_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDataPointType_Repeated(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeated",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataPointType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dataSourceHasLabelsTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "data-source-has-labels_._type"
		   });		
		addAnnotation
		  (dataSourceHasLabelsTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "data-source-has-labels_._type:Object",
			 "baseType", "data-source-has-labels_._type"
		   });		
		addAnnotation
		  (dimensionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "dimension_._type"
		   });		
		addAnnotation
		  (dimensionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "dimension_._type:Object",
			 "baseType", "dimension_._type"
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
		  (getDocumentRoot_Axis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "axis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Categories(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "categories",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Chart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "chart",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#office-chart-content-main"
		   });		
		addAnnotation
		  (getDocumentRoot_DataPoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data-point",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Domain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "domain",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ErrorIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "error-indicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Floor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "floor",
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
		  (getDocumentRoot_Grid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "grid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Legend(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "legend",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MeanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mean-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PlotArea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "plot-area",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegressionCurve(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "regression-curve",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Series(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "series",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StockGainMarker(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stock-gain-marker",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StockLossMarker(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stock-loss-marker",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StockRangeLine(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stock-range-line",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Subtitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subtitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SymbolImage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "symbol-image",
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
		  (getDocumentRoot_Wall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "wall",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AttachedAxis(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attached-axis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ColumnMapping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column-mapping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ConnectBars(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "connect-bars",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DataLabelNumber(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data-label-number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DataLabelSymbol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data-label-symbol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DataLabelText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data-label-text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DataSourceHasLabels(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data-source-has-labels",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Deep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "deep",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Dimension(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dimension",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DisplayLabel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display-label",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ErrorCategory(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "error-category",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ErrorLowerIndicator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "error-lower-indicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ErrorLowerLimit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "error-lower-limit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ErrorMargin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "error-margin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ErrorPercentage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "error-percentage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ErrorUpperIndicator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "error-upper-indicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ErrorUpperLimit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "error-upper-limit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GapWidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gap-width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Interpolation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "interpolation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IntervalMajor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "interval-major",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IntervalMinorDivisor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "interval-minor-divisor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_JapaneseCandleStick(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "japanese-candle-stick",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LabelArrangement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label-arrangement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LabelCellAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label-cell-address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LegendAlign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "legend-align",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LegendPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "legend-position",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Lines(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lines",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LinkDataStyleToSource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "link-data-style-to-source",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Logarithmic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "logarithmic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Maximum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maximum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MeanValue1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mean-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Minimum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minimum",
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
		  (getDocumentRoot_Origin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "origin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Overlap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "overlap",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Percentage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "percentage",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PieOffset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pie-offset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RegressionType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "regression-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Repeated(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repeated",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RowMapping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "row-mapping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ScaleText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scale-text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SeriesSource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "series-source",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SolidType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "solid-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SplineOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "spline-order",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SplineResolution(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "spline-resolution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Stacked(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stacked",
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
		  (getDocumentRoot_SymbolHeight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "symbol-height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SymbolName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "symbol-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SymbolType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "symbol-type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SymbolWidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "symbol-width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextOverlap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "text-overlap",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ThreeDimensional(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "three-dimensional",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TickMarksMajorInner(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tick-marks-major-inner",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TickMarksMajorOuter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tick-marks-major-outer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TickMarksMinorInner(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tick-marks-minor-inner",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TickMarksMinorOuter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tick-marks-minor-outer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ValuesCellRangeAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "values-cell-range-address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Vertical(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vertical",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (domainTypeEClass, 
		   source, 
		   new String[] {
			 "name", "domain_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDomainType_CellRangeAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cell-range-address",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (errorCategoryTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "error-category_._type"
		   });		
		addAnnotation
		  (errorCategoryTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "error-category_._type:Object",
			 "baseType", "error-category_._type"
		   });		
		addAnnotation
		  (errorIndicatorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "error-indicator_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getErrorIndicatorType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (floorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "floor_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFloorType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFloorType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (footerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "footer_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFooterType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getFooterType_CellRange(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cell-range",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getFooterType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFooterType_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getFooterType_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (gridTypeEClass, 
		   source, 
		   new String[] {
			 "name", "grid_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getGridType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGridType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (interpolationTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "interpolation_._type"
		   });		
		addAnnotation
		  (interpolationTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "interpolation_._type:Object",
			 "baseType", "interpolation_._type"
		   });		
		addAnnotation
		  (labelArrangementTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "label-arrangement_._type"
		   });		
		addAnnotation
		  (labelArrangementTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "label-arrangement_._type:Object",
			 "baseType", "label-arrangement_._type"
		   });		
		addAnnotation
		  (legendAlignTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "legend-align_._type"
		   });		
		addAnnotation
		  (legendAlignTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "legend-align_._type:Object",
			 "baseType", "legend-align_._type"
		   });		
		addAnnotation
		  (legendPositionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "legend-position_._type"
		   });		
		addAnnotation
		  (legendPositionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "legend-position_._type:Object",
			 "baseType", "legend-position_._type"
		   });		
		addAnnotation
		  (legendTypeEClass, 
		   source, 
		   new String[] {
			 "name", "legend_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLegendType_LegendAlign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "legend-align",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLegendType_LegendExpansion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "legend-expansion",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getLegendType_LegendExpansionAspectRatio(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "legend-expansion-aspect-ratio",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getLegendType_LegendPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "legend-position",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLegendType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLegendType_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getLegendType_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (meanValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mean-value_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMeanValueType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (plotAreaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "plot-area_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPlotAreaType_Light(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "light",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_Axis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "axis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlotAreaType_Series(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "series",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlotAreaType_StockGainMarker(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stock-gain-marker",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlotAreaType_StockLossMarker(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stock-loss-marker",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlotAreaType_StockRangeLine(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stock-range-line",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlotAreaType_Wall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "wall",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlotAreaType_Floor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "floor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlotAreaType_AmbientColor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ambient-color",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_CellRangeAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cell-range-address",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_DataSourceHasLabels(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data-source-has-labels",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlotAreaType_Distance(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "distance",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_FocalLength(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "focal-length",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_LightingMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lighting-mode",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_Projection(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "projection",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_ShadeMode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shade-mode",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_ShadowSlant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shadow-slant",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlotAreaType_Transform(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transform",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_Vpn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vpn",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_Vrp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vrp",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_Vup(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "vup",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getPlotAreaType_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (regressionCurveTypeEClass, 
		   source, 
		   new String[] {
			 "name", "regression-curve_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRegressionCurveType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (regressionTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "regression-type_._type"
		   });		
		addAnnotation
		  (regressionTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "regression-type_._type:Object",
			 "baseType", "regression-type_._type"
		   });		
		addAnnotation
		  (seriesSourceTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "series-source_._type"
		   });		
		addAnnotation
		  (seriesSourceTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "series-source_._type:Object",
			 "baseType", "series-source_._type"
		   });		
		addAnnotation
		  (seriesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "series_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSeriesType_Domain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "domain",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeriesType_MeanValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mean-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeriesType_RegressionCurve(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "regression-curve",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeriesType_ErrorIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "error-indicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeriesType_DataPoint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data-point",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeriesType_AttachedAxis(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attached-axis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeriesType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeriesType_LabelCellAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label-cell-address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeriesType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSeriesType_ValuesCellRangeAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "values-cell-range-address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (solidTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "solid-type_._type"
		   });		
		addAnnotation
		  (solidTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "solid-type_._type:Object",
			 "baseType", "solid-type_._type"
		   });		
		addAnnotation
		  (stockGainMarkerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "stock-gain-marker_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStockGainMarkerType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (stockLossMarkerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "stock-loss-marker_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStockLossMarkerType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (stockRangeLineTypeEClass, 
		   source, 
		   new String[] {
			 "name", "stock-range-line_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStockRangeLineType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
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
		  (subtitleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "subtitle_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubtitleType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getSubtitleType_CellRange(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cell-range",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getSubtitleType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubtitleType_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getSubtitleType_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (symbolImageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "symbol-image_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSymbolImageType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });		
		addAnnotation
		  (symbolNameTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "symbol-name_._type"
		   });		
		addAnnotation
		  (symbolNameTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "symbol-name_._type:Object",
			 "baseType", "symbol-name_._type"
		   });		
		addAnnotation
		  (symbolTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "symbol-type_._type"
		   });		
		addAnnotation
		  (symbolTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "symbol-type_._type:Object",
			 "baseType", "symbol-type_._type"
		   });		
		addAnnotation
		  (titleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "title_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTitleType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getTitleType_CellRange(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cell-range",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:table:1.0"
		   });		
		addAnnotation
		  (getTitleType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTitleType_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (getTitleType_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });		
		addAnnotation
		  (wallTypeEClass, 
		   source, 
		   new String[] {
			 "name", "wall_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getWallType_StyleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style-name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWallType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0"
		   });
	}

} //ChartPackageImpl
