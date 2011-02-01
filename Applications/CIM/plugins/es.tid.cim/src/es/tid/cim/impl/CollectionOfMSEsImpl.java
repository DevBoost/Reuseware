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
import es.tid.cim.CollectionOfMSEs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Of MS Es</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.CollectionOfMSEsImpl#getCollectionId <em>Collection Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CollectionOfMSEsImpl extends CollectionImpl implements CollectionOfMSEs {
	/**
	 * The default value of the '{@link #getCollectionId() <em>Collection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionId()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionId() <em>Collection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionId()
	 * @generated
	 * @ordered
	 */
	protected String collectionId = COLLECTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionOfMSEsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCollectionOfMSEs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollectionId() {
		return collectionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionId(String newCollectionId) {
		String oldCollectionId = collectionId;
		collectionId = newCollectionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.COLLECTION_OF_MS_ES__COLLECTION_ID, oldCollectionId, collectionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.COLLECTION_OF_MS_ES__COLLECTION_ID:
				return getCollectionId();
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
			case CimPackage.COLLECTION_OF_MS_ES__COLLECTION_ID:
				setCollectionId((String)newValue);
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
			case CimPackage.COLLECTION_OF_MS_ES__COLLECTION_ID:
				setCollectionId(COLLECTION_ID_EDEFAULT);
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
			case CimPackage.COLLECTION_OF_MS_ES__COLLECTION_ID:
				return COLLECTION_ID_EDEFAULT == null ? collectionId != null : !COLLECTION_ID_EDEFAULT.equals(collectionId);
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
		result.append(" (collectionId: ");
		result.append(collectionId);
		result.append(')');
		return result.toString();
	}

} //CollectionOfMSEsImpl
