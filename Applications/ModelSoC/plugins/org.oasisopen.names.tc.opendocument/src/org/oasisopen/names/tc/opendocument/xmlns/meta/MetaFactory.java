/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.meta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.meta.MetaPackage
 * @generated
 */
public interface MetaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaFactory eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.meta.impl.MetaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Auto Reload Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Reload Type</em>'.
	 * @generated
	 */
	AutoReloadType createAutoReloadType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Document Statistic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Statistic Type</em>'.
	 * @generated
	 */
	DocumentStatisticType createDocumentStatisticType();

	/**
	 * Returns a new object of class '<em>Hyperlink Behaviour Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hyperlink Behaviour Type</em>'.
	 * @generated
	 */
	HyperlinkBehaviourType createHyperlinkBehaviourType();

	/**
	 * Returns a new object of class '<em>Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Type</em>'.
	 * @generated
	 */
	TemplateType createTemplateType();

	/**
	 * Returns a new object of class '<em>User Defined Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Type</em>'.
	 * @generated
	 */
	UserDefinedType createUserDefinedType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetaPackage getMetaPackage();

} //MetaFactory
