/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.sokan.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.SokanPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Index Row</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.sokan.impl.IndexRowImpl#getArtifactID <em>Artifact ID</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.IndexRowImpl#getPhyURI <em>Phy URI</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.IndexRowImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.IndexRowImpl#isGenerated <em>Generated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexRowImpl extends EObjectImpl implements IndexRow {
	/**
	 * The cached value of the '{@link #getArtifactID() <em>Artifact ID</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArtifactID()
	 * @generated
	 * @ordered
	 */
	protected ID artifactID;

	/**
	 * The default value of the '{@link #getPhyURI() <em>Phy URI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhyURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PHY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhyURI() <em>Phy URI</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhyURI()
	 * @generated
	 * @ordered
	 */
	protected String phyURI = PHY_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected IndexMetaData metaData;

	/**
	 * The default value of the '{@link #isGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerated()
	 * @generated
	 * @ordered
	 */
	protected boolean generated = GENERATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SokanPackage.Literals.INDEX_ROW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ID getArtifactID() {
		return artifactID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactID(ID newArtifactID, NotificationChain msgs) {
		ID oldArtifactID = artifactID;
		artifactID = newArtifactID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SokanPackage.INDEX_ROW__ARTIFACT_ID, oldArtifactID, newArtifactID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactID(ID newArtifactID) {
		if (newArtifactID != artifactID) {
			NotificationChain msgs = null;
			if (artifactID != null)
				msgs = ((InternalEObject)artifactID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SokanPackage.INDEX_ROW__ARTIFACT_ID, null, msgs);
			if (newArtifactID != null)
				msgs = ((InternalEObject)newArtifactID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SokanPackage.INDEX_ROW__ARTIFACT_ID, null, msgs);
			msgs = basicSetArtifactID(newArtifactID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.INDEX_ROW__ARTIFACT_ID, newArtifactID, newArtifactID));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhyURI() {
		return phyURI;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhyURI(String newPhyURI) {
		String oldPhyURI = phyURI;
		phyURI = newPhyURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.INDEX_ROW__PHY_URI, oldPhyURI, phyURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexMetaData getMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaData(IndexMetaData newMetaData, NotificationChain msgs) {
		IndexMetaData oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SokanPackage.INDEX_ROW__META_DATA, oldMetaData, newMetaData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(IndexMetaData newMetaData) {
		if (newMetaData != metaData) {
			NotificationChain msgs = null;
			if (metaData != null)
				msgs = ((InternalEObject)metaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SokanPackage.INDEX_ROW__META_DATA, null, msgs);
			if (newMetaData != null)
				msgs = ((InternalEObject)newMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SokanPackage.INDEX_ROW__META_DATA, null, msgs);
			msgs = basicSetMetaData(newMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.INDEX_ROW__META_DATA, newMetaData, newMetaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerated() {
		return generated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerated(boolean newGenerated) {
		boolean oldGenerated = generated;
		generated = newGenerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.INDEX_ROW__GENERATED, oldGenerated, generated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SokanPackage.INDEX_ROW__ARTIFACT_ID:
				return basicSetArtifactID(null, msgs);
			case SokanPackage.INDEX_ROW__META_DATA:
				return basicSetMetaData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SokanPackage.INDEX_ROW__ARTIFACT_ID:
				return getArtifactID();
			case SokanPackage.INDEX_ROW__PHY_URI:
				return getPhyURI();
			case SokanPackage.INDEX_ROW__META_DATA:
				return getMetaData();
			case SokanPackage.INDEX_ROW__GENERATED:
				return isGenerated();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SokanPackage.INDEX_ROW__ARTIFACT_ID:
				setArtifactID((ID)newValue);
				return;
			case SokanPackage.INDEX_ROW__PHY_URI:
				setPhyURI((String)newValue);
				return;
			case SokanPackage.INDEX_ROW__META_DATA:
				setMetaData((IndexMetaData)newValue);
				return;
			case SokanPackage.INDEX_ROW__GENERATED:
				setGenerated((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SokanPackage.INDEX_ROW__ARTIFACT_ID:
				setArtifactID((ID)null);
				return;
			case SokanPackage.INDEX_ROW__PHY_URI:
				setPhyURI(PHY_URI_EDEFAULT);
				return;
			case SokanPackage.INDEX_ROW__META_DATA:
				setMetaData((IndexMetaData)null);
				return;
			case SokanPackage.INDEX_ROW__GENERATED:
				setGenerated(GENERATED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SokanPackage.INDEX_ROW__ARTIFACT_ID:
				return artifactID != null;
			case SokanPackage.INDEX_ROW__PHY_URI:
				return PHY_URI_EDEFAULT == null ? phyURI != null : !PHY_URI_EDEFAULT.equals(phyURI);
			case SokanPackage.INDEX_ROW__META_DATA:
				return metaData != null;
			case SokanPackage.INDEX_ROW__GENERATED:
				return generated != GENERATED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (phyURI: ");
		result.append(phyURI);
		result.append(", generated: ");
		result.append(generated);
		result.append(')');
		return result.toString();
	}

} // IndexRowImpl
