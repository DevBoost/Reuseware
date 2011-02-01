/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.ecore.EClass;

import es.tid.cim.CimPackage;
import es.tid.cim.Modem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ModemImpl extends LogicalDeviceImpl implements Modem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getModem();
	}

} //ModemImpl
