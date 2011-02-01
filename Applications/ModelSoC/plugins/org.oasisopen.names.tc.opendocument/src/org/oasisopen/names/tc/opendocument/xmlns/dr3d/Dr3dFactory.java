/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.dr3d;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.dr3d.Dr3dPackage
 * @generated
 */
public interface Dr3dFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dr3dFactory eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.dr3d.impl.Dr3dFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cube Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cube Type</em>'.
	 * @generated
	 */
	CubeType createCubeType();

	/**
	 * Returns a new object of class '<em>Extrude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extrude Type</em>'.
	 * @generated
	 */
	ExtrudeType createExtrudeType();

	/**
	 * Returns a new object of class '<em>Light Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Type</em>'.
	 * @generated
	 */
	LightType createLightType();

	/**
	 * Returns a new object of class '<em>Rotate Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotate Type</em>'.
	 * @generated
	 */
	RotateType createRotateType();

	/**
	 * Returns a new object of class '<em>Scene Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene Type</em>'.
	 * @generated
	 */
	SceneType createSceneType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Sphere Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sphere Type</em>'.
	 * @generated
	 */
	SphereType createSphereType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Dr3dPackage getDr3dPackage();

} //Dr3dFactory
