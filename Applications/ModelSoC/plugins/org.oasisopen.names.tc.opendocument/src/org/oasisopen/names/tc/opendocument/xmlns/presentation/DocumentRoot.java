/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation;

import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimationGroup <em>Animation Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations <em>Animations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDateTimeDecl <em>Date Time Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDim <em>Dim</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEventListener <em>Event Listener</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFooterDecl <em>Footer Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHeader <em>Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHeaderDecl <em>Header Decl</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHideShape <em>Hide Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHideText <em>Hide Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlay <em>Play</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowShape <em>Show Shape</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowText <em>Show Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSound <em>Sound</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAction <em>Action</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations1 <em>Animations1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundObjectsVisible <em>Background Objects Visible</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundVisible <em>Background Visible</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayDateTime <em>Display Date Time</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayFooter <em>Display Footer</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayHeader <em>Display Header</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayPageNumber <em>Display Page Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEndless <em>Endless</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getForceManual <em>Force Manual</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFullScreen <em>Full Screen</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMasterElement <em>Master Element</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseAsPen <em>Mouse As Pen</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseVisible <em>Mouse Visible</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPages <em>Pages</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPathId <em>Path Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPause <em>Pause</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder1 <em>Placeholder1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlayFull <em>Play Full</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresentationPageLayoutName <em>Presentation Page Layout Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetClass <em>Preset Class</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetId <em>Preset Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetSubType <em>Preset Sub Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShow1 <em>Show1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowLogo <em>Show Logo</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSource <em>Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartPage <em>Start Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartScale <em>Start Scale</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartWithNavigator <em>Start With Navigator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStayOnTop <em>Stay On Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionOnClick <em>Transition On Click</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionSpeed <em>Transition Speed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionStyle <em>Transition Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionType <em>Transition Type</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseDateTimeName <em>Use Date Time Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseFooterName <em>Use Footer Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseHeaderName <em>Use Header Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUserTransformed <em>User Transformed</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVerb <em>Verb</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Animation Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation Group</em>' containment reference.
	 * @see #setAnimationGroup(AnimationGroupType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_AnimationGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='animation-group' namespace='##targetNamespace'"
	 * @generated
	 */
	AnimationGroupType getAnimationGroup();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimationGroup <em>Animation Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation Group</em>' containment reference.
	 * @see #getAnimationGroup()
	 * @generated
	 */
	void setAnimationGroup(AnimationGroupType value);

	/**
	 * Returns the value of the '<em><b>Animations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animations</em>' containment reference.
	 * @see #setAnimations(AnimationsType1)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Animations()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='animations' namespace='##targetNamespace'"
	 * @generated
	 */
	AnimationsType1 getAnimations();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations <em>Animations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animations</em>' containment reference.
	 * @see #getAnimations()
	 * @generated
	 */
	void setAnimations(AnimationsType1 value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTimeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_DateTime()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-time' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeType getDateTime();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTimeType value);

	/**
	 * Returns the value of the '<em><b>Date Time Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Decl</em>' containment reference.
	 * @see #setDateTimeDecl(DateTimeDeclType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_DateTimeDecl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date-time-decl' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-decl'"
	 * @generated
	 */
	DateTimeDeclType getDateTimeDecl();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDateTimeDecl <em>Date Time Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Decl</em>' containment reference.
	 * @see #getDateTimeDecl()
	 * @generated
	 */
	void setDateTimeDecl(DateTimeDeclType value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' containment reference.
	 * @see #setDim(DimType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Dim()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dim' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements'"
	 * @generated
	 */
	DimType getDim();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDim <em>Dim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' containment reference.
	 * @see #getDim()
	 * @generated
	 */
	void setDim(DimType value);

	/**
	 * Returns the value of the '<em><b>Event Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Listener</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Listener</em>' containment reference.
	 * @see #setEventListener(EventListenerType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_EventListener()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event-listener' namespace='##targetNamespace'"
	 * @generated
	 */
	EventListenerType getEventListener();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEventListener <em>Event Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Listener</em>' containment reference.
	 * @see #getEventListener()
	 * @generated
	 */
	void setEventListener(EventListenerType value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(FooterType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Footer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footer' namespace='##targetNamespace'"
	 * @generated
	 */
	FooterType getFooter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(FooterType value);

	/**
	 * Returns the value of the '<em><b>Footer Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Decl</em>' containment reference.
	 * @see #setFooterDecl(FooterDeclType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_FooterDecl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='footer-decl' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-decl'"
	 * @generated
	 */
	FooterDeclType getFooterDecl();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFooterDecl <em>Footer Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Decl</em>' containment reference.
	 * @see #getFooterDecl()
	 * @generated
	 */
	void setFooterDecl(FooterDeclType value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Header()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderType value);

	/**
	 * Returns the value of the '<em><b>Header Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Decl</em>' containment reference.
	 * @see #setHeaderDecl(HeaderDeclType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_HeaderDecl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='header-decl' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-decl'"
	 * @generated
	 */
	HeaderDeclType getHeaderDecl();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHeaderDecl <em>Header Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Decl</em>' containment reference.
	 * @see #getHeaderDecl()
	 * @generated
	 */
	void setHeaderDecl(HeaderDeclType value);

	/**
	 * Returns the value of the '<em><b>Hide Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Shape</em>' containment reference.
	 * @see #setHideShape(HideShapeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_HideShape()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hide-shape' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements'"
	 * @generated
	 */
	HideShapeType getHideShape();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHideShape <em>Hide Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Shape</em>' containment reference.
	 * @see #getHideShape()
	 * @generated
	 */
	void setHideShape(HideShapeType value);

	/**
	 * Returns the value of the '<em><b>Hide Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Text</em>' containment reference.
	 * @see #setHideText(HideTextType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_HideText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hide-text' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements'"
	 * @generated
	 */
	HideTextType getHideText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getHideText <em>Hide Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Text</em>' containment reference.
	 * @see #getHideText()
	 * @generated
	 */
	void setHideText(HideTextType value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(NotesType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Notes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(NotesType value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' containment reference.
	 * @see #setPlaceholder(PlaceholderType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Placeholder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='placeholder' namespace='##targetNamespace'"
	 * @generated
	 */
	PlaceholderType getPlaceholder();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder <em>Placeholder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' containment reference.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(PlaceholderType value);

	/**
	 * Returns the value of the '<em><b>Play</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play</em>' containment reference.
	 * @see #setPlay(PlayType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Play()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='play' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements'"
	 * @generated
	 */
	PlayType getPlay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlay <em>Play</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play</em>' containment reference.
	 * @see #getPlay()
	 * @generated
	 */
	void setPlay(PlayType value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(SettingsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Settings()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='settings' namespace='##targetNamespace'"
	 * @generated
	 */
	SettingsType getSettings();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(SettingsType value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' containment reference.
	 * @see #setShow(ShowType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Show()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='show' namespace='##targetNamespace'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShow <em>Show</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' containment reference.
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Returns the value of the '<em><b>Show Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Shape</em>' containment reference.
	 * @see #setShowShape(ShowShapeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_ShowShape()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='show-shape' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements'"
	 * @generated
	 */
	ShowShapeType getShowShape();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowShape <em>Show Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Shape</em>' containment reference.
	 * @see #getShowShape()
	 * @generated
	 */
	void setShowShape(ShowShapeType value);

	/**
	 * Returns the value of the '<em><b>Show Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Text</em>' containment reference.
	 * @see #setShowText(ShowTextType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_ShowText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='show-text' namespace='##targetNamespace' affiliation='urn:oasis:names:tc:opendocument:xmlns:text:1.0#presentation-animation-elements'"
	 * @generated
	 */
	ShowTextType getShowText();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowText <em>Show Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Text</em>' containment reference.
	 * @see #getShowText()
	 * @generated
	 */
	void setShowText(ShowTextType value);

	/**
	 * Returns the value of the '<em><b>Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound</em>' containment reference.
	 * @see #setSound(SoundType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Sound()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sound' namespace='##targetNamespace'"
	 * @generated
	 */
	SoundType getSound();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSound <em>Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound</em>' containment reference.
	 * @see #getSound()
	 * @generated
	 */
	void setSound(SoundType value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #setAction(ActionType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Action()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.ActionType
	 * @see #isSetAction()
	 * @see #unsetAction()
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAction()
	 * @see #getAction()
	 * @see #setAction(ActionType)
	 * @generated
	 */
	void unsetAction();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAction <em>Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action</em>' attribute is set.
	 * @see #unsetAction()
	 * @see #getAction()
	 * @see #setAction(ActionType)
	 * @generated
	 */
	boolean isSetAction();

	/**
	 * Returns the value of the '<em><b>Animations1</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animations1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animations1</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
	 * @see #isSetAnimations1()
	 * @see #unsetAnimations1()
	 * @see #setAnimations1(AnimationsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Animations1()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='animations' namespace='##targetNamespace'"
	 * @generated
	 */
	AnimationsType getAnimations1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations1 <em>Animations1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animations1</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
	 * @see #isSetAnimations1()
	 * @see #unsetAnimations1()
	 * @see #getAnimations1()
	 * @generated
	 */
	void setAnimations1(AnimationsType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations1 <em>Animations1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnimations1()
	 * @see #getAnimations1()
	 * @see #setAnimations1(AnimationsType)
	 * @generated
	 */
	void unsetAnimations1();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getAnimations1 <em>Animations1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Animations1</em>' attribute is set.
	 * @see #unsetAnimations1()
	 * @see #getAnimations1()
	 * @see #setAnimations1(AnimationsType)
	 * @generated
	 */
	boolean isSetAnimations1();

	/**
	 * Returns the value of the '<em><b>Background Objects Visible</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Objects Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Objects Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBackgroundObjectsVisible()
	 * @see #unsetBackgroundObjectsVisible()
	 * @see #setBackgroundObjectsVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_BackgroundObjectsVisible()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='background-objects-visible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBackgroundObjectsVisible();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundObjectsVisible <em>Background Objects Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Objects Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBackgroundObjectsVisible()
	 * @see #unsetBackgroundObjectsVisible()
	 * @see #getBackgroundObjectsVisible()
	 * @generated
	 */
	void setBackgroundObjectsVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundObjectsVisible <em>Background Objects Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackgroundObjectsVisible()
	 * @see #getBackgroundObjectsVisible()
	 * @see #setBackgroundObjectsVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetBackgroundObjectsVisible();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundObjectsVisible <em>Background Objects Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Background Objects Visible</em>' attribute is set.
	 * @see #unsetBackgroundObjectsVisible()
	 * @see #getBackgroundObjectsVisible()
	 * @see #setBackgroundObjectsVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetBackgroundObjectsVisible();

	/**
	 * Returns the value of the '<em><b>Background Visible</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBackgroundVisible()
	 * @see #unsetBackgroundVisible()
	 * @see #setBackgroundVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_BackgroundVisible()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='background-visible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getBackgroundVisible();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundVisible <em>Background Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetBackgroundVisible()
	 * @see #unsetBackgroundVisible()
	 * @see #getBackgroundVisible()
	 * @generated
	 */
	void setBackgroundVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundVisible <em>Background Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackgroundVisible()
	 * @see #getBackgroundVisible()
	 * @see #setBackgroundVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetBackgroundVisible();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getBackgroundVisible <em>Background Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Background Visible</em>' attribute is set.
	 * @see #unsetBackgroundVisible()
	 * @see #getBackgroundVisible()
	 * @see #setBackgroundVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetBackgroundVisible();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #setClass(PresentationClasses)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Class()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationClasses getClass_();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(PresentationClasses value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClass()
	 * @see #getClass_()
	 * @see #setClass(PresentationClasses)
	 * @generated
	 */
	void unsetClass();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClass_ <em>Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class</em>' attribute is set.
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @see #setClass(PresentationClasses)
	 * @generated
	 */
	boolean isSetClass();

	/**
	 * Returns the value of the '<em><b>Class Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names</em>' attribute.
	 * @see #setClassNames(List)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_ClassNames()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.StyleNameRefs" many="false"
	 *        extendedMetaData="kind='attribute' name='class-names' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getClassNames();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getClassNames <em>Class Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Names</em>' attribute.
	 * @see #getClassNames()
	 * @generated
	 */
	void setClassNames(List<String> value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Delay()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='delay' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDelay();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Duration value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(PresentationEffectDirections)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Direction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='direction' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationEffectDirections getDirection();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffectDirections
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PresentationEffectDirections value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(PresentationEffectDirections)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(PresentationEffectDirections)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Display Date Time</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Date Time</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayDateTime()
	 * @see #unsetDisplayDateTime()
	 * @see #setDisplayDateTime(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_DisplayDateTime()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-date-time' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayDateTime();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayDateTime <em>Display Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Date Time</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayDateTime()
	 * @see #unsetDisplayDateTime()
	 * @see #getDisplayDateTime()
	 * @generated
	 */
	void setDisplayDateTime(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayDateTime <em>Display Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayDateTime()
	 * @see #getDisplayDateTime()
	 * @see #setDisplayDateTime(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayDateTime();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayDateTime <em>Display Date Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Date Time</em>' attribute is set.
	 * @see #unsetDisplayDateTime()
	 * @see #getDisplayDateTime()
	 * @see #setDisplayDateTime(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayDateTime();

	/**
	 * Returns the value of the '<em><b>Display Footer</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Footer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Footer</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayFooter()
	 * @see #unsetDisplayFooter()
	 * @see #setDisplayFooter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_DisplayFooter()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-footer' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayFooter();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayFooter <em>Display Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Footer</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayFooter()
	 * @see #unsetDisplayFooter()
	 * @see #getDisplayFooter()
	 * @generated
	 */
	void setDisplayFooter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayFooter <em>Display Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayFooter()
	 * @see #getDisplayFooter()
	 * @see #setDisplayFooter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayFooter();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayFooter <em>Display Footer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Footer</em>' attribute is set.
	 * @see #unsetDisplayFooter()
	 * @see #getDisplayFooter()
	 * @see #setDisplayFooter(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayFooter();

	/**
	 * Returns the value of the '<em><b>Display Header</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Header</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayHeader()
	 * @see #unsetDisplayHeader()
	 * @see #setDisplayHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_DisplayHeader()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-header' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayHeader();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayHeader <em>Display Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Header</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayHeader()
	 * @see #unsetDisplayHeader()
	 * @see #getDisplayHeader()
	 * @generated
	 */
	void setDisplayHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayHeader <em>Display Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayHeader()
	 * @see #getDisplayHeader()
	 * @see #setDisplayHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayHeader();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayHeader <em>Display Header</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Header</em>' attribute is set.
	 * @see #unsetDisplayHeader()
	 * @see #getDisplayHeader()
	 * @see #setDisplayHeader(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayHeader();

	/**
	 * Returns the value of the '<em><b>Display Page Number</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Page Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Page Number</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayPageNumber()
	 * @see #unsetDisplayPageNumber()
	 * @see #setDisplayPageNumber(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_DisplayPageNumber()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='display-page-number' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisplayPageNumber();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayPageNumber <em>Display Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Page Number</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetDisplayPageNumber()
	 * @see #unsetDisplayPageNumber()
	 * @see #getDisplayPageNumber()
	 * @generated
	 */
	void setDisplayPageNumber(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayPageNumber <em>Display Page Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayPageNumber()
	 * @see #getDisplayPageNumber()
	 * @see #setDisplayPageNumber(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetDisplayPageNumber();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDisplayPageNumber <em>Display Page Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Page Number</em>' attribute is set.
	 * @see #unsetDisplayPageNumber()
	 * @see #getDisplayPageNumber()
	 * @see #setDisplayPageNumber(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetDisplayPageNumber();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Duration()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #setEffect(PresentationEffects)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Effect()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='effect' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationEffects getEffect();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationEffects
	 * @see #isSetEffect()
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(PresentationEffects value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffect()
	 * @see #getEffect()
	 * @see #setEffect(PresentationEffects)
	 * @generated
	 */
	void unsetEffect();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEffect <em>Effect</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effect</em>' attribute is set.
	 * @see #unsetEffect()
	 * @see #getEffect()
	 * @see #setEffect(PresentationEffects)
	 * @generated
	 */
	boolean isSetEffect();

	/**
	 * Returns the value of the '<em><b>Endless</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endless</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endless</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEndless()
	 * @see #unsetEndless()
	 * @see #setEndless(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Endless()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='endless' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEndless();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEndless <em>Endless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endless</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEndless()
	 * @see #unsetEndless()
	 * @see #getEndless()
	 * @generated
	 */
	void setEndless(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEndless <em>Endless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndless()
	 * @see #getEndless()
	 * @see #setEndless(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetEndless();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getEndless <em>Endless</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endless</em>' attribute is set.
	 * @see #unsetEndless()
	 * @see #getEndless()
	 * @see #setEndless(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetEndless();

	/**
	 * Returns the value of the '<em><b>Force Manual</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Manual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Manual</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetForceManual()
	 * @see #unsetForceManual()
	 * @see #setForceManual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_ForceManual()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='force-manual' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getForceManual();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getForceManual <em>Force Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Manual</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetForceManual()
	 * @see #unsetForceManual()
	 * @see #getForceManual()
	 * @generated
	 */
	void setForceManual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getForceManual <em>Force Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForceManual()
	 * @see #getForceManual()
	 * @see #setForceManual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetForceManual();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getForceManual <em>Force Manual</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Force Manual</em>' attribute is set.
	 * @see #unsetForceManual()
	 * @see #getForceManual()
	 * @see #setForceManual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetForceManual();

	/**
	 * Returns the value of the '<em><b>Full Screen</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Screen</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFullScreen()
	 * @see #unsetFullScreen()
	 * @see #setFullScreen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_FullScreen()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='full-screen' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFullScreen();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFullScreen <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Screen</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFullScreen()
	 * @see #unsetFullScreen()
	 * @see #getFullScreen()
	 * @generated
	 */
	void setFullScreen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFullScreen <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFullScreen()
	 * @see #getFullScreen()
	 * @see #setFullScreen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFullScreen();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getFullScreen <em>Full Screen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Full Screen</em>' attribute is set.
	 * @see #unsetFullScreen()
	 * @see #getFullScreen()
	 * @see #setFullScreen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFullScreen();

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_GroupId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='group-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Master Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Element</em>' attribute.
	 * @see #setMasterElement(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_MasterElement()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.IDREF"
	 *        extendedMetaData="kind='attribute' name='master-element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMasterElement();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMasterElement <em>Master Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Element</em>' attribute.
	 * @see #getMasterElement()
	 * @generated
	 */
	void setMasterElement(String value);

	/**
	 * Returns the value of the '<em><b>Mouse As Pen</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouse As Pen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouse As Pen</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMouseAsPen()
	 * @see #unsetMouseAsPen()
	 * @see #setMouseAsPen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_MouseAsPen()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mouse-as-pen' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMouseAsPen();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseAsPen <em>Mouse As Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouse As Pen</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMouseAsPen()
	 * @see #unsetMouseAsPen()
	 * @see #getMouseAsPen()
	 * @generated
	 */
	void setMouseAsPen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseAsPen <em>Mouse As Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMouseAsPen()
	 * @see #getMouseAsPen()
	 * @see #setMouseAsPen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMouseAsPen();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseAsPen <em>Mouse As Pen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mouse As Pen</em>' attribute is set.
	 * @see #unsetMouseAsPen()
	 * @see #getMouseAsPen()
	 * @see #setMouseAsPen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMouseAsPen();

	/**
	 * Returns the value of the '<em><b>Mouse Visible</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouse Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouse Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMouseVisible()
	 * @see #unsetMouseVisible()
	 * @see #setMouseVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_MouseVisible()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mouse-visible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMouseVisible();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseVisible <em>Mouse Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouse Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMouseVisible()
	 * @see #unsetMouseVisible()
	 * @see #getMouseVisible()
	 * @generated
	 */
	void setMouseVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseVisible <em>Mouse Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMouseVisible()
	 * @see #getMouseVisible()
	 * @see #setMouseVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMouseVisible();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getMouseVisible <em>Mouse Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mouse Visible</em>' attribute is set.
	 * @see #unsetMouseVisible()
	 * @see #getMouseVisible()
	 * @see #setMouseVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMouseVisible();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Name()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
	 * @see #isSetNodeType()
	 * @see #unsetNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_NodeType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='node-type' namespace='##targetNamespace'"
	 * @generated
	 */
	NodeTypeType getNodeType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.NodeTypeType
	 * @see #isSetNodeType()
	 * @see #unsetNodeType()
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(NodeTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNodeType()
	 * @see #getNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @generated
	 */
	void unsetNodeType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getNodeType <em>Node Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Node Type</em>' attribute is set.
	 * @see #unsetNodeType()
	 * @see #getNodeType()
	 * @see #setNodeType(NodeTypeType)
	 * @generated
	 */
	boolean isSetNodeType();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' attribute.
	 * @see #setPages(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Pages()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='pages' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPages();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' attribute.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(Object value);

	/**
	 * Returns the value of the '<em><b>Path Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Id</em>' attribute.
	 * @see #setPathId(Object)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_PathId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='path-id' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getPathId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPathId <em>Path Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Id</em>' attribute.
	 * @see #getPathId()
	 * @generated
	 */
	void setPathId(Object value);

	/**
	 * Returns the value of the '<em><b>Pause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pause</em>' attribute.
	 * @see #setPause(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Pause()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='pause' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getPause();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPause <em>Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pause</em>' attribute.
	 * @see #getPause()
	 * @generated
	 */
	void setPause(Duration value);

	/**
	 * Returns the value of the '<em><b>Placeholder1</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder1</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPlaceholder1()
	 * @see #unsetPlaceholder1()
	 * @see #setPlaceholder1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Placeholder1()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='placeholder' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPlaceholder1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder1 <em>Placeholder1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder1</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPlaceholder1()
	 * @see #unsetPlaceholder1()
	 * @see #getPlaceholder1()
	 * @generated
	 */
	void setPlaceholder1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder1 <em>Placeholder1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlaceholder1()
	 * @see #getPlaceholder1()
	 * @see #setPlaceholder1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPlaceholder1();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlaceholder1 <em>Placeholder1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placeholder1</em>' attribute is set.
	 * @see #unsetPlaceholder1()
	 * @see #getPlaceholder1()
	 * @see #setPlaceholder1(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPlaceholder1();

	/**
	 * Returns the value of the '<em><b>Play Full</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play Full</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play Full</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPlayFull()
	 * @see #unsetPlayFull()
	 * @see #setPlayFull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_PlayFull()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='play-full' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPlayFull();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlayFull <em>Play Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play Full</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetPlayFull()
	 * @see #unsetPlayFull()
	 * @see #getPlayFull()
	 * @generated
	 */
	void setPlayFull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlayFull <em>Play Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlayFull()
	 * @see #getPlayFull()
	 * @see #setPlayFull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetPlayFull();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPlayFull <em>Play Full</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Play Full</em>' attribute is set.
	 * @see #unsetPlayFull()
	 * @see #getPlayFull()
	 * @see #setPlayFull(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetPlayFull();

	/**
	 * Returns the value of the '<em><b>Presentation Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Page Layout Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Page Layout Name</em>' attribute.
	 * @see #setPresentationPageLayoutName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_PresentationPageLayoutName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPageLayoutNameType"
	 *        extendedMetaData="kind='attribute' name='presentation-page-layout-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPresentationPageLayoutName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresentationPageLayoutName <em>Presentation Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Page Layout Name</em>' attribute.
	 * @see #getPresentationPageLayoutName()
	 * @generated
	 */
	void setPresentationPageLayoutName(String value);

	/**
	 * Returns the value of the '<em><b>Preset Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preset Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preset Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
	 * @see #isSetPresetClass()
	 * @see #unsetPresetClass()
	 * @see #setPresetClass(PresetClassType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_PresetClass()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='preset-class' namespace='##targetNamespace'"
	 * @generated
	 */
	PresetClassType getPresetClass();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetClass <em>Preset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preset Class</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresetClassType
	 * @see #isSetPresetClass()
	 * @see #unsetPresetClass()
	 * @see #getPresetClass()
	 * @generated
	 */
	void setPresetClass(PresetClassType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetClass <em>Preset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresetClass()
	 * @see #getPresetClass()
	 * @see #setPresetClass(PresetClassType)
	 * @generated
	 */
	void unsetPresetClass();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetClass <em>Preset Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preset Class</em>' attribute is set.
	 * @see #unsetPresetClass()
	 * @see #getPresetClass()
	 * @see #setPresetClass(PresetClassType)
	 * @generated
	 */
	boolean isSetPresetClass();

	/**
	 * Returns the value of the '<em><b>Preset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preset Id</em>' attribute.
	 * @see #setPresetId(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_PresetId()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='preset-id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPresetId();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetId <em>Preset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preset Id</em>' attribute.
	 * @see #getPresetId()
	 * @generated
	 */
	void setPresetId(String value);

	/**
	 * Returns the value of the '<em><b>Preset Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preset Sub Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preset Sub Type</em>' attribute.
	 * @see #setPresetSubType(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_PresetSubType()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='preset-sub-type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPresetSubType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getPresetSubType <em>Preset Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preset Sub Type</em>' attribute.
	 * @see #getPresetSubType()
	 * @generated
	 */
	void setPresetSubType(String value);

	/**
	 * Returns the value of the '<em><b>Show1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show1</em>' attribute.
	 * @see #setShow1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Show1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='show' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShow1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShow1 <em>Show1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show1</em>' attribute.
	 * @see #getShow1()
	 * @generated
	 */
	void setShow1(String value);

	/**
	 * Returns the value of the '<em><b>Show End Of Presentation Slide</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show End Of Presentation Slide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show End Of Presentation Slide</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowEndOfPresentationSlide()
	 * @see #unsetShowEndOfPresentationSlide()
	 * @see #setShowEndOfPresentationSlide(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_ShowEndOfPresentationSlide()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-end-of-presentation-slide' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowEndOfPresentationSlide();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show End Of Presentation Slide</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowEndOfPresentationSlide()
	 * @see #unsetShowEndOfPresentationSlide()
	 * @see #getShowEndOfPresentationSlide()
	 * @generated
	 */
	void setShowEndOfPresentationSlide(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowEndOfPresentationSlide()
	 * @see #getShowEndOfPresentationSlide()
	 * @see #setShowEndOfPresentationSlide(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowEndOfPresentationSlide();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show End Of Presentation Slide</em>' attribute is set.
	 * @see #unsetShowEndOfPresentationSlide()
	 * @see #getShowEndOfPresentationSlide()
	 * @see #setShowEndOfPresentationSlide(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShowEndOfPresentationSlide();

	/**
	 * Returns the value of the '<em><b>Show Logo</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Logo</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowLogo()
	 * @see #unsetShowLogo()
	 * @see #setShowLogo(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_ShowLogo()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-logo' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowLogo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowLogo <em>Show Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Logo</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowLogo()
	 * @see #unsetShowLogo()
	 * @see #getShowLogo()
	 * @generated
	 */
	void setShowLogo(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowLogo <em>Show Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowLogo()
	 * @see #getShowLogo()
	 * @see #setShowLogo(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowLogo();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getShowLogo <em>Show Logo</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Logo</em>' attribute is set.
	 * @see #unsetShowLogo()
	 * @see #getShowLogo()
	 * @see #setShowLogo(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShowLogo();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #setSource(SourceType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Source()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceType getSource();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.SourceType
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSource()
	 * @see #getSource()
	 * @see #setSource(SourceType)
	 * @generated
	 */
	void unsetSource();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSource <em>Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' attribute is set.
	 * @see #unsetSource()
	 * @see #getSource()
	 * @see #setSource(SourceType)
	 * @generated
	 */
	boolean isSetSource();

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds
	 * @see #isSetSpeed()
	 * @see #unsetSpeed()
	 * @see #setSpeed(PresentationSpeeds)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Speed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='speed' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationSpeeds getSpeed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds
	 * @see #isSetSpeed()
	 * @see #unsetSpeed()
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(PresentationSpeeds value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeed()
	 * @see #getSpeed()
	 * @see #setSpeed(PresentationSpeeds)
	 * @generated
	 */
	void unsetSpeed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getSpeed <em>Speed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speed</em>' attribute is set.
	 * @see #unsetSpeed()
	 * @see #getSpeed()
	 * @see #setSpeed(PresentationSpeeds)
	 * @generated
	 */
	boolean isSetSpeed();

	/**
	 * Returns the value of the '<em><b>Start Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Page</em>' attribute.
	 * @see #setStartPage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_StartPage()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='start-page' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartPage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartPage <em>Start Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Page</em>' attribute.
	 * @see #getStartPage()
	 * @generated
	 */
	void setStartPage(String value);

	/**
	 * Returns the value of the '<em><b>Start Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Scale</em>' attribute.
	 * @see #setStartScale(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_StartScale()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Percent"
	 *        extendedMetaData="kind='attribute' name='start-scale' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartScale();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartScale <em>Start Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Scale</em>' attribute.
	 * @see #getStartScale()
	 * @generated
	 */
	void setStartScale(String value);

	/**
	 * Returns the value of the '<em><b>Start With Navigator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start With Navigator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start With Navigator</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStartWithNavigator()
	 * @see #unsetStartWithNavigator()
	 * @see #setStartWithNavigator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_StartWithNavigator()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='start-with-navigator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStartWithNavigator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartWithNavigator <em>Start With Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start With Navigator</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStartWithNavigator()
	 * @see #unsetStartWithNavigator()
	 * @see #getStartWithNavigator()
	 * @generated
	 */
	void setStartWithNavigator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartWithNavigator <em>Start With Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartWithNavigator()
	 * @see #getStartWithNavigator()
	 * @see #setStartWithNavigator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetStartWithNavigator();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStartWithNavigator <em>Start With Navigator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start With Navigator</em>' attribute is set.
	 * @see #unsetStartWithNavigator()
	 * @see #getStartWithNavigator()
	 * @see #setStartWithNavigator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetStartWithNavigator();

	/**
	 * Returns the value of the '<em><b>Stay On Top</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stay On Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stay On Top</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStayOnTop()
	 * @see #unsetStayOnTop()
	 * @see #setStayOnTop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_StayOnTop()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='stay-on-top' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStayOnTop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStayOnTop <em>Stay On Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stay On Top</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStayOnTop()
	 * @see #unsetStayOnTop()
	 * @see #getStayOnTop()
	 * @generated
	 */
	void setStayOnTop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStayOnTop <em>Stay On Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStayOnTop()
	 * @see #getStayOnTop()
	 * @see #setStayOnTop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetStayOnTop();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStayOnTop <em>Stay On Top</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stay On Top</em>' attribute is set.
	 * @see #unsetStayOnTop()
	 * @see #getStayOnTop()
	 * @see #setStayOnTop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetStayOnTop();

	/**
	 * Returns the value of the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Name</em>' attribute.
	 * @see #setStyleName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_StyleName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.presentation.StyleNameType"
	 *        extendedMetaData="kind='attribute' name='style-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getStyleName <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Name</em>' attribute.
	 * @see #getStyleName()
	 * @generated
	 */
	void setStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Transition On Click</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition On Click</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition On Click</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
	 * @see #isSetTransitionOnClick()
	 * @see #unsetTransitionOnClick()
	 * @see #setTransitionOnClick(TransitionOnClickType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_TransitionOnClick()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transition-on-click' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionOnClickType getTransitionOnClick();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionOnClick <em>Transition On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition On Click</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
	 * @see #isSetTransitionOnClick()
	 * @see #unsetTransitionOnClick()
	 * @see #getTransitionOnClick()
	 * @generated
	 */
	void setTransitionOnClick(TransitionOnClickType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionOnClick <em>Transition On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransitionOnClick()
	 * @see #getTransitionOnClick()
	 * @see #setTransitionOnClick(TransitionOnClickType)
	 * @generated
	 */
	void unsetTransitionOnClick();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionOnClick <em>Transition On Click</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transition On Click</em>' attribute is set.
	 * @see #unsetTransitionOnClick()
	 * @see #getTransitionOnClick()
	 * @see #setTransitionOnClick(TransitionOnClickType)
	 * @generated
	 */
	boolean isSetTransitionOnClick();

	/**
	 * Returns the value of the '<em><b>Transition Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Speed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds
	 * @see #isSetTransitionSpeed()
	 * @see #unsetTransitionSpeed()
	 * @see #setTransitionSpeed(PresentationSpeeds)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_TransitionSpeed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transition-speed' namespace='##targetNamespace'"
	 * @generated
	 */
	PresentationSpeeds getTransitionSpeed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionSpeed <em>Transition Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Speed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.PresentationSpeeds
	 * @see #isSetTransitionSpeed()
	 * @see #unsetTransitionSpeed()
	 * @see #getTransitionSpeed()
	 * @generated
	 */
	void setTransitionSpeed(PresentationSpeeds value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionSpeed <em>Transition Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransitionSpeed()
	 * @see #getTransitionSpeed()
	 * @see #setTransitionSpeed(PresentationSpeeds)
	 * @generated
	 */
	void unsetTransitionSpeed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionSpeed <em>Transition Speed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transition Speed</em>' attribute is set.
	 * @see #unsetTransitionSpeed()
	 * @see #getTransitionSpeed()
	 * @see #setTransitionSpeed(PresentationSpeeds)
	 * @generated
	 */
	boolean isSetTransitionSpeed();

	/**
	 * Returns the value of the '<em><b>Transition Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType
	 * @see #isSetTransitionStyle()
	 * @see #unsetTransitionStyle()
	 * @see #setTransitionStyle(TransitionStyleType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_TransitionStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transition-style' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionStyleType getTransitionStyle();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionStyle <em>Transition Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Style</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionStyleType
	 * @see #isSetTransitionStyle()
	 * @see #unsetTransitionStyle()
	 * @see #getTransitionStyle()
	 * @generated
	 */
	void setTransitionStyle(TransitionStyleType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionStyle <em>Transition Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransitionStyle()
	 * @see #getTransitionStyle()
	 * @see #setTransitionStyle(TransitionStyleType)
	 * @generated
	 */
	void unsetTransitionStyle();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionStyle <em>Transition Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transition Style</em>' attribute is set.
	 * @see #unsetTransitionStyle()
	 * @see #getTransitionStyle()
	 * @see #setTransitionStyle(TransitionStyleType)
	 * @generated
	 */
	boolean isSetTransitionStyle();

	/**
	 * Returns the value of the '<em><b>Transition Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType
	 * @see #isSetTransitionType()
	 * @see #unsetTransitionType()
	 * @see #setTransitionType(TransitionTypeType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_TransitionType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transition-type' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionTypeType getTransitionType();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionType <em>Transition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Type</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionTypeType
	 * @see #isSetTransitionType()
	 * @see #unsetTransitionType()
	 * @see #getTransitionType()
	 * @generated
	 */
	void setTransitionType(TransitionTypeType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionType <em>Transition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransitionType()
	 * @see #getTransitionType()
	 * @see #setTransitionType(TransitionTypeType)
	 * @generated
	 */
	void unsetTransitionType();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getTransitionType <em>Transition Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transition Type</em>' attribute is set.
	 * @see #unsetTransitionType()
	 * @see #getTransitionType()
	 * @see #setTransitionType(TransitionTypeType)
	 * @generated
	 */
	boolean isSetTransitionType();

	/**
	 * Returns the value of the '<em><b>Use Date Time Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Date Time Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Date Time Name</em>' attribute.
	 * @see #setUseDateTimeName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_UseDateTimeName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='use-date-time-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseDateTimeName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseDateTimeName <em>Use Date Time Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Date Time Name</em>' attribute.
	 * @see #getUseDateTimeName()
	 * @generated
	 */
	void setUseDateTimeName(String value);

	/**
	 * Returns the value of the '<em><b>Use Footer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Footer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Footer Name</em>' attribute.
	 * @see #setUseFooterName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_UseFooterName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='use-footer-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseFooterName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseFooterName <em>Use Footer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Footer Name</em>' attribute.
	 * @see #getUseFooterName()
	 * @generated
	 */
	void setUseFooterName(String value);

	/**
	 * Returns the value of the '<em><b>Use Header Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Header Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Header Name</em>' attribute.
	 * @see #setUseHeaderName(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_UseHeaderName()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='use-header-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseHeaderName();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUseHeaderName <em>Use Header Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Header Name</em>' attribute.
	 * @see #getUseHeaderName()
	 * @generated
	 */
	void setUseHeaderName(String value);

	/**
	 * Returns the value of the '<em><b>User Transformed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Transformed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Transformed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUserTransformed()
	 * @see #unsetUserTransformed()
	 * @see #setUserTransformed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_UserTransformed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='user-transformed' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getUserTransformed();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUserTransformed <em>User Transformed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Transformed</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetUserTransformed()
	 * @see #unsetUserTransformed()
	 * @see #getUserTransformed()
	 * @generated
	 */
	void setUserTransformed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUserTransformed <em>User Transformed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserTransformed()
	 * @see #getUserTransformed()
	 * @see #setUserTransformed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetUserTransformed();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getUserTransformed <em>User Transformed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Transformed</em>' attribute is set.
	 * @see #unsetUserTransformed()
	 * @see #getUserTransformed()
	 * @see #setUserTransformed(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetUserTransformed();

	/**
	 * Returns the value of the '<em><b>Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' attribute.
	 * @see #setVerb(BigInteger)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Verb()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='verb' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getVerb();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVerb <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' attribute.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(VisibilityType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getDocumentRoot_Visibility()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
	VisibilityType getVisibility();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.VisibilityType
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityType)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.DocumentRoot#getVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #getVisibility()
	 * @see #setVisibility(VisibilityType)
	 * @generated
	 */
	boolean isSetVisibility();

} // DocumentRoot
