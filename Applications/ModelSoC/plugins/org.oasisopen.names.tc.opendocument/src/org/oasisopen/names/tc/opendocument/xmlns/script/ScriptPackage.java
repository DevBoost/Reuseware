/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.script;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.script.ScriptFactory
 * @model kind="package"
 * @generated
 */
public interface ScriptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "script";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:oasis:names:tc:opendocument:xmlns:script:1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "odfscript";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScriptPackage eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.script.impl.ScriptPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl <em>Event Listener Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.impl.ScriptPackageImpl#getEventListenerType()
	 * @generated
	 */
	int EVENT_LISTENER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__EVENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Macro Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__MACRO_NAME = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Event Listener Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.impl.DocumentRootImpl
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.impl.ScriptPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Event Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT_LISTENER = 3;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Macro Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MACRO_NAME = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType <em>Event Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Listener Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType
	 * @generated
	 */
	EClass getEventListenerType();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getActuate()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getEventName()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_EventName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getHref()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getLanguage()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getMacroName <em>Macro Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macro Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getMacroName()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_MacroName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.EventListenerType#getType()
	 * @see #getEventListenerType()
	 * @generated
	 */
	EAttribute getEventListenerType_Type();

	/**
	 * Returns the meta object for class '{@link org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getEventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listener</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getEventListener()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EventListener();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getEventName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EventName();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getMacroName <em>Macro Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macro Name</em>'.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.script.DocumentRoot#getMacroName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MacroName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScriptFactory getScriptFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl <em>Event Listener Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.script.impl.EventListenerTypeImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.script.impl.ScriptPackageImpl#getEventListenerType()
		 * @generated
		 */
		EClass EVENT_LISTENER_TYPE = eINSTANCE.getEventListenerType();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__ACTUATE = eINSTANCE.getEventListenerType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__EVENT_NAME = eINSTANCE.getEventListenerType_EventName();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__HREF = eINSTANCE.getEventListenerType_Href();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__LANGUAGE = eINSTANCE.getEventListenerType_Language();

		/**
		 * The meta object literal for the '<em><b>Macro Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__MACRO_NAME = eINSTANCE.getEventListenerType_MacroName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER_TYPE__TYPE = eINSTANCE.getEventListenerType_Type();

		/**
		 * The meta object literal for the '{@link org.oasisopen.names.tc.opendocument.xmlns.script.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.oasisopen.names.tc.opendocument.xmlns.script.impl.DocumentRootImpl
		 * @see org.oasisopen.names.tc.opendocument.xmlns.script.impl.ScriptPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Event Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EVENT_LISTENER = eINSTANCE.getDocumentRoot_EventListener();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EVENT_NAME = eINSTANCE.getDocumentRoot_EventName();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LANGUAGE = eINSTANCE.getDocumentRoot_Language();

		/**
		 * The meta object literal for the '<em><b>Macro Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MACRO_NAME = eINSTANCE.getDocumentRoot_MacroName();

	}

} //ScriptPackage
