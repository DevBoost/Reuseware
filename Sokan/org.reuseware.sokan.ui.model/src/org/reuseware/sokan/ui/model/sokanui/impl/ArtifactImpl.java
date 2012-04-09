/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/**
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 */
package org.reuseware.sokan.ui.model.sokanui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.index.util.IndexUtil;
import org.reuseware.sokan.ui.model.sokanui.Artifact;
import org.reuseware.sokan.ui.model.sokanui.SokanuiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.sokan.ui.model.sokanui.impl.ArtifactImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.reuseware.sokan.ui.model.sokanui.impl.ArtifactImpl#getIndexRow <em>Index Row</em>}</li>
 *   <li>{@link org.reuseware.sokan.ui.model.sokanui.impl.ArtifactImpl#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends IdentifiableElementImpl implements Artifact {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> contents;

	/**
	 * The cached value of the '{@link #getIndexRow() <em>Index Row</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexRow()
	 * @generated
	 * @ordered
	 */
	protected IndexRow indexRow;
	/**
	 * The default value of the '{@link #getResourceSet() <em>Resource Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSet()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet RESOURCE_SET_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResourceSet() <em>Resource Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSet()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet resourceSet = RESOURCE_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SokanuiPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EObject> getContents() {
		if (contents == null) {
			contents = new EObjectResolvingEList<EObject>(EObject.class, this, SokanuiPackage.ARTIFACT__CONTENTS);
			if (getIndexRow() != null) {
				contents.addAll(IndexUtil.INSTANCE.getEModel(getIndexRow(),
						EcorePackage.Literals.EOBJECT, resourceSet));
			}
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexRow getIndexRow() {
		if (indexRow != null && indexRow.eIsProxy()) {
			InternalEObject oldIndexRow = (InternalEObject)indexRow;
			indexRow = (IndexRow)eResolveProxy(oldIndexRow);
			if (indexRow != oldIndexRow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SokanuiPackage.ARTIFACT__INDEX_ROW, oldIndexRow, indexRow));
			}
		}
		return indexRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexRow basicGetIndexRow() {
		return indexRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexRow(IndexRow newIndexRow) {
		IndexRow oldIndexRow = indexRow;
		indexRow = newIndexRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanuiPackage.ARTIFACT__INDEX_ROW, oldIndexRow, indexRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSet(ResourceSet newResourceSet) {
		ResourceSet oldResourceSet = resourceSet;
		resourceSet = newResourceSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanuiPackage.ARTIFACT__RESOURCE_SET, oldResourceSet, resourceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean areContentsLoaded() {
		return contents != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SokanuiPackage.ARTIFACT__CONTENTS:
				return getContents();
			case SokanuiPackage.ARTIFACT__INDEX_ROW:
				if (resolve) return getIndexRow();
				return basicGetIndexRow();
			case SokanuiPackage.ARTIFACT__RESOURCE_SET:
				return getResourceSet();
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
			case SokanuiPackage.ARTIFACT__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends EObject>)newValue);
				return;
			case SokanuiPackage.ARTIFACT__INDEX_ROW:
				setIndexRow((IndexRow)newValue);
				return;
			case SokanuiPackage.ARTIFACT__RESOURCE_SET:
				setResourceSet((ResourceSet)newValue);
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
			case SokanuiPackage.ARTIFACT__CONTENTS:
				getContents().clear();
				return;
			case SokanuiPackage.ARTIFACT__INDEX_ROW:
				setIndexRow((IndexRow)null);
				return;
			case SokanuiPackage.ARTIFACT__RESOURCE_SET:
				setResourceSet(RESOURCE_SET_EDEFAULT);
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
			case SokanuiPackage.ARTIFACT__CONTENTS:
				return contents != null && !contents.isEmpty();
			case SokanuiPackage.ARTIFACT__INDEX_ROW:
				return indexRow != null;
			case SokanuiPackage.ARTIFACT__RESOURCE_SET:
				return RESOURCE_SET_EDEFAULT == null ? resourceSet != null : !RESOURCE_SET_EDEFAULT.equals(resourceSet);
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
		result.append(" (resourceSet: ");
		result.append(resourceSet);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
