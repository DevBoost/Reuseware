/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.config;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.config.ConfigPackage
 * @generated
 */
public interface ConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigFactory eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.config.impl.ConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Item Map Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Map Entry Type</em>'.
	 * @generated
	 */
	ConfigItemMapEntryType createConfigItemMapEntryType();

	/**
	 * Returns a new object of class '<em>Item Map Indexed Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Map Indexed Type</em>'.
	 * @generated
	 */
	ConfigItemMapIndexedType createConfigItemMapIndexedType();

	/**
	 * Returns a new object of class '<em>Item Map Named Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Map Named Type</em>'.
	 * @generated
	 */
	ConfigItemMapNamedType createConfigItemMapNamedType();

	/**
	 * Returns a new object of class '<em>Item Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Set Type</em>'.
	 * @generated
	 */
	ConfigItemSetType createConfigItemSetType();

	/**
	 * Returns a new object of class '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type</em>'.
	 * @generated
	 */
	ConfigItemType createConfigItemType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigPackage getConfigPackage();

} //ConfigFactory
