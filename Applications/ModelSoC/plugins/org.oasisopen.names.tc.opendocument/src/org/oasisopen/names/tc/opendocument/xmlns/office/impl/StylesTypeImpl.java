/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.BooleanStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DateStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.PercentageStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TextStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TimeStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.FillImageType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.GradientType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.HatchType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.MarkerType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.OpacityType;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.StrokeDashType1;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.office.StylesType;
import org.oasisopen.names.tc.opendocument.xmlns.style.PresentationPageLayoutType;
import org.oasisopen.names.tc.opendocument.xmlns.style.StyleType1;
import org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.RadialGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.text.BibliographyConfigurationType;
import org.oasisopen.names.tc.opendocument.xmlns.text.LinenumberingConfigurationType;
import org.oasisopen.names.tc.opendocument.xmlns.text.ListStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.OutlineStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextNotesConfigurationContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Styles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getListStyle <em>List Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getNumberStyle <em>Number Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getCurrencyStyle <em>Currency Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getPercentageStyle <em>Percentage Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getDateStyle <em>Date Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getTimeStyle <em>Time Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getBooleanStyle <em>Boolean Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getDefaultStyle <em>Default Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getOutlineStyle <em>Outline Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getNotesConfiguration <em>Notes Configuration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getBibliographyConfiguration <em>Bibliography Configuration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getLinenumberingConfiguration <em>Linenumbering Configuration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getLinearGradient <em>Linear Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getRadialGradient <em>Radial Gradient</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getHatch <em>Hatch</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getFillImage <em>Fill Image</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getStrokeDash <em>Stroke Dash</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.StylesTypeImpl#getPresentationPageLayout <em>Presentation Page Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StylesTypeImpl extends EObjectImpl implements StylesType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StylesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.STYLES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, OfficePackage.STYLES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleType1> getStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListStyleType> getListStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__LIST_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberStyleType> getNumberStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__NUMBER_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrencyStyleType> getCurrencyStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__CURRENCY_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PercentageStyleType> getPercentageStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__PERCENTAGE_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateStyleType> getDateStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__DATE_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeStyleType> getTimeStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__TIME_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanStyleType> getBooleanStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__BOOLEAN_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextStyleType> getTextStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__TEXT_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleStyleContent> getDefaultStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__DEFAULT_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutlineStyleType> getOutlineStyle() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__OUTLINE_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextNotesConfigurationContent> getNotesConfiguration() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__NOTES_CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BibliographyConfigurationType> getBibliographyConfiguration() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__BIBLIOGRAPHY_CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinenumberingConfigurationType> getLinenumberingConfiguration() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__LINENUMBERING_CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GradientType> getGradient() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__GRADIENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinearGradientType> getLinearGradient() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__LINEAR_GRADIENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RadialGradientType> getRadialGradient() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__RADIAL_GRADIENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HatchType> getHatch() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__HATCH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FillImageType> getFillImage() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__FILL_IMAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarkerType> getMarker() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__MARKER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrokeDashType1> getStrokeDash() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__STROKE_DASH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpacityType> getOpacity() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__OPACITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PresentationPageLayoutType> getPresentationPageLayout() {
		return getGroup().list(OfficePackage.Literals.STYLES_TYPE__PRESENTATION_PAGE_LAYOUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.STYLES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__LIST_STYLE:
				return ((InternalEList<?>)getListStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__NUMBER_STYLE:
				return ((InternalEList<?>)getNumberStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__CURRENCY_STYLE:
				return ((InternalEList<?>)getCurrencyStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__PERCENTAGE_STYLE:
				return ((InternalEList<?>)getPercentageStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__DATE_STYLE:
				return ((InternalEList<?>)getDateStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__TIME_STYLE:
				return ((InternalEList<?>)getTimeStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__BOOLEAN_STYLE:
				return ((InternalEList<?>)getBooleanStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__TEXT_STYLE:
				return ((InternalEList<?>)getTextStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__DEFAULT_STYLE:
				return ((InternalEList<?>)getDefaultStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__OUTLINE_STYLE:
				return ((InternalEList<?>)getOutlineStyle()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__NOTES_CONFIGURATION:
				return ((InternalEList<?>)getNotesConfiguration()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__BIBLIOGRAPHY_CONFIGURATION:
				return ((InternalEList<?>)getBibliographyConfiguration()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__LINENUMBERING_CONFIGURATION:
				return ((InternalEList<?>)getLinenumberingConfiguration()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__GRADIENT:
				return ((InternalEList<?>)getGradient()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__LINEAR_GRADIENT:
				return ((InternalEList<?>)getLinearGradient()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__RADIAL_GRADIENT:
				return ((InternalEList<?>)getRadialGradient()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__HATCH:
				return ((InternalEList<?>)getHatch()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__FILL_IMAGE:
				return ((InternalEList<?>)getFillImage()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__MARKER:
				return ((InternalEList<?>)getMarker()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__STROKE_DASH:
				return ((InternalEList<?>)getStrokeDash()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__OPACITY:
				return ((InternalEList<?>)getOpacity()).basicRemove(otherEnd, msgs);
			case OfficePackage.STYLES_TYPE__PRESENTATION_PAGE_LAYOUT:
				return ((InternalEList<?>)getPresentationPageLayout()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OfficePackage.STYLES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case OfficePackage.STYLES_TYPE__STYLE:
				return getStyle();
			case OfficePackage.STYLES_TYPE__LIST_STYLE:
				return getListStyle();
			case OfficePackage.STYLES_TYPE__NUMBER_STYLE:
				return getNumberStyle();
			case OfficePackage.STYLES_TYPE__CURRENCY_STYLE:
				return getCurrencyStyle();
			case OfficePackage.STYLES_TYPE__PERCENTAGE_STYLE:
				return getPercentageStyle();
			case OfficePackage.STYLES_TYPE__DATE_STYLE:
				return getDateStyle();
			case OfficePackage.STYLES_TYPE__TIME_STYLE:
				return getTimeStyle();
			case OfficePackage.STYLES_TYPE__BOOLEAN_STYLE:
				return getBooleanStyle();
			case OfficePackage.STYLES_TYPE__TEXT_STYLE:
				return getTextStyle();
			case OfficePackage.STYLES_TYPE__DEFAULT_STYLE:
				return getDefaultStyle();
			case OfficePackage.STYLES_TYPE__OUTLINE_STYLE:
				return getOutlineStyle();
			case OfficePackage.STYLES_TYPE__NOTES_CONFIGURATION:
				return getNotesConfiguration();
			case OfficePackage.STYLES_TYPE__BIBLIOGRAPHY_CONFIGURATION:
				return getBibliographyConfiguration();
			case OfficePackage.STYLES_TYPE__LINENUMBERING_CONFIGURATION:
				return getLinenumberingConfiguration();
			case OfficePackage.STYLES_TYPE__GRADIENT:
				return getGradient();
			case OfficePackage.STYLES_TYPE__LINEAR_GRADIENT:
				return getLinearGradient();
			case OfficePackage.STYLES_TYPE__RADIAL_GRADIENT:
				return getRadialGradient();
			case OfficePackage.STYLES_TYPE__HATCH:
				return getHatch();
			case OfficePackage.STYLES_TYPE__FILL_IMAGE:
				return getFillImage();
			case OfficePackage.STYLES_TYPE__MARKER:
				return getMarker();
			case OfficePackage.STYLES_TYPE__STROKE_DASH:
				return getStrokeDash();
			case OfficePackage.STYLES_TYPE__OPACITY:
				return getOpacity();
			case OfficePackage.STYLES_TYPE__PRESENTATION_PAGE_LAYOUT:
				return getPresentationPageLayout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OfficePackage.STYLES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case OfficePackage.STYLES_TYPE__STYLE:
				getStyle().clear();
				getStyle().addAll((Collection<? extends StyleType1>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__LIST_STYLE:
				getListStyle().clear();
				getListStyle().addAll((Collection<? extends ListStyleType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__NUMBER_STYLE:
				getNumberStyle().clear();
				getNumberStyle().addAll((Collection<? extends NumberStyleType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__CURRENCY_STYLE:
				getCurrencyStyle().clear();
				getCurrencyStyle().addAll((Collection<? extends CurrencyStyleType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__PERCENTAGE_STYLE:
				getPercentageStyle().clear();
				getPercentageStyle().addAll((Collection<? extends PercentageStyleType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__DATE_STYLE:
				getDateStyle().clear();
				getDateStyle().addAll((Collection<? extends DateStyleType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__TIME_STYLE:
				getTimeStyle().clear();
				getTimeStyle().addAll((Collection<? extends TimeStyleType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__BOOLEAN_STYLE:
				getBooleanStyle().clear();
				getBooleanStyle().addAll((Collection<? extends BooleanStyleType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__TEXT_STYLE:
				getTextStyle().clear();
				getTextStyle().addAll((Collection<? extends TextStyleType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__DEFAULT_STYLE:
				getDefaultStyle().clear();
				getDefaultStyle().addAll((Collection<? extends StyleStyleContent>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__OUTLINE_STYLE:
				getOutlineStyle().clear();
				getOutlineStyle().addAll((Collection<? extends OutlineStyleType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__NOTES_CONFIGURATION:
				getNotesConfiguration().clear();
				getNotesConfiguration().addAll((Collection<? extends TextNotesConfigurationContent>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__BIBLIOGRAPHY_CONFIGURATION:
				getBibliographyConfiguration().clear();
				getBibliographyConfiguration().addAll((Collection<? extends BibliographyConfigurationType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__LINENUMBERING_CONFIGURATION:
				getLinenumberingConfiguration().clear();
				getLinenumberingConfiguration().addAll((Collection<? extends LinenumberingConfigurationType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__GRADIENT:
				getGradient().clear();
				getGradient().addAll((Collection<? extends GradientType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__LINEAR_GRADIENT:
				getLinearGradient().clear();
				getLinearGradient().addAll((Collection<? extends LinearGradientType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__RADIAL_GRADIENT:
				getRadialGradient().clear();
				getRadialGradient().addAll((Collection<? extends RadialGradientType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__HATCH:
				getHatch().clear();
				getHatch().addAll((Collection<? extends HatchType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__FILL_IMAGE:
				getFillImage().clear();
				getFillImage().addAll((Collection<? extends FillImageType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__MARKER:
				getMarker().clear();
				getMarker().addAll((Collection<? extends MarkerType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__STROKE_DASH:
				getStrokeDash().clear();
				getStrokeDash().addAll((Collection<? extends StrokeDashType1>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__OPACITY:
				getOpacity().clear();
				getOpacity().addAll((Collection<? extends OpacityType>)newValue);
				return;
			case OfficePackage.STYLES_TYPE__PRESENTATION_PAGE_LAYOUT:
				getPresentationPageLayout().clear();
				getPresentationPageLayout().addAll((Collection<? extends PresentationPageLayoutType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OfficePackage.STYLES_TYPE__GROUP:
				getGroup().clear();
				return;
			case OfficePackage.STYLES_TYPE__STYLE:
				getStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__LIST_STYLE:
				getListStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__NUMBER_STYLE:
				getNumberStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__CURRENCY_STYLE:
				getCurrencyStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__PERCENTAGE_STYLE:
				getPercentageStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__DATE_STYLE:
				getDateStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__TIME_STYLE:
				getTimeStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__BOOLEAN_STYLE:
				getBooleanStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__TEXT_STYLE:
				getTextStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__DEFAULT_STYLE:
				getDefaultStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__OUTLINE_STYLE:
				getOutlineStyle().clear();
				return;
			case OfficePackage.STYLES_TYPE__NOTES_CONFIGURATION:
				getNotesConfiguration().clear();
				return;
			case OfficePackage.STYLES_TYPE__BIBLIOGRAPHY_CONFIGURATION:
				getBibliographyConfiguration().clear();
				return;
			case OfficePackage.STYLES_TYPE__LINENUMBERING_CONFIGURATION:
				getLinenumberingConfiguration().clear();
				return;
			case OfficePackage.STYLES_TYPE__GRADIENT:
				getGradient().clear();
				return;
			case OfficePackage.STYLES_TYPE__LINEAR_GRADIENT:
				getLinearGradient().clear();
				return;
			case OfficePackage.STYLES_TYPE__RADIAL_GRADIENT:
				getRadialGradient().clear();
				return;
			case OfficePackage.STYLES_TYPE__HATCH:
				getHatch().clear();
				return;
			case OfficePackage.STYLES_TYPE__FILL_IMAGE:
				getFillImage().clear();
				return;
			case OfficePackage.STYLES_TYPE__MARKER:
				getMarker().clear();
				return;
			case OfficePackage.STYLES_TYPE__STROKE_DASH:
				getStrokeDash().clear();
				return;
			case OfficePackage.STYLES_TYPE__OPACITY:
				getOpacity().clear();
				return;
			case OfficePackage.STYLES_TYPE__PRESENTATION_PAGE_LAYOUT:
				getPresentationPageLayout().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OfficePackage.STYLES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case OfficePackage.STYLES_TYPE__STYLE:
				return !getStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__LIST_STYLE:
				return !getListStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__NUMBER_STYLE:
				return !getNumberStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__CURRENCY_STYLE:
				return !getCurrencyStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__PERCENTAGE_STYLE:
				return !getPercentageStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__DATE_STYLE:
				return !getDateStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__TIME_STYLE:
				return !getTimeStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__BOOLEAN_STYLE:
				return !getBooleanStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__TEXT_STYLE:
				return !getTextStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__DEFAULT_STYLE:
				return !getDefaultStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__OUTLINE_STYLE:
				return !getOutlineStyle().isEmpty();
			case OfficePackage.STYLES_TYPE__NOTES_CONFIGURATION:
				return !getNotesConfiguration().isEmpty();
			case OfficePackage.STYLES_TYPE__BIBLIOGRAPHY_CONFIGURATION:
				return !getBibliographyConfiguration().isEmpty();
			case OfficePackage.STYLES_TYPE__LINENUMBERING_CONFIGURATION:
				return !getLinenumberingConfiguration().isEmpty();
			case OfficePackage.STYLES_TYPE__GRADIENT:
				return !getGradient().isEmpty();
			case OfficePackage.STYLES_TYPE__LINEAR_GRADIENT:
				return !getLinearGradient().isEmpty();
			case OfficePackage.STYLES_TYPE__RADIAL_GRADIENT:
				return !getRadialGradient().isEmpty();
			case OfficePackage.STYLES_TYPE__HATCH:
				return !getHatch().isEmpty();
			case OfficePackage.STYLES_TYPE__FILL_IMAGE:
				return !getFillImage().isEmpty();
			case OfficePackage.STYLES_TYPE__MARKER:
				return !getMarker().isEmpty();
			case OfficePackage.STYLES_TYPE__STROKE_DASH:
				return !getStrokeDash().isEmpty();
			case OfficePackage.STYLES_TYPE__OPACITY:
				return !getOpacity().isEmpty();
			case OfficePackage.STYLES_TYPE__PRESENTATION_PAGE_LAYOUT:
				return !getPresentationPageLayout().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //StylesTypeImpl
