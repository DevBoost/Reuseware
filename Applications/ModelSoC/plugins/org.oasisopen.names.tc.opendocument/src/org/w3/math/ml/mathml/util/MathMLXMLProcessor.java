/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.math.ml.mathml.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.w3.math.ml.mathml.MathMLPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MathMLXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathMLXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		MathMLPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the MathMLResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new MathMLResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new MathMLResourceFactoryImpl());
		}
		return registrations;
	}

} //MathMLXMLProcessor
