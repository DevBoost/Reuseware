/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
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
import org.oasisopen.names.tc.opendocument.xmlns.form.FormFactory;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.form.util.FormValidator;
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
public class FormPackageImpl extends EPackageImpl implements FormPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "form.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkboxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboboxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formattedTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericControlTypeEClass = null;

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
	private EClass hiddenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageFrameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listboxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listValueType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

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
	private EClass numberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textareaTypeEClass = null;

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
	private EClass timeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commandTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imageAlignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imagePositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listSourceTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodTypeMember2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visualEffectTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commandTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datasourceTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageAlignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imagePositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listSourceTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodTypeMember2ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orientationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textStyleNameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textStyleNameTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visualEffectTypeObjectEDataType = null;

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
	 * @see org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormPackageImpl() {
		super(eNS_URI, FormFactory.eINSTANCE);
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
	 * @generated
	 */
	public static FormPackage init() {
		if (isInited) return (FormPackage)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);

		// Obtain or create and register package
		FormPackageImpl theFormPackage = (FormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof FormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new FormPackageImpl());

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
		theFormPackage.loadPackage();
		theDrawingPackage.loadPackage();
		theTextPackage.loadPackage();
		theStylePackage.loadPackage();
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
		theFormPackage.fixPackageContents();
		theDrawingPackage.fixPackageContents();
		theTextPackage.fixPackageContents();
		theStylePackage.fixPackageContents();
		theTablePackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFormPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FormValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFormPackage.freeze();

		return theFormPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonType() {
		if (buttonTypeEClass == null) {
			buttonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(0);
		}
		return buttonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Bind() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_ButtonType() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_ControlImplementation() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_DefaultButton() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Disabled() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_FocusOnClick() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Href() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Id() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_ImageAlign() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_ImageData() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_ImagePosition() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Label() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Name() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Printable() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_TabIndex() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_TabStop() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_TargetFrame() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Title() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Toggle() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_Value() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonType_XformsSubmission() {
        return (EAttribute)getButtonType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckboxType() {
		if (checkboxTypeEClass == null) {
			checkboxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(1);
		}
		return checkboxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_Bind() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_ControlImplementation() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_CurrentState() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_DataField() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_Disabled() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_Id() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_ImageAlign() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_ImagePosition() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_IsTristate() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_Label() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_Name() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_Printable() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_State() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_TabIndex() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_TabStop() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_Title() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_Value() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckboxType_VisualEffect() {
        return (EAttribute)getCheckboxType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnType() {
		if (columnTypeEClass == null) {
			columnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(2);
		}
		return columnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_ColumnControlsGroup() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnType_ColumnControls() {
        return (EReference)getColumnType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_ControlImplementation() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_Label() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_Name() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnType_TextStyleName() {
        return (EAttribute)getColumnType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboboxType() {
		if (comboboxTypeEClass == null) {
			comboboxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(3);
		}
		return comboboxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComboboxType_Item() {
        return (EReference)getComboboxType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_AutoComplete() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Bind() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_ControlImplementation() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_ConvertEmptyToNull() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_CurrentValue() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_DataField() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Disabled() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Dropdown() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Id() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_ListSource() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_ListSourceType() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_MaxLength() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Name() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Printable() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Readonly() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Size() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_TabIndex() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_TabStop() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Title() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComboboxType_Value() {
        return (EAttribute)getComboboxType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionResourceType() {
		if (connectionResourceTypeEClass == null) {
			connectionResourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(6);
		}
		return connectionResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionResourceType_Href() {
        return (EAttribute)getConnectionResourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateType() {
		if (dateTypeEClass == null) {
			dateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(8);
		}
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Bind() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_ControlImplementation() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_ConvertEmptyToNull() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_CurrentValue() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_DataField() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Disabled() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Id() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_MaxLength() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_MaxValue() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_MinValue() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Name() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Printable() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Readonly() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_TabIndex() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_TabStop() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Title() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Value() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileType() {
		if (fileTypeEClass == null) {
			fileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(9);
		}
		return fileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Bind() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_ControlImplementation() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_CurrentValue() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Disabled() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Id() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_MaxLength() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Name() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Printable() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Readonly() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_TabIndex() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_TabStop() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Title() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_Value() {
        return (EAttribute)getFileType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedTextType() {
		if (fixedTextTypeEClass == null) {
			fixedTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(10);
		}
		return fixedTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_Bind() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_ControlImplementation() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_Disabled() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_For() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_Id() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_Label() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_MultiLine() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_Name() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_Printable() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTextType_Title() {
        return (EAttribute)getFixedTextType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormattedTextType() {
		if (formattedTextTypeEClass == null) {
			formattedTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(11);
		}
		return formattedTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_Bind() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_ControlImplementation() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_ConvertEmptyToNull() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_CurrentValue() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_DataField() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_Disabled() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_Id() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_MaxLength() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_MaxValue() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_MinValue() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_Name() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_Printable() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_Readonly() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_TabIndex() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_TabStop() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_Title() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_Validation() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormattedTextType_Value() {
        return (EAttribute)getFormattedTextType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormType() {
		if (formTypeEClass == null) {
			formTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(12);
		}
		return formTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormType_Properties() {
        return (EReference)getFormType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormType_EventListeners() {
        return (EReference)getFormType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Group() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_ControlsGroup() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormType_Controls() {
        return (EReference)getFormType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormType_Form() {
        return (EReference)getFormType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormType_ConnectionResource() {
        return (EReference)getFormType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Actuate() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_AllowDeletes() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_AllowInserts() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_AllowUpdates() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_ApplyFilter() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Command() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_CommandType() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_ControlImplementation() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Datasource() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_DetailFields() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Enctype() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_EscapeProcessing() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Filter() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Href() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_IgnoreResult() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_MasterFields() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Method() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Name() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_NavigationMode() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Order() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_TabCycle() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_TargetFrame() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormType_Type() {
        return (EAttribute)getFormType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrameType() {
		if (frameTypeEClass == null) {
			frameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(13);
		}
		return frameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Bind() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_ControlImplementation() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Disabled() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_For() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Id() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Label() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Name() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Printable() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameType_Title() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericControlType() {
		if (genericControlTypeEClass == null) {
			genericControlTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(14);
		}
		return genericControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericControlType_Bind() {
        return (EAttribute)getGenericControlType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericControlType_ControlImplementation() {
        return (EAttribute)getGenericControlType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericControlType_Id() {
        return (EAttribute)getGenericControlType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericControlType_Name() {
        return (EAttribute)getGenericControlType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridType() {
		if (gridTypeEClass == null) {
			gridTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(15);
		}
		return gridTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridType_Column() {
        return (EReference)getGridType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_Bind() {
        return (EAttribute)getGridType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_ControlImplementation() {
        return (EAttribute)getGridType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_Disabled() {
        return (EAttribute)getGridType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_Id() {
        return (EAttribute)getGridType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_Name() {
        return (EAttribute)getGridType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_Printable() {
        return (EAttribute)getGridType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_TabIndex() {
        return (EAttribute)getGridType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_TabStop() {
        return (EAttribute)getGridType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridType_Title() {
        return (EAttribute)getGridType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHiddenType() {
		if (hiddenTypeEClass == null) {
			hiddenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(16);
		}
		return hiddenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenType_Bind() {
        return (EAttribute)getHiddenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenType_ControlImplementation() {
        return (EAttribute)getHiddenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenType_Id() {
        return (EAttribute)getHiddenType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenType_Name() {
        return (EAttribute)getHiddenType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHiddenType_Value() {
        return (EAttribute)getHiddenType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageFrameType() {
		if (imageFrameTypeEClass == null) {
			imageFrameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(19);
		}
		return imageFrameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_Bind() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_ControlImplementation() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_DataField() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_Disabled() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_Id() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_ImageData() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_Name() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_Printable() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_Readonly() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageFrameType_Title() {
        return (EAttribute)getImageFrameType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageType() {
		if (imageTypeEClass == null) {
			imageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(22);
		}
		return imageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Bind() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_ButtonType() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_ControlImplementation() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Disabled() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Href() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Id() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_ImageData() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Name() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Printable() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_TabIndex() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_TabStop() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_TargetFrame() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Title() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageType_Value() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		if (itemTypeEClass == null) {
			itemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(23);
		}
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Mixed() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Label() {
        return (EAttribute)getItemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListboxType() {
		if (listboxTypeEClass == null) {
			listboxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(24);
		}
		return listboxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListboxType_Option() {
        return (EReference)getListboxType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_Bind() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_BoundColumn() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_ControlImplementation() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_DataField() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_Disabled() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_Dropdown() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_Id() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_ListSource() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_ListSourceType() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_Multiple() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_Name() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_Printable() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_Size() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_TabIndex() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_TabStop() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_Title() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListboxType_XformsListSource() {
        return (EAttribute)getListboxType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListPropertyType() {
		if (listPropertyTypeEClass == null) {
			listPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(25);
		}
		return listPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListPropertyType_PropertyName() {
        return (EAttribute)getListPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListValueType() {
		if (listValueTypeEClass == null) {
			listValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(28);
		}
		return listValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListValueType_DateValue() {
        return (EAttribute)getListValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListValueType1() {
		if (listValueType1EClass == null) {
			listValueType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(29);
		}
		return listValueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListValueType1_BooleanValue() {
        return (EAttribute)getListValueType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListValueType2() {
		if (listValueType2EClass == null) {
			listValueType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(30);
		}
		return listValueType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListValueType2_StringValue() {
        return (EAttribute)getListValueType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListValueType3() {
		if (listValueType3EClass == null) {
			listValueType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(31);
		}
		return listValueType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListValueType3_TimeValue() {
        return (EAttribute)getListValueType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListValueType4() {
		if (listValueType4EClass == null) {
			listValueType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(32);
		}
		return listValueType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListValueType4_Currency() {
        return (EAttribute)getListValueType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListValueType4_Value() {
        return (EAttribute)getListValueType4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListValueType5() {
		if (listValueType5EClass == null) {
			listValueType5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(33);
		}
		return listValueType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListValueType5_Value() {
        return (EAttribute)getListValueType5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesType() {
		if (propertiesTypeEClass == null) {
			propertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(39);
		}
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesType_FormPropertyGroup() {
        return (EAttribute)getPropertiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesType_FormProperty() {
        return (EReference)getPropertiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(40);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Button() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Checkbox() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Column() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Combobox() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConnectionResource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Date() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_File() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FixedText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Form() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FormattedText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Frame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenericControl() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Grid() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Hidden() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Image() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImageFrame() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Item() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Listbox() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListProperty() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Number() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Option() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Password() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Properties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Property() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Radio() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Text() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Textarea() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Time() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AllowDeletes() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AllowInserts() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AllowUpdates() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApplyDesignMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ApplyFilter() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AutoComplete() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AutomaticFocus() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_BoundColumn() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ButtonType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Command() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CommandType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ControlImplementation() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ConvertEmptyToNull() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CurrentSelected() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CurrentState() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DataField() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Datasource() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DefaultButton() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DelayForRepeat() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DetailFields() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Disabled() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Dropdown() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EchoChar() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Enctype() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_EscapeProcessing() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Filter() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FocusOnClick() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_For() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Id() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IgnoreResult() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImageAlign() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImageData() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ImagePosition() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_IsTristate() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Label() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ListSource() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ListSourceType() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MasterFields() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MaxLength() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Method() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MultiLine() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Multiple() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Name() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_NavigationMode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Order() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Orientation() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PageStepSize() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Printable() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PropertyName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Readonly() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Selected() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Size() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_State() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StepSize() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TabCycle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TabIndex() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TabStop() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_TextStyleName() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Title() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Toggle() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Validation() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_VisualEffect() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_XformsListSource() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_XformsSubmission() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberType() {
		if (numberTypeEClass == null) {
			numberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(41);
		}
		return numberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Bind() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_ControlImplementation() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_ConvertEmptyToNull() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_CurrentValue() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_DataField() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Disabled() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Id() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_MaxLength() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_MaxValue() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_MinValue() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Name() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Printable() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Readonly() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_TabIndex() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_TabStop() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Title() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Value() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionType() {
		if (optionTypeEClass == null) {
			optionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(42);
		}
		return optionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionType_Mixed() {
        return (EAttribute)getOptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionType_CurrentSelected() {
        return (EAttribute)getOptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionType_Label() {
        return (EAttribute)getOptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionType_Selected() {
        return (EAttribute)getOptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionType_Value() {
        return (EAttribute)getOptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPasswordType() {
		if (passwordTypeEClass == null) {
			passwordTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(45);
		}
		return passwordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_Bind() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_ControlImplementation() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_ConvertEmptyToNull() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_Disabled() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_EchoChar() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_Id() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_MaxLength() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_Name() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_Printable() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_TabIndex() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_TabStop() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_Title() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordType_Value() {
        return (EAttribute)getPasswordType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(46);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_BooleanValue() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Currency() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_DateValue() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_PropertyName() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_StringValue() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_TimeValue() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Value() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_ValueType() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioType() {
		if (radioTypeEClass == null) {
			radioTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(47);
		}
		return radioTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_Bind() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_ControlImplementation() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_CurrentSelected() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_DataField() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_Disabled() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_Id() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_ImageAlign() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_ImagePosition() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_Label() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_Name() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_Printable() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_Selected() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_TabIndex() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_TabStop() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_Title() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_Value() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadioType_VisualEffect() {
        return (EAttribute)getRadioType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextareaType() {
		if (textareaTypeEClass == null) {
			textareaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(48);
		}
		return textareaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextareaType_P() {
        return (EReference)getTextareaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_Bind() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_ControlImplementation() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_ConvertEmptyToNull() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_CurrentValue() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_DataField() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_Disabled() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_Id() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_MaxLength() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_Name() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_Printable() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_Readonly() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_TabIndex() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_TabStop() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_Title() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextareaType_Value() {
        return (EAttribute)getTextareaType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextType() {
		if (textTypeEClass == null) {
			textTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(51);
		}
		return textTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Bind() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_ControlImplementation() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_ConvertEmptyToNull() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_CurrentValue() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_DataField() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Disabled() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Id() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_MaxLength() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Name() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Printable() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Readonly() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_TabIndex() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_TabStop() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Title() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextType_Value() {
        return (EAttribute)getTextType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeType() {
		if (timeTypeEClass == null) {
			timeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(52);
		}
		return timeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Bind() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_ControlImplementation() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_ConvertEmptyToNull() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_CurrentValue() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_DataField() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Disabled() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Id() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_MaxLength() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_MaxValue() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_MinValue() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Name() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Printable() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Readonly() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_TabIndex() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_TabStop() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Title() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Value() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRangeType() {
		if (valueRangeTypeEClass == null) {
			valueRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(53);
		}
		return valueRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_Bind() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_ControlImplementation() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_DelayForRepeat() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_Disabled() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_Id() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_MaxValue() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_MinValue() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_Name() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_Orientation() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_PageStepSize() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_Printable() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_StepSize() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_TabIndex() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_TabStop() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_Title() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_Value() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommandTypeType() {
		if (commandTypeTypeEEnum == null) {
			commandTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(4);
		}
		return commandTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImageAlignType() {
		if (imageAlignTypeEEnum == null) {
			imageAlignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(17);
		}
		return imageAlignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImagePositionType() {
		if (imagePositionTypeEEnum == null) {
			imagePositionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(20);
		}
		return imagePositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListSourceTypeType() {
		if (listSourceTypeTypeEEnum == null) {
			listSourceTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(26);
		}
		return listSourceTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethodTypeMember1() {
		if (methodTypeMember1EEnum == null) {
			methodTypeMember1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(35);
		}
		return methodTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethodTypeMember2() {
		if (methodTypeMember2EEnum == null) {
			methodTypeMember2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(37);
		}
		return methodTypeMember2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientationType() {
		if (orientationTypeEEnum == null) {
			orientationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(43);
		}
		return orientationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisualEffectType() {
		if (visualEffectTypeEEnum == null) {
			visualEffectTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(54);
		}
		return visualEffectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommandTypeTypeObject() {
		if (commandTypeTypeObjectEDataType == null) {
			commandTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(5);
		}
		return commandTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatasourceType() {
		if (datasourceTypeEDataType == null) {
			datasourceTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(7);
		}
		return datasourceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImageAlignTypeObject() {
		if (imageAlignTypeObjectEDataType == null) {
			imageAlignTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(18);
		}
		return imageAlignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImagePositionTypeObject() {
		if (imagePositionTypeObjectEDataType == null) {
			imagePositionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(21);
		}
		return imagePositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListSourceTypeTypeObject() {
		if (listSourceTypeTypeObjectEDataType == null) {
			listSourceTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(27);
		}
		return listSourceTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodType() {
		if (methodTypeEDataType == null) {
			methodTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(34);
		}
		return methodTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodTypeMember1Object() {
		if (methodTypeMember1ObjectEDataType == null) {
			methodTypeMember1ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(36);
		}
		return methodTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethodTypeMember2Object() {
		if (methodTypeMember2ObjectEDataType == null) {
			methodTypeMember2ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(38);
		}
		return methodTypeMember2ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrientationTypeObject() {
		if (orientationTypeObjectEDataType == null) {
			orientationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(44);
		}
		return orientationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextStyleNameType() {
		if (textStyleNameTypeEDataType == null) {
			textStyleNameTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(49);
		}
		return textStyleNameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTextStyleNameTypeMember1() {
		if (textStyleNameTypeMember1EDataType == null) {
			textStyleNameTypeMember1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(50);
		}
		return textStyleNameTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisualEffectTypeObject() {
		if (visualEffectTypeObjectEDataType == null) {
			visualEffectTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI).getEClassifiers().get(55);
		}
		return visualEffectTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormFactory getFormFactory() {
		return (FormFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.oasisopen.names.tc.opendocument.xmlns.form." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //FormPackageImpl
