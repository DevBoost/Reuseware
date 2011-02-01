/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CimPackage;
import es.tid.cim.NamedAddressCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Address Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.NamedAddressCollectionImpl#getCollectionAlias <em>Collection Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedAddressCollectionImpl extends SystemSpecificCollectionImpl implements NamedAddressCollection {
	/**
	 * The default value of the '{@link #getCollectionAlias() <em>Collection Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionAlias() <em>Collection Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionAlias()
	 * @generated
	 * @ordered
	 */
	protected String collectionAlias = COLLECTION_ALIAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedAddressCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getNamedAddressCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollectionAlias() {
		return collectionAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionAlias(String newCollectionAlias) {
		String oldCollectionAlias = collectionAlias;
		collectionAlias = newCollectionAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS, oldCollectionAlias, collectionAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS:
				return getCollectionAlias();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS:
				setCollectionAlias((String)newValue);
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
			case CimPackage.NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS:
				setCollectionAlias(COLLECTION_ALIAS_EDEFAULT);
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
			case CimPackage.NAMED_ADDRESS_COLLECTION__COLLECTION_ALIAS:
				return COLLECTION_ALIAS_EDEFAULT == null ? collectionAlias != null : !COLLECTION_ALIAS_EDEFAULT.equals(collectionAlias);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (collectionAlias: ");
		result.append(collectionAlias);
		result.append(')');
		return result.toString();
	}

} //NamedAddressCollectionImpl
