/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.script.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.oasisopen.names.tc.opendocument.xmlns.script.ScriptPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ScriptPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ScriptResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ScriptResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ScriptResourceFactoryImpl());
		}
		return registrations;
	}

} //ScriptXMLProcessor
