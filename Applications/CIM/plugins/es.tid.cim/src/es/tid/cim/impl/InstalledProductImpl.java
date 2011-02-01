/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.CimPackage;
import es.tid.cim.InstalledProduct;
import es.tid.cim.SoftwareElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Installed Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.InstalledProductImpl#getSoftwareElements <em>Software Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstalledProductImpl extends CollectionImpl implements InstalledProduct {
	/**
	 * The cached value of the '{@link #getSoftwareElements() <em>Software Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareElement> softwareElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstalledProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getInstalledProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareElement> getSoftwareElements() {
		if (softwareElements == null) {
			softwareElements = new EObjectResolvingEList<SoftwareElement>(SoftwareElement.class, this, CimPackage.INSTALLED_PRODUCT__SOFTWARE_ELEMENTS);
		}
		return softwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.INSTALLED_PRODUCT__SOFTWARE_ELEMENTS:
				return getSoftwareElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.INSTALLED_PRODUCT__SOFTWARE_ELEMENTS:
				getSoftwareElements().clear();
				getSoftwareElements().addAll((Collection<? extends SoftwareElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.INSTALLED_PRODUCT__SOFTWARE_ELEMENTS:
				getSoftwareElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.INSTALLED_PRODUCT__SOFTWARE_ELEMENTS:
				return softwareElements != null && !softwareElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstalledProductImpl
