/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage
 * @generated
 */
public interface SvgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SvgFactory eINSTANCE = org.oasisopen.names.tc.opendocument.xmlns.svg.impl.SvgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Definition Src Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Src Type</em>'.
	 * @generated
	 */
	DefinitionSrcType createDefinitionSrcType();

	/**
	 * Returns a new object of class '<em>Font Face Format Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font Face Format Type</em>'.
	 * @generated
	 */
	FontFaceFormatType createFontFaceFormatType();

	/**
	 * Returns a new object of class '<em>Font Face Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font Face Name Type</em>'.
	 * @generated
	 */
	FontFaceNameType createFontFaceNameType();

	/**
	 * Returns a new object of class '<em>Font Face Src Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font Face Src Type</em>'.
	 * @generated
	 */
	FontFaceSrcType createFontFaceSrcType();

	/**
	 * Returns a new object of class '<em>Font Face Uri Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font Face Uri Type</em>'.
	 * @generated
	 */
	FontFaceUriType createFontFaceUriType();

	/**
	 * Returns a new object of class '<em>Linear Gradient Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Gradient Type</em>'.
	 * @generated
	 */
	LinearGradientType createLinearGradientType();

	/**
	 * Returns a new object of class '<em>Radial Gradient Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radial Gradient Type</em>'.
	 * @generated
	 */
	RadialGradientType createRadialGradientType();

	/**
	 * Returns a new object of class '<em>Stop Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Type</em>'.
	 * @generated
	 */
	StopType createStopType();

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
	SvgPackage getSvgPackage();

} //SvgFactory
