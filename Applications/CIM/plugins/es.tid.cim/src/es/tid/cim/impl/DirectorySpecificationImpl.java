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
import es.tid.cim.DirectorySpecification;
import es.tid.cim.FileSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.DirectorySpecificationImpl#getDirectorySpecificationFiles <em>Directory Specification Files</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectorySpecificationImpl extends CheckImpl implements DirectorySpecification {
	/**
	 * The cached value of the '{@link #getDirectorySpecificationFiles() <em>Directory Specification Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectorySpecificationFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<FileSpecification> directorySpecificationFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectorySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getDirectorySpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileSpecification> getDirectorySpecificationFiles() {
		if (directorySpecificationFiles == null) {
			directorySpecificationFiles = new EObjectResolvingEList<FileSpecification>(FileSpecification.class, this, CimPackage.DIRECTORY_SPECIFICATION__DIRECTORY_SPECIFICATION_FILES);
		}
		return directorySpecificationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.DIRECTORY_SPECIFICATION__DIRECTORY_SPECIFICATION_FILES:
				return getDirectorySpecificationFiles();
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
			case CimPackage.DIRECTORY_SPECIFICATION__DIRECTORY_SPECIFICATION_FILES:
				getDirectorySpecificationFiles().clear();
				getDirectorySpecificationFiles().addAll((Collection<? extends FileSpecification>)newValue);
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
			case CimPackage.DIRECTORY_SPECIFICATION__DIRECTORY_SPECIFICATION_FILES:
				getDirectorySpecificationFiles().clear();
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
			case CimPackage.DIRECTORY_SPECIFICATION__DIRECTORY_SPECIFICATION_FILES:
				return directorySpecificationFiles != null && !directorySpecificationFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DirectorySpecificationImpl
