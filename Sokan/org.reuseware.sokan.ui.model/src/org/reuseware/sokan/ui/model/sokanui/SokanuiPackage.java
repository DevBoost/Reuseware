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
package org.reuseware.sokan.ui.model.sokanui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.reuseware.sokan.ui.model.sokanui.SokanuiFactory
 * @model kind="package"
 * @generated
 */
public interface SokanuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sokanui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://reuseware.org/sokan/ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sokanui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SokanuiPackage eINSTANCE = org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.RootImpl
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Visible Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__VISIBLE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__RESOURCE_SET = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.RootPackageImpl <em>Root Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.RootPackageImpl
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getRootPackage()
	 * @generated
	 */
	int ROOT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Visible Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__VISIBLE_TYPES = ROOT__VISIBLE_TYPES;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__RESOURCE_SET = ROOT__RESOURCE_SET;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE__PACKAGES = ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_PACKAGE_FEATURE_COUNT = ROOT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.RootFolderImpl <em>Root Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.RootFolderImpl
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getRootFolder()
	 * @generated
	 */
	int ROOT_FOLDER = 2;

	/**
	 * The feature id for the '<em><b>Visible Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FOLDER__VISIBLE_TYPES = ROOT__VISIBLE_TYPES;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FOLDER__RESOURCE_SET = ROOT__RESOURCE_SET;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FOLDER__FOLDERS = ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FOLDER_FEATURE_COUNT = ROOT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.IdentifiableElementImpl
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.ContainerImpl
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.PackageImpl
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.FolderImpl
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUB_FOLDERS = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.ArtifactImpl
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONTENTS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index Row</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__INDEX_ROW = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__RESOURCE_SET = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '<em>Resource Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getResourceSet()
	 * @generated
	 */
	int RESOURCE_SET = 8;


	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.ui.model.sokanui.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.sokan.ui.model.sokanui.Root#getVisibleTypes <em>Visible Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visible Types</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Root#getVisibleTypes()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_VisibleTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.ui.model.sokanui.Root#getResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Set</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Root#getResourceSet()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_ResourceSet();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.ui.model.sokanui.RootPackage <em>Root Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Package</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.RootPackage
	 * @generated
	 */
	EClass getRootPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.sokan.ui.model.sokanui.RootPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.RootPackage#getPackages()
	 * @see #getRootPackage()
	 * @generated
	 */
	EReference getRootPackage_Packages();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.ui.model.sokanui.RootFolder <em>Root Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Folder</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.RootFolder
	 * @generated
	 */
	EClass getRootFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.sokan.ui.model.sokanui.RootFolder#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.RootFolder#getFolders()
	 * @see #getRootFolder()
	 * @generated
	 */
	EReference getRootFolder_Folders();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.ui.model.sokanui.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.reuseware.sokan.ui.model.sokanui.IdentifiableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Id</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.IdentifiableElement#getId()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Id();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.ui.model.sokanui.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.sokan.ui.model.sokanui.Container#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Container#getElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Elements();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.ui.model.sokanui.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.ui.model.sokanui.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.sokan.ui.model.sokanui.Folder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folders</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Folder#getSubFolders()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_SubFolders();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.ui.model.sokanui.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the reference list '{@link org.reuseware.sokan.ui.model.sokanui.Artifact#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contents</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Artifact#getContents()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Contents();

	/**
	 * Returns the meta object for the reference '{@link org.reuseware.sokan.ui.model.sokanui.Artifact#getIndexRow <em>Index Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Index Row</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Artifact#getIndexRow()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_IndexRow();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.ui.model.sokanui.Artifact#getResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Set</em>'.
	 * @see org.reuseware.sokan.ui.model.sokanui.Artifact#getResourceSet()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_ResourceSet();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.ResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource Set</em>'.
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @model instanceClass="org.eclipse.emf.ecore.resource.ResourceSet" serializeable="false"
	 * @generated
	 */
	EDataType getResourceSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SokanuiFactory getSokanuiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.RootImpl
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Visible Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__VISIBLE_TYPES = eINSTANCE.getRoot_VisibleTypes();

		/**
		 * The meta object literal for the '<em><b>Resource Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__RESOURCE_SET = eINSTANCE.getRoot_ResourceSet();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.RootPackageImpl <em>Root Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.RootPackageImpl
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getRootPackage()
		 * @generated
		 */
		EClass ROOT_PACKAGE = eINSTANCE.getRootPackage();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_PACKAGE__PACKAGES = eINSTANCE.getRootPackage_Packages();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.RootFolderImpl <em>Root Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.RootFolderImpl
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getRootFolder()
		 * @generated
		 */
		EClass ROOT_FOLDER = eINSTANCE.getRootFolder();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_FOLDER__FOLDERS = eINSTANCE.getRootFolder_Folders();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.IdentifiableElementImpl
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__ID = eINSTANCE.getIdentifiableElement_Id();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.ContainerImpl
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ELEMENTS = eINSTANCE.getContainer_Elements();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.PackageImpl
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.FolderImpl
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__SUB_FOLDERS = eINSTANCE.getFolder_SubFolders();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.ui.model.sokanui.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.ArtifactImpl
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CONTENTS = eINSTANCE.getArtifact_Contents();

		/**
		 * The meta object literal for the '<em><b>Index Row</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__INDEX_ROW = eINSTANCE.getArtifact_IndexRow();

		/**
		 * The meta object literal for the '<em><b>Resource Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__RESOURCE_SET = eINSTANCE.getArtifact_ResourceSet();

		/**
		 * The meta object literal for the '<em>Resource Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.ResourceSet
		 * @see org.reuseware.sokan.ui.model.sokanui.impl.SokanuiPackageImpl#getResourceSet()
		 * @generated
		 */
		EDataType RESOURCE_SET = eINSTANCE.getResourceSet();

	}

} //SokanuiPackage
