/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.ecore.EClass;

import es.tid.cim.CimPackage;
import es.tid.cim.FileAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class FileActionImpl extends ActionImpl implements FileAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getFileAction();
	}

} //FileActionImpl
