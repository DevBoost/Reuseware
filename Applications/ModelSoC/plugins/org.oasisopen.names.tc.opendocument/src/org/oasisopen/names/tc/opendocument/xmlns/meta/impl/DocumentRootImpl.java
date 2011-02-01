/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.meta.impl;

import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.meta.AutoReloadType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentRoot;
import org.oasisopen.names.tc.opendocument.xmlns.meta.DocumentStatisticType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.HyperlinkBehaviourType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage;
import org.oasisopen.names.tc.opendocument.xmlns.meta.TemplateType;
import org.oasisopen.names.tc.opendocument.xmlns.meta.UserDefinedType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getAutoReload <em>Auto Reload</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getDateString <em>Date String</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getDocumentStatistic <em>Document Statistic</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getEditingCycles <em>Editing Cycles</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getEditingDuration <em>Editing Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getHyperlinkBehaviour <em>Hyperlink Behaviour</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getInitialCreator <em>Initial Creator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getPrintDate <em>Print Date</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getPrintedBy <em>Printed By</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.meta.impl.DocumentRootImpl#getUserDefined <em>User Defined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDateString() <em>Date String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateString()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_STRING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEditingCycles() <em>Editing Cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditingCycles()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EDITING_CYCLES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEditingDuration() <em>Editing Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditingDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration EDITING_DURATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInitialCreator() <em>Initial Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_CREATOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrintDate() <em>Print Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PRINT_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrintedBy() <em>Printed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINTED_BY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, MetaPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, MetaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, MetaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoReloadType getAutoReload() {
		return (AutoReloadType)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__AUTO_RELOAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoReload(AutoReloadType newAutoReload, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MetaPackage.Literals.DOCUMENT_ROOT__AUTO_RELOAD, newAutoReload, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoReload(AutoReloadType newAutoReload) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__AUTO_RELOAD, newAutoReload);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreationDate() {
		return (XMLGregorianCalendar)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__CREATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__CREATION_DATE, newCreationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateString() {
		return (String)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__DATE_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateString(String newDateString) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__DATE_STRING, newDateString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStatisticType getDocumentStatistic() {
		return (DocumentStatisticType)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__DOCUMENT_STATISTIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentStatistic(DocumentStatisticType newDocumentStatistic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MetaPackage.Literals.DOCUMENT_ROOT__DOCUMENT_STATISTIC, newDocumentStatistic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentStatistic(DocumentStatisticType newDocumentStatistic) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__DOCUMENT_STATISTIC, newDocumentStatistic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getEditingCycles() {
		return (BigInteger)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__EDITING_CYCLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditingCycles(BigInteger newEditingCycles) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__EDITING_CYCLES, newEditingCycles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getEditingDuration() {
		return (Duration)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__EDITING_DURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditingDuration(Duration newEditingDuration) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__EDITING_DURATION, newEditingDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerator() {
		return (String)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(String newGenerator) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__GENERATOR, newGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperlinkBehaviourType getHyperlinkBehaviour() {
		return (HyperlinkBehaviourType)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHyperlinkBehaviour(HyperlinkBehaviourType newHyperlinkBehaviour, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MetaPackage.Literals.DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR, newHyperlinkBehaviour, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlinkBehaviour(HyperlinkBehaviourType newHyperlinkBehaviour) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR, newHyperlinkBehaviour);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialCreator() {
		return (String)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__INITIAL_CREATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialCreator(String newInitialCreator) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__INITIAL_CREATOR, newInitialCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyword() {
		return (String)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__KEYWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(String newKeyword) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__KEYWORD, newKeyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getPrintDate() {
		return (XMLGregorianCalendar)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__PRINT_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintDate(XMLGregorianCalendar newPrintDate) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__PRINT_DATE, newPrintDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrintedBy() {
		return (String)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__PRINTED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintedBy(String newPrintedBy) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__PRINTED_BY, newPrintedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateType getTemplate() {
		return (TemplateType)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(TemplateType newTemplate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MetaPackage.Literals.DOCUMENT_ROOT__TEMPLATE, newTemplate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateType newTemplate) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__TEMPLATE, newTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedType getUserDefined() {
		return (UserDefinedType)getMixed().get(MetaPackage.Literals.DOCUMENT_ROOT__USER_DEFINED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDefined(UserDefinedType newUserDefined, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MetaPackage.Literals.DOCUMENT_ROOT__USER_DEFINED, newUserDefined, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefined(UserDefinedType newUserDefined) {
		((FeatureMap.Internal)getMixed()).set(MetaPackage.Literals.DOCUMENT_ROOT__USER_DEFINED, newUserDefined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case MetaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case MetaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case MetaPackage.DOCUMENT_ROOT__AUTO_RELOAD:
				return basicSetAutoReload(null, msgs);
			case MetaPackage.DOCUMENT_ROOT__DOCUMENT_STATISTIC:
				return basicSetDocumentStatistic(null, msgs);
			case MetaPackage.DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR:
				return basicSetHyperlinkBehaviour(null, msgs);
			case MetaPackage.DOCUMENT_ROOT__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case MetaPackage.DOCUMENT_ROOT__USER_DEFINED:
				return basicSetUserDefined(null, msgs);
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
			case MetaPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case MetaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case MetaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case MetaPackage.DOCUMENT_ROOT__AUTO_RELOAD:
				return getAutoReload();
			case MetaPackage.DOCUMENT_ROOT__CREATION_DATE:
				return getCreationDate();
			case MetaPackage.DOCUMENT_ROOT__DATE_STRING:
				return getDateString();
			case MetaPackage.DOCUMENT_ROOT__DOCUMENT_STATISTIC:
				return getDocumentStatistic();
			case MetaPackage.DOCUMENT_ROOT__EDITING_CYCLES:
				return getEditingCycles();
			case MetaPackage.DOCUMENT_ROOT__EDITING_DURATION:
				return getEditingDuration();
			case MetaPackage.DOCUMENT_ROOT__GENERATOR:
				return getGenerator();
			case MetaPackage.DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR:
				return getHyperlinkBehaviour();
			case MetaPackage.DOCUMENT_ROOT__INITIAL_CREATOR:
				return getInitialCreator();
			case MetaPackage.DOCUMENT_ROOT__KEYWORD:
				return getKeyword();
			case MetaPackage.DOCUMENT_ROOT__PRINT_DATE:
				return getPrintDate();
			case MetaPackage.DOCUMENT_ROOT__PRINTED_BY:
				return getPrintedBy();
			case MetaPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate();
			case MetaPackage.DOCUMENT_ROOT__USER_DEFINED:
				return getUserDefined();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__AUTO_RELOAD:
				setAutoReload((AutoReloadType)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__DATE_STRING:
				setDateString((String)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__DOCUMENT_STATISTIC:
				setDocumentStatistic((DocumentStatisticType)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__EDITING_CYCLES:
				setEditingCycles((BigInteger)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__EDITING_DURATION:
				setEditingDuration((Duration)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__GENERATOR:
				setGenerator((String)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR:
				setHyperlinkBehaviour((HyperlinkBehaviourType)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__INITIAL_CREATOR:
				setInitialCreator((String)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword((String)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__PRINT_DATE:
				setPrintDate((XMLGregorianCalendar)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__PRINTED_BY:
				setPrintedBy((String)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((TemplateType)newValue);
				return;
			case MetaPackage.DOCUMENT_ROOT__USER_DEFINED:
				setUserDefined((UserDefinedType)newValue);
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
			case MetaPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case MetaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case MetaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case MetaPackage.DOCUMENT_ROOT__AUTO_RELOAD:
				setAutoReload((AutoReloadType)null);
				return;
			case MetaPackage.DOCUMENT_ROOT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_ROOT__DATE_STRING:
				setDateString(DATE_STRING_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_ROOT__DOCUMENT_STATISTIC:
				setDocumentStatistic((DocumentStatisticType)null);
				return;
			case MetaPackage.DOCUMENT_ROOT__EDITING_CYCLES:
				setEditingCycles(EDITING_CYCLES_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_ROOT__EDITING_DURATION:
				setEditingDuration(EDITING_DURATION_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_ROOT__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR:
				setHyperlinkBehaviour((HyperlinkBehaviourType)null);
				return;
			case MetaPackage.DOCUMENT_ROOT__INITIAL_CREATOR:
				setInitialCreator(INITIAL_CREATOR_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_ROOT__PRINT_DATE:
				setPrintDate(PRINT_DATE_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_ROOT__PRINTED_BY:
				setPrintedBy(PRINTED_BY_EDEFAULT);
				return;
			case MetaPackage.DOCUMENT_ROOT__TEMPLATE:
				setTemplate((TemplateType)null);
				return;
			case MetaPackage.DOCUMENT_ROOT__USER_DEFINED:
				setUserDefined((UserDefinedType)null);
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
			case MetaPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case MetaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case MetaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case MetaPackage.DOCUMENT_ROOT__AUTO_RELOAD:
				return getAutoReload() != null;
			case MetaPackage.DOCUMENT_ROOT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? getCreationDate() != null : !CREATION_DATE_EDEFAULT.equals(getCreationDate());
			case MetaPackage.DOCUMENT_ROOT__DATE_STRING:
				return DATE_STRING_EDEFAULT == null ? getDateString() != null : !DATE_STRING_EDEFAULT.equals(getDateString());
			case MetaPackage.DOCUMENT_ROOT__DOCUMENT_STATISTIC:
				return getDocumentStatistic() != null;
			case MetaPackage.DOCUMENT_ROOT__EDITING_CYCLES:
				return EDITING_CYCLES_EDEFAULT == null ? getEditingCycles() != null : !EDITING_CYCLES_EDEFAULT.equals(getEditingCycles());
			case MetaPackage.DOCUMENT_ROOT__EDITING_DURATION:
				return EDITING_DURATION_EDEFAULT == null ? getEditingDuration() != null : !EDITING_DURATION_EDEFAULT.equals(getEditingDuration());
			case MetaPackage.DOCUMENT_ROOT__GENERATOR:
				return GENERATOR_EDEFAULT == null ? getGenerator() != null : !GENERATOR_EDEFAULT.equals(getGenerator());
			case MetaPackage.DOCUMENT_ROOT__HYPERLINK_BEHAVIOUR:
				return getHyperlinkBehaviour() != null;
			case MetaPackage.DOCUMENT_ROOT__INITIAL_CREATOR:
				return INITIAL_CREATOR_EDEFAULT == null ? getInitialCreator() != null : !INITIAL_CREATOR_EDEFAULT.equals(getInitialCreator());
			case MetaPackage.DOCUMENT_ROOT__KEYWORD:
				return KEYWORD_EDEFAULT == null ? getKeyword() != null : !KEYWORD_EDEFAULT.equals(getKeyword());
			case MetaPackage.DOCUMENT_ROOT__PRINT_DATE:
				return PRINT_DATE_EDEFAULT == null ? getPrintDate() != null : !PRINT_DATE_EDEFAULT.equals(getPrintDate());
			case MetaPackage.DOCUMENT_ROOT__PRINTED_BY:
				return PRINTED_BY_EDEFAULT == null ? getPrintedBy() != null : !PRINTED_BY_EDEFAULT.equals(getPrintedBy());
			case MetaPackage.DOCUMENT_ROOT__TEMPLATE:
				return getTemplate() != null;
			case MetaPackage.DOCUMENT_ROOT__USER_DEFINED:
				return getUserDefined() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
