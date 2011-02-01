/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.AmPmType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember1;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember2;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember3;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember4;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember5;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember6;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember7;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CalendarTypeMember8;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastyleFactory;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayOfWeekType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DayType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.EmbeddedTextType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.EraType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.FormatSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.FractionType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.HoursType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.MinutesType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.MonthType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.QuarterType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.ScientificNumberType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.SecondsType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.StyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextContentType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.WeekOfYearType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.YearType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.util.DatastyleValidator;
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
public class DatastylePackageImpl extends EPackageImpl implements DatastylePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amPmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencySymbolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayOfWeekTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eraTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fractionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hoursTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minutesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monthTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quarterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scientificNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weekOfYearTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearTypeEClass = null;

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
	private EEnum calendarTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarTypeMember2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarTypeMember3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarTypeMember4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarTypeMember5EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarTypeMember6EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarTypeMember7EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calendarTypeMember8EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum styleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transliterationStyleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarTypeMember2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarTypeMember3ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarTypeMember4ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarTypeMember5ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarTypeMember6ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarTypeMember7ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarTypeMember8ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType formatSourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transliterationStyleTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatastylePackageImpl() {
		super(eNS_URI, DatastyleFactory.eINSTANCE);
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
	public static DatastylePackage init() {
		if (isInited) return (DatastylePackage)EPackage.Registry.INSTANCE.getEPackage(DatastylePackage.eNS_URI);

		// Obtain or create and register package
		DatastylePackageImpl theDatastylePackage = (DatastylePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DatastylePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DatastylePackageImpl());

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
		theDatastylePackage.createPackageContents();
		theOfficePackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theXLinkPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
		theSvgPackage.createPackageContents();
		theDr3dPackage.createPackageContents();
		theFoPackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theAnimationPackage.createPackageContents();
		theCompatiblePackage.createPackageContents();
		theMetaPackage.createPackageContents();
		theChartPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theMathMLPackage.createPackageContents();
		theXFormsPackage.createPackageContents();

		// Initialize created meta-data
		theDatastylePackage.initializePackageContents();
		theOfficePackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theXLinkPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
		theSvgPackage.initializePackageContents();
		theDr3dPackage.initializePackageContents();
		theFoPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
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
			(theDatastylePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DatastyleValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDatastylePackage.freeze();

		return theDatastylePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmPmType() {
		return amPmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanStyleType() {
		return booleanStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanStyleType_TextProperties() {
		return (EReference)booleanStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_Text() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanStyleType_Boolean() {
		return (EReference)booleanStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_Text1() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanStyleType_Map() {
		return (EReference)booleanStyleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_Country() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_Language() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_Name() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_Title() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_TransliterationCountry() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_TransliterationFormat() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_TransliterationLanguage() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_TransliterationStyle() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanStyleType_Volatile() {
		return (EAttribute)booleanStyleTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencyStyleType() {
		return currencyStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyStyleType_TextProperties() {
		return (EReference)currencyStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Text() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyStyleType_Number() {
		return (EReference)currencyStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Text1() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyStyleType_CurrencySymbol() {
		return (EReference)currencyStyleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Text2() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyStyleType_CurrencySymbol1() {
		return (EReference)currencyStyleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Text3() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyStyleType_Number1() {
		return (EReference)currencyStyleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Text4() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyStyleType_Map() {
		return (EReference)currencyStyleTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_AutomaticOrder() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Country() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Language() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Name() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Title() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_TransliterationCountry() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_TransliterationFormat() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_TransliterationLanguage() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_TransliterationStyle() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyStyleType_Volatile() {
		return (EAttribute)currencyStyleTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencySymbolType() {
		return currencySymbolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencySymbolType_Mixed() {
		return (EAttribute)currencySymbolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencySymbolType_Country() {
		return (EAttribute)currencySymbolTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencySymbolType_Language() {
		return (EAttribute)currencySymbolTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateStyleType() {
		return dateStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_TextProperties() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_Text() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_Group() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_Day() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_Month() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_Year() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_Era() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_DayOfWeek() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_WeekOfYear() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_Quarter() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_Hours() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_AmPm() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_Minutes() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_Seconds() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_Text1() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDateStyleType_Map() {
		return (EReference)dateStyleTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_AutomaticOrder() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_Country() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_FormatSource() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_Language() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_Name() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_Title() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_TransliterationCountry() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_TransliterationFormat() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_TransliterationLanguage() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_TransliterationStyle() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateStyleType_Volatile() {
		return (EAttribute)dateStyleTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDayOfWeekType() {
		return dayOfWeekTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfWeekType_Calendar() {
		return (EAttribute)dayOfWeekTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfWeekType_Style() {
		return (EAttribute)dayOfWeekTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDayType() {
		return dayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayType_Calendar() {
		return (EAttribute)dayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayType_Style() {
		return (EAttribute)dayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddedTextType() {
		return embeddedTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedTextType_Mixed() {
		return (EAttribute)embeddedTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedTextType_Position() {
		return (EAttribute)embeddedTextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEraType() {
		return eraTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEraType_Calendar() {
		return (EAttribute)eraTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEraType_Style() {
		return (EAttribute)eraTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFractionType() {
		return fractionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFractionType_DenominatorValue() {
		return (EAttribute)fractionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFractionType_Grouping() {
		return (EAttribute)fractionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFractionType_MinDenominatorDigits() {
		return (EAttribute)fractionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFractionType_MinIntegerDigits() {
		return (EAttribute)fractionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFractionType_MinNumeratorDigits() {
		return (EAttribute)fractionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHoursType() {
		return hoursTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHoursType_Style() {
		return (EAttribute)hoursTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinutesType() {
		return minutesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinutesType_Style() {
		return (EAttribute)minutesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonthType() {
		return monthTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonthType_Calendar() {
		return (EAttribute)monthTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonthType_PossessiveForm() {
		return (EAttribute)monthTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonthType_Style() {
		return (EAttribute)monthTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonthType_Textual() {
		return (EAttribute)monthTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberStyleType() {
		return numberStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberStyleType_TextProperties() {
		return (EReference)numberStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_Text() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_AnyNumberGroup() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberStyleType_AnyNumber() {
		return (EReference)numberStyleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_Text1() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberStyleType_Map() {
		return (EReference)numberStyleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_Country() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_Language() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_Name() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_Title() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_TransliterationCountry() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_TransliterationFormat() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_TransliterationLanguage() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_TransliterationStyle() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberStyleType_Volatile() {
		return (EAttribute)numberStyleTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberType() {
		return numberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberType_EmbeddedText() {
		return (EReference)numberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_DecimalPlaces() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_DecimalReplacement() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_DisplayFactor() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Grouping() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_MinIntegerDigits() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPercentageStyleType() {
		return percentageStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPercentageStyleType_TextProperties() {
		return (EReference)percentageStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_Text() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPercentageStyleType_Number() {
		return (EReference)percentageStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_Text1() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPercentageStyleType_Map() {
		return (EReference)percentageStyleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_Country() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_Language() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_Name() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_Title() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_TransliterationCountry() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_TransliterationFormat() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_TransliterationLanguage() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_TransliterationStyle() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageStyleType_Volatile() {
		return (EAttribute)percentageStyleTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuarterType() {
		return quarterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuarterType_Calendar() {
		return (EAttribute)quarterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuarterType_Style() {
		return (EAttribute)quarterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScientificNumberType() {
		return scientificNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScientificNumberType_DecimalPlaces() {
		return (EAttribute)scientificNumberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScientificNumberType_Grouping() {
		return (EAttribute)scientificNumberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScientificNumberType_MinExponentDigits() {
		return (EAttribute)scientificNumberTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScientificNumberType_MinIntegerDigits() {
		return (EAttribute)scientificNumberTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecondsType() {
		return secondsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondsType_DecimalPlaces() {
		return (EAttribute)secondsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondsType_Style() {
		return (EAttribute)secondsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContentType() {
		return textContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextStyleType() {
		return textStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextStyleType_TextProperties() {
		return (EReference)textStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_Text() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_Group() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextStyleType_TextContent() {
		return (EReference)textStyleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_Text1() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextStyleType_Map() {
		return (EReference)textStyleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_Country() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_Language() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_Name() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_Title() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_TransliterationCountry() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_TransliterationFormat() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_TransliterationLanguage() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_TransliterationStyle() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextStyleType_Volatile() {
		return (EAttribute)textStyleTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeStyleType() {
		return timeStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeStyleType_TextProperties() {
		return (EReference)timeStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_Text() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_Group() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeStyleType_Hours() {
		return (EReference)timeStyleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeStyleType_AmPm() {
		return (EReference)timeStyleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeStyleType_Minutes() {
		return (EReference)timeStyleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeStyleType_Seconds() {
		return (EReference)timeStyleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_Text1() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeStyleType_Map() {
		return (EReference)timeStyleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_Country() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_FormatSource() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_Language() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_Name() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_Title() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_TransliterationCountry() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_TransliterationFormat() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_TransliterationLanguage() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_TransliterationStyle() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_TruncateOnOverflow() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStyleType_Volatile() {
		return (EAttribute)timeStyleTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeekOfYearType() {
		return weekOfYearTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeekOfYearType_Calendar() {
		return (EAttribute)weekOfYearTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYearType() {
		return yearTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYearType_Calendar() {
		return (EAttribute)yearTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYearType_Style() {
		return (EAttribute)yearTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_AmPm() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Boolean() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BooleanStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurrencyStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CurrencySymbol() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DateStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Day() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DayOfWeek() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EmbeddedText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Era() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Fraction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Hours() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Minutes() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Month() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Number() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NumberStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PercentageStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Quarter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScientificNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Seconds() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Text() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextContent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TextStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeekOfYear() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Year() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AutomaticOrder() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Calendar() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Country() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DecimalPlaces() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DecimalReplacement() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DenominatorValue() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DisplayFactor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FormatSource() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Grouping() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Language() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinDenominatorDigits() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinExponentDigits() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinIntegerDigits() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MinNumeratorDigits() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Position() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PossessiveForm() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Style() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Textual() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Title() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransliterationCountry() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransliterationFormat() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransliterationLanguage() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TransliterationStyle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TruncateOnOverflow() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarTypeMember1() {
		return calendarTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarTypeMember2() {
		return calendarTypeMember2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarTypeMember3() {
		return calendarTypeMember3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarTypeMember4() {
		return calendarTypeMember4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarTypeMember5() {
		return calendarTypeMember5EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarTypeMember6() {
		return calendarTypeMember6EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarTypeMember7() {
		return calendarTypeMember7EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalendarTypeMember8() {
		return calendarTypeMember8EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormatSourceType() {
		return formatSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyleType() {
		return styleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransliterationStyleType() {
		return transliterationStyleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarType() {
		return calendarTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarTypeMember1Object() {
		return calendarTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarTypeMember2Object() {
		return calendarTypeMember2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarTypeMember3Object() {
		return calendarTypeMember3ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarTypeMember4Object() {
		return calendarTypeMember4ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarTypeMember5Object() {
		return calendarTypeMember5ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarTypeMember6Object() {
		return calendarTypeMember6ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarTypeMember7Object() {
		return calendarTypeMember7ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendarTypeMember8Object() {
		return calendarTypeMember8ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFormatSourceTypeObject() {
		return formatSourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleTypeObject() {
		return styleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransliterationStyleTypeObject() {
		return transliterationStyleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastyleFactory getDatastyleFactory() {
		return (DatastyleFactory)getEFactoryInstance();
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
		amPmTypeEClass = createEClass(AM_PM_TYPE);

		booleanStyleTypeEClass = createEClass(BOOLEAN_STYLE_TYPE);
		createEReference(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__TEXT_PROPERTIES);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__TEXT);
		createEReference(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__BOOLEAN);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__TEXT1);
		createEReference(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__MAP);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__COUNTRY);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__LANGUAGE);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__NAME);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__TITLE);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__TRANSLITERATION_COUNTRY);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__TRANSLITERATION_FORMAT);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__TRANSLITERATION_LANGUAGE);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__TRANSLITERATION_STYLE);
		createEAttribute(booleanStyleTypeEClass, BOOLEAN_STYLE_TYPE__VOLATILE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);

		currencyStyleTypeEClass = createEClass(CURRENCY_STYLE_TYPE);
		createEReference(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TEXT_PROPERTIES);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TEXT);
		createEReference(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__NUMBER);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TEXT1);
		createEReference(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TEXT2);
		createEReference(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TEXT3);
		createEReference(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__NUMBER1);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TEXT4);
		createEReference(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__MAP);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__AUTOMATIC_ORDER);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__COUNTRY);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__LANGUAGE);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__NAME);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TITLE);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TRANSLITERATION_COUNTRY);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TRANSLITERATION_FORMAT);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TRANSLITERATION_LANGUAGE);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__TRANSLITERATION_STYLE);
		createEAttribute(currencyStyleTypeEClass, CURRENCY_STYLE_TYPE__VOLATILE);

		currencySymbolTypeEClass = createEClass(CURRENCY_SYMBOL_TYPE);
		createEAttribute(currencySymbolTypeEClass, CURRENCY_SYMBOL_TYPE__MIXED);
		createEAttribute(currencySymbolTypeEClass, CURRENCY_SYMBOL_TYPE__COUNTRY);
		createEAttribute(currencySymbolTypeEClass, CURRENCY_SYMBOL_TYPE__LANGUAGE);

		dateStyleTypeEClass = createEClass(DATE_STYLE_TYPE);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__TEXT_PROPERTIES);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__TEXT);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__GROUP);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__DAY);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__MONTH);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__YEAR);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__ERA);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__DAY_OF_WEEK);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__WEEK_OF_YEAR);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__QUARTER);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__HOURS);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__AM_PM);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__MINUTES);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__SECONDS);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__TEXT1);
		createEReference(dateStyleTypeEClass, DATE_STYLE_TYPE__MAP);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__AUTOMATIC_ORDER);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__COUNTRY);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__FORMAT_SOURCE);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__LANGUAGE);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__NAME);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__TITLE);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__TRANSLITERATION_COUNTRY);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__TRANSLITERATION_FORMAT);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__TRANSLITERATION_LANGUAGE);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__TRANSLITERATION_STYLE);
		createEAttribute(dateStyleTypeEClass, DATE_STYLE_TYPE__VOLATILE);

		dayOfWeekTypeEClass = createEClass(DAY_OF_WEEK_TYPE);
		createEAttribute(dayOfWeekTypeEClass, DAY_OF_WEEK_TYPE__CALENDAR);
		createEAttribute(dayOfWeekTypeEClass, DAY_OF_WEEK_TYPE__STYLE);

		dayTypeEClass = createEClass(DAY_TYPE);
		createEAttribute(dayTypeEClass, DAY_TYPE__CALENDAR);
		createEAttribute(dayTypeEClass, DAY_TYPE__STYLE);

		embeddedTextTypeEClass = createEClass(EMBEDDED_TEXT_TYPE);
		createEAttribute(embeddedTextTypeEClass, EMBEDDED_TEXT_TYPE__MIXED);
		createEAttribute(embeddedTextTypeEClass, EMBEDDED_TEXT_TYPE__POSITION);

		eraTypeEClass = createEClass(ERA_TYPE);
		createEAttribute(eraTypeEClass, ERA_TYPE__CALENDAR);
		createEAttribute(eraTypeEClass, ERA_TYPE__STYLE);

		fractionTypeEClass = createEClass(FRACTION_TYPE);
		createEAttribute(fractionTypeEClass, FRACTION_TYPE__DENOMINATOR_VALUE);
		createEAttribute(fractionTypeEClass, FRACTION_TYPE__GROUPING);
		createEAttribute(fractionTypeEClass, FRACTION_TYPE__MIN_DENOMINATOR_DIGITS);
		createEAttribute(fractionTypeEClass, FRACTION_TYPE__MIN_INTEGER_DIGITS);
		createEAttribute(fractionTypeEClass, FRACTION_TYPE__MIN_NUMERATOR_DIGITS);

		hoursTypeEClass = createEClass(HOURS_TYPE);
		createEAttribute(hoursTypeEClass, HOURS_TYPE__STYLE);

		minutesTypeEClass = createEClass(MINUTES_TYPE);
		createEAttribute(minutesTypeEClass, MINUTES_TYPE__STYLE);

		monthTypeEClass = createEClass(MONTH_TYPE);
		createEAttribute(monthTypeEClass, MONTH_TYPE__CALENDAR);
		createEAttribute(monthTypeEClass, MONTH_TYPE__POSSESSIVE_FORM);
		createEAttribute(monthTypeEClass, MONTH_TYPE__STYLE);
		createEAttribute(monthTypeEClass, MONTH_TYPE__TEXTUAL);

		numberStyleTypeEClass = createEClass(NUMBER_STYLE_TYPE);
		createEReference(numberStyleTypeEClass, NUMBER_STYLE_TYPE__TEXT_PROPERTIES);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__TEXT);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__ANY_NUMBER_GROUP);
		createEReference(numberStyleTypeEClass, NUMBER_STYLE_TYPE__ANY_NUMBER);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__TEXT1);
		createEReference(numberStyleTypeEClass, NUMBER_STYLE_TYPE__MAP);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__COUNTRY);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__LANGUAGE);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__NAME);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__TITLE);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__TRANSLITERATION_COUNTRY);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__TRANSLITERATION_FORMAT);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__TRANSLITERATION_LANGUAGE);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__TRANSLITERATION_STYLE);
		createEAttribute(numberStyleTypeEClass, NUMBER_STYLE_TYPE__VOLATILE);

		numberTypeEClass = createEClass(NUMBER_TYPE);
		createEReference(numberTypeEClass, NUMBER_TYPE__EMBEDDED_TEXT);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__DECIMAL_PLACES);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__DECIMAL_REPLACEMENT);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__DISPLAY_FACTOR);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__GROUPING);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__MIN_INTEGER_DIGITS);

		percentageStyleTypeEClass = createEClass(PERCENTAGE_STYLE_TYPE);
		createEReference(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__TEXT_PROPERTIES);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__TEXT);
		createEReference(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__NUMBER);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__TEXT1);
		createEReference(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__MAP);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__COUNTRY);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__LANGUAGE);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__NAME);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__TITLE);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__TRANSLITERATION_COUNTRY);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__TRANSLITERATION_FORMAT);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__TRANSLITERATION_LANGUAGE);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__TRANSLITERATION_STYLE);
		createEAttribute(percentageStyleTypeEClass, PERCENTAGE_STYLE_TYPE__VOLATILE);

		quarterTypeEClass = createEClass(QUARTER_TYPE);
		createEAttribute(quarterTypeEClass, QUARTER_TYPE__CALENDAR);
		createEAttribute(quarterTypeEClass, QUARTER_TYPE__STYLE);

		scientificNumberTypeEClass = createEClass(SCIENTIFIC_NUMBER_TYPE);
		createEAttribute(scientificNumberTypeEClass, SCIENTIFIC_NUMBER_TYPE__DECIMAL_PLACES);
		createEAttribute(scientificNumberTypeEClass, SCIENTIFIC_NUMBER_TYPE__GROUPING);
		createEAttribute(scientificNumberTypeEClass, SCIENTIFIC_NUMBER_TYPE__MIN_EXPONENT_DIGITS);
		createEAttribute(scientificNumberTypeEClass, SCIENTIFIC_NUMBER_TYPE__MIN_INTEGER_DIGITS);

		secondsTypeEClass = createEClass(SECONDS_TYPE);
		createEAttribute(secondsTypeEClass, SECONDS_TYPE__DECIMAL_PLACES);
		createEAttribute(secondsTypeEClass, SECONDS_TYPE__STYLE);

		textContentTypeEClass = createEClass(TEXT_CONTENT_TYPE);

		textStyleTypeEClass = createEClass(TEXT_STYLE_TYPE);
		createEReference(textStyleTypeEClass, TEXT_STYLE_TYPE__TEXT_PROPERTIES);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__TEXT);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__GROUP);
		createEReference(textStyleTypeEClass, TEXT_STYLE_TYPE__TEXT_CONTENT);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__TEXT1);
		createEReference(textStyleTypeEClass, TEXT_STYLE_TYPE__MAP);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__COUNTRY);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__LANGUAGE);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__NAME);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__TITLE);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__TRANSLITERATION_COUNTRY);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__TRANSLITERATION_FORMAT);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__TRANSLITERATION_LANGUAGE);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__TRANSLITERATION_STYLE);
		createEAttribute(textStyleTypeEClass, TEXT_STYLE_TYPE__VOLATILE);

		timeStyleTypeEClass = createEClass(TIME_STYLE_TYPE);
		createEReference(timeStyleTypeEClass, TIME_STYLE_TYPE__TEXT_PROPERTIES);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__TEXT);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__GROUP);
		createEReference(timeStyleTypeEClass, TIME_STYLE_TYPE__HOURS);
		createEReference(timeStyleTypeEClass, TIME_STYLE_TYPE__AM_PM);
		createEReference(timeStyleTypeEClass, TIME_STYLE_TYPE__MINUTES);
		createEReference(timeStyleTypeEClass, TIME_STYLE_TYPE__SECONDS);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__TEXT1);
		createEReference(timeStyleTypeEClass, TIME_STYLE_TYPE__MAP);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__COUNTRY);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__FORMAT_SOURCE);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__LANGUAGE);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__NAME);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__TITLE);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__TRANSLITERATION_COUNTRY);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__TRANSLITERATION_FORMAT);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__TRANSLITERATION_LANGUAGE);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__TRANSLITERATION_STYLE);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__TRUNCATE_ON_OVERFLOW);
		createEAttribute(timeStyleTypeEClass, TIME_STYLE_TYPE__VOLATILE);

		weekOfYearTypeEClass = createEClass(WEEK_OF_YEAR_TYPE);
		createEAttribute(weekOfYearTypeEClass, WEEK_OF_YEAR_TYPE__CALENDAR);

		yearTypeEClass = createEClass(YEAR_TYPE);
		createEAttribute(yearTypeEClass, YEAR_TYPE__CALENDAR);
		createEAttribute(yearTypeEClass, YEAR_TYPE__STYLE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AM_PM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOLEAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOLEAN_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CURRENCY_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CURRENCY_SYMBOL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DATE_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DAY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DAY_OF_WEEK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EMBEDDED_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ERA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FRACTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HOURS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MINUTES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MONTH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NUMBER_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERCENTAGE_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__QUARTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCIENTIFIC_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SECONDS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXT_CONTENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEXT_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TIME_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WEEK_OF_YEAR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__YEAR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__AUTOMATIC_ORDER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CALENDAR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COUNTRY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DECIMAL_PLACES);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DECIMAL_REPLACEMENT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DENOMINATOR_VALUE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DISPLAY_FACTOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FORMAT_SOURCE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GROUPING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__LANGUAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIN_DENOMINATOR_DIGITS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIN_EXPONENT_DIGITS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIN_INTEGER_DIGITS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIN_NUMERATOR_DIGITS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__POSITION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__POSSESSIVE_FORM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STYLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TEXTUAL);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSLITERATION_COUNTRY);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSLITERATION_FORMAT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSLITERATION_LANGUAGE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRANSLITERATION_STYLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TRUNCATE_ON_OVERFLOW);

		// Create enums
		calendarTypeMember1EEnum = createEEnum(CALENDAR_TYPE_MEMBER1);
		calendarTypeMember2EEnum = createEEnum(CALENDAR_TYPE_MEMBER2);
		calendarTypeMember3EEnum = createEEnum(CALENDAR_TYPE_MEMBER3);
		calendarTypeMember4EEnum = createEEnum(CALENDAR_TYPE_MEMBER4);
		calendarTypeMember5EEnum = createEEnum(CALENDAR_TYPE_MEMBER5);
		calendarTypeMember6EEnum = createEEnum(CALENDAR_TYPE_MEMBER6);
		calendarTypeMember7EEnum = createEEnum(CALENDAR_TYPE_MEMBER7);
		calendarTypeMember8EEnum = createEEnum(CALENDAR_TYPE_MEMBER8);
		formatSourceTypeEEnum = createEEnum(FORMAT_SOURCE_TYPE);
		styleTypeEEnum = createEEnum(STYLE_TYPE);
		transliterationStyleTypeEEnum = createEEnum(TRANSLITERATION_STYLE_TYPE);

		// Create data types
		calendarTypeEDataType = createEDataType(CALENDAR_TYPE);
		calendarTypeMember1ObjectEDataType = createEDataType(CALENDAR_TYPE_MEMBER1_OBJECT);
		calendarTypeMember2ObjectEDataType = createEDataType(CALENDAR_TYPE_MEMBER2_OBJECT);
		calendarTypeMember3ObjectEDataType = createEDataType(CALENDAR_TYPE_MEMBER3_OBJECT);
		calendarTypeMember4ObjectEDataType = createEDataType(CALENDAR_TYPE_MEMBER4_OBJECT);
		calendarTypeMember5ObjectEDataType = createEDataType(CALENDAR_TYPE_MEMBER5_OBJECT);
		calendarTypeMember6ObjectEDataType = createEDataType(CALENDAR_TYPE_MEMBER6_OBJECT);
		calendarTypeMember7ObjectEDataType = createEDataType(CALENDAR_TYPE_MEMBER7_OBJECT);
		calendarTypeMember8ObjectEDataType = createEDataType(CALENDAR_TYPE_MEMBER8_OBJECT);
		formatSourceTypeObjectEDataType = createEDataType(FORMAT_SOURCE_TYPE_OBJECT);
		styleTypeObjectEDataType = createEDataType(STYLE_TYPE_OBJECT);
		transliterationStyleTypeObjectEDataType = createEDataType(TRANSLITERATION_STYLE_TYPE_OBJECT);
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
		StylePackage theStylePackage = (StylePackage)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(amPmTypeEClass, AmPmType.class, "AmPmType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanStyleTypeEClass, BooleanStyleType.class, "BooleanStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanStyleType_TextProperties(), theTextPackage.getStyleTextPropertiesContent(), null, "textProperties", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanStyleType_Boolean(), this.getBooleanType(), null, "boolean", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_Text1(), theXMLTypePackage.getString(), "text1", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanStyleType_Map(), theStylePackage.getMapType(), null, "map", null, 0, -1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_Name(), theTextPackage.getStyleName(), "name", null, 1, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_Title(), theXMLTypePackage.getAnySimpleType(), "title", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_TransliterationCountry(), theTextPackage.getCountryCode(), "transliterationCountry", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_TransliterationFormat(), theTextPackage.getString(), "transliterationFormat", "1", 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_TransliterationLanguage(), theTextPackage.getCountryCode(), "transliterationLanguage", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_TransliterationStyle(), this.getTransliterationStyleType(), "transliterationStyle", "short", 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanStyleType_Volatile(), theTextPackage.getBoolean(), "volatile", null, 0, 1, BooleanStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(currencyStyleTypeEClass, CurrencyStyleType.class, "CurrencyStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrencyStyleType_TextProperties(), theTextPackage.getStyleTextPropertiesContent(), null, "textProperties", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyStyleType_Number(), this.getNumberType(), null, "number", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Text1(), theXMLTypePackage.getString(), "text1", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyStyleType_CurrencySymbol(), this.getCurrencySymbolType(), null, "currencySymbol", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Text2(), theXMLTypePackage.getString(), "text2", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyStyleType_CurrencySymbol1(), this.getCurrencySymbolType(), null, "currencySymbol1", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Text3(), theXMLTypePackage.getString(), "text3", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyStyleType_Number1(), this.getNumberType(), null, "number1", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Text4(), theXMLTypePackage.getString(), "text4", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyStyleType_Map(), theStylePackage.getMapType(), null, "map", null, 0, -1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_AutomaticOrder(), theTextPackage.getBoolean(), "automaticOrder", "false", 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Name(), theTextPackage.getStyleName(), "name", null, 1, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Title(), theXMLTypePackage.getAnySimpleType(), "title", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_TransliterationCountry(), theTextPackage.getCountryCode(), "transliterationCountry", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_TransliterationFormat(), theTextPackage.getString(), "transliterationFormat", "1", 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_TransliterationLanguage(), theTextPackage.getCountryCode(), "transliterationLanguage", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_TransliterationStyle(), this.getTransliterationStyleType(), "transliterationStyle", "short", 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyStyleType_Volatile(), theTextPackage.getBoolean(), "volatile", null, 0, 1, CurrencyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencySymbolTypeEClass, CurrencySymbolType.class, "CurrencySymbolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrencySymbolType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, CurrencySymbolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencySymbolType_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, CurrencySymbolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencySymbolType_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, CurrencySymbolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateStyleTypeEClass, DateStyleType.class, "DateStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDateStyleType_TextProperties(), theTextPackage.getStyleTextPropertiesContent(), null, "textProperties", null, 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_Day(), this.getDayType(), null, "day", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_Month(), this.getMonthType(), null, "month", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_Year(), this.getYearType(), null, "year", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_Era(), this.getEraType(), null, "era", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_DayOfWeek(), this.getDayOfWeekType(), null, "dayOfWeek", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_WeekOfYear(), this.getWeekOfYearType(), null, "weekOfYear", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_Quarter(), this.getQuarterType(), null, "quarter", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_Hours(), this.getHoursType(), null, "hours", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_AmPm(), this.getAmPmType(), null, "amPm", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_Minutes(), this.getMinutesType(), null, "minutes", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_Seconds(), this.getSecondsType(), null, "seconds", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_Text1(), theXMLTypePackage.getString(), "text1", null, 0, -1, DateStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDateStyleType_Map(), theStylePackage.getMapType(), null, "map", null, 0, -1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_AutomaticOrder(), theTextPackage.getBoolean(), "automaticOrder", "false", 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_FormatSource(), this.getFormatSourceType(), "formatSource", "fixed", 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_Name(), theTextPackage.getStyleName(), "name", null, 1, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_Title(), theXMLTypePackage.getAnySimpleType(), "title", null, 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_TransliterationCountry(), theTextPackage.getCountryCode(), "transliterationCountry", null, 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_TransliterationFormat(), theTextPackage.getString(), "transliterationFormat", "1", 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_TransliterationLanguage(), theTextPackage.getCountryCode(), "transliterationLanguage", null, 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_TransliterationStyle(), this.getTransliterationStyleType(), "transliterationStyle", "short", 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateStyleType_Volatile(), theTextPackage.getBoolean(), "volatile", null, 0, 1, DateStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dayOfWeekTypeEClass, DayOfWeekType.class, "DayOfWeekType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDayOfWeekType_Calendar(), this.getCalendarType(), "calendar", null, 0, 1, DayOfWeekType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDayOfWeekType_Style(), this.getStyleType(), "style", "short", 0, 1, DayOfWeekType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dayTypeEClass, DayType.class, "DayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDayType_Calendar(), this.getCalendarType(), "calendar", null, 0, 1, DayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDayType_Style(), this.getStyleType(), "style", "short", 0, 1, DayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddedTextTypeEClass, EmbeddedTextType.class, "EmbeddedTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbeddedTextType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, EmbeddedTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbeddedTextType_Position(), theTextPackage.getInteger(), "position", null, 1, 1, EmbeddedTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eraTypeEClass, EraType.class, "EraType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEraType_Calendar(), this.getCalendarType(), "calendar", null, 0, 1, EraType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEraType_Style(), this.getStyleType(), "style", "short", 0, 1, EraType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fractionTypeEClass, FractionType.class, "FractionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFractionType_DenominatorValue(), theTextPackage.getInteger(), "denominatorValue", null, 0, 1, FractionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFractionType_Grouping(), theTextPackage.getBoolean(), "grouping", "false", 0, 1, FractionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFractionType_MinDenominatorDigits(), theTextPackage.getInteger(), "minDenominatorDigits", null, 0, 1, FractionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFractionType_MinIntegerDigits(), theTextPackage.getInteger(), "minIntegerDigits", null, 0, 1, FractionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFractionType_MinNumeratorDigits(), theTextPackage.getInteger(), "minNumeratorDigits", null, 0, 1, FractionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hoursTypeEClass, HoursType.class, "HoursType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHoursType_Style(), this.getStyleType(), "style", "short", 0, 1, HoursType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minutesTypeEClass, MinutesType.class, "MinutesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinutesType_Style(), this.getStyleType(), "style", "short", 0, 1, MinutesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monthTypeEClass, MonthType.class, "MonthType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonthType_Calendar(), this.getCalendarType(), "calendar", null, 0, 1, MonthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonthType_PossessiveForm(), theTextPackage.getBoolean(), "possessiveForm", "false", 0, 1, MonthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonthType_Style(), this.getStyleType(), "style", "short", 0, 1, MonthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonthType_Textual(), theTextPackage.getBoolean(), "textual", "false", 0, 1, MonthType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberStyleTypeEClass, NumberStyleType.class, "NumberStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberStyleType_TextProperties(), theTextPackage.getStyleTextPropertiesContent(), null, "textProperties", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_AnyNumberGroup(), ecorePackage.getEFeatureMapEntry(), "anyNumberGroup", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberStyleType_AnyNumber(), ecorePackage.getEObject(), null, "anyNumber", null, 0, 1, NumberStyleType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_Text1(), theXMLTypePackage.getString(), "text1", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberStyleType_Map(), theStylePackage.getMapType(), null, "map", null, 0, -1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_Name(), theTextPackage.getStyleName(), "name", null, 1, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_Title(), theXMLTypePackage.getAnySimpleType(), "title", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_TransliterationCountry(), theTextPackage.getCountryCode(), "transliterationCountry", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_TransliterationFormat(), theTextPackage.getString(), "transliterationFormat", "1", 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_TransliterationLanguage(), theTextPackage.getCountryCode(), "transliterationLanguage", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_TransliterationStyle(), this.getTransliterationStyleType(), "transliterationStyle", "short", 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberStyleType_Volatile(), theTextPackage.getBoolean(), "volatile", null, 0, 1, NumberStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberTypeEClass, NumberType.class, "NumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberType_EmbeddedText(), this.getEmbeddedTextType(), null, "embeddedText", null, 0, -1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_DecimalPlaces(), theTextPackage.getInteger(), "decimalPlaces", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_DecimalReplacement(), theXMLTypePackage.getAnySimpleType(), "decimalReplacement", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_DisplayFactor(), theTextPackage.getDouble(), "displayFactor", "1", 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_Grouping(), theTextPackage.getBoolean(), "grouping", "false", 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_MinIntegerDigits(), theTextPackage.getInteger(), "minIntegerDigits", null, 0, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(percentageStyleTypeEClass, PercentageStyleType.class, "PercentageStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPercentageStyleType_TextProperties(), theTextPackage.getStyleTextPropertiesContent(), null, "textProperties", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPercentageStyleType_Number(), this.getNumberType(), null, "number", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_Text1(), theXMLTypePackage.getString(), "text1", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPercentageStyleType_Map(), theStylePackage.getMapType(), null, "map", null, 0, -1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_Name(), theTextPackage.getStyleName(), "name", null, 1, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_Title(), theXMLTypePackage.getAnySimpleType(), "title", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_TransliterationCountry(), theTextPackage.getCountryCode(), "transliterationCountry", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_TransliterationFormat(), theTextPackage.getString(), "transliterationFormat", "1", 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_TransliterationLanguage(), theTextPackage.getCountryCode(), "transliterationLanguage", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_TransliterationStyle(), this.getTransliterationStyleType(), "transliterationStyle", "short", 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPercentageStyleType_Volatile(), theTextPackage.getBoolean(), "volatile", null, 0, 1, PercentageStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quarterTypeEClass, QuarterType.class, "QuarterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuarterType_Calendar(), this.getCalendarType(), "calendar", null, 0, 1, QuarterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuarterType_Style(), this.getStyleType(), "style", "short", 0, 1, QuarterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scientificNumberTypeEClass, ScientificNumberType.class, "ScientificNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScientificNumberType_DecimalPlaces(), theTextPackage.getInteger(), "decimalPlaces", null, 0, 1, ScientificNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScientificNumberType_Grouping(), theTextPackage.getBoolean(), "grouping", "false", 0, 1, ScientificNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScientificNumberType_MinExponentDigits(), theTextPackage.getInteger(), "minExponentDigits", null, 0, 1, ScientificNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScientificNumberType_MinIntegerDigits(), theTextPackage.getInteger(), "minIntegerDigits", null, 0, 1, ScientificNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secondsTypeEClass, SecondsType.class, "SecondsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecondsType_DecimalPlaces(), theTextPackage.getInteger(), "decimalPlaces", "0", 0, 1, SecondsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondsType_Style(), this.getStyleType(), "style", "short", 0, 1, SecondsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textContentTypeEClass, TextContentType.class, "TextContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textStyleTypeEClass, TextStyleType.class, "TextStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextStyleType_TextProperties(), theTextPackage.getStyleTextPropertiesContent(), null, "textProperties", null, 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextStyleType_TextContent(), this.getTextContentType(), null, "textContent", null, 0, -1, TextStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_Text1(), theXMLTypePackage.getString(), "text1", null, 0, -1, TextStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTextStyleType_Map(), theStylePackage.getMapType(), null, "map", null, 0, -1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_Name(), theTextPackage.getStyleName(), "name", null, 1, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_Title(), theXMLTypePackage.getAnySimpleType(), "title", null, 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_TransliterationCountry(), theTextPackage.getCountryCode(), "transliterationCountry", null, 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_TransliterationFormat(), theTextPackage.getString(), "transliterationFormat", "1", 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_TransliterationLanguage(), theTextPackage.getCountryCode(), "transliterationLanguage", null, 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_TransliterationStyle(), this.getTransliterationStyleType(), "transliterationStyle", "short", 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyleType_Volatile(), theTextPackage.getBoolean(), "volatile", null, 0, 1, TextStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeStyleTypeEClass, TimeStyleType.class, "TimeStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeStyleType_TextProperties(), theTextPackage.getStyleTextPropertiesContent(), null, "textProperties", null, 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeStyleType_Hours(), this.getHoursType(), null, "hours", null, 0, -1, TimeStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTimeStyleType_AmPm(), this.getAmPmType(), null, "amPm", null, 0, -1, TimeStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTimeStyleType_Minutes(), this.getMinutesType(), null, "minutes", null, 0, -1, TimeStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTimeStyleType_Seconds(), this.getSecondsType(), null, "seconds", null, 0, -1, TimeStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_Text1(), theXMLTypePackage.getString(), "text1", null, 0, -1, TimeStyleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTimeStyleType_Map(), theStylePackage.getMapType(), null, "map", null, 0, -1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_FormatSource(), this.getFormatSourceType(), "formatSource", "fixed", 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_Name(), theTextPackage.getStyleName(), "name", null, 1, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_Title(), theXMLTypePackage.getAnySimpleType(), "title", null, 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_TransliterationCountry(), theTextPackage.getCountryCode(), "transliterationCountry", null, 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_TransliterationFormat(), theTextPackage.getString(), "transliterationFormat", "1", 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_TransliterationLanguage(), theTextPackage.getCountryCode(), "transliterationLanguage", null, 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_TransliterationStyle(), this.getTransliterationStyleType(), "transliterationStyle", "short", 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_TruncateOnOverflow(), theTextPackage.getBoolean(), "truncateOnOverflow", "true", 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStyleType_Volatile(), theTextPackage.getBoolean(), "volatile", null, 0, 1, TimeStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weekOfYearTypeEClass, WeekOfYearType.class, "WeekOfYearType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeekOfYearType_Calendar(), this.getCalendarType(), "calendar", null, 0, 1, WeekOfYearType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yearTypeEClass, YearType.class, "YearType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYearType_Calendar(), this.getCalendarType(), "calendar", null, 0, 1, YearType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYearType_Style(), this.getStyleType(), "style", "short", 0, 1, YearType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AmPm(), this.getAmPmType(), null, "amPm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Boolean(), this.getBooleanType(), null, "boolean", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BooleanStyle(), this.getBooleanStyleType(), null, "booleanStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CurrencyStyle(), this.getCurrencyStyleType(), null, "currencyStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CurrencySymbol(), this.getCurrencySymbolType(), null, "currencySymbol", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DateStyle(), this.getDateStyleType(), null, "dateStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Day(), this.getDayType(), null, "day", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DayOfWeek(), this.getDayOfWeekType(), null, "dayOfWeek", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EmbeddedText(), this.getEmbeddedTextType(), null, "embeddedText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Era(), this.getEraType(), null, "era", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Fraction(), this.getFractionType(), null, "fraction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Hours(), this.getHoursType(), null, "hours", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Minutes(), this.getMinutesType(), null, "minutes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Month(), this.getMonthType(), null, "month", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Number(), this.getNumberType(), null, "number", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NumberStyle(), this.getNumberStyleType(), null, "numberStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PercentageStyle(), this.getPercentageStyleType(), null, "percentageStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Quarter(), this.getQuarterType(), null, "quarter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ScientificNumber(), this.getScientificNumberType(), null, "scientificNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Seconds(), this.getSecondsType(), null, "seconds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Text(), theXMLTypePackage.getString(), "text", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TextContent(), this.getTextContentType(), null, "textContent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TextStyle(), this.getTextStyleType(), null, "textStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TimeStyle(), this.getTimeStyleType(), null, "timeStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WeekOfYear(), this.getWeekOfYearType(), null, "weekOfYear", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Year(), this.getYearType(), null, "year", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AutomaticOrder(), theTextPackage.getBoolean(), "automaticOrder", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Calendar(), this.getCalendarType(), "calendar", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Country(), theTextPackage.getCountryCode(), "country", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DecimalPlaces(), theTextPackage.getInteger(), "decimalPlaces", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DecimalReplacement(), theXMLTypePackage.getAnySimpleType(), "decimalReplacement", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DenominatorValue(), theTextPackage.getInteger(), "denominatorValue", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DisplayFactor(), theTextPackage.getDouble(), "displayFactor", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FormatSource(), this.getFormatSourceType(), "formatSource", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Grouping(), theTextPackage.getBoolean(), "grouping", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Language(), theTextPackage.getLanguageCode(), "language", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MinDenominatorDigits(), theTextPackage.getInteger(), "minDenominatorDigits", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MinExponentDigits(), theTextPackage.getInteger(), "minExponentDigits", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MinIntegerDigits(), theTextPackage.getInteger(), "minIntegerDigits", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MinNumeratorDigits(), theTextPackage.getInteger(), "minNumeratorDigits", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Position(), theTextPackage.getInteger(), "position", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PossessiveForm(), theTextPackage.getBoolean(), "possessiveForm", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Style(), this.getStyleType(), "style", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Textual(), theTextPackage.getBoolean(), "textual", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Title(), theXMLTypePackage.getAnySimpleType(), "title", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransliterationCountry(), theTextPackage.getCountryCode(), "transliterationCountry", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransliterationFormat(), theTextPackage.getString(), "transliterationFormat", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransliterationLanguage(), theTextPackage.getCountryCode(), "transliterationLanguage", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TransliterationStyle(), this.getTransliterationStyleType(), "transliterationStyle", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_TruncateOnOverflow(), theTextPackage.getBoolean(), "truncateOnOverflow", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(calendarTypeMember1EEnum, CalendarTypeMember1.class, "CalendarTypeMember1");
		addEEnumLiteral(calendarTypeMember1EEnum, CalendarTypeMember1.GREGORIAN);

		initEEnum(calendarTypeMember2EEnum, CalendarTypeMember2.class, "CalendarTypeMember2");
		addEEnumLiteral(calendarTypeMember2EEnum, CalendarTypeMember2.GENGOU);

		initEEnum(calendarTypeMember3EEnum, CalendarTypeMember3.class, "CalendarTypeMember3");
		addEEnumLiteral(calendarTypeMember3EEnum, CalendarTypeMember3.ROC);

		initEEnum(calendarTypeMember4EEnum, CalendarTypeMember4.class, "CalendarTypeMember4");
		addEEnumLiteral(calendarTypeMember4EEnum, CalendarTypeMember4.HANJA_YOIL);

		initEEnum(calendarTypeMember5EEnum, CalendarTypeMember5.class, "CalendarTypeMember5");
		addEEnumLiteral(calendarTypeMember5EEnum, CalendarTypeMember5.HANJA);

		initEEnum(calendarTypeMember6EEnum, CalendarTypeMember6.class, "CalendarTypeMember6");
		addEEnumLiteral(calendarTypeMember6EEnum, CalendarTypeMember6.HIJRI);

		initEEnum(calendarTypeMember7EEnum, CalendarTypeMember7.class, "CalendarTypeMember7");
		addEEnumLiteral(calendarTypeMember7EEnum, CalendarTypeMember7.JEWISH);

		initEEnum(calendarTypeMember8EEnum, CalendarTypeMember8.class, "CalendarTypeMember8");
		addEEnumLiteral(calendarTypeMember8EEnum, CalendarTypeMember8.BUDDHIST);

		initEEnum(formatSourceTypeEEnum, FormatSourceType.class, "FormatSourceType");
		addEEnumLiteral(formatSourceTypeEEnum, FormatSourceType.FIXED);
		addEEnumLiteral(formatSourceTypeEEnum, FormatSourceType.LANGUAGE);

		initEEnum(styleTypeEEnum, StyleType.class, "StyleType");
		addEEnumLiteral(styleTypeEEnum, StyleType.SHORT);
		addEEnumLiteral(styleTypeEEnum, StyleType.LONG);

		initEEnum(transliterationStyleTypeEEnum, TransliterationStyleType.class, "TransliterationStyleType");
		addEEnumLiteral(transliterationStyleTypeEEnum, TransliterationStyleType.SHORT);
		addEEnumLiteral(transliterationStyleTypeEEnum, TransliterationStyleType.MEDIUM);
		addEEnumLiteral(transliterationStyleTypeEEnum, TransliterationStyleType.LONG);

		// Initialize data types
		initEDataType(calendarTypeEDataType, Object.class, "CalendarType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calendarTypeMember1ObjectEDataType, CalendarTypeMember1.class, "CalendarTypeMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calendarTypeMember2ObjectEDataType, CalendarTypeMember2.class, "CalendarTypeMember2Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calendarTypeMember3ObjectEDataType, CalendarTypeMember3.class, "CalendarTypeMember3Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calendarTypeMember4ObjectEDataType, CalendarTypeMember4.class, "CalendarTypeMember4Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calendarTypeMember5ObjectEDataType, CalendarTypeMember5.class, "CalendarTypeMember5Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calendarTypeMember6ObjectEDataType, CalendarTypeMember6.class, "CalendarTypeMember6Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calendarTypeMember7ObjectEDataType, CalendarTypeMember7.class, "CalendarTypeMember7Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calendarTypeMember8ObjectEDataType, CalendarTypeMember8.class, "CalendarTypeMember8Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(formatSourceTypeObjectEDataType, FormatSourceType.class, "FormatSourceTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleTypeObjectEDataType, StyleType.class, "StyleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transliterationStyleTypeObjectEDataType, TransliterationStyleType.class, "TransliterationStyleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (amPmTypeEClass, 
		   source, 
		   new String[] {
			 "name", "am-pm_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (booleanStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "boolean-style_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBooleanStyleType_TextProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-properties",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getBooleanStyleType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_Boolean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_Text1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getBooleanStyleType_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getBooleanStyleType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_TransliterationCountry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_TransliterationFormat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_TransliterationLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_TransliterationStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBooleanStyleType_Volatile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "volatile",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "boolean_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (calendarTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "calendar_._type",
			 "memberTypes", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#string calendar_._type_._member_._1 calendar_._type_._member_._2 calendar_._type_._member_._3 calendar_._type_._member_._4 calendar_._type_._member_._5 calendar_._type_._member_._6 calendar_._type_._member_._7 calendar_._type_._member_._8"
		   });		
		addAnnotation
		  (calendarTypeMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._1"
		   });		
		addAnnotation
		  (calendarTypeMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._1:Object",
			 "baseType", "calendar_._type_._member_._1"
		   });		
		addAnnotation
		  (calendarTypeMember2EEnum, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._2"
		   });		
		addAnnotation
		  (calendarTypeMember2ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._2:Object",
			 "baseType", "calendar_._type_._member_._2"
		   });		
		addAnnotation
		  (calendarTypeMember3EEnum, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._3"
		   });		
		addAnnotation
		  (calendarTypeMember3ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._3:Object",
			 "baseType", "calendar_._type_._member_._3"
		   });		
		addAnnotation
		  (calendarTypeMember4EEnum, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._4"
		   });		
		addAnnotation
		  (calendarTypeMember4ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._4:Object",
			 "baseType", "calendar_._type_._member_._4"
		   });		
		addAnnotation
		  (calendarTypeMember5EEnum, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._5"
		   });		
		addAnnotation
		  (calendarTypeMember5ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._5:Object",
			 "baseType", "calendar_._type_._member_._5"
		   });		
		addAnnotation
		  (calendarTypeMember6EEnum, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._6"
		   });		
		addAnnotation
		  (calendarTypeMember6ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._6:Object",
			 "baseType", "calendar_._type_._member_._6"
		   });		
		addAnnotation
		  (calendarTypeMember7EEnum, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._7"
		   });		
		addAnnotation
		  (calendarTypeMember7ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._7:Object",
			 "baseType", "calendar_._type_._member_._7"
		   });		
		addAnnotation
		  (calendarTypeMember8EEnum, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._8"
		   });		
		addAnnotation
		  (calendarTypeMember8ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "calendar_._type_._member_._8:Object",
			 "baseType", "calendar_._type_._member_._8"
		   });		
		addAnnotation
		  (currencyStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "currency-style_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCurrencyStyleType_TextProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-properties",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Text1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_CurrencySymbol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency-symbol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Text2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_CurrencySymbol1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency-symbol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Text3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Number1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Text4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getCurrencyStyleType_AutomaticOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "automatic-order",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_TransliterationCountry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_TransliterationFormat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_TransliterationLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_TransliterationStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencyStyleType_Volatile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "volatile",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (currencySymbolTypeEClass, 
		   source, 
		   new String[] {
			 "name", "currency-symbol_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getCurrencySymbolType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getCurrencySymbolType_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCurrencySymbolType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dateStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "date-style_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDateStyleType_TextProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-properties",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getDateStyleType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Day(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "day",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Month(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "month",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Year(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Era(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "era",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_DayOfWeek(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "day-of-week",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_WeekOfYear(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "week-of-year",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Quarter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "quarter",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Hours(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hours",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_AmPm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "am-pm",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Minutes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "minutes",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Seconds(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "seconds",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Text1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getDateStyleType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getDateStyleType_AutomaticOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "automatic-order",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_FormatSource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format-source",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getDateStyleType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_TransliterationCountry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_TransliterationFormat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_TransliterationLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_TransliterationStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDateStyleType_Volatile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "volatile",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (dayOfWeekTypeEClass, 
		   source, 
		   new String[] {
			 "name", "day-of-week_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDayOfWeekType_Calendar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calendar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDayOfWeekType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dayTypeEClass, 
		   source, 
		   new String[] {
			 "name", "day_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDayType_Calendar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calendar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDayType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (embeddedTextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "embedded-text_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getEmbeddedTextType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getEmbeddedTextType_Position(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "position",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (eraTypeEClass, 
		   source, 
		   new String[] {
			 "name", "era_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEraType_Calendar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calendar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEraType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (formatSourceTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "format-source_._type"
		   });		
		addAnnotation
		  (formatSourceTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "format-source_._type:Object",
			 "baseType", "format-source_._type"
		   });		
		addAnnotation
		  (fractionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "fraction_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFractionType_DenominatorValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "denominator-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFractionType_Grouping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "grouping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFractionType_MinDenominatorDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-denominator-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFractionType_MinIntegerDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-integer-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFractionType_MinNumeratorDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-numerator-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (hoursTypeEClass, 
		   source, 
		   new String[] {
			 "name", "hours_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getHoursType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (minutesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "minutes_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMinutesType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (monthTypeEClass, 
		   source, 
		   new String[] {
			 "name", "month_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMonthType_Calendar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calendar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMonthType_PossessiveForm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "possessive-form",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMonthType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMonthType_Textual(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "textual",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (numberStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "number-style_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNumberStyleType_TextProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-properties",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getNumberStyleType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberStyleType_AnyNumberGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "any-number:group",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0"
		   });		
		addAnnotation
		  (getNumberStyleType_AnyNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "any-number",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:text:1.0",
			 "group", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#any-number:group"
		   });		
		addAnnotation
		  (getNumberStyleType_Text1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberStyleType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getNumberStyleType_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberStyleType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberStyleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getNumberStyleType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberStyleType_TransliterationCountry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberStyleType_TransliterationFormat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberStyleType_TransliterationLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberStyleType_TransliterationStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberStyleType_Volatile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "volatile",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (numberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "number_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNumberType_EmbeddedText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "embedded-text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberType_DecimalPlaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decimal-places",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberType_DecimalReplacement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decimal-replacement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberType_DisplayFactor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display-factor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberType_Grouping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "grouping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberType_MinIntegerDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-integer-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (percentageStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "percentage-style_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPercentageStyleType_TextProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-properties",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getPercentageStyleType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_Text1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getPercentageStyleType_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getPercentageStyleType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_TransliterationCountry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_TransliterationFormat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_TransliterationLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_TransliterationStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPercentageStyleType_Volatile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "volatile",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (quarterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "quarter_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getQuarterType_Calendar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calendar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getQuarterType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (scientificNumberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "scientific-number_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getScientificNumberType_DecimalPlaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decimal-places",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScientificNumberType_Grouping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "grouping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScientificNumberType_MinExponentDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-exponent-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScientificNumberType_MinIntegerDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-integer-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (secondsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "seconds_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSecondsType_DecimalPlaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decimal-places",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSecondsType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (styleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "style_._type"
		   });		
		addAnnotation
		  (styleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "style_._type:Object",
			 "baseType", "style_._type"
		   });		
		addAnnotation
		  (textContentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "text-content_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (textStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "text-style_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTextStyleType_TextProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-properties",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getTextStyleType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextStyleType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:2"
		   });		
		addAnnotation
		  (getTextStyleType_TextContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-content",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getTextStyleType_Text1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getTextStyleType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getTextStyleType_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextStyleType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextStyleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getTextStyleType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextStyleType_TransliterationCountry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextStyleType_TransliterationFormat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextStyleType_TransliterationLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextStyleType_TransliterationStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTextStyleType_Volatile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "volatile",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (timeStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "time-style_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTimeStyleType_TextProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-properties",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getTimeStyleType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:2"
		   });		
		addAnnotation
		  (getTimeStyleType_Hours(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hours",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getTimeStyleType_AmPm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "am-pm",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getTimeStyleType_Minutes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "minutes",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getTimeStyleType_Seconds(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "seconds",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getTimeStyleType_Text1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace",
			 "group", "#group:2"
		   });		
		addAnnotation
		  (getTimeStyleType_Map(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "map",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getTimeStyleType_Country(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_FormatSource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format-source",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (getTimeStyleType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_TransliterationCountry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_TransliterationFormat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_TransliterationLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_TransliterationStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_TruncateOnOverflow(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "truncate-on-overflow",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeStyleType_Volatile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "volatile",
			 "namespace", "urn:oasis:names:tc:opendocument:xmlns:style:1.0"
		   });		
		addAnnotation
		  (transliterationStyleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "transliteration-style_._type"
		   });		
		addAnnotation
		  (transliterationStyleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "transliteration-style_._type:Object",
			 "baseType", "transliteration-style_._type"
		   });		
		addAnnotation
		  (weekOfYearTypeEClass, 
		   source, 
		   new String[] {
			 "name", "week-of-year_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getWeekOfYearType_Calendar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calendar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (yearTypeEClass, 
		   source, 
		   new String[] {
			 "name", "year_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getYearType_Calendar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calendar",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getYearType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
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
		  (getDocumentRoot_AmPm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "am-pm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Boolean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BooleanStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CurrencyStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CurrencySymbol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency-symbol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DateStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Day(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "day",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DayOfWeek(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "day-of-week",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EmbeddedText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "embedded-text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Era(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "era",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Fraction(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fraction",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#any-number"
		   });		
		addAnnotation
		  (getDocumentRoot_Hours(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hours",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Minutes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "minutes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Month(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "month",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#any-number"
		   });		
		addAnnotation
		  (getDocumentRoot_NumberStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PercentageStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "percentage-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Quarter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "quarter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ScientificNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scientific-number",
			 "namespace", "##targetNamespace",
			 "affiliation", "urn:oasis:names:tc:opendocument:xmlns:text:1.0#any-number"
		   });		
		addAnnotation
		  (getDocumentRoot_Seconds(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "seconds",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-content",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TextStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TimeStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_WeekOfYear(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "week-of-year",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Year(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AutomaticOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "automatic-order",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Calendar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "calendar",
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
		  (getDocumentRoot_DecimalPlaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decimal-places",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DecimalReplacement(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decimal-replacement",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DenominatorValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "denominator-value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DisplayFactor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display-factor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FormatSource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format-source",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Grouping(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "grouping",
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
		  (getDocumentRoot_MinDenominatorDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-denominator-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MinExponentDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-exponent-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MinIntegerDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-integer-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_MinNumeratorDigits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min-numerator-digits",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Position(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "position",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PossessiveForm(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "possessive-form",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Textual(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "textual",
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
		  (getDocumentRoot_TransliterationCountry(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransliterationFormat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransliterationLanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-language",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TransliterationStyle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "transliteration-style",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TruncateOnOverflow(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "truncate-on-overflow",
			 "namespace", "##targetNamespace"
		   });
	}

} //DatastylePackageImpl
