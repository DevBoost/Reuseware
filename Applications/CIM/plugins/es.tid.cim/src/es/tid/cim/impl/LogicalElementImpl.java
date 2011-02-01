/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.ecore.EClass;

import es.tid.cim.CimPackage;
import es.tid.cim.LogicalElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class LogicalElementImpl extends ManagedSystemElementImpl implements LogicalElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getLogicalElement();
	}

} //LogicalElementImpl
