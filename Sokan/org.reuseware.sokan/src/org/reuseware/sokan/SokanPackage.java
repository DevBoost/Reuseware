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
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.sokan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.reuseware.sokan.SokanFactory
 * @model kind="package"
 * @generated
 */
public interface SokanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sokan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sokan.reuseware.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sokan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	SokanPackage eINSTANCE = org.reuseware.sokan.impl.SokanPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.reuseware.sokan.impl.IdentifiableElementImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.IDImpl <em>ID</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.reuseware.sokan.impl.IDImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getID()
	 * @generated
	 */
	int ID = 1;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID__SEGMENTS = 0;

	/**
	 * The number of structural features of the '<em>ID</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.reuseware.sokan.impl.ArtifactImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MODEL = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Information</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__META_INFORMATION = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index Representation</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__INDEX_REPRESENTATION = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.IndexRowImpl <em>Index Row</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.reuseware.sokan.impl.IndexRowImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getIndexRow()
	 * @generated
	 */
	int INDEX_ROW = 3;

	/**
	 * The feature id for the '<em><b>Artifact ID</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_ROW__ARTIFACT_ID = 0;

	/**
	 * The feature id for the '<em><b>Phy URI</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_ROW__PHY_URI = 1;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ROW__META_DATA = 2;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_ROW__GENERATED = 3;

	/**
	 * The number of structural features of the '<em>Index Row</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INDEX_ROW_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.IndexMetaDataImpl <em>Index Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.impl.IndexMetaDataImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getIndexMetaData()
	 * @generated
	 */
	int INDEX_META_DATA = 4;

	/**
	 * The feature id for the '<em><b>Multi Value Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_META_DATA__MULTI_VALUE_FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Single Value Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_META_DATA__SINGLE_VALUE_FIELDS = 1;

	/**
	 * The number of structural features of the '<em>Index Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_META_DATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.reuseware.sokan.impl.StoreImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 5;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__FILTERS = 0;

	/**
	 * The feature id for the '<em><b>Uri Buffer</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STORE__URI_BUFFER = 1;

	/**
	 * The number of structural features of the '<em>Store</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.reuseware.sokan.impl.FilterImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 6;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER__PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.IndexTransactionImpl <em>Index Transaction</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.reuseware.sokan.impl.IndexTransactionImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getIndexTransaction()
	 * @generated
	 */
	int INDEX_TRANSACTION = 7;

	/**
	 * The feature id for the '<em><b>Rem Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TRANSACTION__REM_ARTIFACTS = 0;

	/**
	 * The feature id for the '<em><b>Add Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TRANSACTION__ADD_ARTIFACTS = 1;

	/**
	 * The feature id for the '<em><b>Update Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TRANSACTION__UPDATE_ARTIFACTS = 2;

	/**
	 * The number of structural features of the '<em>Index Transaction</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TRANSACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.FacetedRequestImpl <em>Faceted Request</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.reuseware.sokan.impl.FacetedRequestImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getFacetedRequest()
	 * @generated
	 */
	int FACETED_REQUEST = 9;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.FacetedResponseImpl <em>Faceted Response</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.reuseware.sokan.impl.FacetedResponseImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getFacetedResponse()
	 * @generated
	 */
	int FACETED_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Value Count Map</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACETED_RESPONSE__VALUE_COUNT_MAP = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACETED_RESPONSE__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACETED_RESPONSE__QUERY = 2;

	/**
	 * The number of structural features of the '<em>Faceted Response</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACETED_RESPONSE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Facet Fields</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACETED_REQUEST__FACET_FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACETED_REQUEST__ROWS = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACETED_REQUEST__OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Keyword Search String</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACETED_REQUEST__KEYWORD_SEARCH_STRING = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACETED_REQUEST__CONSTRAINTS = 4;

	/**
	 * The number of structural features of the '<em>Faceted Request</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACETED_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.reuseware.sokan.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.reuseware.sokan.impl.ConstraintImpl
	 * @see org.reuseware.sokan.impl.SokanPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VALUES = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see org.reuseware.sokan.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.reuseware.sokan.IdentifiableElement#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.reuseware.sokan.IdentifiableElement#getId()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EReference getIdentifiableElement_Id();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.ID <em>ID</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID</em>'.
	 * @see org.reuseware.sokan.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link org.reuseware.sokan.ID#getSegments <em>Segments</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Segments</em>'.
	 * @see org.reuseware.sokan.ID#getSegments()
	 * @see #getID()
	 * @generated
	 */
	EAttribute getID_Segments();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.reuseware.sokan.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.reuseware.sokan.Artifact#getModel <em>Model</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Model</em>'.
	 * @see org.reuseware.sokan.Artifact#getModel()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Model();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.reuseware.sokan.Artifact#getMetaInformation
	 * <em>Meta Information</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Meta Information</em>'.
	 * @see org.reuseware.sokan.Artifact#getMetaInformation()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_MetaInformation();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.sokan.Artifact#getIndexRepresentation <em>Index Representation</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Representation</em>'.
	 * @see org.reuseware.sokan.Artifact#getIndexRepresentation()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_IndexRepresentation();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.IndexRow <em>Index Row</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Row</em>'.
	 * @see org.reuseware.sokan.IndexRow
	 * @generated
	 */
	EClass getIndexRow();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.sokan.IndexRow#getArtifactID <em>Artifact ID</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact ID</em>'.
	 * @see org.reuseware.sokan.IndexRow#getArtifactID()
	 * @see #getIndexRow()
	 * @generated
	 */
	EReference getIndexRow_ArtifactID();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.reuseware.sokan.IndexRow#getPhyURI <em>Phy URI</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Phy URI</em>'.
	 * @see org.reuseware.sokan.IndexRow#getPhyURI()
	 * @see #getIndexRow()
	 * @generated
	 */
	EAttribute getIndexRow_PhyURI();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.sokan.IndexRow#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see org.reuseware.sokan.IndexRow#getMetaData()
	 * @see #getIndexRow()
	 * @generated
	 */
	EReference getIndexRow_MetaData();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.IndexRow#isGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see org.reuseware.sokan.IndexRow#isGenerated()
	 * @see #getIndexRow()
	 * @generated
	 */
	EAttribute getIndexRow_Generated();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.IndexMetaData <em>Index Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Meta Data</em>'.
	 * @see org.reuseware.sokan.IndexMetaData
	 * @generated
	 */
	EClass getIndexMetaData();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.IndexMetaData#getMultiValueFields <em>Multi Value Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Value Fields</em>'.
	 * @see org.reuseware.sokan.IndexMetaData#getMultiValueFields()
	 * @see #getIndexMetaData()
	 * @generated
	 */
	EAttribute getIndexMetaData_MultiValueFields();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.IndexMetaData#getSingleValueFields <em>Single Value Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Value Fields</em>'.
	 * @see org.reuseware.sokan.IndexMetaData#getSingleValueFields()
	 * @see #getIndexMetaData()
	 * @generated
	 */
	EAttribute getIndexMetaData_SingleValueFields();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.Store <em>Store</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see org.reuseware.sokan.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.reuseware.sokan.Store#getFilters <em>Filters</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Filters</em>'.
	 * @see org.reuseware.sokan.Store#getFilters()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Filters();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.reuseware.sokan.Store#getUriBuffer <em>Uri Buffer</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Uri Buffer</em>'.
	 * @see org.reuseware.sokan.Store#getUriBuffer()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_UriBuffer();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org.reuseware.sokan.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.reuseware.sokan.Filter#getPattern <em>Pattern</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.reuseware.sokan.Filter#getPattern()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Pattern();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.IndexTransaction <em>Index Transaction</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Transaction</em>'.
	 * @see org.reuseware.sokan.IndexTransaction
	 * @generated
	 */
	EClass getIndexTransaction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.sokan.IndexTransaction#getRemArtifacts <em>Rem Artifacts</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rem Artifacts</em>'.
	 * @see org.reuseware.sokan.IndexTransaction#getRemArtifacts()
	 * @see #getIndexTransaction()
	 * @generated
	 */
	EReference getIndexTransaction_RemArtifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.sokan.IndexTransaction#getAddArtifacts <em>Add Artifacts</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add Artifacts</em>'.
	 * @see org.reuseware.sokan.IndexTransaction#getAddArtifacts()
	 * @see #getIndexTransaction()
	 * @generated
	 */
	EReference getIndexTransaction_AddArtifacts();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.reuseware.sokan.IndexTransaction#getUpdateArtifacts
	 * <em>Update Artifacts</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference list '<em>Update Artifacts</em>
	 *         '.
	 * @see org.reuseware.sokan.IndexTransaction#getUpdateArtifacts()
	 * @see #getIndexTransaction()
	 * @generated
	 */
	EReference getIndexTransaction_UpdateArtifacts();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.FacetedRequest <em>Faceted Request</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faceted Request</em>'.
	 * @see org.reuseware.sokan.FacetedRequest
	 * @generated
	 */
	EClass getFacetedRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.sokan.FacetedRequest#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.reuseware.sokan.FacetedRequest#getConstraints()
	 * @see #getFacetedRequest()
	 * @generated
	 */
	EReference getFacetedRequest_Constraints();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.reuseware.sokan.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.reuseware.sokan.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.Constraint#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see org.reuseware.sokan.Constraint#getValues()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Values();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.FacetedRequest#getFacetFields <em>Facet Fields</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facet Fields</em>'.
	 * @see org.reuseware.sokan.FacetedRequest#getFacetFields()
	 * @see #getFacetedRequest()
	 * @generated
	 */
	EAttribute getFacetedRequest_FacetFields();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.FacetedRequest#getKeywordSearchString <em>Keyword Search String</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword Search String</em>'.
	 * @see org.reuseware.sokan.FacetedRequest#getKeywordSearchString()
	 * @see #getFacetedRequest()
	 * @generated
	 */
	EAttribute getFacetedRequest_KeywordSearchString();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.reuseware.sokan.FacetedRequest#getRows <em>Rows</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see org.reuseware.sokan.FacetedRequest#getRows()
	 * @see #getFacetedRequest()
	 * @generated
	 */
	EAttribute getFacetedRequest_Rows();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.FacetedRequest#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.reuseware.sokan.FacetedRequest#getOffset()
	 * @see #getFacetedRequest()
	 * @generated
	 */
	EAttribute getFacetedRequest_Offset();

	/**
	 * Returns the meta object for class '{@link org.reuseware.sokan.FacetedResponse <em>Faceted Response</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faceted Response</em>'.
	 * @see org.reuseware.sokan.FacetedResponse
	 * @generated
	 */
	EClass getFacetedResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.reuseware.sokan.FacetedResponse#getValueCountMap <em>Value Count Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Count Map</em>'.
	 * @see org.reuseware.sokan.FacetedResponse#getValueCountMap()
	 * @see #getFacetedResponse()
	 * @generated
	 */
	EAttribute getFacetedResponse_ValueCountMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.reuseware.sokan.FacetedResponse#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.reuseware.sokan.FacetedResponse#getContent()
	 * @see #getFacetedResponse()
	 * @generated
	 */
	EReference getFacetedResponse_Content();

	/**
	 * Returns the meta object for the containment reference '{@link org.reuseware.sokan.FacetedResponse#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.reuseware.sokan.FacetedResponse#getQuery()
	 * @see #getFacetedResponse()
	 * @generated
	 */
	EReference getFacetedResponse_Query();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SokanFactory getSokanFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.reuseware.sokan.impl.IdentifiableElementImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE_ELEMENT__ID = eINSTANCE.getIdentifiableElement_Id();

		/**
		 * The meta object literal for the '
		 * {@link org.reuseware.sokan.impl.IDImpl <em>ID</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.reuseware.sokan.impl.IDImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID__SEGMENTS = eINSTANCE.getID_Segments();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.reuseware.sokan.impl.ArtifactImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__MODEL = eINSTANCE.getArtifact_Model();

		/**
		 * The meta object literal for the '<em><b>Meta Information</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__META_INFORMATION = eINSTANCE.getArtifact_MetaInformation();

		/**
		 * The meta object literal for the '<em><b>Index Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__INDEX_REPRESENTATION = eINSTANCE.getArtifact_IndexRepresentation();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.IndexRowImpl <em>Index Row</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.reuseware.sokan.impl.IndexRowImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getIndexRow()
		 * @generated
		 */
		EClass INDEX_ROW = eINSTANCE.getIndexRow();

		/**
		 * The meta object literal for the '<em><b>Artifact ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_ROW__ARTIFACT_ID = eINSTANCE.getIndexRow_ArtifactID();

		/**
		 * The meta object literal for the '<em><b>Phy URI</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_ROW__PHY_URI = eINSTANCE.getIndexRow_PhyURI();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_ROW__META_DATA = eINSTANCE.getIndexRow_MetaData();

		/**
		 * The meta object literal for the '<em><b>Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_ROW__GENERATED = eINSTANCE.getIndexRow_Generated();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.IndexMetaDataImpl <em>Index Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.impl.IndexMetaDataImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getIndexMetaData()
		 * @generated
		 */
		EClass INDEX_META_DATA = eINSTANCE.getIndexMetaData();

		/**
		 * The meta object literal for the '<em><b>Multi Value Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_META_DATA__MULTI_VALUE_FIELDS = eINSTANCE.getIndexMetaData_MultiValueFields();

		/**
		 * The meta object literal for the '<em><b>Single Value Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_META_DATA__SINGLE_VALUE_FIELDS = eINSTANCE.getIndexMetaData_SingleValueFields();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.reuseware.sokan.impl.StoreImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__FILTERS = eINSTANCE.getStore_Filters();

		/**
		 * The meta object literal for the '<em><b>Uri Buffer</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__URI_BUFFER = eINSTANCE.getStore_UriBuffer();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.reuseware.sokan.impl.FilterImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__PATTERN = eINSTANCE.getFilter_Pattern();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.IndexTransactionImpl <em>Index Transaction</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.reuseware.sokan.impl.IndexTransactionImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getIndexTransaction()
		 * @generated
		 */
		EClass INDEX_TRANSACTION = eINSTANCE.getIndexTransaction();

		/**
		 * The meta object literal for the '<em><b>Rem Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_TRANSACTION__REM_ARTIFACTS = eINSTANCE.getIndexTransaction_RemArtifacts();

		/**
		 * The meta object literal for the '<em><b>Add Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_TRANSACTION__ADD_ARTIFACTS = eINSTANCE.getIndexTransaction_AddArtifacts();

		/**
		 * The meta object literal for the '<em><b>Update Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_TRANSACTION__UPDATE_ARTIFACTS = eINSTANCE.getIndexTransaction_UpdateArtifacts();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.FacetedRequestImpl <em>Faceted Request</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.reuseware.sokan.impl.FacetedRequestImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getFacetedRequest()
		 * @generated
		 */
		EClass FACETED_REQUEST = eINSTANCE.getFacetedRequest();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACETED_REQUEST__CONSTRAINTS = eINSTANCE.getFacetedRequest_Constraints();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.reuseware.sokan.impl.ConstraintImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__VALUES = eINSTANCE.getConstraint_Values();

		/**
		 * The meta object literal for the '<em><b>Facet Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACETED_REQUEST__FACET_FIELDS = eINSTANCE.getFacetedRequest_FacetFields();

		/**
		 * The meta object literal for the '
		 * <em><b>Keyword Search String</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FACETED_REQUEST__KEYWORD_SEARCH_STRING = eINSTANCE.getFacetedRequest_KeywordSearchString();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACETED_REQUEST__ROWS = eINSTANCE.getFacetedRequest_Rows();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACETED_REQUEST__OFFSET = eINSTANCE.getFacetedRequest_Offset();

		/**
		 * The meta object literal for the '{@link org.reuseware.sokan.impl.FacetedResponseImpl <em>Faceted Response</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.reuseware.sokan.impl.FacetedResponseImpl
		 * @see org.reuseware.sokan.impl.SokanPackageImpl#getFacetedResponse()
		 * @generated
		 */
		EClass FACETED_RESPONSE = eINSTANCE.getFacetedResponse();

		/**
		 * The meta object literal for the '<em><b>Value Count Map</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACETED_RESPONSE__VALUE_COUNT_MAP = eINSTANCE.getFacetedResponse_ValueCountMap();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACETED_RESPONSE__CONTENT = eINSTANCE.getFacetedResponse_Content();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACETED_RESPONSE__QUERY = eINSTANCE.getFacetedResponse_Query();

	}

} // SokanPackage
