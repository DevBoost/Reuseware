/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.ecore.EClass;

import es.tid.cim.CimPackage;
import es.tid.cim.DirectoryAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DirectoryActionImpl extends ActionImpl implements DirectoryAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectoryActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getDirectoryAction();
	}

} //DirectoryActionImpl